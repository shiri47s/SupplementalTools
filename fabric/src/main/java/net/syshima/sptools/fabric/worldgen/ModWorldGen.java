package net.syshima.sptools.fabric.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.syshima.sptools.ModBlocks;

/**
 * Runtime ore world generation for Fabric. The configured/placed feature
 * definitions ship as committed JSON under data/sptools/worldgen; this only
 * injects the placed features into overworld biomes (Fabric has no data-driven
 * biome modifiers, unlike NeoForge).
 */
public final class ModWorldGen {

    private static ResourceKey<PlacedFeature> placed(Identifier id) {
        return ResourceKey.create(Registries.PLACED_FEATURE, id);
    }

    public static void register() {
        var overworld = BiomeSelectors.foundInOverworld();
        var ores = GenerationStep.Decoration.UNDERGROUND_ORES;

        BiomeModifications.addFeature(overworld, ores, placed(ModBlocks.ID.LEAD_ORE));
        BiomeModifications.addFeature(overworld, ores, placed(ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, "_lower")));
        BiomeModifications.addFeature(overworld, ores, placed(ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, "_upper")));
        BiomeModifications.addFeature(overworld, ores, placed(ModBlocks.ID.DEEPSLATE_RED_DIAMOND_ORE));
    }
}
