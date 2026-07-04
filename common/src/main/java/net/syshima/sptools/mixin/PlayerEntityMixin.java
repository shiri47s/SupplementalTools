package net.syshima.sptools.mixin;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.syshima.sptools.core.effects.AntiLavaEffect;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Player.class)
public abstract class PlayerEntityMixin {

    @Inject(at = @At("HEAD"), method = "travel")
    private void sptools$travel(CallbackInfo ci) {
        Player player = (Player)(Object)this;

        if (player.isInLava() && AntiLavaEffect.isActive(this)) {
            Level world = player.level();
            BlockPos pos = player.blockPosition();
            BlockState state = world.getBlockState(pos.below());
            if (state.getBlock() == Blocks.LAVA) {
                player.setDeltaMovement(player.getDeltaMovement().scale(1.789));
            }
        }
    }
}
