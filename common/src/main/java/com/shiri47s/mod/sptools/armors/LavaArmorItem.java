package com.shiri47s.mod.sptools.armors;

import com.shiri47s.mod.sptools.Enums;
import com.shiri47s.mod.sptools.materials.LavaArmorMaterials;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.List;

public class LavaArmorItem extends SupplementalArmorItem {

    public LavaArmorItem(Type type) {
        super(LavaArmorMaterials.INSTANCE, type, new Settings().rarity(Rarity.EPIC).fireproof());
    }

    @Override
    protected Enums.Series getSeries() {
        return Enums.Series.Lava;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.sptools.blessing.lava").formatted(Formatting.GREEN));
    }
}
