package net.syshima.sptools.base;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.syshima.sptools.Constants;

public abstract class ModStatusEffect extends StatusEffect {
    protected ModStatusEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    protected Identifier attrId(String attributeName) {
        return Identifier.of(Constants.MOD_ID, attributeName);
    }
}
