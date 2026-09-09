package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.syshima.sptools.ModBlocks;

public final class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> LEAD_ORE =
            ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBlocks.ID.LEAD_ORE);
    public static final ResourceKey<BiomeModifier> RED_DIAMOND_ORE_LOWER =
            ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, ModPlacedFeatures.LOWER_POSTFIX));
    public static final ResourceKey<BiomeModifier> RED_DIAMOND_ORE_UPPER =
            ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBlocks.ID.postfix(ModBlocks.ID.RED_DIAMOND_ORE, ModPlacedFeatures.UPPER_POSTFIX));
    public static final ResourceKey<BiomeModifier> DEEPSLATE_RED_DIAMOND_ORE =
            ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBlocks.ID.DEEPSLATE_RED_DIAMOND_ORE);

    private ModBiomeModifiers() {
    }

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var biomes = context.lookup(Registries.BIOME);
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var overworld = biomes.getOrThrow(BiomeTags.IS_OVERWORLD);

        addOre(context, LEAD_ORE, overworld, placedFeatures.getOrThrow(ModPlacedFeatures.LEAD_ORE));
        addOre(context, RED_DIAMOND_ORE_LOWER, overworld, placedFeatures.getOrThrow(ModPlacedFeatures.RED_DIAMOND_ORE_LOWER));
        addOre(context, RED_DIAMOND_ORE_UPPER, overworld, placedFeatures.getOrThrow(ModPlacedFeatures.RED_DIAMOND_ORE_UPPER));
        addOre(context, DEEPSLATE_RED_DIAMOND_ORE, overworld, placedFeatures.getOrThrow(ModPlacedFeatures.DEEPSLATE_RED_DIAMOND_ORE));
    }

    private static void addOre(BootstrapContext<BiomeModifier> context,
                               ResourceKey<BiomeModifier> key,
                               HolderSet<net.minecraft.world.level.biome.Biome> biomes,
                               net.minecraft.core.Holder<net.minecraft.world.level.levelgen.placement.PlacedFeature> feature) {
        context.register(key, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes, HolderSet.direct(feature), GenerationStep.Decoration.UNDERGROUND_ORES));
    }
}
