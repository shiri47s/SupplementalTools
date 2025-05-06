package net.syshima.sptools.core.assets;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.syshima.sptools.ModTags;

public final class ModToolMaterials {
    public static final ToolMaterial BRONZE;
    public static final ToolMaterial IRONCOPPER;
    public static final ToolMaterial AMETHYST;
    public static final ToolMaterial EMERALD;
    public static final ToolMaterial LEAD;
    public static final ToolMaterial QUARTZ;
    public static final ToolMaterial REDSTONE;

    static {
        BRONZE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 172, 5.0F, 1.5F, 5, ModTags.BRONZE_TOOL_MATERIALS);
        IRONCOPPER = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL,255, 7.0F, 2.0F, 7, ModTags.IRONCOPPER_TOOL_MATERIALS);
        AMETHYST = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,255, 8.0F, 3.0F, 14, ModTags.AMETHYST_TOOL_MATERIALS);
        EMERALD = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,777, 8.5F, 3.5F, 12, ModTags.EMERALD_TOOL_MATERIALS);
        LEAD = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL,153, 7.5F, 3.0F, 3, ModTags.LEAD_TOOL_MATERIALS);
        QUARTZ = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL,666, 7.0F, 3.0F, 6, ModTags.QUARTZ_TOOL_MATERIALS);
        REDSTONE = new ToolMaterial(BlockTags.INCORRECT_FOR_GOLD_TOOL,184, 6.5F, 2.5F, 11, ModTags.REDSTONE_TOOL_MATERIALS);
    }
}
