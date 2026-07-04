package net.syshima.sptools.core.effects;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.effect.MobEffectCategory;
import net.syshima.sptools.base.ModStatusEffect;

public class HasteAndLuckEffect extends ModStatusEffect {
    public static final String LUCK_ATTRIBUTE = HasteAndLuckEffect.class.getName().toLowerCase() + ".luck";
    public static final String ATTACK_SPEED_ATTRIBUTE = HasteAndLuckEffect.class.getName().toLowerCase() + ".attack_speed";
    public HasteAndLuckEffect() {
        super(MobEffectCategory.BENEFICIAL, 0x2211DDD);
        this.addAttributeModifier(
                Attributes.LUCK,
                this.attrId(LUCK_ATTRIBUTE),
                1,
                AttributeModifier.Operation.ADD_VALUE);
        this.addAttributeModifier(
                Attributes.ATTACK_SPEED,
                this.attrId(ATTACK_SPEED_ATTRIBUTE),
                0.1,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
