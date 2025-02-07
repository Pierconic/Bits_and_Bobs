package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class TreeFellingTestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		SuperiorstructuresMod.queueServerWork(40, () -> {
			DelayedTreeFellingTestProcedure.execute(world, x, y, z);
		});
	}
}
