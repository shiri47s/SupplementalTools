package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.block.Block;
import net.minecraft.data.DataOutput;
import net.minecraft.data.loottable.BlockLootTableGenerator;
import net.minecraft.data.loottable.LootTableProvider;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.resource.featuretoggle.FeatureSet;
import net.syshima.sptools.ModBlocks;
import net.syshima.sptools.ModItems;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class ModBlockLootTableProvider extends LootTableProvider {

    private static final List<LootTypeGenerator> tables = List.of(new LootTypeGenerator(lookup -> new ModBlockLootTableGenerator(Set.of(), FeatureFlags.DEFAULT_ENABLED_FEATURES, lookup), LootContextTypes.BLOCK));;

    public ModBlockLootTableProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, Set.of(), tables, registriesFuture);
    }

    private static class ModBlockLootTableGenerator extends BlockLootTableGenerator {

        public ModBlockLootTableGenerator(Set<Item> explosionImmuneItems, FeatureSet requiredFeatures, RegistryWrapper.WrapperLookup registries) {
            super(explosionImmuneItems, requiredFeatures, registries);
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return List.of(ModBlocks.LEAD_ORE.get(), ModBlocks.RED_DIAMOND_ORE.get(), ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get());
        }

        @Override
        protected void generate() {
            var fortuneReference = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE);
            this.generate(ModBlocks.LEAD_ORE.get(), ModItems.RAW_LEAD.get(), 2.0F, 5.0F, fortuneReference);
            this.generate(ModBlocks.RED_DIAMOND_ORE.get(), ModItems.RED_DIAMOND.get(), 1.0F, 1.0F, fortuneReference);
            this.generate(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get(), ModItems.RED_DIAMOND.get(), 1.0F, 1.0F, fortuneReference);
        }

        private void generate(Block block, Item item, float min, float max, RegistryEntry.Reference<Enchantment> fortune) {
            this.addDrop(block, this.dropsWithSilkTouch(block, this.applyExplosionDecay(block, ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(min, max))).apply(ApplyBonusLootFunction.oreDrops(fortune)))));
        }
    }
}
