package net.syshima.sptools.core.tools;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import net.syshima.sptools.base.ModDurableItem;

public class DurableFireworkRocket extends ModDurableItem {

    public DurableFireworkRocket(Settings settings) {
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
    protected Text getAlertText() {
        return Text.translatable("item.sptools.durable_firework_rocket.alert");
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        var world = context.getWorld();
        var player = context.getPlayer();
        if (player == null) return ActionResult.PASS;

        var itemStack = context.getStack();
        var slot = PLATFORM.getEquipmentSlot(player, itemStack);
        if (slot == null) return ActionResult.PASS;

        if (world.isClient()) {
            return ActionResult.SUCCESS;
        }

        var vec3d = context.getHitPos();
        var direction = context.getSide();
        var fireworkRocketEntity = new FireworkRocketEntity(
                world,
                player,
                vec3d.x + direction.getOffsetX() * 0.15,
                vec3d.y + direction.getOffsetY() * 0.15,
                vec3d.z + direction.getOffsetZ() * 0.15,
                itemStack
        );

        spawnFireworkRocket(world, player, fireworkRocketEntity, itemStack, slot);
        alertAboutBreak(player, itemStack);

        return ActionResult.SUCCESS;
    }

    @Override
    public ActionResult use(World world, PlayerEntity player, Hand hand) {
        var fireworkRocket = new ItemStack(this);
        var slot = PLATFORM.getEquipmentSlot(player, fireworkRocket);
        if (slot == null) return ActionResult.PASS;

        if (world.isClient()) {
            return ActionResult.SUCCESS;
        }

        var itemStack = player.getStackInHand(hand);
        var fireworkRocketEntity = new FireworkRocketEntity(world, fireworkRocket, player);
        this.spawnFireworkRocket(world, player, fireworkRocketEntity, itemStack, slot);
        alertAboutBreak(player, itemStack);

        return ActionResult.SUCCESS;
    }

    @Override
    public ActionResult useOnEntity(ItemStack stack, PlayerEntity user, LivingEntity entity, Hand hand) {
        return super.useOnEntity(stack, user, entity, hand);
    }

    private void spawnFireworkRocket(World world, PlayerEntity player, FireworkRocketEntity fireworkRocketEntity, ItemStack itemStack, EquipmentSlot slot) {
        world.spawnEntity(fireworkRocketEntity);

        if (!player.getAbilities().creativeMode) {
            itemStack.damage(this.getCost(), player, slot);
        }

        player.incrementStat(Stats.USED.getOrCreateStat(this));
    }
}
