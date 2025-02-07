package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class NetherPortalAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sy = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.DO_CUSTOM_STRUCTURES)) {
				sy = 12;
				found = false;
				while (!found && sy < 128) {
					if (world.isEmptyBlock(BlockPos.containing(x, y - sy + 1, z)) && world.isEmptyBlock(BlockPos.containing(x, y - sy + 6, z)) && ((world.getBlockState(BlockPos.containing(x, y - sy, z))).getBlock() == Blocks.NETHERRACK
							|| (world.getBlockState(BlockPos.containing(x, y - sy, z))).getBlock() == Blocks.SOUL_SAND || (world.getBlockState(BlockPos.containing(x, y - sy, z))).getBlock() == Blocks.SOUL_SOIL)) {
						found = true;
						if (MiniVillageScannerProcedure.execute(world, x, y, z)) {
							GenblockD1BuildProcedure.execute(world, x, y - sy + 1, z);
						}
					} else {
						sy = sy + 1;
					}
				}
			}
		}
	}
}
