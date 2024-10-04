package com.shiri47s.mod.sptools;

import com.shiri47s.mod.sptools.tools.WorldGenerator;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.DeferredSupplier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;

public class SupplementalTools
{
	public static final String MOD_ID = Constants.MOD_ID;
	private static final DeferredRegister<ItemGroup> TAB_REGISTER = DeferredRegister.create(Constants.MOD_ID, RegistryKeys.ITEM_GROUP);
	public static DeferredSupplier<ItemGroup> TAB_SUPPLIER;

	public static void init() {
		TAB_SUPPLIER = TAB_REGISTER.register(Constants.MOD_ID, () -> CreativeTabRegistry.create(
				Text.translatable("item.sptools"),
				() -> new ItemStack(Instances.Item.AMETHYST_INGOT)));
		TAB_REGISTER.register();

		BlockItemModelGenerator.generate();
		ArmorItemModelGenerator.generate();
		ToolItemModelGenerator.generate();
		EventGenerator.generate();
		EffectGenerator.generate();
		WorldGenerator.generate();

		BlessingProvider.provide();
	}
}
