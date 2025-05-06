package net.syshima.sptools.core.assets;

import net.minecraft.client.render.entity.equipment.EquipmentModel;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.syshima.sptools.Constants;

import java.util.function.BiConsumer;

public final class ModEquipmentAssets {
    private static final RegistryKey<? extends Registry<EquipmentAsset>> ROOT = RegistryKey.ofRegistry(Identifier.of(Constants.Path.EQUIPMENT_ASSET));

    public static final RegistryKey<EquipmentAsset> BRONZE_ARMOR = ModEquipmentAssets.ofKey(Constants.Armor.BRONZE_ARMOR);
    public static final RegistryKey<EquipmentAsset> IRONCOPPER_ARMOR = ModEquipmentAssets.ofKey(Constants.Armor.IRONCOPPER_ARMOR);
    public static final RegistryKey<EquipmentAsset> AMETHYST_ARMOR = ModEquipmentAssets.ofKey(Constants.Armor.AMETHYST_ARMOR);
    public static final RegistryKey<EquipmentAsset> EMERALD_ARMOR = ModEquipmentAssets.ofKey(Constants.Armor.EMERALD_ARMOR);
    public static final RegistryKey<EquipmentAsset> LEAD_ARMOR = ModEquipmentAssets.ofKey(Constants.Armor.LEAD_ARMOR);
    public static final RegistryKey<EquipmentAsset> QUARTZ_ARMOR = ModEquipmentAssets.ofKey(Constants.Armor.QUARTZ_ARMOR);
    public static final RegistryKey<EquipmentAsset> REDSTONE_ARMOR = ModEquipmentAssets.ofKey(Constants.Armor.REDSTONE_ARMOR);
    public static final RegistryKey<EquipmentAsset> LAVA_ARMOR = ModEquipmentAssets.ofKey(Constants.Armor.LAVA_ARMOR);

    private static RegistryKey<EquipmentAsset> ofKey(String name) {
        return RegistryKey.of(ROOT, Identifier.of(Constants.MOD_ID, name));
    }

    public static  void bootstrap(BiConsumer<RegistryKey<EquipmentAsset>, EquipmentModel> consumer) {
        consumer.accept(BRONZE_ARMOR, humanoid(Constants.Armor.BRONZE_ARMOR));
        consumer.accept(IRONCOPPER_ARMOR, humanoid(Constants.Armor.IRONCOPPER_ARMOR));
        consumer.accept(AMETHYST_ARMOR, humanoid(Constants.Armor.AMETHYST_ARMOR));
        consumer.accept(EMERALD_ARMOR, humanoid(Constants.Armor.EMERALD_ARMOR));
        consumer.accept(LEAD_ARMOR, humanoid(Constants.Armor.LEAD_ARMOR));
        consumer.accept(QUARTZ_ARMOR, humanoid(Constants.Armor.QUARTZ_ARMOR));
        consumer.accept(REDSTONE_ARMOR, humanoid(Constants.Armor.REDSTONE_ARMOR));
        consumer.accept(LAVA_ARMOR, humanoid(Constants.Armor.LAVA_ARMOR));
    }

    private static EquipmentModel humanoid(String name) {
        return EquipmentModel.builder().addHumanoidLayers(Identifier.of(Constants.MOD_ID, name)).build();
    }
}
