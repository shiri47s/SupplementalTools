package com.shiri47s.mod.sptools.materials;

import com.shiri47s.mod.sptools.Constants;
import com.shiri47s.mod.sptools.Instances;
import net.minecraft.block.Block;
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

    Bronze(172, 5.0F, 1.5F, 5, () -> Ingredient.ofItems(Items.COPPER_INGOT), Constants.Tag.INCORRECT_FOR_BRONZE_TOOL),
    IRONCOPPER(255, 7.0F, 2.0F, 7, () -> Ingredient.ofItems(Items.IRON_INGOT, Items.COPPER_INGOT), Constants.Tag.INCORRECT_FOR_IRONCOPPER_TOOL),
    AMETHYST(255, 8.0F, 3.0F, 14, () -> Ingredient.ofItems(Instances.Item.AMETHYST_INGOT), Constants.Tag.INCORRECT_FOR_AMETHYST_TOOL),
    EMERALD(1000, 8.5F, 3.5F, 12, () -> Ingredient.ofItems(Instances.Item.EMERALD_INGOT), Constants.Tag.INCORRECT_FOR_EMERALD_TOOL),
    LEAD(153, 7.5F, 3.0F, 3, () -> Ingredient.ofItems(Instances.Item.LEAD_INGOT), Constants.Tag.INCORRECT_FOR_LEAD_TOOL);

    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredientSupplier;
    private final TagKey<Block> inverseTag;

    SupplementalToolMaterials(int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient, TagKey<Block> inverseTag) {
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredientSupplier = repairIngredient;
        this.inverseTag = inverseTag;
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

    @Override
    public TagKey<Block> getInverseTag() {
        return inverseTag;
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
