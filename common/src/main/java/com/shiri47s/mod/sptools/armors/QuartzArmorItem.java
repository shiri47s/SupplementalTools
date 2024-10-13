package com.shiri47s.mod.sptools.armors;

import com.shiri47s.mod.sptools.Enums;
import com.shiri47s.mod.sptools.materials.QuartzArmorMaterials;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class QuartzArmorItem extends SupplementalArmorItem {

    public QuartzArmorItem(Type type) {
        super(QuartzArmorMaterials.INSTANCE, type, new Item.Settings());
    }

    @Override
    protected Enums.Series getSeries() {
        return Enums.Series.Quartz;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.sptools.blessing.quartz").formatted(Formatting.GREEN));
    }
}
