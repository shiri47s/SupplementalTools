package net.syshima.sptools.core.tools;

import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.world.event.GameEvent;
import net.syshima.sptools.base.ModDurableItem;

public class DurableTotemOfUndying extends ModDurableItem {

    public DurableTotemOfUndying(Settings settings) {
        super(settings);
    }

    @Override
    protected int getCost() {
        return 150;
    }

    public void trigger(ServerPlayerEntity playerEntity, ItemStack totem) {
        EquipmentSlot slot = PLATFORM.getEquipmentSlot(playerEntity, totem);
        if (slot == null) {
            return;
        }

        playerEntity.incrementStat(Stats.USED.getOrCreateStat(Items.TOTEM_OF_UNDYING));
        ItemStack itemStack = playerEntity.getMainHandStack();
        Criteria.USED_TOTEM.trigger(playerEntity, itemStack);
        playerEntity.emitGameEvent(GameEvent.ITEM_INTERACT_FINISH);
        totem.damage(this.getCost(), playerEntity, slot);

        blessing(playerEntity);

        alertAboutBreak(playerEntity, totem);
    }

    protected void blessing(PlayerEntity playerEntity) {
        playerEntity.setHealth(2.5F);
        playerEntity.clearStatusEffects();
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 900, 1));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 100, 1));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 800, 0));

        playerEntity.getWorld().sendEntityStatus(playerEntity, (byte)35);
    }

    @Override
    protected int getAlertDurability() {
        return this.getCost();
    }

    @Override
    protected Text getAlertText() {
        return Text.translatable("item.sptools.durable_totem_of_undying.alert");
    }
}
