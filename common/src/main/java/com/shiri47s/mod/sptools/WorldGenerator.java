package com.shiri47s.mod.sptools;

import dev.architectury.registry.level.biome.BiomeModifications;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class WorldGenerator {
    public static final RegistryKey<PlacedFeature> LEAD_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Constants.MOD_ID, Constants.Block.LEAD_ORE));
    public static final RegistryKey<PlacedFeature> RED_DIAMOND_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Constants.MOD_ID, Constants.Block.RED_DIAMOND_ORE));
    public static final RegistryKey<PlacedFeature> DEEPSLATE_RED_DIAMOND_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Constants.MOD_ID, Constants.Block.DEEPSLATE_RED_DIAMOND_ORE));

    @SuppressWarnings("UnstableApiUsage")
    public static void generate() {
        BiomeModifications.addProperties((biomeContext, mutable) -> {
            if (biomeContext.hasTag(BiomeTags.IS_OVERWORLD)) {
                mutable.getGenerationProperties().addFeature(
                        GenerationStep.Feature.UNDERGROUND_ORES,
                        LEAD_ORE_PLACED_KEY
                );
                mutable.getGenerationProperties().addFeature(
                        GenerationStep.Feature.UNDERGROUND_ORES,
                        RED_DIAMOND_ORE_PLACED_KEY
                );
                mutable.getGenerationProperties().addFeature(
                        GenerationStep.Feature.UNDERGROUND_ORES,
                        DEEPSLATE_RED_DIAMOND_ORE_PLACED_KEY
                );
            }
        });
    }
}
