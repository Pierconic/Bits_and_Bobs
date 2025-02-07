package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GenblockK2PickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.RED_CONCRETE) {
			GenblockK2BuildProcedure.execute(world, x, y, z);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.ORANGE_CONCRETE) {
			GenblockK290Procedure.execute(world, x, y, z);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.YELLOW_CONCRETE) {
			GenblockK2180Procedure.execute(world, x, y, z);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LIME_CONCRETE) {
			GenblockK2270Procedure.execute(world, x, y, z);
		}
	}
}
