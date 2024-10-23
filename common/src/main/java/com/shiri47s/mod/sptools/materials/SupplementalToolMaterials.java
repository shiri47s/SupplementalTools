package com.shiri47s.mod.sptools.materials;

import com.shiri47s.mod.sptools.Constants;
import net.minecraft.item.ToolMaterial;

public class SupplementalToolMaterials {

    public static ToolMaterial Bronze;
    public static ToolMaterial IRONCOPPER;
    public static ToolMaterial AMETHYST;
    public static ToolMaterial EMERALD;
    public static ToolMaterial LEAD;
    public static ToolMaterial QUARTZ;
    public static ToolMaterial REDSTONE;

    static {
        Bronze = new ToolMaterial(Constants.Tag.INCORRECT_FOR_BRONZE_TOOL, 172, 5.0F, 1.5F, 5, Constants.Tag.BRONZE_TOOL_MATERIALS);
        IRONCOPPER = new ToolMaterial(Constants.Tag.INCORRECT_FOR_IRONCOPPER_TOOL,255, 7.0F, 2.0F, 7, Constants.Tag.IRONCOPPER_TOOL_MATERIALS);
        AMETHYST = new ToolMaterial(Constants.Tag.INCORRECT_FOR_AMETHYST_TOOL,255, 8.0F, 3.0F, 14, Constants.Tag.AMETHYST_TOOL_MATERIALS);
        EMERALD = new ToolMaterial(Constants.Tag.INCORRECT_FOR_EMERALD_TOOL,777, 8.5F, 3.5F, 12, Constants.Tag.EMERALD_TOOL_MATERIALS);
        LEAD = new ToolMaterial(Constants.Tag.INCORRECT_FOR_LEAD_TOOL,153, 7.5F, 3.0F, 3, Constants.Tag.LEAD_TOOL_MATERIALS);
        QUARTZ = new ToolMaterial(Constants.Tag.INCORRECT_FOR_QUARTZ_TOOL,666, 7.0F, 3.0F, 6, Constants.Tag.QUARTZ_TOOL_MATERIALS);
        REDSTONE = new ToolMaterial(Constants.Tag.INCORRECT_FOR_REDSTONE_TOOL,184, 6.5F, 2.5F, 11, Constants.Tag.REDSTONE_TOOL_MATERIALS);
    }
}
