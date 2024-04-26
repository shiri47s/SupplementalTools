package com.shiri47s.mod.sptools;

import com.shiri47s.mod.sptools.effects.*;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.RegistryKeys;

public class EffectGenerator {

    private static final DeferredRegister<StatusEffect> EFFECT_REGISTER = DeferredRegister.create(Constants.MOD_ID, RegistryKeys.STATUS_EFFECT);

    public static void generate() {
        EFFECT_REGISTER.register(Constants.Effect.KNOCKBACK_RESISTANCE, KnockBackResistanceEffect::new);
        EFFECT_REGISTER.register(Constants.Effect.ATTACK_KNOCKBACK, AttackKnockBackEffect::new);
        EFFECT_REGISTER.register(Constants.Effect.MOVEMENT_SPEED, MovementSpeedEffect::new);
        EFFECT_REGISTER.register(Constants.Effect.HASTE_AND_LUCK, HasteAndLuckEffect::new);
        EFFECT_REGISTER.register(Constants.Effect.HEAVY, HeavyEffect::new);

        EFFECT_REGISTER.register();
    }
}
