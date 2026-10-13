package net.syshima.sptools;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffect;
import net.syshima.sptools.core.effects.AntiLavaEffect;
import net.syshima.sptools.core.effects.AttackKnockBackEffect;
import net.syshima.sptools.core.effects.BoundedGlowingEffect;
import net.syshima.sptools.core.effects.HasteAndLuckEffect;
import net.syshima.sptools.core.effects.HeavyEffect;
import net.syshima.sptools.core.effects.KnockBackResistanceEffect;
import net.syshima.sptools.core.effects.MovementSpeedEffect;
import net.syshima.sptools.core.effects.RedstoneOverflowEffect;

public final class ModEffects {
    private static final DeferredRegister<MobEffect> REGISTER = DeferredRegister.create(Constants.MOD_ID, Registries.MOB_EFFECT);

    public static final RegistrySupplier<MobEffect> ANTI_LAVA = REGISTER.register(Constants.Effects.ANTI_LAVA, AntiLavaEffect::new);
    public static final RegistrySupplier<MobEffect> ATTACK_KNOCKBACK = REGISTER.register(Constants.Effects.ATTACK_KNOCKBACK, AttackKnockBackEffect::new);
    public static final RegistrySupplier<MobEffect> BOUNDED_GLOWING = REGISTER.register(Constants.Effects.BOUNDED_GLOWING, BoundedGlowingEffect::new);
    public static final RegistrySupplier<MobEffect> HASTE_AND_LUCK = REGISTER.register(Constants.Effects.HASTE_AND_LUCK, HasteAndLuckEffect::new);
    public static final RegistrySupplier<MobEffect> HEAVY = REGISTER.register(Constants.Effects.HEAVY, HeavyEffect::new);
    public static final RegistrySupplier<MobEffect> KNOCKBACK_RESISTANCE = REGISTER.register(Constants.Effects.KNOCKBACK_RESISTANCE, KnockBackResistanceEffect::new);
    public static final RegistrySupplier<MobEffect> MOVEMENT_SPEED = REGISTER.register(Constants.Effects.MOVEMENT_SPEED, MovementSpeedEffect::new);
    public static final RegistrySupplier<MobEffect> REDSTONE_OVERFLOW = REGISTER.register(Constants.Effects.REDSTONE_OVERFLOW, RedstoneOverflowEffect::new);

    private ModEffects() {
    }

    public static void register() {
        REGISTER.register();
    }

    /**
     * The registry's own holder for an effect.
     *
     * <p>Active effects are keyed by holder identity, and those decoded from saves or
     * packets use the registry's reference. The supplier is a holder too, but not that one.
     */
    public static Holder<MobEffect> holder(RegistrySupplier<MobEffect> effect) {
        return BuiltInRegistries.MOB_EFFECT.getOrThrow(effect.getKey());
    }
}
