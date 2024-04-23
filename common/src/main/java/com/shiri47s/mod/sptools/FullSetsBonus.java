package com.shiri47s.mod.sptools;

import com.shiri47s.mod.sptools.armors.AmethystArmorItem;
import com.shiri47s.mod.sptools.armors.CopperArmorItem;
import com.shiri47s.mod.sptools.armors.EmeraldArmorItem;
import com.shiri47s.mod.sptools.armors.IronCopperArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import oshi.util.tuples.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class FullSetsBonus {
    private static final Map<PlayerEntity, Enums.Series> fullSetsMap = new HashMap<>();
    private static Consumer<Pair<PlayerEntity, Enums.Series>> fullsetsConsumer;
    public static void listen(Consumer<Pair<PlayerEntity, Enums.Series>> consumer) {
        fullsetsConsumer = consumer;
    }

    public static boolean isFullSets(Enums.Series series) {
        for (Enums.Series s : fullSetsMap.values()) {
            if (s == series) {
                return true;
            }
        }

        return false;
    }

    public static boolean isFullSets(PlayerEntity player, Enums.Series series) {
        if (!fullSetsMap.containsKey(player)) {
            return false;
        }

        return getFullSets(player) == series;
    }

    public static Enums.Series getFullSets(PlayerEntity player) {
        if (!fullSetsMap.containsKey(player)) {
            return Enums.Series.None;
        }

        return fullSetsMap.get(player);
    }

    public static void update(PlayerEntity player) {
        if (player == null) {
            return;
        }

        if (all(isCopper(player.getEquippedStack(EquipmentSlot.HEAD)),
                isCopper(player.getEquippedStack(EquipmentSlot.CHEST)),
                isCopper(player.getEquippedStack(EquipmentSlot.LEGS)),
                isCopper(player.getEquippedStack(EquipmentSlot.FEET)))) {
            updateInternal(player, Enums.Series.Copper);
            return;
        }

        if (all(isIronCopper(player.getEquippedStack(EquipmentSlot.HEAD)),
                isIronCopper(player.getEquippedStack(EquipmentSlot.CHEST)),
                isIronCopper(player.getEquippedStack(EquipmentSlot.LEGS)),
                isIronCopper(player.getEquippedStack(EquipmentSlot.FEET)))) {
            updateInternal(player, Enums.Series.IronCopper);
            return;
        }

        if (all(isAmethyst(player.getEquippedStack(EquipmentSlot.HEAD)),
                isAmethyst(player.getEquippedStack(EquipmentSlot.CHEST)),
                isAmethyst(player.getEquippedStack(EquipmentSlot.LEGS)),
                isAmethyst(player.getEquippedStack(EquipmentSlot.FEET)))) {
            updateInternal(player, Enums.Series.Amethyst);
            return;
        }

        if (all(isEmerald(player.getEquippedStack(EquipmentSlot.HEAD)),
                isEmerald(player.getEquippedStack(EquipmentSlot.CHEST)),
                isEmerald(player.getEquippedStack(EquipmentSlot.LEGS)),
                isEmerald(player.getEquippedStack(EquipmentSlot.FEET)))) {
            updateInternal(player, Enums.Series.Emerald);
            return;
        }

        updateInternal(player, Enums.Series.None);
    }

    private static void updateInternal(PlayerEntity player, Enums.Series series) {
        if (isFullSets(player, series)) {
            return;
        }

        fullSetsMap.put(player, series);
        if (fullsetsConsumer != null) {
            fullsetsConsumer.accept(new Pair<>(player, series));
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
        return stack.getItem() instanceof CopperArmorItem;
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
}
