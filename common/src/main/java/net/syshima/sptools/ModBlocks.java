package net.syshima.sptools;
import net.minecraft.core.registries.Registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.WallTorchBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.resources.Identifier;
import net.minecraft.util.valueproviders.UniformInt;

public final class ModBlocks {
    private static final DeferredRegister<Block> REGISTER = DeferredRegister.create(Constants.MOD_ID, Registries.BLOCK);

    public static class ID {
        public static final Identifier LEAD_ORE = Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.Blocks.LEAD_ORE);
        public static final Identifier RED_DIAMOND_ORE = Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.Blocks.RED_DIAMOND_ORE);
        public static final Identifier DEEPSLATE_RED_DIAMOND_ORE = Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.Blocks.DEEPSLATE_RED_DIAMOND_ORE);

        public static final Identifier TORCH_BLOCK = Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.Blocks.TORCH_BLOCK);
        public static final Identifier WALL_TORCH_BLOCK = Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.Blocks.WALL_TORCH_BLOCK);

        public static Identifier postfix(Identifier identifier, String postfix) {
            return Identifier.fromNamespaceAndPath(identifier.getNamespace(), identifier.getPath() + postfix);
        }
    }

    public static final RegistrySupplier<Block> LEAD_ORE = REGISTER.register(Constants.Blocks.LEAD_ORE, () -> new DropExperienceBlock(UniformInt.of(3, 7), settingsOf(ID.LEAD_ORE, BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.0F, 3.0F))));
    public static final RegistrySupplier<Block> RED_DIAMOND_ORE = REGISTER.register(Constants.Blocks.RED_DIAMOND_ORE, () -> new DropExperienceBlock(UniformInt.of(4, 8), settingsOf(ID.RED_DIAMOND_ORE, BlockBehaviour.Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(3.5F, 3.0F))));
    public static final RegistrySupplier<Block> DEEPSLATE_RED_DIAMOND_ORE = REGISTER.register(Constants.Blocks.DEEPSLATE_RED_DIAMOND_ORE, () -> new DropExperienceBlock(UniformInt.of(4, 8), settingsOf(ID.DEEPSLATE_RED_DIAMOND_ORE, BlockBehaviour.Properties.of().mapColor(MapColor.DEEPSLATE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(4.2F, 3.0F))));


    public static final RegistrySupplier<Block> TORCH_BLOCK = REGISTER.register(Constants.Blocks.TORCH_BLOCK, () -> new TorchBlock(ParticleTypes.FLAME, settingsOf(ID.TORCH_BLOCK, BlockBehaviour.Properties.of().noCollision().instabreak().lightLevel(state -> 14).sound(SoundType.WOOD).pushReaction(PushReaction.DESTROY))));
    public static final RegistrySupplier<Block> WALL_TORCH_BLOCK = REGISTER.register(Constants.Blocks.WALL_TORCH_BLOCK, () -> new WallTorchBlock(ParticleTypes.FLAME, settingsOf(ID.WALL_TORCH_BLOCK, BlockBehaviour.Properties.of().noCollision().instabreak().lightLevel(state -> 14).sound(SoundType.WOOD).pushReaction(PushReaction.DESTROY))));

    private ModBlocks() {
    }

    public static void register() {
        REGISTER.register();
    }

    private static BlockBehaviour.Properties settingsOf(Identifier id, BlockBehaviour.Properties settings) {
        return settings.setId(ResourceKey.create(Registries.BLOCK, id));
    }
}
