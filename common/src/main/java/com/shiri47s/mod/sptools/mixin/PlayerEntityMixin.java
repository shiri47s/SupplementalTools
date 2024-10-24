package com.shiri47s.mod.sptools.mixin;

import com.shiri47s.mod.sptools.effects.AntiLavaEffect;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {

    @Inject(at = @At("HEAD"), method = "travel")
    private void sptools$travel(CallbackInfo ci) {
        PlayerEntity player = (PlayerEntity)(Object)this;

        if (player.isInLava() && AntiLavaEffect.isActive(this)) {
            World world = player.getWorld();
            BlockPos pos = player.getBlockPos();
            BlockState state = world.getBlockState(pos.down());
            if (state.getBlock() == Blocks.LAVA) {
                player.setVelocity(player.getVelocity().multiply(1.789F));
            }
        }
    }
}
