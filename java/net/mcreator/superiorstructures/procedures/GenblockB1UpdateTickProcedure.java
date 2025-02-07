package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GenblockB1UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double elevation = 0;
		double sx = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			if ((world.getFluidState(BlockPos.containing(x + 1, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x - 1, y, z)).createLegacyBlock()).getBlock() == Blocks.WATER
					|| (world.getFluidState(BlockPos.containing(x, y, z - 1)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x, y, z + 1)).createLegacyBlock()).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
			if (VillageScannerProcedure.execute(world, x, z) == false) {
				sx = -10;
				found = false;
				elevation = 2;
				GenblockB6StakeProcedure.execute(world, x, y, z);
				for (int index0 = 0; index0 < 8; index0++) {
					if (found == false) {
						if ((world.getBlockState(BlockPos.containing(x, (y + elevation) - 1, z))).getBlock() == Blocks.AIR) {
							found = true;
						} else {
							elevation = elevation + 1;
						}
					}
				}
				if (found == true) {
					world.setBlock(BlockPos.containing(x, y + elevation, z), SuperiorstructuresModBlocks.GENBLOCK_B_2.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
