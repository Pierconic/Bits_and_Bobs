package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class GenblockC1InstigateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.SNOW.defaultBlockState(), 3);
			if (Math.random() <= (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.IGLOO_FREQUENCY)) * 0.01) {
				SuperiorstructuresMod.queueServerWork(Mth.nextInt(RandomSource.create(), 11, 20), () -> {
					if (VillageScannerProcedure.execute(world, x, z) == false) {
						GenblockC1BuildProcedure.execute(world, x, y, z);
					}
				});
			}
		}
	}
}
