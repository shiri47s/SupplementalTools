package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.data.DataOutput;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModBlocks;

import java.util.concurrent.CompletableFuture;

public final class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> lookupProvider) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LEAD_ORE.get());

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RED_DIAMOND_ORE.get(), ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get());

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LEAD_ORE.get(), ModBlocks.RED_DIAMOND_ORE.get(), ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get());
    }
}
