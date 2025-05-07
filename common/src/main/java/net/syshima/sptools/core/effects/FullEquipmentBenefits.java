package net.syshima.sptools.core.effects;

import dev.architectury.event.events.common.TickEvent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModEffects;
import net.syshima.sptools.core.armors.*;
import oshi.util.tuples.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public final class FullEquipmentBenefits {
    private static final Map<PlayerEntity, Constants.Series> seriesMap = new HashMap<>();
    private static Consumer<Pair<PlayerEntity, Constants.Series>> onFullSet;
    private static void attach(Consumer<Pair<PlayerEntity, Constants.Series>> onFullSet) {
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

        TickEvent.SERVER_LEVEL_PRE.register(tick -> tick.getPlayers().forEach(player -> {
            var world = player.getWorld();
            if (world.isClient()) { return; }

            update(player);

            var boundedGlowingEffect = player.getStatusEffect(ModEffects.get(ModEffects.BOUNDED_GLOWING));
            if (boundedGlowingEffect != null) {
                BoundedGlowingEffect.effect(world, player);
            }

            var redstoneOverflowEffect = player.getStatusEffect(ModEffects.get(ModEffects.REDSTONE_OVERFLOW));
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

    public static boolean isActive(PlayerEntity player, Constants.Series series) {
        if (!seriesMap.containsKey(player)) {
            return false;
        }

        return getFullSets(player) == series;
    }

    public static Constants.Series getFullSets(PlayerEntity player) {
        if (!seriesMap.containsKey(player)) {
            return Constants.Series.None;
        }

        return seriesMap.get(player);
    }

    public static void update(PlayerEntity player) {
        if (player == null) {
            return;
        }

        if (all(isCopper(player.getEquippedStack(EquipmentSlot.HEAD)),
                isCopper(player.getEquippedStack(EquipmentSlot.CHEST)),
                isCopper(player.getEquippedStack(EquipmentSlot.LEGS)),
                isCopper(player.getEquippedStack(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.Bronze);
            return;
        }

        if (all(isIronCopper(player.getEquippedStack(EquipmentSlot.HEAD)),
                isIronCopper(player.getEquippedStack(EquipmentSlot.CHEST)),
                isIronCopper(player.getEquippedStack(EquipmentSlot.LEGS)),
                isIronCopper(player.getEquippedStack(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.IronCopper);
            return;
        }

        if (all(isAmethyst(player.getEquippedStack(EquipmentSlot.HEAD)),
                isAmethyst(player.getEquippedStack(EquipmentSlot.CHEST)),
                isAmethyst(player.getEquippedStack(EquipmentSlot.LEGS)),
                isAmethyst(player.getEquippedStack(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.Amethyst);
            return;
        }

        if (all(isEmerald(player.getEquippedStack(EquipmentSlot.HEAD)),
                isEmerald(player.getEquippedStack(EquipmentSlot.CHEST)),
                isEmerald(player.getEquippedStack(EquipmentSlot.LEGS)),
                isEmerald(player.getEquippedStack(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.Emerald);
            return;
        }

        if (all(isLead(player.getEquippedStack(EquipmentSlot.HEAD)),
                isLead(player.getEquippedStack(EquipmentSlot.CHEST)),
                isLead(player.getEquippedStack(EquipmentSlot.LEGS)),
                isLead(player.getEquippedStack(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.Lead);
            return;
        }

        if (all(isQuartz(player.getEquippedStack(EquipmentSlot.HEAD)),
                isQuartz(player.getEquippedStack(EquipmentSlot.CHEST)),
                isQuartz(player.getEquippedStack(EquipmentSlot.LEGS)),
                isQuartz(player.getEquippedStack(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.Quartz);
            return;
        }

        if (all(isRedstone(player.getEquippedStack(EquipmentSlot.HEAD)),
                isRedstone(player.getEquippedStack(EquipmentSlot.CHEST)),
                isRedstone(player.getEquippedStack(EquipmentSlot.LEGS)),
                isRedstone(player.getEquippedStack(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.Redstone);
            return;
        }

        if (all(isLava(player.getEquippedStack(EquipmentSlot.HEAD)),
                isLava(player.getEquippedStack(EquipmentSlot.CHEST)),
                isLava(player.getEquippedStack(EquipmentSlot.LEGS)),
                isLava(player.getEquippedStack(EquipmentSlot.FEET)))) {
            update(player, Constants.Series.Lava);
            return;
        }

        update(player, Constants.Series.None);
    }

    private static void update(PlayerEntity player, Constants.Series series) {
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

    private static void benefitHeavy(PlayerEntity player) {
        player.setStatusEffect(
                new StatusEffectInstance(
                        ModEffects.get(ModEffects.HEAVY),
                        StatusEffectInstance.INFINITE,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void benefitKnockBackResistance(PlayerEntity player) {
        player.setStatusEffect(
                new StatusEffectInstance(
                        ModEffects.get(ModEffects.KNOCKBACK_RESISTANCE),
                        StatusEffectInstance.INFINITE,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void benefitAttackKnockBack(PlayerEntity player) {
        player.setStatusEffect(
                new StatusEffectInstance(
                        ModEffects.get(ModEffects.ATTACK_KNOCKBACK),
                        StatusEffectInstance.INFINITE,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void benefitMovementSpeed(PlayerEntity player) {
        player.setStatusEffect(
                new StatusEffectInstance(
                        ModEffects.get(ModEffects.MOVEMENT_SPEED),
                        StatusEffectInstance.INFINITE,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void benefitHasteAndLuck(PlayerEntity player) {
        player.setStatusEffect(
                new StatusEffectInstance(
                        ModEffects.get(ModEffects.HASTE_AND_LUCK),
                        StatusEffectInstance.INFINITE,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void benefitBoundedGlowing(PlayerEntity player) {
        player.setStatusEffect(
                new StatusEffectInstance(
                        ModEffects.get(ModEffects.BOUNDED_GLOWING),
                        StatusEffectInstance.INFINITE,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void benefitRedstoneOverflow(PlayerEntity player) {
        player.setStatusEffect(
                new StatusEffectInstance(
                        ModEffects.get(ModEffects.REDSTONE_OVERFLOW),
                        StatusEffectInstance.INFINITE,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void benefitAntiLava(PlayerEntity player) {
        player.setStatusEffect(
                new StatusEffectInstance(
                        ModEffects.get(ModEffects.ANTI_LAVA),
                        StatusEffectInstance.INFINITE,
                        0,
                        false,
                        false,
                        false),
                player);
    }

    private static void clearBenefits(PlayerEntity player) {
        player.removeStatusEffect(ModEffects.get(ModEffects.KNOCKBACK_RESISTANCE));
        player.removeStatusEffect(ModEffects.get(ModEffects.ATTACK_KNOCKBACK));
        player.removeStatusEffect(ModEffects.get(ModEffects.MOVEMENT_SPEED));
        player.removeStatusEffect(ModEffects.get(ModEffects.HASTE_AND_LUCK));
        player.removeStatusEffect(ModEffects.get(ModEffects.HEAVY));
        player.removeStatusEffect(ModEffects.get(ModEffects.BOUNDED_GLOWING));
        player.removeStatusEffect(ModEffects.get(ModEffects.REDSTONE_OVERFLOW));
        player.removeStatusEffect(ModEffects.get(ModEffects.ANTI_LAVA));
    }
}

