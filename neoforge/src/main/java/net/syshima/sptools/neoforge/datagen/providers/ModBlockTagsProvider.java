package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.data.PackOutput;
import net.minecraft.core.RegistryWrapper;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModBlocks;

import java.util.concurrent.CompletableFuture;

public final class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> lookupProvider) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
        getTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LEAD_ORE.getId());

        getTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RED_DIAMOND_ORE.getId())
                .add(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.getId());

        getTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LEAD_ORE.getId())
                .add(ModBlocks.RED_DIAMOND_ORE.getId())
                .add(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.getId());
    }
}
