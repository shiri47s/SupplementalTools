package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

import java.util.UUID;

public class KnockBackResistanceEffect extends StatusEffect {
    public KnockBackResistanceEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x4477BB);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE,
                "46ebbcd2-8974-4ad7-8560-7ebeed8bbd04",
                1,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
