package net.syshima.sptools.fabric.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.syshima.sptools.Constants;
import net.syshima.sptools.datagen.ModRecipes;

import java.util.concurrent.CompletableFuture;

public final class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        return new ModRecipes(registries, output);
    }

    @Override
    public String getName() {
        return Constants.MOD_ID + " Recipes";
    }
}
