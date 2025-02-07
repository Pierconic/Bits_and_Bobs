package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class DungeonAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		boolean water = false;
		double sy = 0;
		double found2 = 0;
		double sx = 0;
		double sz = 0;
		double oy = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.DO_CUSTOM_STRUCTURES)) {
				oy = 52;
				found = false;
				while (!found && oy < 116) {
					sx = 0;
					found = false;
					water = false;
					found2 = 0;
					for (int index1 = 0; index1 < 9; index1++) {
						sy = 0;
						for (int index2 = 0; index2 < 9; index2++) {
							sz = 0;
							for (int index3 = 0; index3 < 9; index3++) {
								if ((world.getBlockState(BlockPos.containing(x + sx, oy + sy, z + sz))).getBlock() == Blocks.AIR) {
									found = true;
								} else if (world.getBlockState(BlockPos.containing(x + sx, oy + sy, z + sz)).canOcclude()) {
									found2 = found2 + 1;
								} else if ((world.getBlockState(BlockPos.containing(x + sx, oy + sy, z + sz))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + sx, oy + sy, z + sz))).getBlock() == Blocks.OAK_PLANKS
										|| (world.getBlockState(BlockPos.containing(x + sx, oy + sy, z + sz))).getBlock() == Blocks.STONE_BRICKS) {
									water = true;
								}
								sz = sz + 1;
							}
							sy = sy + 1;
						}
						sx = sx + 1;
					}
					if (found == true && found2 >= 200 && water == false) {
						if (world.getBlockState(BlockPos.containing(x + 9, oy, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, oy + 9, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, oy, z + 9)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x + 9, oy - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, oy - 1, z)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x, oy - 1, z + 9)).canOcclude()) {
							GenblockA1UpdateTickProcedure.execute(world, x, oy, z);
						}
					} else {
						oy = oy - 16;
					}
				}
			}
		}
	}
}
