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

public class LavaArmorItem extends ModArmorItem {

    public LavaArmorItem(ArmorType type, Item.Properties settings) {
        super(ModArmorMaterials.LAVA, type, settings.rarity(Rarity.EPIC).fireResistant().durability(type.getDurability(40)));
    }

    @Override
    public Constants.Series getSeries() {
        return Constants.Series.Lava;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, Item.TooltipContext context, Consumer<Component> textConsumer) {
        textConsumer.accept(Component.translatable("item.sptools.blessing.lava").withStyle(ChatFormatting.GREEN));
    }
}
