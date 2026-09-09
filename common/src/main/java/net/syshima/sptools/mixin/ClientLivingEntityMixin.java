package net.syshima.sptools.mixin;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.syshima.sptools.ModItems;
import net.syshima.sptools.PlayerEquipment;
import net.syshima.sptools.core.tools.DurableTotemOfUndying;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(LivingEntity.class)
public abstract class ClientLivingEntityMixin {

    @Inject(method = "checkTotemDeathProtection", at = @At("HEAD"), cancellable = true)
    private void sptools$tryUseDeathProtector(DamageSource source, CallbackInfoReturnable<Boolean> cir) {
        if (!((LivingEntity) (Object) this instanceof ServerPlayer player)) {
            return;
        }

        var stack = PlayerEquipment.findEquipped(
                player,
                ModItems.DURABLE_TOTEM_OF_UNDYING_UPGRADED.get(),
                ModItems.DURABLE_TOTEM_OF_UNDYING.get());
        if (stack.getItem() instanceof DurableTotemOfUndying totem) {
            totem.trigger(player, stack);
            cir.setReturnValue(true);
        }
    }
}
