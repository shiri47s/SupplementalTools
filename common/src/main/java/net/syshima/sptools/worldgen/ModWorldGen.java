package net.syshima.sptools.worldgen;

import dev.architectury.registry.level.biome.BiomeModifications;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.syshima.sptools.ModBlocks;

import java.util.List;

/**
 * Injects the mod's ore placed features into overworld biomes.
 *
 * <p>The feature definitions themselves ship as generated JSON under
 * {@code data/sptools/worldgen}. Architectury's biome modifications are used on
 * both loaders so the ores generate identically; NeoForge's data-driven biome
 * modifiers are deliberately not generated, as having both would double the
 * spawn rate.
 */
public final class ModWorldGen {

    private static final List<ResourceKey<PlacedFeature>> OVERWORLD_ORES = List.of(
            placed(ModBlocks.ID.LEAD_ORE),
            placed(ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, "_lower")),
            placed(ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, "_upper")),
            placed(ModBlocks.ID.DEEPSLATE_RED_DIAMOND_ORE));

    private ModWorldGen() {
    }

    public static void register() {
        BiomeModifications.addProperties(
                context -> context.hasTag(BiomeTags.IS_OVERWORLD),
                (context, properties) -> {
                    var generation = properties.getGenerationProperties();
                    for (ResourceKey<PlacedFeature> ore : OVERWORLD_ORES) {
                        generation.addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, ore);
                    }
                });
    }

    private static ResourceKey<PlacedFeature> placed(Identifier id) {
        return ResourceKey.create(Registries.PLACED_FEATURE, id);
    }
}
