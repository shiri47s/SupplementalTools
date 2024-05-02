package com.shiri47s.mod.sptools.tools;

import com.shiri47s.mod.sptools.SupplementalTools;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

@SuppressWarnings("UnstableApiUsage")
public class SupplementalShovelItem extends ShovelItem
{
    public SupplementalShovelItem(ToolMaterial material, Settings settings) {
        super(material, settings.arch$tab(SupplementalTools.TAB_SUPPLIER));
    }
}
