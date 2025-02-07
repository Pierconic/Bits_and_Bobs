package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class GenblockSwapperProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.GRASS_BLOCK) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
			if ((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.SNOW || (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.SNOW
					|| (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.SNOW || (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.SNOW) {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.SNOW.defaultBlockState(), 3);
			}
		} else {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
