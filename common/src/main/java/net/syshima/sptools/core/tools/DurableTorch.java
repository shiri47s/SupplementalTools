package net.syshima.sptools.core.tools;
import net.minecraft.world.item.Item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.sounds.SoundSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.syshima.sptools.ModBlocks;
import net.syshima.sptools.PlayerEquipment;
import net.syshima.sptools.base.ModDurableItem;
import org.jetbrains.annotations.Nullable;

public class DurableTorch extends ModDurableItem {

    public DurableTorch(Item.Properties settings) {
        super(settings);
    }

    @Override
    protected int getCost() {
        return 3;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        var world = context.getLevel();
        var player = context.getPlayer();
        if (player == null) return InteractionResult.PASS;

        var stack = context.getItemInHand();
        var slot = PlayerEquipment.slotOf(player, stack);
        if (slot == null) return InteractionResult.PASS;

        if (context.getHand() == InteractionHand.MAIN_HAND) {
            var offStack = player.getItemInHand(InteractionHand.OFF_HAND);
            if (!offStack.isEmpty() && offStack.isStackable()) {
                return InteractionResult.PASS;
            }
        }

        var basePos = context.getClickedPos();
        var baseState = world.getBlockState(basePos);

        var placementContext = new BlockPlaceContext(context);

        var placePos = baseState.canBeReplaced(placementContext)
                ? basePos
                : basePos.relative(context.getClickedFace());

        if (!world.getBlockState(placePos).isAir() && !world.getBlockState(placePos).canBeReplaced()) {
            return InteractionResult.PASS;
        }

        var placementState = this.getPlacementStateFor(placePos, placementContext);
        if (placementState == null) return InteractionResult.PASS;

        if (!world.isUnobstructed(placementState, placePos, CollisionContext.empty())) {
            return InteractionResult.PASS;
        }

        if (world.isClientSide()) {
            return InteractionResult.SUCCESS;
        }

        world.setBlockAndUpdate(placePos, placementState);
        world.playSound(null, placePos, SoundEvents.WOOD_PLACE, SoundSource.BLOCKS);
        stack.hurtAndBreak(this.getCost(), player, slot);

        return InteractionResult.SUCCESS;
    }

    @Override
    public void hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.hurtEnemy(stack, target, attacker);

        if (!(target instanceof net.minecraft.world.entity.Mob) && !(target instanceof net.minecraft.world.entity.player.Player)) return;
        if (target.fireImmune()) return;
        if (target.isInWaterOrRain()) return;

        target.igniteForSeconds(1.5F);
    }

    @Override
    protected int getAlertDurability() {
        return 20;
    }

    @Override
    protected Component getAlertText() {
        return Component.translatable("item.sptools.durable_torch.alert");
    }

    @Nullable
    protected BlockState getPlacementStateFor(BlockPos placePos, BlockPlaceContext context) {
        var worldView = context.getLevel();
        var directions = context.getNearestLookingDirections();

        var sideState = ModBlocks.WALL_TORCH_BLOCK.get().getStateForPlacement(context);

        BlockState replacementState = null;

        for (var direction : directions) {
            if (direction != Direction.DOWN.getOpposite()) {
                var candidate = direction == Direction.DOWN
                        ? ModBlocks.TORCH_BLOCK.get().defaultBlockState()
                        : sideState;

                if (candidate != null && candidate.canSurvive(worldView, placePos)) {
                    replacementState = candidate;
                    break;
                }
            }
        }

        return replacementState != null && worldView.isUnobstructed(replacementState, placePos, CollisionContext.empty())
                ? replacementState
                : null;
    }
}
