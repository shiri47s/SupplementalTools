package com.shiri47s.mod.sptools;

import com.shiri47s.mod.sptools.blocks.DeepslateRedDiamondBlock;
import com.shiri47s.mod.sptools.blocks.LeadBlock;
import com.shiri47s.mod.sptools.blocks.RedDiamondBlock;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static com.shiri47s.mod.sptools.Constants.MOD_ID;

public class BlockItemModelGenerator {
    private static final DeferredRegister<Block> BLOCK_REGISTER = DeferredRegister.create(MOD_ID, RegistryKeys.BLOCK);
    public static void generate() {
        BLOCK_REGISTER.register(Constants.Block.LEAD_ORE, () -> new LeadBlock(of(Constants.Block.LEAD_ORE)));
        BLOCK_REGISTER.register(Constants.Block.RED_DIAMOND_ORE, () -> new RedDiamondBlock(of(Constants.Block.RED_DIAMOND_ORE)));
        BLOCK_REGISTER.register(Constants.Block.DEEPSLATE_RED_DIAMOND_ORE, () -> new DeepslateRedDiamondBlock(of(Constants.Block.DEEPSLATE_RED_DIAMOND_ORE)));

        BLOCK_REGISTER.register();
    }

    private static AbstractBlock.Settings of(String id) {
        return AbstractBlock.Settings.create().registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(MOD_ID, id)));
    }
}
