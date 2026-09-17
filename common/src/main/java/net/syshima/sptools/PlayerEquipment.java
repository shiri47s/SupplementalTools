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

    /** The four worn armour slots, in head-to-feet order. Shared; never mutated. */
    public static final List<EquipmentSlot> ARMOR_SLOTS =
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
     * Slot a hand corresponds to. Callers that already know the hand - every
     * {@code useOn} and {@code use} override - should use this rather than searching
     * for the stack, which cannot fail and cannot pick the wrong hand.
     */
    public static EquipmentSlot slotOf(InteractionHand hand) {
        return switch (hand) {
            case MAIN_HAND -> EquipmentSlot.MAINHAND;
            case OFF_HAND -> EquipmentSlot.OFFHAND;
        };
    }

    /**
     * Slot the given stack is held or worn in, or {@code null} when the player does not
     * have it in a vanilla slot. Accessory slots have no {@link EquipmentSlot} and are
     * therefore never reported here; use {@link #hurtEquipped} to damage a stack safely.
     *
     * <p>Stacks are matched by identity rather than by item. Comparing items instead
     * reports the main hand for a stack held in the off hand whenever both hands carry
     * the same item, which then damages one stack while reporting the other's slot.
     */
    @Nullable
    public static EquipmentSlot slotOf(Player player, ItemStack stack) {
        for (InteractionHand hand : InteractionHand.values()) {
            if (player.getItemInHand(hand) == stack) {
                return slotOf(hand);
            }
        }

        for (EquipmentSlot slot : ARMOR_SLOTS) {
            if (player.getItemBySlot(slot) == stack) {
                return slot;
            }
        }

        return null;
    }

    /**
     * First held, worn or accessory stack matching any of the given items, or
     * {@link ItemStack#EMPTY} when none is equipped.
     *
     * <p>The items decide the order: each is looked for across every slot before the
     * next is tried, so a caller listing an upgraded item ahead of its plain
     * counterpart gets the upgraded one wherever it happens to be worn. Sweeping slot
     * by slot instead let the slot order win for hands and armour while accessories
     * still went by item, so the same pair resolved differently depending on which
     * kind of slot held them.
     */
    public static ItemStack findEquipped(Player player, Item... items) {
        for (Item item : items) {
            ItemStack found = firstEquipped(player, item);
            if (!found.isEmpty()) {
                return found;
            }
        }

        return ItemStack.EMPTY;
    }

    /**
     * Every slot searched for one item. Named apart from {@link #findEquipped} rather
     * than overloading it: a single {@code Item} argument matches both signatures, so
     * one edit to this one's parameters would silently turn the call above into
     * unbounded recursion.
     */
    private static ItemStack firstEquipped(Player player, Item item) {
        for (InteractionHand hand : InteractionHand.values()) {
            ItemStack stack = player.getItemInHand(hand);
            if (stack.is(item)) {
                return stack;
            }
        }

        for (EquipmentSlot slot : ARMOR_SLOTS) {
            ItemStack stack = player.getItemBySlot(slot);
            if (stack.is(item)) {
                return stack;
            }
        }

        if (TRINKETS_PRESENT) {
            return TrinketsCompat.findEquipped(player, item);
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
}
