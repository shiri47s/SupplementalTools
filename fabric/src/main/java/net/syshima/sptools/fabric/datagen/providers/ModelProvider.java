package net.syshima.sptools.fabric.datagen.providers;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.syshima.sptools.ModBlocks;
import net.syshima.sptools.ModItems;
import net.syshima.sptools.core.assets.ModEquipmentAssets;

import java.util.stream.Stream;

public final class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator generator) {
        generator.registerSimpleCubeAll(ModBlocks.LEAD_ORE);
        generator.registerSimpleCubeAll(ModBlocks.RED_DIAMOND_ORE);
        generator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        registerTool(ModItems.BRONZE_SWORD, itemModelGenerator);
        registerTool(ModItems.BRONZE_SHOVEL, itemModelGenerator);
        registerTool(ModItems.BRONZE_PICKAXE, itemModelGenerator);
        registerTool(ModItems.BRONZE_AXE, itemModelGenerator);
        registerTool(ModItems.BRONZE_HOE, itemModelGenerator);
        
        registerTool(ModItems.IRONCOPPER_SWORD, itemModelGenerator);
        registerTool(ModItems.IRONCOPPER_SHOVEL, itemModelGenerator);
        registerTool(ModItems.IRONCOPPER_PICKAXE, itemModelGenerator);
        registerTool(ModItems.IRONCOPPER_AXE, itemModelGenerator);
        registerTool(ModItems.IRONCOPPER_HOE, itemModelGenerator);

        registerTool(ModItems.AMETHYST_SWORD, itemModelGenerator);
        registerTool(ModItems.AMETHYST_SHOVEL, itemModelGenerator);
        registerTool(ModItems.AMETHYST_PICKAXE, itemModelGenerator);
        registerTool(ModItems.AMETHYST_AXE, itemModelGenerator);
        registerTool(ModItems.AMETHYST_HOE, itemModelGenerator);

        registerTool(ModItems.EMERALD_SWORD, itemModelGenerator);
        registerTool(ModItems.EMERALD_SHOVEL, itemModelGenerator);
        registerTool(ModItems.EMERALD_PICKAXE, itemModelGenerator);
        registerTool(ModItems.EMERALD_AXE, itemModelGenerator);
        registerTool(ModItems.EMERALD_HOE, itemModelGenerator);

        registerTool(ModItems.QUARTZ_SWORD, itemModelGenerator);
        registerTool(ModItems.QUARTZ_SHOVEL, itemModelGenerator);
        registerTool(ModItems.QUARTZ_PICKAXE, itemModelGenerator);
        registerTool(ModItems.QUARTZ_AXE, itemModelGenerator);
        registerTool(ModItems.QUARTZ_HOE, itemModelGenerator);

        registerTool(ModItems.LEAD_SWORD, itemModelGenerator);
        registerTool(ModItems.LEAD_SHOVEL, itemModelGenerator);
        registerTool(ModItems.LEAD_PICKAXE, itemModelGenerator);
        registerTool(ModItems.LEAD_AXE, itemModelGenerator);
        registerTool(ModItems.LEAD_HOE, itemModelGenerator);

        registerTool(ModItems.REDSTONE_SWORD, itemModelGenerator);
        registerTool(ModItems.REDSTONE_SHOVEL, itemModelGenerator);
        registerTool(ModItems.REDSTONE_PICKAXE, itemModelGenerator);
        registerTool(ModItems.REDSTONE_AXE, itemModelGenerator);
        registerTool(ModItems.REDSTONE_HOE, itemModelGenerator);

        registerArmor(ModItems.BRONZE_HELMET, itemModelGenerator, ModEquipmentAssets.BRONZE_ARMOR);
        registerArmor(ModItems.BRONZE_CHESTPLATE, itemModelGenerator, ModEquipmentAssets.BRONZE_ARMOR);
        registerArmor(ModItems.BRONZE_LEGGINGS, itemModelGenerator, ModEquipmentAssets.BRONZE_ARMOR);
        registerArmor(ModItems.BRONZE_BOOTS, itemModelGenerator, ModEquipmentAssets.BRONZE_ARMOR);

        registerArmor(ModItems.IRONCOPPER_HELMET, itemModelGenerator, ModEquipmentAssets.IRONCOPPER_ARMOR);
        registerArmor(ModItems.IRONCOPPER_CHESTPLATE, itemModelGenerator, ModEquipmentAssets.IRONCOPPER_ARMOR);
        registerArmor(ModItems.IRONCOPPER_LEGGINGS, itemModelGenerator, ModEquipmentAssets.IRONCOPPER_ARMOR);
        registerArmor(ModItems.IRONCOPPER_BOOTS, itemModelGenerator, ModEquipmentAssets.IRONCOPPER_ARMOR);

        registerArmor(ModItems.AMETHYST_HELMET, itemModelGenerator, ModEquipmentAssets.AMETHYST_ARMOR);
        registerArmor(ModItems.AMETHYST_CHESTPLATE, itemModelGenerator, ModEquipmentAssets.AMETHYST_ARMOR);
        registerArmor(ModItems.AMETHYST_LEGGINGS, itemModelGenerator, ModEquipmentAssets.AMETHYST_ARMOR);
        registerArmor(ModItems.AMETHYST_BOOTS, itemModelGenerator, ModEquipmentAssets.AMETHYST_ARMOR);

        registerArmor(ModItems.EMERALD_HELMET, itemModelGenerator, ModEquipmentAssets.EMERALD_ARMOR);
        registerArmor(ModItems.EMERALD_CHESTPLATE, itemModelGenerator, ModEquipmentAssets.EMERALD_ARMOR);
        registerArmor(ModItems.EMERALD_LEGGINGS, itemModelGenerator, ModEquipmentAssets.EMERALD_ARMOR);
        registerArmor(ModItems.EMERALD_BOOTS, itemModelGenerator, ModEquipmentAssets.EMERALD_ARMOR);

        registerArmor(ModItems.LEAD_HELMET, itemModelGenerator, ModEquipmentAssets.LEAD_ARMOR);
        registerArmor(ModItems.LEAD_CHESTPLATE, itemModelGenerator, ModEquipmentAssets.LEAD_ARMOR);
        registerArmor(ModItems.LEAD_LEGGINGS, itemModelGenerator, ModEquipmentAssets.LEAD_ARMOR);
        registerArmor(ModItems.LEAD_BOOTS, itemModelGenerator, ModEquipmentAssets.LEAD_ARMOR);

        registerArmor(ModItems.QUARTZ_HELMET, itemModelGenerator, ModEquipmentAssets.QUARTZ_ARMOR);
        registerArmor(ModItems.QUARTZ_CHESTPLATE, itemModelGenerator, ModEquipmentAssets.QUARTZ_ARMOR);
        registerArmor(ModItems.QUARTZ_LEGGINGS, itemModelGenerator, ModEquipmentAssets.QUARTZ_ARMOR);
        registerArmor(ModItems.QUARTZ_BOOTS, itemModelGenerator, ModEquipmentAssets.QUARTZ_ARMOR);

        registerArmor(ModItems.REDSTONE_HELMET, itemModelGenerator, ModEquipmentAssets.REDSTONE_ARMOR);
        registerArmor(ModItems.REDSTONE_CHESTPLATE, itemModelGenerator, ModEquipmentAssets.REDSTONE_ARMOR);
        registerArmor(ModItems.REDSTONE_LEGGINGS, itemModelGenerator, ModEquipmentAssets.REDSTONE_ARMOR);
        registerArmor(ModItems.REDSTONE_BOOTS, itemModelGenerator, ModEquipmentAssets.REDSTONE_ARMOR);

        registerArmor(ModItems.LAVA_HELMET, itemModelGenerator, ModEquipmentAssets.LAVA_ARMOR);
        registerArmor(ModItems.LAVA_CHESTPLATE, itemModelGenerator, ModEquipmentAssets.LAVA_ARMOR);
        registerArmor(ModItems.LAVA_LEGGINGS, itemModelGenerator, ModEquipmentAssets.LAVA_ARMOR);
        registerArmor(ModItems.LAVA_BOOTS, itemModelGenerator, ModEquipmentAssets.LAVA_ARMOR);

        registerItem(ModItems.BRONZE_INGOT, itemModelGenerator);
        registerItem(ModItems.AMETHYST_INGOT, itemModelGenerator);
        registerItem(ModItems.EMERALD_INGOT, itemModelGenerator);
        registerItem(ModItems.LEAD_INGOT, itemModelGenerator);
        registerItem(ModItems.QUARTZ_INGOT, itemModelGenerator);
        registerItem(ModItems.REDSTONE_INGOT, itemModelGenerator);
        registerItem(ModItems.RED_DIAMOND_INGOT, itemModelGenerator);

        registerItem(ModItems.RAW_LEAD, itemModelGenerator);
        registerItem(ModItems.QUARTZ_SCRAP, itemModelGenerator);
        registerItem(ModItems.RED_DIAMOND, itemModelGenerator);
        registerItem(ModItems.LAVA_SMITHING_TEMPLATE, itemModelGenerator);
    }

    public void registerItem(Item item, ItemModelGenerator itemModels) {
        itemModels.register(item, Models.GENERATED);
    }

    public void registerTool(Item item, ItemModelGenerator itemModels) {
        itemModels.register(item, Models.HANDHELD);
    }

    public void registerArmor(Item item, ItemModelGenerator itemModels, RegistryKey<EquipmentAsset> equipmentKey) {
        var id = Registries.ITEM.getId(item);
        var armorType = determineArmorType(id.getPath());
        itemModels.registerArmor(item, equipmentKey, armorType, false);
    }

    private enum ArmorType {
        HELMET("helmet", ItemModelGenerator.HELMET_TRIM_ID_PREFIX),
        CHESTPLATE("chestplate", ItemModelGenerator.CHESTPLATE_TRIM_ID_PREFIX),
        LEGGINGS("leggings", ItemModelGenerator.LEGGINGS_TRIM_ID_PREFIX),
        BOOTS("boots", ItemModelGenerator.BOOTS_TRIM_ID_PREFIX);

        private final String identifier;
        private final Identifier trimPrefix;

        ArmorType(String identifier, Identifier trimPrefix) {
            this.identifier = identifier;
            this.trimPrefix = trimPrefix;
        }

        public static Identifier getTrimPrefix(String path) {
            return Stream.of(values())
                .filter(type -> path.contains(type.identifier))
                .map(type -> type.trimPrefix)
                .findFirst()
                .orElse(null);
        }
    }

    private Identifier determineArmorType(String path) {
        return ArmorType.getTrimPrefix(path);
    }
}