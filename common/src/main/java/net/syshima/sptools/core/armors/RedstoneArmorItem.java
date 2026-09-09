package net.syshima.sptools.core.armors;

import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.equipment.ArmorType;
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

    public RedstoneArmorItem(ArmorType type, Item.Properties settings) {
        super(ModArmorMaterials.REDSTONE, type, settings.rarity(Rarity.RARE).durability(type.getDurability(14)));
    }

    @Override
    public Constants.Series getSeries() {
        return Constants.Series.Redstone;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, Item.TooltipContext context, Consumer<Component> textConsumer) {
        textConsumer.accept(Component.translatable("item.sptools.blessing.redstone").withStyle(ChatFormatting.GREEN));

        // Derived from the viewing player's surroundings rather than stored on the item,
        // so the reading is always live and never leaks between players.
        int power = EnvExecutor.getInEnv(Env.CLIENT,
                        () -> () -> net.syshima.sptools.client.ClientEquipment.localRedstonePower())
                .orElse(0);
        textConsumer.accept(Component.translatable("item.sptools.blessing.redstone.level", POWERS[power])
                .withStyle(ChatFormatting.RED));
    }
}
