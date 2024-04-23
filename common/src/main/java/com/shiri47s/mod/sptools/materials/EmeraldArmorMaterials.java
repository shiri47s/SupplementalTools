package com.shiri47s.mod.sptools.materials;

import com.shiri47s.mod.sptools.Constants;
import com.shiri47s.mod.sptools.Instances;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.HashMap;

public class EmeraldArmorMaterials implements ArmorMaterial {
    public static final EmeraldArmorMaterials INSTANCE = new EmeraldArmorMaterials();

    private static final HashMap<ArmorItem.Type, Integer> DURABILITIES = new HashMap<>()
    {
        {
            put(ArmorItem.Type.HELMET, 350);
            put(ArmorItem.Type.CHESTPLATE, 500);
            put(ArmorItem.Type.LEGGINGS, 470);
            put(ArmorItem.Type.BOOTS, 310);
        }
    };

    private static final HashMap<ArmorItem.Type, Integer> PROTECTIONS = new HashMap<>()
    {
        {
            put(ArmorItem.Type.HELMET, 3);
            put(ArmorItem.Type.CHESTPLATE, 8);
            put(ArmorItem.Type.LEGGINGS, 6);
            put(ArmorItem.Type.BOOTS, 3);
        }
    };

    @Override
    public int getDurability(ArmorItem.Type type) {
        return DURABILITIES.get(type);
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return PROTECTIONS.get(type);
    }

    @Override
    public int getEnchantability() {
        return 14;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Instances.Item.EMERALD_INGOT);
    }

    @Override
    public String getName() {
        return Constants.Armor.EMERALD_ARMOR;
    }

    @Override
    public float getToughness() {
        return 1.5F;
    }

    @Override
    public float getKnockbackResistance() {
        return 1.5F;
    }
}
