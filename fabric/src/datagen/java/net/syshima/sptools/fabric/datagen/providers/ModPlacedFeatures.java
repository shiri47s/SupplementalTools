package net.syshima.sptools.fabric.datagen.providers;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.syshima.sptools.ModBlocks;

import java.util.List;

public final class ModPlacedFeatures {

    public static final String LOWER_POSTFIX = "_lower";
    public static final String UPPER_POSTFIX = "_upper";

    public static final ResourceKey<PlacedFeature> LEAD_ORE =
            ResourceKey.create(Registries.PLACED_FEATURE, ModBlocks.ID.LEAD_ORE);
    public static final ResourceKey<PlacedFeature> RED_DIAMOND_ORE_LOWER =
            ResourceKey.create(Registries.PLACED_FEATURE, ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, LOWER_POSTFIX));
    public static final ResourceKey<PlacedFeature> RED_DIAMOND_ORE_UPPER =
            ResourceKey.create(Registries.PLACED_FEATURE, ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, UPPER_POSTFIX));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_RED_DIAMOND_ORE =
            ResourceKey.create(Registries.PLACED_FEATURE, ModBlocks.ID.DEEPSLATE_RED_DIAMOND_ORE);

    private ModPlacedFeatures() {
    }

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        PlacementUtils.register(context, LEAD_ORE,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.LEAD_ORE),
                countModifiers(6, HeightRangePlacement.triangle(VerticalAnchor.absolute(0), VerticalAnchor.absolute(192))));

        var redDiamondOre = configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_DIAMOND_ORE);
        PlacementUtils.register(context, RED_DIAMOND_ORE_LOWER, redDiamondOre,
                countModifiers(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(0))));
        PlacementUtils.register(context, RED_DIAMOND_ORE_UPPER, redDiamondOre,
                countModifiers(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(142), VerticalAnchor.absolute(242))));

        PlacementUtils.register(context, DEEPSLATE_RED_DIAMOND_ORE,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_RED_DIAMOND_ORE),
                countModifiers(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(-32))));
    }

    private static List<PlacementModifier> countModifiers(int count, PlacementModifier heightModifier) {
        return List.of(CountPlacement.of(count), InSquarePlacement.spread(), heightModifier, BiomeFilter.biome());
    }
}
