package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.syshima.sptools.ModBlocks;
import net.syshima.sptools.ModItems;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class ModBlockLootTableProvider extends LootTableProvider {

    private static final List<SubProviderEntry> SUB_PROVIDERS = List.of(
            new SubProviderEntry(ModBlockLoot::new, LootContextParamSets.BLOCK));

    public ModBlockLootTableProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, Set.of(), SUB_PROVIDERS, registries);
    }

    private static final class ModBlockLoot extends BlockLootSubProvider {

        private ModBlockLoot(HolderLookup.Provider registries) {
            super(Set.of(), FeatureFlags.DEFAULT_FLAGS, registries);
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return List.of(ModBlocks.LEAD_ORE.get(), ModBlocks.RED_DIAMOND_ORE.get(), ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get());
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
}
