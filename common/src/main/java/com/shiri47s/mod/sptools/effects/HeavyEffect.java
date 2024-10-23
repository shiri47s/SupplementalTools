package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class HeavyEffect extends StatusEffect {
    public HeavyEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x888888);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_ATTACK_KNOCKBACK,
                "ede57eb9-c475-4fb8-b3cf-7b5403549b35",
                0.25,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_MOVEMENT_SPEED,
                "803dfa39-d4bc-4802-88bf-d21aaa101587"    ,
                -0.15,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
