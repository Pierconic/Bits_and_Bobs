package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class FlowerPotCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.LAVA || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LAVA
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.LAVA || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.LAVA) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z + 0.5), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
