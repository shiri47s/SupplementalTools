package net.syshima.sptools.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.syshima.sptools.ModItems;
import net.syshima.sptools.ModMain;
import net.syshima.sptools.core.tools.DurableTotemOfUndying;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin(LivingEntity.class)
public abstract class ClientLivingEntityMixin {
    @Inject(method = "tryUseDeathProtector", at = @At(value = "HEAD"), cancellable = true)
    private void sptools$tryUseDeathProtector(DamageSource src, CallbackInfoReturnable<Boolean> cir) {
        if (!((LivingEntity)(Object)this instanceof PlayerEntity))
        {
            return;
        }

        var livingEntity = (LivingEntity)(Object)this;
        if (!(livingEntity instanceof ServerPlayerEntity player)) {
            return;
        }

        var stack = ModMain.PLATFORM.getItemIfEquipment(
                player,
                ModItems.DURABLE_TOTEM_OF_UNDYING_UPGRADED.get(),
                ModItems.DURABLE_TOTEM_OF_UNDYING.get());
        if (stack != null)
        {
            var item = stack.getItem();
            if ((item instanceof DurableTotemOfUndying totem)) {
                totem.trigger(player, stack);
                cir.setReturnValue(true);
            }
        }
    }
}
