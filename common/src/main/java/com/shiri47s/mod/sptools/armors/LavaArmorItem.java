package com.shiri47s.mod.sptools.armors;

import com.shiri47s.mod.sptools.Enums;
import com.shiri47s.mod.sptools.materials.SupplementalArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;

import java.util.List;

public class LavaArmorItem extends SupplementalArmorItem {

    public LavaArmorItem(Type type) {
        super(SupplementalArmorMaterials.LAVA, type, new Item.Settings().rarity(Rarity.EPIC).fireproof().maxDamage(type.getMaxDamage(40)));
    }

    @Override
    protected Enums.Series getSeries() {
        return Enums.Series.Lava;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.sptools.blessing.lava").formatted(Formatting.GREEN));
    }
}
