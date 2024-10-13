package com.shiri47s.mod.sptools.materials;

import com.shiri47s.mod.sptools.Constants;
import com.shiri47s.mod.sptools.Instances;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.HashMap;

public class QuartzArmorMaterials implements ArmorMaterial {
    public static final QuartzArmorMaterials INSTANCE = new QuartzArmorMaterials();

    private static final HashMap<ArmorItem.Type, Integer> DURABILITIES = new HashMap<>()
    {
        {
            put(ArmorItem.Type.HELMET, 242);
            put(ArmorItem.Type.CHESTPLATE, 352);
            put(ArmorItem.Type.LEGGINGS, 330);
            put(ArmorItem.Type.BOOTS, 286);
        }
    };

    private static final HashMap<ArmorItem.Type, Integer> PROTECTIONS = new HashMap<>()
    {
        {
            put(ArmorItem.Type.HELMET, 3);
            put(ArmorItem.Type.CHESTPLATE, 8);
            put(ArmorItem.Type.LEGGINGS, 6);
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
        return Ingredient.ofItems(Instances.Item.AMETHYST_INGOT);
    }

    @Override
    public String getName() {
        return Constants.Armor.AMETHYST_ARMOR;
    }

    @Override
    public float getToughness() {
        return 1.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 1.8F;
    }
}
