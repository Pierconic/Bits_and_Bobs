package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GenblockNodeRightCheckProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double tolerance = 0;
		sx = -11;
		found = false;
		for (int index0 = 0; index0 < 16; index0++) {
			sy = 0;
			for (int index1 = 0; index1 < 8; index1++) {
				sz = 1;
				for (int index2 = 0; index2 < 16; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.LAVA) {
						tolerance = tolerance + 5;
					} else if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + sx, y + sy, z + sz))) {
						tolerance = tolerance + 1;
					} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:mineshaft_blockable")))) {
						found = true;
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		if (found == true || tolerance >= 55) {
			return false;
		}
		return true;
	}
}
