package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.LootTableLoadEvent;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModItems;

@EventBusSubscriber( modid = Constants.MOD_ID )

public final class VanillaLootTableModifier {
    private static final Identifier BASTION_TREASURE = Identifier.ofVanilla("chests/bastion_treasure");

    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        if (event.getName().equals(BASTION_TREASURE)) {
            var pool = LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .conditionally(RandomChanceLootCondition.builder(1.0F))
                    .with(ItemEntry.builder(ModItems.LAVA_SMITHING_TEMPLATE.get()))
                    .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0F))).build();
            event.getTable().addPool(pool);
        }
    }
}
