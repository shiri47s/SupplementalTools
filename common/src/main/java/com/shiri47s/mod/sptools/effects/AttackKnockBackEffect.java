package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

public class AttackKnockBackEffect extends StatusEffect {
    public static final String ATTACK_KNOCKBACK_ATTRIBUTE = AntiLavaEffect.class.getName().toLowerCase() + ".attack_knockback";
    public AttackKnockBackEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x44AA33);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_ATTACK_KNOCKBACK,
                Identifier.of(ATTACK_KNOCKBACK_ATTRIBUTE),
                0.20000000298023224,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
