package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;
import net.syshima.sptools.ModBlocks;

import java.util.List;

public final class ModPlacedFeatures {
    public final static RegistryKey<PlacedFeature> LEAD_ORE_LOWER;
    public final static RegistryKey<PlacedFeature> RED_DIAMOND_ORE_LOWER;
    public final static RegistryKey<PlacedFeature> RED_DIAMOND_ORE_UPPER;
    public final static RegistryKey<PlacedFeature> DEEPSLATE_RED_DIAMOND_ORE_LOWER;

    public final static String LOWER_POSTFIX = "_lower";
    public final static String UPPER_POSTFIX = "_upper";

    static {
        LEAD_ORE_LOWER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, ModBlocks.ID.LEAD_ORE);
        RED_DIAMOND_ORE_LOWER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, LOWER_POSTFIX));
        RED_DIAMOND_ORE_UPPER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, UPPER_POSTFIX));
        DEEPSLATE_RED_DIAMOND_ORE_LOWER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, ModBlocks.ID.DEEPSLATE_RED_DIAMOND_ORE);
    }

    public static void bootstrap(Registerable<PlacedFeature> registerable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> configuredFeatures = registerable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        RegistryEntry<ConfiguredFeature<?, ?>> lead_ore = configuredFeatures.getOrThrow(ModConfiguredFeatures.LEAD_ORE);
        PlacedFeatures.register(registerable, LEAD_ORE_LOWER, lead_ore, ModPlacedFeatures.modifiersWithCount(6, HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(192))));

        RegistryEntry<ConfiguredFeature<?, ?>> red_diamond_ore = configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_DIAMOND_ORE);
        PlacedFeatures.register(registerable, RED_DIAMOND_ORE_LOWER, red_diamond_ore, ModPlacedFeatures.modifiersWithCount(2, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-32), YOffset.fixed(0))));
        PlacedFeatures.register(registerable, RED_DIAMOND_ORE_UPPER, red_diamond_ore, ModPlacedFeatures.modifiersWithCount(2, HeightRangePlacementModifier.trapezoid(YOffset.fixed(142), YOffset.fixed(242))));

        RegistryEntry<ConfiguredFeature<?, ?>> deepslate_red_diamond_ore = configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_RED_DIAMOND_ORE);
        PlacedFeatures.register(registerable, DEEPSLATE_RED_DIAMOND_ORE_LOWER, deepslate_red_diamond_ore, ModPlacedFeatures.modifiersWithCount(2, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(-32))));
    }

    public static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
}
