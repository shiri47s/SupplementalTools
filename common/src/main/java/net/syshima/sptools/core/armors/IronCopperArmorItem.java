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

public class IronCopperArmorItem extends ModArmorItem {
    public IronCopperArmorItem(ArmorType type, Item.Properties settings) {
        super(ModArmorMaterials.IRONCOPPER, type, settings.rarity(Rarity.UNCOMMON).durability(type.getDurability(11)));
    }

    @Override
    protected Constants.Series getSeries() {
        return Constants.Series.IronCopper;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, Item.TooltipContext context, Consumer<Component> textConsumer) {
        textConsumer.accept(Component.translatable("item.sptools.blessing.ironcopper").withStyle(ChatFormatting.GREEN));
    }
}
