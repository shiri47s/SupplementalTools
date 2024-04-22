package com.shiri47s.mod.sptools.armors;

import com.shiri47s.mod.sptools.materials.CopperArmorMaterials;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;

public class CopperArmorItem extends ArmorItem {
    public CopperArmorItem(Type type) {
        super(new CopperArmorMaterials(), type, new Item.Settings());
    }
}
