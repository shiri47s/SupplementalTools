package net.syshima.sptools.mixin.client;

import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.syshima.sptools.ModItems;
import net.syshima.sptools.PlayerEquipment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/** Makes the client play the totem animation for the mod's durable totems. */
@Mixin(ClientPacketListener.class)
public abstract class ClientPacketListenerMixin {

    @Inject(
            method = "findTotem(Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/item/ItemStack;",
            at = @At("HEAD"),
            cancellable = true)
    private static void sptools$findDurableTotem(Player player, CallbackInfoReturnable<ItemStack> cir) {
        ItemStack stack = PlayerEquipment.findEquipped(
                player,
                ModItems.DURABLE_TOTEM_OF_UNDYING_UPGRADED.get(),
                ModItems.DURABLE_TOTEM_OF_UNDYING.get());
        if (!stack.isEmpty()) {
            cir.setReturnValue(stack);
        }
    }
}
