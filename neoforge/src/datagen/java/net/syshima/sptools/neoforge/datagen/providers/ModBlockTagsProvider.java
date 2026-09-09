package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.syshima.sptools.Constants;
import net.syshima.sptools.datagen.ModBlockTags;

import java.util.concurrent.CompletableFuture;

public final class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Constants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        ModBlockTags.addTags(this::appender);
    }

    private TagAppender<Block> appender(TagKey<Block> tag) {
        return TagAppender.forBuilder(getOrCreateRawBuilder(tag));
    }
}
