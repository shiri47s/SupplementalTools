package net.syshima.sptools.core.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.syshima.sptools.base.ModStatusEffect;

public class HeavyEffect extends ModStatusEffect {
    public static final String ATTACK_KNOCKBACK_ATTRIBUTE = HeavyEffect.class.getName().toLowerCase() + ".attack_knockback";
    public static final String MOVEMENT_SPEED_ATTRIBUTE = HeavyEffect.class.getName().toLowerCase() + ".movement_speed";

    public HeavyEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x888888);
        this.addAttributeModifier(
                EntityAttributes.ATTACK_KNOCKBACK,
                this.attrId(ATTACK_KNOCKBACK_ATTRIBUTE),
                0.25,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
        this.addAttributeModifier(
                EntityAttributes.MOVEMENT_SPEED,
                this.attrId(MOVEMENT_SPEED_ATTRIBUTE),
                -0.15,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
