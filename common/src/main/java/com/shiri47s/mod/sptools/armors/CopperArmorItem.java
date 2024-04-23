package com.shiri47s.mod.sptools.armors;

import com.shiri47s.mod.sptools.Enums;
import com.shiri47s.mod.sptools.materials.CopperArmorMaterials;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class CopperArmorItem extends SupplementalArmorItem {
    public CopperArmorItem(Type type) {
        super(CopperArmorMaterials.INSTANCE, type, new Item.Settings());
    }

    @Override
    protected Enums.Series getSeries() {
        return Enums.Series.Copper;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.sptools.blessing.copper").formatted(Formatting.GREEN));
    }
}
