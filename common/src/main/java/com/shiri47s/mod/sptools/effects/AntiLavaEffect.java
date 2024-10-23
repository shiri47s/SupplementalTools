package com.shiri47s.mod.sptools.effects;

import com.shiri47s.mod.sptools.Instances;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;

public class AntiLavaEffect extends StatusEffect {
    public static final String BURN_TIME_ATTRIBUTE = AntiLavaEffect.class.getName().toLowerCase() + ".burn_time";

    public AntiLavaEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xFFA54321);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_BURNING_TIME,
                Identifier.of(BURN_TIME_ATTRIBUTE),
                -0.91,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE);
    }

    public static boolean isActive(Object instance) {
        if (!(instance instanceof PlayerEntity player)) {
            return false;
        }

        return player.hasStatusEffect(Instances.Effect.ANTI_LAVA);
    }
}
