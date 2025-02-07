package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class FrostageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double type = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			sx = -6;
			for (int index0 = 0; index0 < 12; index0++) {
				sy = -6;
				for (int index1 = 0; index1 < 12; index1++) {
					sz = -6;
					for (int index2 = 0; index2 < 12; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER
								&& (world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz)).canOcclude() || world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz)).canOcclude()
										|| world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)).canOcclude() || world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1)).canOcclude())
								&& !world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz)) && Math.random() < 0.03) {
							type = Mth.nextInt(RandomSource.create(), 0, 1);
							if (type == 0) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.ICE.defaultBlockState(), 3);
							} else if (type == 1) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.PACKED_ICE.defaultBlockState(), 3);
							}
							if (Math.random() < 0.5) {
								world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.ICE.defaultBlockState(), 3);
								if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx, y + sy + 2, z + sz), Blocks.ICE.defaultBlockState(), 3);
								}
							}
							if (Math.random() < 0.3) {
								world.setBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz), (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz), (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1), (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))), 3);
							}
							if (Math.random() < 0.3) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1), (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))), 3);
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
		}
	}
}
