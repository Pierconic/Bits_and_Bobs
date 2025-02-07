package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class LightningChargeDispenseSuccessfullyIfProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Direction direction) {
		if (direction == null)
			return false;
		if (direction == Direction.DOWN && world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
			return true;
		} else if (direction == Direction.UP && world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			return true;
		} else if (direction == Direction.NORTH && world.isEmptyBlock(BlockPos.containing(x, y, z - 1))) {
			return true;
		} else if (direction == Direction.SOUTH && world.isEmptyBlock(BlockPos.containing(x, y, z + 1))) {
			return true;
		} else if (direction == Direction.WEST && world.isEmptyBlock(BlockPos.containing(x - 1, y, z))) {
			return true;
		} else if (direction == Direction.EAST && world.isEmptyBlock(BlockPos.containing(x + 1, y, z))) {
			return true;
		}
		return false;
	}
}
