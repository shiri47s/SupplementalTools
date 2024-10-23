package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

public class HeavyEffect extends StatusEffect {
    public static final String ATTACK_KNOCKBACK_ATTRIBUTE = AntiLavaEffect.class.getName().toLowerCase() + ".attack_knockback";
    public static final String MOVEMENT_SPEED_ATTRIBUTE = AntiLavaEffect.class.getName().toLowerCase() + ".movement_speed";

    public HeavyEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x888888);
        this.addAttributeModifier(
                EntityAttributes.ATTACK_KNOCKBACK,
                Identifier.of(ATTACK_KNOCKBACK_ATTRIBUTE),
                0.25,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
        this.addAttributeModifier(
                EntityAttributes.MOVEMENT_SPEED,
                Identifier.of(MOVEMENT_SPEED_ATTRIBUTE),
                -0.15,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
