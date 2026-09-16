package net.syshima.sptools.core.armors;

import dev.architectury.utils.EnvExecutor;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.equipment.ArmorType;
import net.syshima.sptools.Constants;

import java.util.function.Consumer;

public class RedstoneArmorItem extends SeriesArmorItem {

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

    public RedstoneArmorItem(ArmorType type, Item.Properties settings) {
        super(Constants.Series.REDSTONE, type, settings);
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, Item.TooltipContext context, Consumer<Component> textConsumer) {
        super.appendFullSetsTooltip(stack, context, textConsumer);

        // Derived from the viewing player's surroundings rather than stored on the item,
        // so the reading is always live and never leaks between players.
        int power = EnvExecutor.getEnvSpecific(
                () -> () -> net.syshima.sptools.client.ClientEquipment.localRedstonePower(),
                () -> () -> 0);
        textConsumer.accept(Component.translatable("item.sptools.blessing.redstone.level", POWERS[power])
                .withStyle(ChatFormatting.RED));
    }
}
