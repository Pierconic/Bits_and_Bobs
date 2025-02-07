package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class GenblockB1InstigateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			GenblockSwapperProcedure.execute(world, x, y, z);
			if (Math.random() <= (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.SWAMP_HUT_FREQUENCY)) * 0.01) {
				SuperiorstructuresMod.queueServerWork(Mth.nextInt(RandomSource.create(), 11, 20), () -> {
					if (VillageScannerProcedure.execute(world, x, z) == false) {
						GenblockB1UpdateTickProcedure.execute(world, x, y, z);
					}
				});
			}
		}
	}
}
