package net.syshima.sptools.fabric;

import net.fabricmc.api.ModInitializer;
import net.syshima.sptools.ModMain;

public final class ModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        ModMain.init(new ModFabricPlatform());
    }
}
