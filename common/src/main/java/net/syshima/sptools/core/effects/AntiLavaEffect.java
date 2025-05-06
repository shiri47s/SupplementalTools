package net.syshima.sptools.core.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.syshima.sptools.ModEffects;
import net.syshima.sptools.base.ModStatusEffect;

public class AntiLavaEffect extends ModStatusEffect {
    public static final String BURN_TIME_ATTRIBUTE = AntiLavaEffect.class.getName().toLowerCase() + ".burn_time";

    public AntiLavaEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xFFA54321);
        this.addAttributeModifier(
                EntityAttributes.BURNING_TIME,
                this.attrId(BURN_TIME_ATTRIBUTE),
                -0.91,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE);
    }

    public static boolean isActive(Object instance) {
        if (!(instance instanceof PlayerEntity player)) {
            return false;
        }

        return player.hasStatusEffect(ModEffects.ANTI_LAVA_ENTRY);
    }
}
