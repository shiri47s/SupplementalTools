package net.syshima.sptools.core.tools;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;

public class DurableTotemOfUndyingUpgraded extends DurableTotemOfUndying {
    public DurableTotemOfUndyingUpgraded(Settings settings) {
        super(settings);
    }

    @Override
    protected void blessing(PlayerEntity playerEntity) {
        playerEntity.setHealth(6.5F);
        playerEntity.clearStatusEffects();
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1200, 1));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 300, 2));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1500, 0));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 1000, 1));

        playerEntity.getWorld().sendEntityStatus(playerEntity, (byte)35);
    }
}
