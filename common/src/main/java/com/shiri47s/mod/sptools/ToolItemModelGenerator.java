package com.shiri47s.mod.sptools;

import com.shiri47s.mod.sptools.materials.SupplementalToolMaterials;
import com.shiri47s.mod.sptools.tools.*;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.item.*;
import net.minecraft.registry.RegistryKeys;

import static com.shiri47s.mod.sptools.Constants.MOD_ID;

public class ToolItemModelGenerator {
    private static final DeferredRegister<Item> TOOL_REGISTER = DeferredRegister.create(MOD_ID, RegistryKeys.ITEM);

    public static void generate() {
        TOOL_REGISTER.register(Constants.Tool.BRONZE_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.Bronze, 3, -2.4F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.BRONZE_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.Bronze, 1.5F, -3.0F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.BRONZE_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.Bronze, 1, -2.8F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.BRONZE_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.Bronze, 6.0F, -3.1F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.BRONZE_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.Bronze, -2, -1.0F, new Item.Settings()));

        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.IRONCOPPER, 3, -2.4F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.IRONCOPPER, 1.5F, -3.0F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.IRONCOPPER, 1, -2.8F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.IRONCOPPER, 6.0F, -3.1F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.IRONCOPPER, -2, -1.0F, new Item.Settings()));

        TOOL_REGISTER.register(Constants.Tool.AMETHYST_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.AMETHYST, 3, -2.4F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.AMETHYST_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.AMETHYST, 1.5F, -3.0F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.AMETHYST_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.AMETHYST, 1, -2.8F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.AMETHYST_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.AMETHYST, 5.0F, -3.0F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.AMETHYST_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.AMETHYST, -3, -0.0F, new Item.Settings()));

        TOOL_REGISTER.register(Constants.Tool.EMERALD_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.EMERALD, 3, -2.4F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.EMERALD_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.EMERALD, 1.5F, -3.0F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.EMERALD_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.EMERALD, 1, -2.8F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.EMERALD_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.EMERALD, 6.0F, -3.0F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.EMERALD_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.EMERALD, 0, -3.0F, new Item.Settings()));

        TOOL_REGISTER.register(Constants.Tool.LEAD_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.LEAD, 4, -2.9F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.LEAD_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.LEAD, 2.5F, -3.3F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.LEAD_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.LEAD, 2, -3.0F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.LEAD_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.LEAD, 6.5F, -3.2F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.LEAD_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.LEAD, 0, -3.1F, new Item.Settings()));

        TOOL_REGISTER.register(Constants.Tool.QUARTZ_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.Quartz, 3, -2.4F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.QUARTZ_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.Quartz, 1.5F, -3.0F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.QUARTZ_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.Quartz, 1, -2.6F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.QUARTZ_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.Quartz, 5.0F, -3.1F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.QUARTZ_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.Quartz, -2, -3.0F, new Item.Settings()));

        TOOL_REGISTER.register(Constants.Tool.REDSTONE_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.Redstone, 3, -2.6F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.REDSTONE_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.Redstone, 1.0F, -3.0F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.REDSTONE_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.Redstone, 1, -2.8F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.REDSTONE_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.Redstone, 6.0F, -3.2F, new Item.Settings()));
        TOOL_REGISTER.register(Constants.Tool.REDSTONE_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.Redstone, -3, -3.2F, new Item.Settings()));

        TOOL_REGISTER.register();
    }
}
