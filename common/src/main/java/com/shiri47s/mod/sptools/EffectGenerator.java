package com.shiri47s.mod.sptools;

import com.shiri47s.mod.sptools.effects.AttackKnockBackEffect;
import com.shiri47s.mod.sptools.effects.HasteAndLuckEffect;
import com.shiri47s.mod.sptools.effects.KnockBackResistanceEffect;
import com.shiri47s.mod.sptools.effects.MovementSpeedEffect;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.RegistryKeys;

public class EffectGenerator {

    private static final DeferredRegister<StatusEffect> effectRegister = DeferredRegister.create(Constants.MOD_ID, RegistryKeys.STATUS_EFFECT);

    public static void generate() {
        effectRegister.register(Constants.Effect.KNOCKBACK_RESISTANCE, KnockBackResistanceEffect::new);
        effectRegister.register(Constants.Effect.ATTACK_KNOCKBACK, AttackKnockBackEffect::new);
        effectRegister.register(Constants.Effect.MOVEMENT_SPEED, MovementSpeedEffect::new);
        effectRegister.register(Constants.Effect.HASTE_AND_LUCK, HasteAndLuckEffect::new);

        effectRegister.register();
    }
}
