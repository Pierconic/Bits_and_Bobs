package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class DungeonGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double found2 = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		boolean found = false;
		boolean water = false;
		EnergizeProcedure.execute(world, x, y, z);
		if (y <= 50) {
			sx = 0;
			found = false;
			water = false;
			found2 = 0;
			for (int index0 = 0; index0 < 9; index0++) {
				sy = 0;
				for (int index1 = 0; index1 < 9; index1++) {
					sz = 0;
					for (int index2 = 0; index2 < 9; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR) {
							found = true;
						} else if (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).canOcclude()) {
							found2 = found2 + 1;
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.OAK_PLANKS
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STONE_BRICKS) {
							water = true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (found == true && found2 >= 200 && water == false) {
				if (world.getBlockState(BlockPos.containing(x + 9, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y + 9, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z + 9)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x + 9, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 9)).canOcclude()) {
					return true;
				}
			}
		}
		return false;
	}
}
