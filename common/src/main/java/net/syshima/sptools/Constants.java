package net.syshima.sptools;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.syshima.sptools.core.ArmorSeries;
import net.syshima.sptools.core.assets.ModArmorMaterials;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public final class Constants {
    public static final String MOD_ID = "sptools";
    public static final String GROUP_NAME = "supplemental_tools";

    /**
     * An armour series, and everything that differs between one series and the next.
     *
     * <p>The material, the rarity, the durability, the tooltip line and the set bonus
     * each used to live somewhere else, so adding a series meant finding all five.
     * They are arguments to the constant here instead, which turns leaving one out
     * into a compile error rather than a missing row noticed at runtime.
     *
     * <p>{@link #None} carries no traits: it is what "this player is not wearing a
     * matched set" means everywhere a series is read.
     */
    public enum Series {
        None,

        // The Bronze line reads "blessing.copper" on purpose: it is an existing
        // translation key, and renaming it would break language files.
        Bronze(ModArmorMaterials.BRONZE, Rarity.UNCOMMON, 12,
                "item.sptools.blessing.copper", false, ModEffects.KNOCKBACK_RESISTANCE),
        IronCopper(ModArmorMaterials.IRONCOPPER, Rarity.UNCOMMON, 11,
                "item.sptools.blessing.ironcopper", false, ModEffects.ATTACK_KNOCKBACK),
        Amethyst(ModArmorMaterials.AMETHYST, Rarity.RARE, 17,
                "item.sptools.blessing.amethyst", false, ModEffects.MOVEMENT_SPEED),
        Emerald(ModArmorMaterials.EMERALD, Rarity.RARE, 21,
                "item.sptools.blessing.emerald", false, ModEffects.HASTE_AND_LUCK),
        Lead(ModArmorMaterials.LEAD, Rarity.UNCOMMON, 12,
                "item.sptools.blessing.heavy", false, ModEffects.HEAVY),
        Quartz(ModArmorMaterials.QUARTZ, Rarity.RARE, 22,
                "item.sptools.blessing.quartz", false, ModEffects.BOUNDED_GLOWING),
        Redstone(ModArmorMaterials.REDSTONE, Rarity.RARE, 14,
                "item.sptools.blessing.redstone", false, ModEffects.REDSTONE_OVERFLOW),
        Lava(ModArmorMaterials.LAVA, Rarity.EPIC, 40,
                "item.sptools.blessing.lava", true, ModEffects.ANTI_LAVA);

        /**
         * Every series that grants a set bonus, in declaration order. {@link #None} is
         * not among them. Shared; never mutated.
         */
        public static final List<Series> WITH_BONUS = withBonus();

        @Nullable
        private final ArmorSeries traits;

        Series() {
            this.traits = null;
        }

        Series(ArmorMaterial material, Rarity rarity, int durability, String blessingKey,
               boolean fireResistant, RegistrySupplier<MobEffect> benefit) {
            this.traits = new ArmorSeries(material, rarity, durability, blessingKey, fireResistant, benefit);
        }

        /**
         * Everything an armour piece of this series is built from.
         *
         * @throws IllegalStateException for {@link #None}, which describes no armour
         */
        public ArmorSeries traits() {
            if (traits == null) {
                throw new IllegalStateException(this + " describes no armour series");
            }

            return traits;
        }

        /**
         * Effect a complete set of this series grants.
         *
         * @throws IllegalStateException for {@link #None}, which grants nothing
         */
        public Holder<MobEffect> bonus() {
            return traits().benefit().asHolder();
        }

        private static List<Series> withBonus() {
            List<Series> found = new ArrayList<>();
            for (Series series : values()) {
                if (series.traits != null) {
                    found.add(series);
                }
            }

            return List.copyOf(found);
        }
    }

    public static class Path {
        public static final String EQUIPMENT = "equipment";
        public static final String EQUIPMENT_ASSET = "equipment_asset";
    }

    public static class Items {
        public static final String BRONZE_INGOT = "bronze_ingot";
        public static final String AMETHYST_INGOT = "amethyst_ingot";
        public static final String EMERALD_INGOT = "emerald_ingot";
        public static final String LEAD_INGOT = "lead_ingot";
        public static final String RAW_LEAD = "raw_lead";
        public static final String LEAD_ORE = "lead_ore";
        public static final String QUARTZ_INGOT = "quartz_ingot";
        public static final String QUARTZ_SCRAP = "quartz_scrap";
        public static final String REDSTONE_INGOT = "redstone_ingot";
        public static final String RED_DIAMOND = "red_diamond";
        public static final String RED_DIAMOND_ORE = "red_diamond_ore";
        public static final String DEEPSLATE_RED_DIAMOND_ORE = "deepslate_red_diamond_ore";
        public static final String RED_DIAMOND_INGOT = "red_diamond_ingot";
        public static final String LAVA_SMITHING_TEMPLATE = "lava_upgrade_smithing_template";
        public static final String BRONZE_ARMOR = "bronze_armor";
        public static final String BRONZE_HELMET = "bronze_helmet";
        public static final String BRONZE_CHESTPLATE = "bronze_chestplate";
        public static final String BRONZE_LEGGINGS = "bronze_leggings";
        public static final String BRONZE_BOOTS = "bronze_boots";

        public static final String IRONCOPPER_ARMOR = "ironcopper_armor";
        public static final String IRONCOPPER_HELMET = "ironcopper_helmet";
        public static final String IRONCOPPER_CHESTPLATE = "ironcopper_chestplate";
        public static final String IRONCOPPER_LEGGINGS = "ironcopper_leggings";
        public static final String IRONCOPPER_BOOTS = "ironcopper_boots";

        public static final String AMETHYST_ARMOR = "amethyst_armor";
        public static final String AMETHYST_HELMET = "amethyst_helmet";
        public static final String AMETHYST_CHESTPLATE = "amethyst_chestplate";
        public static final String AMETHYST_LEGGINGS = "amethyst_leggings";
        public static final String AMETHYST_BOOTS = "amethyst_boots";

        public static final String EMERALD_ARMOR = "emerald_armor";
        public static final String EMERALD_HELMET = "emerald_helmet";
        public static final String EMERALD_CHESTPLATE = "emerald_chestplate";
        public static final String EMERALD_LEGGINGS = "emerald_leggings";
        public static final String EMERALD_BOOTS = "emerald_boots";

        public static final String LEAD_ARMOR = "lead_armor";
        public static final String LEAD_HELMET = "lead_helmet";
        public static final String LEAD_CHESTPLATE = "lead_chestplate";
        public static final String LEAD_LEGGINGS = "lead_leggings";
        public static final String LEAD_BOOTS = "lead_boots";

        public static final String QUARTZ_ARMOR = "quartz_armor";
        public static final String QUARTZ_HELMET = "quartz_helmet";
        public static final String QUARTZ_CHESTPLATE = "quartz_chestplate";
        public static final String QUARTZ_LEGGINGS = "quartz_leggings";
        public static final String QUARTZ_BOOTS = "quartz_boots";

        public static final String REDSTONE_ARMOR = "redstone_armor";
        public static final String REDSTONE_HELMET = "redstone_helmet";
        public static final String REDSTONE_CHESTPLATE = "redstone_chestplate";
        public static final String REDSTONE_LEGGINGS = "redstone_leggings";
        public static final String REDSTONE_BOOTS = "redstone_boots";

        public static final String LAVA_ARMOR = "lava_armor";
        public static final String LAVA_HELMET = "lava_helmet";
        public static final String LAVA_CHESTPLATE = "lava_chestplate";
        public static final String LAVA_LEGGINGS = "lava_leggings";
        public static final String LAVA_BOOTS = "lava_boots";

        public static final String BRONZE_SWORD = "bronze_sword";
        public static final String BRONZE_AXE = "bronze_axe";
        public static final String BRONZE_SHOVEL = "bronze_shovel";
        public static final String BRONZE_PICKAXE = "bronze_pickaxe";
        public static final String BRONZE_HOE = "bronze_hoe";

        public static final String IRONCOPPER_SWORD = "ironcopper_sword";
        public static final String IRONCOPPER_AXE = "ironcopper_axe";
        public static final String IRONCOPPER_SHOVEL = "ironcopper_shovel";
        public static final String IRONCOPPER_PICKAXE = "ironcopper_pickaxe";
        public static final String IRONCOPPER_HOE = "ironcopper_hoe";

        public static final String AMETHYST_SWORD = "amethyst_sword";
        public static final String AMETHYST_AXE = "amethyst_axe";
        public static final String AMETHYST_SHOVEL = "amethyst_shovel";
        public static final String AMETHYST_PICKAXE = "amethyst_pickaxe";
        public static final String AMETHYST_HOE = "amethyst_hoe";

        public static final String EMERALD_SWORD = "emerald_sword";
        public static final String EMERALD_AXE = "emerald_axe";
        public static final String EMERALD_SHOVEL = "emerald_shovel";
        public static final String EMERALD_PICKAXE = "emerald_pickaxe";
        public static final String EMERALD_HOE = "emerald_hoe";

        public static final String LEAD_SWORD = "lead_sword";
        public static final String LEAD_AXE = "lead_axe";
        public static final String LEAD_SHOVEL = "lead_shovel";
        public static final String LEAD_PICKAXE = "lead_pickaxe";
        public static final String LEAD_HOE = "lead_hoe";

        public static final String QUARTZ_SWORD = "quartz_sword";
        public static final String QUARTZ_AXE = "quartz_axe";
        public static final String QUARTZ_SHOVEL = "quartz_shovel";
        public static final String QUARTZ_PICKAXE = "quartz_pickaxe";
        public static final String QUARTZ_HOE = "quartz_hoe";

        public static final String REDSTONE_SWORD = "redstone_sword";
        public static final String REDSTONE_AXE = "redstone_axe";
        public static final String REDSTONE_SHOVEL = "redstone_shovel";
        public static final String REDSTONE_PICKAXE = "redstone_pickaxe";
        public static final String REDSTONE_HOE = "redstone_hoe";

        public static final String DURABLE_FIREWORK_ROCKET = "durable_firework_rocket";
        public static final String DURABLE_FIREWORK_ROCKET_UPGRADED = "durable_firework_rocket_upgraded";
        public static final String DURABLE_TOTEM_OF_UNDYING = "durable_totem_of_undying";
        public static final String DURABLE_TOTEM_OF_UNDYING_UPGRADED = "durable_totem_of_undying_upgraded";
        public static final String DURABLE_TORCH = "durable_torch";
        public static final String DURABLE_TORCH_UPGRADED = "durable_torch_upgraded";
    }

    public static class Blocks {
        public static final String LEAD_ORE = "lead_ore";
        public static final String RED_DIAMOND_ORE = "red_diamond_ore";
        public static final String DEEPSLATE_RED_DIAMOND_ORE = "deepslate_red_diamond_ore";

        public static final String TORCH_BLOCK = "torch_block";
        public static final String WALL_TORCH_BLOCK = "wall_torch_block";
    }

    public static class Effects {
        public static final String KNOCKBACK_RESISTANCE = "knockback_resistance";
        public static final String ATTACK_KNOCKBACK = "attack_knockback";
        public static final String MOVEMENT_SPEED = "movement_speed";
        public static final String HASTE_AND_LUCK = "haste_and_luck";
        public static final String HEAVY = "heavy";
        public static final String BOUNDED_GLOWING = "bounded_glowing";
        public static final String REDSTONE_OVERFLOW = "redstone_overflow";
        public static final String ANTI_LAVA = "anti_lava";
    }
}
