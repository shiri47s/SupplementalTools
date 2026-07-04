package net.syshima.sptools.core.effects;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.Level;
import net.syshima.sptools.Constants;
import net.syshima.sptools.base.ModStatusEffect;
import net.syshima.sptools.core.armors.RedstoneArmorItem;

import java.util.ArrayList;
import java.util.List;

public class RedstoneOverflowEffect extends ModStatusEffect {

    private static final double AMOUNT_BASE = 0.16;
    private static final Identifier MODIFIER_ID = Identifier.fromNamespaceAndPath(Constants.MOD_ID, RedstoneOverflowEffect.class.getName().toLowerCase());

    public RedstoneOverflowEffect() {
        super(MobEffectCategory.BENEFICIAL, 0xFF0000);
    }

    public static void effect(Level world, Player player) {
        if (world.getGameTime() % 5 == 0) {
            int power = getPower(world.getBestNeighborSignal(player.blockPosition()));
            var amount = AMOUNT_BASE * power;
            applyAttribute(player.getAttribute(Attributes.ATTACK_SPEED), amount);
            applyAttribute(player.getAttribute(Attributes.BLOCK_BREAK_SPEED), amount);
            var armors = getArmors(player);
            for (var armor : armors) {
                if (armor.getItem() instanceof RedstoneArmorItem armorItem) {
                    armorItem.receivePower(power);
                }
            }
        }
    }

    public static void clear(Player player) {
        removeModifier(player.getAttribute(Attributes.ATTACK_SPEED));
        removeModifier(player.getAttribute(Attributes.BLOCK_BREAK_SPEED));
    }

    private static List<ItemStack> getArmors(Player player) {
        var armors = new ArrayList<ItemStack>();
        for(EquipmentSlot slot : EquipmentSlot.VALUES) {
            ItemStack itemStack = player.getItemBySlot(slot);
            if (slot.getType() == EquipmentSlot.Type.HUMANOID_ARMOR) {
                armors.add(itemStack);
            }
        }

        return armors;
    }

    private static void removeModifier(AttributeInstance attribute) {
        if (attribute == null) {
            return;
        }

        var oldModifier = attribute.getModifier(MODIFIER_ID);
        if (oldModifier != null) {
            attribute.removeModifier(MODIFIER_ID);
        }
    }

    private static void applyAttribute(AttributeInstance attribute, double amount) {
        if (attribute == null) {
            return;
        }

        removeModifier(attribute);
        var newModifier = new AttributeModifier(
                MODIFIER_ID,
                amount,
                AttributeModifier.Operation.ADD_MULTIPLIED_TOTAL);
        attribute.addPermanentModifier(newModifier);
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
