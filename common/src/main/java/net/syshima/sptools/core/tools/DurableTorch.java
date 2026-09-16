package net.syshima.sptools.core.tools;

import net.minecraft.advancements.triggers.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.shapes.CollisionContext;
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
        var slot = PlayerEquipment.slotOf(context.getHand());

        // Defer to the off hand when it holds a block of its own, so using the torch
        // from the main hand does not pre-empt the off-hand stack's own placement the
        // way vanilla would run it. Asking whether that stack was stackable caught
        // snowballs, eggs and wheat as well, which quietly stopped the torch placing
        // whenever any of them sat in the off hand.
        if (context.getHand() == InteractionHand.MAIN_HAND) {
            var offStack = player.getItemInHand(InteractionHand.OFF_HAND);
            if (!offStack.isEmpty() && offStack.getItem() instanceof BlockItem) {
                return InteractionResult.PASS;
            }
        }

        var basePos = context.getClickedPos();
        var baseState = world.getBlockState(basePos);

        var placementContext = new BlockPlaceContext(context);

        var placePos = baseState.canBeReplaced(placementContext)
                ? basePos
                : basePos.relative(context.getClickedFace());

        var placeState = world.getBlockState(placePos);
        if (!placeState.isAir() && !placeState.canBeReplaced()) {
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
        finishPlacement(world, player, placePos, placementState, stack);
        stack.hurtAndBreak(this.getCost(), player, slot);
        alertAboutBreak(player, stack);

        return InteractionResult.SUCCESS;
    }

    /**
     * Everything {@code BlockItem.place} does once the block itself is in the world.
     *
     * <p>Setting the block alone left the torch inaudible to anything listening for a
     * placement - sculk sensors, wardens and allays never heard it - and skipped both
     * the block's own placement callback and the advancement trigger.
     *
     * <p>The sound reaches everyone rather than excluding the placer the way vanilla
     * does. Vanilla can exclude them because the client runs the same placement and
     * predicts the sound; this item returns early on the client, so excluding the
     * placer would leave the one person who placed it hearing nothing.
     */
    private static void finishPlacement(Level world, Player player, BlockPos pos, BlockState state, ItemStack stack) {
        state.getBlock().setPlacedBy(world, pos, state, player, stack);

        if (player instanceof ServerPlayer serverPlayer) {
            CriteriaTriggers.PLACED_BLOCK.trigger(serverPlayer, pos, stack);
        }

        SoundType sound = state.getSoundType();
        world.playSound(null, pos, sound.getPlaceSound(), SoundSource.BLOCKS,
                (sound.getVolume() + 1.0F) / 2.0F, sound.getPitch() * 0.8F);
        world.gameEvent(GameEvent.BLOCK_PLACE, pos, GameEvent.Context.of(player, state));
    }

    @Override
    public void hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        super.hurtEnemy(stack, target, attacker);

        if (!(target instanceof Mob) && !(target instanceof Player)) return;
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
