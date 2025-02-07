
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiorstructures.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class SuperiorstructuresModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, SuperiorstructuresMod.MODID);
	public static final DeferredHolder<Potion, Potion> DECAY = REGISTRY.register("decay", () -> new Potion(new MobEffectInstance(MobEffects.WITHER, 2200, 0, false, true)));
	public static final DeferredHolder<Potion, Potion> SHOCKING_POTION = REGISTRY.register("shocking_potion", () -> new Potion(new MobEffectInstance(SuperiorstructuresModMobEffects.SHOCK, 2200, 0, false, true)));
}
