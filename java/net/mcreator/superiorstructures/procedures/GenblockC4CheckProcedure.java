package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GenblockC4CheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			if (world.getBlockState(BlockPos.containing(x + 8, y - 12, z + 8)).canOcclude() && world.getBlockState(BlockPos.containing(x - 8, y - 12, z - 8)).canOcclude() && world.getBlockState(BlockPos.containing(x - 8, y - 12, z + 8)).canOcclude()
					&& world.getBlockState(BlockPos.containing(x + 8, y - 12, z - 8)).canOcclude() && world.getBlockState(BlockPos.containing(x + 8, y - 24, z + 8)).canOcclude()
					&& world.getBlockState(BlockPos.containing(x - 8, y - 24, z - 8)).canOcclude() && world.getBlockState(BlockPos.containing(x - 8, y - 24, z + 8)).canOcclude()
					&& world.getBlockState(BlockPos.containing(x + 8, y - 24, z - 8)).canOcclude() && Math.random() < 0.6) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.GENBLOCK_C_5.get().defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
				if (world.isEmptyBlock(BlockPos.containing(x + 1, y + 1, z)) || (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.CRAFTING_TABLE
						|| (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
					world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.SNOW_BLOCK.defaultBlockState(), 3);
				}
				if (world.isEmptyBlock(BlockPos.containing(x - 1, y + 1, z)) || (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.CRAFTING_TABLE
						|| (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
					world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.SNOW_BLOCK.defaultBlockState(), 3);
				}
				if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z - 1)) || (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.CRAFTING_TABLE
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
					world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.SNOW_BLOCK.defaultBlockState(), 3);
				}
				if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z + 1)) || (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.CRAFTING_TABLE
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
					world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.SNOW_BLOCK.defaultBlockState(), 3);
				}
			}
		}
	}
}
