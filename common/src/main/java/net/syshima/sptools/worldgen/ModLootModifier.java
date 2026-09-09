package net.syshima.sptools.worldgen;

import dev.architectury.event.events.common.LootEvent;
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

/** Adds the Anti-Lava smithing template to bastion treasure chests. */
public final class ModLootModifier {

    /** Chance for the Anti-Lava smithing template to appear in a bastion treasure chest. */
    private static final float CHANCE = 0.25F;

    private static final ResourceKey<LootTable> BASTION_TREASURE =
            ResourceKey.create(Registries.LOOT_TABLE, Identifier.withDefaultNamespace("chests/bastion_treasure"));

    private ModLootModifier() {
    }

    public static void register() {
        LootEvent.MODIFY_LOOT_TABLE.register((key, context, builtin) -> {
            // Keep the `builtin` guard. NeoForge only fires this event for built-in
            // tables, so dropping the check would silently make Fabric also append to
            // data pack overrides and diverge from NeoForge. It also means a pack that
            // overrides bastion_treasure replaces our addition rather than stacking
            // with it, which is the intended data pack behaviour.
            if (!builtin || !BASTION_TREASURE.equals(key)) {
                return;
            }

            context.addPool(LootPool.lootPool()
                    .setRolls(ConstantValue.exactly(1))
                    .when(LootItemRandomChanceCondition.randomChance(CHANCE))
                    .add(LootItem.lootTableItem(ModItems.LAVA_SMITHING_TEMPLATE.get()))
                    .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F))));
        });
    }
}
