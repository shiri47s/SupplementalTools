package net.syshima.sptools.fabric.datagen.providers;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.syshima.sptools.ModBlocks;

public final class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> LEAD_ORE =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, ModBlocks.ID.LEAD_ORE);
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_DIAMOND_ORE =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, ModBlocks.ID.RED_DIAMOND_ORE);
    public static final ResourceKey<ConfiguredFeature<?, ?>> DEEPSLATE_RED_DIAMOND_ORE =
            ResourceKey.create(Registries.CONFIGURED_FEATURE, ModBlocks.ID.DEEPSLATE_RED_DIAMOND_ORE);

    private ModConfiguredFeatures() {
    }

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        FeatureUtils.register(context, LEAD_ORE, Feature.ORE,
                new OreConfiguration(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.LEAD_ORE.get().defaultBlockState(), 12));
        FeatureUtils.register(context, RED_DIAMOND_ORE, Feature.ORE,
                new OreConfiguration(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.RED_DIAMOND_ORE.get().defaultBlockState(), 5, 0.3F));
        FeatureUtils.register(context, DEEPSLATE_RED_DIAMOND_ORE, Feature.ORE,
                new OreConfiguration(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES),
                        ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get().defaultBlockState(), 5, 0.77F));
    }
}
