package com.shiri47s.mod.sptools.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;

public class LeadBlock extends SupplementalToosBlock {
    public LeadBlock() {
        super(AbstractBlock
                .Settings
                .create()
                .mapColor(MapColor.STONE_GRAY)
                .instrument(Instrument.BASEDRUM)
                .requiresTool()
                .strength(3.0F, 3.0F));
    }
}
