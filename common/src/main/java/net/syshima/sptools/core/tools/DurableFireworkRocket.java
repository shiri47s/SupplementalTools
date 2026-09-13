package net.syshima.sptools.core.tools;

import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.syshima.sptools.PlayerEquipment;
import net.syshima.sptools.base.ModDurableItem;

public class DurableFireworkRocket extends ModDurableItem {

    public DurableFireworkRocket(Item.Properties settings) {
        super(settings);
    }

    @Override
    protected int getCost() {
        return 3;
    }

    @Override
    protected int getAlertDurability() {
        return 20;
    }

    @Override
    protected Component getAlertText() {
        return Component.translatable("item.sptools.durable_firework_rocket.alert");
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        var world = context.getLevel();
        var player = context.getPlayer();
        if (player == null) return InteractionResult.PASS;

        var itemStack = context.getItemInHand();
        var slot = PlayerEquipment.slotOf(context.getHand());

        if (world.isClientSide()) {
            return InteractionResult.SUCCESS;
        }

        var vec3d = context.getClickLocation();
        var direction = context.getClickedFace();
        var fireworkRocketEntity = new FireworkRocketEntity(
                world,
                player,
                vec3d.x + direction.getStepX() * 0.15,
                vec3d.y + direction.getStepY() * 0.15,
                vec3d.z + direction.getStepZ() * 0.15,
                itemStack
        );

        spawnFireworkRocket(world, player, fireworkRocketEntity, itemStack, slot);
        alertAboutBreak(player, itemStack);

        return InteractionResult.SUCCESS;
    }

    @Override
    public InteractionResult use(Level world, Player player, InteractionHand hand) {
        if (world.isClientSide()) {
            return InteractionResult.SUCCESS;
        }

        // The hand already names the slot. Looking it up from a throwaway stack matched
        // the slot by item, so holding rockets in both hands damaged one stack while
        // reporting the other one's slot.
        var slot = PlayerEquipment.slotOf(hand);
        var itemStack = player.getItemInHand(hand);
        var fireworkRocketEntity = new FireworkRocketEntity(world, itemStack, player);
        this.spawnFireworkRocket(world, player, fireworkRocketEntity, itemStack, slot);
        alertAboutBreak(player, itemStack);

        return InteractionResult.SUCCESS;
    }

    private void spawnFireworkRocket(Level world, Player player, FireworkRocketEntity fireworkRocketEntity, ItemStack itemStack, EquipmentSlot slot) {
        world.addFreshEntity(fireworkRocketEntity);

        if (!player.getAbilities().instabuild) {
            itemStack.hurtAndBreak(this.getCost(), player, slot);
        }

        player.awardStat(Stats.ITEM_USED.get(this));
    }
}
