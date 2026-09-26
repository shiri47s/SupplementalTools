package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeProvider;
import net.syshima.sptools.datagen.ModRecipes;

public final class ModReloadableProvider {

    /**
     * Loot tables, recipes, and the advancements those recipes unlock. 26.3 made all
     * three reloadable registries, so they are generated as registry objects rather
     * than through data providers of their own.
     */
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.LOOT_TABLE, new ModBlockLootTableProvider())
            .add(RecipeProvider.asBootstrap(ModRecipes::new));

    private ModReloadableProvider() {
    }
}
