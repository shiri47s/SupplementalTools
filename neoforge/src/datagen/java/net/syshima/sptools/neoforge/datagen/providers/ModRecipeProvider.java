package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.syshima.sptools.Constants;
import net.syshima.sptools.datagen.ModRecipes;

import java.util.concurrent.CompletableFuture;

public final class ModRecipeProvider extends RecipeProvider.Runner {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
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
