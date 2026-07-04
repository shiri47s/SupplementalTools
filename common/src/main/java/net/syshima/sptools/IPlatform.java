package net.syshima.sptools;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public interface IPlatform {
    void registerConfiguredFeature();
    void modifyLootTable();

    EquipmentSlot getEquipmentSlot(Player player, ItemStack itemStack);

    ItemStack getItemIfEquipment(Player player, Item... items);
}
