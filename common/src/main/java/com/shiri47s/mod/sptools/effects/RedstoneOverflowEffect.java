package com.shiri47s.mod.sptools.effects;

import com.shiri47s.mod.sptools.Constants;
import com.shiri47s.mod.sptools.armors.RedstoneArmorItem;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class RedstoneOverflowEffect extends StatusEffect {

    private static final double AMOUNT_BASE = 0.16;
    private static final Identifier MODIFIER_ID = Identifier.of(Constants.MOD_ID, RedstoneOverflowEffect.class.getName().toLowerCase());

    public RedstoneOverflowEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xFF0000);
    }

    public static void effect(World world, PlayerEntity player) {
        if (world.getTime() % 5 == 0) {
            int power = getPower(world.getReceivedRedstonePower(player.getBlockPos()));
            var amount = AMOUNT_BASE * power;
            applyAttribute(player.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_SPEED), amount);
            applyAttribute(player.getAttributeInstance(EntityAttributes.PLAYER_BLOCK_BREAK_SPEED), amount);
            var armors = player.getArmorItems();
            for (var armor : armors) {
                if (armor.getItem() instanceof RedstoneArmorItem armorItem) {
                    armorItem.receivePower(power);
                }
            }
        }
    }

    public static void clear(PlayerEntity player) {
        removeModifier(player.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_SPEED));
        removeModifier(player.getAttributeInstance(EntityAttributes.PLAYER_BLOCK_BREAK_SPEED));
    }

    private static void removeModifier(EntityAttributeInstance attribute) {
        if (attribute == null) {
            return;
        }

        var oldModifier = attribute.getModifier(MODIFIER_ID);
        if (oldModifier != null) {
            attribute.removeModifier(MODIFIER_ID);
        }
    }

    private static void applyAttribute(EntityAttributeInstance attribute, double amount) {
        if (attribute == null) {
            return;
        }

        removeModifier(attribute);
        var newModifier = new EntityAttributeModifier(
                MODIFIER_ID,
                amount,
                EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
        attribute.addPersistentModifier(newModifier);
    }

    private static int getPower(int redstonePower) {
        if (redstonePower == 0) {
            return 0;
        }
        else if (redstonePower <= 2)
        {
            return 1;
        }
        else if (redstonePower <= 4)
        {
            return 2;
        }
        else if (redstonePower <= 6)
        {
            return 3;
        }
        else if (redstonePower <= 8)
        {
            return 4;
        }
        else if (redstonePower <= 10)
        {
            return 5;
        }
        else if (redstonePower <= 12)
        {
            return 6;
        }
        else if (redstonePower <= 14)
        {
            return 7;
        }
        else if (redstonePower == 15)
        {
            return 8;
        }

        return 0;
    }
}
