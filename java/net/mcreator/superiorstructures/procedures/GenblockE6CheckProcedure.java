package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class GenblockE6CheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		SuperiorstructuresMod.queueServerWork(Mth.nextInt(RandomSource.create(), 1, 10), () -> {
			if (MiniVillageScannerProcedure.execute(world, x, y, z) == false) {
				GenblockE6BuildProcedure.execute(world, x, y, z);
			}
		});
	}
}
