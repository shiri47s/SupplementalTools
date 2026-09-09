package net.syshima.sptools.datagen;

import net.minecraft.client.data.models.EquipmentAssetProvider;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.syshima.sptools.Constants;
import net.syshima.sptools.core.assets.ModEquipmentAssets;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * Writes the humanoid equipment layers for every armour series.
 *
 * <p>Lives in common so both loaders' data generators can share it, but references
 * client-only classes and is therefore excluded from the shipped jars - see the
 * shadowJar configuration in each platform build script.
 */
public final class ModEquipmentAssetProvider extends EquipmentAssetProvider {

    private final PackOutput.PathProvider pathProvider;

    public ModEquipmentAssetProvider(PackOutput output) {
        super(output);
        this.pathProvider = output.createPathProvider(PackOutput.Target.RESOURCE_PACK, Constants.Path.EQUIPMENT);
    }

    @Override
    public CompletableFuture<?> run(CachedOutput writer) {
        Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> assets = new HashMap<>();
        add(assets, ModEquipmentAssets.BRONZE_ARMOR, Constants.Items.BRONZE_ARMOR);
        add(assets, ModEquipmentAssets.IRONCOPPER_ARMOR, Constants.Items.IRONCOPPER_ARMOR);
        add(assets, ModEquipmentAssets.AMETHYST_ARMOR, Constants.Items.AMETHYST_ARMOR);
        add(assets, ModEquipmentAssets.EMERALD_ARMOR, Constants.Items.EMERALD_ARMOR);
        add(assets, ModEquipmentAssets.LEAD_ARMOR, Constants.Items.LEAD_ARMOR);
        add(assets, ModEquipmentAssets.QUARTZ_ARMOR, Constants.Items.QUARTZ_ARMOR);
        add(assets, ModEquipmentAssets.REDSTONE_ARMOR, Constants.Items.REDSTONE_ARMOR);
        add(assets, ModEquipmentAssets.LAVA_ARMOR, Constants.Items.LAVA_ARMOR);

        return DataProvider.saveAll(writer, EquipmentClientInfo.CODEC, pathProvider::json, assets);
    }

    private static void add(Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> assets,
                            ResourceKey<EquipmentAsset> key, String texture) {
        EquipmentClientInfo info = EquipmentClientInfo.builder()
                .addHumanoidLayers(Identifier.fromNamespaceAndPath(Constants.MOD_ID, texture))
                .build();
        if (assets.putIfAbsent(key, info) != null) {
            throw new IllegalStateException("Duplicate equipment asset " + key);
        }
    }
}
