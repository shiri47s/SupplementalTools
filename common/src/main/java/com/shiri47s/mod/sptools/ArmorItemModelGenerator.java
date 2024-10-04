package com.shiri47s.mod.sptools;

import com.shiri47s.mod.sptools.armors.*;
import com.shiri47s.mod.sptools.items.*;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;

import static com.shiri47s.mod.sptools.Constants.MOD_ID;

public class ArmorItemModelGenerator {
    private static final DeferredRegister<Item> ARMOR_REGISTER = DeferredRegister.create(MOD_ID, RegistryKeys.ITEM);

    public static void generate() {
        generateItems();
        generateArmors();

        ARMOR_REGISTER.register();
    }

    private static void generateArmors() {
        ARMOR_REGISTER.register(Constants.Armor.BRONZE_HELMET, () -> new BronzeArmorItem(ArmorItem.Type.HELMET));
        ARMOR_REGISTER.register(Constants.Armor.BRONZE_CHESTPLATE, () -> new BronzeArmorItem(ArmorItem.Type.CHESTPLATE));
        ARMOR_REGISTER.register(Constants.Armor.BRONZE_LEGGINGS, () -> new BronzeArmorItem(ArmorItem.Type.LEGGINGS));
        ARMOR_REGISTER.register(Constants.Armor.BRONZE_BOOTS, () -> new BronzeArmorItem(ArmorItem.Type.BOOTS));

        ARMOR_REGISTER.register(Constants.Armor.IRONCOPPER_HELMET, () -> new IronCopperArmorItem(ArmorItem.Type.HELMET));
        ARMOR_REGISTER.register(Constants.Armor.IRONCOPPER_CHESTPLATE, () -> new IronCopperArmorItem(ArmorItem.Type.CHESTPLATE));
        ARMOR_REGISTER.register(Constants.Armor.IRONCOPPER_LEGGINGS, () -> new IronCopperArmorItem(ArmorItem.Type.LEGGINGS));
        ARMOR_REGISTER.register(Constants.Armor.IRONCOPPER_BOOTS, () -> new IronCopperArmorItem(ArmorItem.Type.BOOTS));

        ARMOR_REGISTER.register(Constants.Armor.AMETHYST_HELMET, () -> new AmethystArmorItem(ArmorItem.Type.HELMET));
        ARMOR_REGISTER.register(Constants.Armor.AMETHYST_CHESTPLATE, () -> new AmethystArmorItem(ArmorItem.Type.CHESTPLATE));
        ARMOR_REGISTER.register(Constants.Armor.AMETHYST_LEGGINGS, () -> new AmethystArmorItem(ArmorItem.Type.LEGGINGS));
        ARMOR_REGISTER.register(Constants.Armor.AMETHYST_BOOTS, () -> new AmethystArmorItem(ArmorItem.Type.BOOTS));

        ARMOR_REGISTER.register(Constants.Armor.EMERALD_HELMET, () -> new EmeraldArmorItem(ArmorItem.Type.HELMET));
        ARMOR_REGISTER.register(Constants.Armor.EMERALD_CHESTPLATE, () -> new EmeraldArmorItem(ArmorItem.Type.CHESTPLATE));
        ARMOR_REGISTER.register(Constants.Armor.EMERALD_LEGGINGS, () -> new EmeraldArmorItem(ArmorItem.Type.LEGGINGS));
        ARMOR_REGISTER.register(Constants.Armor.EMERALD_BOOTS, () -> new EmeraldArmorItem(ArmorItem.Type.BOOTS));

        ARMOR_REGISTER.register(Constants.Armor.LEAD_HELMET, () -> new LeadArmorItem(ArmorItem.Type.HELMET));
        ARMOR_REGISTER.register(Constants.Armor.LEAD_CHESTPLATE, () -> new LeadArmorItem(ArmorItem.Type.CHESTPLATE));
        ARMOR_REGISTER.register(Constants.Armor.LEAD_LEGGINGS, () -> new LeadArmorItem(ArmorItem.Type.LEGGINGS));
        ARMOR_REGISTER.register(Constants.Armor.LEAD_BOOTS, () -> new LeadArmorItem(ArmorItem.Type.BOOTS));

        ARMOR_REGISTER.register(Constants.Armor.QUARTZ_HELMET, () -> new QuartzArmorItem(ArmorItem.Type.HELMET));
        ARMOR_REGISTER.register(Constants.Armor.QUARTZ_CHESTPLATE, () -> new QuartzArmorItem(ArmorItem.Type.CHESTPLATE));
        ARMOR_REGISTER.register(Constants.Armor.QUARTZ_LEGGINGS, () -> new QuartzArmorItem(ArmorItem.Type.LEGGINGS));
        ARMOR_REGISTER.register(Constants.Armor.QUARTZ_BOOTS, () -> new QuartzArmorItem(ArmorItem.Type.BOOTS));
    }

    private static void generateItems() {
        ARMOR_REGISTER.register(Constants.Item.BRONZE_INGOT, () -> new BronzeIngot(new Item.Settings()));
        ARMOR_REGISTER.register(Constants.Item.AMETHYST_INGOT, () -> new AmethystIngot(new Item.Settings()));
        ARMOR_REGISTER.register(Constants.Item.EMERALD_INGOT, () -> new EmeraldIngot(new Item.Settings()));
        ARMOR_REGISTER.register(Constants.Item.LEAD_INGOT, () -> new LeadIngot(new Item.Settings()));
        ARMOR_REGISTER.register(Constants.Item.RAW_LEAD, () -> new Item(new Item.Settings()));
        ARMOR_REGISTER.register(Constants.Item.LEAD_ORE, () -> new LeadBlockItem(new Item.Settings()));
        ARMOR_REGISTER.register(Constants.Item.QUARTZ_INGOT, () -> new QuartzIngot(new Item.Settings()));
        ARMOR_REGISTER.register(Constants.Item.QUARTZ_SCRAP, () -> new Item(new Item.Settings()));
    }
}
