package net.syshima.sptools.fabric.datagen.providers;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.syshima.sptools.ModBlocks;

public final class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> LEAD_ORE;
    public static final RegistryKey<ConfiguredFeature<?, ?>> RED_DIAMOND_ORE;
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_RED_DIAMOND_ORE;

    static {
        LEAD_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, ModBlocks.ID.LEAD_ORE);
        RED_DIAMOND_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, ModBlocks.ID.RED_DIAMOND_ORE);
        DEEPSLATE_RED_DIAMOND_ORE = RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, ModBlocks.ID.DEEPSLATE_RED_DIAMOND_ORE);
    }
}
