package net.syshima.sptools.fabric.datagen.providers;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;
import net.syshima.sptools.ModBlocks;
import net.syshima.sptools.datagen.ModModelContent;

import java.util.Map;

public final class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricPackOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModels) {
        blockModels.createTrivialCube(ModBlocks.LEAD_ORE.get());
        blockModels.createTrivialCube(ModBlocks.RED_DIAMOND_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get());

        blockModels.createNormalTorch(ModBlocks.TORCH_BLOCK.get(), ModBlocks.WALL_TORCH_BLOCK.get());
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModels) {
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
