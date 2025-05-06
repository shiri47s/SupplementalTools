package net.syshima.sptools.core.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.syshima.sptools.base.ModStatusEffect;

public class MovementSpeedEffect extends ModStatusEffect {
    public static final String MOVEMENT_SPEED_ATTRIBUTE = MovementSpeedEffect.class.getName().toLowerCase() + ".movement_speed";
    public MovementSpeedEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xFFFF33);
        this.addAttributeModifier(
                EntityAttributes.MOVEMENT_SPEED,
                this.attrId(MOVEMENT_SPEED_ATTRIBUTE),
                0.20000000298023224,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
