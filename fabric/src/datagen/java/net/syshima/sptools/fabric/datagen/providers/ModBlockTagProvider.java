package net.syshima.sptools.fabric.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.syshima.sptools.ModBlocks;

import java.util.concurrent.CompletableFuture;

public final class ModBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {

    public ModBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        builder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LEAD_ORE.getKey());

        builder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RED_DIAMOND_ORE.getKey())
                .add(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.getKey());

        builder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.LEAD_ORE.getKey())
                .add(ModBlocks.RED_DIAMOND_ORE.getKey())
                .add(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.getKey());
    }
}
