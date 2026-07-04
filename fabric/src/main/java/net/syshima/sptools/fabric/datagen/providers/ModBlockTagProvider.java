package net.syshima.sptools.fabric.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.RegistryWrapper;
import net.minecraft.tags.BlockTags;
import net.syshima.sptools.ModBlocks;

import java.util.concurrent.CompletableFuture;

public final class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
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
