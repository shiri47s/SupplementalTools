package com.shiri47s.mod.sptools.materials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IronCopperToolsMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 232;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.5F;
    }

    @Override
    public float getAttackDamage() {
        return 1.5F;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 14;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.IRON_INGOT, Items.COPPER_INGOT);
    }
}
