package net.syshima.sptools.core.armors;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorType;
import net.syshima.sptools.Constants;
import net.syshima.sptools.base.ModArmorItem;
import net.syshima.sptools.core.ArmorSeries;

import java.util.function.Consumer;

/**
 * An armour piece that takes everything it needs from {@link ArmorSeries}.
 *
 * <p>Subclass this only when a series shows something the table cannot express, as
 * {@link RedstoneArmorItem} does for its live power reading.
 */
public class SeriesArmorItem extends ModArmorItem {

    private final Constants.Series series;

    public SeriesArmorItem(Constants.Series series, ArmorType type, Item.Properties settings) {
        super(traitsOf(series).material(), type, configure(series, type, settings));
        this.series = series;
    }

    @Override
    public Constants.Series getSeries() {
        return series;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, Item.TooltipContext context, Consumer<Component> textConsumer) {
        textConsumer.accept(Component.translatable(traitsOf(series).blessingKey()).withStyle(ChatFormatting.GREEN));
    }

    private static Item.Properties configure(Constants.Series series, ArmorType type, Item.Properties settings) {
        ArmorSeries traits = traitsOf(series);
        Item.Properties configured = settings
                .rarity(traits.rarity())
                .durability(type.getDurability(traits.durability()));
        return traits.fireResistant() ? configured.fireResistant() : configured;
    }

    private static ArmorSeries traitsOf(Constants.Series series) {
        ArmorSeries traits = ArmorSeries.of(series);
        if (traits == null) {
            throw new IllegalArgumentException("No armour traits registered for series " + series);
        }

        return traits;
    }
}
