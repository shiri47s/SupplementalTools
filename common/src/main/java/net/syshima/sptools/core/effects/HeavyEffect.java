package net.syshima.sptools.core.effects;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.effect.MobEffectCategory;
import net.syshima.sptools.base.ModStatusEffect;

public class HeavyEffect extends ModStatusEffect {
    private static final String ATTACK_KNOCKBACK_ATTRIBUTE = "heavy.attack_knockback";
    private static final String MOVEMENT_SPEED_ATTRIBUTE = "heavy.movement_speed";

    public HeavyEffect() {
        super(MobEffectCategory.BENEFICIAL, 0x888888);
        this.addAttributeModifier(
                Attributes.ATTACK_KNOCKBACK,
                this.attrId(ATTACK_KNOCKBACK_ATTRIBUTE),
                0.25,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
        this.addAttributeModifier(
                Attributes.MOVEMENT_SPEED,
                this.attrId(MOVEMENT_SPEED_ATTRIBUTE),
                -0.15,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
    }
}
