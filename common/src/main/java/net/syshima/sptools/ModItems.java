package net.syshima.sptools;
import net.minecraft.core.registries.Registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Rarity;
import net.syshima.sptools.base.ModBlockItem;
import net.syshima.sptools.base.ModItem;
import net.syshima.sptools.base.ModTemplateItem;
import net.syshima.sptools.core.armors.*;
import net.syshima.sptools.core.assets.ModToolMaterials;
import net.syshima.sptools.core.tools.*;

import java.util.List;

public final class ModItems {
    public static final ResourceKey<CreativeModeTab> MOD_GROUP = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GROUP_NAME));
    private static final DeferredRegister<Item> REGISTER = DeferredRegister.create(Constants.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> BRONZE_SWORD;
    public static final RegistrySupplier<Item> BRONZE_SHOVEL;
    public static final RegistrySupplier<Item> BRONZE_PICKAXE;
    public static final RegistrySupplier<Item> BRONZE_AXE;
    public static final RegistrySupplier<Item> BRONZE_HOE;

    public static final RegistrySupplier<Item> IRONCOPPER_SWORD;
    public static final RegistrySupplier<Item> IRONCOPPER_SHOVEL;
    public static final RegistrySupplier<Item> IRONCOPPER_PICKAXE;
    public static final RegistrySupplier<Item> IRONCOPPER_AXE;
    public static final RegistrySupplier<Item> IRONCOPPER_HOE;

    public static final RegistrySupplier<Item> AMETHYST_SWORD;
    public static final RegistrySupplier<Item> AMETHYST_SHOVEL;
    public static final RegistrySupplier<Item> AMETHYST_PICKAXE;
    public static final RegistrySupplier<Item> AMETHYST_AXE;
    public static final RegistrySupplier<Item> AMETHYST_HOE;

    public static final RegistrySupplier<Item> EMERALD_SWORD;
    public static final RegistrySupplier<Item> EMERALD_SHOVEL;
    public static final RegistrySupplier<Item> EMERALD_PICKAXE;
    public static final RegistrySupplier<Item> EMERALD_AXE;
    public static final RegistrySupplier<Item> EMERALD_HOE;

    public static final RegistrySupplier<Item> LEAD_SWORD;
    public static final RegistrySupplier<Item> LEAD_SHOVEL;
    public static final RegistrySupplier<Item> LEAD_PICKAXE;
    public static final RegistrySupplier<Item> LEAD_AXE;
    public static final RegistrySupplier<Item> LEAD_HOE;

    public static final RegistrySupplier<Item> QUARTZ_SWORD;
    public static final RegistrySupplier<Item> QUARTZ_SHOVEL;
    public static final RegistrySupplier<Item> QUARTZ_PICKAXE;
    public static final RegistrySupplier<Item> QUARTZ_AXE;
    public static final RegistrySupplier<Item> QUARTZ_HOE;

    public static final RegistrySupplier<Item> REDSTONE_SWORD;
    public static final RegistrySupplier<Item> REDSTONE_SHOVEL;
    public static final RegistrySupplier<Item> REDSTONE_PICKAXE;
    public static final RegistrySupplier<Item> REDSTONE_AXE;
    public static final RegistrySupplier<Item> REDSTONE_HOE;

    public static final RegistrySupplier<Item> BRONZE_HELMET;
    public static final RegistrySupplier<Item> BRONZE_CHESTPLATE;
    public static final RegistrySupplier<Item> BRONZE_LEGGINGS;
    public static final RegistrySupplier<Item> BRONZE_BOOTS;

    public static final RegistrySupplier<Item> IRONCOPPER_HELMET;
    public static final RegistrySupplier<Item> IRONCOPPER_CHESTPLATE;
    public static final RegistrySupplier<Item> IRONCOPPER_LEGGINGS;
    public static final RegistrySupplier<Item> IRONCOPPER_BOOTS;

    public static final RegistrySupplier<Item> AMETHYST_HELMET;
    public static final RegistrySupplier<Item> AMETHYST_CHESTPLATE;
    public static final RegistrySupplier<Item> AMETHYST_LEGGINGS;
    public static final RegistrySupplier<Item> AMETHYST_BOOTS;

    public static final RegistrySupplier<Item> EMERALD_HELMET;
    public static final RegistrySupplier<Item> EMERALD_CHESTPLATE;
    public static final RegistrySupplier<Item> EMERALD_LEGGINGS;
    public static final RegistrySupplier<Item> EMERALD_BOOTS;

    public static final RegistrySupplier<Item> LEAD_HELMET;
    public static final RegistrySupplier<Item> LEAD_CHESTPLATE;
    public static final RegistrySupplier<Item> LEAD_LEGGINGS;
    public static final RegistrySupplier<Item> LEAD_BOOTS;

    public static final RegistrySupplier<Item> QUARTZ_HELMET;
    public static final RegistrySupplier<Item> QUARTZ_CHESTPLATE;
    public static final RegistrySupplier<Item> QUARTZ_LEGGINGS;
    public static final RegistrySupplier<Item> QUARTZ_BOOTS;

    public static final RegistrySupplier<Item> REDSTONE_HELMET;
    public static final RegistrySupplier<Item> REDSTONE_CHESTPLATE;
    public static final RegistrySupplier<Item> REDSTONE_LEGGINGS;
    public static final RegistrySupplier<Item> REDSTONE_BOOTS;

    public static final RegistrySupplier<Item> LAVA_HELMET;
    public static final RegistrySupplier<Item> LAVA_CHESTPLATE;
    public static final RegistrySupplier<Item> LAVA_LEGGINGS;
    public static final RegistrySupplier<Item> LAVA_BOOTS;

    public static final RegistrySupplier<Item> BRONZE_INGOT;
    public static final RegistrySupplier<Item> AMETHYST_INGOT;
    public static final RegistrySupplier<Item> EMERALD_INGOT;
    public static final RegistrySupplier<Item> LEAD_INGOT;
    public static final RegistrySupplier<Item> QUARTZ_INGOT;
    public static final RegistrySupplier<Item> REDSTONE_INGOT;
    public static final RegistrySupplier<Item> RED_DIAMOND_INGOT;

    public static final RegistrySupplier<Item> LEAD_ORE;
    public static final RegistrySupplier<Item> RED_DIAMOND_ORE;
    public static final RegistrySupplier<Item> DEEPSLATE_RED_DIAMOND_ORE;

    public static final RegistrySupplier<Item> RAW_LEAD;
    public static final RegistrySupplier<Item> QUARTZ_SCRAP;
    public static final RegistrySupplier<Item> RED_DIAMOND;
    public static final RegistrySupplier<Item> LAVA_SMITHING_TEMPLATE;

    public static final RegistrySupplier<Item> DURABLE_FIREWORK_ROCKET;
    public static final RegistrySupplier<Item> DURABLE_FIREWORK_ROCKET_UPGRADED;
    public static final RegistrySupplier<Item> DURABLE_TOTEM_OF_UNDYING;
    public static final RegistrySupplier<Item> DURABLE_TOTEM_OF_UNDYING_UPGRADED;
    public static final RegistrySupplier<Item> DURABLE_TORCH;
    public static final RegistrySupplier<Item> DURABLE_TORCH_UPGRADED;

    static {

        BRONZE_SWORD = REGISTER.register(Constants.Items.BRONZE_SWORD, () -> new ModItem(settingsOf(Constants.Items.BRONZE_SWORD, new Item.Properties()).sword(ModToolMaterials.BRONZE, 1.0F, -2.4F)));
        BRONZE_SHOVEL = REGISTER.register(Constants.Items.BRONZE_SHOVEL, () -> new ShovelItem(ModToolMaterials.BRONZE, 1.0F, -3.0F, settingsOf(Constants.Items.BRONZE_SHOVEL)));
        BRONZE_PICKAXE = REGISTER.register(Constants.Items.BRONZE_PICKAXE, () -> new ModItem(settingsOf(Constants.Items.BRONZE_PICKAXE, new Item.Properties()).pickaxe(ModToolMaterials.BRONZE, 1.0F, -2.8F)));
        BRONZE_AXE = REGISTER.register(Constants.Items.BRONZE_AXE, () -> new AxeItem(ModToolMaterials.BRONZE, 5.0F, -3.1F, settingsOf(Constants.Items.BRONZE_AXE)));
        BRONZE_HOE = REGISTER.register(Constants.Items.BRONZE_HOE, () -> new HoeItem(ModToolMaterials.BRONZE, -2.0F, -1.6F, settingsOf(Constants.Items.BRONZE_HOE)));

        IRONCOPPER_SWORD = REGISTER.register(Constants.Items.IRONCOPPER_SWORD, () -> new ModItem(settingsOf(Constants.Items.IRONCOPPER_SWORD, new Item.Properties()).sword(ModToolMaterials.IRONCOPPER, 1.0F, -2.4F)));
        IRONCOPPER_SHOVEL = REGISTER.register(Constants.Items.IRONCOPPER_SHOVEL, () -> new ShovelItem(ModToolMaterials.IRONCOPPER, 1.0F, -3.0F, settingsOf(Constants.Items.IRONCOPPER_SHOVEL)));
        IRONCOPPER_PICKAXE = REGISTER.register(Constants.Items.IRONCOPPER_PICKAXE, () -> new ModItem(settingsOf(Constants.Items.IRONCOPPER_PICKAXE, new Item.Properties()).pickaxe(ModToolMaterials.IRONCOPPER, 1.0F, -2.8F)));
        IRONCOPPER_AXE = REGISTER.register(Constants.Items.IRONCOPPER_AXE, () -> new AxeItem(ModToolMaterials.IRONCOPPER, 5.0F, -3.1F, settingsOf(Constants.Items.IRONCOPPER_AXE)));
        IRONCOPPER_HOE = REGISTER.register(Constants.Items.IRONCOPPER_HOE, () -> new HoeItem(ModToolMaterials.IRONCOPPER, -2.0F, -1.6F, settingsOf(Constants.Items.IRONCOPPER_HOE)));

        AMETHYST_SWORD = REGISTER.register(Constants.Items.AMETHYST_SWORD, () -> new ModItem(settingsOf(Constants.Items.AMETHYST_SWORD, new Item.Properties()).sword(ModToolMaterials.AMETHYST, 1.0F, -2.4F)));
        AMETHYST_SHOVEL = REGISTER.register(Constants.Items.AMETHYST_SHOVEL, () -> new ShovelItem(ModToolMaterials.AMETHYST, 1.0F, -3.0F, settingsOf(Constants.Items.AMETHYST_SHOVEL)));
        AMETHYST_PICKAXE = REGISTER.register(Constants.Items.AMETHYST_PICKAXE, () -> new ModItem(settingsOf(Constants.Items.AMETHYST_PICKAXE, new Item.Properties()).pickaxe(ModToolMaterials.AMETHYST, 1.0F, -2.8F)));
        AMETHYST_AXE = REGISTER.register(Constants.Items.AMETHYST_AXE, () -> new AxeItem(ModToolMaterials.AMETHYST, 5.0F, -3.1F, settingsOf(Constants.Items.AMETHYST_AXE)));
        AMETHYST_HOE = REGISTER.register(Constants.Items.AMETHYST_HOE, () -> new HoeItem(ModToolMaterials.AMETHYST, -2.0F, -1.6F, settingsOf(Constants.Items.AMETHYST_HOE)));

        EMERALD_SWORD = REGISTER.register(Constants.Items.EMERALD_SWORD, () -> new ModItem(settingsOf(Constants.Items.EMERALD_SWORD, new Item.Properties()).sword(ModToolMaterials.EMERALD, 1.0F, -2.4F)));
        EMERALD_SHOVEL = REGISTER.register(Constants.Items.EMERALD_SHOVEL, () -> new ShovelItem(ModToolMaterials.EMERALD, 1.0F, -3.0F, settingsOf(Constants.Items.EMERALD_SHOVEL)));
        EMERALD_PICKAXE = REGISTER.register(Constants.Items.EMERALD_PICKAXE, () -> new ModItem(settingsOf(Constants.Items.EMERALD_PICKAXE, new Item.Properties()).pickaxe(ModToolMaterials.EMERALD, 1.0F, -2.8F)));
        EMERALD_AXE = REGISTER.register(Constants.Items.EMERALD_AXE, () -> new AxeItem(ModToolMaterials.EMERALD, 5.0F, -3.1F, settingsOf(Constants.Items.EMERALD_AXE)));
        EMERALD_HOE = REGISTER.register(Constants.Items.EMERALD_HOE, () -> new HoeItem(ModToolMaterials.EMERALD, -2.0F, -1.6F, settingsOf(Constants.Items.EMERALD_HOE)));

        LEAD_SWORD = REGISTER.register(Constants.Items.LEAD_SWORD, () -> new ModItem(settingsOf(Constants.Items.LEAD_SWORD, new Item.Properties()).sword(ModToolMaterials.LEAD, 1.0F, -2.4F)));
        LEAD_SHOVEL = REGISTER.register(Constants.Items.LEAD_SHOVEL, () -> new ShovelItem(ModToolMaterials.LEAD, 1.0F, -3.0F, settingsOf(Constants.Items.LEAD_SHOVEL)));
        LEAD_PICKAXE = REGISTER.register(Constants.Items.LEAD_PICKAXE, () -> new ModItem(settingsOf(Constants.Items.LEAD_PICKAXE, new Item.Properties()).pickaxe(ModToolMaterials.LEAD, 1.0F, -2.8F)));
        LEAD_AXE = REGISTER.register(Constants.Items.LEAD_AXE, () -> new AxeItem(ModToolMaterials.LEAD, 5.0F, -3.1F, settingsOf(Constants.Items.LEAD_AXE)));
        LEAD_HOE = REGISTER.register(Constants.Items.LEAD_HOE, () -> new HoeItem(ModToolMaterials.LEAD, -2.0F, -1.6F, settingsOf(Constants.Items.LEAD_HOE)));

        QUARTZ_SWORD = REGISTER.register(Constants.Items.QUARTZ_SWORD, () -> new ModItem(settingsOf(Constants.Items.QUARTZ_SWORD, new Item.Properties()).sword(ModToolMaterials.QUARTZ, 1.0F, -2.4F)));
        QUARTZ_SHOVEL = REGISTER.register(Constants.Items.QUARTZ_SHOVEL, () -> new ShovelItem(ModToolMaterials.QUARTZ, 1.0F, -3.0F, settingsOf(Constants.Items.QUARTZ_SHOVEL)));
        QUARTZ_PICKAXE = REGISTER.register(Constants.Items.QUARTZ_PICKAXE, () -> new ModItem(settingsOf(Constants.Items.QUARTZ_PICKAXE, new Item.Properties()).pickaxe(ModToolMaterials.QUARTZ, 1.0F, -2.8F)));
        QUARTZ_AXE = REGISTER.register(Constants.Items.QUARTZ_AXE, () -> new AxeItem(ModToolMaterials.QUARTZ, 5.0F, -3.1F, settingsOf(Constants.Items.QUARTZ_AXE)));
        QUARTZ_HOE = REGISTER.register(Constants.Items.QUARTZ_HOE, () -> new HoeItem(ModToolMaterials.QUARTZ, -2.0F, -1.6F, settingsOf(Constants.Items.QUARTZ_HOE)));

        REDSTONE_SWORD = REGISTER.register(Constants.Items.REDSTONE_SWORD, () -> new ModItem(settingsOf(Constants.Items.REDSTONE_SWORD, new Item.Properties()).sword(ModToolMaterials.REDSTONE, 1.0F, -2.4F)));
        REDSTONE_SHOVEL = REGISTER.register(Constants.Items.REDSTONE_SHOVEL, () -> new ShovelItem(ModToolMaterials.REDSTONE, 1.0F, -3.0F, settingsOf(Constants.Items.REDSTONE_SHOVEL)));
        REDSTONE_PICKAXE = REGISTER.register(Constants.Items.REDSTONE_PICKAXE, () -> new ModItem(settingsOf(Constants.Items.REDSTONE_PICKAXE, new Item.Properties()).pickaxe(ModToolMaterials.REDSTONE, 1.0F, -2.8F)));
        REDSTONE_AXE = REGISTER.register(Constants.Items.REDSTONE_AXE, () -> new AxeItem(ModToolMaterials.REDSTONE, 5.0F, -3.1F, settingsOf(Constants.Items.REDSTONE_AXE)));
        REDSTONE_HOE = REGISTER.register(Constants.Items.REDSTONE_HOE, () -> new HoeItem(ModToolMaterials.REDSTONE, -2.0F, -1.6F, settingsOf(Constants.Items.REDSTONE_HOE)));

        BRONZE_HELMET = REGISTER.register(Constants.Items.BRONZE_HELMET, () -> new BronzeArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.BRONZE_HELMET)));
        BRONZE_CHESTPLATE = REGISTER.register(Constants.Items.BRONZE_CHESTPLATE, () -> new BronzeArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.BRONZE_CHESTPLATE)));
        BRONZE_LEGGINGS = REGISTER.register(Constants.Items.BRONZE_LEGGINGS, () -> new BronzeArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.BRONZE_LEGGINGS)));
        BRONZE_BOOTS = REGISTER.register(Constants.Items.BRONZE_BOOTS, () -> new BronzeArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.BRONZE_BOOTS)));

        IRONCOPPER_HELMET = REGISTER.register(Constants.Items.IRONCOPPER_HELMET, () -> new IronCopperArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.IRONCOPPER_HELMET)));
        IRONCOPPER_CHESTPLATE = REGISTER.register(Constants.Items.IRONCOPPER_CHESTPLATE, () -> new IronCopperArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.IRONCOPPER_CHESTPLATE)));
        IRONCOPPER_LEGGINGS = REGISTER.register(Constants.Items.IRONCOPPER_LEGGINGS, () -> new IronCopperArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.IRONCOPPER_LEGGINGS)));
        IRONCOPPER_BOOTS = REGISTER.register(Constants.Items.IRONCOPPER_BOOTS, () -> new IronCopperArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.IRONCOPPER_BOOTS)));

        AMETHYST_HELMET = REGISTER.register(Constants.Items.AMETHYST_HELMET, () -> new AmethystArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.AMETHYST_HELMET)));
        AMETHYST_CHESTPLATE = REGISTER.register(Constants.Items.AMETHYST_CHESTPLATE, () -> new AmethystArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.AMETHYST_CHESTPLATE)));
        AMETHYST_LEGGINGS = REGISTER.register(Constants.Items.AMETHYST_LEGGINGS, () -> new AmethystArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.AMETHYST_LEGGINGS)));
        AMETHYST_BOOTS = REGISTER.register(Constants.Items.AMETHYST_BOOTS, () -> new AmethystArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.AMETHYST_BOOTS)));

        EMERALD_HELMET = REGISTER.register(Constants.Items.EMERALD_HELMET, () -> new EmeraldArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.EMERALD_HELMET)));
        EMERALD_CHESTPLATE = REGISTER.register(Constants.Items.EMERALD_CHESTPLATE, () -> new EmeraldArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.EMERALD_CHESTPLATE)));
        EMERALD_LEGGINGS = REGISTER.register(Constants.Items.EMERALD_LEGGINGS, () -> new EmeraldArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.EMERALD_LEGGINGS)));
        EMERALD_BOOTS = REGISTER.register(Constants.Items.EMERALD_BOOTS, () -> new EmeraldArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.EMERALD_BOOTS)));

        LEAD_HELMET = REGISTER.register(Constants.Items.LEAD_HELMET, () -> new LeadArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.LEAD_HELMET)));
        LEAD_CHESTPLATE = REGISTER.register(Constants.Items.LEAD_CHESTPLATE, () -> new LeadArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.LEAD_CHESTPLATE)));
        LEAD_LEGGINGS = REGISTER.register(Constants.Items.LEAD_LEGGINGS, () -> new LeadArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.LEAD_LEGGINGS)));
        LEAD_BOOTS = REGISTER.register(Constants.Items.LEAD_BOOTS, () -> new LeadArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.LEAD_BOOTS)));

        QUARTZ_HELMET = REGISTER.register(Constants.Items.QUARTZ_HELMET, () -> new QuartzArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.QUARTZ_HELMET)));
        QUARTZ_CHESTPLATE = REGISTER.register(Constants.Items.QUARTZ_CHESTPLATE, () -> new QuartzArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.QUARTZ_CHESTPLATE)));
        QUARTZ_LEGGINGS = REGISTER.register(Constants.Items.QUARTZ_LEGGINGS, () -> new QuartzArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.QUARTZ_LEGGINGS)));
        QUARTZ_BOOTS = REGISTER.register(Constants.Items.QUARTZ_BOOTS, () -> new QuartzArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.QUARTZ_BOOTS)));

        REDSTONE_HELMET = REGISTER.register(Constants.Items.REDSTONE_HELMET, () -> new RedstoneArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.REDSTONE_HELMET)));
        REDSTONE_CHESTPLATE = REGISTER.register(Constants.Items.REDSTONE_CHESTPLATE, () -> new RedstoneArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.REDSTONE_CHESTPLATE)));
        REDSTONE_LEGGINGS = REGISTER.register(Constants.Items.REDSTONE_LEGGINGS, () -> new RedstoneArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.REDSTONE_LEGGINGS)));
        REDSTONE_BOOTS = REGISTER.register(Constants.Items.REDSTONE_BOOTS, () -> new RedstoneArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.REDSTONE_BOOTS)));

        LAVA_HELMET = REGISTER.register(Constants.Items.LAVA_HELMET, () -> new LavaArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.LAVA_HELMET)));
        LAVA_CHESTPLATE = REGISTER.register(Constants.Items.LAVA_CHESTPLATE, () -> new LavaArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.LAVA_CHESTPLATE)));
        LAVA_LEGGINGS = REGISTER.register(Constants.Items.LAVA_LEGGINGS, () -> new LavaArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.LAVA_LEGGINGS)));
        LAVA_BOOTS = REGISTER.register(Constants.Items.LAVA_BOOTS, () -> new LavaArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.LAVA_BOOTS)));

        BRONZE_INGOT = REGISTER.register(Constants.Items.BRONZE_INGOT, () -> new ModItem(settingsOf(Constants.Items.BRONZE_INGOT, new Item.Properties())));
        AMETHYST_INGOT = REGISTER.register(Constants.Items.AMETHYST_INGOT, () -> new ModItem(settingsOf(Constants.Items.AMETHYST_INGOT, new Item.Properties())));
        EMERALD_INGOT = REGISTER.register(Constants.Items.EMERALD_INGOT, () -> new ModItem(settingsOf(Constants.Items.EMERALD_INGOT, new Item.Properties())));
        LEAD_INGOT = REGISTER.register(Constants.Items.LEAD_INGOT, () -> new ModItem(settingsOf(Constants.Items.LEAD_INGOT, new Item.Properties())));
        QUARTZ_INGOT = REGISTER.register(Constants.Items.QUARTZ_INGOT, () -> new ModItem(settingsOf(Constants.Items.QUARTZ_INGOT, new Item.Properties())));
        REDSTONE_INGOT = REGISTER.register(Constants.Items.REDSTONE_INGOT, () -> new ModItem(settingsOf(Constants.Items.REDSTONE_INGOT, new Item.Properties())));
        RED_DIAMOND_INGOT = REGISTER.register(Constants.Items.RED_DIAMOND_INGOT, () -> new ModItem(settingsOf(Constants.Items.RED_DIAMOND_INGOT, new Item.Properties())));

        LEAD_ORE = REGISTER.register(Constants.Items.LEAD_ORE, () -> new ModBlockItem(ModBlocks.LEAD_ORE.get(), settingsOf(Constants.Items.LEAD_ORE, new Item.Properties().useBlockDescriptionPrefix())));
        RED_DIAMOND_ORE = REGISTER.register(Constants.Items.RED_DIAMOND_ORE, () -> new ModBlockItem(ModBlocks.RED_DIAMOND_ORE.get(), settingsOf(Constants.Items.RED_DIAMOND_ORE, new Item.Properties().useBlockDescriptionPrefix())));
        DEEPSLATE_RED_DIAMOND_ORE = REGISTER.register(Constants.Items.DEEPSLATE_RED_DIAMOND_ORE, () -> new ModBlockItem(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get(), settingsOf(Constants.Items.DEEPSLATE_RED_DIAMOND_ORE, new Item.Properties().useBlockDescriptionPrefix())));

        RAW_LEAD = REGISTER.register(Constants.Items.RAW_LEAD, () -> new ModItem(settingsOf(Constants.Items.RAW_LEAD, new Item.Properties())));
        QUARTZ_SCRAP = REGISTER.register(Constants.Items.QUARTZ_SCRAP, () -> new ModItem(settingsOf(Constants.Items.QUARTZ_SCRAP, new Item.Properties())));
        RED_DIAMOND = REGISTER.register(Constants.Items.RED_DIAMOND, () -> new ModItem(settingsOf(Constants.Items.RED_DIAMOND, new Item.Properties())));
        LAVA_SMITHING_TEMPLATE = REGISTER.register(Constants.Items.LAVA_SMITHING_TEMPLATE, () -> new ModTemplateItem(Component.translatable("item.sptools.lava_upgrade_smithing_template.applies_to"), Component.translatable("item.sptools.lava_upgrade_smithing_template.ingredients"), Component.translatable("item.sptools.lava_upgrade_smithing_template.base_slot"), Component.translatable("item.sptools.lava_upgrade_smithing_template.additions_slot"), getLavaUpgradeEmptyBaseSlotTextures(), getLavaUpgradeEmptyAdditionsSlotTextures(), settingsOf(Constants.Items.LAVA_SMITHING_TEMPLATE, (new Item.Properties()).fireResistant().rarity(Rarity.EPIC))));

        DURABLE_FIREWORK_ROCKET = REGISTER.register(Constants.Items.DURABLE_FIREWORK_ROCKET, () -> new DurableFireworkRocket(settingsOf(Constants.Items.DURABLE_FIREWORK_ROCKET, (new Item.Properties()).pickaxe(ModToolMaterials.DURABLE, 1.0F, -2.2F))));
        DURABLE_FIREWORK_ROCKET_UPGRADED = REGISTER.register(Constants.Items.DURABLE_FIREWORK_ROCKET_UPGRADED, () -> new DurableFireworkRocketUpgraded(settingsOf(Constants.Items.DURABLE_FIREWORK_ROCKET_UPGRADED, (new Item.Properties()).pickaxe(ModToolMaterials.DURABLE_UPGRADED, 1.5F, -2.1F))));
        DURABLE_TOTEM_OF_UNDYING = REGISTER.register(Constants.Items.DURABLE_TOTEM_OF_UNDYING, () -> new DurableTotemOfUndying(settingsOf(Constants.Items.DURABLE_TOTEM_OF_UNDYING, (new Item.Properties()).shovel(ModToolMaterials.DURABLE, 1.0F, -2.3F))));
        DURABLE_TOTEM_OF_UNDYING_UPGRADED = REGISTER.register(Constants.Items.DURABLE_TOTEM_OF_UNDYING_UPGRADED, () -> new DurableTotemOfUndyingUpgraded(settingsOf(Constants.Items.DURABLE_TOTEM_OF_UNDYING_UPGRADED, (new Item.Properties()).shovel(ModToolMaterials.DURABLE_UPGRADED, 1.5F, -2.2F))));
        DURABLE_TORCH = REGISTER.register(Constants.Items.DURABLE_TORCH, () -> new DurableTorch(settingsOf(Constants.Items.DURABLE_TORCH, (new Item.Properties()).pickaxe(ModToolMaterials.DURABLE, 1.0F, -2.1F))));
        DURABLE_TORCH_UPGRADED = REGISTER.register(Constants.Items.DURABLE_TORCH_UPGRADED, () -> new DurableTorchUpgraded(settingsOf(Constants.Items.DURABLE_TORCH_UPGRADED, (new Item.Properties()).pickaxe(ModToolMaterials.DURABLE_UPGRADED, 1.5F, -2.0F))));

        var itemGroupRegister = DeferredRegister.create(Constants.MOD_ID, Registries.CREATIVE_MODE_TAB);
        itemGroupRegister.register(Constants.GROUP_NAME, () -> CreativeModeTab.builder(CreativeModeTab.Row.BOTTOM, 0)
                .icon(() -> new ItemStack(ModItems.AMETHYST_INGOT.get()))
                .title(Component.translatable("item.sptools"))
                .displayItems((displayContext, entries) -> {
                    entries.accept(BRONZE_SWORD.get());
                    entries.accept(BRONZE_SHOVEL.get());
                    entries.accept(BRONZE_PICKAXE.get());
                    entries.accept(BRONZE_AXE.get());
                    entries.accept(BRONZE_HOE.get());

                    entries.accept(IRONCOPPER_SWORD.get());
                    entries.accept(IRONCOPPER_SHOVEL.get());
                    entries.accept(IRONCOPPER_PICKAXE.get());
                    entries.accept(IRONCOPPER_AXE.get());
                    entries.accept(IRONCOPPER_HOE.get());

                    entries.accept(AMETHYST_SWORD.get());
                    entries.accept(AMETHYST_SHOVEL.get());
                    entries.accept(AMETHYST_PICKAXE.get());
                    entries.accept(AMETHYST_AXE.get());
                    entries.accept(AMETHYST_HOE.get());

                    entries.accept(EMERALD_SWORD.get());
                    entries.accept(EMERALD_SHOVEL.get());
                    entries.accept(EMERALD_PICKAXE.get());
                    entries.accept(EMERALD_AXE.get());
                    entries.accept(EMERALD_HOE.get());

                    entries.accept(LEAD_SWORD.get());
                    entries.accept(LEAD_SHOVEL.get());
                    entries.accept(LEAD_PICKAXE.get());
                    entries.accept(LEAD_AXE.get());
                    entries.accept(LEAD_HOE.get());

                    entries.accept(QUARTZ_SWORD.get());
                    entries.accept(QUARTZ_SHOVEL.get());
                    entries.accept(QUARTZ_PICKAXE.get());
                    entries.accept(QUARTZ_AXE.get());
                    entries.accept(QUARTZ_HOE.get());

                    entries.accept(REDSTONE_SWORD.get());
                    entries.accept(REDSTONE_SHOVEL.get());
                    entries.accept(REDSTONE_PICKAXE.get());
                    entries.accept(REDSTONE_AXE.get());
                    entries.accept(REDSTONE_HOE.get());

                    entries.accept(BRONZE_HELMET.get());
                    entries.accept(BRONZE_CHESTPLATE.get());
                    entries.accept(BRONZE_LEGGINGS.get());
                    entries.accept(BRONZE_BOOTS.get());

                    entries.accept(IRONCOPPER_HELMET.get());
                    entries.accept(IRONCOPPER_CHESTPLATE.get());
                    entries.accept(IRONCOPPER_LEGGINGS.get());
                    entries.accept(IRONCOPPER_BOOTS.get());

                    entries.accept(AMETHYST_HELMET.get());
                    entries.accept(AMETHYST_CHESTPLATE.get());
                    entries.accept(AMETHYST_LEGGINGS.get());
                    entries.accept(AMETHYST_BOOTS.get());

                    entries.accept(EMERALD_HELMET.get());
                    entries.accept(EMERALD_CHESTPLATE.get());
                    entries.accept(EMERALD_LEGGINGS.get());
                    entries.accept(EMERALD_BOOTS.get());

                    entries.accept(LEAD_HELMET.get());
                    entries.accept(LEAD_CHESTPLATE.get());
                    entries.accept(LEAD_LEGGINGS.get());
                    entries.accept(LEAD_BOOTS.get());

                    entries.accept(QUARTZ_HELMET.get());
                    entries.accept(QUARTZ_CHESTPLATE.get());
                    entries.accept(QUARTZ_LEGGINGS.get());
                    entries.accept(QUARTZ_BOOTS.get());

                    entries.accept(REDSTONE_HELMET.get());
                    entries.accept(REDSTONE_CHESTPLATE.get());
                    entries.accept(REDSTONE_LEGGINGS.get());
                    entries.accept(REDSTONE_BOOTS.get());

                    entries.accept(LAVA_HELMET.get());
                    entries.accept(LAVA_CHESTPLATE.get());
                    entries.accept(LAVA_LEGGINGS.get());
                    entries.accept(LAVA_BOOTS.get());

                    entries.accept(BRONZE_INGOT.get());
                    entries.accept(AMETHYST_INGOT.get());
                    entries.accept(EMERALD_INGOT.get());
                    entries.accept(LEAD_INGOT.get());
                    entries.accept(QUARTZ_INGOT.get());
                    entries.accept(REDSTONE_INGOT.get());
                    entries.accept(RED_DIAMOND_INGOT.get());

                    entries.accept(LEAD_ORE.get());
                    entries.accept(RED_DIAMOND_ORE.get());
                    entries.accept(DEEPSLATE_RED_DIAMOND_ORE.get());

                    entries.accept(RAW_LEAD.get());
                    entries.accept(QUARTZ_SCRAP.get());
                    entries.accept(RED_DIAMOND.get());
                    entries.accept(LAVA_SMITHING_TEMPLATE.get());

                    entries.accept(DURABLE_FIREWORK_ROCKET.get());
                    entries.accept(DURABLE_FIREWORK_ROCKET_UPGRADED.get());
                    entries.accept(DURABLE_TOTEM_OF_UNDYING.get());
                    entries.accept(DURABLE_TOTEM_OF_UNDYING_UPGRADED.get());
                    entries.accept(DURABLE_TORCH.get());
                    entries.accept(DURABLE_TORCH_UPGRADED.get());
                })
                .build());
        itemGroupRegister.register();

        REGISTER.register();
    }

    public static void register() {
    }

    private static Item.Properties settingsOf(String name) {
        return settingsOf(name, new Item.Properties());
    }

    private static Item.Properties settingsOf(String name, Item.Properties settings) {
        return settings.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Constants.MOD_ID, name)));
    }

    private static List<Identifier> getLavaUpgradeEmptyBaseSlotTextures() {
        return List.of(
                Identifier.withDefaultNamespace("container/slot/helmet"),
                Identifier.withDefaultNamespace("container/slot/chestplate"),
                Identifier.withDefaultNamespace("container/slot/leggings"),
                Identifier.withDefaultNamespace("container/slot/boots"));
    }

    private static List<Identifier> getLavaUpgradeEmptyAdditionsSlotTextures() {
        return List.of(Identifier.withDefaultNamespace("container/slot/ingot"));
    }
}
