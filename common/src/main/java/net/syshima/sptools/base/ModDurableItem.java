package net.syshima.sptools.base;

import net.minecraft.component.type.TooltipDisplayComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.syshima.sptools.IPlatform;
import net.syshima.sptools.ModMain;

import java.util.function.Consumer;

public abstract class ModDurableItem extends ModItem {

    protected final IPlatform PLATFORM = ModMain.PLATFORM;

    public ModDurableItem(Settings settings) {
        super(settings);
    }

    abstract protected int getCost();
    abstract protected int getAlertDurability();
    abstract protected Text getAlertText();

    @SuppressWarnings("deprecation")
    @Deprecated
    public void appendTooltip(ItemStack stack, TooltipContext context, TooltipDisplayComponent displayComponent, Consumer<Text> textConsumer, TooltipType type) {
        super.appendTooltip(stack, context, displayComponent, textConsumer, type);

        var leftDurability = stack.getMaxDamage() - stack.getDamage();
        var usesLeft = leftDurability / this.getCost();
        textConsumer.accept(Text.translatable("item.sptools.durable.tooltip", usesLeft).formatted(Formatting.GREEN));
    }

    protected void alertAboutBreak(PlayerEntity user, ItemStack itemStack) {
        var leftDurability = itemStack.getMaxDamage() - itemStack.getDamage();
        if (leftDurability < this.getAlertDurability()) {
            user.sendMessage(this.getAlertText(), true);
        }
    }
}
