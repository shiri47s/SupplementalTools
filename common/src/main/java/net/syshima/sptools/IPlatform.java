package net.syshima.sptools;

import net.minecraft.item.Item;

public interface IPlatform {
    void registerItemGroup();
    void addItemGroup(Item item);
    void registerConfiguredFeature();
    void modifyLootTable();
}
