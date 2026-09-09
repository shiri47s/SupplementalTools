package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModBlocks;

import java.util.concurrent.CompletableFuture;

public final class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Constants.MOD_ID);
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

    private TagAppender<Block> builder(TagKey<Block> tag) {
        return TagAppender.forBuilder(getOrCreateRawBuilder(tag));
    }
}
