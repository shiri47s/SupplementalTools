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

    // Vanilla drowns the view at one block (environmentalEnd = 1.0). Submerged in lava
    // the visible geometry is only a few blocks out, so the ramp has to stay short to
    // register at all - pushing it far out reads as no fog whatsoever.
    private static final float FOG_START = 0.0F;
    private static final float FOG_END = 10.0F;
    private static final float FOG_STRENGTH = 0.85F;

    // When submerged in lava with the Anti-Lava effect, stretch the dense lava fog far
    // enough to navigate by, while keeping a red haze that thickens with distance.
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

        // The render distance range is left alone: this ramp saturates long before it,
        // and the shader takes the stronger of the two.
        data.environmentalStart = FOG_START;
        data.environmentalEnd = FOG_END;
        if (data.color != null) {
            // The colour itself stays the vanilla lava tint; only its strength is adjusted.
            data.color.w = FOG_STRENGTH;
        }
    }
}
