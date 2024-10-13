package com.shiri47s.mod.sptools.forge;

import com.shiri47s.mod.sptools.SupplementalTools;
import net.minecraftforge.fml.common.Mod;

@Mod(SupplementalTools.MOD_ID)
public class SupplementalToolsForge {
    public SupplementalToolsForge() {
		// Submit our event bus to let architectury register our content on the right time
        //EventBuses.registerModEventBus(SupplementalTools.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        SupplementalTools.init();
    }
}