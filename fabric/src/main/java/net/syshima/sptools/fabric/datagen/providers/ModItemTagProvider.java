package net.syshima.sptools.fabric.datagen.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.syshima.sptools.ModItems;
import net.syshima.sptools.ModTags;

import java.util.concurrent.CompletableFuture;

public final class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ModTags.Bronzes)
                .add(ModItems.BRONZE_SWORD.get())
                .add(ModItems.BRONZE_PICKAXE.get())
                .add(ModItems.BRONZE_AXE.get())
                .add(ModItems.BRONZE_SHOVEL.get())
                .add(ModItems.BRONZE_HOE.get())
                .add(ModItems.BRONZE_HELMET.get())
                .add(ModItems.BRONZE_CHESTPLATE.get())
                .add(ModItems.BRONZE_LEGGINGS.get())
                .add(ModItems.BRONZE_BOOTS.get());
        getOrCreateTagBuilder(ModTags.IRONCOPPERS)
                .add(ModItems.IRONCOPPER_SWORD.get())
                .add(ModItems.IRONCOPPER_PICKAXE.get())
                .add(ModItems.IRONCOPPER_AXE.get())
                .add(ModItems.IRONCOPPER_SHOVEL.get())
                .add(ModItems.IRONCOPPER_HOE.get())
                .add(ModItems.IRONCOPPER_HELMET.get())
                .add(ModItems.IRONCOPPER_CHESTPLATE.get())
                .add(ModItems.IRONCOPPER_LEGGINGS.get())
                .add(ModItems.IRONCOPPER_BOOTS.get());
        getOrCreateTagBuilder(ModTags.AMETHYSTS)
                .add(ModItems.AMETHYST_SWORD.get())
                .add(ModItems.AMETHYST_PICKAXE.get())
                .add(ModItems.AMETHYST_AXE.get())
                .add(ModItems.AMETHYST_SHOVEL.get())
                .add(ModItems.AMETHYST_HOE.get())
                .add(ModItems.AMETHYST_HELMET.get())
                .add(ModItems.AMETHYST_CHESTPLATE.get())
                .add(ModItems.AMETHYST_LEGGINGS.get())
                .add(ModItems.AMETHYST_BOOTS.get());
        getOrCreateTagBuilder(ModTags.EMERALDS)
                .add(ModItems.EMERALD_SWORD.get())
                .add(ModItems.EMERALD_PICKAXE.get())
                .add(ModItems.EMERALD_AXE.get())
                .add(ModItems.EMERALD_SHOVEL.get())
                .add(ModItems.EMERALD_HOE.get())
                .add(ModItems.EMERALD_HELMET.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.EMERALD_BOOTS.get());
        getOrCreateTagBuilder(ModTags.LEAD)
                .add(ModItems.LEAD_SWORD.get())
                .add(ModItems.LEAD_PICKAXE.get())
                .add(ModItems.LEAD_AXE.get())
                .add(ModItems.LEAD_SHOVEL.get())
                .add(ModItems.LEAD_HOE.get())
                .add(ModItems.LEAD_HELMET.get())
                .add(ModItems.LEAD_CHESTPLATE.get())
                .add(ModItems.LEAD_LEGGINGS.get())
                .add(ModItems.LEAD_BOOTS.get());
        getOrCreateTagBuilder(ModTags.QUARTZ)
                .add(ModItems.QUARTZ_SWORD.get())
                .add(ModItems.QUARTZ_PICKAXE.get())
                .add(ModItems.QUARTZ_AXE.get())
                .add(ModItems.QUARTZ_SHOVEL.get())
                .add(ModItems.QUARTZ_HOE.get())
                .add(ModItems.QUARTZ_HELMET.get())
                .add(ModItems.QUARTZ_CHESTPLATE.get())
                .add(ModItems.QUARTZ_LEGGINGS.get())
                .add(ModItems.QUARTZ_BOOTS.get());
        getOrCreateTagBuilder(ModTags.REDSTONE)
                .add(ModItems.REDSTONE_SWORD.get())
                .add(ModItems.REDSTONE_PICKAXE.get())
                .add(ModItems.REDSTONE_AXE.get())
                .add(ModItems.REDSTONE_SHOVEL.get())
                .add(ModItems.REDSTONE_HOE.get())
                .add(ModItems.REDSTONE_HELMET.get())
                .add(ModItems.REDSTONE_CHESTPLATE.get())
                .add(ModItems.REDSTONE_LEGGINGS.get())
                .add(ModItems.REDSTONE_BOOTS.get());
        getOrCreateTagBuilder(ModTags.LAVA)
                .add(ModItems.LAVA_HELMET.get())
                .add(ModItems.LAVA_CHESTPLATE.get())
                .add(ModItems.LAVA_LEGGINGS.get())
                .add(ModItems.LAVA_BOOTS.get());

        getOrCreateTagBuilder(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .add(ModItems.BRONZE_PICKAXE.get())
                .add(ModItems.IRONCOPPER_PICKAXE.get())
                .add(ModItems.AMETHYST_PICKAXE.get())
                .add(ModItems.EMERALD_PICKAXE.get())
                .add(ModItems.LEAD_PICKAXE.get())
                .add(ModItems.QUARTZ_PICKAXE.get())
                .add(ModItems.REDSTONE_PICKAXE.get());

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.BRONZE_SWORD.get())
                .add(ModItems.IRONCOPPER_SWORD.get())
                .add(ModItems.AMETHYST_SWORD.get())
                .add(ModItems.EMERALD_SWORD.get())
                .add(ModItems.LEAD_SWORD.get())
                .add(ModItems.QUARTZ_SWORD.get())
                .add(ModItems.REDSTONE_SWORD.get());

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.BRONZE_PICKAXE.get())
                .add(ModItems.IRONCOPPER_PICKAXE.get())
                .add(ModItems.AMETHYST_PICKAXE.get())
                .add(ModItems.EMERALD_PICKAXE.get())
                .add(ModItems.LEAD_PICKAXE.get())
                .add(ModItems.QUARTZ_PICKAXE.get())
                .add(ModItems.REDSTONE_PICKAXE.get());

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.BRONZE_AXE.get())
                .add(ModItems.IRONCOPPER_AXE.get())
                .add(ModItems.AMETHYST_AXE.get())
                .add(ModItems.EMERALD_AXE.get())
                .add(ModItems.LEAD_AXE.get())
                .add(ModItems.QUARTZ_AXE.get())
                .add(ModItems.REDSTONE_AXE.get());

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.BRONZE_SHOVEL.get())
                .add(ModItems.IRONCOPPER_SHOVEL.get())
                .add(ModItems.AMETHYST_SHOVEL.get())
                .add(ModItems.EMERALD_SHOVEL.get())
                .add(ModItems.LEAD_SHOVEL.get())
                .add(ModItems.QUARTZ_SHOVEL.get())
                .add(ModItems.REDSTONE_SHOVEL.get());

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.BRONZE_HOE.get())
                .add(ModItems.IRONCOPPER_HOE.get())
                .add(ModItems.AMETHYST_HOE.get())
                .add(ModItems.EMERALD_HOE.get())
                .add(ModItems.LEAD_HOE.get())
                .add(ModItems.QUARTZ_HOE.get())
                .add(ModItems.REDSTONE_HOE.get());

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.BRONZE_HELMET.get())
                .add(ModItems.IRONCOPPER_HELMET.get())
                .add(ModItems.AMETHYST_HELMET.get())
                .add(ModItems.EMERALD_HELMET.get())
                .add(ModItems.LEAD_HELMET.get())
                .add(ModItems.QUARTZ_HELMET.get())
                .add(ModItems.REDSTONE_HELMET.get())
                .add(ModItems.LAVA_HELMET.get());

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.BRONZE_CHESTPLATE.get())
                .add(ModItems.IRONCOPPER_CHESTPLATE.get())
                .add(ModItems.AMETHYST_CHESTPLATE.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.LEAD_CHESTPLATE.get())
                .add(ModItems.QUARTZ_CHESTPLATE.get())
                .add(ModItems.REDSTONE_CHESTPLATE.get())
                .add(ModItems.LAVA_CHESTPLATE.get());

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.BRONZE_LEGGINGS.get())
                .add(ModItems.IRONCOPPER_LEGGINGS.get())
                .add(ModItems.AMETHYST_LEGGINGS.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.LEAD_LEGGINGS.get())
                .add(ModItems.QUARTZ_LEGGINGS.get())
                .add(ModItems.REDSTONE_LEGGINGS.get())
                .add(ModItems.LAVA_LEGGINGS.get());

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.BRONZE_BOOTS.get())
                .add(ModItems.IRONCOPPER_BOOTS.get())
                .add(ModItems.AMETHYST_BOOTS.get())
                .add(ModItems.EMERALD_BOOTS.get())
                .add(ModItems.LEAD_BOOTS.get())
                .add(ModItems.QUARTZ_BOOTS.get())
                .add(ModItems.REDSTONE_BOOTS.get())
                .add(ModItems.LAVA_BOOTS.get());

        getOrCreateTagBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.BRONZE_HELMET.get())
                .add(ModItems.BRONZE_CHESTPLATE.get())
                .add(ModItems.BRONZE_LEGGINGS.get())
                .add(ModItems.BRONZE_BOOTS.get())
                .add(ModItems.IRONCOPPER_HELMET.get())
                .add(ModItems.IRONCOPPER_CHESTPLATE.get())
                .add(ModItems.IRONCOPPER_LEGGINGS.get())
                .add(ModItems.IRONCOPPER_BOOTS.get())
                .add(ModItems.AMETHYST_HELMET.get())
                .add(ModItems.AMETHYST_CHESTPLATE.get())
                .add(ModItems.AMETHYST_LEGGINGS.get())
                .add(ModItems.AMETHYST_BOOTS.get())
                .add(ModItems.EMERALD_HELMET.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.EMERALD_BOOTS.get())
                .add(ModItems.LEAD_HELMET.get())
                .add(ModItems.LEAD_CHESTPLATE.get())
                .add(ModItems.LEAD_LEGGINGS.get())
                .add(ModItems.LEAD_BOOTS.get())
                .add(ModItems.QUARTZ_HELMET.get())
                .add(ModItems.QUARTZ_CHESTPLATE.get())
                .add(ModItems.QUARTZ_LEGGINGS.get())
                .add(ModItems.QUARTZ_BOOTS.get())
                .add(ModItems.REDSTONE_HELMET.get())
                .add(ModItems.REDSTONE_CHESTPLATE.get())
                .add(ModItems.REDSTONE_LEGGINGS.get())
                .add(ModItems.REDSTONE_BOOTS.get())
                .add(ModItems.LAVA_HELMET.get())
                .add(ModItems.LAVA_CHESTPLATE.get())
                .add(ModItems.LAVA_LEGGINGS.get())
                .add(ModItems.LAVA_BOOTS.get());

        getOrCreateTagBuilder(ItemTags.EQUIPPABLE_ENCHANTABLE)
                .add(ModItems.BRONZE_HELMET.get())
                .add(ModItems.BRONZE_CHESTPLATE.get())
                .add(ModItems.BRONZE_LEGGINGS.get())
                .add(ModItems.BRONZE_BOOTS.get())
                .add(ModItems.IRONCOPPER_HELMET.get())
                .add(ModItems.IRONCOPPER_CHESTPLATE.get())
                .add(ModItems.IRONCOPPER_LEGGINGS.get())
                .add(ModItems.IRONCOPPER_BOOTS.get())
                .add(ModItems.AMETHYST_HELMET.get())
                .add(ModItems.AMETHYST_CHESTPLATE.get())
                .add(ModItems.AMETHYST_LEGGINGS.get())
                .add(ModItems.AMETHYST_BOOTS.get())
                .add(ModItems.EMERALD_HELMET.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.EMERALD_BOOTS.get())
                .add(ModItems.LEAD_HELMET.get())
                .add(ModItems.LEAD_CHESTPLATE.get())
                .add(ModItems.LEAD_LEGGINGS.get())
                .add(ModItems.LEAD_BOOTS.get())
                .add(ModItems.QUARTZ_HELMET.get())
                .add(ModItems.QUARTZ_CHESTPLATE.get())
                .add(ModItems.QUARTZ_LEGGINGS.get())
                .add(ModItems.QUARTZ_BOOTS.get())
                .add(ModItems.REDSTONE_HELMET.get())
                .add(ModItems.REDSTONE_CHESTPLATE.get())
                .add(ModItems.REDSTONE_LEGGINGS.get())
                .add(ModItems.REDSTONE_BOOTS.get())
                .add(ModItems.LAVA_HELMET.get())
                .add(ModItems.LAVA_CHESTPLATE.get())
                .add(ModItems.LAVA_LEGGINGS.get())
                .add(ModItems.LAVA_BOOTS.get());

        getOrCreateTagBuilder(ItemTags.DURABILITY_ENCHANTABLE)
                .add(ModItems.BRONZE_HELMET.get())
                .add(ModItems.BRONZE_CHESTPLATE.get())
                .add(ModItems.BRONZE_LEGGINGS.get())
                .add(ModItems.BRONZE_BOOTS.get())
                .add(ModItems.IRONCOPPER_HELMET.get())
                .add(ModItems.IRONCOPPER_CHESTPLATE.get())
                .add(ModItems.IRONCOPPER_LEGGINGS.get())
                .add(ModItems.IRONCOPPER_BOOTS.get())
                .add(ModItems.AMETHYST_HELMET.get())
                .add(ModItems.AMETHYST_CHESTPLATE.get())
                .add(ModItems.AMETHYST_LEGGINGS.get())
                .add(ModItems.AMETHYST_BOOTS.get())
                .add(ModItems.EMERALD_HELMET.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.EMERALD_BOOTS.get())
                .add(ModItems.LEAD_HELMET.get())
                .add(ModItems.LEAD_CHESTPLATE.get())
                .add(ModItems.LEAD_LEGGINGS.get())
                .add(ModItems.LEAD_BOOTS.get())
                .add(ModItems.QUARTZ_HELMET.get())
                .add(ModItems.QUARTZ_CHESTPLATE.get())
                .add(ModItems.QUARTZ_LEGGINGS.get())
                .add(ModItems.QUARTZ_BOOTS.get())
                .add(ModItems.REDSTONE_HELMET.get())
                .add(ModItems.REDSTONE_CHESTPLATE.get())
                .add(ModItems.REDSTONE_LEGGINGS.get())
                .add(ModItems.REDSTONE_BOOTS.get())
                .add(ModItems.LAVA_HELMET.get())
                .add(ModItems.LAVA_CHESTPLATE.get())
                .add(ModItems.LAVA_LEGGINGS.get())
                .add(ModItems.LAVA_BOOTS.get());

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.BRONZE_HELMET.get())
                .add(ModItems.IRONCOPPER_HELMET.get())
                .add(ModItems.AMETHYST_HELMET.get())
                .add(ModItems.EMERALD_HELMET.get())
                .add(ModItems.LEAD_HELMET.get())
                .add(ModItems.QUARTZ_HELMET.get())
                .add(ModItems.REDSTONE_HELMET.get())
                .add(ModItems.LAVA_HELMET.get());

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.BRONZE_CHESTPLATE.get())
                .add(ModItems.IRONCOPPER_CHESTPLATE.get())
                .add(ModItems.AMETHYST_CHESTPLATE.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.LEAD_CHESTPLATE.get())
                .add(ModItems.QUARTZ_CHESTPLATE.get())
                .add(ModItems.REDSTONE_CHESTPLATE.get())
                .add(ModItems.LAVA_CHESTPLATE.get());

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.BRONZE_LEGGINGS.get())
                .add(ModItems.IRONCOPPER_LEGGINGS.get())
                .add(ModItems.AMETHYST_LEGGINGS.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.LEAD_LEGGINGS.get())
                .add(ModItems.QUARTZ_LEGGINGS.get())
                .add(ModItems.REDSTONE_LEGGINGS.get())
                .add(ModItems.LAVA_LEGGINGS.get());

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.BRONZE_BOOTS.get())
                .add(ModItems.IRONCOPPER_BOOTS.get())
                .add(ModItems.AMETHYST_BOOTS.get())
                .add(ModItems.EMERALD_BOOTS.get())
                .add(ModItems.LEAD_BOOTS.get())
                .add(ModItems.QUARTZ_BOOTS.get())
                .add(ModItems.REDSTONE_BOOTS.get())
                .add(ModItems.LAVA_BOOTS.get());

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BRONZE_HELMET.get())
                .add(ModItems.BRONZE_CHESTPLATE.get())
                .add(ModItems.BRONZE_LEGGINGS.get())
                .add(ModItems.BRONZE_BOOTS.get())
                .add(ModItems.IRONCOPPER_HELMET.get())
                .add(ModItems.IRONCOPPER_CHESTPLATE.get())
                .add(ModItems.IRONCOPPER_LEGGINGS.get())
                .add(ModItems.IRONCOPPER_BOOTS.get())
                .add(ModItems.AMETHYST_HELMET.get())
                .add(ModItems.AMETHYST_CHESTPLATE.get())
                .add(ModItems.AMETHYST_LEGGINGS.get())
                .add(ModItems.AMETHYST_BOOTS.get())
                .add(ModItems.EMERALD_HELMET.get())
                .add(ModItems.EMERALD_CHESTPLATE.get())
                .add(ModItems.EMERALD_LEGGINGS.get())
                .add(ModItems.EMERALD_BOOTS.get())
                .add(ModItems.LEAD_HELMET.get())
                .add(ModItems.LEAD_CHESTPLATE.get())
                .add(ModItems.LEAD_LEGGINGS.get())
                .add(ModItems.LEAD_BOOTS.get())
                .add(ModItems.QUARTZ_HELMET.get())
                .add(ModItems.QUARTZ_CHESTPLATE.get())
                .add(ModItems.QUARTZ_LEGGINGS.get())
                .add(ModItems.QUARTZ_BOOTS.get())
                .add(ModItems.REDSTONE_HELMET.get())
                .add(ModItems.REDSTONE_CHESTPLATE.get())
                .add(ModItems.REDSTONE_LEGGINGS.get())
                .add(ModItems.REDSTONE_BOOTS.get())
                .add(ModItems.LAVA_HELMET.get())
                .add(ModItems.LAVA_CHESTPLATE.get())
                .add(ModItems.LAVA_LEGGINGS.get())
                .add(ModItems.LAVA_BOOTS.get());

        getOrCreateTagBuilder(ModTags.PIGLINS_LOVED_ARMOR)
                .add(ModItems.LAVA_HELMET.get())
                .add(ModItems.LAVA_CHESTPLATE.get())
                .add(ModItems.LAVA_LEGGINGS.get())
                .add(ModItems.LAVA_BOOTS.get());

        getOrCreateTagBuilder(ItemTags.PIGLIN_SAFE_ARMOR)
                .addTag(ModTags.PIGLINS_LOVED_ARMOR);

        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .add(ModItems.LAVA_HELMET.get())
                .add(ModItems.LAVA_CHESTPLATE.get())
                .add(ModItems.LAVA_LEGGINGS.get())
                .add(ModItems.LAVA_BOOTS.get());
    }
}
