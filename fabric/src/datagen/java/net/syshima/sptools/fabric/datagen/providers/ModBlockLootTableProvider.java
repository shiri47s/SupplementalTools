package net.syshima.sptools.fabric.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.syshima.sptools.datagen.ModOreDrops;

import java.util.concurrent.CompletableFuture;

public final class ModBlockLootTableProvider extends FabricBlockLootSubProvider {

    public ModBlockLootTableProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    public void generate() {
        Holder<Enchantment> fortune = this.registries.lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE);

        for (ModOreDrops.OreDrop ore : ModOreDrops.all()) {
            add(ore.block(), createSilkTouchDispatchTable(ore.block(),
                    applyExplosionDecay(ore.block(), LootItem.lootTableItem(ore.drop())
                            .apply(SetItemCountFunction.setCount(UniformGenerator.between(ore.min(), ore.max())))
                            .apply(ApplyBonusCount.addOreBonusCount(fortune)))));
        }
    }
}
