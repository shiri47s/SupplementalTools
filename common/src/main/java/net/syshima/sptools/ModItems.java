package net.syshima.sptools;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.syshima.sptools.base.ModBlockItem;
import net.syshima.sptools.base.ModItem;
import net.syshima.sptools.base.ModTemplateItem;
import net.syshima.sptools.core.armors.*;
import net.syshima.sptools.core.assets.ModToolMaterials;

import java.util.List;

public final class ModItems {
    public static final RegistryKey<ItemGroup> MOD_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(Constants.MOD_ID, Constants.GROUP_NAME));
    private static final DeferredRegister<Item> REGISTER = DeferredRegister.create(Constants.MOD_ID, RegistryKeys.ITEM);

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

    static {

        BRONZE_SWORD = REGISTER.register(Constants.Tool.BRONZE_SWORD, () -> new ModItem(settingsOf(Constants.Tool.BRONZE_SWORD, new Item.Settings()).sword(ModToolMaterials.BRONZE, 1.0F, -2.4F)));
        BRONZE_SHOVEL = REGISTER.register(Constants.Tool.BRONZE_SHOVEL, () -> new ShovelItem(ModToolMaterials.BRONZE, 1.0F, -3.0F, settingsOf(Constants.Tool.BRONZE_SHOVEL)));
        BRONZE_PICKAXE = REGISTER.register(Constants.Tool.BRONZE_PICKAXE, () -> new ModItem(settingsOf(Constants.Tool.BRONZE_PICKAXE, new Item.Settings()).pickaxe(ModToolMaterials.BRONZE, 1.0F, -2.8F)));
        BRONZE_AXE = REGISTER.register(Constants.Tool.BRONZE_AXE, () -> new AxeItem(ModToolMaterials.BRONZE, 5.0F, -3.1F, settingsOf(Constants.Tool.BRONZE_AXE)));
        BRONZE_HOE = REGISTER.register(Constants.Tool.BRONZE_HOE, () -> new HoeItem(ModToolMaterials.BRONZE, -2.0F, -1.6F, settingsOf(Constants.Tool.BRONZE_HOE)));

        IRONCOPPER_SWORD = REGISTER.register(Constants.Tool.IRONCOPPER_SWORD, () -> new ModItem(settingsOf(Constants.Tool.IRONCOPPER_SWORD, new Item.Settings()).sword(ModToolMaterials.IRONCOPPER, 1.0F, -2.4F)));
        IRONCOPPER_SHOVEL = REGISTER.register(Constants.Tool.IRONCOPPER_SHOVEL, () -> new ShovelItem(ModToolMaterials.IRONCOPPER, 1.0F, -3.0F, settingsOf(Constants.Tool.IRONCOPPER_SHOVEL)));
        IRONCOPPER_PICKAXE = REGISTER.register(Constants.Tool.IRONCOPPER_PICKAXE, () -> new ModItem(settingsOf(Constants.Tool.IRONCOPPER_PICKAXE, new Item.Settings()).pickaxe(ModToolMaterials.IRONCOPPER, 1.0F, -2.8F)));
        IRONCOPPER_AXE = REGISTER.register(Constants.Tool.IRONCOPPER_AXE, () -> new AxeItem(ModToolMaterials.IRONCOPPER, 5.0F, -3.1F, settingsOf(Constants.Tool.IRONCOPPER_AXE)));
        IRONCOPPER_HOE = REGISTER.register(Constants.Tool.IRONCOPPER_HOE, () -> new HoeItem(ModToolMaterials.IRONCOPPER, -2.0F, -1.6F, settingsOf(Constants.Tool.IRONCOPPER_HOE)));

        AMETHYST_SWORD = REGISTER.register(Constants.Tool.AMETHYST_SWORD, () -> new ModItem(settingsOf(Constants.Tool.AMETHYST_SWORD, new Item.Settings()).sword(ModToolMaterials.AMETHYST, 1.0F, -2.4F)));
        AMETHYST_SHOVEL = REGISTER.register(Constants.Tool.AMETHYST_SHOVEL, () -> new ShovelItem(ModToolMaterials.AMETHYST, 1.0F, -3.0F, settingsOf(Constants.Tool.AMETHYST_SHOVEL)));
        AMETHYST_PICKAXE = REGISTER.register(Constants.Tool.AMETHYST_PICKAXE, () -> new ModItem(settingsOf(Constants.Tool.AMETHYST_PICKAXE, new Item.Settings()).pickaxe(ModToolMaterials.AMETHYST, 1.0F, -2.8F)));
        AMETHYST_AXE = REGISTER.register(Constants.Tool.AMETHYST_AXE, () -> new AxeItem(ModToolMaterials.AMETHYST, 5.0F, -3.1F, settingsOf(Constants.Tool.AMETHYST_AXE)));
        AMETHYST_HOE = REGISTER.register(Constants.Tool.AMETHYST_HOE, () -> new HoeItem(ModToolMaterials.AMETHYST, -2.0F, -1.6F, settingsOf(Constants.Tool.AMETHYST_HOE)));

        EMERALD_SWORD = REGISTER.register(Constants.Tool.EMERALD_SWORD, () -> new ModItem(settingsOf(Constants.Tool.EMERALD_SWORD, new Item.Settings()).sword(ModToolMaterials.EMERALD, 1.0F, -2.4F)));
        EMERALD_SHOVEL = REGISTER.register(Constants.Tool.EMERALD_SHOVEL, () -> new ShovelItem(ModToolMaterials.EMERALD, 1.0F, -3.0F, settingsOf(Constants.Tool.EMERALD_SHOVEL)));
        EMERALD_PICKAXE = REGISTER.register(Constants.Tool.EMERALD_PICKAXE, () -> new ModItem(settingsOf(Constants.Tool.EMERALD_PICKAXE, new Item.Settings()).pickaxe(ModToolMaterials.EMERALD, 1.0F, -2.8F)));
        EMERALD_AXE = REGISTER.register(Constants.Tool.EMERALD_AXE, () -> new AxeItem(ModToolMaterials.EMERALD, 5.0F, -3.1F, settingsOf(Constants.Tool.EMERALD_AXE)));
        EMERALD_HOE = REGISTER.register(Constants.Tool.EMERALD_HOE, () -> new HoeItem(ModToolMaterials.EMERALD, -2.0F, -1.6F, settingsOf(Constants.Tool.EMERALD_HOE)));

        LEAD_SWORD = REGISTER.register(Constants.Tool.LEAD_SWORD, () -> new ModItem(settingsOf(Constants.Tool.LEAD_SWORD, new Item.Settings()).sword(ModToolMaterials.LEAD, 1.0F, -2.4F)));
        LEAD_SHOVEL = REGISTER.register(Constants.Tool.LEAD_SHOVEL, () -> new ShovelItem(ModToolMaterials.LEAD, 1.0F, -3.0F, settingsOf(Constants.Tool.LEAD_SHOVEL)));
        LEAD_PICKAXE = REGISTER.register(Constants.Tool.LEAD_PICKAXE, () -> new ModItem(settingsOf(Constants.Tool.LEAD_PICKAXE, new Item.Settings()).pickaxe(ModToolMaterials.LEAD, 1.0F, -2.8F)));
        LEAD_AXE = REGISTER.register(Constants.Tool.LEAD_AXE, () -> new AxeItem(ModToolMaterials.LEAD, 5.0F, -3.1F, settingsOf(Constants.Tool.LEAD_AXE)));
        LEAD_HOE = REGISTER.register(Constants.Tool.LEAD_HOE, () -> new HoeItem(ModToolMaterials.LEAD, -2.0F, -1.6F, settingsOf(Constants.Tool.LEAD_HOE)));

        QUARTZ_SWORD = REGISTER.register(Constants.Tool.QUARTZ_SWORD, () -> new ModItem(settingsOf(Constants.Tool.QUARTZ_SWORD, new Item.Settings()).sword(ModToolMaterials.QUARTZ, 1.0F, -2.4F)));
        QUARTZ_SHOVEL = REGISTER.register(Constants.Tool.QUARTZ_SHOVEL, () -> new ShovelItem(ModToolMaterials.QUARTZ, 1.0F, -3.0F, settingsOf(Constants.Tool.QUARTZ_SHOVEL)));
        QUARTZ_PICKAXE = REGISTER.register(Constants.Tool.QUARTZ_PICKAXE, () -> new ModItem(settingsOf(Constants.Tool.QUARTZ_PICKAXE, new Item.Settings()).pickaxe(ModToolMaterials.QUARTZ, 1.0F, -2.8F)));
        QUARTZ_AXE = REGISTER.register(Constants.Tool.QUARTZ_AXE, () -> new AxeItem(ModToolMaterials.QUARTZ, 5.0F, -3.1F, settingsOf(Constants.Tool.QUARTZ_AXE)));
        QUARTZ_HOE = REGISTER.register(Constants.Tool.QUARTZ_HOE, () -> new HoeItem(ModToolMaterials.QUARTZ, -2.0F, -1.6F, settingsOf(Constants.Tool.QUARTZ_HOE)));

        REDSTONE_SWORD = REGISTER.register(Constants.Tool.REDSTONE_SWORD, () -> new ModItem(settingsOf(Constants.Tool.REDSTONE_SWORD, new Item.Settings()).sword(ModToolMaterials.REDSTONE, 1.0F, -2.4F)));
        REDSTONE_SHOVEL = REGISTER.register(Constants.Tool.REDSTONE_SHOVEL, () -> new ShovelItem(ModToolMaterials.REDSTONE, 1.0F, -3.0F, settingsOf(Constants.Tool.REDSTONE_SHOVEL)));
        REDSTONE_PICKAXE = REGISTER.register(Constants.Tool.REDSTONE_PICKAXE, () -> new ModItem(settingsOf(Constants.Tool.REDSTONE_PICKAXE, new Item.Settings()).pickaxe(ModToolMaterials.REDSTONE, 1.0F, -2.8F)));
        REDSTONE_AXE = REGISTER.register(Constants.Tool.REDSTONE_AXE, () -> new AxeItem(ModToolMaterials.REDSTONE, 5.0F, -3.1F, settingsOf(Constants.Tool.REDSTONE_AXE)));
        REDSTONE_HOE = REGISTER.register(Constants.Tool.REDSTONE_HOE, () -> new HoeItem(ModToolMaterials.REDSTONE, -2.0F, -1.6F, settingsOf(Constants.Tool.REDSTONE_HOE)));

        BRONZE_HELMET = REGISTER.register(Constants.Armor.BRONZE_HELMET, () -> new BronzeArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.BRONZE_HELMET)));
        BRONZE_CHESTPLATE = REGISTER.register(Constants.Armor.BRONZE_CHESTPLATE, () -> new BronzeArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.BRONZE_CHESTPLATE)));
        BRONZE_LEGGINGS = REGISTER.register(Constants.Armor.BRONZE_LEGGINGS, () -> new BronzeArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.BRONZE_LEGGINGS)));
        BRONZE_BOOTS = REGISTER.register(Constants.Armor.BRONZE_BOOTS, () -> new BronzeArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.BRONZE_BOOTS)));

        IRONCOPPER_HELMET = REGISTER.register(Constants.Armor.IRONCOPPER_HELMET, () -> new IronCopperArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.IRONCOPPER_HELMET)));
        IRONCOPPER_CHESTPLATE = REGISTER.register(Constants.Armor.IRONCOPPER_CHESTPLATE, () -> new IronCopperArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.IRONCOPPER_CHESTPLATE)));
        IRONCOPPER_LEGGINGS = REGISTER.register(Constants.Armor.IRONCOPPER_LEGGINGS, () -> new IronCopperArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.IRONCOPPER_LEGGINGS)));
        IRONCOPPER_BOOTS = REGISTER.register(Constants.Armor.IRONCOPPER_BOOTS, () -> new IronCopperArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.IRONCOPPER_BOOTS)));

        AMETHYST_HELMET = REGISTER.register(Constants.Armor.AMETHYST_HELMET, () -> new AmethystArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.AMETHYST_HELMET)));
        AMETHYST_CHESTPLATE = REGISTER.register(Constants.Armor.AMETHYST_CHESTPLATE, () -> new AmethystArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.AMETHYST_CHESTPLATE)));
        AMETHYST_LEGGINGS = REGISTER.register(Constants.Armor.AMETHYST_LEGGINGS, () -> new AmethystArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.AMETHYST_LEGGINGS)));
        AMETHYST_BOOTS = REGISTER.register(Constants.Armor.AMETHYST_BOOTS, () -> new AmethystArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.AMETHYST_BOOTS)));

        EMERALD_HELMET = REGISTER.register(Constants.Armor.EMERALD_HELMET, () -> new EmeraldArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.EMERALD_HELMET)));
        EMERALD_CHESTPLATE = REGISTER.register(Constants.Armor.EMERALD_CHESTPLATE, () -> new EmeraldArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.EMERALD_CHESTPLATE)));
        EMERALD_LEGGINGS = REGISTER.register(Constants.Armor.EMERALD_LEGGINGS, () -> new EmeraldArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.EMERALD_LEGGINGS)));
        EMERALD_BOOTS = REGISTER.register(Constants.Armor.EMERALD_BOOTS, () -> new EmeraldArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.EMERALD_BOOTS)));

        LEAD_HELMET = REGISTER.register(Constants.Armor.LEAD_HELMET, () -> new LeadArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.LEAD_HELMET)));
        LEAD_CHESTPLATE = REGISTER.register(Constants.Armor.LEAD_CHESTPLATE, () -> new LeadArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.LEAD_CHESTPLATE)));
        LEAD_LEGGINGS = REGISTER.register(Constants.Armor.LEAD_LEGGINGS, () -> new LeadArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.LEAD_LEGGINGS)));
        LEAD_BOOTS = REGISTER.register(Constants.Armor.LEAD_BOOTS, () -> new LeadArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.LEAD_BOOTS)));

        QUARTZ_HELMET = REGISTER.register(Constants.Armor.QUARTZ_HELMET, () -> new QuartzArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.QUARTZ_HELMET)));
        QUARTZ_CHESTPLATE = REGISTER.register(Constants.Armor.QUARTZ_CHESTPLATE, () -> new QuartzArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.QUARTZ_CHESTPLATE)));
        QUARTZ_LEGGINGS = REGISTER.register(Constants.Armor.QUARTZ_LEGGINGS, () -> new QuartzArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.QUARTZ_LEGGINGS)));
        QUARTZ_BOOTS = REGISTER.register(Constants.Armor.QUARTZ_BOOTS, () -> new QuartzArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.QUARTZ_BOOTS)));

        REDSTONE_HELMET = REGISTER.register(Constants.Armor.REDSTONE_HELMET, () -> new RedstoneArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.REDSTONE_HELMET)));
        REDSTONE_CHESTPLATE = REGISTER.register(Constants.Armor.REDSTONE_CHESTPLATE, () -> new RedstoneArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.REDSTONE_CHESTPLATE)));
        REDSTONE_LEGGINGS = REGISTER.register(Constants.Armor.REDSTONE_LEGGINGS, () -> new RedstoneArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.REDSTONE_LEGGINGS)));
        REDSTONE_BOOTS = REGISTER.register(Constants.Armor.REDSTONE_BOOTS, () -> new RedstoneArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.REDSTONE_BOOTS)));

        LAVA_HELMET = REGISTER.register(Constants.Armor.LAVA_HELMET, () -> new LavaArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.LAVA_HELMET)));
        LAVA_CHESTPLATE = REGISTER.register(Constants.Armor.LAVA_CHESTPLATE, () -> new LavaArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.LAVA_CHESTPLATE)));
        LAVA_LEGGINGS = REGISTER.register(Constants.Armor.LAVA_LEGGINGS, () -> new LavaArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.LAVA_LEGGINGS)));
        LAVA_BOOTS = REGISTER.register(Constants.Armor.LAVA_BOOTS, () -> new LavaArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.LAVA_BOOTS)));

        BRONZE_INGOT = REGISTER.register(Constants.Item.BRONZE_INGOT, () -> new ModItem(settingsOf(Constants.Item.BRONZE_INGOT, new Item.Settings())));
        AMETHYST_INGOT = REGISTER.register(Constants.Item.AMETHYST_INGOT, () -> new ModItem(settingsOf(Constants.Item.AMETHYST_INGOT, new Item.Settings())));
        EMERALD_INGOT = REGISTER.register(Constants.Item.EMERALD_INGOT, () -> new ModItem(settingsOf(Constants.Item.EMERALD_INGOT, new Item.Settings())));
        LEAD_INGOT = REGISTER.register(Constants.Item.LEAD_INGOT, () -> new ModItem(settingsOf(Constants.Item.LEAD_INGOT, new Item.Settings())));
        QUARTZ_INGOT = REGISTER.register(Constants.Item.QUARTZ_INGOT, () -> new ModItem(settingsOf(Constants.Item.QUARTZ_INGOT, new Item.Settings())));
        REDSTONE_INGOT = REGISTER.register(Constants.Item.REDSTONE_INGOT, () -> new ModItem(settingsOf(Constants.Item.REDSTONE_INGOT, new Item.Settings())));
        RED_DIAMOND_INGOT = REGISTER.register(Constants.Item.RED_DIAMOND_INGOT, () -> new ModItem(settingsOf(Constants.Item.RED_DIAMOND_INGOT, new Item.Settings())));

        LEAD_ORE = REGISTER.register(Constants.Item.LEAD_ORE, () -> new ModBlockItem(ModBlocks.LEAD_ORE.get(), settingsOf(Constants.Item.LEAD_ORE, new Item.Settings().useBlockPrefixedTranslationKey())));
        RED_DIAMOND_ORE = REGISTER.register(Constants.Item.RED_DIAMOND_ORE, () -> new ModBlockItem(ModBlocks.RED_DIAMOND_ORE.get(), settingsOf(Constants.Item.RED_DIAMOND_ORE, new Item.Settings().useBlockPrefixedTranslationKey())));
        DEEPSLATE_RED_DIAMOND_ORE = REGISTER.register(Constants.Item.DEEPSLATE_RED_DIAMOND_ORE, () -> new ModBlockItem(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE.get(), settingsOf(Constants.Item.DEEPSLATE_RED_DIAMOND_ORE, new Item.Settings().useBlockPrefixedTranslationKey())));

        RAW_LEAD = REGISTER.register(Constants.Item.RAW_LEAD, () -> new ModItem(settingsOf(Constants.Item.RAW_LEAD, new Item.Settings())));
        QUARTZ_SCRAP = REGISTER.register(Constants.Item.QUARTZ_SCRAP, () -> new ModItem(settingsOf(Constants.Item.QUARTZ_SCRAP, new Item.Settings())));
        RED_DIAMOND = REGISTER.register(Constants.Item.RED_DIAMOND, () -> new ModItem(settingsOf(Constants.Item.RED_DIAMOND, new Item.Settings())));
        LAVA_SMITHING_TEMPLATE = REGISTER.register(Constants.Item.LAVA_SMITHING_TEMPLATE, () -> new ModTemplateItem(Text.translatable("item.sptools.lava_upgrade_smithing_template.applies_to"), Text.translatable("item.sptools.lava_upgrade_smithing_template.ingredients"), Text.translatable("item.sptools.lava_upgrade_smithing_template.base_slot"), Text.translatable("item.sptools.lava_upgrade_smithing_template.additions_slot"), getLavaUpgradeEmptyBaseSlotTextures(), getLavaUpgradeEmptyAdditionsSlotTextures(), settingsOf(Constants.Item.LAVA_SMITHING_TEMPLATE, (new Item.Settings()).fireproof().rarity(Rarity.EPIC))));

        var itemGroupRegister = DeferredRegister.create(Constants.MOD_ID, RegistryKeys.ITEM_GROUP);
        itemGroupRegister.register(MOD_GROUP.getRegistry(), () -> ItemGroup.create(ItemGroup.Row.BOTTOM, 0)
                .icon(() -> new ItemStack(ModItems.AMETHYST_INGOT))
                .displayName(Text.translatable("item.sptools"))
                .entries((displayContext, entries) -> {
                    entries.add(new ItemStack(BRONZE_SWORD.get()));
                    entries.add(new ItemStack(BRONZE_SHOVEL.get()));
                    entries.add(new ItemStack(BRONZE_PICKAXE.get()));
                    entries.add(new ItemStack(BRONZE_AXE.get()));
                    entries.add(new ItemStack(BRONZE_HOE.get()));

                    entries.add(new ItemStack(IRONCOPPER_SWORD.get()));
                    entries.add(new ItemStack(IRONCOPPER_SHOVEL.get()));
                    entries.add(new ItemStack(IRONCOPPER_PICKAXE.get()));
                    entries.add(new ItemStack(IRONCOPPER_AXE.get()));
                    entries.add(new ItemStack(IRONCOPPER_HOE.get()));

                    entries.add(new ItemStack(AMETHYST_SWORD.get()));
                    entries.add(new ItemStack(AMETHYST_SHOVEL.get()));
                    entries.add(new ItemStack(AMETHYST_PICKAXE.get()));
                    entries.add(new ItemStack(AMETHYST_AXE.get()));
                    entries.add(new ItemStack(AMETHYST_HOE.get()));

                    entries.add(new ItemStack(EMERALD_SWORD.get()));
                    entries.add(new ItemStack(EMERALD_SHOVEL.get()));
                    entries.add(new ItemStack(EMERALD_PICKAXE.get()));
                    entries.add(new ItemStack(EMERALD_AXE.get()));
                    entries.add(new ItemStack(EMERALD_HOE.get()));

                    entries.add(new ItemStack(LEAD_SWORD.get()));
                    entries.add(new ItemStack(LEAD_SHOVEL.get()));
                    entries.add(new ItemStack(LEAD_PICKAXE.get()));
                    entries.add(new ItemStack(LEAD_AXE.get()));
                    entries.add(new ItemStack(LEAD_HOE.get()));

                    entries.add(new ItemStack(QUARTZ_SWORD.get()));
                    entries.add(new ItemStack(QUARTZ_SHOVEL.get()));
                    entries.add(new ItemStack(QUARTZ_PICKAXE.get()));
                    entries.add(new ItemStack(QUARTZ_AXE.get()));
                    entries.add(new ItemStack(QUARTZ_HOE.get()));

                    entries.add(new ItemStack(REDSTONE_SWORD.get()));
                    entries.add(new ItemStack(REDSTONE_SHOVEL.get()));
                    entries.add(new ItemStack(REDSTONE_PICKAXE.get()));
                    entries.add(new ItemStack(REDSTONE_AXE.get()));
                    entries.add(new ItemStack(REDSTONE_HOE.get()));

                    entries.add(new ItemStack(BRONZE_HELMET.get()));
                    entries.add(new ItemStack(BRONZE_CHESTPLATE.get()));
                    entries.add(new ItemStack(BRONZE_LEGGINGS.get()));
                    entries.add(new ItemStack(BRONZE_BOOTS.get()));

                    entries.add(new ItemStack(IRONCOPPER_HELMET.get()));
                    entries.add(new ItemStack(IRONCOPPER_CHESTPLATE.get()));
                    entries.add(new ItemStack(IRONCOPPER_LEGGINGS.get()));
                    entries.add(new ItemStack(IRONCOPPER_BOOTS.get()));

                    entries.add(new ItemStack(AMETHYST_HELMET.get()));
                    entries.add(new ItemStack(AMETHYST_CHESTPLATE.get()));
                    entries.add(new ItemStack(AMETHYST_LEGGINGS.get()));
                    entries.add(new ItemStack(AMETHYST_BOOTS.get()));

                    entries.add(new ItemStack(EMERALD_HELMET.get()));
                    entries.add(new ItemStack(EMERALD_CHESTPLATE.get()));
                    entries.add(new ItemStack(EMERALD_LEGGINGS.get()));
                    entries.add(new ItemStack(EMERALD_BOOTS.get()));

                    entries.add(new ItemStack(LEAD_HELMET.get()));
                    entries.add(new ItemStack(LEAD_CHESTPLATE.get()));
                    entries.add(new ItemStack(LEAD_LEGGINGS.get()));
                    entries.add(new ItemStack(LEAD_BOOTS.get()));

                    entries.add(new ItemStack(QUARTZ_HELMET.get()));
                    entries.add(new ItemStack(QUARTZ_CHESTPLATE.get()));
                    entries.add(new ItemStack(QUARTZ_LEGGINGS.get()));
                    entries.add(new ItemStack(QUARTZ_BOOTS.get()));

                    entries.add(new ItemStack(REDSTONE_HELMET.get()));
                    entries.add(new ItemStack(REDSTONE_CHESTPLATE.get()));
                    entries.add(new ItemStack(REDSTONE_LEGGINGS.get()));
                    entries.add(new ItemStack(REDSTONE_BOOTS.get()));

                    entries.add(new ItemStack(LAVA_HELMET.get()));
                    entries.add(new ItemStack(LAVA_CHESTPLATE.get()));
                    entries.add(new ItemStack(LAVA_LEGGINGS.get()));
                    entries.add(new ItemStack(LAVA_BOOTS.get()));

                    entries.add(new ItemStack(BRONZE_INGOT.get()));
                    entries.add(new ItemStack(AMETHYST_INGOT.get()));
                    entries.add(new ItemStack(EMERALD_INGOT.get()));
                    entries.add(new ItemStack(LEAD_INGOT.get()));
                    entries.add(new ItemStack(QUARTZ_INGOT.get()));
                    entries.add(new ItemStack(REDSTONE_INGOT.get()));
                    entries.add(new ItemStack(RED_DIAMOND_INGOT.get()));

                    entries.add(new ItemStack(LEAD_ORE.get()));
                    entries.add(new ItemStack(RED_DIAMOND_ORE.get()));
                    entries.add(new ItemStack(DEEPSLATE_RED_DIAMOND_ORE.get()));

                    entries.add(new ItemStack(RAW_LEAD.get()));
                    entries.add(new ItemStack(QUARTZ_SCRAP.get()));
                    entries.add(new ItemStack(RED_DIAMOND.get()));
                    entries.add(new ItemStack(LAVA_SMITHING_TEMPLATE.get()));
                })
                .build());
        itemGroupRegister.register();

        REGISTER.register();
    }

    public static void register() {

    }

    private static Item.Settings settingsOf(String name) {
        return settingsOf(name, new Item.Settings());
    }

    private static Item.Settings settingsOf(String name, Item.Settings settings) {
        return settings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Constants.MOD_ID, name)));
    }

    private static List<Identifier> getLavaUpgradeEmptyBaseSlotTextures() {
        return List.of(
                Identifier.ofVanilla("container/slot/helmet"),
                Identifier.ofVanilla("container/slot/chestplate"),
                Identifier.ofVanilla("container/slot/leggings"),
                Identifier.ofVanilla("container/slot/boots"));
    }

    private static List<Identifier> getLavaUpgradeEmptyAdditionsSlotTextures() {
        return List.of(Identifier.ofVanilla("container/slot/ingot"));
    }
}
