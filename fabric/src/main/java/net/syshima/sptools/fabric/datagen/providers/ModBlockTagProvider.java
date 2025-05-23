package net.syshima.sptools.fabric.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.syshima.sptools.ModBlocks;

import java.util.concurrent.CompletableFuture;

public final class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LEAD_ORE.get());

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RED_DIAMOND_ORE.get(), ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get());

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LEAD_ORE.get(), ModBlocks.RED_DIAMOND_ORE.get(), ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get());
    }
}
