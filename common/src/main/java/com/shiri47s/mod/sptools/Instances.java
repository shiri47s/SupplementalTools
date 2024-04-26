package com.shiri47s.mod.sptools;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.Objects;

import static com.shiri47s.mod.sptools.Constants.MOD_ID;

public class Instances {
    public static class Effect {
        public static final StatusEffect KNOCKBACK_RESISTANCE = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.KNOCKBACK_RESISTANCE)));
        public static final StatusEffect ATTACK_KNOCKBACK = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.ATTACK_KNOCKBACK)));
        public static final StatusEffect MOVEMENT_SPEED = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.MOVEMENT_SPEED)));
        public static final StatusEffect HASTE_AND_LUCK = Objects.requireNonNull(Registries.STATUS_EFFECT.get(new Identifier(MOD_ID, Constants.Effect.HASTE_AND_LUCK)));
    }

    public static class Item {
        public static final net.minecraft.item.Item AMETHYST_INGOT = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Item.AMETHYST_INGOT)));
        public static final net.minecraft.item.Item EMERALD_INGOT = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Item.EMERALD_INGOT)));
        public static final net.minecraft.item.Item LEAD_INGOT = Objects.requireNonNull(Registries.ITEM.get(new Identifier(MOD_ID, Constants.Item.LEAD_INGOT)));
    }
}
