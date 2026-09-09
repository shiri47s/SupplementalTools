package net.syshima.sptools.mixin.client;

import net.minecraft.client.Camera;
import net.minecraft.client.DeltaTracker;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.fog.FogData;
import net.minecraft.client.renderer.fog.FogRenderer;
import net.minecraft.world.level.material.FogType;
import net.syshima.sptools.core.effects.AntiLavaEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FogRenderer.class)
public class FogRendererMixin {

    // When submerged in lava with the Anti-Lava effect, push the dense lava fog
    // far out so the player can see, keeping only a faint orange tint.
    @Inject(
            method = "setupFog(Lnet/minecraft/client/Camera;ILnet/minecraft/client/DeltaTracker;FLnet/minecraft/client/multiplayer/ClientLevel;)Lnet/minecraft/client/renderer/fog/FogData;",
            at = @At("RETURN"))
    private void sptools$clearLavaFog(Camera camera, int renderDistance, DeltaTracker deltaTracker,
                                       float partialTick, ClientLevel level, CallbackInfoReturnable<FogData> cir) {
        if (camera.getFluidInCamera() != FogType.LAVA) {
            return;
        }

        Minecraft client = Minecraft.getInstance();
        if (client.player == null || !AntiLavaEffect.isActive(client.player)) {
            return;
        }

        // setupFog allocates a fresh FogData per call, so mutating it here cannot
        // leak into other frames.
        FogData data = cir.getReturnValue();
        if (data == null) {
            return;
        }

        data.environmentalStart = 24.0F;
        data.environmentalEnd = 192.0F;
        data.renderDistanceStart = 24.0F;
        data.renderDistanceEnd = 192.0F;
        if (data.color != null) {
            data.color.w = 0.25F;
        }
    }
}
