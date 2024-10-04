package com.shiri47s.mod.sptools;

import com.shiri47s.mod.sptools.effects.BoundedGlowingEffect;
import dev.architectury.event.events.common.TickEvent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.world.World;

public class EventGenerator {
    public static void generate() {
        TickEvent.SERVER_LEVEL_PRE.register(tick -> tick.getPlayers().forEach(player -> {
            World world = player.getWorld();
            if (!world.isClient) {
                FullSetsBonus.update(player);

                StatusEffectInstance boundedGlowingEffect = player.getStatusEffect(Instances.Effect.BOUNDED_GLOWING);
                if (boundedGlowingEffect != null) {
                    BoundedGlowingEffect.effect(world, player);
                }
            }
        }));
    }
}
