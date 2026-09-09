package net.syshima.sptools.base;

import dev.architectury.utils.Env;
import dev.architectury.utils.EnvExecutor;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.syshima.sptools.Constants;

import java.util.function.Consumer;

public abstract class ModArmorItem extends ModItem {

    public ModArmorItem(ArmorMaterial material, ArmorType type, Item.Properties settings) {
        super(settings.humanoidArmor(material, type));
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay displayComponent, Consumer<Component> textConsumer, TooltipFlag type) {
        super.appendHoverText(stack, context, displayComponent, textConsumer, type);

        // The tooltip context carries no player, so the bonus is reported for whoever
        // is looking at the item - which is only ever the client.
        Constants.Series worn = EnvExecutor.getInEnv(Env.CLIENT,
                        () -> () -> net.syshima.sptools.client.ClientEquipment.localSeries())
                .orElse(Constants.Series.None);

        if (worn == getSeries()) {
            textConsumer.accept(Component.translatable("item.sptools.blessing").withStyle(ChatFormatting.GREEN));
            appendFullSetsTooltip(stack, context, textConsumer);
        }
    }

    public abstract Constants.Series getSeries();

    protected abstract void appendFullSetsTooltip(ItemStack stack, Item.TooltipContext context, Consumer<Component> textConsumer);
}
