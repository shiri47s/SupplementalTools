package com.shiri47s.mod.sptools.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;

public class RedDiamondBlock extends SupplementalToosBlock {
    public RedDiamondBlock(AbstractBlock.Settings settings) {
        super(settings
                .mapColor(MapColor.STONE_GRAY)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresTool()
                .strength(4.5F, 3.0F));
    }
}
