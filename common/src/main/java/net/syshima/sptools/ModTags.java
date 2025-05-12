package net.syshima.sptools;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public final class ModTags {
    public static final TagKey<Item> Bronzes = ofItem("bronzes");
    public static final TagKey<Item> IRONCOPPERS = ofItem("ironcoppers");
    public static final TagKey<Item> AMETHYSTS = ofItem("amethysts");
    public static final TagKey<Item> EMERALDS = ofItem("emerald");
    public static final TagKey<Item> LEAD = ofItem("lead");
    public static final TagKey<Item> QUARTZ = ofItem("quartz");
    public static final TagKey<Item> REDSTONE = ofItem("redstone");
    public static final TagKey<Item> LAVA = ofItem("lava");
    public static final TagKey<Item> DURABLE = ofItem("durable");
    public static final TagKey<Item> BRONZE_TOOL_MATERIALS = ofItem("bronze_tool_materials");
    public static final TagKey<Item> IRONCOPPER_TOOL_MATERIALS = ofItem("ironcopper_tool_materials");
    public static final TagKey<Item> AMETHYST_TOOL_MATERIALS = ofItem("amethyst_tool_materials");
    public static final TagKey<Item> EMERALD_TOOL_MATERIALS = ofItem("emerald_tool_materials");
    public static final TagKey<Item> LEAD_TOOL_MATERIALS = ofItem("lead_tool_materials");
    public static final TagKey<Item> QUARTZ_TOOL_MATERIALS = ofItem("quartz_tool_materials");
    public static final TagKey<Item> REDSTONE_TOOL_MATERIALS = ofItem("redstone_tool_materials");
    public static final TagKey<Item> DURABLE_TOOL_MATERIALS = ofItem("durable_tool_materials");
    public static final TagKey<Item> REPAIRS_BRONZE_ARMOR = ofItem("repairs_bronze_armor");
    public static final TagKey<Item> REPAIRS_IRONCOPPER_ARMOR = ofItem("repairs_ironcopper_armor");
    public static final TagKey<Item> REPAIRS_AMETHYST_ARMOR = ofItem("repairs_amethyst_armor");
    public static final TagKey<Item> REPAIRS_EMERALD_ARMOR = ofItem("repairs_emerald_armor");
    public static final TagKey<Item> REPAIRS_LEAD_ARMOR = ofItem("repairs_lead_armor");
    public static final TagKey<Item> REPAIRS_QUARTZ_ARMOR = ofItem("repairs_quartz_armor");
    public static final TagKey<Item> REPAIRS_REDSTONE_ARMOR = ofItem("repairs_redstone_armor");
    public static final TagKey<Item> REPAIRS_LAVA_ARMOR = ofItem("repairs_lava_armor");
    public static final TagKey<Item> PIGLINS_LOVED_ARMOR = ofItem("piglins_loved_armor");
    private static TagKey<net.minecraft.block.Block> ofBlock(String id) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Constants.MOD_ID, id));
    }

    private static TagKey<Item> ofItem(String id) {
        return TagKey.of(RegistryKeys.ITEM, Identifier.of(Constants.MOD_ID, id));
    }
}
