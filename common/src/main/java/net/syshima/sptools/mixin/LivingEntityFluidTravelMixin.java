package net.syshima.sptools.mixin;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.Vec3;
import net.syshima.sptools.core.effects.AntiLavaEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Makes lava handle like water for entities with the Anti-Lava effect.
 *
 * <p>Lava movement is far heavier than water: horizontal drag 0.5 against water's 0.8
 * (0.9 sprinting), a flat 0.02 acceleration instead of {@code 0.546 * getSpeed()}, and
 * no sprint or swim handling. Running the water routine instead lifts all of that at
 * once, rather than scaling the velocity up by hand.
 *
 * <p>{@code travelInLava} is the injection point on purpose. The obvious alternative -
 * flipping the {@code isInWater()} check that selects between the two - is not portable:
 * vanilla keeps that branch in {@code travelInFluid(Vec3)}, while NeoForge patches
 * LivingEntity so the branch moves into a {@code travelInFluid(Vec3, FluidState)}
 * overload, leaving nothing to modify in the one-argument method. This method carries
 * the same descriptor on both loaders.
 *
 * <p>{@code travelInWater} reads no water-specific state, so it behaves correctly in
 * lava. Only movement changes: breathing, submersion and visuals still see lava,
 * because {@code isInWater} itself is untouched.
 */
@Mixin(LivingEntity.class)
public abstract class LivingEntityFluidTravelMixin {

    @Shadow
    protected abstract void travelInWater(Vec3 movementInput, double gravity, boolean falling, double y);

    @Inject(
            method = "travelInLava(Lnet/minecraft/world/phys/Vec3;DZD)V",
            at = @At("HEAD"),
            cancellable = true)
    private void sptools$travelLavaLikeWater(Vec3 movementInput, double gravity, boolean falling, double y,
                                             CallbackInfo ci) {
        if (!AntiLavaEffect.isActive((LivingEntity) (Object) this)) {
            return;
        }

        travelInWater(movementInput, gravity, falling, y);
        ci.cancel();
    }
}
