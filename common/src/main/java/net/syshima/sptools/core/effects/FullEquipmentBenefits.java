package net.syshima.sptools.core.effects;

import dev.architectury.event.events.common.PlayerEvent;
import dev.architectury.event.events.common.TickEvent;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModEffects;
import net.syshima.sptools.base.ModArmorItem;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Grants a permanent effect while a player wears a complete armour set of one series.
 *
 * <p>{@link #seriesOf(Player)} is a pure function of the player's armour slots and is
 * safe to call from either side. Only the bookkeeping needed to avoid re-applying the
 * effect every tick is stateful, and that state is server-side and keyed by UUID so a
 * disconnecting player cannot keep an entity alive.
 */
public final class FullEquipmentBenefits {

    private static final List<EquipmentSlot> ARMOR_SLOTS =
            List.of(EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET);

    private static final Map<Constants.Series, RegistrySupplier<MobEffect>> BENEFITS =
            new EnumMap<>(Constants.Series.class);

    private static final Map<UUID, Constants.Series> ACTIVE = new HashMap<>();

    static {
        BENEFITS.put(Constants.Series.Bronze, ModEffects.KNOCKBACK_RESISTANCE);
        BENEFITS.put(Constants.Series.IronCopper, ModEffects.ATTACK_KNOCKBACK);
        BENEFITS.put(Constants.Series.Amethyst, ModEffects.MOVEMENT_SPEED);
        BENEFITS.put(Constants.Series.Emerald, ModEffects.HASTE_AND_LUCK);
        BENEFITS.put(Constants.Series.Lead, ModEffects.HEAVY);
        BENEFITS.put(Constants.Series.Quartz, ModEffects.BOUNDED_GLOWING);
        BENEFITS.put(Constants.Series.Redstone, ModEffects.REDSTONE_OVERFLOW);
        BENEFITS.put(Constants.Series.Lava, ModEffects.ANTI_LAVA);
    }

    private FullEquipmentBenefits() {
    }

    public static void bootstrap() {
        TickEvent.SERVER_LEVEL_PRE.register(level -> level.players().forEach(FullEquipmentBenefits::tick));
        PlayerEvent.PLAYER_QUIT.register(player -> ACTIVE.remove(player.getUUID()));
    }

    /**
     * Series the player is wearing a complete set of, or {@link Constants.Series#None}.
     * Pure; holds no state and is valid on both the client and the server.
     */
    public static Constants.Series seriesOf(Player player) {
        Constants.Series worn = seriesOf(player.getItemBySlot(EquipmentSlot.HEAD));
        if (worn == Constants.Series.None) {
            return Constants.Series.None;
        }

        for (EquipmentSlot slot : ARMOR_SLOTS) {
            if (seriesOf(player.getItemBySlot(slot)) != worn) {
                return Constants.Series.None;
            }
        }

        return worn;
    }

    private static Constants.Series seriesOf(ItemStack stack) {
        return stack.getItem() instanceof ModArmorItem armor ? armor.getSeries() : Constants.Series.None;
    }

    private static void tick(Player player) {
        Constants.Series series = seriesOf(player);
        if (ACTIVE.put(player.getUUID(), series) != series) {
            applyBenefit(player, series);
        }

        // Driven by the effect rather than the armour set, so an effect handed out by
        // /effect behaves the same way the set-granted one does.
        Level level = player.level();
        if (player.hasEffect(ModEffects.BOUNDED_GLOWING.asHolder())) {
            BoundedGlowingEffect.effect(level, player);
        }

        if (player.hasEffect(ModEffects.REDSTONE_OVERFLOW.asHolder())) {
            RedstoneOverflowEffect.effect(level, player);
        } else {
            RedstoneOverflowEffect.clear(player);
        }
    }

    private static void applyBenefit(Player player, Constants.Series series) {
        for (RegistrySupplier<MobEffect> effect : BENEFITS.values()) {
            player.removeEffect(effect.asHolder());
        }

        RegistrySupplier<MobEffect> benefit = BENEFITS.get(series);
        if (benefit == null) {
            return;
        }

        Holder<MobEffect> holder = benefit.asHolder();
        player.addEffect(new MobEffectInstance(holder, MobEffectInstance.INFINITE_DURATION, 0, false, false, false), player);
    }
}
