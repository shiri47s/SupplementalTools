package net.syshima.sptools.core.effects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.Level;
import net.syshima.sptools.base.ModStatusEffect;

import java.util.List;

public class BoundedGlowingEffect extends ModStatusEffect {
    private static final double RANGE = 12.0F;
    private static final int DURATION = 100;
    public BoundedGlowingEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xDDEEFF);
    }

    public static void effect(Level world, Player player) {
        Vec3 pos = player.position();
        double range = BoundedGlowingEffect.RANGE;
        AABB box = new AABB(
                new Vec3(pos.x - range, pos.y - range, pos.z - range),
                new Vec3(pos.x + range, pos.y + range, pos.z + range)
        );

        List<LivingEntity> entities = world.getEntitiesOfClass(
                LivingEntity.class,
                box,
                entity -> entity != null && entity.isAlive());

        for (LivingEntity entity : entities) {
            if (entity == player) {
                continue;
            }

            if (!entity.hasEffect(MobEffects.GLOWING)) {
                entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, DURATION, 1, false ,false, false));
            }
        }
    }
}
