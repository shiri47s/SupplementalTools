package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;
import net.syshima.sptools.ModBlocks;
import net.syshima.sptools.datagen.ModModelContent;

import java.util.Map;

public final class ModModelProvider extends ModelProvider {

    public ModModelProvider(PackOutput output) {
        super(output, net.syshima.sptools.Constants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        generateBlockStateModels(blockModels);
        generateItemModels(itemModels);
    }

    private void generateBlockStateModels(BlockModelGenerators blockModels) {
        blockModels.createTrivialCube(ModBlocks.LEAD_ORE.get());
        blockModels.createTrivialCube(ModBlocks.RED_DIAMOND_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get());

        blockModels.createNormalTorch(ModBlocks.TORCH_BLOCK.get(), ModBlocks.WALL_TORCH_BLOCK.get());
    }

    private void generateItemModels(ItemModelGenerators itemModels) {
        for (Item item : ModModelContent.handheldItems()) {
            itemModels.generateFlatItem(item, ModelTemplates.FLAT_HANDHELD_ITEM);
        }

        for (Item item : ModModelContent.flatItems()) {
            itemModels.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
        }

        for (ModModelContent.ArmorSet set : ModModelContent.armorSets()) {
            // The trim palette overrides are empty: 26.2 resolved them from the equipment
            // asset, and no vanilla trim material overrides this mod's assets.
            itemModels.generateTrimmableArmorSet(set.helmet(), set.chestplate(), set.leggings(), set.boots(), false, Map.of());
        }
    }
}
