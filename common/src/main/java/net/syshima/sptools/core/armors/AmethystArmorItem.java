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

import java.util.function.Consumer;

public class AmethystArmorItem extends ModArmorItem {

    public AmethystArmorItem(EquipmentType type, Item.Settings settings) {
        super(ModArmorMaterials.AMETHYST, type, settings.rarity(Rarity.RARE).maxDamage(type.getMaxDamage(17)));
    }

    @Override
    protected Constants.Series getSeries() {
        return Constants.Series.Amethyst;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, TooltipContext context, Consumer<Text> textConsumer) {
        textConsumer.accept(Text.translatable("item.sptools.blessing.amethyst").formatted(Formatting.GREEN));
    }
}
