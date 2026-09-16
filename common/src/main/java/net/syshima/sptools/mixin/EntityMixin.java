package net.syshima.sptools.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.DamageTypeTags;
import net.syshima.sptools.core.effects.AntiLavaEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/** Makes the Anti-Lava effect shrug off fire damage the way fire immunity does. */
@Mixin(Entity.class)
public abstract class EntityMixin {
    @Inject(
            method = "isInvulnerableToBase(Lnet/minecraft/world/damagesource/DamageSource;)Z",
            at = @At("HEAD"),
            cancellable = true)
    private void sptools$isInvulnerableTo(DamageSource damageSource, CallbackInfoReturnable<Boolean> cir) {
        // Every damage type this guards against is in #minecraft:is_fire - lava,
        // campfire, on_fire and fireball included - and this runs on every hit any
        // entity takes, so the tag alone decides it and does so before the lookup.
        if (damageSource.is(DamageTypeTags.IS_FIRE) && AntiLavaEffect.isActive((Entity) (Object) this)) {
            cir.setReturnValue(true);
        }
    }
}
