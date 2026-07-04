package net.syshima.sptools;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.syshima.sptools.core.effects.*;

public final class ModEffects {
    private static final DeferredRegister<MobEffect> REGISTER = DeferredRegister.create(Constants.MOD_ID, Registries.MOB_EFFECT);

    public static final RegistrySupplier<MobEffect> ANTI_LAVA;
    public static final RegistrySupplier<MobEffect> ATTACK_KNOCKBACK;
    public static final RegistrySupplier<MobEffect> BOUNDED_GLOWING;
    public static final RegistrySupplier<MobEffect> HASTE_AND_LUCK;
    public static final RegistrySupplier<MobEffect> HEAVY;
    public static final RegistrySupplier<MobEffect> KNOCKBACK_RESISTANCE;
    public static final RegistrySupplier<MobEffect> MOVEMENT_SPEED;
    public static final RegistrySupplier<MobEffect> REDSTONE_OVERFLOW;

    static {
        ANTI_LAVA = REGISTER.register(ofId(Constants.Effects.ANTI_LAVA), AntiLavaEffect::new);
        ATTACK_KNOCKBACK = REGISTER.register(ofId(Constants.Effects.ATTACK_KNOCKBACK), AttackKnockBackEffect::new);
        BOUNDED_GLOWING = REGISTER.register(ofId(Constants.Effects.BOUNDED_GLOWING), BoundedGlowingEffect::new);
        HASTE_AND_LUCK = REGISTER.register(ofId(Constants.Effects.HASTE_AND_LUCK), HasteAndLuckEffect::new);
        HEAVY  = REGISTER.register(ofId(Constants.Effects.HEAVY), HeavyEffect::new);
        KNOCKBACK_RESISTANCE = REGISTER.register(ofId(Constants.Effects.KNOCKBACK_RESISTANCE), KnockBackResistanceEffect::new);
        MOVEMENT_SPEED = REGISTER.register(ofId(Constants.Effects.MOVEMENT_SPEED), MovementSpeedEffect::new);
        REDSTONE_OVERFLOW = REGISTER.register(ofId(Constants.Effects.REDSTONE_OVERFLOW), RedstoneOverflowEffect::new);

        REGISTER.register();
    }

    public static void register() {
        FullEquipmentBenefits.boostrap();
    }

    public static Holder<MobEffect> get(RegistrySupplier<MobEffect> supplier) {
        return BuiltInRegistries.MOB_EFFECT.get(supplier.getId()).orElseThrow(() -> new IllegalStateException("Could not find status effect " + supplier.getId()));
    }

    private static Identifier ofId(String name) {
        var id = Identifier.fromNamespaceAndPath(Constants.MOD_ID, name);
        ResourceKey.create(Registries.MOB_EFFECT, id);
        return id;
    }
}
