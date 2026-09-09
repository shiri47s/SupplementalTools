package net.syshima.sptools.mixin;

import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.syshima.sptools.ModItems;
import net.syshima.sptools.PlayerEquipment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientPacketListener.class)
public abstract class ClientPlayerNetworkHandlerMixin {

    @Inject(method = "findTotem", at = @At("HEAD"), cancellable = true)
    private static void sptools$getActiveDeathProtector(Player player, CallbackInfoReturnable<ItemStack> cir) {
        ItemStack stack = PlayerEquipment.findEquipped(
                player,
                ModItems.DURABLE_TOTEM_OF_UNDYING_UPGRADED.get(),
                ModItems.DURABLE_TOTEM_OF_UNDYING.get());
        if (!stack.isEmpty()) {
            cir.setReturnValue(stack);
        }
    }
}
