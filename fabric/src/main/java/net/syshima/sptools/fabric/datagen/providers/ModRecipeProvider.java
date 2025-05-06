package net.syshima.sptools.fabric.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModItems;

import java.util.concurrent.CompletableFuture;

public final class ModRecipeProvider extends FabricRecipeProvider {
    private static final String NAME = Constants.MOD_ID + "Recipe";

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                this.createTools(ModItems.BRONZE_INGOT, Items.STICK, ModItems.BRONZE_SWORD, ModItems.BRONZE_SHOVEL, ModItems.BRONZE_PICKAXE, ModItems.BRONZE_AXE, ModItems.BRONZE_HOE);
                this.createTools(Items.COPPER_INGOT, Items.IRON_INGOT, ModItems.IRONCOPPER_SWORD, ModItems.IRONCOPPER_SHOVEL, ModItems.IRONCOPPER_PICKAXE, ModItems.IRONCOPPER_AXE, ModItems.IRONCOPPER_HOE);
                this.createTools(ModItems.AMETHYST_INGOT, Items.STICK, ModItems.AMETHYST_SWORD, ModItems.AMETHYST_SHOVEL, ModItems.AMETHYST_PICKAXE, ModItems.AMETHYST_AXE, ModItems.AMETHYST_HOE);
                this.createTools(ModItems.EMERALD_INGOT, Items.STICK, ModItems.EMERALD_SWORD, ModItems.EMERALD_SHOVEL, ModItems.EMERALD_PICKAXE, ModItems.EMERALD_AXE, ModItems.EMERALD_HOE);
                this.createTools(ModItems.QUARTZ_INGOT, Items.STICK, ModItems.QUARTZ_SWORD, ModItems.QUARTZ_SHOVEL, ModItems.QUARTZ_PICKAXE, ModItems.QUARTZ_AXE, ModItems.QUARTZ_HOE);
                this.createTools(ModItems.LEAD_INGOT, Items.STICK, ModItems.LEAD_SWORD, ModItems.LEAD_SHOVEL, ModItems.LEAD_PICKAXE, ModItems.LEAD_AXE, ModItems.LEAD_HOE);
                this.createTools(ModItems.REDSTONE_INGOT, Items.STICK, ModItems.REDSTONE_SWORD, ModItems.REDSTONE_SHOVEL, ModItems.REDSTONE_PICKAXE, ModItems.REDSTONE_AXE, ModItems.REDSTONE_HOE);

                this.createArmors(ModItems.BRONZE_INGOT, ModItems.BRONZE_HELMET, ModItems.BRONZE_CHESTPLATE, ModItems.BRONZE_LEGGINGS, ModItems.BRONZE_BOOTS);
                this.createIronCopperArmors();
                this.createArmors(ModItems.AMETHYST_INGOT, ModItems.AMETHYST_HELMET, ModItems.AMETHYST_CHESTPLATE, ModItems.AMETHYST_LEGGINGS, ModItems.AMETHYST_BOOTS);
                this.createArmors(ModItems.EMERALD_INGOT, ModItems.EMERALD_HELMET, ModItems.EMERALD_CHESTPLATE, ModItems.EMERALD_LEGGINGS, ModItems.EMERALD_BOOTS);
                this.createArmors(ModItems.QUARTZ_INGOT, ModItems.QUARTZ_HELMET, ModItems.QUARTZ_CHESTPLATE, ModItems.QUARTZ_LEGGINGS, ModItems.QUARTZ_BOOTS);
                this.createArmors(ModItems.LEAD_INGOT, ModItems.LEAD_HELMET, ModItems.LEAD_CHESTPLATE, ModItems.LEAD_LEGGINGS, ModItems.LEAD_BOOTS);
                this.createArmors(ModItems.REDSTONE_INGOT, ModItems.REDSTONE_HELMET, ModItems.REDSTONE_CHESTPLATE, ModItems.REDSTONE_LEGGINGS, ModItems.REDSTONE_BOOTS);

                this.createLavaSeries();

                this.createIngot(Items.COPPER_INGOT, ModItems.BRONZE_INGOT);
                this.createMixedIngot(Items.AMETHYST_SHARD, Items.LAPIS_LAZULI, ModItems.AMETHYST_INGOT);
                this.createIngot(Items.EMERALD, ModItems.EMERALD_INGOT);
                this.createIngot(ModItems.RAW_LEAD, ModItems.LEAD_INGOT);
                this.createIngot(Items.QUARTZ, ModItems.QUARTZ_SCRAP);
                this.createMixedIngot(ModItems.QUARTZ_SCRAP, Items.IRON_INGOT, ModItems.QUARTZ_INGOT);
                this.createIngot(Items.REDSTONE, ModItems.REDSTONE_INGOT);
                this.createIngot(ModItems.RED_DIAMOND, ModItems.RED_DIAMOND_INGOT);
            }

            private void createTools(Item ingot, Item hilt, Item sword, Item shovel, Item pickaxe, Item axe, Item hoe) {
                this.createShaped(RecipeCategory.COMBAT, sword)
                        .input('I', hilt)
                        .input('#', ingot)
                        .pattern(" # ")
                        .pattern(" # ")
                        .pattern(" I ")
                        .criterion(hasItem(ingot), conditionsFromItem(ingot))
                        .offerTo(exporter);
                this.createShaped(RecipeCategory.TOOLS, shovel)
                        .input('I', hilt)
                        .input('#', ingot)
                        .pattern(" # ")
                        .pattern(" I ")
                        .pattern(" I ")
                        .criterion(hasItem(ingot), conditionsFromItem(ingot))
                        .offerTo(exporter);
                this.createShaped(RecipeCategory.TOOLS, pickaxe)
                        .input('I', hilt)
                        .input('#', ingot)
                        .pattern("###")
                        .pattern(" I ")
                        .pattern(" I ")
                        .criterion(hasItem(ingot), conditionsFromItem(ingot))
                        .offerTo(exporter);
                this.createShaped(RecipeCategory.TOOLS, axe)
                        .input('I', hilt)
                        .input('#', ingot)
                        .pattern("## ")
                        .pattern("#I ")
                        .pattern(" I ")
                        .criterion(hasItem(ingot), conditionsFromItem(ingot))
                        .offerTo(exporter);
                this.createShaped(RecipeCategory.TOOLS, hoe)
                        .input('I', hilt)
                        .input('#', ingot)
                        .pattern(" ##")
                        .pattern(" I ")
                        .pattern(" I ")
                        .criterion(hasItem(ingot), conditionsFromItem(ingot))
                        .offerTo(exporter);
            }

            private void createArmors(Item ingot, Item helmet, Item chestplate, Item leggings, Item boots) {
                this.createShaped(RecipeCategory.COMBAT, helmet)
                        .input('#', ingot)
                        .pattern("###")
                        .pattern("# #")
                        .criterion(hasItem(ingot), conditionsFromItem(ingot))
                        .offerTo(exporter);
                this.createShaped(RecipeCategory.COMBAT, chestplate)
                        .input('#', ingot)
                        .pattern("# #")
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(ingot), conditionsFromItem(ingot))
                        .offerTo(exporter);
                this.createShaped(RecipeCategory.COMBAT, leggings)
                        .input('#', ingot)
                        .pattern("###")
                        .pattern("# #")
                        .pattern("# #")
                        .criterion(hasItem(ingot), conditionsFromItem(ingot))
                        .offerTo(exporter);
                this.createShaped(RecipeCategory.COMBAT, boots)
                        .input('#', ingot)
                        .pattern("# #")
                        .pattern("# #")
                        .criterion(hasItem(ingot), conditionsFromItem(ingot))
                        .offerTo(exporter);
            }

            private void createIronCopperArmors() {
                this.createShaped(RecipeCategory.COMBAT, ModItems.IRONCOPPER_HELMET)
                        .input('#', Items.IRON_INGOT)
                        .input('C', Items.COPPER_INGOT)
                        .pattern("CCC")
                        .pattern("# #")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);
                this.createShaped(RecipeCategory.COMBAT, ModItems.IRONCOPPER_CHESTPLATE)
                        .input('#', Items.IRON_INGOT)
                        .input('C', Items.COPPER_INGOT)
                        .pattern("C C")
                        .pattern("###")
                        .pattern("CCC")
                        .criterion(hasItem(ModItems.IRONCOPPER_CHESTPLATE), conditionsFromItem(ModItems.IRONCOPPER_CHESTPLATE))
                        .offerTo(exporter);
                this.createShaped(RecipeCategory.COMBAT, ModItems.IRONCOPPER_LEGGINGS)
                        .input('#', Items.IRON_INGOT)
                        .input('C', Items.COPPER_INGOT)
                        .pattern("CCC")
                        .pattern("# #")
                        .pattern("# #")
                        .criterion(hasItem(ModItems.IRONCOPPER_LEGGINGS), conditionsFromItem(ModItems.IRONCOPPER_LEGGINGS))
                        .offerTo(exporter);
                this.createShaped(RecipeCategory.COMBAT, ModItems.IRONCOPPER_BOOTS)
                        .input('#', Items.IRON_INGOT)
                        .input('C', Items.COPPER_INGOT)
                        .pattern("# #")
                        .pattern("C C")
                        .criterion(hasItem(ModItems.IRONCOPPER_LEGGINGS), conditionsFromItem(ModItems.IRONCOPPER_LEGGINGS))
                        .offerTo(exporter);
            }

            private void createIngot(Item raw, Item ingot) {
                this.createShaped(RecipeCategory.MISC, ingot)
                        .input('#', raw)
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(ingot), conditionsFromItem(ingot))
                        .offerTo(exporter);
            }

            private void createMixedIngot(Item rawA, Item rawB, Item ingot) {
                this.createShaped(RecipeCategory.MISC, ingot)
                        .input('A', rawA)
                        .input('B', rawB)
                        .pattern("AAA")
                        .pattern("BBB")
                        .criterion(hasItem(ingot), conditionsFromItem(ingot))
                        .offerTo(exporter);
            }

            private void createLavaSeries() {
                this.createShaped(RecipeCategory.MISC, ModItems.LAVA_SMITHING_TEMPLATE, 2)
                        .input('R', ModItems.RED_DIAMOND)
                        .input('D', Items.DARK_PRISMARINE)
                        .input('T', ModItems.LAVA_SMITHING_TEMPLATE)
                        .pattern("RTR")
                        .pattern("RDR")
                        .pattern("RRR")
                        .criterion(hasItem(ModItems.LAVA_SMITHING_TEMPLATE), conditionsFromItem(ModItems.LAVA_SMITHING_TEMPLATE))
                        .offerTo(exporter);
                this.offerLavaUpgradeRecipe(Items.NETHERITE_HELMET, ModItems.LAVA_HELMET);
                this.offerLavaUpgradeRecipe(Items.NETHERITE_CHESTPLATE, ModItems.LAVA_CHESTPLATE);
                this.offerLavaUpgradeRecipe(Items.NETHERITE_LEGGINGS, ModItems.LAVA_LEGGINGS);
                this.offerLavaUpgradeRecipe(Items.NETHERITE_BOOTS, ModItems.LAVA_BOOTS);
            }

            private void offerLavaUpgradeRecipe(Item input, Item result) {
                SmithingTransformRecipeJsonBuilder
                        .create(Ingredient.ofItem(ModItems.LAVA_SMITHING_TEMPLATE),
                                Ingredient.ofItem(input),
                                Ingredient.ofItem(ModItems.RED_DIAMOND_INGOT),
                                RecipeCategory.COMBAT, result)
                        .criterion(hasItem(ModItems.RED_DIAMOND_INGOT),
                                conditionsFromItem(ModItems.RED_DIAMOND_INGOT))
                        .offerTo(this.exporter,
                                getItemPath(result) + "_smithing");
            }
        };
    }

    @Override
    public String getName() {
        return NAME;
    }
}
