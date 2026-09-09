package net.syshima.sptools.fabric.datagen.providers;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.syshima.sptools.ModBlocks;
import net.syshima.sptools.ModItems;
import net.syshima.sptools.core.assets.ModEquipmentAssets;

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
        handheld(itemModels,
                ModItems.BRONZE_SWORD.get(), ModItems.BRONZE_SHOVEL.get(), ModItems.BRONZE_PICKAXE.get(),
                ModItems.BRONZE_AXE.get(), ModItems.BRONZE_HOE.get(),
                ModItems.IRONCOPPER_SWORD.get(), ModItems.IRONCOPPER_SHOVEL.get(), ModItems.IRONCOPPER_PICKAXE.get(),
                ModItems.IRONCOPPER_AXE.get(), ModItems.IRONCOPPER_HOE.get(),
                ModItems.AMETHYST_SWORD.get(), ModItems.AMETHYST_SHOVEL.get(), ModItems.AMETHYST_PICKAXE.get(),
                ModItems.AMETHYST_AXE.get(), ModItems.AMETHYST_HOE.get(),
                ModItems.EMERALD_SWORD.get(), ModItems.EMERALD_SHOVEL.get(), ModItems.EMERALD_PICKAXE.get(),
                ModItems.EMERALD_AXE.get(), ModItems.EMERALD_HOE.get(),
                ModItems.LEAD_SWORD.get(), ModItems.LEAD_SHOVEL.get(), ModItems.LEAD_PICKAXE.get(),
                ModItems.LEAD_AXE.get(), ModItems.LEAD_HOE.get(),
                ModItems.QUARTZ_SWORD.get(), ModItems.QUARTZ_SHOVEL.get(), ModItems.QUARTZ_PICKAXE.get(),
                ModItems.QUARTZ_AXE.get(), ModItems.QUARTZ_HOE.get(),
                ModItems.REDSTONE_SWORD.get(), ModItems.REDSTONE_SHOVEL.get(), ModItems.REDSTONE_PICKAXE.get(),
                ModItems.REDSTONE_AXE.get(), ModItems.REDSTONE_HOE.get(),
                ModItems.DURABLE_FIREWORK_ROCKET.get(), ModItems.DURABLE_FIREWORK_ROCKET_UPGRADED.get(),
                ModItems.DURABLE_TOTEM_OF_UNDYING.get(), ModItems.DURABLE_TOTEM_OF_UNDYING_UPGRADED.get(),
                ModItems.DURABLE_TORCH.get(), ModItems.DURABLE_TORCH_UPGRADED.get());

        flat(itemModels,
                ModItems.BRONZE_INGOT.get(), ModItems.AMETHYST_INGOT.get(), ModItems.EMERALD_INGOT.get(),
                ModItems.LEAD_INGOT.get(), ModItems.QUARTZ_INGOT.get(), ModItems.REDSTONE_INGOT.get(),
                ModItems.RED_DIAMOND_INGOT.get(), ModItems.RAW_LEAD.get(), ModItems.QUARTZ_SCRAP.get(),
                ModItems.RED_DIAMOND.get(), ModItems.LAVA_SMITHING_TEMPLATE.get());

        armorSet(itemModels, ModEquipmentAssets.BRONZE_ARMOR,
                ModItems.BRONZE_HELMET.get(), ModItems.BRONZE_CHESTPLATE.get(), ModItems.BRONZE_LEGGINGS.get(), ModItems.BRONZE_BOOTS.get());
        armorSet(itemModels, ModEquipmentAssets.IRONCOPPER_ARMOR,
                ModItems.IRONCOPPER_HELMET.get(), ModItems.IRONCOPPER_CHESTPLATE.get(), ModItems.IRONCOPPER_LEGGINGS.get(), ModItems.IRONCOPPER_BOOTS.get());
        armorSet(itemModels, ModEquipmentAssets.AMETHYST_ARMOR,
                ModItems.AMETHYST_HELMET.get(), ModItems.AMETHYST_CHESTPLATE.get(), ModItems.AMETHYST_LEGGINGS.get(), ModItems.AMETHYST_BOOTS.get());
        armorSet(itemModels, ModEquipmentAssets.EMERALD_ARMOR,
                ModItems.EMERALD_HELMET.get(), ModItems.EMERALD_CHESTPLATE.get(), ModItems.EMERALD_LEGGINGS.get(), ModItems.EMERALD_BOOTS.get());
        armorSet(itemModels, ModEquipmentAssets.LEAD_ARMOR,
                ModItems.LEAD_HELMET.get(), ModItems.LEAD_CHESTPLATE.get(), ModItems.LEAD_LEGGINGS.get(), ModItems.LEAD_BOOTS.get());
        armorSet(itemModels, ModEquipmentAssets.QUARTZ_ARMOR,
                ModItems.QUARTZ_HELMET.get(), ModItems.QUARTZ_CHESTPLATE.get(), ModItems.QUARTZ_LEGGINGS.get(), ModItems.QUARTZ_BOOTS.get());
        armorSet(itemModels, ModEquipmentAssets.REDSTONE_ARMOR,
                ModItems.REDSTONE_HELMET.get(), ModItems.REDSTONE_CHESTPLATE.get(), ModItems.REDSTONE_LEGGINGS.get(), ModItems.REDSTONE_BOOTS.get());
        armorSet(itemModels, ModEquipmentAssets.LAVA_ARMOR,
                ModItems.LAVA_HELMET.get(), ModItems.LAVA_CHESTPLATE.get(), ModItems.LAVA_LEGGINGS.get(), ModItems.LAVA_BOOTS.get());
    }

    private static void handheld(ItemModelGenerators itemModels, Item... items) {
        for (Item item : items) {
            itemModels.generateFlatItem(item, ModelTemplates.FLAT_HANDHELD_ITEM);
        }
    }

    private static void flat(ItemModelGenerators itemModels, Item... items) {
        for (Item item : items) {
            itemModels.generateFlatItem(item, ModelTemplates.FLAT_ITEM);
        }
    }

    private static void armorSet(ItemModelGenerators itemModels, ResourceKey<EquipmentAsset> asset,
                                 Item helmet, Item chestplate, Item leggings, Item boots) {
        armor(itemModels, helmet, asset, ItemModelGenerators.TRIM_PREFIX_HELMET);
        armor(itemModels, chestplate, asset, ItemModelGenerators.TRIM_PREFIX_CHESTPLATE);
        armor(itemModels, leggings, asset, ItemModelGenerators.TRIM_PREFIX_LEGGINGS);
        armor(itemModels, boots, asset, ItemModelGenerators.TRIM_PREFIX_BOOTS);
    }

    private static void armor(ItemModelGenerators itemModels, Item item,
                              ResourceKey<EquipmentAsset> asset, Identifier trimPrefix) {
        itemModels.generateTrimmableItem(item, asset, trimPrefix, false);
    }
}
