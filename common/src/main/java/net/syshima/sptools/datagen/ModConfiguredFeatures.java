package net.syshima.sptools.datagen;

import java.util.List;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.BlockReplacement;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.syshima.sptools.ModBlocks;

public final class ModConfiguredFeatures {

    public static final ResourceKey<Feature> LEAD_ORE =
            ResourceKey.create(Registries.FEATURE, ModBlocks.ID.LEAD_ORE);
    public static final ResourceKey<Feature> RED_DIAMOND_ORE =
            ResourceKey.create(Registries.FEATURE, ModBlocks.ID.RED_DIAMOND_ORE);
    public static final ResourceKey<Feature> DEEPSLATE_RED_DIAMOND_ORE =
            ResourceKey.create(Registries.FEATURE, ModBlocks.ID.DEEPSLATE_RED_DIAMOND_ORE);

    private ModConfiguredFeatures() {
    }

    public static void bootstrap(BootstrapContext<Feature> context) {
        context.register(LEAD_ORE,
                new OreFeature(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.LEAD_ORE.get().defaultBlockState(), 12));
        context.register(RED_DIAMOND_ORE,
                new OreFeature(List.of(BlockReplacement.replace(new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES),
                        ModBlocks.RED_DIAMOND_ORE.get().defaultBlockState())), 5, 0.3F));
        context.register(DEEPSLATE_RED_DIAMOND_ORE,
                new OreFeature(List.of(BlockReplacement.replace(new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES),
                        ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get().defaultBlockState())), 5, 0.77F));
    }
}
