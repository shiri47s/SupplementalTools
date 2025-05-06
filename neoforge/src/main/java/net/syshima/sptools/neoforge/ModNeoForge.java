package net.syshima.sptools.neoforge;

import net.neoforged.fml.common.Mod;
import net.syshima.sptools.ModMain;

@Mod(ModMain.MOD_ID)
public final class ModNeoForge {
    public ModNeoForge() {
        // Run our common setup.
        ModMain.init(new ModNeoForgePlatform());
    }
}
