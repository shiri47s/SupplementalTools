package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

public class KnockBackResistanceEffect extends StatusEffect {
    public static final String KNOCKBACK_RESISTANCE_ATTRIBUTE = AntiLavaEffect.class.getName().toLowerCase() + ".knockback_resistance";
    public KnockBackResistanceEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x4477BB);
        this.addAttributeModifier(
                EntityAttributes.KNOCKBACK_RESISTANCE,
                Identifier.of(KNOCKBACK_RESISTANCE_ATTRIBUTE),
                1,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
