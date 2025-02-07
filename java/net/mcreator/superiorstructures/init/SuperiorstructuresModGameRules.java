
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.superiorstructures.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.GameRules;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SuperiorstructuresModGameRules {
	public static GameRules.Key<GameRules.BooleanValue> DO_CUSTOM_STRUCTURES;
	public static GameRules.Key<GameRules.BooleanValue> TICK_GENBLOCKS;
	public static GameRules.Key<GameRules.IntegerValue> ENDERPORTER_COST;
	public static GameRules.Key<GameRules.IntegerValue> DUNGEON_FREQUENCY;
	public static GameRules.Key<GameRules.IntegerValue> SWAMP_HUT_FREQUENCY;
	public static GameRules.Key<GameRules.IntegerValue> IGLOO_FREQUENCY;
	public static GameRules.Key<GameRules.IntegerValue> PORTAL_FREQUENCY;
	public static GameRules.Key<GameRules.IntegerValue> TOWER_FREQUENCY;
	public static GameRules.Key<GameRules.IntegerValue> VILLAGE_FREQUENCY;
	public static GameRules.Key<GameRules.IntegerValue> SHIPWRECK_FREQUENCY;
	public static GameRules.Key<GameRules.IntegerValue> MANSION_FREQUENCY;
	public static GameRules.Key<GameRules.IntegerValue> RUIN_FREQUENCY;
	public static GameRules.Key<GameRules.IntegerValue> MINESHAFT_FREQUENCY;
	public static GameRules.Key<GameRules.IntegerValue> TEMPLE_FREQUENCY;
	public static GameRules.Key<GameRules.BooleanValue> ALLOW_GHOSTING;
	public static GameRules.Key<GameRules.IntegerValue> PYRAMID_FREQUENCY;
	public static GameRules.Key<GameRules.IntegerValue> MIN_STRUCTURE_DISTANCE;
	public static GameRules.Key<GameRules.IntegerValue> MONUMENT_FREQUENCY;
	public static GameRules.Key<GameRules.BooleanValue> DEBUG_MODE;
	public static GameRules.Key<GameRules.IntegerValue> OCEAN_RUIN_FREQUENCY;
	public static GameRules.Key<GameRules.IntegerValue> BASTION_FREQUENCY;
	public static GameRules.Key<GameRules.BooleanValue> LIGHTNING_SHOCK_DAMAGE;

	@SubscribeEvent
	public static void registerGameRules(FMLCommonSetupEvent event) {
		DO_CUSTOM_STRUCTURES = GameRules.register("doCustomStructures", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
		TICK_GENBLOCKS = GameRules.register("tickGenblocks", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
		ENDERPORTER_COST = GameRules.register("enderporterCost", GameRules.Category.MISC, GameRules.IntegerValue.create(48));
		DUNGEON_FREQUENCY = GameRules.register("dungeonFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(50));
		SWAMP_HUT_FREQUENCY = GameRules.register("swampHutFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(50));
		IGLOO_FREQUENCY = GameRules.register("iglooFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(50));
		PORTAL_FREQUENCY = GameRules.register("portalFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(50));
		TOWER_FREQUENCY = GameRules.register("towerFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(50));
		VILLAGE_FREQUENCY = GameRules.register("villageFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(50));
		SHIPWRECK_FREQUENCY = GameRules.register("shipwreckFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(50));
		MANSION_FREQUENCY = GameRules.register("mansionFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(50));
		RUIN_FREQUENCY = GameRules.register("ruinFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(50));
		MINESHAFT_FREQUENCY = GameRules.register("mineshaftFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(50));
		TEMPLE_FREQUENCY = GameRules.register("templeFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(50));
		ALLOW_GHOSTING = GameRules.register("allowGhosting", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
		PYRAMID_FREQUENCY = GameRules.register("pyramidFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(50));
		MIN_STRUCTURE_DISTANCE = GameRules.register("minStructureDistance", GameRules.Category.MISC, GameRules.IntegerValue.create(85));
		MONUMENT_FREQUENCY = GameRules.register("monumentFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(50));
		DEBUG_MODE = GameRules.register("debugMode", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
		OCEAN_RUIN_FREQUENCY = GameRules.register("oceanRuinFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(20));
		BASTION_FREQUENCY = GameRules.register("bastionFrequency", GameRules.Category.MISC, GameRules.IntegerValue.create(50));
		LIGHTNING_SHOCK_DAMAGE = GameRules.register("lightningShockDamage", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	}
}
