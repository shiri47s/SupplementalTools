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
 * <p>These keys are the single definition of what the mod generates: the data
 * generator registers exactly this set, and this class injects exactly this set.
 * Keeping both sides on the same constants means a rename cannot leave the runtime
 * pointing at a feature that was never written out.
 *
 * <p>Architectury's biome modifications are used on both loaders so the ores
 * generate identically; NeoForge's data-driven biome modifiers are deliberately
 * not generated, as having both would double the spawn rate.
 */
public final class ModWorldGen {

    public static final ResourceKey<PlacedFeature> LEAD_ORE = placed(ModBlocks.ID.LEAD_ORE);
    public static final ResourceKey<PlacedFeature> RED_DIAMOND_ORE_LOWER =
            placed(ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, "_lower"));
    public static final ResourceKey<PlacedFeature> RED_DIAMOND_ORE_UPPER =
            placed(ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, "_upper"));
    public static final ResourceKey<PlacedFeature> DEEPSLATE_RED_DIAMOND_ORE =
            placed(ModBlocks.ID.DEEPSLATE_RED_DIAMOND_ORE);

    private static final List<ResourceKey<PlacedFeature>> OVERWORLD_ORES =
            List.of(LEAD_ORE, RED_DIAMOND_ORE_LOWER, RED_DIAMOND_ORE_UPPER, DEEPSLATE_RED_DIAMOND_ORE);

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
