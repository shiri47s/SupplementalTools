package net.syshima.sptools.neoforge.datagen.providers;
import net.minecraft.core.registries.Registries;

import net.minecraft.registry.Registerable;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.syshima.sptools.ModBlocks;

public final class ModConfiguredFeatures {

    public final static ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE;
    public final static ResourceKey<ConfiguredFeature<?, ?>> RED_DIAMOND_ORE;
    public final static ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_RED_DIAMOND_ORE;

    static {
        LEAD_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ModBlocks.ID.LEAD_ORE);
        RED_DIAMOND_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ModBlocks.ID.RED_DIAMOND_ORE);
        DEEPSLATE_RED_DIAMOND_ORE = ResourceKey.create(Registries.CONFIGURED_FEATURE, ModBlocks.ID.DEEPSLATE_RED_DIAMOND_ORE);
    }

    public static void boostrap(Registerable<ConfiguredFeature<?,?>> registerable) {
        ConfiguredFeatures.register(registerable, LEAD_ORE, Feature.ORE, new OreFeatureConfig(new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.LEAD_ORE.get().defaultBlockState(), 12));
        ConfiguredFeatures.register(registerable, RED_DIAMOND_ORE, Feature.ORE, new OreFeatureConfig(new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.RED_DIAMOND_ORE.get().defaultBlockState(), 5, 0.3F));
        ConfiguredFeatures.register(registerable, DEEPSLATE_RED_DIAMOND_ORE, Feature.ORE, new OreFeatureConfig(new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get().defaultBlockState(), 5, 0.77F));
    }
}
