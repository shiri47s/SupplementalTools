package com.shiri47s.mod.sptools.blocks;

import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.util.math.intprovider.ConstantIntProvider;

public class SupplementalToosBlock extends ExperienceDroppingBlock {
    public SupplementalToosBlock(Settings settings) {
        super(ConstantIntProvider.create(0), settings);
    }
}
