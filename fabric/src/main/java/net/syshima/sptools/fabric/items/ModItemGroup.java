package net.syshima.sptools.fabric.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.syshima.sptools.Constants;
import net.syshima.sptools.ModItems;

public class ModItemGroup {
    public static final RegistryKey<net.minecraft.item.ItemGroup> MOD_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(Constants.MOD_ID, Constants.GROUP_NAME));

    public static void registerItemGroup() {
        Registry.register(Registries.ITEM_GROUP, MOD_GROUP, FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModItems.AMETHYST_INGOT))
                .displayName(Text.translatable("item.sptools"))
                .build());
    }
}
