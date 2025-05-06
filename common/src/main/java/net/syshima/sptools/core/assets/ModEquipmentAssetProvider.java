package net.syshima.sptools.core.assets;

import net.minecraft.client.render.entity.equipment.EquipmentModel;
import net.minecraft.data.DataOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.registry.RegistryKey;
import net.syshima.sptools.Constants;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModEquipmentAssetProvider extends net.minecraft.client.data.EquipmentAssetProvider {
    protected final DataOutput.PathResolver pathResolver;
    public ModEquipmentAssetProvider(DataOutput output) {
        super(output);
        this.pathResolver = output.getResolver(DataOutput.OutputType.RESOURCE_PACK, Constants.Path.EQUIPMENT);
    }

    @Override
    public CompletableFuture<?> run(DataWriter writer) {
        Map<RegistryKey<EquipmentAsset>, EquipmentModel> equipmentMap = new HashMap<>();
        ModEquipmentAssets.bootstrap((key, model) -> {
            if (equipmentMap.putIfAbsent(key, model) != null) {
                throw new IllegalStateException("Duplicate key " + key);
            }
        });

        return DataProvider.writeAllToPath(writer, EquipmentModel.CODEC, pathResolver::resolveJson, equipmentMap);
    }
}
