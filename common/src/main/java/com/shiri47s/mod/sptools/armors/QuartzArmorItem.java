package com.shiri47s.mod.sptools.armors;

import com.shiri47s.mod.sptools.Enums;
import com.shiri47s.mod.sptools.materials.SupplementalArmorMaterials;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;

import java.util.List;

public class QuartzArmorItem extends SupplementalArmorItem {

    public QuartzArmorItem(Type type) {
        super(SupplementalArmorMaterials.QUARTZ, type, new Settings().rarity(Rarity.RARE).maxDamage(type.getMaxDamage(22)));
    }

    @Override
    protected Enums.Series getSeries() {
        return Enums.Series.Quartz;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.sptools.blessing.quartz").formatted(Formatting.GREEN));
    }
}
