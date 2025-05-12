package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.ModelProvider;
import net.minecraft.client.data.Models;
import net.minecraft.data.DataOutput;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModBlocks;
import net.syshima.sptools.ModItems;
import net.syshima.sptools.core.assets.ModEquipmentAssets;

import java.util.stream.Stream;

public final class ModModelProvider extends ModelProvider {
    public ModModelProvider(DataOutput pack) {
        super(pack, Constants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockStateModelGenerator blockModels, ItemModelGenerator itemModels) {
        generateBlockModels(blockModels);
        generateItemModels(itemModels);
    }

    private void generateBlockModels(BlockStateModelGenerator blockModels) {
        blockModels.registerSimpleCubeAll(ModBlocks.LEAD_ORE.get());
        blockModels.registerSimpleCubeAll(ModBlocks.RED_DIAMOND_ORE.get());
        blockModels.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get());
    }

    private void generateItemModels(ItemModelGenerator itemModels) {
        registerTool(ModItems.BRONZE_SWORD.get(), itemModels);
        registerTool(ModItems.BRONZE_SHOVEL.get(), itemModels);
        registerTool(ModItems.BRONZE_PICKAXE.get(), itemModels);
        registerTool(ModItems.BRONZE_AXE.get(), itemModels);
        registerTool(ModItems.BRONZE_HOE.get(), itemModels);

        registerTool(ModItems.IRONCOPPER_SWORD.get(), itemModels);
        registerTool(ModItems.IRONCOPPER_SHOVEL.get(), itemModels);
        registerTool(ModItems.IRONCOPPER_PICKAXE.get(), itemModels);
        registerTool(ModItems.IRONCOPPER_AXE.get(), itemModels);
        registerTool(ModItems.IRONCOPPER_HOE.get(), itemModels);

        registerTool(ModItems.AMETHYST_SWORD.get(), itemModels);
        registerTool(ModItems.AMETHYST_SHOVEL.get(), itemModels);
        registerTool(ModItems.AMETHYST_PICKAXE.get(), itemModels);
        registerTool(ModItems.AMETHYST_AXE.get(), itemModels);
        registerTool(ModItems.AMETHYST_HOE.get(), itemModels);

        registerTool(ModItems.EMERALD_SWORD.get(), itemModels);
        registerTool(ModItems.EMERALD_SHOVEL.get(), itemModels);
        registerTool(ModItems.EMERALD_PICKAXE.get(), itemModels);
        registerTool(ModItems.EMERALD_AXE.get(), itemModels);
        registerTool(ModItems.EMERALD_HOE.get(), itemModels);

        registerTool(ModItems.QUARTZ_SWORD.get(), itemModels);
        registerTool(ModItems.QUARTZ_SHOVEL.get(), itemModels);
        registerTool(ModItems.QUARTZ_PICKAXE.get(), itemModels);
        registerTool(ModItems.QUARTZ_AXE.get(), itemModels);
        registerTool(ModItems.QUARTZ_HOE.get(), itemModels);

        registerTool(ModItems.LEAD_SWORD.get(), itemModels);
        registerTool(ModItems.LEAD_SHOVEL.get(), itemModels);
        registerTool(ModItems.LEAD_PICKAXE.get(), itemModels);
        registerTool(ModItems.LEAD_AXE.get(), itemModels);
        registerTool(ModItems.LEAD_HOE.get(), itemModels);

        registerTool(ModItems.REDSTONE_SWORD.get(), itemModels);
        registerTool(ModItems.REDSTONE_SHOVEL.get(), itemModels);
        registerTool(ModItems.REDSTONE_PICKAXE.get(), itemModels);
        registerTool(ModItems.REDSTONE_AXE.get(), itemModels);
        registerTool(ModItems.REDSTONE_HOE.get(), itemModels);

        registerArmor(ModItems.BRONZE_HELMET.get(), itemModels, ModEquipmentAssets.BRONZE_ARMOR);
        registerArmor(ModItems.BRONZE_CHESTPLATE.get(), itemModels, ModEquipmentAssets.BRONZE_ARMOR);
        registerArmor(ModItems.BRONZE_LEGGINGS.get(), itemModels, ModEquipmentAssets.BRONZE_ARMOR);
        registerArmor(ModItems.BRONZE_BOOTS.get(), itemModels, ModEquipmentAssets.BRONZE_ARMOR);

        registerArmor(ModItems.IRONCOPPER_HELMET.get(), itemModels, ModEquipmentAssets.IRONCOPPER_ARMOR);
        registerArmor(ModItems.IRONCOPPER_CHESTPLATE.get(), itemModels, ModEquipmentAssets.IRONCOPPER_ARMOR);
        registerArmor(ModItems.IRONCOPPER_LEGGINGS.get(), itemModels, ModEquipmentAssets.IRONCOPPER_ARMOR);
        registerArmor(ModItems.IRONCOPPER_BOOTS.get(), itemModels, ModEquipmentAssets.IRONCOPPER_ARMOR);

        registerArmor(ModItems.AMETHYST_HELMET.get(), itemModels, ModEquipmentAssets.AMETHYST_ARMOR);
        registerArmor(ModItems.AMETHYST_CHESTPLATE.get(), itemModels, ModEquipmentAssets.AMETHYST_ARMOR);
        registerArmor(ModItems.AMETHYST_LEGGINGS.get(), itemModels, ModEquipmentAssets.AMETHYST_ARMOR);
        registerArmor(ModItems.AMETHYST_BOOTS.get(), itemModels, ModEquipmentAssets.AMETHYST_ARMOR);

        registerArmor(ModItems.EMERALD_HELMET.get(), itemModels, ModEquipmentAssets.EMERALD_ARMOR);
        registerArmor(ModItems.EMERALD_CHESTPLATE.get(), itemModels, ModEquipmentAssets.EMERALD_ARMOR);
        registerArmor(ModItems.EMERALD_LEGGINGS.get(), itemModels, ModEquipmentAssets.EMERALD_ARMOR);
        registerArmor(ModItems.EMERALD_BOOTS.get(), itemModels, ModEquipmentAssets.EMERALD_ARMOR);

        registerArmor(ModItems.LEAD_HELMET.get(), itemModels, ModEquipmentAssets.LEAD_ARMOR);
        registerArmor(ModItems.LEAD_CHESTPLATE.get(), itemModels, ModEquipmentAssets.LEAD_ARMOR);
        registerArmor(ModItems.LEAD_LEGGINGS.get(), itemModels, ModEquipmentAssets.LEAD_ARMOR);
        registerArmor(ModItems.LEAD_BOOTS.get(), itemModels, ModEquipmentAssets.LEAD_ARMOR);

        registerArmor(ModItems.QUARTZ_HELMET.get(), itemModels, ModEquipmentAssets.QUARTZ_ARMOR);
        registerArmor(ModItems.QUARTZ_CHESTPLATE.get(), itemModels, ModEquipmentAssets.QUARTZ_ARMOR);
        registerArmor(ModItems.QUARTZ_LEGGINGS.get(), itemModels, ModEquipmentAssets.QUARTZ_ARMOR);
        registerArmor(ModItems.QUARTZ_BOOTS.get(), itemModels, ModEquipmentAssets.QUARTZ_ARMOR);

        registerArmor(ModItems.REDSTONE_HELMET.get(), itemModels, ModEquipmentAssets.REDSTONE_ARMOR);
        registerArmor(ModItems.REDSTONE_CHESTPLATE.get(), itemModels, ModEquipmentAssets.REDSTONE_ARMOR);
        registerArmor(ModItems.REDSTONE_LEGGINGS.get(), itemModels, ModEquipmentAssets.REDSTONE_ARMOR);
        registerArmor(ModItems.REDSTONE_BOOTS.get(), itemModels, ModEquipmentAssets.REDSTONE_ARMOR);

        registerArmor(ModItems.LAVA_HELMET.get(), itemModels, ModEquipmentAssets.LAVA_ARMOR);
        registerArmor(ModItems.LAVA_CHESTPLATE.get(), itemModels, ModEquipmentAssets.LAVA_ARMOR);
        registerArmor(ModItems.LAVA_LEGGINGS.get(), itemModels, ModEquipmentAssets.LAVA_ARMOR);
        registerArmor(ModItems.LAVA_BOOTS.get(), itemModels, ModEquipmentAssets.LAVA_ARMOR);

        registerItem(ModItems.BRONZE_INGOT.get(), itemModels);
        registerItem(ModItems.AMETHYST_INGOT.get(), itemModels);
        registerItem(ModItems.EMERALD_INGOT.get(), itemModels);
        registerItem(ModItems.LEAD_INGOT.get(), itemModels);
        registerItem(ModItems.QUARTZ_INGOT.get(), itemModels);
        registerItem(ModItems.REDSTONE_INGOT.get(), itemModels);
        registerItem(ModItems.RED_DIAMOND_INGOT.get(), itemModels);

        registerItem(ModItems.RAW_LEAD.get(), itemModels);
        registerItem(ModItems.QUARTZ_SCRAP.get(), itemModels);
        registerItem(ModItems.RED_DIAMOND.get(), itemModels);
        registerItem(ModItems.LAVA_SMITHING_TEMPLATE.get(), itemModels);

        registerTool(ModItems.DURABLE_FIREWORK_ROCKET.get(), itemModels);
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
