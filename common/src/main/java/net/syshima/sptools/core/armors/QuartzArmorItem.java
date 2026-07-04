package net.syshima.sptools.core.armors;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.Rarity;
import net.syshima.sptools.Constants;
import net.syshima.sptools.base.ModArmorItem;
import net.syshima.sptools.core.assets.ModArmorMaterials;

import java.util.function.Consumer;

public class QuartzArmorItem extends ModArmorItem {

    public QuartzArmorItem(ArmorType type, Item.Properties settings) {
        super(ModArmorMaterials.QUARTZ, type, settings.rarity(Rarity.RARE).durability(type.getDurability(22)));
    }

    @Override
    protected Constants.Series getSeries() {
        return Constants.Series.Quartz;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, Item.TooltipContext context, Consumer<Component> textConsumer) {
        textConsumer.accept(Component.translatable("item.sptools.blessing.quartz").withStyle(ChatFormatting.GREEN));
    }
}
