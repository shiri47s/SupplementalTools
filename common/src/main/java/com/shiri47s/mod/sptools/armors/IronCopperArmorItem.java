package com.shiri47s.mod.sptools.armors;

import com.shiri47s.mod.sptools.materials.IronCopperArmorMaterials;
import net.minecraft.item.ArmorItem;

public class IronCopperArmorItem extends ArmorItem {
    public IronCopperArmorItem(Type type) {
        super(new IronCopperArmorMaterials(), type, new Settings());
    }
}
