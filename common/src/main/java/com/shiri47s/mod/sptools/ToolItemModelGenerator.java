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
        TOOL_REGISTER.register(Constants.Tool.BRONZE_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.Bronze, (new Item.Settings()).attributeModifiers(SwordItem.createAttributeModifiers(SupplementalToolMaterials.Bronze, 1, -2.4F))));
        TOOL_REGISTER.register(Constants.Tool.BRONZE_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.Bronze, (new Item.Settings()).attributeModifiers(ShovelItem.createAttributeModifiers(SupplementalToolMaterials.Bronze, 1, -3.0F))));
        TOOL_REGISTER.register(Constants.Tool.BRONZE_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.Bronze, (new Item.Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(SupplementalToolMaterials.Bronze, 1, -2.8F))));
        TOOL_REGISTER.register(Constants.Tool.BRONZE_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.Bronze, (new Item.Settings()).attributeModifiers(AxeItem.createAttributeModifiers(SupplementalToolMaterials.Bronze, 5, -3.1F))));
        TOOL_REGISTER.register(Constants.Tool.BRONZE_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.Bronze, (new Item.Settings()).attributeModifiers(HoeItem.createAttributeModifiers(SupplementalToolMaterials.Bronze, -2.0F, -1.6F))));

        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.IRONCOPPER, (new Item.Settings()).attributeModifiers(SwordItem.createAttributeModifiers(SupplementalToolMaterials.IRONCOPPER, 2, -2.4F))));
        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.IRONCOPPER, (new Item.Settings()).attributeModifiers(ShovelItem.createAttributeModifiers(SupplementalToolMaterials.IRONCOPPER, 1.5F, -3.0F))));
        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.IRONCOPPER, (new Item.Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(SupplementalToolMaterials.IRONCOPPER, 1.5F, -2.8F))));
        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.IRONCOPPER, (new Item.Settings()).attributeModifiers(AxeItem.createAttributeModifiers(SupplementalToolMaterials.IRONCOPPER, 5.5F, -3.1F))));
        TOOL_REGISTER.register(Constants.Tool.IRONCOPPER_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.IRONCOPPER, (new Item.Settings()).attributeModifiers(HoeItem.createAttributeModifiers(SupplementalToolMaterials.IRONCOPPER, -2.0F, -1.8F))));

        TOOL_REGISTER.register(Constants.Tool.AMETHYST_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.AMETHYST, (new Item.Settings()).attributeModifiers(SwordItem.createAttributeModifiers(SupplementalToolMaterials.AMETHYST, 1, -2.2F))));
        TOOL_REGISTER.register(Constants.Tool.AMETHYST_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.AMETHYST, (new Item.Settings()).attributeModifiers(ShovelItem.createAttributeModifiers(SupplementalToolMaterials.AMETHYST, 1.5F, -2.8F))));
        TOOL_REGISTER.register(Constants.Tool.AMETHYST_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.AMETHYST, (new Item.Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(SupplementalToolMaterials.AMETHYST, 1, -2.6F))));
        TOOL_REGISTER.register(Constants.Tool.AMETHYST_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.AMETHYST, (new Item.Settings()).attributeModifiers(AxeItem.createAttributeModifiers(SupplementalToolMaterials.AMETHYST, 5, -2.8F))));
        TOOL_REGISTER.register(Constants.Tool.AMETHYST_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.AMETHYST, (new Item.Settings()).attributeModifiers(HoeItem.createAttributeModifiers(SupplementalToolMaterials.AMETHYST, -2.0F, -2.4F))));

        TOOL_REGISTER.register(Constants.Tool.EMERALD_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.EMERALD, (new Item.Settings()).attributeModifiers(SwordItem.createAttributeModifiers(SupplementalToolMaterials.EMERALD, 3, -2.4F))));
        TOOL_REGISTER.register(Constants.Tool.EMERALD_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.EMERALD, (new Item.Settings()).attributeModifiers(ShovelItem.createAttributeModifiers(SupplementalToolMaterials.EMERALD, 1.5F, -3.0F))));
        TOOL_REGISTER.register(Constants.Tool.EMERALD_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.EMERALD, (new Item.Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(SupplementalToolMaterials.EMERALD, 1, -2.8F))));
        TOOL_REGISTER.register(Constants.Tool.EMERALD_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.EMERALD, (new Item.Settings()).attributeModifiers(AxeItem.createAttributeModifiers(SupplementalToolMaterials.EMERALD, 5, -3.0F))));
        TOOL_REGISTER.register(Constants.Tool.EMERALD_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.EMERALD, (new Item.Settings()).attributeModifiers(HoeItem.createAttributeModifiers(SupplementalToolMaterials.EMERALD, -2.0F, -3.0F))));

        TOOL_REGISTER.register(Constants.Tool.LEAD_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.LEAD, (new Item.Settings()).attributeModifiers(SwordItem.createAttributeModifiers(SupplementalToolMaterials.LEAD, 4, -2.8F))));
        TOOL_REGISTER.register(Constants.Tool.LEAD_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.LEAD, (new Item.Settings()).attributeModifiers(ShovelItem.createAttributeModifiers(SupplementalToolMaterials.LEAD, 1.5F, -3.2F))));
        TOOL_REGISTER.register(Constants.Tool.LEAD_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.LEAD, (new Item.Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(SupplementalToolMaterials.LEAD, 1.5F, -3.0F))));
        TOOL_REGISTER.register(Constants.Tool.LEAD_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.LEAD, (new Item.Settings()).attributeModifiers(AxeItem.createAttributeModifiers(SupplementalToolMaterials.LEAD, 7, -3.4F))));
        TOOL_REGISTER.register(Constants.Tool.LEAD_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.LEAD, (new Item.Settings()).attributeModifiers(HoeItem.createAttributeModifiers(SupplementalToolMaterials.LEAD, -2.0F, -3.2F))));

        TOOL_REGISTER.register(Constants.Tool.QUARTZ_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.QUARTZ, (new Item.Settings()).attributeModifiers(SwordItem.createAttributeModifiers(SupplementalToolMaterials.QUARTZ, 4, -2.4F))));
        TOOL_REGISTER.register(Constants.Tool.QUARTZ_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.QUARTZ, (new Item.Settings()).attributeModifiers(ShovelItem.createAttributeModifiers(SupplementalToolMaterials.QUARTZ, 1.5F, -3.0F))));
        TOOL_REGISTER.register(Constants.Tool.QUARTZ_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.QUARTZ, (new Item.Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(SupplementalToolMaterials.QUARTZ, 1.5F, -2.6F))));
        TOOL_REGISTER.register(Constants.Tool.QUARTZ_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.QUARTZ, (new Item.Settings()).attributeModifiers(AxeItem.createAttributeModifiers(SupplementalToolMaterials.QUARTZ, 7, -3.1F))));
        TOOL_REGISTER.register(Constants.Tool.QUARTZ_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.QUARTZ, (new Item.Settings()).attributeModifiers(HoeItem.createAttributeModifiers(SupplementalToolMaterials.QUARTZ, -2.0F, -3.0F))));

        TOOL_REGISTER.register(Constants.Tool.REDSTONE_SWORD, () -> new SupplementalSwordItem(SupplementalToolMaterials.REDSTONE, (new Item.Settings()).attributeModifiers(SwordItem.createAttributeModifiers(SupplementalToolMaterials.REDSTONE, 3, -2.6F))));
        TOOL_REGISTER.register(Constants.Tool.REDSTONE_SHOVEL, () -> new SupplementalShovelItem(SupplementalToolMaterials.REDSTONE, (new Item.Settings()).attributeModifiers(ShovelItem.createAttributeModifiers(SupplementalToolMaterials.REDSTONE, 1.0F, -3.0F))));
        TOOL_REGISTER.register(Constants.Tool.REDSTONE_PICKAXE, () -> new SupplementalPickaxeItem(SupplementalToolMaterials.REDSTONE, (new Item.Settings()).attributeModifiers(PickaxeItem.createAttributeModifiers(SupplementalToolMaterials.REDSTONE, 1.0F, -2.8F))));
        TOOL_REGISTER.register(Constants.Tool.REDSTONE_AXE, () -> new SupplementalAxeItem(SupplementalToolMaterials.REDSTONE, (new Item.Settings()).attributeModifiers(AxeItem.createAttributeModifiers(SupplementalToolMaterials.REDSTONE, 6, -3.2F))));
        TOOL_REGISTER.register(Constants.Tool.REDSTONE_HOE, () -> new SupplementalHoeItem(SupplementalToolMaterials.REDSTONE, (new Item.Settings()).attributeModifiers(HoeItem.createAttributeModifiers(SupplementalToolMaterials.REDSTONE, -2.0F, -3.2F))));

        TOOL_REGISTER.register();
    }
}
