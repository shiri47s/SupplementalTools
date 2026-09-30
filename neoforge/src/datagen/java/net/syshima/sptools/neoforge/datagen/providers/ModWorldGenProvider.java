package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.syshima.sptools.datagen.ModConfiguredFeatures;
import net.syshima.sptools.datagen.ModPlacedFeatures;

public final class ModWorldGenProvider {

    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);

    private ModWorldGenProvider() {
    }
}
