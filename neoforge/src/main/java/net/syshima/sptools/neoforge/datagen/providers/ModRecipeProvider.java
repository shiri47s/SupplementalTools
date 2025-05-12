package net.syshima.sptools.neoforge.datagen.providers;

import net.minecraft.data.DataOutput;
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

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class ModRecipeProvider extends RecipeGenerator.RecipeProvider {
    private static final String NAME = Constants.MOD_ID + "Recipe";

    public ModRecipeProvider(DataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registries, RecipeExporter exporter) {
        return new RecipeGenerator(registries, exporter) {
            @Override
            protected void generate() {
                this.createTools(ModItems.BRONZE_INGOT.get(), Items.STICK, ModItems.BRONZE_SWORD.get(), ModItems.BRONZE_SHOVEL.get(), ModItems.BRONZE_PICKAXE.get(), ModItems.BRONZE_AXE.get(), ModItems.BRONZE_HOE.get());
                this.createTools(Items.COPPER_INGOT, Items.IRON_INGOT, ModItems.IRONCOPPER_SWORD.get(), ModItems.IRONCOPPER_SHOVEL.get(), ModItems.IRONCOPPER_PICKAXE.get(), ModItems.IRONCOPPER_AXE.get(), ModItems.IRONCOPPER_HOE.get());
                this.createTools(ModItems.AMETHYST_INGOT.get(), Items.STICK, ModItems.AMETHYST_SWORD.get(), ModItems.AMETHYST_SHOVEL.get(), ModItems.AMETHYST_PICKAXE.get(), ModItems.AMETHYST_AXE.get(), ModItems.AMETHYST_HOE.get());
                this.createTools(ModItems.EMERALD_INGOT.get(), Items.STICK, ModItems.EMERALD_SWORD.get(), ModItems.EMERALD_SHOVEL.get(), ModItems.EMERALD_PICKAXE.get(), ModItems.EMERALD_AXE.get(), ModItems.EMERALD_HOE.get());
                this.createTools(ModItems.QUARTZ_INGOT.get(), Items.STICK, ModItems.QUARTZ_SWORD.get(), ModItems.QUARTZ_SHOVEL.get(), ModItems.QUARTZ_PICKAXE.get(), ModItems.QUARTZ_AXE.get(), ModItems.QUARTZ_HOE.get());
                this.createTools(ModItems.LEAD_INGOT.get(), Items.STICK, ModItems.LEAD_SWORD.get(), ModItems.LEAD_SHOVEL.get(), ModItems.LEAD_PICKAXE.get(), ModItems.LEAD_AXE.get(), ModItems.LEAD_HOE.get());
                this.createTools(ModItems.REDSTONE_INGOT.get(), Items.STICK, ModItems.REDSTONE_SWORD.get(), ModItems.REDSTONE_SHOVEL.get(), ModItems.REDSTONE_PICKAXE.get(), ModItems.REDSTONE_AXE.get(), ModItems.REDSTONE_HOE.get());

                this.createArmors(ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_HELMET.get(), ModItems.BRONZE_CHESTPLATE.get(), ModItems.BRONZE_LEGGINGS.get(), ModItems.BRONZE_BOOTS.get());
                this.createIronCopperArmors();
                this.createArmors(ModItems.AMETHYST_INGOT.get(), ModItems.AMETHYST_HELMET.get(), ModItems.AMETHYST_CHESTPLATE.get(), ModItems.AMETHYST_LEGGINGS.get(), ModItems.AMETHYST_BOOTS.get());
                this.createArmors(ModItems.EMERALD_INGOT.get(), ModItems.EMERALD_HELMET.get(), ModItems.EMERALD_CHESTPLATE.get(), ModItems.EMERALD_LEGGINGS.get(), ModItems.EMERALD_BOOTS.get());
                this.createArmors(ModItems.QUARTZ_INGOT.get(), ModItems.QUARTZ_HELMET.get(), ModItems.QUARTZ_CHESTPLATE.get(), ModItems.QUARTZ_LEGGINGS.get(), ModItems.QUARTZ_BOOTS.get());
                this.createArmors(ModItems.LEAD_INGOT.get(), ModItems.LEAD_HELMET.get(), ModItems.LEAD_CHESTPLATE.get(), ModItems.LEAD_LEGGINGS.get(), ModItems.LEAD_BOOTS.get());
                this.createArmors(ModItems.REDSTONE_INGOT.get(), ModItems.REDSTONE_HELMET.get(), ModItems.REDSTONE_CHESTPLATE.get(), ModItems.REDSTONE_LEGGINGS.get(), ModItems.REDSTONE_BOOTS.get());

                this.createLavaSeries();

                this.createIngot(Items.COPPER_INGOT, ModItems.BRONZE_INGOT.get());
                this.createMixedIngot(Items.AMETHYST_SHARD, Items.LAPIS_LAZULI, ModItems.AMETHYST_INGOT.get());
                this.createIngot(Items.EMERALD, ModItems.EMERALD_INGOT.get());
                this.smeltIngot(ModItems.RAW_LEAD.get(), ModItems.LEAD_INGOT.get());
                this.createIngot(Items.QUARTZ, ModItems.QUARTZ_SCRAP.get());
                this.createMixedIngot(ModItems.QUARTZ_SCRAP.get(), Items.IRON_INGOT, ModItems.QUARTZ_INGOT.get());
                this.createIngot(Items.REDSTONE, ModItems.REDSTONE_INGOT.get());
                this.createIngot(ModItems.RED_DIAMOND.get(), ModItems.RED_DIAMOND_INGOT.get());

                this.createFireworkRocket();
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
                this.createShaped(RecipeCategory.COMBAT, ModItems.IRONCOPPER_HELMET.get())
                        .input('#', Items.IRON_INGOT)
                        .input('C', Items.COPPER_INGOT)
                        .pattern("CCC")
                        .pattern("# #")
                        .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                        .criterion(hasItem(Items.COPPER_INGOT), conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter);
                this.createShaped(RecipeCategory.COMBAT, ModItems.IRONCOPPER_CHESTPLATE.get())
                        .input('#', Items.IRON_INGOT)
                        .input('C', Items.COPPER_INGOT)
                        .pattern("C C")
                        .pattern("###")
                        .pattern("CCC")
                        .criterion(hasItem(ModItems.IRONCOPPER_CHESTPLATE.get()), conditionsFromItem(ModItems.IRONCOPPER_CHESTPLATE.get()))
                        .offerTo(exporter);
                this.createShaped(RecipeCategory.COMBAT, ModItems.IRONCOPPER_LEGGINGS.get())
                        .input('#', Items.IRON_INGOT)
                        .input('C', Items.COPPER_INGOT)
                        .pattern("CCC")
                        .pattern("# #")
                        .pattern("# #")
                        .criterion(hasItem(ModItems.IRONCOPPER_LEGGINGS.get()), conditionsFromItem(ModItems.IRONCOPPER_LEGGINGS.get()))
                        .offerTo(exporter);
                this.createShaped(RecipeCategory.COMBAT, ModItems.IRONCOPPER_BOOTS.get())
                        .input('#', Items.IRON_INGOT)
                        .input('C', Items.COPPER_INGOT)
                        .pattern("# #")
                        .pattern("C C")
                        .criterion(hasItem(ModItems.IRONCOPPER_LEGGINGS.get()), conditionsFromItem(ModItems.IRONCOPPER_LEGGINGS.get()))
                        .offerTo(exporter);
            }

            private void createIngot(Item raw, Item ingot) {
                this.createShaped(RecipeCategory.MISC, ingot)
                        .input('#', raw)
                        .pattern("###")
                        .pattern("###")
                        .criterion(hasItem(raw), conditionsFromItem(raw))
                        .offerTo(exporter);
            }

            private void smeltIngot(Item raw, Item ingot) {
                this.offerSmelting(
                        List.of(raw),
                        RecipeCategory.MISC,
                        ingot,
                        0.8F,
                        220,
                        null);
                this.offerBlasting(
                        List.of(raw),
                        RecipeCategory.MISC,
                        ingot,
                        0.8F,
                        110,
                        null);
            }

            private void createMixedIngot(Item rawA, Item rawB, Item ingot) {
                this.createShaped(RecipeCategory.MISC, ingot)
                        .input('A', rawA)
                        .input('B', rawB)
                        .pattern("AAA")
                        .pattern("BBB")
                        .criterion(hasItem(rawA), conditionsFromItem(rawA))
                        .criterion(hasItem(rawB), conditionsFromItem(rawB))
                        .offerTo(exporter);
            }

            private void createLavaSeries() {
                this.createShaped(RecipeCategory.MISC, ModItems.LAVA_SMITHING_TEMPLATE.get(), 2)
                        .input('R', ModItems.RED_DIAMOND.get())
                        .input('D', Items.DARK_PRISMARINE)
                        .input('T', ModItems.LAVA_SMITHING_TEMPLATE.get())
                        .pattern("RTR")
                        .pattern("RDR")
                        .pattern("RRR")
                        .criterion(hasItem(ModItems.LAVA_SMITHING_TEMPLATE.get()), conditionsFromItem(ModItems.LAVA_SMITHING_TEMPLATE.get()))
                        .offerTo(exporter);
                this.offerLavaUpgradeRecipe(Items.NETHERITE_HELMET, ModItems.LAVA_HELMET.get());
                this.offerLavaUpgradeRecipe(Items.NETHERITE_CHESTPLATE, ModItems.LAVA_CHESTPLATE.get());
                this.offerLavaUpgradeRecipe(Items.NETHERITE_LEGGINGS, ModItems.LAVA_LEGGINGS.get());
                this.offerLavaUpgradeRecipe(Items.NETHERITE_BOOTS, ModItems.LAVA_BOOTS.get());
            }

            private void offerLavaUpgradeRecipe(Item input, Item result) {
                SmithingTransformRecipeJsonBuilder
                        .create(Ingredient.ofItem(ModItems.LAVA_SMITHING_TEMPLATE.get()),
                                Ingredient.ofItem(input),
                                Ingredient.ofItem(ModItems.RED_DIAMOND_INGOT.get()),
                                RecipeCategory.COMBAT, result)
                        .criterion(hasItem(ModItems.RED_DIAMOND_INGOT.get()),
                                conditionsFromItem(ModItems.RED_DIAMOND_INGOT.get()))
                        .offerTo(this.exporter,
                                getItemPath(result) + "_smithing");
            }

            private void createFireworkRocket() {
                this.createShaped(RecipeCategory.TOOLS, ModItems.DURABLE_FIREWORK_ROCKET.get())
                        .input('E', Items.EMERALD)
                        .input('N', Items.NETHERITE_INGOT)
                        .input('R', Items.REDSTONE)
                        .input('P', Items.PAPER)
                        .input('B', Items.BLAZE_POWDER)
                        .pattern(" E ")
                        .pattern("RNR")
                        .pattern("PBP")
                        .criterion(hasItem(Items.NETHERITE_INGOT), conditionsFromItem(Items.NETHERITE_INGOT))
                        .criterion(hasItem(Items.BLAZE_POWDER), conditionsFromItem(Items.BLAZE_POWDER))
                        .criterion(hasItem(Items.FIREWORK_ROCKET), conditionsFromItem(Items.FIREWORK_ROCKET))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return NAME;
    }
}
