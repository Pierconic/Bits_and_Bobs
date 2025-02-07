package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class GenblockA3InstigateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			GenblockA3UpdateTickProcedure.execute(world, x, y, z);
		}
	}
}
