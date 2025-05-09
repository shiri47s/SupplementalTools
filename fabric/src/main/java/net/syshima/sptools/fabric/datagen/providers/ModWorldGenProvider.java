package net.syshima.sptools.fabric.datagen.providers;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModBlocks;

import java.util.concurrent.CompletableFuture;;

public final class ModWorldGenProvider extends FabricDynamicRegistryProvider {
    private static final String NAME = Constants.MOD_ID + "WorldGen";
    public ModWorldGenProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
        entries.add(registries.getOrThrow(RegistryKeys.CONFIGURED_FEATURE), ModConfiguredFeatures.LEAD_ORE);
        entries.add(registries.getOrThrow(RegistryKeys.PLACED_FEATURE), ModPlacedFeatures.LEAD_ORE_LOWER);

        entries.add(registries.getOrThrow(RegistryKeys.CONFIGURED_FEATURE), ModConfiguredFeatures.RED_DIAMOND_ORE);
        entries.add(registries.getOrThrow(RegistryKeys.PLACED_FEATURE), ModPlacedFeatures.RED_DIAMOND_ORE_LOWER);
        entries.add(registries.getOrThrow(RegistryKeys.PLACED_FEATURE), ModPlacedFeatures.RED_DIAMOND_ORE_UPPER);

        entries.add(registries.getOrThrow(RegistryKeys.CONFIGURED_FEATURE), ModConfiguredFeatures.DEEPSLATE_RED_DIAMOND_ORE);
        entries.add(registries.getOrThrow(RegistryKeys.PLACED_FEATURE), ModPlacedFeatures.DEEPSLATE_RED_DIAMOND_ORE_LOWER);
    }

    public static void configuredFeature(Registerable<ConfiguredFeature<?, ?>> registerable) {
        ConfiguredFeatures.register(registerable, ModConfiguredFeatures.LEAD_ORE, Feature.ORE, new OreFeatureConfig(new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.LEAD_ORE.get().getDefaultState(), 12));
        ConfiguredFeatures.register(registerable, ModConfiguredFeatures.RED_DIAMOND_ORE, Feature.ORE, new OreFeatureConfig(new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES), ModBlocks.RED_DIAMOND_ORE.get().getDefaultState(), 5, 0.3F));
        ConfiguredFeatures.register(registerable, ModConfiguredFeatures.DEEPSLATE_RED_DIAMOND_ORE, Feature.ORE, new OreFeatureConfig(new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES), ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get().getDefaultState(), 5, 0.77F));
    }

    public static void placedFeature(Registerable<PlacedFeature> registerable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> configuredFeatures = registerable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        RegistryEntry<ConfiguredFeature<?, ?>> lead_ore = configuredFeatures.getOrThrow(ModConfiguredFeatures.LEAD_ORE);
        PlacedFeatures.register(registerable, ModPlacedFeatures.LEAD_ORE_LOWER, lead_ore, ModPlacedFeatures.modifiersWithCount(6, HeightRangePlacementModifier.trapezoid(YOffset.fixed(0), YOffset.fixed(192))));

        RegistryEntry<ConfiguredFeature<?, ?>> red_diamond_ore = configuredFeatures.getOrThrow(ModConfiguredFeatures.RED_DIAMOND_ORE);
        PlacedFeatures.register(registerable, ModPlacedFeatures.RED_DIAMOND_ORE_LOWER, red_diamond_ore, ModPlacedFeatures.modifiersWithCount(2, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-32), YOffset.fixed(0))));
        PlacedFeatures.register(registerable, ModPlacedFeatures.RED_DIAMOND_ORE_UPPER, red_diamond_ore, ModPlacedFeatures.modifiersWithCount(2, HeightRangePlacementModifier.trapezoid(YOffset.fixed(142), YOffset.fixed(242))));

        RegistryEntry<ConfiguredFeature<?, ?>> deepslate_red_diamond_ore = configuredFeatures.getOrThrow(ModConfiguredFeatures.DEEPSLATE_RED_DIAMOND_ORE);
        PlacedFeatures.register(registerable, ModPlacedFeatures.DEEPSLATE_RED_DIAMOND_ORE_LOWER, deepslate_red_diamond_ore, ModPlacedFeatures.modifiersWithCount(2, HeightRangePlacementModifier.trapezoid(YOffset.fixed(-64), YOffset.fixed(-32))));
    }

    public static void register() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.LEAD_ORE_LOWER);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RED_DIAMOND_ORE_LOWER);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RED_DIAMOND_ORE_UPPER);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DEEPSLATE_RED_DIAMOND_ORE_LOWER);
    }

    @Override
    public String getName() {
        return NAME;
    }
}
