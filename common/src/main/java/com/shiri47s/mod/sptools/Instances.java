package com.shiri47s.mod.sptools;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.Objects;

import static com.shiri47s.mod.sptools.Constants.MOD_ID;

public class Instances {
    //public static final ItemGroup Group = Objects.requireNonNull(Registries.ITEM_GROUP.get(new Identifier(MOD_ID, MOD_ID)));

    public static class Effect {
        public static final StatusEffect KNOCKBACK_RESISTANCE = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.KNOCKBACK_RESISTANCE)));
        public static final StatusEffect ATTACK_KNOCKBACK = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.ATTACK_KNOCKBACK)));
        public static final StatusEffect MOVEMENT_SPEED = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.MOVEMENT_SPEED)));
        public static final StatusEffect HASTE_AND_LUCK = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.HASTE_AND_LUCK)));
        public static final StatusEffect HEAVY = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.HEAVY)));
    }

    public static class Item {
        public static final net.minecraft.item.Item AMETHYST_INGOT = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Item.AMETHYST_INGOT)));
        public static final net.minecraft.item.Item EMERALD_INGOT = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Item.EMERALD_INGOT)));
        public static final net.minecraft.item.Item LEAD_INGOT = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Item.LEAD_INGOT)));
        public static final net.minecraft.item.Item BRONZE_INGOT = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Item.BRONZE_INGOT)));
    }

    @SuppressWarnings("unused")
    public static class ARMOR {
        public static final net.minecraft.item.Item COPPER_HELMET = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.BRONZE_HELMET)));
        public static final net.minecraft.item.Item COPPER_CHESTPLATE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.BRONZE_CHESTPLATE)));
        public static final net.minecraft.item.Item COPPER_LEGGINGS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.BRONZE_LEGGINGS)));
        public static final net.minecraft.item.Item COPPER_BOOTS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.BRONZE_BOOTS)));

        public static final net.minecraft.item.Item IRONCOPPER_HELMET = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.IRONCOPPER_HELMET)));
        public static final net.minecraft.item.Item IRONCOPPER_CHESTPLATE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.IRONCOPPER_CHESTPLATE)));
        public static final net.minecraft.item.Item IRONCOPPER_LEGGINGS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.IRONCOPPER_LEGGINGS)));
        public static final net.minecraft.item.Item IRONCOPPER_BOOTS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.IRONCOPPER_BOOTS)));

        public static final net.minecraft.item.Item AMETHYST_HELMET = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.AMETHYST_HELMET)));
        public static final net.minecraft.item.Item AMETHYST_CHESTPLATE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.AMETHYST_CHESTPLATE)));
        public static final net.minecraft.item.Item AMETHYST_LEGGINGS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.AMETHYST_LEGGINGS)));
        public static final net.minecraft.item.Item AMETHYST_BOOTS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.AMETHYST_BOOTS)));

        public static final net.minecraft.item.Item EMERALD_HELMET = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.EMERALD_HELMET)));
        public static final net.minecraft.item.Item EMERALD_CHESTPLATE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.EMERALD_CHESTPLATE)));
        public static final net.minecraft.item.Item EMERALD_LEGGINGS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.EMERALD_LEGGINGS)));
        public static final net.minecraft.item.Item EMERALD_BOOTS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.EMERALD_BOOTS)));

        public static final net.minecraft.item.Item LEAD_HELMET = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.LEAD_HELMET)));
        public static final net.minecraft.item.Item LEAD_CHESTPLATE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.LEAD_CHESTPLATE)));
        public static final net.minecraft.item.Item LEAD_LEGGINGS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.LEAD_LEGGINGS)));
        public static final net.minecraft.item.Item LEAD_BOOTS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.LEAD_BOOTS)));
    }

    @SuppressWarnings("unused")
    public static class TOOL {
        public static final net.minecraft.item.Item COPPER_SWORD = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.BRONZE_SWORD)));
        public static final net.minecraft.item.Item COPPER_AXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.BRONZE_AXE)));
        public static final net.minecraft.item.Item COPPER_PICKAXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.BRONZE_PICKAXE)));
        public static final net.minecraft.item.Item COPPER_SHOVEL = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.BRONZE_SHOVEL)));
        public static final net.minecraft.item.Item COPPER_HOE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.BRONZE_HOE)));

        public static final net.minecraft.item.Item IRONCOPPER_SWORD = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.IRONCOPPER_SWORD)));
        public static final net.minecraft.item.Item IRONCOPPER_AXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.IRONCOPPER_AXE)));
        public static final net.minecraft.item.Item IRONCOPPER_PICKAXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.IRONCOPPER_PICKAXE)));
        public static final net.minecraft.item.Item IRONCOPPER_SHOVEL = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.IRONCOPPER_SHOVEL)));
        public static final net.minecraft.item.Item IRONCOPPER_HOE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.IRONCOPPER_HOE)));

        public static final net.minecraft.item.Item AMETHYST_SWORD = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.AMETHYST_SWORD)));
        public static final net.minecraft.item.Item AMETHYST_AXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.AMETHYST_AXE)));
        public static final net.minecraft.item.Item AMETHYST_PICKAXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.AMETHYST_PICKAXE)));
        public static final net.minecraft.item.Item AMETHYST_SHOVEL = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.AMETHYST_SHOVEL)));
        public static final net.minecraft.item.Item AMETHYST_HOE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.AMETHYST_HOE)));

        public static final net.minecraft.item.Item EMERALD_SWORD = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.EMERALD_SWORD)));
        public static final net.minecraft.item.Item EMERALD_AXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.EMERALD_AXE)));
        public static final net.minecraft.item.Item EMERALD_PICKAXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.EMERALD_PICKAXE)));
        public static final net.minecraft.item.Item EMERALD_SHOVEL = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.EMERALD_SHOVEL)));
        public static final net.minecraft.item.Item EMERALD_HOE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.EMERALD_HOE)));

        public static final net.minecraft.item.Item LEAD_SWORD = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.LEAD_SWORD)));
        public static final net.minecraft.item.Item LEAD_AXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.LEAD_AXE)));
        public static final net.minecraft.item.Item LEAD_PICKAXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.LEAD_PICKAXE)));
        public static final net.minecraft.item.Item LEAD_SHOVEL = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.LEAD_SHOVEL)));
        public static final net.minecraft.item.Item LEAD_HOE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.LEAD_HOE)));
    }

    public static class Block {
        public static final net.minecraft.block.Block LEAD_ORE = Objects.requireNonNull(Registries.BLOCK.get(new Identifier(MOD_ID, Constants.Block.LEAD_ORE)));
    }
}
