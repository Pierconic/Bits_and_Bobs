package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SusDeepslateGenConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (y < 0) {
			sx = -4;
			for (int index0 = 0; index0 < 8; index0++) {
				sy = -4;
				for (int index1 = 0; index1 < 8; index1++) {
					sz = -4;
					for (int index2 = 0; index2 < 8; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR) {
							return true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
		}
		return false;
	}
}
