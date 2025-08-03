package net.syshima.sptools;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public interface IPlatform {
    void registerConfiguredFeature();
    void modifyLootTable();

    EquipmentSlot getEquipmentSlot(PlayerEntity player, ItemStack itemStack);

    ItemStack getItemIfEquipment(PlayerEntity player, Item... items);
}
