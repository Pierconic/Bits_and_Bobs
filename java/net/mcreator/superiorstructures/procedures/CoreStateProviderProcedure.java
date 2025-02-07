package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class CoreStateProviderProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.PULSING_CORE.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.POWER_CORE.get()) {
			return true;
		}
		return false;
	}
}
