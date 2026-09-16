package net.syshima.sptools.core.effects;

import dev.architectury.event.events.common.LifecycleEvent;
import dev.architectury.event.events.common.PlayerEvent;
import dev.architectury.event.events.common.TickEvent;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.syshima.sptools.Constants;
import net.syshima.sptools.PlayerEquipment;
import net.syshima.sptools.base.ModArmorItem;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Grants a permanent effect while a player wears a complete armour set of one series.
 *
 * <p>{@link #seriesOf(Player)} is a pure function of the player's armour slots and is
 * safe to call from either side. Only the bookkeeping needed to avoid re-applying the
 * effect every tick is stateful, and that state is server-side and keyed by UUID so a
 * disconnecting player cannot keep an entity alive.
 *
 * <p>This class only hands the effect out. Effects that do work of their own each tick
 * drive that from {@code MobEffect.applyEffectTick}, so they behave the same whether
 * the armour set or {@code /effect} granted them, and adding one needs no change here.
 *
 * <p>Which effect a series grants is not decided here either - see
 * {@link Constants.Series}.
 */
public final class FullEquipmentBenefits {

    /**
     * Series each player is currently being granted a bonus for. A player wearing no
     * matched set is absent rather than mapped to {@link Constants.Series#NONE}, so an
     * absent entry and a fresh login read the same: nothing to take away. Reading it as
     * "unknown" instead would strip our effects off everyone on their first tick.
     */
    private static final Map<UUID, Constants.Series> ACTIVE = new HashMap<>();

    private FullEquipmentBenefits() {
    }

    public static void bootstrap() {
        TickEvent.SERVER_LEVEL_PRE.register(level -> level.players().forEach(FullEquipmentBenefits::tick));
        PlayerEvent.PLAYER_QUIT.register(player -> ACTIVE.remove(player.getUUID()));

        // An integrated server comes and goes inside a client that keeps running, so
        // quitting alone does not empty this between worlds.
        LifecycleEvent.SERVER_STOPPED.register(server -> ACTIVE.clear());
    }

    /**
     * Series the player is wearing a complete set of, or {@link Constants.Series#NONE}.
     * Pure; holds no state and is valid on both the client and the server.
     */
    public static Constants.Series seriesOf(Player player) {
        Constants.Series worn = seriesOf(player.getItemBySlot(EquipmentSlot.HEAD));
        if (worn == Constants.Series.NONE) {
            return Constants.Series.NONE;
        }

        for (EquipmentSlot slot : PlayerEquipment.ARMOR_SLOTS) {
            if (seriesOf(player.getItemBySlot(slot)) != worn) {
                return Constants.Series.NONE;
            }
        }

        return worn;
    }

    private static Constants.Series seriesOf(ItemStack stack) {
        return stack.getItem() instanceof ModArmorItem armor ? armor.getSeries() : Constants.Series.NONE;
    }

    private static void tick(Player player) {
        UUID id = player.getUUID();
        Constants.Series series = seriesOf(player);

        if (ACTIVE.getOrDefault(id, Constants.Series.NONE) != series) {
            if (series == Constants.Series.NONE) {
                ACTIVE.remove(id);
            } else {
                ACTIVE.put(id, series);
            }

            applyBenefit(player, series);
            return;
        }

        // The set has not changed since last tick, so leave everything else alone -
        // including one of our own effects handed out by /effect. Only put back the
        // bonus this set owes the player, which anything that clears effects wholesale
        // (a totem, a bucket of milk) will have taken with it.
        if (series != Constants.Series.NONE) {
            Holder<MobEffect> bonus = series.bonus();
            if (!player.hasEffect(bonus)) {
                grant(player, bonus);
            }
        }
    }

    private static void applyBenefit(Player player, Constants.Series series) {
        for (Constants.Series other : Constants.Series.WITH_BONUS) {
            player.removeEffect(other.bonus());
        }

        if (series != Constants.Series.NONE) {
            grant(player, series.bonus());
        }
    }

    private static void grant(Player player, Holder<MobEffect> bonus) {
        player.addEffect(new MobEffectInstance(bonus, MobEffectInstance.INFINITE_DURATION, 0, false, false, false), player);
    }
}
