package net.syshima.sptools.core.assets;

import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.syshima.sptools.ModTags;

import java.util.EnumMap;

public interface ModArmorMaterials {
    ArmorMaterial BRONZE = register(
            132,
            toMap(2, 4, 4, 2, 5),
            9,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,
            0.0F,
            ModTags.REPAIRS_BRONZE_ARMOR,
            ModEquipmentAssets.BRONZE_ARMOR);

    ArmorMaterial IRONCOPPER = register(
            121,
            toMap(2, 4, 5, 3, 5),
            11,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            ModTags.REPAIRS_IRONCOPPER_ARMOR,
            ModEquipmentAssets.IRONCOPPER_ARMOR);

    ArmorMaterial AMETHYST = register(
            181,
            toMap(3, 5, 8, 3, 5),
            11,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0F,
            0.0F,
            ModTags.REPAIRS_AMETHYST_ARMOR,
            ModEquipmentAssets.AMETHYST_ARMOR);

    ArmorMaterial EMERALD = register(
            231,
            toMap(3, 6, 8, 3, 5),
            11,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
            0.0F,
            0.0F,
            ModTags.REPAIRS_EMERALD_ARMOR,
            ModEquipmentAssets.EMERALD_ARMOR);

    ArmorMaterial LEAD = register(
            132,
            toMap(4, 6, 8, 3, 5),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE,
            1.0F,
            0.18F,
            ModTags.REPAIRS_LEAD_ARMOR,
            ModEquipmentAssets.LEAD_ARMOR);

    ArmorMaterial QUARTZ = register(
            242,
            toMap(2, 6, 8, 3, 4),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            1.0F,
            0.1F,
            ModTags.REPAIRS_QUARTZ_ARMOR,
            ModEquipmentAssets.QUARTZ_ARMOR);

    ArmorMaterial REDSTONE = register(
            154,
            toMap(2, 4, 6, 3, 4),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            1.0F,
            0.1F,
            ModTags.REPAIRS_REDSTONE_ARMOR,
            ModEquipmentAssets.REDSTONE_ARMOR);

    ArmorMaterial LAVA = register(
            154,
            toMap(2, 6, 8, 5, 12),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            2.0F,
            0.2F,
            ModTags.REPAIRS_LAVA_ARMOR,
            ModEquipmentAssets.LAVA_ARMOR);

    static EnumMap<EquipmentType, Integer> toMap(int boots, int leggings, int chestplate, int helmet, int body) {
        EnumMap<EquipmentType, Integer> defenseMap = new EnumMap<>(EquipmentType.class);
        defenseMap.put(EquipmentType.BOOTS, boots);
        defenseMap.put(EquipmentType.LEGGINGS, leggings);
        defenseMap.put(EquipmentType.CHESTPLATE, chestplate);
        defenseMap.put(EquipmentType.HELMET, helmet);
        defenseMap.put(EquipmentType.BODY, body);
        return defenseMap;
    }

    private static ArmorMaterial register(
            int durability,
            EnumMap<EquipmentType, Integer> defenseMap,
            int enchantmentValue,
            RegistryEntry<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            TagKey<Item> repairIngredient,
            RegistryKey<EquipmentAsset> assets
    ) {
        return create(
                durability,
                defenseMap,
                enchantmentValue,
                equipSound,
                toughness,
                knockbackResistance,
                repairIngredient,
                assets
        );
    }

    private static ArmorMaterial create(
            int durability,
            EnumMap<EquipmentType, Integer> defenseMap,
            int enchantmentValue,
            RegistryEntry<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            TagKey<Item> repairIngredient,
            RegistryKey<EquipmentAsset> assets
    ) {
        EnumMap<EquipmentType, Integer> map = new EnumMap<>(EquipmentType.class);

        for (EquipmentType type : EquipmentType.values()) {
            map.put(type, defenseMap.get(type));
        }

        return new ArmorMaterial(
                durability,
                map,
                enchantmentValue,
                equipSound,
                toughness,
                knockbackResistance,
                repairIngredient,
                assets
        );
    }
}
