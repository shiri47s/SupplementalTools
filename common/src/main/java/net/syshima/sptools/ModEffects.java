package net.syshima.sptools;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.syshima.sptools.core.effects.*;

public final class ModEffects {
    private static final DeferredRegister<StatusEffect> REGISTER = DeferredRegister.create(Constants.MOD_ID, RegistryKeys.STATUS_EFFECT);

    public static final RegistrySupplier<StatusEffect> ANTI_LAVA;
    public static final RegistrySupplier<StatusEffect> ATTACK_KNOCKBACK;
    public static final RegistrySupplier<StatusEffect> BOUNDED_GLOWING;
    public static final RegistrySupplier<StatusEffect> HASTE_AND_LUCK;
    public static final RegistrySupplier<StatusEffect> HEAVY;
    public static final RegistrySupplier<StatusEffect> KNOCKBACK_RESISTANCE;
    public static final RegistrySupplier<StatusEffect> MOVEMENT_SPEED;
    public static final RegistrySupplier<StatusEffect> REDSTONE_OVERFLOW;

    static {
        ANTI_LAVA = REGISTER.register(ofId(Constants.Effect.ANTI_LAVA), AntiLavaEffect::new);
        ATTACK_KNOCKBACK = REGISTER.register(ofId(Constants.Effect.ATTACK_KNOCKBACK), AttackKnockBackEffect::new);
        BOUNDED_GLOWING = REGISTER.register(ofId(Constants.Effect.BOUNDED_GLOWING), BoundedGlowingEffect::new);
        HASTE_AND_LUCK = REGISTER.register(ofId(Constants.Effect.HASTE_AND_LUCK), HasteAndLuckEffect::new);
        HEAVY  = REGISTER.register(ofId(Constants.Effect.HEAVY), HeavyEffect::new);
        KNOCKBACK_RESISTANCE = REGISTER.register(ofId(Constants.Effect.KNOCKBACK_RESISTANCE), KnockBackResistanceEffect::new);
        MOVEMENT_SPEED = REGISTER.register(ofId(Constants.Effect.MOVEMENT_SPEED), MovementSpeedEffect::new);
        REDSTONE_OVERFLOW = REGISTER.register(ofId(Constants.Effect.REDSTONE_OVERFLOW), RedstoneOverflowEffect::new);

        REGISTER.register();
    }

    public static void register() {
        FullEquipmentBenefits.boostrap();
    }

    public static RegistryEntry<StatusEffect> get(RegistrySupplier<StatusEffect> supplier) {
        return Registries.STATUS_EFFECT.getEntry(supplier.getId()).orElseThrow(() -> new IllegalStateException("Could not find status effect " + supplier.getId()));
    }

    private static Identifier ofId(String name) {
        var id = Identifier.of(Constants.MOD_ID, name);
        RegistryKey.of(RegistryKeys.STATUS_EFFECT, id);
        return id;
    }
}
