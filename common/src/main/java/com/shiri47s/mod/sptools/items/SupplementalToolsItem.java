package com.shiri47s.mod.sptools.items;

import com.shiri47s.mod.sptools.Instances;
import net.minecraft.item.Item;

@SuppressWarnings("UnstableApiUsage")
public class SupplementalToolsItem extends Item {
    public SupplementalToolsItem(Settings settings) {
        super(settings.arch$tab(Instances.Group));
    }
}
