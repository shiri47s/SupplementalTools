package net.syshima.sptools.base;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.resources.Identifier;
import net.syshima.sptools.Constants;

public abstract class ModStatusEffect extends MobEffect {
    protected ModStatusEffect(MobEffectCategory category, int color) {
        super(category, color);
    }

    protected Identifier attrId(String attributeName) {
        return Identifier.fromNamespaceAndPath(Constants.MOD_ID, attributeName);
    }
}
