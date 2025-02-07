package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class GenblockG1InstigateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), (world.getBlockState(BlockPos.containing(x, y + 1, z))), 3);
			if (Math.random() <= (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.SHIPWRECK_FREQUENCY)) * 0.01) {
				if (y <= 65) {
					SuperiorstructuresMod.queueServerWork(Mth.nextInt(RandomSource.create(), 11, 20), () -> {
						if (VillageScannerProcedure.execute(world, x, z) == false) {
							GenblockG1BuildProcedure.execute(world, x, y, z);
						}
					});
				}
			}
		}
	}
}
