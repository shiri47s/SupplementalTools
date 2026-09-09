package net.syshima.sptools.core.assets;

import net.minecraft.core.Registry;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.syshima.sptools.Constants;

/**
 * Equipment asset keys referenced by {@link ModArmorMaterials}.
 *
 * <p>Server-safe by design: this class must never touch {@code net.minecraft.client},
 * because armour materials are resolved on both sides. The client-side asset
 * definitions live in {@code net.syshima.sptools.datagen}, which is not shipped.
 */
public final class ModEquipmentAssets {
    private static final ResourceKey<? extends Registry<EquipmentAsset>> ROOT =
            ResourceKey.createRegistryKey(Identifier.withDefaultNamespace(Constants.Path.EQUIPMENT_ASSET));

    public static final ResourceKey<EquipmentAsset> BRONZE_ARMOR = ofKey(Constants.Items.BRONZE_ARMOR);
    public static final ResourceKey<EquipmentAsset> IRONCOPPER_ARMOR = ofKey(Constants.Items.IRONCOPPER_ARMOR);
    public static final ResourceKey<EquipmentAsset> AMETHYST_ARMOR = ofKey(Constants.Items.AMETHYST_ARMOR);
    public static final ResourceKey<EquipmentAsset> EMERALD_ARMOR = ofKey(Constants.Items.EMERALD_ARMOR);
    public static final ResourceKey<EquipmentAsset> LEAD_ARMOR = ofKey(Constants.Items.LEAD_ARMOR);
    public static final ResourceKey<EquipmentAsset> QUARTZ_ARMOR = ofKey(Constants.Items.QUARTZ_ARMOR);
    public static final ResourceKey<EquipmentAsset> REDSTONE_ARMOR = ofKey(Constants.Items.REDSTONE_ARMOR);
    public static final ResourceKey<EquipmentAsset> LAVA_ARMOR = ofKey(Constants.Items.LAVA_ARMOR);

    private ModEquipmentAssets() {
    }

    private static ResourceKey<EquipmentAsset> ofKey(String name) {
        return ResourceKey.create(ROOT, Identifier.fromNamespaceAndPath(Constants.MOD_ID, name));
    }
}
