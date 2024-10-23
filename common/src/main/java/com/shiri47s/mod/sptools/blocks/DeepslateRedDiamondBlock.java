package com.shiri47s.mod.sptools.blocks;

import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;

public class DeepslateRedDiamondBlock extends SupplementalToosBlock {
    public DeepslateRedDiamondBlock() {
        super(Settings
                .create()
                .mapColor(MapColor.DEEPSLATE_GRAY)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresTool()
                .strength(5.5F, 3.0F));
    }
}
