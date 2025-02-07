package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class FulguriteActivateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().isThundering()) {
			world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.ACTIVE_FULGURITE.get().defaultBlockState(), 3);
		}
	}
}
