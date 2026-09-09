package net.syshima.sptools.core.effects;

import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.Nullable;
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

    /** Whether the entity currently carries the Anti-Lava effect. */
    public static boolean isActive(@Nullable Entity entity) {
        return entity instanceof Player player && player.hasEffect(ModEffects.ANTI_LAVA.asHolder());
    }
}
