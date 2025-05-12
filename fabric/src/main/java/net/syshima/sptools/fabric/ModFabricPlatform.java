package net.syshima.sptools.fabric;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.syshima.sptools.IPlatform;
import net.syshima.sptools.fabric.datagen.providers.ModVanillaLootTableModifier;
import net.syshima.sptools.fabric.datagen.providers.ModWorldGenProvider;

import java.util.ArrayList;
import java.util.List;

public final class ModFabricPlatform implements IPlatform {
    @Override
    public void registerConfiguredFeature() {
        ModWorldGenProvider.register();
    }

    @Override
    public void modifyLootTable() {
        ModVanillaLootTableModifier.modify();
    }

    @Override
    public EquipmentSlot getEquipmentSlot(PlayerEntity player, ItemStack itemStack) {
        var hands = Hand.values();
        for (Hand hand : hands) {
            var testItemStack = player.getStackInHand(hand);
            if (itemStack.isOf(testItemStack.getItem())) {
                return switch (hand) {
                    case MAIN_HAND -> EquipmentSlot.MAINHAND;
                    case OFF_HAND -> EquipmentSlot.OFFHAND;
                };
            }
        }

        var armors = getEquipmentArmorItems(player);
        for (var armor : armors) {
            if (itemStack.isOf(armor.getItem())) {
                return player.getPreferredEquipmentSlot(itemStack);
            }
        }

        return null;
    }

    @Override
    public ItemStack getItemIfEquipment(PlayerEntity player, Item... items) {
        var hands = Hand.values();
        for (Hand hand : hands) {
            var itemStack = player.getStackInHand(hand);
            for (var item : items) {
                if (itemStack.isOf(item)) {
                    return itemStack;
                }
            }
        }

        var armors = getEquipmentArmorItems(player);
        for (var armor : armors) {
            for (var item : items) {
                if (armor.isOf(item)) {
                    return armor;
                }
            }
        }

        return null;
    }

    private static List<ItemStack> getEquipmentArmorItems(PlayerEntity player) {
        var items = new ArrayList<ItemStack>();
        items.add(player.getEquippedStack(EquipmentSlot.HEAD));
        items.add(player.getEquippedStack(EquipmentSlot.CHEST));
        items.add(player.getEquippedStack(EquipmentSlot.LEGS));
        items.add(player.getEquippedStack(EquipmentSlot.FEET));
        return items;
    }
}
