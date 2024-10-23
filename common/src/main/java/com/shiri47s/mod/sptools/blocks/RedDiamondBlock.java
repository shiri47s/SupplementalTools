package com.shiri47s.mod.sptools.blocks;

import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;

public class RedDiamondBlock extends SupplementalToosBlock {
    public RedDiamondBlock() {
        super(Settings
                .create()
                .mapColor(MapColor.STONE_GRAY)
                .instrument(Instrument.BASEDRUM)
                .requiresTool()
                .strength(4.5F, 3.0F));
    }
}
