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
        if (!world.isClient) {
            PlayerEntity player = context.getPlayer();
            if (player == null) {
                return ActionResult.PASS;
            }

            ItemStack itemStack = context.getStack();
            EquipmentSlot slot = PLATFORM.getEquipmentSlot(player, itemStack);
            if (slot == null) {
                return ActionResult.PASS;
            }

            var vec3d = context.getHitPos();
            var direction = context.getSide();
            var fireworkRocketEntity = new FireworkRocketEntity(world, context.getPlayer(), vec3d.x + (double) direction.getOffsetX() * 0.15, vec3d.y + (double) direction.getOffsetY() * 0.15, vec3d.z + (double) direction.getOffsetZ() * 0.15, itemStack);
            spawnFireworkRocket(world, player, fireworkRocketEntity, itemStack, slot);
            this.alertAboutBreak(player, itemStack);

            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }

    @Override
    public ActionResult use(World world, PlayerEntity player, Hand hand) {
        if (player.isGliding()) {
            var used = false;
            if (!world.isClient) {
                var fireworkRocket = new ItemStack(this);
                var itemStack = player.getStackInHand(hand);
                var slot = PLATFORM.getEquipmentSlot(player, fireworkRocket);
                if (slot != null) {
                    var fireworkRocketEntity = new FireworkRocketEntity(world, fireworkRocket, player);
                    this.spawnFireworkRocket(world, player, fireworkRocketEntity, itemStack, slot);
                    used = true;
                }

                alertAboutBreak(player, itemStack);
            }

            if (used) {
                return ActionResult.SUCCESS;
            } else {
                return ActionResult.PASS;
            }
        } else {
            return ActionResult.PASS;
        }
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
