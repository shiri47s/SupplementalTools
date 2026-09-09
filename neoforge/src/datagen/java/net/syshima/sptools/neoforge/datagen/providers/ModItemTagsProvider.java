package net.syshima.sptools.neoforge.datagen.providers;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagAppender;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModItems;
import net.syshima.sptools.ModTags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public final class ModItemTagsProvider extends ItemTagsProvider {

    private static final List<RegistrySupplier<Item>> SWORDS = List.of(
            ModItems.BRONZE_SWORD, ModItems.IRONCOPPER_SWORD, ModItems.AMETHYST_SWORD, ModItems.EMERALD_SWORD,
            ModItems.LEAD_SWORD, ModItems.QUARTZ_SWORD, ModItems.REDSTONE_SWORD);
    private static final List<RegistrySupplier<Item>> SHOVELS = List.of(
            ModItems.BRONZE_SHOVEL, ModItems.IRONCOPPER_SHOVEL, ModItems.AMETHYST_SHOVEL, ModItems.EMERALD_SHOVEL,
            ModItems.LEAD_SHOVEL, ModItems.QUARTZ_SHOVEL, ModItems.REDSTONE_SHOVEL);
    private static final List<RegistrySupplier<Item>> PICKAXES = List.of(
            ModItems.BRONZE_PICKAXE, ModItems.IRONCOPPER_PICKAXE, ModItems.AMETHYST_PICKAXE, ModItems.EMERALD_PICKAXE,
            ModItems.LEAD_PICKAXE, ModItems.QUARTZ_PICKAXE, ModItems.REDSTONE_PICKAXE);
    private static final List<RegistrySupplier<Item>> AXES = List.of(
            ModItems.BRONZE_AXE, ModItems.IRONCOPPER_AXE, ModItems.AMETHYST_AXE, ModItems.EMERALD_AXE,
            ModItems.LEAD_AXE, ModItems.QUARTZ_AXE, ModItems.REDSTONE_AXE);
    private static final List<RegistrySupplier<Item>> HOES = List.of(
            ModItems.BRONZE_HOE, ModItems.IRONCOPPER_HOE, ModItems.AMETHYST_HOE, ModItems.EMERALD_HOE,
            ModItems.LEAD_HOE, ModItems.QUARTZ_HOE, ModItems.REDSTONE_HOE);

    private static final List<RegistrySupplier<Item>> HELMETS = List.of(
            ModItems.BRONZE_HELMET, ModItems.IRONCOPPER_HELMET, ModItems.AMETHYST_HELMET, ModItems.EMERALD_HELMET,
            ModItems.LEAD_HELMET, ModItems.QUARTZ_HELMET, ModItems.REDSTONE_HELMET, ModItems.LAVA_HELMET);
    private static final List<RegistrySupplier<Item>> CHESTPLATES = List.of(
            ModItems.BRONZE_CHESTPLATE, ModItems.IRONCOPPER_CHESTPLATE, ModItems.AMETHYST_CHESTPLATE, ModItems.EMERALD_CHESTPLATE,
            ModItems.LEAD_CHESTPLATE, ModItems.QUARTZ_CHESTPLATE, ModItems.REDSTONE_CHESTPLATE, ModItems.LAVA_CHESTPLATE);
    private static final List<RegistrySupplier<Item>> LEGGINGS = List.of(
            ModItems.BRONZE_LEGGINGS, ModItems.IRONCOPPER_LEGGINGS, ModItems.AMETHYST_LEGGINGS, ModItems.EMERALD_LEGGINGS,
            ModItems.LEAD_LEGGINGS, ModItems.QUARTZ_LEGGINGS, ModItems.REDSTONE_LEGGINGS, ModItems.LAVA_LEGGINGS);
    private static final List<RegistrySupplier<Item>> BOOTS = List.of(
            ModItems.BRONZE_BOOTS, ModItems.IRONCOPPER_BOOTS, ModItems.AMETHYST_BOOTS, ModItems.EMERALD_BOOTS,
            ModItems.LEAD_BOOTS, ModItems.QUARTZ_BOOTS, ModItems.REDSTONE_BOOTS, ModItems.LAVA_BOOTS);

    private static final List<RegistrySupplier<Item>> LAVA_ARMOR = List.of(
            ModItems.LAVA_HELMET, ModItems.LAVA_CHESTPLATE, ModItems.LAVA_LEGGINGS, ModItems.LAVA_BOOTS);

    private static final List<RegistrySupplier<Item>> DURABLE_PICKAXE_LIKE = List.of(
            ModItems.DURABLE_FIREWORK_ROCKET, ModItems.DURABLE_FIREWORK_ROCKET_UPGRADED,
            ModItems.DURABLE_TORCH, ModItems.DURABLE_TORCH_UPGRADED);
    private static final List<RegistrySupplier<Item>> DURABLE_SHOVEL_LIKE = List.of(
            ModItems.DURABLE_TOTEM_OF_UNDYING, ModItems.DURABLE_TOTEM_OF_UNDYING_UPGRADED);

    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Constants.MOD_ID);
    }

    private TagAppender<Item> builder(TagKey<Item> tag) {
        return TagAppender.forBuilder(getOrCreateRawBuilder(tag));
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        addSeries(ModTags.Bronzes, 0);
        addSeries(ModTags.IRONCOPPERS, 1);
        addSeries(ModTags.AMETHYSTS, 2);
        addSeries(ModTags.EMERALDS, 3);
        addSeries(ModTags.LEAD, 4);
        addSeries(ModTags.QUARTZ, 5);
        addSeries(ModTags.REDSTONE, 6);
        add(ModTags.LAVA, LAVA_ARMOR);

        add(ModTags.DURABLE, DURABLE_PICKAXE_LIKE);
        add(ModTags.DURABLE, DURABLE_SHOVEL_LIKE);

        add(ItemTags.SWORDS, SWORDS);
        add(ItemTags.SHOVELS, SHOVELS, DURABLE_SHOVEL_LIKE);
        add(ItemTags.PICKAXES, PICKAXES, DURABLE_PICKAXE_LIKE);
        add(ItemTags.AXES, AXES);
        add(ItemTags.HOES, HOES);
        add(ItemTags.CLUSTER_MAX_HARVESTABLES, PICKAXES);

        add(ItemTags.HEAD_ARMOR, HELMETS);
        add(ItemTags.CHEST_ARMOR, CHESTPLATES);
        add(ItemTags.LEG_ARMOR, LEGGINGS);
        add(ItemTags.FOOT_ARMOR, BOOTS);

        add(ItemTags.HEAD_ARMOR_ENCHANTABLE, HELMETS);
        add(ItemTags.CHEST_ARMOR_ENCHANTABLE, CHESTPLATES);
        add(ItemTags.LEG_ARMOR_ENCHANTABLE, LEGGINGS);
        add(ItemTags.FOOT_ARMOR_ENCHANTABLE, BOOTS);

        add(ItemTags.ARMOR_ENCHANTABLE, allArmor());
        add(ItemTags.EQUIPPABLE_ENCHANTABLE, allArmor());
        add(ItemTags.TRIMMABLE_ARMOR, allArmor());

        add(ItemTags.DURABILITY_ENCHANTABLE, allTools());
        add(ItemTags.DURABILITY_ENCHANTABLE, allArmor());
        add(ItemTags.DURABILITY_ENCHANTABLE, DURABLE_PICKAXE_LIKE);
        add(ItemTags.DURABILITY_ENCHANTABLE, DURABLE_SHOVEL_LIKE);

        add(ModTags.PIGLINS_LOVED_ARMOR, LAVA_ARMOR);
        add(ItemTags.PIGLIN_LOVED, LAVA_ARMOR);
        builder(ItemTags.PIGLIN_SAFE_ARMOR).addTag(ModTags.PIGLINS_LOVED_ARMOR);
    }

    /** Adds the five tool slots plus the four armor slots of one series to its group tag. */
    private void addSeries(TagKey<Item> group, int index) {
        var appender = builder(group);
        appender.add(SWORDS.get(index).getKey());
        appender.add(PICKAXES.get(index).getKey());
        appender.add(AXES.get(index).getKey());
        appender.add(SHOVELS.get(index).getKey());
        appender.add(HOES.get(index).getKey());
        appender.add(HELMETS.get(index).getKey());
        appender.add(CHESTPLATES.get(index).getKey());
        appender.add(LEGGINGS.get(index).getKey());
        appender.add(BOOTS.get(index).getKey());
    }

    @SafeVarargs
    private void add(TagKey<Item> tag, List<RegistrySupplier<Item>>... groups) {
        var appender = builder(tag);
        for (List<RegistrySupplier<Item>> group : groups) {
            for (RegistrySupplier<Item> item : group) {
                appender.add(item.getKey());
            }
        }
    }

    private static List<RegistrySupplier<Item>> allTools() {
        return concat(SWORDS, SHOVELS, PICKAXES, AXES, HOES);
    }

    private static List<RegistrySupplier<Item>> allArmor() {
        return concat(HELMETS, CHESTPLATES, LEGGINGS, BOOTS);
    }

    @SafeVarargs
    private static List<RegistrySupplier<Item>> concat(List<RegistrySupplier<Item>>... groups) {
        var all = new java.util.ArrayList<RegistrySupplier<Item>>();
        for (List<RegistrySupplier<Item>> group : groups) {
            all.addAll(group);
        }
        return all;
    }
}
