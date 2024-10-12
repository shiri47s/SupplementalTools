package com.shiri47s.mod.sptools.armors;

import com.shiri47s.mod.sptools.Enums;
import com.shiri47s.mod.sptools.materials.RedstoneArmorMaterials;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class RedstoneArmorItem extends SupplementalArmorItem {

    private static final String[] POWERS = {
            "□□□□□□□□",
            "■□□□□□□□",
            "■■□□□□□□",
            "■■■□□□□□",
            "■■■■□□□□",
            "■■■■■□□□",
            "■■■■■■□□",
            "■■■■■■■□",
            "■■■■■■■■"
    };

    private int currentPower;

    public RedstoneArmorItem(Type type) {
        super(RedstoneArmorMaterials.INSTANCE, type, new Item.Settings());
    }

    @Override
    protected Enums.Series getSeries() {
        return Enums.Series.Redstone;
    }

    @Override
    protected void appendFullSetsTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("item.sptools.blessing.redstone").formatted(Formatting.GREEN));
        tooltip.add(Text.translatable("item.sptools.blessing.redstone.level", POWERS[currentPower]).formatted(Formatting.RED));
    }

    public void receivePower(int power) {
        currentPower = power;
    }
}
