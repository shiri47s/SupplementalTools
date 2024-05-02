package com.shiri47s.mod.sptools.tools;

import com.shiri47s.mod.sptools.Instances;
import com.shiri47s.mod.sptools.SupplementalTools;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

@SuppressWarnings("UnstableApiUsage")
public class SupplementalHoeItem extends HoeItem
{
    public SupplementalHoeItem(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings.arch$tab(SupplementalTools.TAB_SUPPLIER));
    }
}
