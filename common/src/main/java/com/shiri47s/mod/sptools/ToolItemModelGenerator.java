package com.shiri47s.mod.sptools;

import com.shiri47s.mod.sptools.armors.CopperArmorItem;
import com.shiri47s.mod.sptools.materials.CopperToolsMaterial;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.item.*;
import net.minecraft.registry.RegistryKeys;

import static com.shiri47s.mod.sptools.Constants.MOD_ID;

public class ToolItemModelGenerator {
    private static final DeferredRegister<Item> ItemRegister = DeferredRegister.create(MOD_ID, RegistryKeys.ITEM);

    public static void generate() {
        ToolMaterial copperMaterial = new CopperToolsMaterial();
        ItemRegister.register(Constants.Tool.COPPER_SWORD, () -> new SwordItem(copperMaterial, 3, -2.4F, new Item.Settings()));
        ItemRegister.register(Constants.Tool.COPPER_SHOVEL, () -> new ShovelItem(copperMaterial, 1.5F, -3.0F, new Item.Settings()));
        ItemRegister.register(Constants.Tool.COPPER_PICKAXE, () -> new PickaxeItem(copperMaterial, 1, -2.8F, new Item.Settings()));
        ItemRegister.register(Constants.Tool.COPPER_AXE, () -> new AxeItem(copperMaterial, 6.0F, -3.1F, new Item.Settings()));
        ItemRegister.register(Constants.Tool.COPPER_HOE, () -> new HoeItem(copperMaterial, -2, -1.0F, new Item.Settings()));

        ItemRegister.getRegistrar().get()
    }
}
