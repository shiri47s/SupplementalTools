package net.syshima.sptools.fabric;

import net.fabricmc.api.ModInitializer;
import net.syshima.sptools.ModMain;

public final class ModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ModMain.init();
    }
}
