package net.syshima.sptools.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.syshima.sptools.core.assets.ModEquipmentAssetProvider;
import net.syshima.sptools.fabric.datagen.providers.ModBlockLootTableProvider;
import net.syshima.sptools.fabric.datagen.providers.ModBlockTagProvider;
import net.syshima.sptools.fabric.datagen.providers.ModConfiguredFeatures;
import net.syshima.sptools.fabric.datagen.providers.ModItemTagProvider;
import net.syshima.sptools.fabric.datagen.providers.ModModelProvider;
import net.syshima.sptools.fabric.datagen.providers.ModPlacedFeatures;
import net.syshima.sptools.fabric.datagen.providers.ModRecipeProvider;
import net.syshima.sptools.fabric.datagen.providers.ModWorldGenProvider;

public final class ModDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        var pack = generator.createPack();

        pack.addProvider(ModModelProvider::new);
        pack.addProvider((FabricDataGenerator.Pack.Factory<ModEquipmentAssetProvider>) ModEquipmentAssetProvider::new);
        pack.addProvider(ModBlockLootTableProvider::new);
        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModRecipeProvider::new);
        pack.addProvider(ModWorldGenProvider::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder builder) {
        builder.add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        builder.add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
    }
}
