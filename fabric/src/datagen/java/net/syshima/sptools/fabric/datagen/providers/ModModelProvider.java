package net.syshima.sptools.fabric.datagen.providers;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.world.item.Item;
import net.syshima.sptools.ModBlocks;
import net.syshima.sptools.datagen.ModModelContent;

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
            itemModels.generateTrimmableItem(set.helmet(), set.asset(), ItemModelGenerators.TRIM_PREFIX_HELMET, false);
            itemModels.generateTrimmableItem(set.chestplate(), set.asset(), ItemModelGenerators.TRIM_PREFIX_CHESTPLATE, false);
            itemModels.generateTrimmableItem(set.leggings(), set.asset(), ItemModelGenerators.TRIM_PREFIX_LEGGINGS, false);
            itemModels.generateTrimmableItem(set.boots(), set.asset(), ItemModelGenerators.TRIM_PREFIX_BOOTS, false);
        }
    }
}
