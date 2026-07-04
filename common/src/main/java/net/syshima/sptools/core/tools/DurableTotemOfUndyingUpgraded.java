package net.syshima.sptools.core.tools;
import net.minecraft.world.item.Item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;

public class DurableTotemOfUndyingUpgraded extends DurableTotemOfUndying {
    public DurableTotemOfUndyingUpgraded(Item.Properties settings) {
        super(settings);
    }

    @Override
    protected void blessing(Player playerEntity) {
        playerEntity.setHealth(6.5F);
        playerEntity.removeAllEffects();
        playerEntity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1200, 1));
        playerEntity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 300, 2));
        playerEntity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1500, 0));
        playerEntity.addEffect(new MobEffectInstance(MobEffects.RESISTANCE, 1000, 1));

        playerEntity.level().broadcastEntityEvent(playerEntity, (byte)35);
    }
}
