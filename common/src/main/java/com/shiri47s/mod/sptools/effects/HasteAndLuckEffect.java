package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

public class HasteAndLuckEffect extends StatusEffect {
    public static final String LUCK_ATTRIBUTE = AntiLavaEffect.class.getName().toLowerCase() + ".luck";
    public static final String ATTACK_SPEED_ATTRIBUTE = AntiLavaEffect.class.getName().toLowerCase() + ".attack_speed";
    public HasteAndLuckEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x2211DDD);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_LUCK,
                Identifier.of(LUCK_ATTRIBUTE),
                1,
                EntityAttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_ATTACK_SPEED,
                Identifier.of(ATTACK_SPEED_ATTRIBUTE),
                0.10000000149011612,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
