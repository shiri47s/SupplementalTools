package net.syshima.sptools.neoforge.datagen;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.syshima.sptools.Constants;
import net.syshima.sptools.datagen.ModEquipmentAssetProvider;
import net.syshima.sptools.neoforge.datagen.providers.ModBlockLootTableProvider;
import net.syshima.sptools.neoforge.datagen.providers.ModBlockTagsProvider;
import net.syshima.sptools.neoforge.datagen.providers.ModItemTagsProvider;
import net.syshima.sptools.neoforge.datagen.providers.ModModelProvider;
import net.syshima.sptools.neoforge.datagen.providers.ModRecipeProvider;
import net.syshima.sptools.neoforge.datagen.providers.ModWorldGenProvider;

import java.util.Set;

@EventBusSubscriber(modid = Constants.MOD_ID)
public final class ModDataGenerator {

    private ModDataGenerator() {
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(ModModelProvider::new);
        event.createProvider(ModEquipmentAssetProvider::new);
        event.createProvider(ModBlockLootTableProvider::new);
        event.createProvider(ModBlockTagsProvider::new);
        event.createProvider(ModItemTagsProvider::new);
        event.createProvider(ModRecipeProvider::new);
        event.createDatapackRegistryObjects(ModWorldGenProvider.BUILDER, Set.of(Constants.MOD_ID));
    }
}
