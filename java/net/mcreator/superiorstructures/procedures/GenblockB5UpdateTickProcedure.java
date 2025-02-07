package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class GenblockB5UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean stop = false;
		double height = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			height = 1;
			while (stop == false) {
				if ((world.getFluidState(BlockPos.containing(x, y - height, z)).createLegacyBlock()).getBlock() == Blocks.WATER || (world.getFluidState(BlockPos.containing(x, y - height, z)).createLegacyBlock()).getBlock() == Blocks.WATER) {
					if (height >= 12) {
						world.setBlock(BlockPos.containing(x, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
						if (Math.random() < 0.7) {
							world.setBlock(BlockPos.containing(x - 1, y - height, z - 1), Blocks.COBBLESTONE_WALL.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x - 1, y - height, z - 1), Blocks.MOSSY_COBBLESTONE_WALL.defaultBlockState(), 3);
						}
						if (Math.random() < 0.7) {
							world.setBlock(BlockPos.containing(x + 1, y - height, z + 1), Blocks.COBBLESTONE_WALL.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x + 1, y - height, z + 1), Blocks.MOSSY_COBBLESTONE_WALL.defaultBlockState(), 3);
						}
						if (Math.random() < 0.7) {
							world.setBlock(BlockPos.containing(x - 1, y - height, z + 1), Blocks.COBBLESTONE_WALL.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x - 1, y - height, z + 1), Blocks.MOSSY_COBBLESTONE_WALL.defaultBlockState(), 3);
						}
						if (Math.random() < 0.7) {
							world.setBlock(BlockPos.containing(x + 1, y - height, z - 1), Blocks.COBBLESTONE_WALL.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x + 1, y - height, z - 1), Blocks.MOSSY_COBBLESTONE_WALL.defaultBlockState(), 3);
						}
						if (Math.random() < 0.7) {
							world.setBlock(BlockPos.containing(x - 1, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x - 1, y - height, z), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
						}
						if (Math.random() < 0.7) {
							world.setBlock(BlockPos.containing(x + 1, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x + 1, y - height, z), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
						}
						if (Math.random() < 0.7) {
							world.setBlock(BlockPos.containing(x, y - height, z + 1), Blocks.COBBLESTONE.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x, y - height, z + 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
						}
						if (Math.random() < 0.7) {
							world.setBlock(BlockPos.containing(x, y - height, z - 1), Blocks.COBBLESTONE.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x, y - height, z - 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
						}
					} else if (height >= 7) {
						world.setBlock(BlockPos.containing(x, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
						if (Math.random() < 0.7) {
							world.setBlock(BlockPos.containing(x - 1, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x - 1, y - height, z), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
						}
						if (Math.random() < 0.7) {
							world.setBlock(BlockPos.containing(x + 1, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x + 1, y - height, z), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
						}
						if (Math.random() < 0.7) {
							world.setBlock(BlockPos.containing(x, y - height, z + 1), Blocks.COBBLESTONE.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x, y - height, z + 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
						}
						if (Math.random() < 0.7) {
							world.setBlock(BlockPos.containing(x, y - height, z - 1), Blocks.COBBLESTONE.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x, y - height, z - 1), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
						}
					} else {
						world.setBlock(BlockPos.containing(x, y - height, z), Blocks.OAK_LOG.defaultBlockState(), 3);
					}
				} else if (!world.getBlockState(BlockPos.containing(x, y - height, z)).canOcclude()) {
					if (height >= 12) {
						world.setBlock(BlockPos.containing(x, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x - 1, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y - height, z + 1), Blocks.COBBLESTONE.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x + 1, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y - height, z - 1), Blocks.COBBLESTONE.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x - 1, y - height, z - 1), Blocks.COBBLESTONE_WALL.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x + 1, y - height, z + 1), Blocks.COBBLESTONE_WALL.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x - 1, y - height, z + 1), Blocks.COBBLESTONE_WALL.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x + 1, y - height, z - 1), Blocks.COBBLESTONE_WALL.defaultBlockState(), 3);
					} else if (height >= 7) {
						world.setBlock(BlockPos.containing(x, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x - 1, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x + 1, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y - height, z + 1), Blocks.COBBLESTONE.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(x, y - height, z - 1), Blocks.COBBLESTONE.defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y - height, z), Blocks.STRIPPED_OAK_LOG.defaultBlockState(), 3);
					}
				} else if (world.getBlockState(BlockPos.containing(x, y - height, z)).canOcclude()) {
					world.setBlock(BlockPos.containing(x, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - height, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - height, z + 1), Blocks.COBBLESTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - height, z - 1), Blocks.COBBLESTONE.defaultBlockState(), 3);
					stop = true;
				}
				height = height + 1;
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.COBBLESTONE.defaultBlockState(), 3);
		}
	}
}
