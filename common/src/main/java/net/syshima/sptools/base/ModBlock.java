package net.syshima.sptools.base;

import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.util.valueproviders.IntProvider;

public class ModBlock extends DropExperienceBlock {
    public ModBlock(IntProvider experienceDropped, BlockBehaviour.Properties settings) {
        super(experienceDropped, settings);
    }
}
