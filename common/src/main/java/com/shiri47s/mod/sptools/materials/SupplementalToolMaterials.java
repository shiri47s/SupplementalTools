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
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public enum SupplementalToolMaterials implements ToolMaterial {

    Bronze(1, 172, 5.0F, 1.5F, 5, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    IRONCOPPER(2, 255, 7.0F, 2.0F, 7, () -> Ingredient.ofItems(Items.IRON_INGOT, Items.COPPER_INGOT)),
    AMETHYST(3, 255, 8.0F, 3.0F, 14, () -> Ingredient.ofItems(Instances.Item.AMETHYST_INGOT)),
    EMERALD(3, 1000, 8.5F, 3.5F, 12, () -> Ingredient.ofItems(Instances.Item.EMERALD_INGOT)),
    LEAD(3, 153, 7.5F, 3.0F, 3, () -> Ingredient.ofItems(Instances.Item.LEAD_INGOT));

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

    @SuppressWarnings("unused")
    public @Nullable TagKey<Item> getTag() {
        return switch (this) {
            case Bronze -> TagKey.of(RegistryKeys.ITEM, new Identifier(Constants.MOD_ID, Constants.Tag.Bronzes));
            case IRONCOPPER -> TagKey.of(RegistryKeys.ITEM, new Identifier(Constants.MOD_ID, Constants.Tag.IRONCOPPERS));
            case EMERALD -> TagKey.of(RegistryKeys.ITEM, new Identifier(Constants.MOD_ID, Constants.Tag.EMERALDS));
            case AMETHYST -> TagKey.of(RegistryKeys.ITEM, new Identifier(Constants.MOD_ID, Constants.Tag.AMETHYSTS));
            case LEAD -> TagKey.of(RegistryKeys.ITEM, new Identifier(Constants.MOD_ID, Constants.Tag.LEAD));
        };
    }
}
