package net.syshima.sptools.fabric;

import net.syshima.sptools.IPlatform;
import net.syshima.sptools.fabric.datagen.providers.ModVanillaLootTableModifier;
import net.syshima.sptools.fabric.datagen.providers.ModWorldGenProvider;

public final class ModFabricPlatform implements IPlatform {
    @Override
    public void registerConfiguredFeature() {
        ModWorldGenProvider.register();
    }

    @Override
    public void modifyLootTable() {
        ModVanillaLootTableModifier.modify();
    }
}
