package net.syshima.sptools.fabric.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.syshima.sptools.ModBlocks;
import net.syshima.sptools.ModItems;

import java.util.concurrent.CompletableFuture;

public final class ModBlockLootTableProvider extends FabricBlockLootTableProvider {

    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        var fortuenReference = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE);
        this.generateCore(ModBlocks.LEAD_ORE, ModItems.RAW_LEAD, 2.0F, 5.0F, fortuenReference);
        this.generateCore(ModBlocks.RED_DIAMOND_ORE, ModItems.RED_DIAMOND, 1.0F, 1.0F, fortuenReference);
        this.generateCore(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE, ModItems.RED_DIAMOND, 1.0F, 1.0F, fortuenReference);
    }

    private void generateCore(Block block, Item item, float min, float max, RegistryEntry.Reference<Enchantment> fortune) {
        this.addDrop(block, this.dropsWithSilkTouch(block, this.applyExplosionDecay(block, ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max))).apply(ApplyBonusLootFunction.oreDrops(fortune)))));
    }
}
