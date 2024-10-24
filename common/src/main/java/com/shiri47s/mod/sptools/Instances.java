package com.shiri47s.mod.sptools;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.Objects;

import static com.shiri47s.mod.sptools.Constants.MOD_ID;

public class Instances {
    public static class Effect {
        public static final StatusEffect KNOCKBACK_RESISTANCE = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.KNOCKBACK_RESISTANCE)));
        public static final StatusEffect ATTACK_KNOCKBACK = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.ATTACK_KNOCKBACK)));
        public static final StatusEffect MOVEMENT_SPEED = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.MOVEMENT_SPEED)));
        public static final StatusEffect HASTE_AND_LUCK = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.HASTE_AND_LUCK)));
        public static final StatusEffect HEAVY = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.HEAVY)));
        public static final StatusEffect BOUNDED_GLOWING = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.BOUNDED_GLOWING)));
        public static final StatusEffect REDSTONE_OVERFLOW = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.REDSTONE_OVERFLOW)));
        public static final StatusEffect ANTI_LAVA = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.ANTI_LAVA)));
    }

    public static class Item {
        public static final net.minecraft.item.Item AMETHYST_INGOT = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Item.AMETHYST_INGOT)));
        public static final net.minecraft.item.Item EMERALD_INGOT = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Item.EMERALD_INGOT)));
        public static final net.minecraft.item.Item LEAD_INGOT = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Item.LEAD_INGOT)));
        public static final net.minecraft.item.Item BRONZE_INGOT = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Item.BRONZE_INGOT)));
        public static final net.minecraft.item.Item QUARTZ_INGOT = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Item.QUARTZ_INGOT)));
        public static final net.minecraft.item.Item REDSTONE_INGOT = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Item.REDSTONE_INGOT)));
        public static final net.minecraft.item.Item RED_DIAMOND_INGOT = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Item.RED_DIAMOND_INGOT)));
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

        public static final net.minecraft.item.Item QUARTZ_HELMET = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.QUARTZ_HELMET)));
        public static final net.minecraft.item.Item QUARTZ_CHESTPLATE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.QUARTZ_CHESTPLATE)));
        public static final net.minecraft.item.Item QUARTZ_LEGGINGS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.QUARTZ_LEGGINGS)));
        public static final net.minecraft.item.Item QUARTZ_BOOTS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.QUARTZ_BOOTS)));

        public static final net.minecraft.item.Item REDSTONE_HELMET = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.REDSTONE_HELMET)));
        public static final net.minecraft.item.Item REDSTONE_CHESTPLATE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.REDSTONE_CHESTPLATE)));
        public static final net.minecraft.item.Item REDSTONE_LEGGINGS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.REDSTONE_LEGGINGS)));
        public static final net.minecraft.item.Item REDSTONE_BOOTS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.REDSTONE_BOOTS)));

        public static final net.minecraft.item.Item LAVA_HELMET = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.LAVA_HELMET)));
        public static final net.minecraft.item.Item LAVA_CHESTPLATE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.LAVA_CHESTPLATE)));
        public static final net.minecraft.item.Item LAVA_LEGGINGS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.LAVA_LEGGINGS)));
        public static final net.minecraft.item.Item LAVA_BOOTS = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Armor.LAVA_BOOTS)));
    }

    @SuppressWarnings("unused")
    public static class TOOL {
        public static final net.minecraft.item.Item BRONZE_SWORD = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.BRONZE_SWORD)));
        public static final net.minecraft.item.Item BRONZE_AXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.BRONZE_AXE)));
        public static final net.minecraft.item.Item BRONZE_PICKAXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.BRONZE_PICKAXE)));
        public static final net.minecraft.item.Item BRONZE_SHOVEL = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.BRONZE_SHOVEL)));
        public static final net.minecraft.item.Item BRONZE_HOE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.BRONZE_HOE)));

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

        public static final net.minecraft.item.Item QUARTZ_SWORD = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.QUARTZ_SWORD)));
        public static final net.minecraft.item.Item QUARTZ_AXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.QUARTZ_AXE)));
        public static final net.minecraft.item.Item QUARTZ_PICKAXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.QUARTZ_PICKAXE)));
        public static final net.minecraft.item.Item QUARTZ_SHOVEL = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.QUARTZ_SHOVEL)));
        public static final net.minecraft.item.Item QUARTZ_HOE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.QUARTZ_HOE)));

        public static final net.minecraft.item.Item REDSTONE_SWORD = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.REDSTONE_SWORD)));
        public static final net.minecraft.item.Item REDSTONE_AXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.REDSTONE_AXE)));
        public static final net.minecraft.item.Item REDSTONE_PICKAXE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.REDSTONE_PICKAXE)));
        public static final net.minecraft.item.Item REDSTONE_SHOVEL = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.REDSTONE_SHOVEL)));
        public static final net.minecraft.item.Item REDSTONE_HOE = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Tool.REDSTONE_HOE)));
    }

    public static class Block {
        public static final net.minecraft.block.Block LEAD_ORE = Objects.requireNonNull(Registries.BLOCK.get(new Identifier(MOD_ID, Constants.Block.LEAD_ORE)));
        public static final net.minecraft.block.Block RED_DIAMOND_ORE = Objects.requireNonNull(Registries.BLOCK.get(new Identifier(MOD_ID, Constants.Block.RED_DIAMOND_ORE)));
        public static final net.minecraft.block.Block DEEPSLATE_RED_DIAMOND_ORE = Objects.requireNonNull(Registries.BLOCK.get(new Identifier(MOD_ID, Constants.Block.DEEPSLATE_RED_DIAMOND_ORE)));
    }
}
