package net.syshima.sptools.compat;

import eu.pb4.trinkets.api.TrinketSlotAccess;
import eu.pb4.trinkets.api.TrinketsApi;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

/**
 * Accessory slot support backed by Trinkets Updated.
 *
 * <p>Every reference to Trinkets lives in this class so it is only ever loaded when
 * the mod is installed. Reach it through {@link net.syshima.sptools.PlayerEquipment},
 * which guards the call.
 */
public final class TrinketsCompat {

    private TrinketsCompat() {
    }

    /** First accessory slot holding the item, or {@link ItemStack#EMPTY}. */
    public static ItemStack findEquipped(Player player, Item item) {
        var found = TrinketsApi.getAttachment(player).findFirst(item, true);
        return found.isPresent() ? found.get().get() : ItemStack.EMPTY;
    }

    /**
     * Damages the stack through Trinkets when it sits in an accessory slot.
     *
     * @return {@code true} when the stack was found and damaged here
     */
    public static boolean hurtEquipped(Player player, ItemStack stack, int amount) {
        var attachment = TrinketsApi.getAttachment(player);
        var found = attachment.findFirst(held -> held == stack, true);
        if (found.isEmpty()) {
            return false;
        }

        TrinketSlotAccess access = found.get();
        TrinketsApi.hurtAndBreakItemStack(stack, amount, player, access);
        return true;
    }
}
