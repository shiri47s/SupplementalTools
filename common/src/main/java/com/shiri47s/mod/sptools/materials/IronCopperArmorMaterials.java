package com.shiri47s.mod.sptools.materials;

import com.shiri47s.mod.sptools.Constants;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.HashMap;

public class IronCopperArmorMaterials implements ArmorMaterial {
    public static final IronCopperArmorMaterials INSTANCE = new IronCopperArmorMaterials();

    private static final HashMap<ArmorItem.Type, Integer> DURABILITIES = new HashMap<>()
    {
        {
            put(ArmorItem.Type.HELMET, 165);
            put(ArmorItem.Type.CHESTPLATE, 240);
            put(ArmorItem.Type.LEGGINGS, 225);
            put(ArmorItem.Type.BOOTS, 195);
        }
    };

    private static final HashMap<ArmorItem.Type, Integer> PROTECTIONS = new HashMap<>()
    {
        {
            put(ArmorItem.Type.HELMET, 3);
            put(ArmorItem.Type.CHESTPLATE, 5);
            put(ArmorItem.Type.LEGGINGS, 4);
            put(ArmorItem.Type.BOOTS, 2);
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
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }

    @Override
    public String getName() {
        return Constants.Armor.IRONCOPPER_ARMOR;
    }

    @Override
    public float getToughness() {
        return 0;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }}
