package net.syshima.sptools.datagen;

import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.syshima.sptools.ModItems;
import net.syshima.sptools.core.assets.ModEquipmentAssets;

import java.util.List;

/**
 * What each loader's model provider has to emit.
 *
 * <p>Only the lists live here. The generator calls themselves stay per loader
 * because BlockModelGenerators and ItemModelGenerators expose their helpers as
 * private or protected in unpatched Minecraft; Fabric's access widener and
 * NeoForge's access transformer open them, and common compiles against neither.
 */
public final class ModModelContent {

    /** An armour series and the asset its four pieces share. */
    public record ArmorSet(ResourceKey<EquipmentAsset> asset, Item helmet, Item chestplate, Item leggings, Item boots) {
    }

    private ModModelContent() {
    }

    /** Items rendered as held tools. */
    public static List<Item> handheldItems() {
        return List.of(
                ModItems.BRONZE_SWORD.get(), ModItems.BRONZE_SHOVEL.get(), ModItems.BRONZE_PICKAXE.get(),
                ModItems.BRONZE_AXE.get(), ModItems.BRONZE_HOE.get(),
                ModItems.IRONCOPPER_SWORD.get(), ModItems.IRONCOPPER_SHOVEL.get(), ModItems.IRONCOPPER_PICKAXE.get(),
                ModItems.IRONCOPPER_AXE.get(), ModItems.IRONCOPPER_HOE.get(),
                ModItems.AMETHYST_SWORD.get(), ModItems.AMETHYST_SHOVEL.get(), ModItems.AMETHYST_PICKAXE.get(),
                ModItems.AMETHYST_AXE.get(), ModItems.AMETHYST_HOE.get(),
                ModItems.EMERALD_SWORD.get(), ModItems.EMERALD_SHOVEL.get(), ModItems.EMERALD_PICKAXE.get(),
                ModItems.EMERALD_AXE.get(), ModItems.EMERALD_HOE.get(),
                ModItems.LEAD_SWORD.get(), ModItems.LEAD_SHOVEL.get(), ModItems.LEAD_PICKAXE.get(),
                ModItems.LEAD_AXE.get(), ModItems.LEAD_HOE.get(),
                ModItems.QUARTZ_SWORD.get(), ModItems.QUARTZ_SHOVEL.get(), ModItems.QUARTZ_PICKAXE.get(),
                ModItems.QUARTZ_AXE.get(), ModItems.QUARTZ_HOE.get(),
                ModItems.REDSTONE_SWORD.get(), ModItems.REDSTONE_SHOVEL.get(), ModItems.REDSTONE_PICKAXE.get(),
                ModItems.REDSTONE_AXE.get(), ModItems.REDSTONE_HOE.get(),
                ModItems.DURABLE_FIREWORK_ROCKET.get(), ModItems.DURABLE_FIREWORK_ROCKET_UPGRADED.get(),
                ModItems.DURABLE_TOTEM_OF_UNDYING.get(), ModItems.DURABLE_TOTEM_OF_UNDYING_UPGRADED.get(),
                ModItems.DURABLE_TORCH.get(), ModItems.DURABLE_TORCH_UPGRADED.get());
    }

    /** Items rendered as flat sprites. */
    public static List<Item> flatItems() {
        return List.of(
                ModItems.BRONZE_INGOT.get(), ModItems.AMETHYST_INGOT.get(), ModItems.EMERALD_INGOT.get(),
                ModItems.LEAD_INGOT.get(), ModItems.QUARTZ_INGOT.get(), ModItems.REDSTONE_INGOT.get(),
                ModItems.RED_DIAMOND_INGOT.get(), ModItems.RAW_LEAD.get(), ModItems.QUARTZ_SCRAP.get(),
                ModItems.RED_DIAMOND.get(), ModItems.LAVA_SMITHING_TEMPLATE.get());
    }

    public static List<ArmorSet> armorSets() {
        return List.of(
                new ArmorSet(ModEquipmentAssets.BRONZE_ARMOR, ModItems.BRONZE_HELMET.get(), ModItems.BRONZE_CHESTPLATE.get(), ModItems.BRONZE_LEGGINGS.get(), ModItems.BRONZE_BOOTS.get()),
                new ArmorSet(ModEquipmentAssets.IRONCOPPER_ARMOR, ModItems.IRONCOPPER_HELMET.get(), ModItems.IRONCOPPER_CHESTPLATE.get(), ModItems.IRONCOPPER_LEGGINGS.get(), ModItems.IRONCOPPER_BOOTS.get()),
                new ArmorSet(ModEquipmentAssets.AMETHYST_ARMOR, ModItems.AMETHYST_HELMET.get(), ModItems.AMETHYST_CHESTPLATE.get(), ModItems.AMETHYST_LEGGINGS.get(), ModItems.AMETHYST_BOOTS.get()),
                new ArmorSet(ModEquipmentAssets.EMERALD_ARMOR, ModItems.EMERALD_HELMET.get(), ModItems.EMERALD_CHESTPLATE.get(), ModItems.EMERALD_LEGGINGS.get(), ModItems.EMERALD_BOOTS.get()),
                new ArmorSet(ModEquipmentAssets.LEAD_ARMOR, ModItems.LEAD_HELMET.get(), ModItems.LEAD_CHESTPLATE.get(), ModItems.LEAD_LEGGINGS.get(), ModItems.LEAD_BOOTS.get()),
                new ArmorSet(ModEquipmentAssets.QUARTZ_ARMOR, ModItems.QUARTZ_HELMET.get(), ModItems.QUARTZ_CHESTPLATE.get(), ModItems.QUARTZ_LEGGINGS.get(), ModItems.QUARTZ_BOOTS.get()),
                new ArmorSet(ModEquipmentAssets.REDSTONE_ARMOR, ModItems.REDSTONE_HELMET.get(), ModItems.REDSTONE_CHESTPLATE.get(), ModItems.REDSTONE_LEGGINGS.get(), ModItems.REDSTONE_BOOTS.get()),
                new ArmorSet(ModEquipmentAssets.LAVA_ARMOR, ModItems.LAVA_HELMET.get(), ModItems.LAVA_CHESTPLATE.get(), ModItems.LAVA_LEGGINGS.get(), ModItems.LAVA_BOOTS.get()));
    }
}
