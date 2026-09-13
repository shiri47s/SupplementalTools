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
        // The three-argument overload this lambda binds to is marked for removal in
        // favour of one that also passes a HolderLookup.Provider, which is why the
        // build warns here. There is no way to act on that yet: on Architectury 21.0.7
        // the deprecated overload is still the functional interface's only abstract
        // method, so the four-argument lambda its own javadoc suggests does not compile,
        // and implementing the replacement through an anonymous class still has to
        // implement the deprecated one and still warns.
        //
        // Nothing is at risk of breaking silently. Once the overload goes, the
        // replacement becomes the abstract method and this lambda stops compiling on
        // its parameter count; the fix at that point is to accept the provider as a
        // leading parameter and ignore it.
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
