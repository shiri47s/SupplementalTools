package com.shiri47s.mod.sptools;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class Constants {
    public static final String MOD_ID = "sptools";
    public static final String PREFIX =  "sp_";

    public static class Tag {
        public static final String Bronzes = "bronzes";
        public static final String IRONCOPPERS = "ironcoppers";
        public static final String AMETHYSTS = "amethysts";
        public static final String EMERALDS = "emerald";
        public static final String LEAD = "lead";
        public static final String QUARTZ = "quartz";
        public static final String REDSTONE = "redstone";
        public static final TagKey<net.minecraft.block.Block> INCORRECT_FOR_BRONZE_TOOL = ofBlock("incorrect_for_bronze_tool");
        public static final TagKey<net.minecraft.block.Block> INCORRECT_FOR_IRONCOPPER_TOOL = ofBlock("incorrect_for_ironcopper_tool");
        public static final TagKey<net.minecraft.block.Block> INCORRECT_FOR_AMETHYST_TOOL = ofBlock("incorrect_for_amethyst_tool");
        public static final TagKey<net.minecraft.block.Block> INCORRECT_FOR_EMERALD_TOOL = ofBlock("incorrect_for_emerald_tool");
        public static final TagKey<net.minecraft.block.Block> INCORRECT_FOR_LEAD_TOOL = ofBlock("incorrect_for_lead_tool");
        public static final TagKey<net.minecraft.block.Block> INCORRECT_FOR_QUARTZ_TOOL = ofBlock("incorrect_for_quartz_tool");
        public static final TagKey<net.minecraft.block.Block> INCORRECT_FOR_REDSTONE_TOOL = ofBlock("incorrect_for_redstone_tool");
        public static final TagKey<net.minecraft.item.Item> BRONZE_TOOL_MATERIALS = ofItem("bronze_tool_materials");
        public static final TagKey<net.minecraft.item.Item> IRONCOPPER_TOOL_MATERIALS = ofItem("ironcopper_tool_materials");
        public static final TagKey<net.minecraft.item.Item> AMETHYST_TOOL_MATERIALS = ofItem("amethyst_tool_materials");
        public static final TagKey<net.minecraft.item.Item> EMERALD_TOOL_MATERIALS = ofItem("emerald_tool_materials");
        public static final TagKey<net.minecraft.item.Item> LEAD_TOOL_MATERIALS = ofItem("lead_tool_materials");
        public static final TagKey<net.minecraft.item.Item> QUARTZ_TOOL_MATERIALS = ofItem("quartz_tool_materials");
        public static final TagKey<net.minecraft.item.Item> REDSTONE_TOOL_MATERIALS = ofItem("redstone_tool_materials");
        public static final TagKey<net.minecraft.item.Item> REPAIRS_BRONZE_ARMOR = ofItem("repairs_bronze_armor");
        public static final TagKey<net.minecraft.item.Item> REPAIRS_IRONCOPPER_ARMOR = ofItem("repairs_ironcopper_armor");
        public static final TagKey<net.minecraft.item.Item> REPAIRS_AMETHYST_ARMOR = ofItem("repairs_amethyst_armor");
        public static final TagKey<net.minecraft.item.Item> REPAIRS_EMERALD_ARMOR = ofItem("repairs_emerald_armor");
        public static final TagKey<net.minecraft.item.Item> REPAIRS_LEAD_ARMOR = ofItem("repairs_lead_armor");
        public static final TagKey<net.minecraft.item.Item> REPAIRS_QUARTZ_ARMOR = ofItem("repairs_quartz_armor");
        public static final TagKey<net.minecraft.item.Item> REPAIRS_REDSTONE_ARMOR = ofItem("repairs_redstone_armor");
        public static final TagKey<net.minecraft.item.Item> REPAIRS_LAVA_ARMOR = ofItem("repairs_lava_armor");

        private static TagKey<net.minecraft.block.Block> ofBlock(String id) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(id));
        }

        private static TagKey<net.minecraft.item.Item> ofItem(String id) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(id));
        }
    }

    public static class Item {
        public static final String BRONZE_INGOT = PREFIX + "bronze_ingot";
        public static final String AMETHYST_INGOT = PREFIX + "amethyst_ingot";
        public static final String EMERALD_INGOT = PREFIX + "emerald_ingot";
        public static final String LEAD_INGOT = PREFIX + "lead_ingot";
        public static final String RAW_LEAD = PREFIX + "raw_lead";
        public static final String LEAD_ORE = PREFIX + "lead_ore";
        public static final String QUARTZ_INGOT = PREFIX + "quartz_ingot";
        public static final String QUARTZ_SCRAP = PREFIX + "quartz_scrap";
        public static final String REDSTONE_INGOT = PREFIX + "redstone_ingot";
        public static final String RED_DIAMOND = PREFIX + "red_diamond";
        public static final String RED_DIAMOND_ORE = PREFIX + "red_diamond_ore";
        public static final String DEEPSLATE_RED_DIAMOND_ORE = "deepslate_" + PREFIX + "red_diamond_ore";
        public static final String RED_DIAMOND_INGOT = PREFIX + "red_diamond_ingot";
        public static final String LAVA_SMITHING_TEMPLATE = PREFIX + "lava_upgrade_smithing_template";
    }

    public static class Armor {
        public static final String BRONZE_ARMOR = PREFIX + "bronze_armor";
        public static final String BRONZE_HELMET = PREFIX + "bronze_helmet";
        public static final String BRONZE_CHESTPLATE = PREFIX + "bronze_chestplate";
        public static final String BRONZE_LEGGINGS = PREFIX + "bronze_leggings";
        public static final String BRONZE_BOOTS = PREFIX + "bronze_boots";

        public static final String IRONCOPPER_ARMOR = PREFIX + "ironcopper_armor";
        public static final String IRONCOPPER_HELMET = PREFIX + "ironcopper_helmet";
        public static final String IRONCOPPER_CHESTPLATE = PREFIX + "ironcopper_chestplate";
        public static final String IRONCOPPER_LEGGINGS = PREFIX + "ironcopper_leggings";
        public static final String IRONCOPPER_BOOTS = PREFIX + "ironcopper_boots";

        public static final String AMETHYST_ARMOR = PREFIX + "amethyst_armor";
        public static final String AMETHYST_HELMET = PREFIX + "amethyst_helmet";
        public static final String AMETHYST_CHESTPLATE = PREFIX + "amethyst_chestplate";
        public static final String AMETHYST_LEGGINGS = PREFIX + "amethyst_leggings";
        public static final String AMETHYST_BOOTS = PREFIX + "amethyst_boots";

        public static final String EMERALD_ARMOR = PREFIX + "emerald_armor";
        public static final String EMERALD_HELMET = PREFIX + "emerald_helmet";
        public static final String EMERALD_CHESTPLATE = PREFIX + "emerald_chestplate";
        public static final String EMERALD_LEGGINGS = PREFIX + "emerald_leggings";
        public static final String EMERALD_BOOTS = PREFIX + "emerald_boots";

        public static final String LEAD_ARMOR = PREFIX + "lead_armor";
        public static final String LEAD_HELMET = PREFIX + "lead_helmet";
        public static final String LEAD_CHESTPLATE = PREFIX + "lead_chestplate";
        public static final String LEAD_LEGGINGS = PREFIX + "lead_leggings";
        public static final String LEAD_BOOTS = PREFIX + "lead_boots";

        public static final String QUARTZ_ARMOR = PREFIX + "quartz_armor";
        public static final String QUARTZ_HELMET = PREFIX + "quartz_helmet";
        public static final String QUARTZ_CHESTPLATE = PREFIX + "quartz_chestplate";
        public static final String QUARTZ_LEGGINGS = PREFIX + "quartz_leggings";
        public static final String QUARTZ_BOOTS = PREFIX + "quartz_boots";

        public static final String REDSTONE_ARMOR = PREFIX + "redstone_armor";
        public static final String REDSTONE_HELMET = PREFIX + "redstone_helmet";
        public static final String REDSTONE_CHESTPLATE = PREFIX + "redstone_chestplate";
        public static final String REDSTONE_LEGGINGS = PREFIX + "redstone_leggings";
        public static final String REDSTONE_BOOTS = PREFIX + "redstone_boots";

        public static final String LAVA_ARMOR = PREFIX + "lava_armor";
        public static final String LAVA_HELMET = PREFIX + "lava_helmet";
        public static final String LAVA_CHESTPLATE = PREFIX + "lava_chestplate";
        public static final String LAVA_LEGGINGS = PREFIX + "lava_leggings";
        public static final String LAVA_BOOTS = PREFIX + "lava_boots";
    }

    public static class Tool {
        public static final String BRONZE_SWORD = PREFIX + "bronze_sword";
        public static final String BRONZE_AXE = PREFIX + "bronze_axe";
        public static final String BRONZE_SHOVEL = PREFIX + "bronze_shovel";
        public static final String BRONZE_PICKAXE = PREFIX + "bronze_pickaxe";
        public static final String BRONZE_HOE = PREFIX + "bronze_hoe";

        public static final String IRONCOPPER_SWORD = PREFIX + "ironcopper_sword";
        public static final String IRONCOPPER_AXE = PREFIX + "ironcopper_axe";
        public static final String IRONCOPPER_SHOVEL = PREFIX + "ironcopper_shovel";
        public static final String IRONCOPPER_PICKAXE = PREFIX + "ironcopper_pickaxe";
        public static final String IRONCOPPER_HOE = PREFIX + "ironcopper_hoe";

        public static final String AMETHYST_SWORD = PREFIX + "amethyst_sword";
        public static final String AMETHYST_AXE = PREFIX + "amethyst_axe";
        public static final String AMETHYST_SHOVEL = PREFIX + "amethyst_shovel";
        public static final String AMETHYST_PICKAXE = PREFIX + "amethyst_pickaxe";
        public static final String AMETHYST_HOE = PREFIX + "amethyst_hoe";

        public static final String EMERALD_SWORD = PREFIX + "emerald_sword";
        public static final String EMERALD_AXE = PREFIX + "emerald_axe";
        public static final String EMERALD_SHOVEL = PREFIX + "emerald_shovel";
        public static final String EMERALD_PICKAXE = PREFIX + "emerald_pickaxe";
        public static final String EMERALD_HOE = PREFIX + "emerald_hoe";

        public static final String LEAD_SWORD = PREFIX + "lead_sword";
        public static final String LEAD_AXE = PREFIX + "lead_axe";
        public static final String LEAD_SHOVEL = PREFIX + "lead_shovel";
        public static final String LEAD_PICKAXE = PREFIX + "lead_pickaxe";
        public static final String LEAD_HOE = PREFIX + "lead_hoe";

        public static final String QUARTZ_SWORD = PREFIX + "quartz_sword";
        public static final String QUARTZ_AXE = PREFIX + "quartz_axe";
        public static final String QUARTZ_SHOVEL = PREFIX + "quartz_shovel";
        public static final String QUARTZ_PICKAXE = PREFIX + "quartz_pickaxe";
        public static final String QUARTZ_HOE = PREFIX + "quartz_hoe";

        public static final String REDSTONE_SWORD = PREFIX + "redstone_sword";
        public static final String REDSTONE_AXE = PREFIX + "redstone_axe";
        public static final String REDSTONE_SHOVEL = PREFIX + "redstone_shovel";
        public static final String REDSTONE_PICKAXE = PREFIX + "redstone_pickaxe";
        public static final String REDSTONE_HOE = PREFIX + "redstone_hoe";
    }

    public static class Block {
        public static final String LEAD_ORE = PREFIX + "lead_ore";
        public static final String RED_DIAMOND_ORE = PREFIX + "red_diamond_ore";
        public static final String DEEPSLATE_RED_DIAMOND_ORE = "deepslate_" + PREFIX + "red_diamond_ore";
    }

    public static class Effect {
        public static final String KNOCKBACK_RESISTANCE = PREFIX + "knockback_resistance";
        public static final String ATTACK_KNOCKBACK = PREFIX + "attack_knockback";
        public static final String MOVEMENT_SPEED = PREFIX + "movement_speed";
        public static final String HASTE_AND_LUCK = PREFIX + "haste_and_luck";
        public static final String HEAVY = PREFIX + "heavy";
        public static final String BOUNDED_GLOWING = PREFIX + "bounded_glowing";
        public static final String REDSTONE_OVERFLOW = PREFIX + "redstone_overflow";
        public static final String ANTI_LAVA = PREFIX + "anti_lava";
    }
}
