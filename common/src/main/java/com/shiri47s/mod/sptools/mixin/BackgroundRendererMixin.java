package com.shiri47s.mod.sptools.mixin;

import com.mojang.blaze3d.systems.RenderSystem;
import com.shiri47s.mod.sptools.Instances;
import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BackgroundRenderer.class)
public class BackgroundRendererMixin {
    @Inject(method = "applyFog", at = @At("TAIL"))
    private static void applyFogInLava(Camera camera, BackgroundRenderer.FogType fogType, float viewDistance, boolean thickFog, float tickDelta, CallbackInfo ci) {
        var submersionType = camera.getSubmersionType();
        if (submersionType == CameraSubmersionType.LAVA) {
            MinecraftClient client = MinecraftClient.getInstance();
            if (client != null && client.player != null && client.player.getWorld().isClient()) {
                if (client.player.hasStatusEffect(Instances.Effect.ANTI_LAVA)) {
                    RenderSystem.setShaderFogStart(0.25F);
                    RenderSystem.setShaderFogEnd(viewDistance * 0.5F);
                }
            }
        }
    }
}
