package com.shiri47s.mod.sptools.armors;

import com.shiri47s.mod.sptools.Enums;
import com.shiri47s.mod.sptools.FullSetsBonus;
import com.shiri47s.mod.sptools.Instances;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

@SuppressWarnings("UnstableApiUsage")
public abstract class SupplementalArmorItem extends ArmorItem {
    public SupplementalArmorItem(ArmorMaterial material, Type type, Settings settings) {
        super(material, type, settings.arch$tab(Instances.Group));
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        if (world == null) {
            return;
        }

        if (FullSetsBonus.isFullSets(getSeries())) {
            tooltip.add(Text.translatable("item.sptools.blessing").formatted(Formatting.GREEN));
            appendFullSetsTooltip(stack, world, tooltip, context);
        }
    }

    protected abstract Enums.Series getSeries();
    protected abstract void appendFullSetsTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context);
}
