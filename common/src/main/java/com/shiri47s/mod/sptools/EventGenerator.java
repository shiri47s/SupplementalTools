package com.shiri47s.mod.sptools;

import dev.architectury.event.events.common.TickEvent;

public class EventGenerator {
    public static void generate() {
        TickEvent.SERVER_LEVEL_PRE.register(tick -> tick.getPlayers().forEach(player -> {
            if (!player.getWorld().isClient) {
                FullSetsBonus.update(player);
            }
        }));
    }
}
