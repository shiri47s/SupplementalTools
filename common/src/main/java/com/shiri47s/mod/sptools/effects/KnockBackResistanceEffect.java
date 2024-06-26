package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class KnockBackResistanceEffect extends StatusEffect {
    public KnockBackResistanceEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xAB66F0);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                "309ab45b-9334-477c-91fe-2995171e97a6",
                1,
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
    }
}
