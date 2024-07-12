package com.shiri47s.mod.sptools.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;

public class LeadBlock extends SupplementalToosBlock {
    public LeadBlock() {
        super(AbstractBlock
                .Settings
                .create()
                .mapColor(MapColor.STONE_GRAY)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresTool()
                .strength(3.0F, 3.0F));
    }
}
