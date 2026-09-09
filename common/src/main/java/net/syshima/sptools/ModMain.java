package net.syshima.sptools;

import net.syshima.sptools.worldgen.ModLootModifier;
import net.syshima.sptools.worldgen.ModWorldGen;

public final class ModMain {
    public static final String MOD_ID = Constants.MOD_ID;

    private ModMain() {
    }

    public static void init() {
        ModBlocks.register();
        ModItems.register();
        ModEffects.register();
        ModWorldGen.register();
        ModLootModifier.register();
    }
}
