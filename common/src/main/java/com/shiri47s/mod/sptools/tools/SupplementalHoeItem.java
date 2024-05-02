package com.shiri47s.mod.sptools.tools;

import com.shiri47s.mod.sptools.SupplementalTools;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

@SuppressWarnings("UnstableApiUsage")
public class SupplementalHoeItem extends HoeItem
{
    public SupplementalHoeItem(ToolMaterial material, Settings settings) {
        super(material, settings.arch$tab(SupplementalTools.TAB_SUPPLIER));
    }
}
