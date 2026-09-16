package net.syshima.sptools.core;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.syshima.sptools.Constants;

/**
 * Everything that differs between one armour series and the next.
 *
 * <p>The values are declared on {@link Constants.Series}, one constant per series, so
 * a series that leaves one out does not compile. Nothing outside that enum builds one
 * of these; ask a series for its {@link Constants.Series#traits()} instead.
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
}
