package net.syshima.sptools.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.syshima.sptools.core.assets.ModEquipmentAssetProvider;
import net.syshima.sptools.fabric.datagen.providers.*;

public final class ModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var modPack = fabricDataGenerator.createPack();

        modPack.addProvider(ModModelProvider::new);
        modPack.addProvider(ModBlockLootTableProvider::new);
        modPack.addProvider(ModItemTagProvider::new);
        modPack.addProvider(ModBlockTagProvider::new);
        modPack.addProvider(ModRecipeProvider::new);
        modPack.addProvider(ModWorldGenProvider::new);

        net.minecraft.data.DataGenerator.Pack assetsPack = fabricDataGenerator.createPack();
        assetsPack.addProvider(ModEquipmentAssetProvider::new);
    }

    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModWorldGenProvider::configuredFeature);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModWorldGenProvider::placedFeature);
    }
}
