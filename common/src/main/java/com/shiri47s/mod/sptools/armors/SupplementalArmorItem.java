package com.shiri47s.mod.sptools.armors;

import com.shiri47s.mod.sptools.Enums;
import com.shiri47s.mod.sptools.FullSetsBonus;
import com.shiri47s.mod.sptools.SupplementalTools;
import net.minecraft.client.item.TooltipType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

@SuppressWarnings("UnstableApiUsage")
public abstract class SupplementalArmorItem extends ArmorItem {
    public SupplementalArmorItem(RegistryEntry<ArmorMaterial> material, Type type, Settings settings) {
        super(material, type, settings.arch$tab(SupplementalTools.TAB_SUPPLIER));
    }

    @Override
     public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        if (FullSetsBonus.isFullSets(getSeries())) {
            tooltip.add(Text.translatable("item.sptools.blessing").formatted(Formatting.GREEN));
            appendFullSetsTooltip(stack, tooltip, context);
        }
    }

    protected abstract Enums.Series getSeries();
    protected abstract void appendFullSetsTooltip(ItemStack stack, List<Text> tooltip, TooltipContext context);
}
