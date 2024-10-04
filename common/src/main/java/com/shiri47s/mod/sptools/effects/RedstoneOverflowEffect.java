package com.shiri47s.mod.sptools.effects;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class RedstoneOverflowEffect extends StatusEffect {
    public RedstoneOverflowEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0);
    }

    public static void effect(World world, PlayerEntity player) {
    }
}
