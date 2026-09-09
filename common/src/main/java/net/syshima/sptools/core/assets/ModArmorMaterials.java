package net.syshima.sptools.core.assets;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Holder;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.syshima.sptools.ModTags;

import java.util.EnumMap;

public interface ModArmorMaterials {
    ArmorMaterial BRONZE = register(
            132,
            toMap(2, 4, 4, 2, 5),
            9,
            SoundEvents.ARMOR_EQUIP_GENERIC,
            0.0F,
            0.0F,
            ModTags.REPAIRS_BRONZE_ARMOR,
            ModEquipmentAssets.BRONZE_ARMOR);

    ArmorMaterial IRONCOPPER = register(
            121,
            toMap(2, 4, 5, 3, 5),
            11,
            SoundEvents.ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            ModTags.REPAIRS_IRONCOPPER_ARMOR,
            ModEquipmentAssets.IRONCOPPER_ARMOR);

    ArmorMaterial AMETHYST = register(
            181,
            toMap(3, 5, 8, 3, 5),
            11,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            0.0F,
            0.0F,
            ModTags.REPAIRS_AMETHYST_ARMOR,
            ModEquipmentAssets.AMETHYST_ARMOR);

    ArmorMaterial EMERALD = register(
            231,
            toMap(3, 6, 8, 3, 5),
            11,
            SoundEvents.ARMOR_EQUIP_CHAIN,
            0.0F,
            0.0F,
            ModTags.REPAIRS_EMERALD_ARMOR,
            ModEquipmentAssets.EMERALD_ARMOR);

    ArmorMaterial LEAD = register(
            132,
            toMap(4, 6, 8, 3, 5),
            5,
            SoundEvents.ARMOR_EQUIP_TURTLE,
            1.0F,
            0.18F,
            ModTags.REPAIRS_LEAD_ARMOR,
            ModEquipmentAssets.LEAD_ARMOR);

    ArmorMaterial QUARTZ = register(
            242,
            toMap(2, 6, 8, 3, 4),
            5,
            SoundEvents.ARMOR_EQUIP_GOLD,
            1.0F,
            0.1F,
            ModTags.REPAIRS_QUARTZ_ARMOR,
            ModEquipmentAssets.QUARTZ_ARMOR);

    ArmorMaterial REDSTONE = register(
            154,
            toMap(2, 4, 6, 3, 4),
            5,
            SoundEvents.ARMOR_EQUIP_IRON,
            1.0F,
            0.1F,
            ModTags.REPAIRS_REDSTONE_ARMOR,
            ModEquipmentAssets.REDSTONE_ARMOR);

    ArmorMaterial LAVA = register(
            154,
            toMap(2, 6, 8, 5, 12),
            5,
            SoundEvents.ARMOR_EQUIP_NETHERITE,
            2.0F,
            0.2F,
            ModTags.REPAIRS_LAVA_ARMOR,
            ModEquipmentAssets.LAVA_ARMOR);

    private static EnumMap<ArmorType, Integer> toMap(int boots, int leggings, int chestplate, int helmet, int body) {
        EnumMap<ArmorType, Integer> defense = new EnumMap<>(ArmorType.class);
        defense.put(ArmorType.BOOTS, boots);
        defense.put(ArmorType.LEGGINGS, leggings);
        defense.put(ArmorType.CHESTPLATE, chestplate);
        defense.put(ArmorType.HELMET, helmet);
        defense.put(ArmorType.BODY, body);
        return defense;
    }

    private static ArmorMaterial register(
            int durability,
            EnumMap<ArmorType, Integer> defense,
            int enchantmentValue,
            Holder<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            TagKey<Item> repairIngredient,
            ResourceKey<EquipmentAsset> assets
    ) {
        // toMap covers every ArmorType; assert that here so a new vanilla armour slot
        // surfaces as a clear failure rather than a null unboxing later on.
        for (ArmorType type : ArmorType.values()) {
            if (!defense.containsKey(type)) {
                throw new IllegalStateException("Missing defense value for armor type " + type);
            }
        }

        return new ArmorMaterial(
                durability,
                defense,
                enchantmentValue,
                equipSound,
                toughness,
                knockbackResistance,
                repairIngredient,
                assets
        );
    }
}
