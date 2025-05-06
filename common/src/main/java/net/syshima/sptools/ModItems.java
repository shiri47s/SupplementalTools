package net.syshima.sptools;

import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.syshima.sptools.base.ModItem;
import net.syshima.sptools.base.ModBlockItem;
import net.syshima.sptools.base.ModTemplateItem;
import net.syshima.sptools.core.armors.*;
import net.syshima.sptools.core.assets.ModToolMaterials;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public final class ModItems {
    private static final DeferredRegister<Item> REGISTER = DeferredRegister.create(Constants.MOD_ID, RegistryKeys.ITEM);

    public static final Item BRONZE_SWORD;
    public static final Item BRONZE_SHOVEL;
    public static final Item BRONZE_PICKAXE;
    public static final Item BRONZE_AXE;
    public static final Item BRONZE_HOE;

    public static final Item IRONCOPPER_SWORD;
    public static final Item IRONCOPPER_SHOVEL;
    public static final Item IRONCOPPER_PICKAXE;
    public static final Item IRONCOPPER_AXE;
    public static final Item IRONCOPPER_HOE;

    public static final Item AMETHYST_SWORD;
    public static final Item AMETHYST_SHOVEL;
    public static final Item AMETHYST_PICKAXE;
    public static final Item AMETHYST_AXE;
    public static final Item AMETHYST_HOE;

    public static final Item EMERALD_SWORD;
    public static final Item EMERALD_SHOVEL;
    public static final Item EMERALD_PICKAXE;
    public static final Item EMERALD_AXE;
    public static final Item EMERALD_HOE;

    public static final Item LEAD_SWORD;
    public static final Item LEAD_SHOVEL;
    public static final Item LEAD_PICKAXE;
    public static final Item LEAD_AXE;
    public static final Item LEAD_HOE;

    public static final Item QUARTZ_SWORD;
    public static final Item QUARTZ_SHOVEL;
    public static final Item QUARTZ_PICKAXE;
    public static final Item QUARTZ_AXE;
    public static final Item QUARTZ_HOE;

    public static final Item REDSTONE_SWORD;
    public static final Item REDSTONE_SHOVEL;
    public static final Item REDSTONE_PICKAXE;
    public static final Item REDSTONE_AXE;
    public static final Item REDSTONE_HOE;

    public static final Item BRONZE_HELMET;
    public static final Item BRONZE_CHESTPLATE;
    public static final Item BRONZE_LEGGINGS;
    public static final Item BRONZE_BOOTS;

    public static final Item IRONCOPPER_HELMET;
    public static final Item IRONCOPPER_CHESTPLATE;
    public static final Item IRONCOPPER_LEGGINGS;
    public static final Item IRONCOPPER_BOOTS;

    public static final Item AMETHYST_HELMET;
    public static final Item AMETHYST_CHESTPLATE;
    public static final Item AMETHYST_LEGGINGS;
    public static final Item AMETHYST_BOOTS;

    public static final Item EMERALD_HELMET;
    public static final Item EMERALD_CHESTPLATE;
    public static final Item EMERALD_LEGGINGS;
    public static final Item EMERALD_BOOTS;

    public static final Item LEAD_HELMET;
    public static final Item LEAD_CHESTPLATE;
    public static final Item LEAD_LEGGINGS;
    public static final Item LEAD_BOOTS;

    public static final Item QUARTZ_HELMET;
    public static final Item QUARTZ_CHESTPLATE;
    public static final Item QUARTZ_LEGGINGS;
    public static final Item QUARTZ_BOOTS;

    public static final Item REDSTONE_HELMET;
    public static final Item REDSTONE_CHESTPLATE;
    public static final Item REDSTONE_LEGGINGS;
    public static final Item REDSTONE_BOOTS;

    public static final Item LAVA_HELMET;
    public static final Item LAVA_CHESTPLATE;
    public static final Item LAVA_LEGGINGS;
    public static final Item LAVA_BOOTS;

    public static final Item BRONZE_INGOT;
    public static final Item AMETHYST_INGOT;
    public static final Item EMERALD_INGOT;
    public static final Item LEAD_INGOT;
    public static final Item QUARTZ_INGOT;
    public static final Item REDSTONE_INGOT;
    public static final Item RED_DIAMOND_INGOT;

    public static final Item LEAD_ORE;
    public static final Item RED_DIAMOND_ORE;
    public static final Item DEEPSLATE_DIAMOND_ORE;

    public static final Item RAW_LEAD;
    public static final Item QUARTZ_SCRAP;
    public static final Item RED_DIAMOND;
    public static final Item LAVA_SMITHING_TEMPLATE;

    static {
        var bronzeSword = REGISTER.register(Constants.Tool.BRONZE_SWORD, () -> new ModItem(settingsOf(Constants.Tool.BRONZE_SWORD, new Item.Settings()).sword(ModToolMaterials.BRONZE, 1.0F, -2.4F)));
        var bronzeShovel = REGISTER.register(Constants.Tool.BRONZE_SHOVEL, () -> new ShovelItem(ModToolMaterials.BRONZE, 1.0F, -3.0F, settingsOf(Constants.Tool.BRONZE_SHOVEL)));
        var bronzePickaxe = REGISTER.register(Constants.Tool.BRONZE_PICKAXE, () -> new ModItem(settingsOf(Constants.Tool.BRONZE_PICKAXE, new Item.Settings()).pickaxe(ModToolMaterials.BRONZE, 1.0F, -2.8F)));
        var bronzeAxe = REGISTER.register(Constants.Tool.BRONZE_AXE, () -> new AxeItem(ModToolMaterials.BRONZE, 5.0F, -3.1F, settingsOf(Constants.Tool.BRONZE_AXE)));
        var bronzeHoe = REGISTER.register(Constants.Tool.BRONZE_HOE, () -> new HoeItem(ModToolMaterials.BRONZE, -2.0F, -1.6F, settingsOf(Constants.Tool.BRONZE_HOE)));

        var ironcopperSword = REGISTER.register(Constants.Tool.IRONCOPPER_SWORD, () -> new ModItem(settingsOf(Constants.Tool.IRONCOPPER_SWORD, new Item.Settings()).sword(ModToolMaterials.IRONCOPPER, 1.0F, -2.4F)));
        var ironcopperShovel = REGISTER.register(Constants.Tool.IRONCOPPER_SHOVEL, () -> new ShovelItem(ModToolMaterials.IRONCOPPER, 1.0F, -3.0F, settingsOf(Constants.Tool.IRONCOPPER_SHOVEL)));
        var ironcopperPickaxe = REGISTER.register(Constants.Tool.IRONCOPPER_PICKAXE, () -> new ModItem(settingsOf(Constants.Tool.IRONCOPPER_PICKAXE, new Item.Settings()).pickaxe(ModToolMaterials.IRONCOPPER, 1.0F, -2.8F)));
        var ironcopperAxe = REGISTER.register(Constants.Tool.IRONCOPPER_AXE, () -> new AxeItem(ModToolMaterials.IRONCOPPER, 5.0F, -3.1F, settingsOf(Constants.Tool.IRONCOPPER_AXE)));
        var ironcopperHoe = REGISTER.register(Constants.Tool.IRONCOPPER_HOE, () -> new HoeItem(ModToolMaterials.IRONCOPPER, -2.0F, -1.6F, settingsOf(Constants.Tool.IRONCOPPER_HOE)));

        var amethystSword = REGISTER.register(Constants.Tool.AMETHYST_SWORD, () -> new ModItem(settingsOf(Constants.Tool.AMETHYST_SWORD, new Item.Settings()).sword(ModToolMaterials.AMETHYST, 1.0F, -2.4F)));
        var amethystShovel = REGISTER.register(Constants.Tool.AMETHYST_SHOVEL, () -> new ShovelItem(ModToolMaterials.AMETHYST, 1.0F, -3.0F, settingsOf(Constants.Tool.AMETHYST_SHOVEL)));
        var amethystPickaxe = REGISTER.register(Constants.Tool.AMETHYST_PICKAXE, () -> new ModItem(settingsOf(Constants.Tool.AMETHYST_PICKAXE, new Item.Settings()).pickaxe(ModToolMaterials.AMETHYST, 1.0F, -2.8F)));
        var amethystAxe = REGISTER.register(Constants.Tool.AMETHYST_AXE, () -> new AxeItem(ModToolMaterials.AMETHYST, 5.0F, -3.1F, settingsOf(Constants.Tool.AMETHYST_AXE)));
        var amethystHoe = REGISTER.register(Constants.Tool.AMETHYST_HOE, () -> new HoeItem(ModToolMaterials.AMETHYST, -2.0F, -1.6F, settingsOf(Constants.Tool.AMETHYST_HOE)));

        var emeraldSword = REGISTER.register(Constants.Tool.EMERALD_SWORD, () -> new ModItem(settingsOf(Constants.Tool.EMERALD_SWORD, new Item.Settings()).sword(ModToolMaterials.EMERALD, 1.0F, -2.4F)));
        var emeraldShovel = REGISTER.register(Constants.Tool.EMERALD_SHOVEL, () -> new ShovelItem(ModToolMaterials.EMERALD, 1.0F, -3.0F, settingsOf(Constants.Tool.EMERALD_SHOVEL)));
        var emeraldPickaxe = REGISTER.register(Constants.Tool.EMERALD_PICKAXE, () -> new ModItem(settingsOf(Constants.Tool.EMERALD_PICKAXE, new Item.Settings()).pickaxe(ModToolMaterials.EMERALD, 1.0F, -2.8F)));
        var emeraldAxe = REGISTER.register(Constants.Tool.EMERALD_AXE, () -> new AxeItem(ModToolMaterials.EMERALD, 5.0F, -3.1F, settingsOf(Constants.Tool.EMERALD_AXE)));
        var emeraldHoe = REGISTER.register(Constants.Tool.EMERALD_HOE, () -> new HoeItem(ModToolMaterials.EMERALD, -2.0F, -1.6F, settingsOf(Constants.Tool.EMERALD_HOE)));

        var leadSword = REGISTER.register(Constants.Tool.LEAD_SWORD, () -> new ModItem(settingsOf(Constants.Tool.LEAD_SWORD, new Item.Settings()).sword(ModToolMaterials.LEAD, 1.0F, -2.4F)));
        var leadShovel = REGISTER.register(Constants.Tool.LEAD_SHOVEL, () -> new ShovelItem(ModToolMaterials.LEAD, 1.0F, -3.0F, settingsOf(Constants.Tool.LEAD_SHOVEL)));
        var leadPickaxe = REGISTER.register(Constants.Tool.LEAD_PICKAXE, () -> new ModItem(settingsOf(Constants.Tool.LEAD_PICKAXE, new Item.Settings()).pickaxe(ModToolMaterials.LEAD, 1.0F, -2.8F)));
        var leadAxe = REGISTER.register(Constants.Tool.LEAD_AXE, () -> new AxeItem(ModToolMaterials.LEAD, 5.0F, -3.1F, settingsOf(Constants.Tool.LEAD_AXE)));
        var leadHoe = REGISTER.register(Constants.Tool.LEAD_HOE, () -> new HoeItem(ModToolMaterials.LEAD, -2.0F, -1.6F, settingsOf(Constants.Tool.LEAD_HOE)));

        var quartzSword = REGISTER.register(Constants.Tool.QUARTZ_SWORD, () -> new ModItem(settingsOf(Constants.Tool.QUARTZ_SWORD, new Item.Settings()).sword(ModToolMaterials.QUARTZ, 1.0F, -2.4F)));
        var quartzShovel = REGISTER.register(Constants.Tool.QUARTZ_SHOVEL, () -> new ShovelItem(ModToolMaterials.QUARTZ, 1.0F, -3.0F, settingsOf(Constants.Tool.QUARTZ_SHOVEL)));
        var quartzPickaxe = REGISTER.register(Constants.Tool.QUARTZ_PICKAXE, () -> new ModItem(settingsOf(Constants.Tool.QUARTZ_PICKAXE, new Item.Settings()).pickaxe(ModToolMaterials.QUARTZ, 1.0F, -2.8F)));
        var quartzAxe = REGISTER.register(Constants.Tool.QUARTZ_AXE, () -> new AxeItem(ModToolMaterials.QUARTZ, 5.0F, -3.1F, settingsOf(Constants.Tool.QUARTZ_AXE)));
        var quartzHoe = REGISTER.register(Constants.Tool.QUARTZ_HOE, () -> new HoeItem(ModToolMaterials.QUARTZ, -2.0F, -1.6F, settingsOf(Constants.Tool.QUARTZ_HOE)));

        var redstoneSword = REGISTER.register(Constants.Tool.REDSTONE_SWORD, () -> new ModItem(settingsOf(Constants.Tool.REDSTONE_SWORD, new Item.Settings()).sword(ModToolMaterials.REDSTONE, 1.0F, -2.4F)));
        var redstoneShovel = REGISTER.register(Constants.Tool.REDSTONE_SHOVEL, () -> new ShovelItem(ModToolMaterials.REDSTONE, 1.0F, -3.0F, settingsOf(Constants.Tool.REDSTONE_SHOVEL)));
        var redstonePickaxe = REGISTER.register(Constants.Tool.REDSTONE_PICKAXE, () -> new ModItem(settingsOf(Constants.Tool.REDSTONE_PICKAXE, new Item.Settings()).pickaxe(ModToolMaterials.REDSTONE, 1.0F, -2.8F)));
        var redstoneAxe = REGISTER.register(Constants.Tool.REDSTONE_AXE, () -> new AxeItem(ModToolMaterials.REDSTONE, 5.0F, -3.1F, settingsOf(Constants.Tool.REDSTONE_AXE)));
        var redstoneHoe = REGISTER.register(Constants.Tool.REDSTONE_HOE, () -> new HoeItem(ModToolMaterials.REDSTONE, -2.0F, -1.6F, settingsOf(Constants.Tool.REDSTONE_HOE)));
        
        var bronzeHelmet = REGISTER.register(Constants.Armor.BRONZE_HELMET, () -> new BronzeArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.BRONZE_HELMET)));
        var bronzeChestplate = REGISTER.register(Constants.Armor.BRONZE_CHESTPLATE, () -> new BronzeArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.BRONZE_CHESTPLATE)));
        var bronzeLeggings = REGISTER.register(Constants.Armor.BRONZE_LEGGINGS, () -> new BronzeArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.BRONZE_LEGGINGS)));
        var bronzeBoots = REGISTER.register(Constants.Armor.BRONZE_BOOTS, () -> new BronzeArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.BRONZE_BOOTS)));

        var ironcopperHelmet = REGISTER.register(Constants.Armor.IRONCOPPER_HELMET, () -> new IronCopperArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.IRONCOPPER_HELMET)));
        var ironcopperChestplate = REGISTER.register(Constants.Armor.IRONCOPPER_CHESTPLATE, () -> new IronCopperArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.IRONCOPPER_CHESTPLATE)));
        var ironcopperLeggings = REGISTER.register(Constants.Armor.IRONCOPPER_LEGGINGS, () -> new IronCopperArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.IRONCOPPER_LEGGINGS)));
        var ironcopperBoots = REGISTER.register(Constants.Armor.IRONCOPPER_BOOTS, () -> new IronCopperArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.IRONCOPPER_BOOTS)));

        var amethystHelmet = REGISTER.register(Constants.Armor.AMETHYST_HELMET, () -> new AmethystArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.AMETHYST_HELMET)));
        var amethystChestplate = REGISTER.register(Constants.Armor.AMETHYST_CHESTPLATE, () -> new AmethystArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.AMETHYST_CHESTPLATE)));
        var amethystLeggings = REGISTER.register(Constants.Armor.AMETHYST_LEGGINGS, () -> new AmethystArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.AMETHYST_LEGGINGS)));
        var amethystBoots = REGISTER.register(Constants.Armor.AMETHYST_BOOTS, () -> new AmethystArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.AMETHYST_BOOTS)));

        var emeraldHelmet = REGISTER.register(Constants.Armor.EMERALD_HELMET, () -> new EmeraldArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.EMERALD_HELMET)));
        var emeraldChestplate = REGISTER.register(Constants.Armor.EMERALD_CHESTPLATE, () -> new EmeraldArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.EMERALD_CHESTPLATE)));
        var emeraldLeggings = REGISTER.register(Constants.Armor.EMERALD_LEGGINGS, () -> new EmeraldArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.EMERALD_LEGGINGS)));
        var emeraldBoots = REGISTER.register(Constants.Armor.EMERALD_BOOTS, () -> new EmeraldArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.EMERALD_BOOTS)));

        var leadHelmet = REGISTER.register(Constants.Armor.LEAD_HELMET, () -> new LeadArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.LEAD_HELMET)));
        var leadChestplate = REGISTER.register(Constants.Armor.LEAD_CHESTPLATE, () -> new LeadArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.LEAD_CHESTPLATE)));
        var leadLeggings = REGISTER.register(Constants.Armor.LEAD_LEGGINGS, () -> new LeadArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.LEAD_LEGGINGS)));
        var leadBoots = REGISTER.register(Constants.Armor.LEAD_BOOTS, () -> new LeadArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.LEAD_BOOTS)));

        var quartzHelmet = REGISTER.register(Constants.Armor.QUARTZ_HELMET, () -> new QuartzArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.QUARTZ_HELMET)));
        var quartzChestplate = REGISTER.register(Constants.Armor.QUARTZ_CHESTPLATE, () -> new QuartzArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.QUARTZ_CHESTPLATE)));
        var quartzLeggings = REGISTER.register(Constants.Armor.QUARTZ_LEGGINGS, () -> new QuartzArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.QUARTZ_LEGGINGS)));
        var quartzBoots = REGISTER.register(Constants.Armor.QUARTZ_BOOTS, () -> new QuartzArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.QUARTZ_BOOTS)));

        var redstoneHelmet = REGISTER.register(Constants.Armor.REDSTONE_HELMET, () -> new RedstoneArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.REDSTONE_HELMET)));
        var redstoneChestplate = REGISTER.register(Constants.Armor.REDSTONE_CHESTPLATE, () -> new RedstoneArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.REDSTONE_CHESTPLATE)));
        var redstoneLeggings = REGISTER.register(Constants.Armor.REDSTONE_LEGGINGS, () -> new RedstoneArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.REDSTONE_LEGGINGS)));
        var redstoneBoots = REGISTER.register(Constants.Armor.REDSTONE_BOOTS, () -> new RedstoneArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.REDSTONE_BOOTS)));

        var lavaHelmet = REGISTER.register(Constants.Armor.LAVA_HELMET, () -> new LavaArmorItem(EquipmentType.HELMET, settingsOf(Constants.Armor.LAVA_HELMET)));
        var lavaChestplate = REGISTER.register(Constants.Armor.LAVA_CHESTPLATE, () -> new LavaArmorItem(EquipmentType.CHESTPLATE, settingsOf(Constants.Armor.LAVA_CHESTPLATE)));
        var lavaLeggings = REGISTER.register(Constants.Armor.LAVA_LEGGINGS, () -> new LavaArmorItem(EquipmentType.LEGGINGS, settingsOf(Constants.Armor.LAVA_LEGGINGS)));
        var lavaBoots = REGISTER.register(Constants.Armor.LAVA_BOOTS, () -> new LavaArmorItem(EquipmentType.BOOTS, settingsOf(Constants.Armor.LAVA_BOOTS)));

        var bronzeIngot = REGISTER.register(Constants.Item.BRONZE_INGOT, () -> new ModItem(settingsOf(Constants.Item.BRONZE_INGOT, new Item.Settings())));
        var amethystIngot = REGISTER.register(Constants.Item.AMETHYST_INGOT, () -> new ModItem(settingsOf(Constants.Item.AMETHYST_INGOT, new Item.Settings())));
        var emeraldIngot = REGISTER.register(Constants.Item.EMERALD_INGOT, () -> new ModItem(settingsOf(Constants.Item.EMERALD_INGOT, new Item.Settings())));
        var leadIngot = REGISTER.register(Constants.Item.LEAD_INGOT, () -> new ModItem(settingsOf(Constants.Item.LEAD_INGOT, new Item.Settings())));
        var quartzIngot = REGISTER.register(Constants.Item.QUARTZ_INGOT, () -> new ModItem(settingsOf(Constants.Item.QUARTZ_INGOT, new Item.Settings())));
        var redstoneIngot = REGISTER.register(Constants.Item.REDSTONE_INGOT, () -> new ModItem(settingsOf(Constants.Item.REDSTONE_INGOT, new Item.Settings())));
        var redDiamondIngot = REGISTER.register(Constants.Item.RED_DIAMOND_INGOT, () -> new ModItem(settingsOf(Constants.Item.RED_DIAMOND_INGOT, new Item.Settings())));

        var leadOre = REGISTER.register(Constants.Item.LEAD_ORE, () -> new ModBlockItem(ModBlocks.LEAD_ORE, settingsOf(Constants.Item.LEAD_ORE, new Item.Settings().useBlockPrefixedTranslationKey())));
        var redDiamondOre = REGISTER.register(Constants.Item.RED_DIAMOND_ORE, () -> new ModBlockItem(ModBlocks.RED_DIAMOND_ORE, settingsOf(Constants.Item.RED_DIAMOND_ORE, new Item.Settings().useBlockPrefixedTranslationKey())));
        var deepslateRedDiamondOre = REGISTER.register(Constants.Item.DEEPSLATE_RED_DIAMOND_ORE, () -> new ModBlockItem(ModBlocks.DEEPSLATE_RED_DIAMOND_ORE, settingsOf(Constants.Item.DEEPSLATE_RED_DIAMOND_ORE, new Item.Settings().useBlockPrefixedTranslationKey())));

        var rawLead = REGISTER.register(Constants.Item.RAW_LEAD, () -> new ModItem(settingsOf(Constants.Item.RAW_LEAD, new Item.Settings())));
        var quartzScrap = REGISTER.register(Constants.Item.QUARTZ_SCRAP, () -> new ModItem(settingsOf(Constants.Item.QUARTZ_SCRAP, new Item.Settings())));
        var redDiamond = REGISTER.register(Constants.Item.RED_DIAMOND, () -> new ModItem(settingsOf(Constants.Item.RED_DIAMOND, new Item.Settings())));
        var lavaSmithingTemplate = REGISTER.register(Constants.Item.LAVA_SMITHING_TEMPLATE, () -> new ModTemplateItem(Text.translatable( "item.sptools.lava_upgrade_smithing_template.applies_to"), Text.translatable("item.sptools.lava_upgrade_smithing_template.ingredients"), Text.translatable("item.sptools.lava_upgrade_smithing_template.base_slot"), Text.translatable("item.sptools.lava_upgrade_smithing_template.additions_slot"), getLavaUpgradeEmptyBaseSlotTextures(), getLavaUpgradeEmptyAdditionsSlotTextures(), settingsOf(Constants.Item.LAVA_SMITHING_TEMPLATE, (new Item.Settings()).fireproof().rarity(Rarity.EPIC))));

        REGISTER.register();

        BRONZE_SWORD = bronzeSword.get();
        BRONZE_SHOVEL = bronzeShovel.get();
        BRONZE_PICKAXE = bronzePickaxe.get();
        BRONZE_AXE = bronzeAxe.get();
        BRONZE_HOE = bronzeHoe.get();

        IRONCOPPER_SWORD = ironcopperSword.get();
        IRONCOPPER_SHOVEL = ironcopperShovel.get();
        IRONCOPPER_PICKAXE = ironcopperPickaxe.get();
        IRONCOPPER_AXE = ironcopperAxe.get();
        IRONCOPPER_HOE = ironcopperHoe.get();

        AMETHYST_SWORD = amethystSword.get();
        AMETHYST_SHOVEL = amethystShovel.get();
        AMETHYST_PICKAXE = amethystPickaxe.get();
        AMETHYST_AXE = amethystAxe.get();
        AMETHYST_HOE = amethystHoe.get();

        EMERALD_SWORD = emeraldSword.get();
        EMERALD_SHOVEL = emeraldShovel.get();
        EMERALD_PICKAXE = emeraldPickaxe.get();
        EMERALD_AXE = emeraldAxe.get();
        EMERALD_HOE = emeraldHoe.get();

        LEAD_SWORD = leadSword.get();
        LEAD_SHOVEL = leadShovel.get();
        LEAD_PICKAXE = leadPickaxe.get();
        LEAD_AXE = leadAxe.get();
        LEAD_HOE = leadHoe.get();

        QUARTZ_SWORD = quartzSword.get();
        QUARTZ_SHOVEL = quartzShovel.get();
        QUARTZ_PICKAXE = quartzPickaxe.get();
        QUARTZ_AXE = quartzAxe.get();
        QUARTZ_HOE = quartzHoe.get();

        REDSTONE_SWORD = redstoneSword.get();
        REDSTONE_SHOVEL = redstoneShovel.get();
        REDSTONE_PICKAXE = redstonePickaxe.get();
        REDSTONE_AXE = redstoneAxe.get();
        REDSTONE_HOE = redstoneHoe.get();

        BRONZE_HELMET = bronzeHelmet.get();
        BRONZE_CHESTPLATE = bronzeChestplate.get();
        BRONZE_LEGGINGS = bronzeLeggings.get();
        BRONZE_BOOTS = bronzeBoots.get();

        IRONCOPPER_HELMET = ironcopperHelmet.get();
        IRONCOPPER_CHESTPLATE = ironcopperChestplate.get();
        IRONCOPPER_LEGGINGS = ironcopperLeggings.get();
        IRONCOPPER_BOOTS = ironcopperBoots.get();

        AMETHYST_HELMET = amethystHelmet.get();
        AMETHYST_CHESTPLATE = amethystChestplate.get();
        AMETHYST_LEGGINGS = amethystLeggings.get();
        AMETHYST_BOOTS = amethystBoots.get();

        EMERALD_HELMET = emeraldHelmet.get();
        EMERALD_CHESTPLATE = emeraldChestplate.get();
        EMERALD_LEGGINGS = emeraldLeggings.get();
        EMERALD_BOOTS = emeraldBoots.get();

        LEAD_HELMET = leadHelmet.get();
        LEAD_CHESTPLATE = leadChestplate.get();
        LEAD_LEGGINGS = leadLeggings.get();
        LEAD_BOOTS = leadBoots.get();

        QUARTZ_HELMET = quartzHelmet.get();
        QUARTZ_CHESTPLATE = quartzChestplate.get();
        QUARTZ_LEGGINGS = quartzLeggings.get();
        QUARTZ_BOOTS = quartzBoots.get();

        REDSTONE_HELMET = redstoneHelmet.get();
        REDSTONE_CHESTPLATE = redstoneChestplate.get();
        REDSTONE_LEGGINGS = redstoneLeggings.get();
        REDSTONE_BOOTS = redstoneBoots.get();

        LAVA_HELMET = lavaHelmet.get();
        LAVA_CHESTPLATE = lavaChestplate.get();
        LAVA_LEGGINGS = lavaLeggings.get();
        LAVA_BOOTS = lavaBoots.get();

        BRONZE_INGOT = bronzeIngot.get();
        AMETHYST_INGOT = amethystIngot.get();
        EMERALD_INGOT = emeraldIngot.get();
        LEAD_INGOT = leadIngot.get();
        QUARTZ_INGOT = quartzIngot.get();
        REDSTONE_INGOT = redstoneIngot.get();
        RED_DIAMOND_INGOT = redDiamondIngot.get();

        LEAD_ORE = leadOre.get();
        RED_DIAMOND_ORE = redDiamondOre.get();
        DEEPSLATE_DIAMOND_ORE = deepslateRedDiamondOre.get();

        RAW_LEAD = rawLead.get();
        QUARTZ_SCRAP = quartzScrap.get();
        RED_DIAMOND = redDiamond.get();
        LAVA_SMITHING_TEMPLATE = lavaSmithingTemplate.get();
    }

    public static void register() {
        addItemGroup();
    }

    @SuppressWarnings("DuplicatedCode")
    public static void addItemGroup() {
        addItemGroup(BRONZE_SWORD);
        addItemGroup(BRONZE_SHOVEL);
        addItemGroup(BRONZE_PICKAXE);
        addItemGroup(BRONZE_AXE);
        addItemGroup(BRONZE_HOE);

        addItemGroup(IRONCOPPER_SWORD);
        addItemGroup(IRONCOPPER_SHOVEL);
        addItemGroup(IRONCOPPER_PICKAXE);
        addItemGroup(IRONCOPPER_AXE);
        addItemGroup(IRONCOPPER_HOE);

        addItemGroup(AMETHYST_SWORD);
        addItemGroup(AMETHYST_SHOVEL);
        addItemGroup(AMETHYST_PICKAXE);
        addItemGroup(AMETHYST_AXE);
        addItemGroup(AMETHYST_HOE);

        addItemGroup(EMERALD_SWORD);
        addItemGroup(EMERALD_SHOVEL);
        addItemGroup(EMERALD_PICKAXE);
        addItemGroup(EMERALD_AXE);
        addItemGroup(EMERALD_HOE);

        addItemGroup(LEAD_SWORD);
        addItemGroup(LEAD_SHOVEL);
        addItemGroup(LEAD_PICKAXE);
        addItemGroup(LEAD_AXE);
        addItemGroup(LEAD_HOE);

        addItemGroup(QUARTZ_SWORD);
        addItemGroup(QUARTZ_SHOVEL);
        addItemGroup(QUARTZ_PICKAXE);
        addItemGroup(QUARTZ_AXE);
        addItemGroup(QUARTZ_HOE);

        addItemGroup(REDSTONE_SWORD);
        addItemGroup(REDSTONE_SHOVEL);
        addItemGroup(REDSTONE_PICKAXE);
        addItemGroup(REDSTONE_AXE);
        addItemGroup(REDSTONE_HOE);
        
        addItemGroup(BRONZE_HELMET);
        addItemGroup(BRONZE_CHESTPLATE);
        addItemGroup(BRONZE_LEGGINGS);
        addItemGroup(BRONZE_BOOTS);

        addItemGroup(IRONCOPPER_HELMET);
        addItemGroup(IRONCOPPER_CHESTPLATE);
        addItemGroup(IRONCOPPER_LEGGINGS);
        addItemGroup(IRONCOPPER_BOOTS);

        addItemGroup(AMETHYST_HELMET);
        addItemGroup(AMETHYST_CHESTPLATE);
        addItemGroup(AMETHYST_LEGGINGS);
        addItemGroup(AMETHYST_BOOTS);

        addItemGroup(EMERALD_HELMET);
        addItemGroup(EMERALD_CHESTPLATE);
        addItemGroup(EMERALD_LEGGINGS);
        addItemGroup(EMERALD_BOOTS);

        addItemGroup(LEAD_HELMET);
        addItemGroup(LEAD_CHESTPLATE);
        addItemGroup(LEAD_LEGGINGS);
        addItemGroup(LEAD_BOOTS);

        addItemGroup(QUARTZ_HELMET);
        addItemGroup(QUARTZ_CHESTPLATE);
        addItemGroup(QUARTZ_LEGGINGS);
        addItemGroup(QUARTZ_BOOTS);

        addItemGroup(REDSTONE_HELMET);
        addItemGroup(REDSTONE_CHESTPLATE);
        addItemGroup(REDSTONE_LEGGINGS);
        addItemGroup(REDSTONE_BOOTS);

        addItemGroup(LAVA_HELMET);
        addItemGroup(LAVA_CHESTPLATE);
        addItemGroup(LAVA_LEGGINGS);
        addItemGroup(LAVA_BOOTS);

        addItemGroup(BRONZE_INGOT);
        addItemGroup(AMETHYST_INGOT);
        addItemGroup(EMERALD_INGOT);
        addItemGroup(LEAD_INGOT);
        addItemGroup(QUARTZ_INGOT);
        addItemGroup(REDSTONE_INGOT);
        addItemGroup(RED_DIAMOND_INGOT);

        addItemGroup(LEAD_ORE);
        addItemGroup(RED_DIAMOND_ORE);
        addItemGroup(DEEPSLATE_DIAMOND_ORE);

        addItemGroup(RAW_LEAD);
        addItemGroup(QUARTZ_SCRAP);
        addItemGroup(RED_DIAMOND);
        addItemGroup(LAVA_SMITHING_TEMPLATE);
    }

    private static void addItemGroup(Item item) {
        ModMain.PLATFORM.addItemGroup(item);
    }

    private static Item register(Block block, BiFunction<Block, Item.Settings, Item> factory) {
        @SuppressWarnings("deprecation") // TODO: Note
        var key = keyOf(block.getRegistryEntry().registryKey());
        return register(key, settings -> factory.apply(block, settings), new Item.Settings().useBlockPrefixedTranslationKey());
    }

    private static Item.Settings settingsOf(String name) {
        return settingsOf(name, new Item.Settings());
    }

    private static Item.Settings settingsOf(String name, Item.Settings settings) {
        return settings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Constants.MOD_ID, name)));
    }

    private static Item register(String name, Item.Settings settings, Function<Item.Settings, Item> factory) {
        var registeredSettings = settings.registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Constants.MOD_ID, name)));
        return factory.apply(registeredSettings);
    }

    private static RegistryKey<Item> keyOf(RegistryKey<Block> blockKey) {
        return RegistryKey.of(RegistryKeys.ITEM, blockKey.getValue());
    }

    private static Item register(RegistryKey<Item> key, Function<Item.Settings, Item> factory, Item.Settings settings) {
        Item item = factory.apply(settings.registryKey(key));
        if (item instanceof BlockItem blockItem) {
            blockItem.appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
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
