package net.syshima.sptools.datagen;

import net.minecraft.data.tags.TagAppender;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.syshima.sptools.ModBlocks;

import java.util.function.Function;

/** Block tag contents, shared by both loaders. */
public final class ModBlockTags {

    private ModBlockTags() {
    }

    /** Applies every block tag through the platform's appender lookup. */
    public static void addTags(Function<TagKey<Block>, TagAppender<Block>> builders) {
        builders.apply(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LEAD_ORE.getKey());

        builders.apply(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RED_DIAMOND_ORE.getKey())
                .add(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.getKey());

        builders.apply(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.LEAD_ORE.getKey())
                .add(ModBlocks.RED_DIAMOND_ORE.getKey())
                .add(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.getKey());
    }
}
