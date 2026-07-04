package net.syshima.sptools.core.assets;

import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.syshima.sptools.Constants;

import java.util.function.BiConsumer;

public final class ModEquipmentAssets {
    private static final ResourceKey<? extends Registry<EquipmentAsset>> ROOT = ResourceKey.createRegistryKey(Identifier.withDefaultNamespace(Constants.Path.EQUIPMENT_ASSET));

    public static final ResourceKey<EquipmentAsset> BRONZE_ARMOR = ModEquipmentAssets.ofKey(Constants.Items.BRONZE_ARMOR);
    public static final ResourceKey<EquipmentAsset> IRONCOPPER_ARMOR = ModEquipmentAssets.ofKey(Constants.Items.IRONCOPPER_ARMOR);
    public static final ResourceKey<EquipmentAsset> AMETHYST_ARMOR = ModEquipmentAssets.ofKey(Constants.Items.AMETHYST_ARMOR);
    public static final ResourceKey<EquipmentAsset> EMERALD_ARMOR = ModEquipmentAssets.ofKey(Constants.Items.EMERALD_ARMOR);
    public static final ResourceKey<EquipmentAsset> LEAD_ARMOR = ModEquipmentAssets.ofKey(Constants.Items.LEAD_ARMOR);
    public static final ResourceKey<EquipmentAsset> QUARTZ_ARMOR = ModEquipmentAssets.ofKey(Constants.Items.QUARTZ_ARMOR);
    public static final ResourceKey<EquipmentAsset> REDSTONE_ARMOR = ModEquipmentAssets.ofKey(Constants.Items.REDSTONE_ARMOR);
    public static final ResourceKey<EquipmentAsset> LAVA_ARMOR = ModEquipmentAssets.ofKey(Constants.Items.LAVA_ARMOR);

    private static ResourceKey<EquipmentAsset> ofKey(String name) {
        return ResourceKey.create(ROOT, Identifier.fromNamespaceAndPath(Constants.MOD_ID, name));
    }

    public static  void bootstrap(BiConsumer<ResourceKey<EquipmentAsset>, EquipmentClientInfo> consumer) {
        consumer.accept(BRONZE_ARMOR, humanoid(Constants.Items.BRONZE_ARMOR));
        consumer.accept(IRONCOPPER_ARMOR, humanoid(Constants.Items.IRONCOPPER_ARMOR));
        consumer.accept(AMETHYST_ARMOR, humanoid(Constants.Items.AMETHYST_ARMOR));
        consumer.accept(EMERALD_ARMOR, humanoid(Constants.Items.EMERALD_ARMOR));
        consumer.accept(LEAD_ARMOR, humanoid(Constants.Items.LEAD_ARMOR));
        consumer.accept(QUARTZ_ARMOR, humanoid(Constants.Items.QUARTZ_ARMOR));
        consumer.accept(REDSTONE_ARMOR, humanoid(Constants.Items.REDSTONE_ARMOR));
        consumer.accept(LAVA_ARMOR, humanoid(Constants.Items.LAVA_ARMOR));
    }

    private static EquipmentClientInfo humanoid(String name) {
        return EquipmentClientInfo.builder().addHumanoidLayers(Identifier.fromNamespaceAndPath(Constants.MOD_ID, name)).build();
    }
}
