package com.shiri47s.mod.sptools.tools;

import com.shiri47s.mod.sptools.SupplementalTools;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

@SuppressWarnings("UnstableApiUsage")
public class SupplementalAxeItem extends AxeItem
{
    public SupplementalAxeItem(ToolMaterial material, Settings settings) {
        super(material, settings.arch$tab(SupplementalTools.TAB_SUPPLIER));
    }
}
