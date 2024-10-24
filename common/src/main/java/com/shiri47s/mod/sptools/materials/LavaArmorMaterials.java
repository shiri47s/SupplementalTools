package com.shiri47s.mod.sptools.materials;

import com.shiri47s.mod.sptools.Constants;
import com.shiri47s.mod.sptools.Instances;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.HashMap;

public class LavaArmorMaterials implements ArmorMaterial {
    public static final LavaArmorMaterials INSTANCE = new LavaArmorMaterials();

    private static final HashMap<ArmorItem.Type, Integer> DURABILITIES = new HashMap<>()
    {
        {
            put(ArmorItem.Type.HELMET, 440);
            put(ArmorItem.Type.CHESTPLATE, 640);
            put(ArmorItem.Type.LEGGINGS, 600);
            put(ArmorItem.Type.BOOTS, 520);
        }
    };

    private static final HashMap<ArmorItem.Type, Integer> PROTECTIONS = new HashMap<>()
    {
        {
            put(ArmorItem.Type.HELMET, 5);
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
        return 15;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Instances.Item.RED_DIAMOND_INGOT);
    }

    @Override
    public String getName() {
        return Constants.Armor.LAVA_ARMOR;
    }

    @Override
    public float getToughness() {
        return 2.0F;
    }

    @Override
    public float getKnockbackResistance() {
        return 2.0F;
    }
}
