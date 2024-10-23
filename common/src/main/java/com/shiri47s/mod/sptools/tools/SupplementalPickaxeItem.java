package com.shiri47s.mod.sptools.tools;

import com.shiri47s.mod.sptools.SupplementalTools;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

@SuppressWarnings("UnstableApiUsage")
public class SupplementalPickaxeItem extends PickaxeItem
{
    public SupplementalPickaxeItem(ToolMaterial material, float attack, float speed, Settings settings) {
        super(material, attack, speed, settings.arch$tab(SupplementalTools.TAB_SUPPLIER));
    }
}
