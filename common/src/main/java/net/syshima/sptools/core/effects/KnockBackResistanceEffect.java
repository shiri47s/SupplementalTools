package net.syshima.sptools.core.effects;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.effect.MobEffectCategory;
import net.syshima.sptools.base.ModStatusEffect;

public final class KnockBackResistanceEffect extends ModStatusEffect {
    public static final String KNOCKBACK_RESISTANCE_ATTRIBUTE = KnockBackResistanceEffect.class.getName().toLowerCase() + ".knockback_resistance";
    public KnockBackResistanceEffect() {
        super(MobEffectCategory.BENEFICIAL, 0x4477BB);
        this.addAttributeModifier(
                Attributes.KNOCKBACK_RESISTANCE,
                this.attrId(KNOCKBACK_RESISTANCE_ATTRIBUTE),
                1,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
