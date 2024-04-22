package com.shiri47s.mod.sptools.forge;

import dev.architectury.platform.forge.EventBuses;
import com.shiri47s.mod.sptools.SupplementalTools;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(SupplementalTools.MOD_ID)
public class SupplementalToolsForge {
    public SupplementalToolsForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(SupplementalTools.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        SupplementalTools.init();
    }
}