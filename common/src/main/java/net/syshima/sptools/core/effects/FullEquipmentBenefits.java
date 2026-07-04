package net.syshima.sptools.core.effects;

import dev.architectury.event.events.common.TickEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModEffects;
import net.syshima.sptools.core.armors.*;
import oshi.util.tuples.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public final class FullEquipmentBenefits {
    private static final Map<Player, Constants.Series> seriesMap = new HashMap<>();
    private static Consumer<Pair<Player, Constants.Series>> onFullSet;
    private static void attach(Consumer<Pair<Player, Constants.Series>> onFullSet) {
        FullEquipmentBenefits.onFullSet = onFullSet;
    }

    public static void boostrap() {
        attach(pair -> {
            var player = pair.getA();
            var series = pair.getB();

            clearBenefits(player);
            switch (series) {
                case Bronze -> benefitKnockBackResistance(player);
                case IronCopper -> benefitAttackKnockBack(player);
                case Amethyst -> benefitMovementSpeed(player);
                case Emerald -> benefitHasteAndLuck(player);
                case Lead -> benefitHeavy(player);
                case Quartz -> benefitBoundedGlowing(player);
                case Redstone -> benefitRedstoneOverflow(player);
                case Lava -> benefitAntiLava(player);
            }
        });

        TickEvent.SERVER_LEVEL_PRE.register(tick -> tick.players().forEach(player -> {
            var world = player.level();
            if (world.isClientSide()) { return; }

            update(player);

            var boundedGlowingEffect = player.getEffect(ModEffects.get(ModEffects.BOUNDED_GLOWING));
            if (boundedGlowingEffect != null) {
                BoundedGlowingEffect.effect(world, player);
            }

            var redstoneOverflowEffect = player.getEffect(ModEffects.get(ModEffects.REDSTONE_OVERFLOW));
            if (redstoneOverflowEffect != null) {
                RedstoneOverflowEffect.effect(world, player);
            } else {
                RedstoneOverflowEffect.clear(player);
            }
        }));
    }

    public static boolean isActive(Constants.Series series) {
        for (Constants.Series s : seriesMap.values()) {
            if (s == series) {
                return true;
            }
        }

        return false;
    }

    public static boolean isActive(Player player, Constants.Series series) {
        if (!seriesMap.containsKey(player)) {
            return false;
        }

        return getFullSets(player) == series;
    }

    public static Constants.Series getFullSets(Player player) {
        if (!seriesMap.containsKey(player)) {
            return Constants.Series.None;
        }

        return seriesMap.get(player);
    }

    public static void update(Player player) {
        if (player == null) {
            return;
        }

        if (all(isCopper(player.getItemBySlot(EquipmentSlot.HEAD)),
                isCopper(player.getItemBySlot(EquipmentSlot.CHEST)),
                isCopper(player.getItemBySlot(EquipmentSlot.LEGS)),
                isCopper(player.getItemBySlot(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.Bronze);
            return;
        }

        if (all(isIronCopper(player.getItemBySlot(EquipmentSlot.HEAD)),
                isIronCopper(player.getItemBySlot(EquipmentSlot.CHEST)),
                isIronCopper(player.getItemBySlot(EquipmentSlot.LEGS)),
                isIronCopper(player.getItemBySlot(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.IronCopper);
            return;
        }

        if (all(isAmethyst(player.getItemBySlot(EquipmentSlot.HEAD)),
                isAmethyst(player.getItemBySlot(EquipmentSlot.CHEST)),
                isAmethyst(player.getItemBySlot(EquipmentSlot.LEGS)),
                isAmethyst(player.getItemBySlot(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.Amethyst);
            return;
        }

        if (all(isEmerald(player.getItemBySlot(EquipmentSlot.HEAD)),
                isEmerald(player.getItemBySlot(EquipmentSlot.CHEST)),
                isEmerald(player.getItemBySlot(EquipmentSlot.LEGS)),
                isEmerald(player.getItemBySlot(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.Emerald);
            return;
        }

        if (all(isLead(player.getItemBySlot(EquipmentSlot.HEAD)),
                isLead(player.getItemBySlot(EquipmentSlot.CHEST)),
                isLead(player.getItemBySlot(EquipmentSlot.LEGS)),
                isLead(player.getItemBySlot(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.Lead);
            return;
        }

        if (all(isQuartz(player.getItemBySlot(EquipmentSlot.HEAD)),
                isQuartz(player.getItemBySlot(EquipmentSlot.CHEST)),
                isQuartz(player.getItemBySlot(EquipmentSlot.LEGS)),
                isQuartz(player.getItemBySlot(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.Quartz);
            return;
        }

        if (all(isRedstone(player.getItemBySlot(EquipmentSlot.HEAD)),
                isRedstone(player.getItemBySlot(EquipmentSlot.CHEST)),
                isRedstone(player.getItemBySlot(EquipmentSlot.LEGS)),
                isRedstone(player.getItemBySlot(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.Redstone);
            return;
        }

        if (all(isLava(player.getItemBySlot(EquipmentSlot.HEAD)),
                isLava(player.getItemBySlot(EquipmentSlot.CHEST)),
                isLava(player.getItemBySlot(EquipmentSlot.LEGS)),
                isLava(player.getItemBySlot(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.Lava);
            return;
        }

        update(player, Constants.Series.None);
    }

    private static void update(Player player, Constants.Series series) {
        if (isActive(player, series)) {
            return;
        }

        seriesMap.put(player, series);
        if (onFullSet != null) {
            onFullSet.accept(new Pair<>(player, series));
        }
    }

    private static boolean all(boolean... predicates) {
        for (boolean predicate : predicates) {
            if (!predicate) {
                return false;
            }
        }

        return true;
    }

    private static boolean isCopper(ItemStack stack) {
        return stack.getItem() instanceof BronzeArmorItem;
    }

    private static boolean isIronCopper(ItemStack stack) {
        return stack.getItem() instanceof IronCopperArmorItem;
    }

    private static boolean isAmethyst(ItemStack stack) {
        return stack.getItem() instanceof AmethystArmorItem;
    }

    private static boolean isEmerald(ItemStack stack) {
        return stack.getItem() instanceof EmeraldArmorItem;
    }

    private static boolean isLead(ItemStack stack) {
        return stack.getItem() instanceof LeadArmorItem;
    }

    private static boolean isQuartz(ItemStack stack) {
        return stack.getItem() instanceof QuartzArmorItem;
    }

    private static boolean isRedstone(ItemStack stack) {
        return stack.getItem() instanceof RedstoneArmorItem;
    }

    private static boolean isLava(ItemStack stack) {
        return stack.getItem() instanceof LavaArmorItem;
    }

    private static void benefitHeavy(Player player) {
        player.addEffect(
                new MobEffectInstance(
                        ModEffects.get(ModEffects.HEAVY),
                        MobEffectInstance.INFINITE_DURATION,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void benefitKnockBackResistance(Player player) {
        player.addEffect(
                new MobEffectInstance(
                        ModEffects.get(ModEffects.KNOCKBACK_RESISTANCE),
                        MobEffectInstance.INFINITE_DURATION,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void benefitAttackKnockBack(Player player) {
        player.addEffect(
                new MobEffectInstance(
                        ModEffects.get(ModEffects.ATTACK_KNOCKBACK),
                        MobEffectInstance.INFINITE_DURATION,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void benefitMovementSpeed(Player player) {
        player.addEffect(
                new MobEffectInstance(
                        ModEffects.get(ModEffects.MOVEMENT_SPEED),
                        MobEffectInstance.INFINITE_DURATION,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void benefitHasteAndLuck(Player player) {
        player.addEffect(
                new MobEffectInstance(
                        ModEffects.get(ModEffects.HASTE_AND_LUCK),
                        MobEffectInstance.INFINITE_DURATION,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void benefitBoundedGlowing(Player player) {
        player.addEffect(
                new MobEffectInstance(
                        ModEffects.get(ModEffects.BOUNDED_GLOWING),
                        MobEffectInstance.INFINITE_DURATION,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void benefitRedstoneOverflow(Player player) {
        player.addEffect(
                new MobEffectInstance(
                        ModEffects.get(ModEffects.REDSTONE_OVERFLOW),
                        MobEffectInstance.INFINITE_DURATION,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void benefitAntiLava(Player player) {
        player.addEffect(
                new MobEffectInstance(
                        ModEffects.get(ModEffects.ANTI_LAVA),
                        MobEffectInstance.INFINITE_DURATION,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void clearBenefits(Player player) {
        player.removeEffect(ModEffects.get(ModEffects.KNOCKBACK_RESISTANCE));
        player.removeEffect(ModEffects.get(ModEffects.ATTACK_KNOCKBACK));
        player.removeEffect(ModEffects.get(ModEffects.MOVEMENT_SPEED));
        player.removeEffect(ModEffects.get(ModEffects.HASTE_AND_LUCK));
        player.removeEffect(ModEffects.get(ModEffects.HEAVY));
        player.removeEffect(ModEffects.get(ModEffects.BOUNDED_GLOWING));
        player.removeEffect(ModEffects.get(ModEffects.REDSTONE_OVERFLOW));
        player.removeEffect(ModEffects.get(ModEffects.ANTI_LAVA));
    }
}

