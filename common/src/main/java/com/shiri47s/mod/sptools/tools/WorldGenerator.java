package com.shiri47s.mod.sptools.tools;

import com.shiri47s.mod.sptools.Constants;
import dev.architectury.registry.level.biome.BiomeModifications;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class WorldGenerator {
    public static final RegistryKey<PlacedFeature> LEAD_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Constants.MOD_ID, Constants.Block.LEAD_ORE));

    @SuppressWarnings("UnstableApiUsage")
    public static void generate() {
        BiomeModifications.addProperties((biomeContext, mutable) -> {
            if (biomeContext.hasTag(BiomeTags.IS_OVERWORLD)) {
                mutable.getGenerationProperties().addFeature(
                        GenerationStep.Feature.UNDERGROUND_ORES,
                        LEAD_ORE_PLACED_KEY
                );
            }
        });
    }
}
