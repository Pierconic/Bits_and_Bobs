package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class VillageScannerProcedure {
	public static boolean execute(LevelAccessor world, double x, double z) {
		boolean found = false;
		double sx = 0;
		double sz = 0;
		sx = (-1) * (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.MIN_STRUCTURE_DISTANCE));
		found = false;
		for (int index0 = 0; index0 < (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.MIN_STRUCTURE_DISTANCE)); index0++) {
			sz = (-1) * (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.MIN_STRUCTURE_DISTANCE));
			for (int index1 = 0; index1 < (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.MIN_STRUCTURE_DISTANCE)); index1++) {
				if (found == false) {
					if ((world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:structure_blockable")))) {
						found = true;
					}
				}
				sz = sz + 2;
			}
			sx = sx + 2;
		}
		if (found == true) {
			return true;
		}
		return false;
	}
}
