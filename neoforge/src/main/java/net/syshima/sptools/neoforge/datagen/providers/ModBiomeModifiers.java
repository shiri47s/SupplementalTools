package net.syshima.sptools.neoforge.datagen.providers;
import net.minecraft.core.registries.Registries;

import net.minecraft.registry.Registerable;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.HolderList;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.world.gen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.syshima.sptools.ModBlocks;

public final class ModBiomeModifiers {
    public static final ResourceKey<BiomeModifier> LEAD_ORE;
    public static final ResourceKey<BiomeModifier> RED_DIAMOND_ORE_LOWER;
    public static final ResourceKey<BiomeModifier> RED_DIAMOND_ORE_UPPER;
    public static final ResourceKey<BiomeModifier> DEEPSLATE_DIAMOND_ORE;

    static {
        LEAD_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBlocks.ID.LEAD_ORE);
        RED_DIAMOND_ORE_LOWER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, ModPlacedFeatures.LOWER_POSTFIX));
        RED_DIAMOND_ORE_UPPER = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, ModPlacedFeatures.UPPER_POSTFIX));
        DEEPSLATE_DIAMOND_ORE = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBlocks.ID.DEEPSLATE_RED_DIAMOND_ORE);
    }

    public static void bootstrap(Registerable<BiomeModifier> registerable) {
        var biomes = registerable.getRegistryLookup(Registries.BIOME);
        var placedFeatures = registerable.getRegistryLookup(Registries.PLACED_FEATURE);
        var overworld = biomes.getOrThrow(BiomeTags.IS_OVERWORLD);

        registerable.register(LEAD_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                overworld,
                RegistryEntryList.of(placedFeatures.getOrThrow(ModPlacedFeatures.LEAD_ORE_LOWER)),
                GenerationStep.Feature.UNDERGROUND_ORES)
        );
        registerable.register(RED_DIAMOND_ORE_LOWER, new BiomeModifiers.AddFeaturesBiomeModifier(
                overworld,
                RegistryEntryList.of(placedFeatures.getOrThrow(ModPlacedFeatures.RED_DIAMOND_ORE_LOWER)),
                GenerationStep.Feature.UNDERGROUND_ORES)
        );
        registerable.register(RED_DIAMOND_ORE_UPPER, new BiomeModifiers.AddFeaturesBiomeModifier(
                overworld,
                RegistryEntryList.of(placedFeatures.getOrThrow(ModPlacedFeatures.RED_DIAMOND_ORE_UPPER)),
                GenerationStep.Feature.UNDERGROUND_ORES)
        );
        registerable.register(DEEPSLATE_DIAMOND_ORE, new BiomeModifiers.AddFeaturesBiomeModifier(
                overworld,
                RegistryEntryList.of(placedFeatures.getOrThrow(ModPlacedFeatures.DEEPSLATE_RED_DIAMOND_ORE_LOWER)),
                GenerationStep.Feature.UNDERGROUND_ORES)
        );
    }
}
