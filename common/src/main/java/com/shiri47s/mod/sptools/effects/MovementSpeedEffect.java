package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

public class MovementSpeedEffect extends StatusEffect {
    public static final String MOVEMENT_SPEED_ATTRIBUTE = AntiLavaEffect.class.getName().toLowerCase() + ".movement_speed";
    public MovementSpeedEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xFFFF33);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_MOVEMENT_SPEED,
                MOVEMENT_SPEED_ATTRIBUTE,
                0.20000000298023224,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
