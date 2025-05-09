package net.syshima.sptools.neoforge.datagen;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.syshima.sptools.Constants;
import net.syshima.sptools.core.assets.ModEquipmentAssetProvider;
import net.syshima.sptools.neoforge.datagen.providers.*;

@EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public final class ModDataGenerator {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(ModModelProvider::new);
        event.createProvider(ModBlockLootTableProvider::new);
        event.createBlockAndItemTags(ModBlockTagsProvider::new , new ModItemTagsProvider());
        event.createProvider(ModRecipeProvider::new);
        event.createProvider(ModWorldGenProvider::new);

        event.createProvider(ModEquipmentAssetProvider::new);
    }
}
