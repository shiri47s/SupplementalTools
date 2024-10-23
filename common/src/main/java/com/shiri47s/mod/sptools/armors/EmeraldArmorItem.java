package com.shiri47s.mod.sptools.armors;

import com.shiri47s.mod.sptools.Enums;
import com.shiri47s.mod.sptools.materials.SupplementalArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;

import java.util.List;

public class EmeraldArmorItem extends SupplementalArmorItem {

    public EmeraldArmorItem(EquipmentType type, Item.Settings settings) {
        super(SupplementalArmorMaterials.EMERALD, type, settings.rarity(Rarity.RARE).maxDamage(type.getMaxDamage(21)));
    }

    @Override
    protected Enums.Series getSeries() {
        return Enums.Series.Emerald;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.sptools.blessing.emerald").formatted(Formatting.GREEN));
    }
}
