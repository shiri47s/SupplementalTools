package net.syshima.sptools.core.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.syshima.sptools.base.ModStatusEffect;

public class HasteAndLuckEffect extends ModStatusEffect {
    public static final String LUCK_ATTRIBUTE = HasteAndLuckEffect.class.getName().toLowerCase() + ".luck";
    public static final String ATTACK_SPEED_ATTRIBUTE = HasteAndLuckEffect.class.getName().toLowerCase() + ".attack_speed";
    public HasteAndLuckEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x2211DDD);
        this.addAttributeModifier(
                EntityAttributes.LUCK,
                this.attrId(LUCK_ATTRIBUTE),
                1,
                EntityAttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(
                EntityAttributes.ATTACK_SPEED,
                this.attrId(ATTACK_SPEED_ATTRIBUTE),
                0.1,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
