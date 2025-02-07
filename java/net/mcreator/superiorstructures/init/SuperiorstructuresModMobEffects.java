
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiorstructures.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.superiorstructures.procedures.HeartOfTheSeaSpawningProcedure;
import net.mcreator.superiorstructures.procedures.GeneralizedReinforcementSpawnerProcedure;
import net.mcreator.superiorstructures.potion.TowerCurseMobEffect;
import net.mcreator.superiorstructures.potion.ShockMobEffect;
import net.mcreator.superiorstructures.potion.RadianceMobEffect;
import net.mcreator.superiorstructures.potion.MonumentCurseMobEffect;
import net.mcreator.superiorstructures.potion.MansionCurseMobEffect;
import net.mcreator.superiorstructures.potion.FortressCurseMobEffect;
import net.mcreator.superiorstructures.potion.CorruptionMobEffect;
import net.mcreator.superiorstructures.potion.AscensionMobEffect;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

@EventBusSubscriber
public class SuperiorstructuresModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, SuperiorstructuresMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> SHOCK = REGISTRY.register("shock", () -> new ShockMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> ASCENSION = REGISTRY.register("ascension", () -> new AscensionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> RADIANCE = REGISTRY.register("radiance", () -> new RadianceMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> CORRUPTION = REGISTRY.register("corruption", () -> new CorruptionMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> MANSION_CURSE = REGISTRY.register("mansion_curse", () -> new MansionCurseMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TOWER_CURSE = REGISTRY.register("tower_curse", () -> new TowerCurseMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> MONUMENT_CURSE = REGISTRY.register("monument_curse", () -> new MonumentCurseMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> FORTRESS_CURSE = REGISTRY.register("fortress_curse", () -> new FortressCurseMobEffect());

	@SubscribeEvent
	public static void onEffectRemoved(MobEffectEvent.Remove event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	@SubscribeEvent
	public static void onEffectExpired(MobEffectEvent.Expired event) {
		MobEffectInstance effectInstance = event.getEffectInstance();
		if (effectInstance != null) {
			expireEffects(event.getEntity(), effectInstance);
		}
	}

	private static void expireEffects(Entity entity, MobEffectInstance effectInstance) {
		if (effectInstance.getEffect().is(MANSION_CURSE)) {
			GeneralizedReinforcementSpawnerProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effectInstance.getEffect().is(TOWER_CURSE)) {
			GeneralizedReinforcementSpawnerProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		} else if (effectInstance.getEffect().is(MONUMENT_CURSE)) {
			HeartOfTheSeaSpawningProcedure.execute(entity.level(), entity);
		} else if (effectInstance.getEffect().is(FORTRESS_CURSE)) {
			GeneralizedReinforcementSpawnerProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		}
	}
}
