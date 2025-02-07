package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class NetherPortalConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (world.isEmptyBlock(BlockPos.containing(x, y, z)) && VillageScannerProcedure.execute(world, x, z) == false && ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.NETHERRACK
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.SOUL_SAND || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.SOUL_SOIL)) {
			return true;
		}
		return false;
	}
}
