package net.syshima.sptools;

public final class ModMain {
    public static final String MOD_ID = "sptools";
    public static IPlatform PLATFORM;

    public static void init(IPlatform platform) {
        PLATFORM = platform;

        ModBlocks.register();
        ModItems.register();
        ModEffects.register();;
        PLATFORM.registerConfiguredFeature();
        PLATFORM.modifyLootTable();
    }
}
