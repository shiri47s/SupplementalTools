package net.syshima.sptools;

import dev.architectury.platform.Platform;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.syshima.sptools.compat.TrinketsCompat;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Slot lookups shared by every loader. Hands and armour are handled directly;
 * accessory slots are delegated to Trinkets Updated when it is installed.
 */
public final class PlayerEquipment {

    private static final List<EquipmentSlot> ARMOR_SLOTS =
            List.of(EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET);

    /** Mod id Trinkets Updated registers itself under. */
    private static final String TRINKETS_MOD_ID = "trinkets_updated";

    /**
     * Resolved once. {@link TrinketsCompat} is only ever named inside the guarded
     * branches below, so it is never loaded when Trinkets Updated is absent. Keep the
     * mod id here rather than on TrinketsCompat so that guard cannot be defeated by
     * touching the compat class to read it.
     */
    private static final boolean TRINKETS_PRESENT = Platform.isModLoaded(TRINKETS_MOD_ID);

    private PlayerEquipment() {
    }

    /**
     * Slot the given stack is held or worn in, or {@code null} when the player does not
     * have it in a vanilla slot. Accessory slots have no {@link EquipmentSlot} and are
     * therefore never reported here; use {@link #hurtEquipped} to damage a stack safely.
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
     * First held, worn or accessory stack matching any of the given items, or
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

        if (TRINKETS_PRESENT) {
            return TrinketsCompat.findEquipped(player, items);
        }

        return ItemStack.EMPTY;
    }

    /** Damages an equipped stack, whichever kind of slot it currently occupies. */
    public static void hurtEquipped(Player player, ItemStack stack, int amount) {
        if (TRINKETS_PRESENT && TrinketsCompat.hurtEquipped(player, stack, amount)) {
            return;
        }

        EquipmentSlot slot = slotOf(player, stack);
        if (slot != null) {
            stack.hurtAndBreak(amount, player, slot);
        }
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
