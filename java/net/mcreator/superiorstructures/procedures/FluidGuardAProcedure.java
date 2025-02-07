package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class FluidGuardAProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LAVA) {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.LAVA) {
				world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.LAVA) {
				world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.LAVA) {
				world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.STONE_BRICKS.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.LAVA) {
				world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.STONE_BRICKS.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.OAK_PLANKS.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.OAK_PLANKS.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.OAK_PLANKS.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.OAK_PLANKS.defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.OAK_PLANKS.defaultBlockState(), 3);
			}
		}
	}
}
