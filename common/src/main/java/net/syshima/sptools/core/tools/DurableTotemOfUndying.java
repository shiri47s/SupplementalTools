package net.syshima.sptools.core.tools;
import net.minecraft.world.item.Item;

import net.minecraft.advancements.triggers.CriteriaTriggers;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.stats.Stats;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.gameevent.GameEvent;
import net.syshima.sptools.base.ModDurableItem;

public class DurableTotemOfUndying extends ModDurableItem {

    public DurableTotemOfUndying(Item.Properties settings) {
        super(settings);
    }

    @Override
    protected int getCost() {
        return 150;
    }

    public void trigger(ServerPlayer playerEntity, ItemStack totem) {
        EquipmentSlot slot = PLATFORM.getEquipmentSlot(playerEntity, totem);
        if (slot == null) {
            return;
        }

        playerEntity.awardStat(Stats.ITEM_USED.get(Items.TOTEM_OF_UNDYING));
        ItemStack itemStack = playerEntity.getMainHandItem();
        CriteriaTriggers.USED_TOTEM.trigger(playerEntity, itemStack);
        playerEntity.gameEvent(GameEvent.ITEM_INTERACT_FINISH);
        totem.hurtAndBreak(this.getCost(), playerEntity, slot);

        blessing(playerEntity);

        alertAboutBreak(playerEntity, totem);
    }

    protected void blessing(Player playerEntity) {
        playerEntity.setHealth(2.5F);
        playerEntity.removeAllEffects();
        playerEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 900, 1));
        playerEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 100, 1));
        playerEntity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 800, 0));

        playerEntity.level().broadcastEntityEvent(playerEntity, (byte)35);
    }

    @Override
    protected int getAlertDurability() {
        return this.getCost();
    }

    @Override
    protected Component getAlertText() {
        return Component.translatable("item.sptools.durable_totem_of_undying.alert");
    }
}
