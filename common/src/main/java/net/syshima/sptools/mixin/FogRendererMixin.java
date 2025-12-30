package net.syshima.sptools.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.fog.FogModifier;
import net.minecraft.client.render.fog.FogRenderer;
import net.minecraft.client.render.fog.LavaFogModifier;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.math.ColorHelper;
import net.syshima.sptools.ModEffects;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FogRenderer.class)
public class FogRendererMixin {
    @Inject(
            method = "getFogColor",
            at = @At("RETURN"),
            cancellable = true
    )
    private void injectTransparency(
            Camera camera, float tickProgress, ClientWorld world, int viewDistance, float skyDarkness, boolean thick, CallbackInfoReturnable<Vector4f> cir)
    {
        if (camera.getSubmersionType().name().equalsIgnoreCase("LAVA")) {
            MinecraftClient client = MinecraftClient.getInstance();
            if (client != null && client.player != null && client.player.hasStatusEffect(ModEffects.get(ModEffects.ANTI_LAVA))) {
                FogModifier fogModifier = new LavaFogModifier();
                int color = fogModifier.getFogColor(client.world, camera, viewDistance,  skyDarkness);
                float r = ColorHelper.getRedFloat(color);
                float g = ColorHelper.getGreenFloat(color);
                float b = ColorHelper.getBlueFloat(color);
                cir.setReturnValue(new Vector4f(r, g, b, 0.25F));
            }
        }
    }
}
