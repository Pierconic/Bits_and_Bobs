package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class SpikeSelectionProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		if (Math.random() < 0.7) {
			for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 2); index0++) {
				world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z), Blocks.ACACIA_LOG.defaultBlockState(), 3);
			}
		} else {
			for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 1, 2); index1++) {
				world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z), Blocks.STRIPPED_ACACIA_LOG.defaultBlockState(), 3);
			}
		}
		for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 1, 2); index2++) {
			world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z), Blocks.RED_SANDSTONE_WALL.defaultBlockState(), 3);
		}
		for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 1, 2); index3++) {
			world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z), Blocks.ACACIA_FENCE.defaultBlockState(), 3);
		}
		if (Math.random() < 0.3) {
			world.setBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z), Blocks.WHITE_BANNER.defaultBlockState(), 3);
		}
	}
}
