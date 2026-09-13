package net.syshima.sptools.core.effects;

import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
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

    /**
     * {@inheritDoc}
     *
     * <p>For an infinite effect the game passes the carrier's tick count here rather
     * than a remaining duration, so this reads as a steady interval either way.
     */
    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return duration % INTERVAL == 0;
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity carrier, int amplifier) {
        double amount = AMOUNT_BASE * powerLevel(level.getBestNeighborSignal(carrier.blockPosition()));
        AttributeMap attributes = carrier.getAttributes();
        applyAttribute(attributes.getInstance(Attributes.ATTACK_SPEED), amount);
        applyAttribute(attributes.getInstance(Attributes.BLOCK_BREAK_SPEED), amount);
        return true;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The bonus scales with the surrounding signal, so it cannot be declared as a
     * static modifier on the effect. This is where the game hands back the attributes
     * as the effect ends, which makes it the one place the transient modifier can be
     * dropped without polling for the effect's absence every tick.
     */
    @Override
    public void removeAttributeModifiers(AttributeMap attributes) {
        super.removeAttributeModifiers(attributes);
        removeModifier(attributes.getInstance(Attributes.ATTACK_SPEED));
        removeModifier(attributes.getInstance(Attributes.BLOCK_BREAK_SPEED));
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

        // Re-adding a modifier always marks the attribute dirty, which resends it to
        // every client tracking the carrier. Standing still on one signal level is the
        // common case, so leave an unchanged modifier alone.
        AttributeModifier current = attribute.getModifier(MODIFIER_ID);
        if (current != null && current.amount() == amount) {
            return;
        }

        attribute.removeModifier(MODIFIER_ID);
        attribute.addTransientModifier(
                new AttributeModifier(MODIFIER_ID, amount, AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));
    }
}
