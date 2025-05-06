package net.syshima.sptools.base;

import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.util.math.intprovider.IntProvider;

public class ModBlock extends ExperienceDroppingBlock {
    public ModBlock(IntProvider experienceDropped, Settings settings) {
        super(experienceDropped, settings);
    }
}
