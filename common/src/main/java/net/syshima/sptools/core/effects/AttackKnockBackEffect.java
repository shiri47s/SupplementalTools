package net.syshima.sptools.core.effects;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.syshima.sptools.base.ModStatusEffect;

public class AttackKnockBackEffect extends ModStatusEffect {
    public static final String ATTACK_KNOCKBACK_ATTRIBUTE = AttackKnockBackEffect.class.getName().toLowerCase() + ".attack_knockback";
    public AttackKnockBackEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x44AA33);
        this.addAttributeModifier(
                EntityAttributes.ATTACK_KNOCKBACK,
                this.attrId(ATTACK_KNOCKBACK_ATTRIBUTE),
                0.2,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
