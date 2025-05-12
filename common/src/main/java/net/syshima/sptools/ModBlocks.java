package net.syshima.sptools;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.syshima.sptools.base.ModBlock;

public final class ModBlocks {
    private static final DeferredRegister<Block> REGISTER = DeferredRegister.create(Constants.MOD_ID, RegistryKeys.BLOCK);

    public static class ID {
        public static final Identifier LEAD_ORE = Identifier.of(Constants.MOD_ID, Constants.Blocks.LEAD_ORE);
        public static final Identifier RED_DIAMOND_ORE = Identifier.of(Constants.MOD_ID, Constants.Blocks.RED_DIAMOND_ORE);
        public static final Identifier DEEPSLATE_RED_DIAMOND_ORE = Identifier.of(Constants.MOD_ID, Constants.Blocks.DEEPSLATE_RED_DIAMOND_ORE);

        public static final Identifier TORCH_BLOCK = Identifier.of(Constants.MOD_ID, Constants.Blocks.TORCH_BLOCK);
        public static final Identifier WALL_TORCH_BLOCK = Identifier.of(Constants.MOD_ID, Constants.Blocks.WALL_TORCH_BLOCK);

        public static Identifier postfix(Identifier identifier, String postfix) {
            return Identifier.of(identifier.getNamespace(), identifier.getPath() + postfix);
        }
    }

    public static final RegistrySupplier<Block> LEAD_ORE;
    public static final RegistrySupplier<Block> RED_DIAMOND_ORE;
    public static final RegistrySupplier<Block> DEEPSLATE_RED_DIAMOND_ORE;

    public static final RegistrySupplier<Block> TORCH_BLOCK;
    public static final RegistrySupplier<Block> WALL_TORCH_BLOCK;

    static {
        LEAD_ORE = REGISTER.register(Constants.Blocks.LEAD_ORE, () -> new ModBlock(UniformIntProvider.create(3, 7), settingsOf(ID.LEAD_ORE, AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.0F, 3.0F))));
        RED_DIAMOND_ORE = REGISTER.register(Constants.Blocks.RED_DIAMOND_ORE, () -> new ModBlock(UniformIntProvider.create(4, 8), settingsOf(ID.RED_DIAMOND_ORE, AbstractBlock.Settings.create().mapColor(MapColor.STONE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(3.5F, 3.0F))));
        DEEPSLATE_RED_DIAMOND_ORE = REGISTER.register(Constants.Blocks.DEEPSLATE_RED_DIAMOND_ORE, () -> new ModBlock(UniformIntProvider.create(4, 8), settingsOf(ID.DEEPSLATE_RED_DIAMOND_ORE, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(4.2F, 3.0F))));


        TORCH_BLOCK = REGISTER.register(Constants.Blocks.TORCH_BLOCK, () -> new TorchBlock(ParticleTypes.FLAME, settingsOf(ID.TORCH_BLOCK, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY))));
        WALL_TORCH_BLOCK = REGISTER.register(Constants.Blocks.WALL_TORCH_BLOCK, () -> new WallTorchBlock(ParticleTypes.FLAME, settingsOf(ID.WALL_TORCH_BLOCK, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance(state -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY))));

        REGISTER.register();
    }

    public static void register() {
    }

    private static Block.Settings settingsOf(Identifier id, Block.Settings settings) {
        return settings.registryKey(RegistryKey.of(RegistryKeys.BLOCK, id));
    }
}
