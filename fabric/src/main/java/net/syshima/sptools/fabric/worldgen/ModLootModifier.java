package net.syshima.sptools.fabric.worldgen;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.syshima.sptools.ModItems;

public final class ModLootModifier {

    private static final ResourceKey<LootTable> BASTION_TREASURE =
            ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace("chests/bastion_treasure"));

    public static void modify() {
        LootTableEvents.MODIFY.register((key, builder, source, registries) -> {
            if (key == BASTION_TREASURE) {
                LootPool.Builder pool = LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1))
                        .when(LootItemRandomChanceCondition.randomChance(1.0F))
                        .add(LootItem.lootTableItem(ModItems.LAVA_SMITHING_TEMPLATE.get()))
                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)));
                builder.withPool(pool);
            }
        });
    }
}
