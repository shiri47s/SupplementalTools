package com.shiri47s.mod.sptools;

import com.shiri47s.mod.sptools.materials.SupplementalToolMaterials;
import com.shiri47s.mod.sptools.tools.*;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.item.*;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import static com.shiri47s.mod.sptools.Constants.MOD_ID;

public class ToolItemModelGenerator {
    private static final DeferredRegister<Item> TOOL_REGISTER = DeferredRegister.create(MOD_ID, RegistryKeys.ITEM);

    public static void generate() {
        TOOL_REGISTER.register(Constants.Tool.BRONZE_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.Bronze, 1, -2.4F, (ofItemSettings(Constants.Tool.BRONZE_SWORD))));
        TOOL_REGISTER.register(Constants.Tool.BRONZE_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.Bronze, 1, -3.0F, (ofItemSettings(Constants.Tool.BRONZE_SHOVEL))));
        TOOL_REGISTER.register(Constants.Tool.BRONZE_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.Bronze, 1, -2.8F, (ofItemSettings(Constants.Tool.BRONZE_PICKAXE))));
        TOOL_REGISTER.register(Constants.Tool.BRONZE_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.Bronze, 5, -3.1F, (ofItemSettings(Constants.Tool.BRONZE_AXE))));
        TOOL_REGISTER.register(Constants.Tool.BRONZE_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.Bronze, -2.0F, -1.6F, (ofItemSettings(Constants.Tool.BRONZE_HOE))));

        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.IRONCOPPER, 2, -2.4F, (ofItemSettings(Constants.Tool.IRONCOPPER_SWORD))));
        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.IRONCOPPER, 1.5F, -3.0F, (ofItemSettings(Constants.Tool.IRONCOPPER_SHOVEL))));
        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.IRONCOPPER, 1.5F, -2.8F, (ofItemSettings(Constants.Tool.IRONCOPPER_PICKAXE))));
        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.IRONCOPPER, 5.5F,-3.1F, (ofItemSettings(Constants.Tool.IRONCOPPER_AXE))));
        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.IRONCOPPER, -2.0F, -1.8F, (ofItemSettings(Constants.Tool.IRONCOPPER_HOE))));

        TOOL_REGISTER.register(Constants.Tool.AMETHYST_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.AMETHYST, 1, -2.2F, (ofItemSettings(Constants.Tool.AMETHYST_SWORD))));
        TOOL_REGISTER.register(Constants.Tool.AMETHYST_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.AMETHYST, 1.5F, -2.8F, (ofItemSettings(Constants.Tool.AMETHYST_SHOVEL))));
        TOOL_REGISTER.register(Constants.Tool.AMETHYST_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.AMETHYST, 1, -2.6F, (ofItemSettings(Constants.Tool.AMETHYST_PICKAXE))));
        TOOL_REGISTER.register(Constants.Tool.AMETHYST_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.AMETHYST, 5, -2.8F, (ofItemSettings(Constants.Tool.AMETHYST_AXE))));
        TOOL_REGISTER.register(Constants.Tool.AMETHYST_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.AMETHYST, -2.0F, -2.4F, (ofItemSettings(Constants.Tool.AMETHYST_HOE))));

        TOOL_REGISTER.register(Constants.Tool.EMERALD_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.EMERALD, 3, -2.4F, (ofItemSettings(Constants.Tool.EMERALD_SWORD))));
        TOOL_REGISTER.register(Constants.Tool.EMERALD_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.EMERALD, 1.5F, -3.0F, (ofItemSettings(Constants.Tool.EMERALD_SHOVEL))));
        TOOL_REGISTER.register(Constants.Tool.EMERALD_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.EMERALD, 1, -2.8F, (ofItemSettings(Constants.Tool.EMERALD_PICKAXE))));
        TOOL_REGISTER.register(Constants.Tool.EMERALD_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.EMERALD, 5, -3.0F, (ofItemSettings(Constants.Tool.EMERALD_AXE))));
        TOOL_REGISTER.register(Constants.Tool.EMERALD_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.EMERALD, -2.0F, -3.0F, (ofItemSettings(Constants.Tool.EMERALD_HOE))));

        TOOL_REGISTER.register(Constants.Tool.LEAD_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.LEAD, 4, -2.8F, (ofItemSettings(Constants.Tool.LEAD_SWORD))));
        TOOL_REGISTER.register(Constants.Tool.LEAD_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.LEAD, 1.5F, -3.2F, (ofItemSettings(Constants.Tool.LEAD_SHOVEL))));
        TOOL_REGISTER.register(Constants.Tool.LEAD_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.LEAD, 1.5F, -3.0F, (ofItemSettings(Constants.Tool.LEAD_PICKAXE))));
        TOOL_REGISTER.register(Constants.Tool.LEAD_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.LEAD, 7, -3.4F, (ofItemSettings(Constants.Tool.LEAD_AXE))));
        TOOL_REGISTER.register(Constants.Tool.LEAD_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.LEAD, -2.0F, -3.2F, (ofItemSettings(Constants.Tool.LEAD_HOE))));

        TOOL_REGISTER.register(Constants.Tool.QUARTZ_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.QUARTZ, 4, -2.4F, (ofItemSettings(Constants.Tool.QUARTZ_SWORD))));
        TOOL_REGISTER.register(Constants.Tool.QUARTZ_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.QUARTZ, 1.5F, -3.0F, (ofItemSettings(Constants.Tool.QUARTZ_SHOVEL))));
        TOOL_REGISTER.register(Constants.Tool.QUARTZ_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.QUARTZ, 1.5F, -2.6F, (ofItemSettings(Constants.Tool.QUARTZ_PICKAXE))));
        TOOL_REGISTER.register(Constants.Tool.QUARTZ_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.QUARTZ, 7, -3.1F, (ofItemSettings(Constants.Tool.QUARTZ_AXE))));
        TOOL_REGISTER.register(Constants.Tool.QUARTZ_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.QUARTZ, -2.0F, -3.0F, (ofItemSettings(Constants.Tool.QUARTZ_HOE))));

        TOOL_REGISTER.register(Constants.Tool.REDSTONE_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.REDSTONE, 3, -2.6F, (ofItemSettings(Constants.Tool.REDSTONE_SWORD))));
        TOOL_REGISTER.register(Constants.Tool.REDSTONE_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.REDSTONE, 1, -3.0F, (ofItemSettings(Constants.Tool.REDSTONE_SHOVEL))));
        TOOL_REGISTER.register(Constants.Tool.REDSTONE_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.REDSTONE, 1, -2.8F, (ofItemSettings(Constants.Tool.REDSTONE_PICKAXE))));
        TOOL_REGISTER.register(Constants.Tool.REDSTONE_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.REDSTONE, 6, -3.2F, (ofItemSettings(Constants.Tool.REDSTONE_AXE))));
        TOOL_REGISTER.register(Constants.Tool.REDSTONE_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.REDSTONE, -2, -3.2F, (ofItemSettings(Constants.Tool.REDSTONE_HOE))));

        TOOL_REGISTER.register();
    }

    private static Item.Settings ofItemSettings(String id) {
        return new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(MOD_ID,id)));
    }
}
