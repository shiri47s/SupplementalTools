package net.syshima.sptools.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.data.recipes.SmithingTransformRecipeBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModItems;

/** Every recipe the mod contributes. Shared by both loaders' recipe providers. */
public final class ModRecipes extends RecipeProvider {

    private final RecipeOutput output;

    public ModRecipes(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
        this.output = output;
    }

    @Override
    public void buildRecipes() {
        tools(ModItems.BRONZE_INGOT.get(), Items.STICK, ModItems.BRONZE_SWORD.get(), ModItems.BRONZE_SHOVEL.get(), ModItems.BRONZE_PICKAXE.get(), ModItems.BRONZE_AXE.get(), ModItems.BRONZE_HOE.get());
        tools(Items.COPPER_INGOT, Items.IRON_INGOT, ModItems.IRONCOPPER_SWORD.get(), ModItems.IRONCOPPER_SHOVEL.get(), ModItems.IRONCOPPER_PICKAXE.get(), ModItems.IRONCOPPER_AXE.get(), ModItems.IRONCOPPER_HOE.get());
        tools(ModItems.AMETHYST_INGOT.get(), Items.STICK, ModItems.AMETHYST_SWORD.get(), ModItems.AMETHYST_SHOVEL.get(), ModItems.AMETHYST_PICKAXE.get(), ModItems.AMETHYST_AXE.get(), ModItems.AMETHYST_HOE.get());
        tools(ModItems.EMERALD_INGOT.get(), Items.STICK, ModItems.EMERALD_SWORD.get(), ModItems.EMERALD_SHOVEL.get(), ModItems.EMERALD_PICKAXE.get(), ModItems.EMERALD_AXE.get(), ModItems.EMERALD_HOE.get());
        tools(ModItems.QUARTZ_INGOT.get(), Items.STICK, ModItems.QUARTZ_SWORD.get(), ModItems.QUARTZ_SHOVEL.get(), ModItems.QUARTZ_PICKAXE.get(), ModItems.QUARTZ_AXE.get(), ModItems.QUARTZ_HOE.get());
        tools(ModItems.LEAD_INGOT.get(), Items.STICK, ModItems.LEAD_SWORD.get(), ModItems.LEAD_SHOVEL.get(), ModItems.LEAD_PICKAXE.get(), ModItems.LEAD_AXE.get(), ModItems.LEAD_HOE.get());
        tools(ModItems.REDSTONE_INGOT.get(), Items.STICK, ModItems.REDSTONE_SWORD.get(), ModItems.REDSTONE_SHOVEL.get(), ModItems.REDSTONE_PICKAXE.get(), ModItems.REDSTONE_AXE.get(), ModItems.REDSTONE_HOE.get());

        armors(ModItems.BRONZE_INGOT.get(), ModItems.BRONZE_HELMET.get(), ModItems.BRONZE_CHESTPLATE.get(), ModItems.BRONZE_LEGGINGS.get(), ModItems.BRONZE_BOOTS.get());
        ironCopperArmors();
        armors(ModItems.AMETHYST_INGOT.get(), ModItems.AMETHYST_HELMET.get(), ModItems.AMETHYST_CHESTPLATE.get(), ModItems.AMETHYST_LEGGINGS.get(), ModItems.AMETHYST_BOOTS.get());
        armors(ModItems.EMERALD_INGOT.get(), ModItems.EMERALD_HELMET.get(), ModItems.EMERALD_CHESTPLATE.get(), ModItems.EMERALD_LEGGINGS.get(), ModItems.EMERALD_BOOTS.get());
        armors(ModItems.QUARTZ_INGOT.get(), ModItems.QUARTZ_HELMET.get(), ModItems.QUARTZ_CHESTPLATE.get(), ModItems.QUARTZ_LEGGINGS.get(), ModItems.QUARTZ_BOOTS.get());
        armors(ModItems.LEAD_INGOT.get(), ModItems.LEAD_HELMET.get(), ModItems.LEAD_CHESTPLATE.get(), ModItems.LEAD_LEGGINGS.get(), ModItems.LEAD_BOOTS.get());
        armors(ModItems.REDSTONE_INGOT.get(), ModItems.REDSTONE_HELMET.get(), ModItems.REDSTONE_CHESTPLATE.get(), ModItems.REDSTONE_LEGGINGS.get(), ModItems.REDSTONE_BOOTS.get());

        lavaSeries();

        ingot(Items.COPPER_INGOT, ModItems.BRONZE_INGOT.get());
        mixedIngot(Items.AMETHYST_SHARD, Items.LAPIS_LAZULI, ModItems.AMETHYST_INGOT.get());
        ingot(Items.EMERALD, ModItems.EMERALD_INGOT.get());
        smeltIngot(ModItems.RAW_LEAD.get(), ModItems.LEAD_INGOT.get());
        ingot(Items.QUARTZ, ModItems.QUARTZ_SCRAP.get());
        mixedIngot(ModItems.QUARTZ_SCRAP.get(), Items.IRON_INGOT, ModItems.QUARTZ_INGOT.get());
        ingot(Items.REDSTONE, ModItems.REDSTONE_INGOT.get());
        ingot(ModItems.RED_DIAMOND.get(), ModItems.RED_DIAMOND_INGOT.get());

        fireworkRocket();
        totemOfUndying();
        torch();
    }

    private void tools(Item ingot, Item hilt, Item sword, Item shovel, Item pickaxe, Item axe, Item hoe) {
        shaped(RecipeCategory.COMBAT, sword)
                .define('I', hilt).define('#', ingot)
                .pattern(" # ").pattern(" # ").pattern(" I ")
                .unlockedBy(getItemName(ingot), has(ingot))
                .save(output);
        shaped(RecipeCategory.TOOLS, shovel)
                .define('I', hilt).define('#', ingot)
                .pattern(" # ").pattern(" I ").pattern(" I ")
                .unlockedBy(getItemName(ingot), has(ingot))
                .save(output);
        shaped(RecipeCategory.TOOLS, pickaxe)
                .define('I', hilt).define('#', ingot)
                .pattern("###").pattern(" I ").pattern(" I ")
                .unlockedBy(getItemName(ingot), has(ingot))
                .save(output);
        shaped(RecipeCategory.TOOLS, axe)
                .define('I', hilt).define('#', ingot)
                .pattern("## ").pattern("#I ").pattern(" I ")
                .unlockedBy(getItemName(ingot), has(ingot))
                .save(output);
        shaped(RecipeCategory.TOOLS, hoe)
                .define('I', hilt).define('#', ingot)
                .pattern(" ##").pattern(" I ").pattern(" I ")
                .unlockedBy(getItemName(ingot), has(ingot))
                .save(output);
    }

    private void armors(Item ingot, Item helmet, Item chestplate, Item leggings, Item boots) {
        shaped(RecipeCategory.COMBAT, helmet)
                .define('#', ingot)
                .pattern("###").pattern("# #")
                .unlockedBy(getItemName(ingot), has(ingot))
                .save(output);
        shaped(RecipeCategory.COMBAT, chestplate)
                .define('#', ingot)
                .pattern("# #").pattern("###").pattern("###")
                .unlockedBy(getItemName(ingot), has(ingot))
                .save(output);
        shaped(RecipeCategory.COMBAT, leggings)
                .define('#', ingot)
                .pattern("###").pattern("# #").pattern("# #")
                .unlockedBy(getItemName(ingot), has(ingot))
                .save(output);
        shaped(RecipeCategory.COMBAT, boots)
                .define('#', ingot)
                .pattern("# #").pattern("# #")
                .unlockedBy(getItemName(ingot), has(ingot))
                .save(output);
    }

    private void ironCopperArmors() {
        ironCopper(ModItems.IRONCOPPER_HELMET.get(), "CCC", "# #");
        ironCopper(ModItems.IRONCOPPER_CHESTPLATE.get(), "C C", "###", "CCC");
        ironCopper(ModItems.IRONCOPPER_LEGGINGS.get(), "CCC", "# #", "# #");
        ironCopper(ModItems.IRONCOPPER_BOOTS.get(), "# #", "C C");
    }

    private void ironCopper(Item result, String... patterns) {
        var builder = shaped(RecipeCategory.COMBAT, result)
                .define('#', Items.IRON_INGOT)
                .define('C', Items.COPPER_INGOT);
        for (String pattern : patterns) {
            builder.pattern(pattern);
        }
        builder.unlockedBy(getItemName(Items.IRON_INGOT), has(Items.IRON_INGOT))
                .unlockedBy(getItemName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(output);
    }

    private void ingot(Item raw, Item ingot) {
        shaped(RecipeCategory.MISC, ingot)
                .define('#', raw)
                .pattern("###").pattern("###")
                .unlockedBy(getItemName(raw), has(raw))
                .save(output);
    }

    private void mixedIngot(Item rawA, Item rawB, Item ingot) {
        shaped(RecipeCategory.MISC, ingot)
                .define('A', rawA).define('B', rawB)
                .pattern("AAA").pattern("BBB")
                .unlockedBy(getItemName(rawA), has(rawA))
                .unlockedBy(getItemName(rawB), has(rawB))
                .save(output);
    }

    private void smeltIngot(Item raw, Item ingot) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(raw), RecipeCategory.MISC, CookingBookCategory.MISC, ingot, 0.8F, 220)
                .group(getItemName(ingot))
                .unlockedBy(getItemName(raw), has(raw))
                .save(output, recipeId(getItemName(ingot) + "_from_smelting_" + getItemName(raw)));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(raw), RecipeCategory.MISC, CookingBookCategory.MISC, ingot, 0.8F, 110)
                .group(getItemName(ingot))
                .unlockedBy(getItemName(raw), has(raw))
                .save(output, recipeId(getItemName(ingot) + "_from_blasting_" + getItemName(raw)));
    }

    private void lavaSeries() {
        shaped(RecipeCategory.MISC, ModItems.LAVA_SMITHING_TEMPLATE.get(), 2)
                .define('R', ModItems.RED_DIAMOND.get())
                .define('D', Items.DARK_PRISMARINE)
                .define('T', ModItems.LAVA_SMITHING_TEMPLATE.get())
                .pattern("RTR").pattern("RDR").pattern("RRR")
                .unlockedBy(getItemName(ModItems.LAVA_SMITHING_TEMPLATE.get()), has(ModItems.LAVA_SMITHING_TEMPLATE.get()))
                .save(output);

        lavaUpgrade(Items.NETHERITE_HELMET, ModItems.LAVA_HELMET.get());
        lavaUpgrade(Items.NETHERITE_CHESTPLATE, ModItems.LAVA_CHESTPLATE.get());
        lavaUpgrade(Items.NETHERITE_LEGGINGS, ModItems.LAVA_LEGGINGS.get());
        lavaUpgrade(Items.NETHERITE_BOOTS, ModItems.LAVA_BOOTS.get());
    }

    private void lavaUpgrade(Item base, Item result) {
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(ModItems.LAVA_SMITHING_TEMPLATE.get()),
                        Ingredient.of(base),
                        Ingredient.of(ModItems.RED_DIAMOND_INGOT.get()),
                        RecipeCategory.COMBAT,
                        result)
                .unlocks(getItemName(ModItems.RED_DIAMOND_INGOT.get()), has(ModItems.RED_DIAMOND_INGOT.get()))
                .save(output, recipeId(getItemName(result) + "_smithing"));
    }

    private void fireworkRocket() {
        shaped(RecipeCategory.TOOLS, ModItems.DURABLE_FIREWORK_ROCKET.get())
                .define('E', Items.EMERALD)
                .define('N', Items.NETHERITE_INGOT)
                .define('R', Items.REDSTONE)
                .define('P', Items.PAPER)
                .define('B', Items.BLAZE_POWDER)
                .pattern(" E ").pattern("RNR").pattern("PBP")
                .unlockedBy(getItemName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .unlockedBy(getItemName(Items.BLAZE_POWDER), has(Items.BLAZE_POWDER))
                .save(output);

        netheriteUpgrade(ModItems.DURABLE_FIREWORK_ROCKET.get(), ModItems.DURABLE_FIREWORK_ROCKET_UPGRADED.get());
    }

    private void totemOfUndying() {
        shaped(RecipeCategory.TOOLS, ModItems.DURABLE_TOTEM_OF_UNDYING.get())
                .define('T', Items.TOTEM_OF_UNDYING)
                .define('N', Items.NETHERITE_INGOT)
                .pattern(" T ").pattern("TNT").pattern(" T ")
                .unlockedBy(getItemName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .unlockedBy(getItemName(Items.TOTEM_OF_UNDYING), has(Items.TOTEM_OF_UNDYING))
                .save(output);

        netheriteUpgrade(ModItems.DURABLE_TOTEM_OF_UNDYING.get(), ModItems.DURABLE_TOTEM_OF_UNDYING_UPGRADED.get());
    }

    private void torch() {
        shaped(RecipeCategory.TOOLS, ModItems.DURABLE_TORCH.get())
                .define('T', Items.TORCH)
                .define('N', Items.NETHERITE_INGOT)
                .define('R', Items.REDSTONE)
                .define('S', Items.STICK)
                .pattern("TTT").pattern("RNR").pattern(" S ")
                .unlockedBy(getItemName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(output);

        netheriteUpgrade(ModItems.DURABLE_TORCH.get(), ModItems.DURABLE_TORCH_UPGRADED.get());
    }
    /**
     * Vanilla's {@code netheriteSmithing} saves under the {@code minecraft} namespace;
     * this keeps generated recipe ids inside the mod namespace on every loader.
     */
    private void netheriteUpgrade(Item base, Item result) {
        SmithingTransformRecipeBuilder.smithing(
                        Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE),
                        Ingredient.of(base),
                        Ingredient.of(Items.NETHERITE_INGOT),
                        RecipeCategory.TOOLS,
                        result)
                .unlocks(getItemName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(output, recipeId(getItemName(result) + "_smithing"));
    }

    private static ResourceKey<Recipe<?>> recipeId(String path) {
        return ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(Constants.MOD_ID, path));
    }
}
