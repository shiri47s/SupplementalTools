package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

import java.util.UUID;

public class AttackKnockBackEffect extends StatusEffect {
    public AttackKnockBackEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x44AA33);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_ATTACK_KNOCKBACK,
                "9a0cff8f-e945-4584-8594-d03023bc2ed0",
                0.20000000298023224,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
