package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.world.gen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.syshima.sptools.ModBlocks;

public final class ModBiomeModifiers {
    public static final RegistryKey<BiomeModifier> LEAD_ORE;
    public static final RegistryKey<BiomeModifier> RED_DIAMOND_ORE_LOWER;
    public static final RegistryKey<BiomeModifier> RED_DIAMOND_ORE_UPPER;
    public static final RegistryKey<BiomeModifier> DEEPSLATE_DIAMOND_ORE;

    static {
        LEAD_ORE = RegistryKey.of(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBlocks.ID.LEAD_ORE);
        RED_DIAMOND_ORE_LOWER = RegistryKey.of(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, ModPlacedFeatures.LOWER_POSTFIX));
        RED_DIAMOND_ORE_UPPER = RegistryKey.of(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, ModPlacedFeatures.UPPER_POSTFIX));
        DEEPSLATE_DIAMOND_ORE = RegistryKey.of(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBlocks.ID.DEEPSLATE_RED_DIAMOND_ORE);
    }

    public static void bootstrap(Registerable<BiomeModifier> registerable) {
        var biomes = registerable.getRegistryLookup(RegistryKeys.BIOME);
        var placedFeatures = registerable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);
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
