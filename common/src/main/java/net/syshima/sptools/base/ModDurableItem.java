package net.syshima.sptools.base;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public abstract class ModDurableItem extends Item {

    public ModDurableItem(Item.Properties settings) {
        super(settings);
    }

    protected abstract int getCost();

    protected abstract int getAlertDurability();

    protected abstract Component getAlertText();

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, TooltipDisplay displayComponent, Consumer<Component> textConsumer, TooltipFlag type) {
        super.appendHoverText(stack, context, displayComponent, textConsumer, type);

        int cost = this.getCost();
        if (cost <= 0) {
            return;
        }

        // Rounded up, because a stack holding less than one full cost still pays for a
        // last use: hurtAndBreak caps the overdraw and breaks the item instead of
        // refusing it. Rounding down would promise one use fewer than the item gives.
        int usesLeft = Math.ceilDiv(stack.getMaxDamage() - stack.getDamageValue(), cost);
        textConsumer.accept(Component.translatable("item.sptools.durable.tooltip", usesLeft).withStyle(ChatFormatting.GREEN));
    }

    protected void alertAboutBreak(Player user, ItemStack itemStack) {
        int leftDurability = itemStack.getMaxDamage() - itemStack.getDamageValue();
        if (leftDurability < this.getAlertDurability()) {
            user.sendOverlayMessage(this.getAlertText());
        }
    }
}
