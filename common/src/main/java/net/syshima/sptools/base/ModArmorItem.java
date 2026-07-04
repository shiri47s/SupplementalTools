package net.syshima.sptools.base;
import net.minecraft.world.item.Item;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.equipment.Equippable;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.syshima.sptools.Constants;
import net.syshima.sptools.core.effects.FullEquipmentBenefits;

import java.util.function.Consumer;

public abstract class ModArmorItem extends ModItem {
    public ModArmorItem(ArmorMaterial material, ArmorType type, Item.Properties settings) {
        super(settings.humanoidArmor(material, type));
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay displayComponent, Consumer<Component> textConsumer, TooltipFlag type) {
        super.appendHoverText(stack, context, displayComponent, textConsumer, type);

        if (FullEquipmentBenefits.isActive(getSeries())) {
            textConsumer.accept(Component.translatable("item.sptools.blessing").withStyle(ChatFormatting.GREEN));
            appendFullSetsTooltip(stack, context, textConsumer);
        }
    }

    protected abstract Constants.Series getSeries();
    protected abstract void appendFullSetsTooltip(ItemStack stack, Item.TooltipContext context, Consumer<Component> textConsumer);
}
