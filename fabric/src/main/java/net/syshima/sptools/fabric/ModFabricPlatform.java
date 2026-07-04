package net.syshima.sptools.fabric;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.InteractionHand;
import net.syshima.sptools.IPlatform;
import net.syshima.sptools.fabric.worldgen.ModLootModifier;
import net.syshima.sptools.fabric.worldgen.ModWorldGen;

import java.util.ArrayList;
import java.util.List;

public final class ModFabricPlatform implements IPlatform {
    @Override
    public void registerConfiguredFeature() {
        ModWorldGen.register();
    }

    @Override
    public void modifyLootTable() {
        ModLootModifier.modify();
    }

    @Override
    public EquipmentSlot getEquipmentSlot(Player player, ItemStack itemStack) {
        var hands = InteractionHand.values();
        for (InteractionHand hand : hands) {
            var testItemStack = player.getItemInHand(hand);
            if (itemStack.is(testItemStack.getItem())) {
                return switch (hand) {
                    case MAIN_HAND -> EquipmentSlot.MAINHAND;
                    case OFF_HAND -> EquipmentSlot.OFFHAND;
                };
            }
        }

        var armors = getEquipmentArmorItems(player);
        for (var armor : armors) {
            if (itemStack.is(armor.getItem())) {
                return player.getEquipmentSlotForItem(itemStack);
            }
        }

        return null;
    }

    @Override
    public ItemStack getItemIfEquipment(Player player, Item... items) {
        var hands = InteractionHand.values();
        for (InteractionHand hand : hands) {
            var itemStack = player.getItemInHand(hand);
            for (var item : items) {
                if (itemStack.is(item)) {
                    return itemStack;
                }
            }
        }

        var armors = getEquipmentArmorItems(player);
        for (var armor : armors) {
            for (var item : items) {
                if (armor.is(item)) {
                    return armor;
                }
            }
        }

        return null;
    }

    private static List<ItemStack> getEquipmentArmorItems(Player player) {
        var items = new ArrayList<ItemStack>();
        items.add(player.getItemBySlot(EquipmentSlot.HEAD));
        items.add(player.getItemBySlot(EquipmentSlot.CHEST));
        items.add(player.getItemBySlot(EquipmentSlot.LEGS));
        items.add(player.getItemBySlot(EquipmentSlot.FEET));
        return items;
    }
}
