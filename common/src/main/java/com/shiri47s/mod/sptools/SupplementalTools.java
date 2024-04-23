package com.shiri47s.mod.sptools;

public class SupplementalTools
{
	public static final String MOD_ID = Constants.MOD_ID;

	public static void init() {
		ItemModelGenerator.generate();
		BlockItemModelGenerator.generate();
		ToolItemModelGenerator.generate();
		EventGenerator.generate();
		EffectGenerator.generate();
	}
}
