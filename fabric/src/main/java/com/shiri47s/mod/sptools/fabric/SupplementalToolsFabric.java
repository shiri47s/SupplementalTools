package com.shiri47s.mod.sptools.fabric;

import com.shiri47s.mod.sptools.SupplementalTools;
import net.fabricmc.api.ModInitializer;

public class SupplementalToolsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        SupplementalTools.init();
    }
}