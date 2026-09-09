package net.syshima.sptools.client;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.syshima.sptools.Constants;
import net.syshima.sptools.core.effects.FullEquipmentBenefits;
import net.syshima.sptools.core.effects.RedstoneOverflowEffect;

/**
 * Local-player state used by tooltips.
 *
 * <p>Tooltips have no player in their context, so the viewing player is the only
 * sensible subject. Everything here is derived on the fly from the client's own
 * player and level, which keeps set-bonus state out of the item and off the wire.
 *
 * <p>Client only. Reach it through {@code EnvExecutor} so the class is never loaded
 * on a dedicated server.
 */
public final class ClientEquipment {

    private ClientEquipment() {
    }

    /** Series the local player is wearing a complete set of. */
    public static Constants.Series localSeries() {
        Player player = Minecraft.getInstance().player;
        return player == null ? Constants.Series.None : FullEquipmentBenefits.seriesOf(player);
    }

    /** Redstone power level (0-8) the local player is currently standing in. */
    public static int localRedstonePower() {
        Player player = Minecraft.getInstance().player;
        if (player == null) {
            return 0;
        }

        return RedstoneOverflowEffect.powerLevel(player.level().getBestNeighborSignal(player.blockPosition()));
    }
}
