package net.syshima.sptools.core.effects;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import net.syshima.sptools.base.ModStatusEffect;

public class BoundedGlowingEffect extends ModStatusEffect {
    private static final double RANGE = 12.0;
    private static final int DURATION = 100;

    /**
     * Ticks between sweeps. Well inside {@link #DURATION}, so the glow never lapses
     * between two sweeps while the carrier keeps the effect.
     */
    private static final int INTERVAL = 20;

    /**
     * Renew a glow with no more than this left. One sweep of headroom covers the case
     * where the carrier has already ticked past this sweep when the target ticks.
     */
    private static final int RENEW_BELOW = INTERVAL * 2;

    public BoundedGlowingEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xDDEEFF);
    }

    /**
     * {@inheritDoc}
     *
     * <p>For an infinite effect the game passes the carrier's tick count here rather
     * than a remaining duration, so this reads as a steady interval either way.
     */
    @Override
    public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
        return duration % INTERVAL == 0;
    }

    @Override
    public boolean applyEffectTick(ServerLevel level, LivingEntity carrier, int amplifier) {
        AABB box = AABB.ofSize(carrier.position(), RANGE * 2, RANGE * 2, RANGE * 2);

        for (LivingEntity entity : level.getEntitiesOfClass(LivingEntity.class, box, LivingEntity::isAlive)) {
            if (entity == carrier || glowsPastNextSweep(entity)) {
                continue;
            }

            entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, DURATION, 1, false, false, false));
        }

        return true;
    }

    /**
     * Whether the entity's glow is certain to outlast the next sweep.
     *
     * <p>Testing only that the effect is present let it lapse: {@link #DURATION} is a
     * whole number of sweeps, so the tick a glow expires on is the tick a sweep would
     * have renewed it, and which of the two entities ticks first decided whether the
     * target flickered for up to {@link #INTERVAL} ticks.
     *
     * <p>An endless glow from somewhere else counts as outlasting the sweep and is left
     * alone, so renewing can only ever lengthen a glow, never cut one short.
     */
    private static boolean glowsPastNextSweep(LivingEntity entity) {
        MobEffectInstance glowing = entity.getEffect(MobEffects.GLOWING);
        return glowing != null && !glowing.endsWithin(RENEW_BELOW);
    }
}
