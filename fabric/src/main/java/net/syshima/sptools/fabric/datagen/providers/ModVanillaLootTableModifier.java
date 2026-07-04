package net.syshima.sptools.fabric.datagen.providers;
import net.minecraft.core.registries.Registries;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.syshima.sptools.ModItems;

public final class ModVanillaLootTableModifier {

    private static final ResourceKey<LootTable> BASTION_TREASURE = ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace("chests/bastion_treasure"));

    public static void modify() {
        LootTableEvents.MODIFY.register((key, builder, source, lookup) -> {
            if (key == BASTION_TREASURE) {
                var lootPool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0F))
                        .with(ItemEntry.builder(ModItems.LAVA_SMITHING_TEMPLATE.get()))
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F)).build());
                builder.pool(lootPool.build());
            }
        });
    }
}
