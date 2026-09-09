package net.syshima.sptools.core.effects;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.effect.MobEffectCategory;
import net.syshima.sptools.base.ModStatusEffect;

public class AttackKnockBackEffect extends ModStatusEffect {
    private static final String ATTACK_KNOCKBACK_ATTRIBUTE = "attack_knockback.attack_knockback";
    public AttackKnockBackEffect() {
        super(MobEffectCategory.BENEFICIAL, 0x44AA33);
        this.addAttributeModifier(
                Attributes.ATTACK_KNOCKBACK,
                this.attrId(ATTACK_KNOCKBACK_ATTRIBUTE),
                0.2,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
