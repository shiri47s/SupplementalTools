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
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SmithingTemplateItem;
import net.syshima.sptools.core.armors.*;
import net.syshima.sptools.core.assets.ModToolMaterials;
import net.syshima.sptools.core.tools.*;

import java.util.List;

public final class ModItems {
    public static final ResourceKey<CreativeModeTab> MOD_GROUP = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GROUP_NAME));
    private static final DeferredRegister<Item> REGISTER = DeferredRegister.create(Constants.MOD_ID, Registries.ITEM);


    public static final RegistrySupplier<Item> BRONZE_SWORD = REGISTER.register(Constants.Items.BRONZE_SWORD, () -> new Item(settingsOf(Constants.Items.BRONZE_SWORD, new Item.Properties()).sword(ModToolMaterials.BRONZE, 1.0F, -2.4F)));
    public static final RegistrySupplier<Item> BRONZE_SHOVEL = REGISTER.register(Constants.Items.BRONZE_SHOVEL, () -> new ShovelItem(ModToolMaterials.BRONZE, 1.0F, -3.0F, settingsOf(Constants.Items.BRONZE_SHOVEL)));
    public static final RegistrySupplier<Item> BRONZE_PICKAXE = REGISTER.register(Constants.Items.BRONZE_PICKAXE, () -> new Item(settingsOf(Constants.Items.BRONZE_PICKAXE, new Item.Properties()).pickaxe(ModToolMaterials.BRONZE, 1.0F, -2.8F)));
    public static final RegistrySupplier<Item> BRONZE_AXE = REGISTER.register(Constants.Items.BRONZE_AXE, () -> new AxeItem(ModToolMaterials.BRONZE, 5.0F, -3.1F, settingsOf(Constants.Items.BRONZE_AXE)));
    public static final RegistrySupplier<Item> BRONZE_HOE = REGISTER.register(Constants.Items.BRONZE_HOE, () -> new HoeItem(ModToolMaterials.BRONZE, -2.0F, -1.6F, settingsOf(Constants.Items.BRONZE_HOE)));

    public static final RegistrySupplier<Item> IRONCOPPER_SWORD = REGISTER.register(Constants.Items.IRONCOPPER_SWORD, () -> new Item(settingsOf(Constants.Items.IRONCOPPER_SWORD, new Item.Properties()).sword(ModToolMaterials.IRONCOPPER, 1.0F, -2.4F)));
    public static final RegistrySupplier<Item> IRONCOPPER_SHOVEL = REGISTER.register(Constants.Items.IRONCOPPER_SHOVEL, () -> new ShovelItem(ModToolMaterials.IRONCOPPER, 1.0F, -3.0F, settingsOf(Constants.Items.IRONCOPPER_SHOVEL)));
    public static final RegistrySupplier<Item> IRONCOPPER_PICKAXE = REGISTER.register(Constants.Items.IRONCOPPER_PICKAXE, () -> new Item(settingsOf(Constants.Items.IRONCOPPER_PICKAXE, new Item.Properties()).pickaxe(ModToolMaterials.IRONCOPPER, 1.0F, -2.8F)));
    public static final RegistrySupplier<Item> IRONCOPPER_AXE = REGISTER.register(Constants.Items.IRONCOPPER_AXE, () -> new AxeItem(ModToolMaterials.IRONCOPPER, 5.0F, -3.1F, settingsOf(Constants.Items.IRONCOPPER_AXE)));
    public static final RegistrySupplier<Item> IRONCOPPER_HOE = REGISTER.register(Constants.Items.IRONCOPPER_HOE, () -> new HoeItem(ModToolMaterials.IRONCOPPER, -2.0F, -1.6F, settingsOf(Constants.Items.IRONCOPPER_HOE)));

    public static final RegistrySupplier<Item> AMETHYST_SWORD = REGISTER.register(Constants.Items.AMETHYST_SWORD, () -> new Item(settingsOf(Constants.Items.AMETHYST_SWORD, new Item.Properties()).sword(ModToolMaterials.AMETHYST, 1.0F, -2.4F)));
    public static final RegistrySupplier<Item> AMETHYST_SHOVEL = REGISTER.register(Constants.Items.AMETHYST_SHOVEL, () -> new ShovelItem(ModToolMaterials.AMETHYST, 1.0F, -3.0F, settingsOf(Constants.Items.AMETHYST_SHOVEL)));
    public static final RegistrySupplier<Item> AMETHYST_PICKAXE = REGISTER.register(Constants.Items.AMETHYST_PICKAXE, () -> new Item(settingsOf(Constants.Items.AMETHYST_PICKAXE, new Item.Properties()).pickaxe(ModToolMaterials.AMETHYST, 1.0F, -2.8F)));
    public static final RegistrySupplier<Item> AMETHYST_AXE = REGISTER.register(Constants.Items.AMETHYST_AXE, () -> new AxeItem(ModToolMaterials.AMETHYST, 5.0F, -3.1F, settingsOf(Constants.Items.AMETHYST_AXE)));
    public static final RegistrySupplier<Item> AMETHYST_HOE = REGISTER.register(Constants.Items.AMETHYST_HOE, () -> new HoeItem(ModToolMaterials.AMETHYST, -2.0F, -1.6F, settingsOf(Constants.Items.AMETHYST_HOE)));

    public static final RegistrySupplier<Item> EMERALD_SWORD = REGISTER.register(Constants.Items.EMERALD_SWORD, () -> new Item(settingsOf(Constants.Items.EMERALD_SWORD, new Item.Properties()).sword(ModToolMaterials.EMERALD, 1.0F, -2.4F)));
    public static final RegistrySupplier<Item> EMERALD_SHOVEL = REGISTER.register(Constants.Items.EMERALD_SHOVEL, () -> new ShovelItem(ModToolMaterials.EMERALD, 1.0F, -3.0F, settingsOf(Constants.Items.EMERALD_SHOVEL)));
    public static final RegistrySupplier<Item> EMERALD_PICKAXE = REGISTER.register(Constants.Items.EMERALD_PICKAXE, () -> new Item(settingsOf(Constants.Items.EMERALD_PICKAXE, new Item.Properties()).pickaxe(ModToolMaterials.EMERALD, 1.0F, -2.8F)));
    public static final RegistrySupplier<Item> EMERALD_AXE = REGISTER.register(Constants.Items.EMERALD_AXE, () -> new AxeItem(ModToolMaterials.EMERALD, 5.0F, -3.1F, settingsOf(Constants.Items.EMERALD_AXE)));
    public static final RegistrySupplier<Item> EMERALD_HOE = REGISTER.register(Constants.Items.EMERALD_HOE, () -> new HoeItem(ModToolMaterials.EMERALD, -2.0F, -1.6F, settingsOf(Constants.Items.EMERALD_HOE)));

    public static final RegistrySupplier<Item> LEAD_SWORD = REGISTER.register(Constants.Items.LEAD_SWORD, () -> new Item(settingsOf(Constants.Items.LEAD_SWORD, new Item.Properties()).sword(ModToolMaterials.LEAD, 1.0F, -2.4F)));
    public static final RegistrySupplier<Item> LEAD_SHOVEL = REGISTER.register(Constants.Items.LEAD_SHOVEL, () -> new ShovelItem(ModToolMaterials.LEAD, 1.0F, -3.0F, settingsOf(Constants.Items.LEAD_SHOVEL)));
    public static final RegistrySupplier<Item> LEAD_PICKAXE = REGISTER.register(Constants.Items.LEAD_PICKAXE, () -> new Item(settingsOf(Constants.Items.LEAD_PICKAXE, new Item.Properties()).pickaxe(ModToolMaterials.LEAD, 1.0F, -2.8F)));
    public static final RegistrySupplier<Item> LEAD_AXE = REGISTER.register(Constants.Items.LEAD_AXE, () -> new AxeItem(ModToolMaterials.LEAD, 5.0F, -3.1F, settingsOf(Constants.Items.LEAD_AXE)));
    public static final RegistrySupplier<Item> LEAD_HOE = REGISTER.register(Constants.Items.LEAD_HOE, () -> new HoeItem(ModToolMaterials.LEAD, -2.0F, -1.6F, settingsOf(Constants.Items.LEAD_HOE)));

    public static final RegistrySupplier<Item> QUARTZ_SWORD = REGISTER.register(Constants.Items.QUARTZ_SWORD, () -> new Item(settingsOf(Constants.Items.QUARTZ_SWORD, new Item.Properties()).sword(ModToolMaterials.QUARTZ, 1.0F, -2.4F)));
    public static final RegistrySupplier<Item> QUARTZ_SHOVEL = REGISTER.register(Constants.Items.QUARTZ_SHOVEL, () -> new ShovelItem(ModToolMaterials.QUARTZ, 1.0F, -3.0F, settingsOf(Constants.Items.QUARTZ_SHOVEL)));
    public static final RegistrySupplier<Item> QUARTZ_PICKAXE = REGISTER.register(Constants.Items.QUARTZ_PICKAXE, () -> new Item(settingsOf(Constants.Items.QUARTZ_PICKAXE, new Item.Properties()).pickaxe(ModToolMaterials.QUARTZ, 1.0F, -2.8F)));
    public static final RegistrySupplier<Item> QUARTZ_AXE = REGISTER.register(Constants.Items.QUARTZ_AXE, () -> new AxeItem(ModToolMaterials.QUARTZ, 5.0F, -3.1F, settingsOf(Constants.Items.QUARTZ_AXE)));
    public static final RegistrySupplier<Item> QUARTZ_HOE = REGISTER.register(Constants.Items.QUARTZ_HOE, () -> new HoeItem(ModToolMaterials.QUARTZ, -2.0F, -1.6F, settingsOf(Constants.Items.QUARTZ_HOE)));

    public static final RegistrySupplier<Item> REDSTONE_SWORD = REGISTER.register(Constants.Items.REDSTONE_SWORD, () -> new Item(settingsOf(Constants.Items.REDSTONE_SWORD, new Item.Properties()).sword(ModToolMaterials.REDSTONE, 1.0F, -2.4F)));
    public static final RegistrySupplier<Item> REDSTONE_SHOVEL = REGISTER.register(Constants.Items.REDSTONE_SHOVEL, () -> new ShovelItem(ModToolMaterials.REDSTONE, 1.0F, -3.0F, settingsOf(Constants.Items.REDSTONE_SHOVEL)));
    public static final RegistrySupplier<Item> REDSTONE_PICKAXE = REGISTER.register(Constants.Items.REDSTONE_PICKAXE, () -> new Item(settingsOf(Constants.Items.REDSTONE_PICKAXE, new Item.Properties()).pickaxe(ModToolMaterials.REDSTONE, 1.0F, -2.8F)));
    public static final RegistrySupplier<Item> REDSTONE_AXE = REGISTER.register(Constants.Items.REDSTONE_AXE, () -> new AxeItem(ModToolMaterials.REDSTONE, 5.0F, -3.1F, settingsOf(Constants.Items.REDSTONE_AXE)));
    public static final RegistrySupplier<Item> REDSTONE_HOE = REGISTER.register(Constants.Items.REDSTONE_HOE, () -> new HoeItem(ModToolMaterials.REDSTONE, -2.0F, -1.6F, settingsOf(Constants.Items.REDSTONE_HOE)));

    public static final RegistrySupplier<Item> BRONZE_HELMET = REGISTER.register(Constants.Items.BRONZE_HELMET, () -> new BronzeArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.BRONZE_HELMET)));
    public static final RegistrySupplier<Item> BRONZE_CHESTPLATE = REGISTER.register(Constants.Items.BRONZE_CHESTPLATE, () -> new BronzeArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.BRONZE_CHESTPLATE)));
    public static final RegistrySupplier<Item> BRONZE_LEGGINGS = REGISTER.register(Constants.Items.BRONZE_LEGGINGS, () -> new BronzeArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.BRONZE_LEGGINGS)));
    public static final RegistrySupplier<Item> BRONZE_BOOTS = REGISTER.register(Constants.Items.BRONZE_BOOTS, () -> new BronzeArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.BRONZE_BOOTS)));

    public static final RegistrySupplier<Item> IRONCOPPER_HELMET = REGISTER.register(Constants.Items.IRONCOPPER_HELMET, () -> new IronCopperArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.IRONCOPPER_HELMET)));
    public static final RegistrySupplier<Item> IRONCOPPER_CHESTPLATE = REGISTER.register(Constants.Items.IRONCOPPER_CHESTPLATE, () -> new IronCopperArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.IRONCOPPER_CHESTPLATE)));
    public static final RegistrySupplier<Item> IRONCOPPER_LEGGINGS = REGISTER.register(Constants.Items.IRONCOPPER_LEGGINGS, () -> new IronCopperArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.IRONCOPPER_LEGGINGS)));
    public static final RegistrySupplier<Item> IRONCOPPER_BOOTS = REGISTER.register(Constants.Items.IRONCOPPER_BOOTS, () -> new IronCopperArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.IRONCOPPER_BOOTS)));

    public static final RegistrySupplier<Item> AMETHYST_HELMET = REGISTER.register(Constants.Items.AMETHYST_HELMET, () -> new AmethystArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.AMETHYST_HELMET)));
    public static final RegistrySupplier<Item> AMETHYST_CHESTPLATE = REGISTER.register(Constants.Items.AMETHYST_CHESTPLATE, () -> new AmethystArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.AMETHYST_CHESTPLATE)));
    public static final RegistrySupplier<Item> AMETHYST_LEGGINGS = REGISTER.register(Constants.Items.AMETHYST_LEGGINGS, () -> new AmethystArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.AMETHYST_LEGGINGS)));
    public static final RegistrySupplier<Item> AMETHYST_BOOTS = REGISTER.register(Constants.Items.AMETHYST_BOOTS, () -> new AmethystArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.AMETHYST_BOOTS)));

    public static final RegistrySupplier<Item> EMERALD_HELMET = REGISTER.register(Constants.Items.EMERALD_HELMET, () -> new EmeraldArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.EMERALD_HELMET)));
    public static final RegistrySupplier<Item> EMERALD_CHESTPLATE = REGISTER.register(Constants.Items.EMERALD_CHESTPLATE, () -> new EmeraldArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.EMERALD_CHESTPLATE)));
    public static final RegistrySupplier<Item> EMERALD_LEGGINGS = REGISTER.register(Constants.Items.EMERALD_LEGGINGS, () -> new EmeraldArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.EMERALD_LEGGINGS)));
    public static final RegistrySupplier<Item> EMERALD_BOOTS = REGISTER.register(Constants.Items.EMERALD_BOOTS, () -> new EmeraldArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.EMERALD_BOOTS)));

    public static final RegistrySupplier<Item> LEAD_HELMET = REGISTER.register(Constants.Items.LEAD_HELMET, () -> new LeadArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.LEAD_HELMET)));
    public static final RegistrySupplier<Item> LEAD_CHESTPLATE = REGISTER.register(Constants.Items.LEAD_CHESTPLATE, () -> new LeadArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.LEAD_CHESTPLATE)));
    public static final RegistrySupplier<Item> LEAD_LEGGINGS = REGISTER.register(Constants.Items.LEAD_LEGGINGS, () -> new LeadArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.LEAD_LEGGINGS)));
    public static final RegistrySupplier<Item> LEAD_BOOTS = REGISTER.register(Constants.Items.LEAD_BOOTS, () -> new LeadArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.LEAD_BOOTS)));

    public static final RegistrySupplier<Item> QUARTZ_HELMET = REGISTER.register(Constants.Items.QUARTZ_HELMET, () -> new QuartzArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.QUARTZ_HELMET)));
    public static final RegistrySupplier<Item> QUARTZ_CHESTPLATE = REGISTER.register(Constants.Items.QUARTZ_CHESTPLATE, () -> new QuartzArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.QUARTZ_CHESTPLATE)));
    public static final RegistrySupplier<Item> QUARTZ_LEGGINGS = REGISTER.register(Constants.Items.QUARTZ_LEGGINGS, () -> new QuartzArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.QUARTZ_LEGGINGS)));
    public static final RegistrySupplier<Item> QUARTZ_BOOTS = REGISTER.register(Constants.Items.QUARTZ_BOOTS, () -> new QuartzArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.QUARTZ_BOOTS)));

    public static final RegistrySupplier<Item> REDSTONE_HELMET = REGISTER.register(Constants.Items.REDSTONE_HELMET, () -> new RedstoneArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.REDSTONE_HELMET)));
    public static final RegistrySupplier<Item> REDSTONE_CHESTPLATE = REGISTER.register(Constants.Items.REDSTONE_CHESTPLATE, () -> new RedstoneArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.REDSTONE_CHESTPLATE)));
    public static final RegistrySupplier<Item> REDSTONE_LEGGINGS = REGISTER.register(Constants.Items.REDSTONE_LEGGINGS, () -> new RedstoneArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.REDSTONE_LEGGINGS)));
    public static final RegistrySupplier<Item> REDSTONE_BOOTS = REGISTER.register(Constants.Items.REDSTONE_BOOTS, () -> new RedstoneArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.REDSTONE_BOOTS)));

    public static final RegistrySupplier<Item> LAVA_HELMET = REGISTER.register(Constants.Items.LAVA_HELMET, () -> new LavaArmorItem(ArmorType.HELMET, settingsOf(Constants.Items.LAVA_HELMET)));
    public static final RegistrySupplier<Item> LAVA_CHESTPLATE = REGISTER.register(Constants.Items.LAVA_CHESTPLATE, () -> new LavaArmorItem(ArmorType.CHESTPLATE, settingsOf(Constants.Items.LAVA_CHESTPLATE)));
    public static final RegistrySupplier<Item> LAVA_LEGGINGS = REGISTER.register(Constants.Items.LAVA_LEGGINGS, () -> new LavaArmorItem(ArmorType.LEGGINGS, settingsOf(Constants.Items.LAVA_LEGGINGS)));
    public static final RegistrySupplier<Item> LAVA_BOOTS = REGISTER.register(Constants.Items.LAVA_BOOTS, () -> new LavaArmorItem(ArmorType.BOOTS, settingsOf(Constants.Items.LAVA_BOOTS)));

    public static final RegistrySupplier<Item> BRONZE_INGOT = REGISTER.register(Constants.Items.BRONZE_INGOT, () -> new Item(settingsOf(Constants.Items.BRONZE_INGOT, new Item.Properties())));
    public static final RegistrySupplier<Item> AMETHYST_INGOT = REGISTER.register(Constants.Items.AMETHYST_INGOT, () -> new Item(settingsOf(Constants.Items.AMETHYST_INGOT, new Item.Properties())));
    public static final RegistrySupplier<Item> EMERALD_INGOT = REGISTER.register(Constants.Items.EMERALD_INGOT, () -> new Item(settingsOf(Constants.Items.EMERALD_INGOT, new Item.Properties())));
    public static final RegistrySupplier<Item> LEAD_INGOT = REGISTER.register(Constants.Items.LEAD_INGOT, () -> new Item(settingsOf(Constants.Items.LEAD_INGOT, new Item.Properties())));
    public static final RegistrySupplier<Item> QUARTZ_INGOT = REGISTER.register(Constants.Items.QUARTZ_INGOT, () -> new Item(settingsOf(Constants.Items.QUARTZ_INGOT, new Item.Properties())));
    public static final RegistrySupplier<Item> REDSTONE_INGOT = REGISTER.register(Constants.Items.REDSTONE_INGOT, () -> new Item(settingsOf(Constants.Items.REDSTONE_INGOT, new Item.Properties())));
    public static final RegistrySupplier<Item> RED_DIAMOND_INGOT = REGISTER.register(Constants.Items.RED_DIAMOND_INGOT, () -> new Item(settingsOf(Constants.Items.RED_DIAMOND_INGOT, new Item.Properties())));

    public static final RegistrySupplier<Item> LEAD_ORE = REGISTER.register(Constants.Items.LEAD_ORE, () -> new BlockItem(ModBlocks.LEAD_ORE.get(), settingsOf(Constants.Items.LEAD_ORE, new Item.Properties().useBlockDescriptionPrefix())));
    public static final RegistrySupplier<Item> RED_DIAMOND_ORE = REGISTER.register(Constants.Items.RED_DIAMOND_ORE, () -> new BlockItem(ModBlocks.RED_DIAMOND_ORE.get(), settingsOf(Constants.Items.RED_DIAMOND_ORE, new Item.Properties().useBlockDescriptionPrefix())));
    public static final RegistrySupplier<Item> DEEPSLATE_RED_DIAMOND_ORE = REGISTER.register(Constants.Items.DEEPSLATE_RED_DIAMOND_ORE, () -> new BlockItem(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get(), settingsOf(Constants.Items.DEEPSLATE_RED_DIAMOND_ORE, new Item.Properties().useBlockDescriptionPrefix())));

    public static final RegistrySupplier<Item> RAW_LEAD = REGISTER.register(Constants.Items.RAW_LEAD, () -> new Item(settingsOf(Constants.Items.RAW_LEAD, new Item.Properties())));
    public static final RegistrySupplier<Item> QUARTZ_SCRAP = REGISTER.register(Constants.Items.QUARTZ_SCRAP, () -> new Item(settingsOf(Constants.Items.QUARTZ_SCRAP, new Item.Properties())));
    public static final RegistrySupplier<Item> RED_DIAMOND = REGISTER.register(Constants.Items.RED_DIAMOND, () -> new Item(settingsOf(Constants.Items.RED_DIAMOND, new Item.Properties())));
    public static final RegistrySupplier<Item> LAVA_SMITHING_TEMPLATE = REGISTER.register(Constants.Items.LAVA_SMITHING_TEMPLATE, () -> new SmithingTemplateItem(Component.translatable("item.sptools.lava_upgrade_smithing_template.applies_to"), Component.translatable("item.sptools.lava_upgrade_smithing_template.ingredients"), Component.translatable("item.sptools.lava_upgrade_smithing_template.base_slot"), Component.translatable("item.sptools.lava_upgrade_smithing_template.additions_slot"), getLavaUpgradeEmptyBaseSlotTextures(), getLavaUpgradeEmptyAdditionsSlotTextures(), settingsOf(Constants.Items.LAVA_SMITHING_TEMPLATE, (new Item.Properties()).fireResistant().rarity(Rarity.EPIC))));

    public static final RegistrySupplier<Item> DURABLE_FIREWORK_ROCKET = REGISTER.register(Constants.Items.DURABLE_FIREWORK_ROCKET, () -> new DurableFireworkRocket(settingsOf(Constants.Items.DURABLE_FIREWORK_ROCKET, (new Item.Properties()).pickaxe(ModToolMaterials.DURABLE, 1.0F, -2.2F))));
    public static final RegistrySupplier<Item> DURABLE_FIREWORK_ROCKET_UPGRADED = REGISTER.register(Constants.Items.DURABLE_FIREWORK_ROCKET_UPGRADED, () -> new DurableFireworkRocketUpgraded(settingsOf(Constants.Items.DURABLE_FIREWORK_ROCKET_UPGRADED, (new Item.Properties()).pickaxe(ModToolMaterials.DURABLE_UPGRADED, 1.5F, -2.1F))));
    public static final RegistrySupplier<Item> DURABLE_TOTEM_OF_UNDYING = REGISTER.register(Constants.Items.DURABLE_TOTEM_OF_UNDYING, () -> new DurableTotemOfUndying(settingsOf(Constants.Items.DURABLE_TOTEM_OF_UNDYING, (new Item.Properties()).shovel(ModToolMaterials.DURABLE, 1.0F, -2.3F))));
    public static final RegistrySupplier<Item> DURABLE_TOTEM_OF_UNDYING_UPGRADED = REGISTER.register(Constants.Items.DURABLE_TOTEM_OF_UNDYING_UPGRADED, () -> new DurableTotemOfUndyingUpgraded(settingsOf(Constants.Items.DURABLE_TOTEM_OF_UNDYING_UPGRADED, (new Item.Properties()).shovel(ModToolMaterials.DURABLE_UPGRADED, 1.5F, -2.2F))));
    public static final RegistrySupplier<Item> DURABLE_TORCH = REGISTER.register(Constants.Items.DURABLE_TORCH, () -> new DurableTorch(settingsOf(Constants.Items.DURABLE_TORCH, (new Item.Properties()).pickaxe(ModToolMaterials.DURABLE, 1.0F, -2.1F))));
    public static final RegistrySupplier<Item> DURABLE_TORCH_UPGRADED = REGISTER.register(Constants.Items.DURABLE_TORCH_UPGRADED, () -> new DurableTorchUpgraded(settingsOf(Constants.Items.DURABLE_TORCH_UPGRADED, (new Item.Properties()).pickaxe(ModToolMaterials.DURABLE_UPGRADED, 1.5F, -2.0F))));

    private ModItems() {
    }

    public static void register() {
        REGISTER.register();

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
