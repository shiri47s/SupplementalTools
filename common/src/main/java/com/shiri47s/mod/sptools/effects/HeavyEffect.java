package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;

public class HeavyEffect extends StatusEffect {
    public HeavyEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_ATTACK_KNOCKBACK,
                Identifier.of("0e247b51-f633-4677-8380-cdc80e98b0b0"),
                0.25,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_MOVEMENT_SPEED,
                Identifier.of("ebf393f4-39e9-43fa-96e1-e2180c24a311"),
                -0.15,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
