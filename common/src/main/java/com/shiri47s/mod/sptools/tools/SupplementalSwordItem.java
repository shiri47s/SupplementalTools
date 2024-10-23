package com.shiri47s.mod.sptools.tools;

import com.shiri47s.mod.sptools.SupplementalTools;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

@SuppressWarnings("UnstableApiUsage")
public class SupplementalSwordItem extends SwordItem {
    public SupplementalSwordItem(ToolMaterial toolMaterial, float attack, float speed, Settings settings) {
        super(toolMaterial, attack, speed, settings.arch$tab(SupplementalTools.TAB_SUPPLIER));
    }
}
