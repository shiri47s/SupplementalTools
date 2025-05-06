package net.syshima.sptools.core.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.syshima.sptools.base.ModStatusEffect;

public final class KnockBackResistanceEffect extends ModStatusEffect {
    public static final String KNOCKBACK_RESISTANCE_ATTRIBUTE = KnockBackResistanceEffect.class.getName().toLowerCase() + ".knockback_resistance";
    public KnockBackResistanceEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x4477BB);
        this.addAttributeModifier(
                EntityAttributes.KNOCKBACK_RESISTANCE,
                this.attrId(KNOCKBACK_RESISTANCE_ATTRIBUTE),
                1,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
