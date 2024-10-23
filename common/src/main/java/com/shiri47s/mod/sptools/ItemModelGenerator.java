package com.shiri47s.mod.sptools;

import com.shiri47s.mod.sptools.armors.*;
import com.shiri47s.mod.sptools.items.*;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static com.shiri47s.mod.sptools.Constants.MOD_ID;

public class ItemModelGenerator {
    private static final DeferredRegister<Item> ITEM_REGISTER = DeferredRegister.create(MOD_ID, RegistryKeys.ITEM);

    public static void generate() {
        generateItems();
        generateArmors();

        ITEM_REGISTER.register();
    }

    private static void generateArmors() {
        ITEM_REGISTER.register(Constants.Armor.BRONZE_HELMET, () -> new BronzeArmorItem(EquipmentType.HELMET, ofItemSettings(Constants.Armor.BRONZE_HELMET)));
        ITEM_REGISTER.register(Constants.Armor.BRONZE_CHESTPLATE, () -> new BronzeArmorItem(EquipmentType.CHESTPLATE, ofItemSettings(Constants.Armor.BRONZE_CHESTPLATE)));
        ITEM_REGISTER.register(Constants.Armor.BRONZE_LEGGINGS, () -> new BronzeArmorItem(EquipmentType.LEGGINGS, ofItemSettings(Constants.Armor.BRONZE_LEGGINGS)));
        ITEM_REGISTER.register(Constants.Armor.BRONZE_BOOTS, () -> new BronzeArmorItem(EquipmentType.BOOTS, ofItemSettings(Constants.Armor.BRONZE_BOOTS)));

        ITEM_REGISTER.register(Constants.Armor.IRONCOPPER_HELMET, () -> new IronCopperArmorItem(EquipmentType.HELMET, ofItemSettings(Constants.Armor.IRONCOPPER_HELMET)));
        ITEM_REGISTER.register(Constants.Armor.IRONCOPPER_CHESTPLATE, () -> new IronCopperArmorItem(EquipmentType.CHESTPLATE, ofItemSettings(Constants.Armor.IRONCOPPER_CHESTPLATE)));
        ITEM_REGISTER.register(Constants.Armor.IRONCOPPER_LEGGINGS, () -> new IronCopperArmorItem(EquipmentType.LEGGINGS, ofItemSettings(Constants.Armor.IRONCOPPER_LEGGINGS)));
        ITEM_REGISTER.register(Constants.Armor.IRONCOPPER_BOOTS, () -> new IronCopperArmorItem(EquipmentType.BOOTS, ofItemSettings(Constants.Armor.IRONCOPPER_BOOTS)));

        ITEM_REGISTER.register(Constants.Armor.AMETHYST_HELMET, () -> new AmethystArmorItem(EquipmentType.HELMET, ofItemSettings(Constants.Armor.AMETHYST_HELMET)));
        ITEM_REGISTER.register(Constants.Armor.AMETHYST_CHESTPLATE, () -> new AmethystArmorItem(EquipmentType.CHESTPLATE, ofItemSettings(Constants.Armor.AMETHYST_CHESTPLATE)));
        ITEM_REGISTER.register(Constants.Armor.AMETHYST_LEGGINGS, () -> new AmethystArmorItem(EquipmentType.LEGGINGS, ofItemSettings(Constants.Armor.AMETHYST_LEGGINGS)));
        ITEM_REGISTER.register(Constants.Armor.AMETHYST_BOOTS, () -> new AmethystArmorItem(EquipmentType.BOOTS, ofItemSettings(Constants.Armor.AMETHYST_BOOTS)));

        ITEM_REGISTER.register(Constants.Armor.EMERALD_HELMET, () -> new EmeraldArmorItem(EquipmentType.HELMET, ofItemSettings(Constants.Armor.EMERALD_HELMET)));
        ITEM_REGISTER.register(Constants.Armor.EMERALD_CHESTPLATE, () -> new EmeraldArmorItem(EquipmentType.CHESTPLATE, ofItemSettings(Constants.Armor.EMERALD_CHESTPLATE)));
        ITEM_REGISTER.register(Constants.Armor.EMERALD_LEGGINGS, () -> new EmeraldArmorItem(EquipmentType.LEGGINGS, ofItemSettings(Constants.Armor.EMERALD_LEGGINGS)));
        ITEM_REGISTER.register(Constants.Armor.EMERALD_BOOTS, () -> new EmeraldArmorItem(EquipmentType.BOOTS, ofItemSettings(Constants.Armor.EMERALD_BOOTS)));

        ITEM_REGISTER.register(Constants.Armor.LEAD_HELMET, () -> new LeadArmorItem(EquipmentType.HELMET, ofItemSettings(Constants.Armor.LEAD_HELMET)));
        ITEM_REGISTER.register(Constants.Armor.LEAD_CHESTPLATE, () -> new LeadArmorItem(EquipmentType.CHESTPLATE, ofItemSettings(Constants.Armor.LEAD_CHESTPLATE)));
        ITEM_REGISTER.register(Constants.Armor.LEAD_LEGGINGS, () -> new LeadArmorItem(EquipmentType.LEGGINGS, ofItemSettings(Constants.Armor.LEAD_LEGGINGS)));
        ITEM_REGISTER.register(Constants.Armor.LEAD_BOOTS, () -> new LeadArmorItem(EquipmentType.BOOTS, ofItemSettings(Constants.Armor.LEAD_BOOTS)));

        ITEM_REGISTER.register(Constants.Armor.QUARTZ_HELMET, () -> new QuartzArmorItem(EquipmentType.HELMET, ofItemSettings(Constants.Armor.QUARTZ_HELMET)));
        ITEM_REGISTER.register(Constants.Armor.QUARTZ_CHESTPLATE, () -> new QuartzArmorItem(EquipmentType.CHESTPLATE, ofItemSettings(Constants.Armor.QUARTZ_CHESTPLATE)));
        ITEM_REGISTER.register(Constants.Armor.QUARTZ_LEGGINGS, () -> new QuartzArmorItem(EquipmentType.LEGGINGS, ofItemSettings(Constants.Armor.QUARTZ_LEGGINGS)));
        ITEM_REGISTER.register(Constants.Armor.QUARTZ_BOOTS, () -> new QuartzArmorItem(EquipmentType.BOOTS, ofItemSettings(Constants.Armor.QUARTZ_BOOTS)));

        ITEM_REGISTER.register(Constants.Armor.REDSTONE_HELMET, () -> new RedstoneArmorItem(EquipmentType.HELMET, ofItemSettings(Constants.Armor.REDSTONE_HELMET)));
        ITEM_REGISTER.register(Constants.Armor.REDSTONE_CHESTPLATE, () -> new RedstoneArmorItem(EquipmentType.CHESTPLATE, ofItemSettings(Constants.Armor.REDSTONE_CHESTPLATE)));
        ITEM_REGISTER.register(Constants.Armor.REDSTONE_LEGGINGS, () -> new RedstoneArmorItem(EquipmentType.LEGGINGS, ofItemSettings(Constants.Armor.REDSTONE_LEGGINGS)));
        ITEM_REGISTER.register(Constants.Armor.REDSTONE_BOOTS, () -> new RedstoneArmorItem(EquipmentType.BOOTS, ofItemSettings(Constants.Armor.REDSTONE_BOOTS)));

        ITEM_REGISTER.register(Constants.Armor.LAVA_HELMET, () -> new LavaArmorItem(EquipmentType.HELMET, ofItemSettings(Constants.Armor.LAVA_HELMET)));
        ITEM_REGISTER.register(Constants.Armor.LAVA_CHESTPLATE, () -> new LavaArmorItem(EquipmentType.CHESTPLATE, ofItemSettings(Constants.Armor.LAVA_CHESTPLATE)));
        ITEM_REGISTER.register(Constants.Armor.LAVA_LEGGINGS, () -> new LavaArmorItem(EquipmentType.LEGGINGS, ofItemSettings(Constants.Armor.LAVA_LEGGINGS)));
        ITEM_REGISTER.register(Constants.Armor.LAVA_BOOTS, () -> new LavaArmorItem(EquipmentType.BOOTS, ofItemSettings(Constants.Armor.LAVA_BOOTS)));
    }

    private static void generateItems() {
        ITEM_REGISTER.register(Constants.Item.BRONZE_INGOT, () -> new BronzeIngot(ofItemSettings(Constants.Item.BRONZE_INGOT)));
        ITEM_REGISTER.register(Constants.Item.AMETHYST_INGOT, () -> new AmethystIngot(ofItemSettings(Constants.Item.AMETHYST_INGOT)));
        ITEM_REGISTER.register(Constants.Item.EMERALD_INGOT, () -> new EmeraldIngot(ofItemSettings(Constants.Item.EMERALD_INGOT)));
        ITEM_REGISTER.register(Constants.Item.LEAD_INGOT, () -> new LeadIngot(ofItemSettings(Constants.Item.LEAD_INGOT)));
        ITEM_REGISTER.register(Constants.Item.RAW_LEAD, () -> new SupplementalToolsItem(ofItemSettings(Constants.Item.RAW_LEAD)));
        ITEM_REGISTER.register(Constants.Item.LEAD_ORE, () -> new LeadBlockItem(ofItemSettings(Constants.Item.LEAD_ORE)));
        ITEM_REGISTER.register(Constants.Item.QUARTZ_INGOT, () -> new QuartzIngot(ofItemSettings(Constants.Item.QUARTZ_INGOT)));
        ITEM_REGISTER.register(Constants.Item.QUARTZ_SCRAP, () -> new SupplementalToolsItem(ofItemSettings(Constants.Item.QUARTZ_SCRAP)));
        ITEM_REGISTER.register(Constants.Item.REDSTONE_INGOT, () -> new RedstoneIngot(ofItemSettings(Constants.Item.REDSTONE_INGOT)));
        ITEM_REGISTER.register(Constants.Item.RED_DIAMOND, () -> new SupplementalToolsItem(ofItemSettings(Constants.Item.RED_DIAMOND)));
        ITEM_REGISTER.register(Constants.Item.RED_DIAMOND_INGOT, () -> new SupplementalToolsItem(ofItemSettings(Constants.Item.RED_DIAMOND_INGOT)));
        ITEM_REGISTER.register(Constants.Item.LAVA_SMITHING_TEMPLATE, () -> new SupplementalToolsItem(ofItemSettings(Constants.Item.LAVA_SMITHING_TEMPLATE)));
        ITEM_REGISTER.register(Constants.Item.RED_DIAMOND_ORE, () -> new RedDiamondBlockItem(ofItemSettings(Constants.Item.RED_DIAMOND_ORE)));
        ITEM_REGISTER.register(Constants.Item.DEEPSLATE_RED_DIAMOND_ORE, () -> new DeepslateRedDiamondBlockItem(ofItemSettings(Constants.Item.DEEPSLATE_RED_DIAMOND_ORE)));
    }

    private static Item.Settings ofItemSettings(String id) {
        return new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID,id)));
    }
}
