package net.syshima.sptools.core.armors;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.syshima.sptools.Constants;
import net.syshima.sptools.base.ModArmorItem;
import net.syshima.sptools.core.assets.ModArmorMaterials;

import java.util.List;
import java.util.function.Consumer;

public class IronCopperArmorItem extends ModArmorItem {
    public IronCopperArmorItem(EquipmentType type, Item.Settings settings) {
        super(ModArmorMaterials.IRONCOPPER, type, settings.rarity(Rarity.UNCOMMON).maxDamage(type.getMaxDamage(11)));
    }

    @Override
    protected Constants.Series getSeries() {
        return Constants.Series.IronCopper;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, TooltipContext context, Consumer<Text> textConsumer) {
        textConsumer.accept(Text.translatable("item.sptools.blessing.ironcopper").formatted(Formatting.GREEN));
    }
}
