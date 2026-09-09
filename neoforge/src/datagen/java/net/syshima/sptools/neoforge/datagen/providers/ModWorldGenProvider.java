package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public final class ModWorldGenProvider {

    /**
     * Biome modifiers are deliberately absent: the ores are injected at runtime via
     * Architectury's biome modifications on both loaders, so generating NeoForge's
     * data-driven modifiers as well would double the spawn rate.
     */
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap);

    private ModWorldGenProvider() {
    }
}
