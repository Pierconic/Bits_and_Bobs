
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiorstructures.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.core.registries.Registries;

import net.mcreator.superiorstructures.world.features.VillageFeature;
import net.mcreator.superiorstructures.world.features.TaigaVillageFrequencyFeature;
import net.mcreator.superiorstructures.world.features.SwampHutFeature;
import net.mcreator.superiorstructures.world.features.SuspiciousStoneNaturalGenFeature;
import net.mcreator.superiorstructures.world.features.SuspiciousStoneNaturalGen2Feature;
import net.mcreator.superiorstructures.world.features.SuspiciousSandNaturalGenFeature;
import net.mcreator.superiorstructures.world.features.SuspiciousNetherrackNaturalGenFeature;
import net.mcreator.superiorstructures.world.features.SuspiciousNetherrackNaturalGen2Feature;
import net.mcreator.superiorstructures.world.features.SuspiciousEndStoneGenFeature;
import net.mcreator.superiorstructures.world.features.SuspiciousDirtNaturalGenFeature;
import net.mcreator.superiorstructures.world.features.SuspiciousDeepslateNaturalGenFeature;
import net.mcreator.superiorstructures.world.features.ShipwreckFeature;
import net.mcreator.superiorstructures.world.features.RuinFeature;
import net.mcreator.superiorstructures.world.features.PoisonIvyPatchFeature;
import net.mcreator.superiorstructures.world.features.PlainPortalFeature;
import net.mcreator.superiorstructures.world.features.OutpostFeature;
import net.mcreator.superiorstructures.world.features.Outpost2Feature;
import net.mcreator.superiorstructures.world.features.MushroomSurfaceFeature;
import net.mcreator.superiorstructures.world.features.MushroomInfernalFeature;
import net.mcreator.superiorstructures.world.features.MonsterRoomFeature;
import net.mcreator.superiorstructures.world.features.MineshaftFeature;
import net.mcreator.superiorstructures.world.features.LushLichenFeature;
import net.mcreator.superiorstructures.world.features.LushLichen2Feature;
import net.mcreator.superiorstructures.world.features.LichenSurfaceFeature;
import net.mcreator.superiorstructures.world.features.IglooFeature;
import net.mcreator.superiorstructures.world.features.ForestPortalFeature;
import net.mcreator.superiorstructures.world.features.DesertPortalFeature;
import net.mcreator.superiorstructures.world.features.BrambleSurfaceFeature;
import net.mcreator.superiorstructures.world.features.AlternatePortalFeature;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class SuperiorstructuresModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(Registries.FEATURE, SuperiorstructuresMod.MODID);
	public static final DeferredHolder<Feature<?>, Feature<?>> MONSTER_ROOM = REGISTRY.register("monster_room", MonsterRoomFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> DESERT_PORTAL = REGISTRY.register("desert_portal", DesertPortalFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> FOREST_PORTAL = REGISTRY.register("forest_portal", ForestPortalFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> IGLOO = REGISTRY.register("igloo", IglooFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SWAMP_HUT = REGISTRY.register("swamp_hut", SwampHutFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> PLAIN_PORTAL = REGISTRY.register("plain_portal", PlainPortalFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> OUTPOST = REGISTRY.register("outpost", OutpostFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> OUTPOST_2 = REGISTRY.register("outpost_2", Outpost2Feature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SHIPWRECK = REGISTRY.register("shipwreck", ShipwreckFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> VILLAGE = REGISTRY.register("village", VillageFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> TAIGA_VILLAGE_FREQUENCY = REGISTRY.register("taiga_village_frequency", TaigaVillageFrequencyFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> MINESHAFT = REGISTRY.register("mineshaft", MineshaftFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> LICHEN_SURFACE = REGISTRY.register("lichen_surface", LichenSurfaceFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> MUSHROOM_SURFACE = REGISTRY.register("mushroom_surface", MushroomSurfaceFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> BRAMBLE_SURFACE = REGISTRY.register("bramble_surface", BrambleSurfaceFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SUSPICIOUS_DIRT_NATURAL_GEN = REGISTRY.register("suspicious_dirt_natural_gen", SuspiciousDirtNaturalGenFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SUSPICIOUS_STONE_NATURAL_GEN = REGISTRY.register("suspicious_stone_natural_gen", SuspiciousStoneNaturalGenFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SUSPICIOUS_STONE_NATURAL_GEN_2 = REGISTRY.register("suspicious_stone_natural_gen_2", SuspiciousStoneNaturalGen2Feature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SUSPICIOUS_DEEPSLATE_NATURAL_GEN = REGISTRY.register("suspicious_deepslate_natural_gen", SuspiciousDeepslateNaturalGenFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SUSPICIOUS_SAND_NATURAL_GEN = REGISTRY.register("suspicious_sand_natural_gen", SuspiciousSandNaturalGenFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SUSPICIOUS_END_STONE_GEN = REGISTRY.register("suspicious_end_stone_gen", SuspiciousEndStoneGenFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SUSPICIOUS_NETHERRACK_NATURAL_GEN = REGISTRY.register("suspicious_netherrack_natural_gen", SuspiciousNetherrackNaturalGenFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> SUSPICIOUS_NETHERRACK_NATURAL_GEN_2 = REGISTRY.register("suspicious_netherrack_natural_gen_2", SuspiciousNetherrackNaturalGen2Feature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> POISON_IVY_PATCH = REGISTRY.register("poison_ivy_patch", PoisonIvyPatchFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> LUSH_LICHEN = REGISTRY.register("lush_lichen", LushLichenFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> LUSH_LICHEN_2 = REGISTRY.register("lush_lichen_2", LushLichen2Feature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> MUSHROOM_INFERNAL = REGISTRY.register("mushroom_infernal", MushroomInfernalFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> ALTERNATE_PORTAL = REGISTRY.register("alternate_portal", AlternatePortalFeature::new);
	public static final DeferredHolder<Feature<?>, Feature<?>> RUIN = REGISTRY.register("ruin", RuinFeature::new);
}
