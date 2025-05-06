package net.syshima.sptools;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.syshima.sptools.core.effects.*;

public final class ModEffects {
    private static final DeferredRegister<StatusEffect> REGISTER = DeferredRegister.create(Constants.MOD_ID, RegistryKeys.STATUS_EFFECT);

    public static final StatusEffect ANTI_LAVA;
    public static final StatusEffect ATTACK_KNOCKBACK;
    public static final StatusEffect BOUNDED_GLOWING;
    public static final StatusEffect HASTE_AND_LUCK;
    public static final StatusEffect HEAVY;
    public static final StatusEffect KNOCKBACK_RESISTANCE;
    public static final StatusEffect MOVEMENT_SPEED;
    public static final StatusEffect REDSTONE_OVERFLOW;

    public static final RegistryEntry<StatusEffect> ANTI_LAVA_ENTRY;
    public static final RegistryEntry<StatusEffect> ATTACK_KNOCKBACK_ENTRY;
    public static final RegistryEntry<StatusEffect> BOUNDED_GLOWING_ENTRY;
    public static final RegistryEntry<StatusEffect> HASTE_AND_LUCK_ENTRY;
    public static final RegistryEntry<StatusEffect> HEAVY_ENTRY;
    public static final RegistryEntry<StatusEffect> KNOCKBACK_RESISTANCE_ENTRY;
    public static final RegistryEntry<StatusEffect> MOVEMENT_SPEED_ENTRY;
    public static final RegistryEntry<StatusEffect> REDSTONE_OVERFLOW_ENTRY;

    static {
        var antiLava = REGISTER.register(ofId(Constants.Effect.ANTI_LAVA), AntiLavaEffect::new);
        var attackKnockback = REGISTER.register(ofId(Constants.Effect.ATTACK_KNOCKBACK), AttackKnockBackEffect::new);
        var boundedGlowing = REGISTER.register(ofId(Constants.Effect.BOUNDED_GLOWING), BoundedGlowingEffect::new);
        var hasteAndLuck = REGISTER.register(ofId(Constants.Effect.HASTE_AND_LUCK), HasteAndLuckEffect::new);
        var heavy = REGISTER.register(ofId(Constants.Effect.HEAVY), HeavyEffect::new);
        var knockBackResistance = REGISTER.register(ofId(Constants.Effect.KNOCKBACK_RESISTANCE), KnockBackResistanceEffect::new);
        var movementSpeed = REGISTER.register(ofId(Constants.Effect.MOVEMENT_SPEED), MovementSpeedEffect::new);
        var redstoneOverflow = REGISTER.register(ofId(Constants.Effect.REDSTONE_OVERFLOW), RedstoneOverflowEffect::new);

        REGISTER.register();

        ANTI_LAVA = antiLava.get();
        ATTACK_KNOCKBACK = attackKnockback.get();
        BOUNDED_GLOWING = boundedGlowing.get();
        HASTE_AND_LUCK = hasteAndLuck.get();
        HEAVY = heavy.get();
        KNOCKBACK_RESISTANCE = knockBackResistance.get();
        MOVEMENT_SPEED = movementSpeed.get();
        REDSTONE_OVERFLOW = redstoneOverflow.get();

        ANTI_LAVA_ENTRY = Registries.STATUS_EFFECT.getEntry(antiLava.getId()).orElseThrow();
        ATTACK_KNOCKBACK_ENTRY = Registries.STATUS_EFFECT.getEntry(attackKnockback.getId()).orElseThrow();
        BOUNDED_GLOWING_ENTRY = Registries.STATUS_EFFECT.getEntry(boundedGlowing.getId()).orElseThrow();
        HASTE_AND_LUCK_ENTRY = Registries.STATUS_EFFECT.getEntry(hasteAndLuck.getId()).orElseThrow();
        HEAVY_ENTRY = Registries.STATUS_EFFECT.getEntry(heavy.getId()).orElseThrow();
        KNOCKBACK_RESISTANCE_ENTRY = Registries.STATUS_EFFECT.getEntry(knockBackResistance.getId()).orElseThrow();
        MOVEMENT_SPEED_ENTRY = Registries.STATUS_EFFECT.getEntry(movementSpeed.getId()).orElseThrow();
        REDSTONE_OVERFLOW_ENTRY = Registries.STATUS_EFFECT.getEntry(redstoneOverflow.getId()).orElseThrow();
    }

    public static void register() {
        FullEquipmentBenefits.boostrap();
    }

    private static Identifier ofId(String name) {
        var id = Identifier.of(Constants.MOD_ID, name);
        RegistryKey.of(RegistryKeys.STATUS_EFFECT, id);
        return id;
    }
}
