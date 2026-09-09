package net.syshima.sptools.core.effects;

import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.syshima.sptools.Constants;
import net.syshima.sptools.base.ModStatusEffect;

public class RedstoneOverflowEffect extends ModStatusEffect {

    /** Highest power level the tooltip bar and the attribute bonus scale to. */
    public static final int MAX_POWER = 8;

    private static final double AMOUNT_BASE = 0.16;
    private static final int INTERVAL = 5;
    private static final Identifier MODIFIER_ID =
            Identifier.fromNamespaceAndPath(Constants.MOD_ID, "redstone_overflow");

    public RedstoneOverflowEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xFF0000);
    }

    public static void effect(Level level, Player player) {
        if (level.getGameTime() % INTERVAL != 0) {
            return;
        }

        double amount = AMOUNT_BASE * powerLevel(level.getBestNeighborSignal(player.blockPosition()));
        applyAttribute(player.getAttribute(Attributes.ATTACK_SPEED), amount);
        applyAttribute(player.getAttribute(Attributes.BLOCK_BREAK_SPEED), amount);
    }

    public static void clear(Player player) {
        removeModifier(player.getAttribute(Attributes.ATTACK_SPEED));
        removeModifier(player.getAttribute(Attributes.BLOCK_BREAK_SPEED));
    }

    /** Maps a 0-15 redstone signal onto the mod's 0-8 power scale. */
    public static int powerLevel(int redstoneSignal) {
        return Math.clamp((redstoneSignal + 1) / 2, 0, MAX_POWER);
    }

    private static void removeModifier(AttributeInstance attribute) {
        if (attribute != null) {
            attribute.removeModifier(MODIFIER_ID);
        }
    }

    private static void applyAttribute(AttributeInstance attribute, double amount) {
        if (attribute == null) {
            return;
        }

        removeModifier(attribute);
        attribute.addTransientModifier(
                new AttributeModifier(MODIFIER_ID, amount, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    }
}
