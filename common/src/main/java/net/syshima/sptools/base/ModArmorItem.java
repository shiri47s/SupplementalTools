package net.syshima.sptools.base;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.EquippableComponent;
import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.syshima.sptools.Constants;
import net.syshima.sptools.core.effects.FullEquipmentBenefits;

import java.util.function.Consumer;

public abstract class ModArmorItem extends ModItem {
    public ModArmorItem(ArmorMaterial material, EquipmentType type, Settings settings) {
        super(settings.armor(material, EquipmentType.BODY)
                .attributeModifiers(material.createAttributeModifiers(type))
                .enchantable(material.enchantmentValue())
                .component(DataComponentTypes.EQUIPPABLE,
                        EquippableComponent.builder(
                                        type.getEquipmentSlot())
                                .equipSound(material.equipSound())
                                .model(material.assetId()).build()));
    }

    @SuppressWarnings("deprecation")
    @Deprecated
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        super.appendTooltip(stack, context, displayComponent, textConsumer, type);

        if (FullEquipmentBenefits.isActive(getSeries())) {
            textConsumer.accept(Text.translatable("item.sptools.blessing").formatted(Formatting.GREEN));
            appendFullSetsTooltip(stack, context, textConsumer);
        }
    }

    protected abstract Constants.Series getSeries();
    protected abstract void appendFullSetsTooltip(ItemStack stack, TooltipContext context, Consumer<Text> textConsumer);
}
