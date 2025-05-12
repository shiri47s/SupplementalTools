package net.syshima.sptools.core.tools;

import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Direction;
import net.syshima.sptools.ModBlocks;
import net.syshima.sptools.base.ModDurableItem;
import org.jetbrains.annotations.Nullable;

public class DurableTorch extends ModDurableItem {

    public DurableTorch(Settings settings) {
        super(settings);
    }

    @Override
    protected int getCost() {
        return 3;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        var world = context.getWorld();
        if (!world.isClient) {
            var player = context.getPlayer();
            if (player == null) {
                return ActionResult.PASS;
            }

            var stack = context.getStack();
            var slot = PLATFORM.getEquipmentSlot(player, stack);
            if (slot == null) {
                return ActionResult.PASS;
            }

            if (context.getHand() == Hand.MAIN_HAND) {
                var offStack = player.getStackInHand(Hand.OFF_HAND);
                if (!offStack.isEmpty() && offStack.isStackable()) {
                    return ActionResult.PASS;
                }
            }

            var testState = this.getPlacementState(new ItemPlacementContext(context));
            if (testState == null) {
                return ActionResult.PASS;
            }

            var side = context.getSide();
            var blockPos = context.getBlockPos();
            var hitPos = blockPos.offset(side);
            var blockState = world.getBlockState(hitPos);
            if (blockState.isAir()) {
                if (!context.getWorld().canPlace(blockState, blockPos, ShapeContext.absent())) {
                    return ActionResult.PASS;
                }

                BlockState placementState;
                if (side == Direction.UP || side == Direction.DOWN) {
                    if (!world.getBlockState(hitPos.down()).isSolidBlock(world, hitPos.down())) {
                        return ActionResult.PASS;
                    }

                    placementState = ModBlocks.TORCH_BLOCK.get().getDefaultState();
                }
                else {
                    placementState = ModBlocks.WALL_TORCH_BLOCK.get().getPlacementState(new ItemPlacementContext(context));
                }

                world.setBlockState(hitPos, placementState);
                world.playSound(null, hitPos, SoundEvents.BLOCK_WOOD_PLACE, SoundCategory.BLOCKS);
                stack.damage(this.getCost(), player, slot);

                return ActionResult.SUCCESS;
            }
        }

        return ActionResult.PASS;
    }

    @Override
    public void postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.postHit(stack, target, attacker);

        if (!target.isMobOrPlayer()) {
            return;
        }

        if (target.isFireImmune()) {
            return;
        }

        if (target.isTouchingWaterOrRain()) {
            return;
        }

        target.setOnFire(true);
        target.setOnFireFor(1.5F);
    }

    @Override
    protected int getAlertDurability() {
        return 20;
    }

    @Override
    protected Text getAlertText() {
        return Text.translatable("item.sptools.durable_torch.alert");
    }

    @Nullable
    protected BlockState getPlacementState(ItemPlacementContext context) {
        var sideState = ModBlocks.WALL_TORCH_BLOCK.get().getPlacementState(context);
        BlockState replacementState = null;
        var worldView = context.getWorld();
        var blockPos = context.getBlockPos();
        var directions = context.getPlacementDirections();

        for (var direction : directions) {
            if (direction != Direction.DOWN.getOpposite()) {
                var hisState = direction == Direction.DOWN ? ModBlocks.TORCH_BLOCK.get().getPlacementState(context) : sideState;
                if (hisState != null && hisState.canPlaceAt(worldView, blockPos)) {
                    replacementState = hisState;
                    break;
                }
            }
        }

        return replacementState != null && worldView.canPlace(replacementState, blockPos, ShapeContext.absent()) ? replacementState : null;
    }
}
