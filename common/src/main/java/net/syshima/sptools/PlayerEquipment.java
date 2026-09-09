package net.syshima.sptools;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Slot lookups shared by every loader. Previously duplicated verbatim in the
 * Fabric and NeoForge platform implementations.
 */
public final class PlayerEquipment {

    private static final List<EquipmentSlot> ARMOR_SLOTS =
            List.of(EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET);

    private PlayerEquipment() {
    }

    /**
     * Slot the given stack is held or worn in, or {@code null} when the player
     * does not have it equipped.
     */
    @Nullable
    public static EquipmentSlot slotOf(Player player, ItemStack stack) {
        for (InteractionHand hand : InteractionHand.values()) {
            if (stack.is(player.getItemInHand(hand).getItem())) {
                return switch (hand) {
                    case MAIN_HAND -> EquipmentSlot.MAINHAND;
                    case OFF_HAND -> EquipmentSlot.OFFHAND;
                };
            }
        }

        for (EquipmentSlot slot : ARMOR_SLOTS) {
            if (stack.is(player.getItemBySlot(slot).getItem())) {
                return player.getEquipmentSlotForItem(stack);
            }
        }

        return null;
    }

    /**
     * First held or worn stack matching any of the given items, or
     * {@link ItemStack#EMPTY} when none is equipped.
     */
    public static ItemStack findEquipped(Player player, Item... items) {
        for (InteractionHand hand : InteractionHand.values()) {
            ItemStack stack = player.getItemInHand(hand);
            if (matches(stack, items)) {
                return stack;
            }
        }

        for (EquipmentSlot slot : ARMOR_SLOTS) {
            ItemStack stack = player.getItemBySlot(slot);
            if (matches(stack, items)) {
                return stack;
            }
        }

        return ItemStack.EMPTY;
    }

    private static boolean matches(ItemStack stack, Item... items) {
        for (Item item : items) {
            if (stack.is(item)) {
                return true;
            }
        }

        return false;
    }
}
