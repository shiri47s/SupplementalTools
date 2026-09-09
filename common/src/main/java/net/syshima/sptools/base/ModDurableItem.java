package net.syshima.sptools.base;
import net.minecraft.world.item.Item;

import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;

import java.util.function.Consumer;

public abstract class ModDurableItem extends Item {

    public ModDurableItem(Item.Properties settings) {
        super(settings);
    }

    abstract protected int getCost();
    abstract protected int getAlertDurability();
    abstract protected Component getAlertText();

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay displayComponent, Consumer<Component> textConsumer, TooltipFlag type) {
        super.appendHoverText(stack, context, displayComponent, textConsumer, type);

        int cost = this.getCost();
        if (cost <= 0) {
            return;
        }

        int usesLeft = (stack.getMaxDamage() - stack.getDamageValue()) / cost;
        textConsumer.accept(Component.translatable("item.sptools.durable.tooltip", usesLeft).withStyle(ChatFormatting.GREEN));
    }

    protected void alertAboutBreak(Player user, ItemStack itemStack) {
        var leftDurability = itemStack.getMaxDamage() - itemStack.getDamageValue();
        if (leftDurability < this.getAlertDurability()) {
            user.sendOverlayMessage(this.getAlertText());
        }
    }
}
