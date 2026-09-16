package net.syshima.sptools.core;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModEffects;
import net.syshima.sptools.core.assets.ModArmorMaterials;
import org.jetbrains.annotations.Nullable;

import java.util.EnumMap;
import java.util.Map;

/**
 * Everything that differs between one armour series and the next, in one table.
 *
 * <p>Previously the material, the rarity, the durability, the tooltip line and the set
 * bonus each lived somewhere else, so adding a series meant finding all five. A row
 * here is now the single place they are decided.
 *
 * <p>{@link Constants.Series#None} has no row; {@link #of} returns {@code null} for it,
 * which is what "this player is not wearing a matched set" means everywhere it is used.
 *
 * @param material       armour material, which carries defence, toughness and the repair tag
 * @param rarity         name colour in the tooltip
 * @param durability     multiplier handed to {@code ArmorType.getDurability}
 * @param blessingKey    translation key for the full-set tooltip line
 * @param fireResistant  whether the pieces survive fire and lava as dropped items
 * @param benefit        effect granted while a complete set is worn
 */
public record ArmorSeries(
        ArmorMaterial material,
        Rarity rarity,
        int durability,
        String blessingKey,
        boolean fireResistant,
        RegistrySupplier<MobEffect> benefit) {

    private static final Map<Constants.Series, ArmorSeries> TABLE = new EnumMap<>(Constants.Series.class);

    static {
        // The Bronze line reads "blessing.copper" on purpose: it is an existing
        // translation key, and renaming it would break language files.
        define(Constants.Series.Bronze, ModArmorMaterials.BRONZE, Rarity.UNCOMMON, 12,
                "item.sptools.blessing.copper", false, ModEffects.KNOCKBACK_RESISTANCE);
        define(Constants.Series.IronCopper, ModArmorMaterials.IRONCOPPER, Rarity.UNCOMMON, 11,
                "item.sptools.blessing.ironcopper", false, ModEffects.ATTACK_KNOCKBACK);
        define(Constants.Series.Amethyst, ModArmorMaterials.AMETHYST, Rarity.RARE, 17,
                "item.sptools.blessing.amethyst", false, ModEffects.MOVEMENT_SPEED);
        define(Constants.Series.Emerald, ModArmorMaterials.EMERALD, Rarity.RARE, 21,
                "item.sptools.blessing.emerald", false, ModEffects.HASTE_AND_LUCK);
        define(Constants.Series.Lead, ModArmorMaterials.LEAD, Rarity.UNCOMMON, 12,
                "item.sptools.blessing.heavy", false, ModEffects.HEAVY);
        define(Constants.Series.Quartz, ModArmorMaterials.QUARTZ, Rarity.RARE, 22,
                "item.sptools.blessing.quartz", false, ModEffects.BOUNDED_GLOWING);
        define(Constants.Series.Redstone, ModArmorMaterials.REDSTONE, Rarity.RARE, 14,
                "item.sptools.blessing.redstone", false, ModEffects.REDSTONE_OVERFLOW);
        define(Constants.Series.Lava, ModArmorMaterials.LAVA, Rarity.EPIC, 40,
                "item.sptools.blessing.lava", true, ModEffects.ANTI_LAVA);
    }

    /** Traits of the given series, or {@code null} for {@link Constants.Series#None}. */
    @Nullable
    public static ArmorSeries of(Constants.Series series) {
        return TABLE.get(series);
    }

    private static void define(Constants.Series series, ArmorMaterial material, Rarity rarity, int durability,
                               String blessingKey, boolean fireResistant, RegistrySupplier<MobEffect> benefit) {
        TABLE.put(series, new ArmorSeries(material, rarity, durability, blessingKey, fireResistant, benefit));
    }
}
