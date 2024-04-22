package com.shiri47s.mod.sptools;

import com.shiri47s.mod.sptools.armors.CopperArmorItem;
import com.shiri47s.mod.sptools.armors.IronCopperArmorItem;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;

import static com.shiri47s.mod.sptools.Constants.MOD_ID;

public class ItemModelGenerator {
    private static final DeferredRegister<Item> ItemRegister = DeferredRegister.create(MOD_ID, RegistryKeys.ITEM);

    public static void generate() {
        ItemRegister.register(Constants.Armor.COPPER_HELMET, () -> new CopperArmorItem(ArmorItem.Type.HELMET));
        ItemRegister.register(Constants.Armor.COPPER_CHESTPLATE, () -> new CopperArmorItem(ArmorItem.Type.CHESTPLATE));
        ItemRegister.register(Constants.Armor.COPPER_LEGGINGS, () -> new CopperArmorItem(ArmorItem.Type.LEGGINGS));
        ItemRegister.register(Constants.Armor.COPPER_BOOTS, () -> new CopperArmorItem(ArmorItem.Type.BOOTS));

        ItemRegister.register(Constants.Armor.IRONCOPPER_HELMET, () -> new IronCopperArmorItem(ArmorItem.Type.HELMET));
        ItemRegister.register(Constants.Armor.IRONCOPPER_CHESTPLATE, () -> new IronCopperArmorItem(ArmorItem.Type.CHESTPLATE));
        ItemRegister.register(Constants.Armor.IRONCOPPER_LEGGINGS, () -> new IronCopperArmorItem(ArmorItem.Type.LEGGINGS));
        ItemRegister.register(Constants.Armor.IRONCOPPER_BOOTS, () -> new IronCopperArmorItem(ArmorItem.Type.BOOTS));

        ItemRegister.register();
    }
}
