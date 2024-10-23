package com.shiri47s.mod.sptools.materials;

import com.shiri47s.mod.sptools.Constants;
import com.shiri47s.mod.sptools.Instances;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;

@SuppressWarnings({"rawtypes", "unchecked", "DuplicatedCode"})
public class SupplementalArmorMaterials {
    public static RegistryEntry<ArmorMaterial> BRONZE;
    public static RegistryEntry<ArmorMaterial> IRONCOPPER;
    public static RegistryEntry<ArmorMaterial> AMETHYST;
    public static RegistryEntry<ArmorMaterial> EMERALD;
    public static RegistryEntry<ArmorMaterial> LEAD;
    public static RegistryEntry<ArmorMaterial> QUARTZ;
    public static RegistryEntry<ArmorMaterial> REDSTONE;
    public static RegistryEntry<ArmorMaterial> LAVA;

    static {
        BRONZE = createBronze();
        IRONCOPPER = createIronCopper();
        AMETHYST = createAmethyst();
        EMERALD = createEmerald();
        LEAD = createLead();
        QUARTZ = createQuartz();
        REDSTONE = createRedstone();
        LAVA = createLava();
    }

    private static RegistryEntry<ArmorMaterial> createBronze() {
        var enumMap = Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.BOOTS, 2);
            map.put(ArmorItem.Type.LEGGINGS, 4);
            map.put(ArmorItem.Type.CHESTPLATE, 4);
            map.put(ArmorItem.Type.HELMET, 2);
            map.put(ArmorItem.Type.BODY, 5);
        });
        return Registry.registerReference(
                Registries.ARMOR_MATERIAL,
                new Identifier(Constants.Armor.BRONZE_ARMOR),
                new ArmorMaterial(
                        enumMap,
                        12,
                        SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
                        () -> Ingredient.ofItems(Instances.Item.BRONZE_INGOT),
                        List.of(new ArmorMaterial.Layer(new Identifier(Constants.Armor.BRONZE_ARMOR))),
                        0,
                        0));
    }

    private static RegistryEntry<ArmorMaterial> createIronCopper() {
        var enumMap = Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.BOOTS, 2);
            map.put(ArmorItem.Type.LEGGINGS, 4);
            map.put(ArmorItem.Type.CHESTPLATE, 5);
            map.put(ArmorItem.Type.HELMET, 3);
            map.put(ArmorItem.Type.BODY, 5);
        });
        return Registry.registerReference(
                Registries.ARMOR_MATERIAL,
                new Identifier(Constants.Armor.IRONCOPPER_ARMOR),
                new ArmorMaterial(
                        enumMap,
                        12,
                        SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
                        () -> Ingredient.ofItems(Items.COPPER_INGOT, Items.IRON_INGOT),
                        List.of(new ArmorMaterial.Layer(new Identifier(Constants.Armor.IRONCOPPER_ARMOR))),
                        0,
                        0));
    }

    private static RegistryEntry<ArmorMaterial> createAmethyst() {
        var enumMap = Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.BOOTS, 3);
            map.put(ArmorItem.Type.LEGGINGS, 5);
            map.put(ArmorItem.Type.CHESTPLATE, 8);
            map.put(ArmorItem.Type.HELMET, 3);
            map.put(ArmorItem.Type.BODY, 5);
        });
        return Registry.registerReference(
                Registries.ARMOR_MATERIAL,
                new Identifier(Constants.Armor.AMETHYST_ARMOR),
                new ArmorMaterial(
                        enumMap,
                        15,
                        SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                        () -> Ingredient.ofItems(Instances.Item.AMETHYST_INGOT),
                        List.of(new ArmorMaterial.Layer(new Identifier(Constants.Armor.AMETHYST_ARMOR))),
                        0,
                        0));
    }

    private static RegistryEntry<ArmorMaterial> createEmerald() {
        var enumMap = Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.BOOTS, 3);
            map.put(ArmorItem.Type.LEGGINGS, 6);
            map.put(ArmorItem.Type.CHESTPLATE, 8);
            map.put(ArmorItem.Type.HELMET, 3);
            map.put(ArmorItem.Type.BODY, 5);
        });
        return Registry.registerReference(
                Registries.ARMOR_MATERIAL,
                new Identifier(Constants.Armor.EMERALD_ARMOR),
                new ArmorMaterial(
                        enumMap,
                        15,
                        SoundEvents.ITEM_ARMOR_EQUIP_IRON,
                        () -> Ingredient.ofItems(Instances.Item.EMERALD_INGOT),
                        List.of(new ArmorMaterial.Layer(new Identifier(Constants.Armor.EMERALD_ARMOR))),
                        1.0F,
                        0.1F));
    }

    private static RegistryEntry<ArmorMaterial> createLead() {
        var enumMap = Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.BOOTS, 4);
            map.put(ArmorItem.Type.LEGGINGS, 6);
            map.put(ArmorItem.Type.CHESTPLATE, 8);
            map.put(ArmorItem.Type.HELMET, 3);
            map.put(ArmorItem.Type.BODY, 5);
        });
        return Registry.registerReference(
                Registries.ARMOR_MATERIAL,
                new Identifier(Constants.Armor.LEAD_ARMOR),
                new ArmorMaterial(
                        enumMap,
                        15,
                        SoundEvents.ITEM_ARMOR_EQUIP_TURTLE,
                        () -> Ingredient.ofItems(Instances.Item.LEAD_INGOT),
                        List.of(new ArmorMaterial.Layer(new Identifier(Constants.Armor.LEAD_ARMOR))),
                        1.0F,
                        0.18F));
    }

    private static RegistryEntry<ArmorMaterial> createQuartz() {
        var enumMap = Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.BOOTS, 2);
            map.put(ArmorItem.Type.LEGGINGS, 6);
            map.put(ArmorItem.Type.CHESTPLATE, 8);
            map.put(ArmorItem.Type.HELMET, 3);
            map.put(ArmorItem.Type.BODY, 4);
        });
        return Registry.registerReference(
                Registries.ARMOR_MATERIAL,
                new Identifier(Constants.Armor.QUARTZ_ARMOR),
                new ArmorMaterial(
                        enumMap,
                        15,
                        SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
                        () -> Ingredient.ofItems(Instances.Item.QUARTZ_INGOT),
                        List.of(new ArmorMaterial.Layer(new Identifier(Constants.Armor.QUARTZ_ARMOR))),
                        1.0F,
                        0.18F));
    }

    private static RegistryEntry<ArmorMaterial> createRedstone() {
        var enumMap = Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.BOOTS, 2);
            map.put(ArmorItem.Type.LEGGINGS, 4);
            map.put(ArmorItem.Type.CHESTPLATE, 6);
            map.put(ArmorItem.Type.HELMET, 3);
            map.put(ArmorItem.Type.BODY, 4);
        });
        return Registry.registerReference(
                Registries.ARMOR_MATERIAL,
                new Identifier(Constants.Armor.REDSTONE_ARMOR),
                new ArmorMaterial(
                        enumMap,
                        15,
                        SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
                        () -> Ingredient.ofItems(Instances.Item.REDSTONE_INGOT),
                        List.of(new ArmorMaterial.Layer(new Identifier(Constants.Armor.REDSTONE_ARMOR))),
                        1.0F,
                        0.18F));
    }

    private static RegistryEntry<ArmorMaterial> createLava() {
        var enumMap = Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
            map.put(ArmorItem.Type.BOOTS, 4);
            map.put(ArmorItem.Type.LEGGINGS, 6);
            map.put(ArmorItem.Type.CHESTPLATE, 8);
            map.put(ArmorItem.Type.HELMET, 5);
            map.put(ArmorItem.Type.BODY, 12);
        });
        return Registry.registerReference(
                Registries.ARMOR_MATERIAL,
                new Identifier(Constants.Armor.LAVA_ARMOR),
                new ArmorMaterial(
                        enumMap,
                        12,
                        SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                        () -> Ingredient.ofItems(Instances.Item.RED_DIAMOND_INGOT),
                        List.of(new ArmorMaterial.Layer(new Identifier(Constants.Armor.LAVA_ARMOR))),
                        2.0F,
                        0.2F));
    }
}
