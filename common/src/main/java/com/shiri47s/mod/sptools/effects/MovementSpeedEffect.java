package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

import java.util.UUID;

public class MovementSpeedEffect extends StatusEffect {
    public MovementSpeedEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xFFFF33);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_MOVEMENT_SPEED,
                "29352e66-7851-4ff0-849a-5419dc4dca17",
                0.20000000298023224,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
