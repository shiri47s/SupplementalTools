package net.syshima.sptools.fabric.datagen.providers;
import net.minecraft.core.registries.Registries;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.syshima.sptools.ModBlocks;

public final class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE;
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_DIAMOND_ORE;
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_RED_DIAMOND_ORE;

    static {
        LEAD_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ModBlocks.ID.LEAD_ORE);
        RED_DIAMOND_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ModBlocks.ID.RED_DIAMOND_ORE);
        DEEPSLATE_RED_DIAMOND_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ModBlocks.ID.DEEPSLATE_RED_DIAMOND_ORE);
    }
}
