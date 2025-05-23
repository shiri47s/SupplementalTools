package net.syshima.sptools;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.syshima.sptools.base.ModBlock;

public final class ModBlocks {
    private static final DeferredRegister<Block> REGISTER = DeferredRegister.create(Constants.MOD_ID, RegistryKeys.BLOCK);

    public static class ID {
        public static final Identifier LEAD_ORE = Identifier.of(Constants.MOD_ID, Constants.Block.LEAD_ORE);
        public static final Identifier RED_DIAMOND_ORE = Identifier.of(Constants.MOD_ID, Constants.Block.RED_DIAMOND_ORE);
        public static final Identifier DEEPSLATE_RED_DIAMOND_ORE = Identifier.of(Constants.MOD_ID, Constants.Block.DEEPSLATE_RED_DIAMOND_ORE);

        public static Identifier postfix(Identifier identifier, String postfix) {
            return Identifier.of(identifier.getNamespace(), identifier.getPath() + postfix);
        }
    }

    public static final RegistrySupplier<Block> LEAD_ORE;
    public static final RegistrySupplier<Block> RED_DIAMOND_ORE;
    public static final RegistrySupplier<Block> DEEPSLATE_RED_DIAMOND_ORE;

    static {
        LEAD_ORE = REGISTER.register(Constants.Block.LEAD_ORE, () -> new ModBlock(UniformIntProvider.create(3, 7), settingsOf(ID.LEAD_ORE, AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F))));
        RED_DIAMOND_ORE = REGISTER.register(Constants.Block.RED_DIAMOND_ORE, () -> new ModBlock(UniformIntProvider.create(4, 8), settingsOf(ID.RED_DIAMOND_ORE, AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.5F, 3.0F))));
        DEEPSLATE_RED_DIAMOND_ORE = REGISTER.register(Constants.Block.DEEPSLATE_RED_DIAMOND_ORE, () -> new ModBlock(UniformIntProvider.create(4, 8), settingsOf(ID.DEEPSLATE_RED_DIAMOND_ORE, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(4.2F, 3.0F))));

        REGISTER.register();
    }

    public static void register() {
    }

    private static Block.Settings settingsOf(Identifier id, Block.Settings settings) {
        return settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, id));
    }
}
