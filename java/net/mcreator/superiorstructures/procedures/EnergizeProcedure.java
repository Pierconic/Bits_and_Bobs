package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class EnergizeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (x > -80 && x < 80 || z > -80 && z < 80) {
			world.setBlock(BlockPos.containing(x, y, z), (world.getBlockState(BlockPos.containing(x, y + 1, z))), 3);
		} else {
			if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.DO_CUSTOM_STRUCTURES) == true) {
				world.scheduleTick(BlockPos.containing(x, y, z), world.getBlockState(BlockPos.containing(x, y, z)).getBlock(), Mth.nextInt(RandomSource.create(), 1, 5));
			} else {
				world.setBlock(BlockPos.containing(x, y, z), (world.getBlockState(BlockPos.containing(x, y + 1, z))), 3);
			}
		}
	}
}
