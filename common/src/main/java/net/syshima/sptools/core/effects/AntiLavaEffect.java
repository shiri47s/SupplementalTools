package net.syshima.sptools.core.effects;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import org.jetbrains.annotations.Nullable;
import net.syshima.sptools.ModEffects;
import net.syshima.sptools.base.ModStatusEffect;

public class AntiLavaEffect extends ModStatusEffect {
    private static final String BURN_TIME_ATTRIBUTE = "anti_lava.burn_time";

    public AntiLavaEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xA54321);
        this.addAttributeModifier(
                Attributes.BURNING_TIME,
                this.attrId(BURN_TIME_ATTRIBUTE),
                -0.91,
                AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
    }

    /**
     * Whether the entity currently carries the Anti-Lava effect.
     *
     * <p>Any living entity counts, not only players. The shortened burning time rides on
     * an attribute modifier and so already applies to whatever holds the effect; testing
     * for a player here would leave a mob handed it by {@code /effect} burning less but
     * still dying in lava.
     */
    public static boolean isActive(@Nullable Entity entity) {
        return entity instanceof LivingEntity living && living.hasEffect(ModEffects.ANTI_LAVA.asHolder());
    }
}
