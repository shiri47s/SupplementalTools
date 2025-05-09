package net.syshima.sptools.neoforge;

import net.neoforged.fml.common.Mod;
import net.syshima.sptools.ModMain;

@Mod(ModMain.MOD_ID)
public final class ModNeoForge {
    public ModNeoForge() {
        ModMain.init(new ModNeoForgePlatform());
    }
}
