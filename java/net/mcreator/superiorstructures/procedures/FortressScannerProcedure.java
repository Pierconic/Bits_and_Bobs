package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class FortressScannerProcedure {
	public static boolean execute(LevelAccessor world, double x, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -30;
		found = false;
		for (int index0 = 0; index0 < 20; index0++) {
			sy = -10;
			for (int index1 = 0; index1 < 5; index1++) {
				sz = -30;
				for (int index2 = 0; index2 < 20; index2++) {
					if (found == false) {
						if ((world.getBlockState(BlockPos.containing(x + sx, 30 + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:structure_blockable")))) {
							found = true;
						}
					}
					sz = sz + 3;
				}
				sy = sy + 5;
			}
			sx = sx + 3;
		}
		if (found == true) {
			return true;
		}
		return false;
	}
}
