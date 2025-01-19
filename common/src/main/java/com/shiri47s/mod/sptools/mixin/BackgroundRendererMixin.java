package com.shiri47s.mod.sptools.mixin;

import com.shiri47s.mod.sptools.Instances;
import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Fog;
import net.minecraft.client.render.FogShape;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BackgroundRenderer.class)
public class BackgroundRendererMixin {
    @Inject(method = "applyFog", at = @At("TAIL"), cancellable = true)
    private static void applyFogInLava(Camera camera, BackgroundRenderer.FogType fogType, Vector4f color, float viewDistance, boolean thickenFog, float tickDelta, CallbackInfoReturnable<Fog> cir) {
        var submersionType = camera.getSubmersionType();
        if (submersionType == CameraSubmersionType.LAVA) {
            MinecraftClient client = MinecraftClient.getInstance();
            if (client != null && client.player != null && client.player.getWorld().isClient()) {
                if (client.player.hasStatusEffect(Instances.Effect.ANTI_LAVA)) {
                    cir.setReturnValue(new Fog(0.25F, viewDistance * 0.5F, FogShape.SPHERE,  color.x, color.y, color.z, color.w));
                }
            }
        }

        cir.cancel();
    }
}
