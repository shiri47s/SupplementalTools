package com.shiri47s.mod.sptools.blocks;

import com.shiri47s.mod.sptools.Constants;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class LeadBlock extends SupplementalToosBlock {
    public LeadBlock(AbstractBlock.Settings settings) {
        super(settings
                .mapColor(MapColor.STONE_GRAY)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresTool()
                .strength(3.0F, 3.0F));
    }
}
