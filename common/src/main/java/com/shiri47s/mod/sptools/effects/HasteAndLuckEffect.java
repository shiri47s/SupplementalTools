package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class HasteAndLuckEffect extends StatusEffect {
    public HasteAndLuckEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_LUCK,
                "cae82afa-fd4b-4cfa-9548-211c1a199df4",
                1,
                EntityAttributeModifier.Operation.ADDITION);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_ATTACK_SPEED,
                "cf0486b3-adff-4c66-a439-939b222f5df9",
                0.10000000149011612,
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
    }
}
