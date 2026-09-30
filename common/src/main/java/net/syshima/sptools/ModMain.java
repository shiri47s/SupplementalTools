package net.syshima.sptools;

import net.syshima.sptools.core.effects.FullEquipmentBenefits;
import net.syshima.sptools.worldgen.ModLootModifier;

public final class ModMain {
    public static final String MOD_ID = Constants.MOD_ID;

    private ModMain() {
    }

    public static void init() {
        ModBlocks.register();
        ModItems.register();
        ModEffects.register();
        ModLootModifier.register();

        FullEquipmentBenefits.bootstrap();
    }
}
