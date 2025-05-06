package net.syshima.sptools.fabric.datagen.providers;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;
import net.syshima.sptools.ModBlocks;

import java.util.List;

public final class ModPlacedFeatures {

    public final static RegistryKey<PlacedFeature> LEAD_ORE_LOWER;
    public final static RegistryKey<PlacedFeature> RED_DIAMOND_ORE_LOWER;
    public final static RegistryKey<PlacedFeature> RED_DIAMOND_ORE_UPPER;
    public final static RegistryKey<PlacedFeature> DEEPSLATE_RED_DIAMOND_ORE_LOWER;

    private final static String LOWER_POSTFIX = "_lower";
    private final static String UPPER_POSTFIX = "_upper";

    static {
        LEAD_ORE_LOWER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, ModBlocks.ID.LEAD_ORE);
        RED_DIAMOND_ORE_LOWER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, LOWER_POSTFIX));
        RED_DIAMOND_ORE_UPPER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, UPPER_POSTFIX));
        DEEPSLATE_RED_DIAMOND_ORE_LOWER = RegistryKey.of(RegistryKeys.PLACED_FEATURE, ModBlocks.ID.DEEPSLATE_RED_DIAMOND_ORE);
    }

    public static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.of(count), heightModifier);
    }

    public static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }

    private static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }
}
