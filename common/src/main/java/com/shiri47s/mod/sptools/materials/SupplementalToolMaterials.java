package com.shiri47s.mod.sptools.materials;

import com.shiri47s.mod.sptools.Constants;
import com.shiri47s.mod.sptools.Instances;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.Lazy;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public enum SupplementalToolMaterials implements ToolMaterial {

    COPPER(1, 172, 5.0F, 1.5F, 5, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    IRONCOPPER(2, 255, 7.0F, 2.0F, 7, () -> Ingredient.ofItems(Items.IRON_INGOT, Items.COPPER_INGOT)),
    AMETHYST(3, 255, 8.0F, 3.0F, 14, () -> Ingredient.ofItems(Instances.Item.AMETHYST_INGOT)),
    EMERALD(3, 1000, 8.5F, 3.5F, 12, () -> Ingredient.ofItems(Items.DIAMOND));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredientSupplier;

    SupplementalToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredientSupplier = repairIngredient;
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredientSupplier.get();
    }

    public @Nullable TagKey<Item> getTag() {
        return switch (this) {
            case COPPER -> TagKey.of(RegistryKeys.ITEM, new Identifier(Constants.MOD_ID, Constants.Tag.COPPERS));
            case IRONCOPPER ->
                    TagKey.of(RegistryKeys.ITEM, new Identifier(Constants.MOD_ID, Constants.Tag.IRONCOPPERS));
            default -> throw new UnsupportedOperationException();
        };
    }
}
