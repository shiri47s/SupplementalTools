package net.syshima.sptools.neoforge.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.LootTableLoadEvent;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModItems;

@EventBusSubscriber(modid = Constants.MOD_ID)
public final class ModLootModifier {

    private static final ResourceKey<LootTable> BASTION_TREASURE =
            ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace("chests/bastion_treasure"));

    private ModLootModifier() {
    }

    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        if (!event.getKey().equals(BASTION_TREASURE)) {
            return;
        }

        LootPool pool = LootPool.lootPool()
                .setRolls(ConstantValue.exactly(1))
                .when(LootItemRandomChanceCondition.randomChance(1.0F))
                .add(LootItem.lootTableItem(ModItems.LAVA_SMITHING_TEMPLATE.get()))
                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                .build();
        event.getTable().addPool(pool);
    }
}
