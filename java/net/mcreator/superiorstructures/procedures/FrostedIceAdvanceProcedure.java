package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class FrostedIceAdvanceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_1.get()) {
			world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_2.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_2.get()) {
			world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_3.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_3.get()) {
			world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_4.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_4.get()) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER
					|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER
					|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
			}
		}
	}
}
