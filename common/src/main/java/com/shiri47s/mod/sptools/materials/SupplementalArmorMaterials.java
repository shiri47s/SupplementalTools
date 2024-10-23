package com.shiri47s.mod.sptools.materials;

import com.shiri47s.mod.sptools.Constants;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.EnumMap;

import static com.shiri47s.mod.sptools.Constants.MOD_ID;

public interface SupplementalArmorMaterials {
    ArmorMaterial BRONZE = register(
            Constants.Armor.BRONZE_ARMOR,
            132,
            toMap(2, 4, 4, 2, 5),
            9,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,
            0.0F,
            Constants.Tag.REPAIRS_BRONZE_ARMOR);

    ArmorMaterial IRONCOPPER = register(
            Constants.Armor.IRONCOPPER_ARMOR,
            121,
            toMap(2, 4, 5, 3, 5),
            11,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            Constants.Tag.REPAIRS_IRONCOPPER_ARMOR);

    ArmorMaterial AMETHYST = register(
            Constants.Armor.AMETHYST_ARMOR,
            181,
            toMap(3, 5, 8, 3, 5),
            11,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0F,
            0.0F,
            Constants.Tag.REPAIRS_AMETHYST_ARMOR);

    ArmorMaterial EMERALD = register(
            Constants.Armor.EMERALD_ARMOR,
            231,
            toMap(3, 6, 8, 3, 5),
            11,
            SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
            0.0F,
            0.0F,
            Constants.Tag.REPAIRS_EMERALD_ARMOR);

    ArmorMaterial LEAD = register(
            Constants.Armor.LEAD_ARMOR,
            132,
            toMap(4, 6, 8, 3, 5),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_TURTLE,
            1.0F,
            0.18F,
            Constants.Tag.REPAIRS_LEAD_ARMOR);

    ArmorMaterial QUARTZ = register(
            Constants.Armor.QUARTZ_ARMOR,
            242,
            toMap(2, 6, 8, 3, 4),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
            1.0F,
            0.1F,
            Constants.Tag.REPAIRS_QUARTZ_ARMOR);

    ArmorMaterial REDSTONE = register(
            Constants.Armor.REDSTONE_ARMOR,
            154,
            toMap(2, 4, 6, 3, 4),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            1.0F,
            0.1F,
            Constants.Tag.REPAIRS_REDSTONE_ARMOR);

    ArmorMaterial LAVA = register(
            Constants.Armor.LAVA_ARMOR,
            154,
            toMap(2, 6, 8, 5, 12),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            2.0F,
            0.2F,
            Constants.Tag.REPAIRS_LAVA_ARMOR);

    static Identifier of(String name) {
        return Identifier.of(MOD_ID, name);
    }

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
            String name,
            int durability,
            EnumMap<EquipmentType, Integer> defenseMap,
            int enchantmentValue,
            RegistryEntry<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            TagKey<Item> repairIngredient
    ) {
        return create(
                durability,
                defenseMap,
                enchantmentValue,
                equipSound,
                toughness,
                knockbackResistance,
                repairIngredient,
                of(name)
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
            Identifier key
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
                key
        );
    }
}
