package com.shiri47s.mod.sptools.mixin;

import com.shiri47s.mod.sptools.effects.AntiLavaEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageTypes;
import net.minecraft.registry.tag.DamageTypeTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public abstract class EntityMixin {
    @Inject(method = "isAlwaysInvulnerableTo", at = @At(value = "HEAD", target = "net/minecraft/entity/Entity.isInvulnerableTo(Lnet/minecraft/entity/damage/DamageSource;)Z"), cancellable = true)
    private void sptools$isInvulnerableTo(DamageSource damageSource, CallbackInfoReturnable<Boolean> cir) {
        if (AntiLavaEffect.isActive(this)) {
            if (damageSource.isIn(DamageTypeTags.IS_FIRE)
                    || damageSource.isOf(DamageTypes.LAVA)
                    || damageSource.isOf(DamageTypes.CAMPFIRE)
                    || damageSource.isOf(DamageTypes.FIREBALL)
                    || damageSource.isOf(DamageTypes.ON_FIRE)) {
                cir.setReturnValue(true);
            }
        }
    }
}
