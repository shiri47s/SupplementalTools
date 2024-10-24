package com.shiri47s.mod.sptools.effects;

import com.shiri47s.mod.sptools.Instances;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class AntiLavaEffect extends StatusEffect {
    public AntiLavaEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xFFA54321);
    }

    public static boolean isActive(Object instance) {
        if (!(instance instanceof PlayerEntity player)) {
            return false;
        }

        return player.hasStatusEffect(Instances.Effect.ANTI_LAVA);
    }
}
