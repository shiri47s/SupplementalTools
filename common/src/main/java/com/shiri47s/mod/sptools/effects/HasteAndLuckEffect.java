package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class HasteAndLuckEffect extends StatusEffect {
    public HasteAndLuckEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x2211DDD);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_LUCK,
                "ca33ccdb-4ddc-4ac7-95c0-3681c06105ef",
                1,
                EntityAttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(
                EntityAttributes.GENERIC_ATTACK_SPEED,
                "c446eff8-b20a-4ac3-9e49-ef212e018ccb",
                0.10000000149011612,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
