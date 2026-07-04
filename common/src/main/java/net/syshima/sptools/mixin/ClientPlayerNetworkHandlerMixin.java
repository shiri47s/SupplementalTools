package net.syshima.sptools.mixin;

import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.syshima.sptools.ModItems;
import net.syshima.sptools.ModMain;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientPacketListener.class)
public abstract class ClientPlayerNetworkHandlerMixin {

    @Inject(method = "getActiveDeathProtector", at = @At(value = "HEAD"), cancellable = true)
    private static void sptools$getActiveDeathProtector(Player player, CallbackInfoReturnable<ItemStack> cir) {
        ItemStack item = ModMain.PLATFORM.getItemIfEquipment(
                player,
                ModItems.DURABLE_TOTEM_OF_UNDYING_UPGRADED.get(),
                ModItems.DURABLE_TOTEM_OF_UNDYING.get());
        if (item != null)
        {
            cir.setReturnValue(item);
        }
    }
}
