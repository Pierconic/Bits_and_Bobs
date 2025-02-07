package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GenblockJ3PickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.RED_CONCRETE) {
			GenblockJ3BuildProcedure.execute(world, x, y, z);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.ORANGE_CONCRETE) {
			GenblockJ390Procedure.execute(world, x, y, z);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.YELLOW_CONCRETE) {
			GenblockJ3180Procedure.execute(world, x, y, z);
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LIME_CONCRETE) {
			GenblockJ3270Procedure.execute(world, x, y, z);
		}
	}
}
