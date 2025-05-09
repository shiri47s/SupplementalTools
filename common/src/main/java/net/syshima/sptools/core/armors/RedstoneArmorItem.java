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

    public RedstoneArmorItem(EquipmentType type, Item.Settings settings) {
        super(ModArmorMaterials.REDSTONE, type, settings.rarity(Rarity.RARE).maxDamage(type.getMaxDamage(14)));
    }

    public void receivePower(int power) {
        currentPower = power;
    }

    @Override
    protected Constants.Series getSeries() {
        return Constants.Series.Redstone;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, TooltipContext context, Consumer<Text> textConsumer) {
        textConsumer.accept(Text.translatable("item.sptools.blessing.redstone").formatted(Formatting.GREEN));
        textConsumer.accept(Text.translatable("item.sptools.blessing.redstone.level", POWERS[currentPower]).formatted(Formatting.RED));
    }
}
