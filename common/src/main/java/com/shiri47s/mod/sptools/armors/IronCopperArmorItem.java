package com.shiri47s.mod.sptools.armors;

import com.shiri47s.mod.sptools.Enums;
import com.shiri47s.mod.sptools.materials.SupplementalArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;

import java.util.List;

public class IronCopperArmorItem extends SupplementalArmorItem {
    public IronCopperArmorItem(Type type) {
        super(SupplementalArmorMaterials.IRONCOPPER, type, new Item.Settings().rarity(Rarity.UNCOMMON).maxDamage(type.getMaxDamage(11)));
    }

    @Override
    protected Enums.Series getSeries() {
        return Enums.Series.IronCopper;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.sptools.blessing.ironcopper").formatted(Formatting.GREEN));
    }
}
