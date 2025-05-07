package net.syshima.sptools.neoforge;

import net.minecraft.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModMain;
import net.syshima.sptools.neoforge.datagen.ModDataGenerator;

@Mod(ModMain.MOD_ID)
public final class ModNeoForge {
    public ModNeoForge(IEventBus modBus) {
        ModMain.init(new ModNeoForgePlatform());
    }
}
