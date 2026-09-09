package net.syshima.sptools.datagen;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.syshima.sptools.ModBlocks;
import net.syshima.sptools.ModItems;

import java.util.List;

/**
 * Ore drop table data.
 *
 * <p>The loot builders themselves stay per loader: BlockLootSubProvider's helpers
 * are protected, reachable only from a subclass, and each loader supplies a
 * different base class.
 */
public final class ModOreDrops {

    /** A block that drops an item in a Fortune-scaled range under silk touch dispatch. */
    public record OreDrop(Block block, Item drop, float min, float max) {
    }

    private ModOreDrops() {
    }

    public static List<OreDrop> all() {
        return List.of(
                new OreDrop(ModBlocks.LEAD_ORE.get(), ModItems.RAW_LEAD.get(), 2.0F, 5.0F),
                new OreDrop(ModBlocks.RED_DIAMOND_ORE.get(), ModItems.RED_DIAMOND.get(), 1.0F, 1.0F),
                new OreDrop(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get(), ModItems.RED_DIAMOND.get(), 1.0F, 1.0F));
    }

    public static List<Block> blocks() {
        return all().stream().map(OreDrop::block).toList();
    }
}
