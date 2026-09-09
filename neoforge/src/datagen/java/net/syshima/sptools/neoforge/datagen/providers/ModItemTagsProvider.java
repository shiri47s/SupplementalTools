package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.syshima.sptools.Constants;
import net.syshima.sptools.datagen.ModItemTags;

import java.util.concurrent.CompletableFuture;

public final class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Constants.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        ModItemTags.addTags(this::appender);
    }

    private TagAppender<Item> appender(TagKey<Item> tag) {
        return TagAppender.forBuilder(getOrCreateRawBuilder(tag));
    }
}
