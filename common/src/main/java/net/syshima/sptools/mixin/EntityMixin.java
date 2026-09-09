package net.syshima.sptools.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.tags.DamageTypeTags;
import net.syshima.sptools.core.effects.AntiLavaEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixin {
    @Inject(
            method = "isInvulnerableToBase(Lnet/minecraft/world/damagesource/DamageSource;)Z",
            at = @At("HEAD"),
            cancellable = true)
    private void sptools$isInvulnerableTo(DamageSource damageSource, CallbackInfoReturnable<Boolean> cir) {
        if (AntiLavaEffect.isActive((Entity) (Object) this)) {
            if (damageSource.is(DamageTypeTags.IS_FIRE)
                    || damageSource.is(DamageTypes.LAVA)
                    || damageSource.is(DamageTypes.CAMPFIRE)
                    || damageSource.is(DamageTypes.FIREBALL)
                    || damageSource.is(DamageTypes.ON_FIRE)) {
                cir.setReturnValue(true);
            }
        }
    }
}
