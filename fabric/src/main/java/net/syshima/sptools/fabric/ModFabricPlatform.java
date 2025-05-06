package net.syshima.sptools.fabric;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.syshima.sptools.IPlatform;
import net.syshima.sptools.fabric.datagen.providers.ModVanillaLootTableModifier;
import net.syshima.sptools.fabric.datagen.providers.ModWorldGenProvider;
import net.syshima.sptools.fabric.items.ModItemGroup;

public final class ModFabricPlatform implements IPlatform {
    @Override
    public void registerItemGroup() {
        ModItemGroup.registerItemGroup();
    }

    @Override
    public void addItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.MOD_GROUP).register(entries -> entries.add(item));
    }

    @Override
    public void registerConfiguredFeature() {
        ModWorldGenProvider.register();
    }

    @Override
    public void modifyLootTable() {
        ModVanillaLootTableModifier.modify();
    }
}
