package net.syshima.sptools.core.effects;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.syshima.sptools.base.ModStatusEffect;

import java.util.List;

public class BoundedGlowingEffect extends ModStatusEffect {
    private static final double RANGE = 12.0F;
    private static final int DURATION = 100;
    public BoundedGlowingEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xDDEEFF);
    }

    public static void effect(World world, PlayerEntity player) {
        Vec3d pos = player.getPos();
        double range = BoundedGlowingEffect.RANGE;
        Box box = new Box(
                new Vec3d(pos.x - range, pos.y - range, pos.z - range),
                new Vec3d(pos.x + range, pos.y + range, pos.z + range)
        );

        List<LivingEntity> entities = world.getEntitiesByClass(
                LivingEntity.class,
                box,
                entity -> entity != null && entity.isAlive());

        for (LivingEntity entity : entities) {
            if (entity == player) {
                continue;
            }

            if (!entity.hasStatusEffect(StatusEffects.GLOWING)) {
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, DURATION, 1, false ,false, false));
            }
        }
    }
}
