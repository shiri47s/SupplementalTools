package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.core.Holder;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.providers.number.ints.ContextIntProviders;
import net.syshima.sptools.datagen.ModOreDrops;

import java.util.List;
import java.util.Set;

public final class ModBlockLootTableProvider extends LootTableProvider {

    private static final List<SubProviderEntry> SUB_PROVIDERS = List.of(
            new SubProviderEntry(ModBlockLoot::new, LootContextParamSets.BLOCK));

    public ModBlockLootTableProvider() {
        super(Set.of(), SUB_PROVIDERS);
    }

    private static final class ModBlockLoot extends BlockLootSubProvider {

        private ModBlockLoot(LootTableSubProvider.Context context) {
            super(Set.of(), FeatureFlags.DEFAULT_FLAGS, context);
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return ModOreDrops.blocks();
        }

        @Override
        public void generate() {
            Holder<Enchantment> fortune = this.enchantments.getOrThrow(Enchantments.FORTUNE);

            for (ModOreDrops.OreDrop ore : ModOreDrops.all()) {
                add(ore.block(), createSilkTouchDispatchTable(ore.block(),
                        applyExplosionDecay(ore.block(), LootItem.lootTableItem(ore.drop())
                                .apply(SetItemCountFunction.setCount(ContextIntProviders.between(ore.min(), ore.max())))
                                .apply(ApplyBonusCount.addOreBonusCount(fortune)))));
            }
        }
    }
}
