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

public class RedstoneArmorItem extends ModArmorItem {

    private static final String[] POWERS = {
            "□□□□□□□□",
            "■□□□□□□□",
            "■■□□□□□□",
            "■■■□□□□□",
            "■■■■□□□□",
            "■■■■■□□□",
            "■■■■■■□□",
            "■■■■■■■□",
            "■■■■■■■■"
    };

    private int currentPower;

    public RedstoneArmorItem(ArmorType type, Item.Properties settings) {
        super(ModArmorMaterials.REDSTONE, type, settings.rarity(Rarity.RARE).durability(type.getDurability(14)));
    }

    public void receivePower(int power) {
        currentPower = power;
    }

    @Override
    protected Constants.Series getSeries() {
        return Constants.Series.Redstone;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, Item.TooltipContext context, Consumer<Component> textConsumer) {
        textConsumer.accept(Component.translatable("item.sptools.blessing.redstone").withStyle(ChatFormatting.GREEN));
        textConsumer.accept(Component.translatable("item.sptools.blessing.redstone.level", POWERS[currentPower]).withStyle(ChatFormatting.RED));
    }
}
