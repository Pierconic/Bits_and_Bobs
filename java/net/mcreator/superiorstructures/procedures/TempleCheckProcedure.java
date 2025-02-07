package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class TempleCheckProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sz = 0;
		double tolerance = 0;
		tolerance = 0;
		sx = -10;
		for (int index0 = 0; index0 < 64; index0++) {
			sz = -10;
			for (int index1 = 0; index1 < 64; index1++) {
				if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + sx, y - 14, z + sz))) {
					tolerance = tolerance + 1;
				}
				sz = sz + 1;
			}
			sx = sx + 1;
		}
		if (tolerance <= 70) {
			return true;
		}
		return false;
	}
}
