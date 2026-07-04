package net.syshima.sptools.core.effects;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.player.Player;
import net.syshima.sptools.ModEffects;
import net.syshima.sptools.base.ModStatusEffect;

public class AntiLavaEffect extends ModStatusEffect {
    public static final String BURN_TIME_ATTRIBUTE = AntiLavaEffect.class.getName().toLowerCase() + ".burn_time";

    public AntiLavaEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xFFA54321);
        this.addAttributeModifier(
                Attributes.BURNING_TIME,
                this.attrId(BURN_TIME_ATTRIBUTE),
                -0.91,
                AttributeModifier.Operation.ADD_MULTIPLIED_BASE);
    }

    public static boolean isActive(Object instance) {
        if (!(instance instanceof Player player)) {
            return false;
        }

        return player.hasEffect(ModEffects.get(ModEffects.ANTI_LAVA));
    }
}
