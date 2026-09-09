package net.syshima.sptools.fabric.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.syshima.sptools.ModBlocks;
import net.syshima.sptools.ModItems;

import java.util.concurrent.CompletableFuture;

public final class ModBlockLootTableProvider extends FabricBlockLootSubProvider {

    public ModBlockLootTableProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    public void generate() {
        Holder<Enchantment> fortune = this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE);

        addOreDrop(ModBlocks.LEAD_ORE.get(), ModItems.RAW_LEAD.get(), 2.0F, 5.0F, fortune);
        addOreDrop(ModBlocks.RED_DIAMOND_ORE.get(), ModItems.RED_DIAMOND.get(), 1.0F, 1.0F, fortune);
        addOreDrop(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get(), ModItems.RED_DIAMOND.get(), 1.0F, 1.0F, fortune);
    }

    private void addOreDrop(Block block, Item drop, float min, float max, Holder<Enchantment> fortune) {
        this.add(block, this.createSilkTouchDispatchTable(block,
                this.applyExplosionDecay(block, LootItem.lootTableItem(drop)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)))
                        .apply(ApplyBonusCount.addOreBonusCount(fortune)))));
    }
}
