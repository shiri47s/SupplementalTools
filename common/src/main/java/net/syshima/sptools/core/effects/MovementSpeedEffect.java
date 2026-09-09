package net.syshima.sptools.core.effects;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.effect.MobEffectCategory;
import net.syshima.sptools.base.ModStatusEffect;

public class MovementSpeedEffect extends ModStatusEffect {
    private static final String MOVEMENT_SPEED_ATTRIBUTE = "movement_speed.movement_speed";
    public MovementSpeedEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xFFFF33);
        this.addAttributeModifier(
                Attributes.MOVEMENT_SPEED,
                this.attrId(MOVEMENT_SPEED_ATTRIBUTE),
                0.20000000298023224,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
