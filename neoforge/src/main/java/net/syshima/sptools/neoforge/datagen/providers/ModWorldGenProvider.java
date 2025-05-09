package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.data.DataOutput;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.syshima.sptools.Constants;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistryBuilder BUILDER = new RegistryBuilder()
            .addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::boostrap)
            .addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .addRegistry(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);
    public ModWorldGenProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registries) {
        super(output, registries, BUILDER, Set.of(Constants.MOD_ID));
    }
}
