package net.syshima.sptools.neoforge.datagen.providers;
import net.minecraft.core.registries.Registries;

import net.minecraft.data.PackOutput;
import net.minecraft.core.RegistryBuilder;
import net.minecraft.core.RegistryWrapper;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.syshima.sptools.Constants;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistryBuilder BUILDER = new RegistryBuilder()
            .addRegistry(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::boostrap)
            .addRegistry(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
            .addRegistry(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);
    public ModWorldGenProvider(PackOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registries) {
        super(output, registries, BUILDER, Set.of(Constants.MOD_ID));
    }
}
