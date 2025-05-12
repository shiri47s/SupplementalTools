package net.syshima.sptools.neoforge;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.syshima.sptools.IPlatform;

public final class ModNeoForgePlatform implements IPlatform {
    @Override
    public void registerConfiguredFeature() {

    }

    @Override
    public void modifyLootTable() {

    }

    @Override
    public EquipmentSlot getEquipmentSlot(PlayerEntity player, ItemStack itemStack) {
        return null;
    }

    @Override
    public ItemStack getItemIfEquipment(PlayerEntity player, Item... items) {
        return null;
    }
}
