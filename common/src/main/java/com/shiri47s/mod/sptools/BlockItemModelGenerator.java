package com.shiri47s.mod.sptools;

import com.shiri47s.mod.sptools.blocks.LeadBlock;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;

public class BlockItemModelGenerator {
    private static final DeferredRegister<Block> BLOCK_REGISTER = DeferredRegister.create(Constants.MOD_ID, RegistryKeys.BLOCK);
    public static void generate() {
        BLOCK_REGISTER.register(Constants.Block.LEAD_ORE, LeadBlock::new);

        BLOCK_REGISTER.register();
    }
}
