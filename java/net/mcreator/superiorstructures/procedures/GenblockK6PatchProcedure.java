package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GenblockK6PatchProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		boolean found = false;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Math.random() < 0.5 || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.RED_CONCRETE) {
				if (Math.random() < 0.3 || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.RED_CONCRETE) {
					sx = -3;
					found = false;
					for (int index0 = 0; index0 < 7; index0++) {
						sy = -3;
						for (int index1 = 0; index1 < 7; index1++) {
							sz = -3;
							for (int index2 = 0; index2 < 7; index2++) {
								if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:sand_replaceable"))) || world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz))
										&& (world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy + 1, z + sz)).canOcclude() && !(Blocks.SAND == (world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy + 1, z + sz))).getBlock())
												|| world.getBlockState(BlockPos.containing(x + sx + 1, y + sy + 1, z + sz)).canOcclude() && !(Blocks.SAND == (world.getBlockState(BlockPos.containing(x + sx + 1, y + sy + 1, z + sz))).getBlock())
												|| world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz + 1)).canOcclude() && !(Blocks.SAND == (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz + 1))).getBlock())
												|| world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, (z + sz) - 1)).canOcclude()
														&& !(Blocks.SAND == (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, (z + sz) - 1))).getBlock()))) {
									if (Math.abs(sz) <= 1 && Math.abs(sy) <= 1 && Math.abs(sx) <= 1) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SINKING_SAND.get().defaultBlockState(), 3);
									} else if (Math.abs(sz) <= 2 && Math.abs(sy) <= 2 && Math.abs(sx) <= 2 && Math.random() < 0.3) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SINKING_SAND.get().defaultBlockState(), 3);
									} else if ((Math.abs(sz) <= 3 || Math.abs(sy) <= 3 || Math.abs(sx) <= 3) && Math.random() < 0.15) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SINKING_SAND.get().defaultBlockState(), 3);
									}
								}
								sz = sz + 1;
							}
							sy = sy + 1;
						}
						sx = sx + 1;
					}
				} else {
					sx = -3;
					found = false;
					for (int index3 = 0; index3 < 7; index3++) {
						sy = -3;
						for (int index4 = 0; index4 < 7; index4++) {
							sz = -3;
							for (int index5 = 0; index5 < 7; index5++) {
								if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:sand_replaceable"))) || world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz))
										&& (world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy + 1, z + sz)).canOcclude() && !(Blocks.SAND == (world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy + 1, z + sz))).getBlock())
												|| world.getBlockState(BlockPos.containing(x + sx + 1, y + sy + 1, z + sz)).canOcclude() && !(Blocks.SAND == (world.getBlockState(BlockPos.containing(x + sx + 1, y + sy + 1, z + sz))).getBlock())
												|| world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz + 1)).canOcclude() && !(Blocks.SAND == (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz + 1))).getBlock())
												|| world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, (z + sz) - 1)).canOcclude()
														&& !(Blocks.SAND == (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, (z + sz) - 1))).getBlock()))) {
									if (Math.abs(sz) <= 1 && Math.abs(sy) <= 1 && Math.abs(sx) <= 1) {
										if (Math.random() < 0.1) {
											world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.PYRAMID_SAND.get().defaultBlockState(), 3);
										} else {
											world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SAND.defaultBlockState(), 3);
										}
									} else if (Math.abs(sz) <= 2 && Math.abs(sy) <= 2 && Math.abs(sx) <= 2 && Math.random() < 0.3) {
										if (Math.random() < 0.1) {
											world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.PYRAMID_SAND.get().defaultBlockState(), 3);
										} else {
											world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SAND.defaultBlockState(), 3);
										}
									} else if ((Math.abs(sz) <= 3 || Math.abs(sy) <= 3 || Math.abs(sx) <= 3) && Math.random() < 0.15) {
										if (Math.random() < 0.1) {
											world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.PYRAMID_SAND.get().defaultBlockState(), 3);
										} else {
											world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SAND.defaultBlockState(), 3);
										}
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
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
