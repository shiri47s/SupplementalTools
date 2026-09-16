package net.syshima.sptools;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import java.util.List;
import java.util.function.BiFunction;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SmithingTemplateItem;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.syshima.sptools.core.ArmorSeries;
import net.syshima.sptools.core.armors.*;
import net.syshima.sptools.core.assets.ModToolMaterials;
import net.syshima.sptools.core.tools.*;

public final class ModItems {
    public static final ResourceKey<CreativeModeTab> MOD_GROUP = ResourceKey.create(Registries.CREATIVE_MODE_TAB, Identifier.fromNamespaceAndPath(Constants.MOD_ID, Constants.GROUP_NAME));
    private static final DeferredRegister<Item> REGISTER = DeferredRegister.create(Constants.MOD_ID, Registries.ITEM);


    public static final RegistrySupplier<Item> BRONZE_SWORD = sword(Constants.Items.BRONZE_SWORD, ModToolMaterials.BRONZE);
    public static final RegistrySupplier<Item> BRONZE_SHOVEL = shovel(Constants.Items.BRONZE_SHOVEL, ModToolMaterials.BRONZE);
    public static final RegistrySupplier<Item> BRONZE_PICKAXE = pickaxe(Constants.Items.BRONZE_PICKAXE, ModToolMaterials.BRONZE);
    public static final RegistrySupplier<Item> BRONZE_AXE = axe(Constants.Items.BRONZE_AXE, ModToolMaterials.BRONZE);
    public static final RegistrySupplier<Item> BRONZE_HOE = hoe(Constants.Items.BRONZE_HOE, ModToolMaterials.BRONZE);

    public static final RegistrySupplier<Item> IRONCOPPER_SWORD = sword(Constants.Items.IRONCOPPER_SWORD, ModToolMaterials.IRONCOPPER);
    public static final RegistrySupplier<Item> IRONCOPPER_SHOVEL = shovel(Constants.Items.IRONCOPPER_SHOVEL, ModToolMaterials.IRONCOPPER);
    public static final RegistrySupplier<Item> IRONCOPPER_PICKAXE = pickaxe(Constants.Items.IRONCOPPER_PICKAXE, ModToolMaterials.IRONCOPPER);
    public static final RegistrySupplier<Item> IRONCOPPER_AXE = axe(Constants.Items.IRONCOPPER_AXE, ModToolMaterials.IRONCOPPER);
    public static final RegistrySupplier<Item> IRONCOPPER_HOE = hoe(Constants.Items.IRONCOPPER_HOE, ModToolMaterials.IRONCOPPER);

    public static final RegistrySupplier<Item> AMETHYST_SWORD = sword(Constants.Items.AMETHYST_SWORD, ModToolMaterials.AMETHYST);
    public static final RegistrySupplier<Item> AMETHYST_SHOVEL = shovel(Constants.Items.AMETHYST_SHOVEL, ModToolMaterials.AMETHYST);
    public static final RegistrySupplier<Item> AMETHYST_PICKAXE = pickaxe(Constants.Items.AMETHYST_PICKAXE, ModToolMaterials.AMETHYST);
    public static final RegistrySupplier<Item> AMETHYST_AXE = axe(Constants.Items.AMETHYST_AXE, ModToolMaterials.AMETHYST);
    public static final RegistrySupplier<Item> AMETHYST_HOE = hoe(Constants.Items.AMETHYST_HOE, ModToolMaterials.AMETHYST);

    public static final RegistrySupplier<Item> EMERALD_SWORD = sword(Constants.Items.EMERALD_SWORD, ModToolMaterials.EMERALD);
    public static final RegistrySupplier<Item> EMERALD_SHOVEL = shovel(Constants.Items.EMERALD_SHOVEL, ModToolMaterials.EMERALD);
    public static final RegistrySupplier<Item> EMERALD_PICKAXE = pickaxe(Constants.Items.EMERALD_PICKAXE, ModToolMaterials.EMERALD);
    public static final RegistrySupplier<Item> EMERALD_AXE = axe(Constants.Items.EMERALD_AXE, ModToolMaterials.EMERALD);
    public static final RegistrySupplier<Item> EMERALD_HOE = hoe(Constants.Items.EMERALD_HOE, ModToolMaterials.EMERALD);

    public static final RegistrySupplier<Item> LEAD_SWORD = sword(Constants.Items.LEAD_SWORD, ModToolMaterials.LEAD);
    public static final RegistrySupplier<Item> LEAD_SHOVEL = shovel(Constants.Items.LEAD_SHOVEL, ModToolMaterials.LEAD);
    public static final RegistrySupplier<Item> LEAD_PICKAXE = pickaxe(Constants.Items.LEAD_PICKAXE, ModToolMaterials.LEAD);
    public static final RegistrySupplier<Item> LEAD_AXE = axe(Constants.Items.LEAD_AXE, ModToolMaterials.LEAD);
    public static final RegistrySupplier<Item> LEAD_HOE = hoe(Constants.Items.LEAD_HOE, ModToolMaterials.LEAD);

    public static final RegistrySupplier<Item> QUARTZ_SWORD = sword(Constants.Items.QUARTZ_SWORD, ModToolMaterials.QUARTZ);
    public static final RegistrySupplier<Item> QUARTZ_SHOVEL = shovel(Constants.Items.QUARTZ_SHOVEL, ModToolMaterials.QUARTZ);
    public static final RegistrySupplier<Item> QUARTZ_PICKAXE = pickaxe(Constants.Items.QUARTZ_PICKAXE, ModToolMaterials.QUARTZ);
    public static final RegistrySupplier<Item> QUARTZ_AXE = axe(Constants.Items.QUARTZ_AXE, ModToolMaterials.QUARTZ);
    public static final RegistrySupplier<Item> QUARTZ_HOE = hoe(Constants.Items.QUARTZ_HOE, ModToolMaterials.QUARTZ);

    public static final RegistrySupplier<Item> REDSTONE_SWORD = sword(Constants.Items.REDSTONE_SWORD, ModToolMaterials.REDSTONE);
    public static final RegistrySupplier<Item> REDSTONE_SHOVEL = shovel(Constants.Items.REDSTONE_SHOVEL, ModToolMaterials.REDSTONE);
    public static final RegistrySupplier<Item> REDSTONE_PICKAXE = pickaxe(Constants.Items.REDSTONE_PICKAXE, ModToolMaterials.REDSTONE);
    public static final RegistrySupplier<Item> REDSTONE_AXE = axe(Constants.Items.REDSTONE_AXE, ModToolMaterials.REDSTONE);
    public static final RegistrySupplier<Item> REDSTONE_HOE = hoe(Constants.Items.REDSTONE_HOE, ModToolMaterials.REDSTONE);

    public static final RegistrySupplier<Item> BRONZE_HELMET = armor(Constants.Items.BRONZE_HELMET, ArmorType.HELMET, Constants.Series.Bronze);
    public static final RegistrySupplier<Item> BRONZE_CHESTPLATE = armor(Constants.Items.BRONZE_CHESTPLATE, ArmorType.CHESTPLATE, Constants.Series.Bronze);
    public static final RegistrySupplier<Item> BRONZE_LEGGINGS = armor(Constants.Items.BRONZE_LEGGINGS, ArmorType.LEGGINGS, Constants.Series.Bronze);
    public static final RegistrySupplier<Item> BRONZE_BOOTS = armor(Constants.Items.BRONZE_BOOTS, ArmorType.BOOTS, Constants.Series.Bronze);

    public static final RegistrySupplier<Item> IRONCOPPER_HELMET = armor(Constants.Items.IRONCOPPER_HELMET, ArmorType.HELMET, Constants.Series.IronCopper);
    public static final RegistrySupplier<Item> IRONCOPPER_CHESTPLATE = armor(Constants.Items.IRONCOPPER_CHESTPLATE, ArmorType.CHESTPLATE, Constants.Series.IronCopper);
    public static final RegistrySupplier<Item> IRONCOPPER_LEGGINGS = armor(Constants.Items.IRONCOPPER_LEGGINGS, ArmorType.LEGGINGS, Constants.Series.IronCopper);
    public static final RegistrySupplier<Item> IRONCOPPER_BOOTS = armor(Constants.Items.IRONCOPPER_BOOTS, ArmorType.BOOTS, Constants.Series.IronCopper);

    public static final RegistrySupplier<Item> AMETHYST_HELMET = armor(Constants.Items.AMETHYST_HELMET, ArmorType.HELMET, Constants.Series.Amethyst);
    public static final RegistrySupplier<Item> AMETHYST_CHESTPLATE = armor(Constants.Items.AMETHYST_CHESTPLATE, ArmorType.CHESTPLATE, Constants.Series.Amethyst);
    public static final RegistrySupplier<Item> AMETHYST_LEGGINGS = armor(Constants.Items.AMETHYST_LEGGINGS, ArmorType.LEGGINGS, Constants.Series.Amethyst);
    public static final RegistrySupplier<Item> AMETHYST_BOOTS = armor(Constants.Items.AMETHYST_BOOTS, ArmorType.BOOTS, Constants.Series.Amethyst);

    public static final RegistrySupplier<Item> EMERALD_HELMET = armor(Constants.Items.EMERALD_HELMET, ArmorType.HELMET, Constants.Series.Emerald);
    public static final RegistrySupplier<Item> EMERALD_CHESTPLATE = armor(Constants.Items.EMERALD_CHESTPLATE, ArmorType.CHESTPLATE, Constants.Series.Emerald);
    public static final RegistrySupplier<Item> EMERALD_LEGGINGS = armor(Constants.Items.EMERALD_LEGGINGS, ArmorType.LEGGINGS, Constants.Series.Emerald);
    public static final RegistrySupplier<Item> EMERALD_BOOTS = armor(Constants.Items.EMERALD_BOOTS, ArmorType.BOOTS, Constants.Series.Emerald);

    public static final RegistrySupplier<Item> LEAD_HELMET = armor(Constants.Items.LEAD_HELMET, ArmorType.HELMET, Constants.Series.Lead);
    public static final RegistrySupplier<Item> LEAD_CHESTPLATE = armor(Constants.Items.LEAD_CHESTPLATE, ArmorType.CHESTPLATE, Constants.Series.Lead);
    public static final RegistrySupplier<Item> LEAD_LEGGINGS = armor(Constants.Items.LEAD_LEGGINGS, ArmorType.LEGGINGS, Constants.Series.Lead);
    public static final RegistrySupplier<Item> LEAD_BOOTS = armor(Constants.Items.LEAD_BOOTS, ArmorType.BOOTS, Constants.Series.Lead);

    public static final RegistrySupplier<Item> QUARTZ_HELMET = armor(Constants.Items.QUARTZ_HELMET, ArmorType.HELMET, Constants.Series.Quartz);
    public static final RegistrySupplier<Item> QUARTZ_CHESTPLATE = armor(Constants.Items.QUARTZ_CHESTPLATE, ArmorType.CHESTPLATE, Constants.Series.Quartz);
    public static final RegistrySupplier<Item> QUARTZ_LEGGINGS = armor(Constants.Items.QUARTZ_LEGGINGS, ArmorType.LEGGINGS, Constants.Series.Quartz);
    public static final RegistrySupplier<Item> QUARTZ_BOOTS = armor(Constants.Items.QUARTZ_BOOTS, ArmorType.BOOTS, Constants.Series.Quartz);

    public static final RegistrySupplier<Item> REDSTONE_HELMET = armor(Constants.Items.REDSTONE_HELMET, ArmorType.HELMET, RedstoneArmorItem::new);
    public static final RegistrySupplier<Item> REDSTONE_CHESTPLATE = armor(Constants.Items.REDSTONE_CHESTPLATE, ArmorType.CHESTPLATE, RedstoneArmorItem::new);
    public static final RegistrySupplier<Item> REDSTONE_LEGGINGS = armor(Constants.Items.REDSTONE_LEGGINGS, ArmorType.LEGGINGS, RedstoneArmorItem::new);
    public static final RegistrySupplier<Item> REDSTONE_BOOTS = armor(Constants.Items.REDSTONE_BOOTS, ArmorType.BOOTS, RedstoneArmorItem::new);

    public static final RegistrySupplier<Item> LAVA_HELMET = armor(Constants.Items.LAVA_HELMET, ArmorType.HELMET, Constants.Series.Lava);
    public static final RegistrySupplier<Item> LAVA_CHESTPLATE = armor(Constants.Items.LAVA_CHESTPLATE, ArmorType.CHESTPLATE, Constants.Series.Lava);
    public static final RegistrySupplier<Item> LAVA_LEGGINGS = armor(Constants.Items.LAVA_LEGGINGS, ArmorType.LEGGINGS, Constants.Series.Lava);
    public static final RegistrySupplier<Item> LAVA_BOOTS = armor(Constants.Items.LAVA_BOOTS, ArmorType.BOOTS, Constants.Series.Lava);

    public static final RegistrySupplier<Item> BRONZE_INGOT = simple(Constants.Items.BRONZE_INGOT);
    public static final RegistrySupplier<Item> AMETHYST_INGOT = simple(Constants.Items.AMETHYST_INGOT);
    public static final RegistrySupplier<Item> EMERALD_INGOT = simple(Constants.Items.EMERALD_INGOT);
    public static final RegistrySupplier<Item> LEAD_INGOT = simple(Constants.Items.LEAD_INGOT);
    public static final RegistrySupplier<Item> QUARTZ_INGOT = simple(Constants.Items.QUARTZ_INGOT);
    public static final RegistrySupplier<Item> REDSTONE_INGOT = simple(Constants.Items.REDSTONE_INGOT);
    public static final RegistrySupplier<Item> RED_DIAMOND_INGOT = simple(Constants.Items.RED_DIAMOND_INGOT);

    public static final RegistrySupplier<Item> LEAD_ORE = blockItem(Constants.Items.LEAD_ORE, ModBlocks.LEAD_ORE);
    public static final RegistrySupplier<Item> RED_DIAMOND_ORE = blockItem(Constants.Items.RED_DIAMOND_ORE, ModBlocks.RED_DIAMOND_ORE);
    public static final RegistrySupplier<Item> DEEPSLATE_RED_DIAMOND_ORE = blockItem(Constants.Items.DEEPSLATE_RED_DIAMOND_ORE, ModBlocks.DEEPSLATE_RED_DIAMOND_ORE);

    public static final RegistrySupplier<Item> RAW_LEAD = simple(Constants.Items.RAW_LEAD);
    public static final RegistrySupplier<Item> QUARTZ_SCRAP = simple(Constants.Items.QUARTZ_SCRAP);
    public static final RegistrySupplier<Item> RED_DIAMOND = simple(Constants.Items.RED_DIAMOND);
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
                accept(entries, BRONZE_SWORD, BRONZE_SHOVEL, BRONZE_PICKAXE, BRONZE_AXE, BRONZE_HOE);

                accept(entries, IRONCOPPER_SWORD, IRONCOPPER_SHOVEL, IRONCOPPER_PICKAXE, IRONCOPPER_AXE, IRONCOPPER_HOE);

                accept(entries, AMETHYST_SWORD, AMETHYST_SHOVEL, AMETHYST_PICKAXE, AMETHYST_AXE, AMETHYST_HOE);

                accept(entries, EMERALD_SWORD, EMERALD_SHOVEL, EMERALD_PICKAXE, EMERALD_AXE, EMERALD_HOE);

                accept(entries, LEAD_SWORD, LEAD_SHOVEL, LEAD_PICKAXE, LEAD_AXE, LEAD_HOE);

                accept(entries, QUARTZ_SWORD, QUARTZ_SHOVEL, QUARTZ_PICKAXE, QUARTZ_AXE, QUARTZ_HOE);

                accept(entries, REDSTONE_SWORD, REDSTONE_SHOVEL, REDSTONE_PICKAXE, REDSTONE_AXE, REDSTONE_HOE);

                accept(entries, BRONZE_HELMET, BRONZE_CHESTPLATE, BRONZE_LEGGINGS, BRONZE_BOOTS);

                accept(entries, IRONCOPPER_HELMET, IRONCOPPER_CHESTPLATE, IRONCOPPER_LEGGINGS, IRONCOPPER_BOOTS);

                accept(entries, AMETHYST_HELMET, AMETHYST_CHESTPLATE, AMETHYST_LEGGINGS, AMETHYST_BOOTS);

                accept(entries, EMERALD_HELMET, EMERALD_CHESTPLATE, EMERALD_LEGGINGS, EMERALD_BOOTS);

                accept(entries, LEAD_HELMET, LEAD_CHESTPLATE, LEAD_LEGGINGS, LEAD_BOOTS);

                accept(entries, QUARTZ_HELMET, QUARTZ_CHESTPLATE, QUARTZ_LEGGINGS, QUARTZ_BOOTS);

                accept(entries, REDSTONE_HELMET, REDSTONE_CHESTPLATE, REDSTONE_LEGGINGS, REDSTONE_BOOTS);

                accept(entries, LAVA_HELMET, LAVA_CHESTPLATE, LAVA_LEGGINGS, LAVA_BOOTS);

                accept(entries, BRONZE_INGOT, AMETHYST_INGOT, EMERALD_INGOT, LEAD_INGOT, QUARTZ_INGOT, REDSTONE_INGOT, RED_DIAMOND_INGOT);

                accept(entries, LEAD_ORE, RED_DIAMOND_ORE, DEEPSLATE_RED_DIAMOND_ORE);

                accept(entries, RAW_LEAD, QUARTZ_SCRAP, RED_DIAMOND, LAVA_SMITHING_TEMPLATE);

                accept(entries, DURABLE_FIREWORK_ROCKET, DURABLE_FIREWORK_ROCKET_UPGRADED, DURABLE_TOTEM_OF_UNDYING, DURABLE_TOTEM_OF_UNDYING_UPGRADED, DURABLE_TORCH, DURABLE_TORCH_UPGRADED);
            })
            .build());
        itemGroupRegister.register();
    }

    // One helper per item shape. The numbers are the per-shape balance and live here
    // rather than being repeated on every series.

    private static RegistrySupplier<Item> sword(String name, ToolMaterial material) {
        return REGISTER.register(name, () -> new Item(settingsOf(name).sword(material, 1.0F, -2.4F)));
    }

    private static RegistrySupplier<Item> shovel(String name, ToolMaterial material) {
        return REGISTER.register(name, () -> new ShovelItem(material, 1.0F, -3.0F, settingsOf(name)));
    }

    private static RegistrySupplier<Item> pickaxe(String name, ToolMaterial material) {
        return REGISTER.register(name, () -> new Item(settingsOf(name).pickaxe(material, 1.0F, -2.8F)));
    }

    private static RegistrySupplier<Item> axe(String name, ToolMaterial material) {
        return REGISTER.register(name, () -> new AxeItem(material, 5.0F, -3.1F, settingsOf(name)));
    }

    private static RegistrySupplier<Item> hoe(String name, ToolMaterial material) {
        return REGISTER.register(name, () -> new HoeItem(material, -2.0F, -1.6F, settingsOf(name)));
    }

    private static RegistrySupplier<Item> armor(String name, ArmorType type, Constants.Series series) {
        return REGISTER.register(name, () -> new SeriesArmorItem(series, type, settingsOf(name)));
    }

    /** For a series that needs more than {@link ArmorSeries} can describe. */
    private static RegistrySupplier<Item> armor(String name, ArmorType type,
                                                BiFunction<ArmorType, Item.Properties, Item> factory) {
        return REGISTER.register(name, () -> factory.apply(type, settingsOf(name)));
    }

    private static RegistrySupplier<Item> simple(String name) {
        return REGISTER.register(name, () -> new Item(settingsOf(name)));
    }

    private static RegistrySupplier<Item> blockItem(String name, RegistrySupplier<Block> block) {
        return REGISTER.register(name,
                () -> new BlockItem(block.get(), settingsOf(name, new Item.Properties().useBlockDescriptionPrefix())));
    }

    @SafeVarargs
    private static void accept(CreativeModeTab.Output entries, RegistrySupplier<Item>... items) {
        for (RegistrySupplier<Item> item : items) {
            entries.accept(item.get());
        }
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
