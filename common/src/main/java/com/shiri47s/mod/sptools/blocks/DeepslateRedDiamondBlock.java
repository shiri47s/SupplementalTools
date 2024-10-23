package com.shiri47s.mod.sptools.blocks;

import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;

public class DeepslateRedDiamondBlock extends SupplementalToosBlock {
    public DeepslateRedDiamondBlock() {
        super(Settings
                .create()
                .mapColor(MapColor.DEEPSLATE_GRAY)
                .instrument(Instrument.BASEDRUM)
                .requiresTool()
                .strength(5.5F, 3.0F));
    }
}
