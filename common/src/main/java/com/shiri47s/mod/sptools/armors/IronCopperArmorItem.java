package com.shiri47s.mod.sptools.armors;

import com.shiri47s.mod.sptools.Enums;
import com.shiri47s.mod.sptools.materials.IronCopperArmorMaterials;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class IronCopperArmorItem extends SupplementalArmorItem {
    public IronCopperArmorItem(Type type) {
        super(IronCopperArmorMaterials.INSTANCE, type, new Settings());
    }

    @Override
    protected Enums.Series getSeries() {
        return Enums.Series.IronCopper;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.sptools.blessing.ironcopper").formatted(Formatting.GREEN));
    }
}
