package net.syshima.sptools.core.assets;

import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.data.PackOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.CachedOutput;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.resources.ResourceKey;
import net.syshima.sptools.Constants;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModEquipmentAssetProvider extends net.minecraft.client.data.models.EquipmentAssetProvider {
    protected final PackOutput.PathProvider pathResolver;
    public ModEquipmentAssetProvider(PackOutput output) {
        super(output);
        this.pathResolver = output.createPathProvider(PackOutput.Target.RESOURCE_PACK, Constants.Path.EQUIPMENT);
    }

    @Override
    public CompletableFuture<?> run(CachedOutput writer) {
        Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> equipmentMap = new HashMap<>();
        ModEquipmentAssets.bootstrap((key, model) -> {
            if (equipmentMap.putIfAbsent(key, model) != null) {
                throw new IllegalStateException("Duplicate key " + key);
            }
        });

        return DataProvider.saveAll(writer, EquipmentClientInfo.CODEC, pathResolver::json, equipmentMap);
    }
}
