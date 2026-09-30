package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.syshima.sptools.worldgen.ModWorldGen;

/**
 * NeoForge's counterpart to {@link ModWorldGen#register()}: one modifier per ore
 * placed feature, named after it, adding it to overworld biomes.
 */
public final class ModBiomeModifiers {

    private ModBiomeModifiers() {
    }

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var overworld = context.lookup(Registries.BIOME).getOrThrow(BiomeTags.IS_OVERWORLD);
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);

        for (ResourceKey<PlacedFeature> ore : ModWorldGen.OVERWORLD_ORES) {
            context.register(
                    ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ore.identifier()),
                    new BiomeModifiers.AddFeaturesBiomeModifier(
                            overworld,
                            HolderSet.direct(placedFeatures.getOrThrow(ore)),
                            GenerationStep.Decoration.UNDERGROUND_ORES));
        }
    }
}
