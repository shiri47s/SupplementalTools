package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class AttackKnockBackEffect extends StatusEffect {
    public AttackKnockBackEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_ATTACK_KNOCKBACK,
                "c38c3245-ba5c-452a-8594-e25ab6e1974e",
                0.20000000298023224,
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
    }
}
