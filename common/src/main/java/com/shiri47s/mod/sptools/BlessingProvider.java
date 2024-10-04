package com.shiri47s.mod.sptools;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;

public class BlessingProvider {
    public static void provide() {
        FullSetsBonus.listen(p -> {
            clearBlessings(p.getA());
            switch (p.getB()) {
                case Bronze -> blessingCopper(p.getA());
                case IronCopper -> blessingIronCopper(p.getA());
                case Amethyst -> blessingAmethyst(p.getA());
                case Emerald -> blessingEmerald(p.getA());
                case Lead -> blessingLead(p.getA());
                case Quartz -> blessingQuartz(p.getA());
            }
        });
    }

    private static void blessingLead(PlayerEntity player) {
        player.setStatusEffect(
                new StatusEffectInstance(
                        Instances.Effect.HEAVY,
                        StatusEffectInstance.INFINITE,
                        1,
                        false,
                        false,
                        false),
                player);
    }

    private static void blessingCopper(PlayerEntity player) {
        player.setStatusEffect(
                new StatusEffectInstance(
                        Instances.Effect.KNOCKBACK_RESISTANCE,
                        StatusEffectInstance.INFINITE,
                        1,
                        false,
                        false,
                        false),
                player);
    }

    private static void blessingIronCopper(PlayerEntity player) {
        player.setStatusEffect(
                new StatusEffectInstance(
                        Instances.Effect.ATTACK_KNOCKBACK,
                        StatusEffectInstance.INFINITE,
                        1,
                        false,
                        false,
                        false),
                player);
    }

    private static void blessingAmethyst(PlayerEntity player) {
        player.setStatusEffect(
                new StatusEffectInstance(
                        Instances.Effect.MOVEMENT_SPEED,
                        StatusEffectInstance.INFINITE,
                        1,
                        false,
                        false,
                        false),
                player);
    }

    private static void blessingEmerald(PlayerEntity player) {
        player.setStatusEffect(
                new StatusEffectInstance(
                        Instances.Effect.HASTE_AND_LUCK,
                        StatusEffectInstance.INFINITE,
                        2,
                        false,
                        false,
                        false),
                player);
    }

    private static void blessingQuartz(PlayerEntity player) {
        player.setStatusEffect(
                new StatusEffectInstance(
                        Instances.Effect.BOUNDED_GLOWING,
                        StatusEffectInstance.INFINITE,
                        1,
                        false,
                        false,
                        false),
                player);
    }

    private static void clearBlessings(PlayerEntity player) {
        player.removeStatusEffect(Instances.Effect.KNOCKBACK_RESISTANCE);
        player.removeStatusEffect(Instances.Effect.ATTACK_KNOCKBACK);
        player.removeStatusEffect(Instances.Effect.MOVEMENT_SPEED);
        player.removeStatusEffect(Instances.Effect.HASTE_AND_LUCK);
        player.removeStatusEffect(Instances.Effect.HEAVY);
        player.removeStatusEffect(Instances.Effect.BOUNDED_GLOWING);
    }
}
