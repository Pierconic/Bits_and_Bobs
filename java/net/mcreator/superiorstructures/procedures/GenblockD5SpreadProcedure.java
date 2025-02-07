package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GenblockD5SpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean set = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Math.random() < 0.5) {
				sx = Mth.nextInt(RandomSource.create(), 4, 10);
			} else {
				sx = Mth.nextInt(RandomSource.create(), -10, -4);
			}
			if (Math.random() < 0.5) {
				sz = Mth.nextInt(RandomSource.create(), 4, 10);
			} else {
				sz = Mth.nextInt(RandomSource.create(), -10, -4);
			}
			sy = 3;
			set = false;
			while (set == false) {
				if (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).isFaceSturdy(world, BlockPos.containing(x + sx, (y + sy) - 1, z + sz), Direction.UP)
						&& !((world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.SNOW) && ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SHORT_GRASS || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SNOW)) {
					set = true;
					if (Math.random() < 0.3) {
						world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.OBSIDIAN.defaultBlockState(), 3);
						if (Math.random() < 0.05) {
							world.setBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz), Blocks.OBSIDIAN.defaultBlockState(), 3);
						} else if (Math.random() < 0.05) {
							world.setBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz), Blocks.OBSIDIAN.defaultBlockState(), 3);
						} else if (Math.random() < 0.05) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1), Blocks.OBSIDIAN.defaultBlockState(), 3);
						} else if (Math.random() < 0.05) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1), Blocks.OBSIDIAN.defaultBlockState(), 3);
						}
					} else {
						world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.CRYING_OBSIDIAN.defaultBlockState(), 3);
						if (Math.random() < 0.05) {
							world.setBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz), Blocks.CRYING_OBSIDIAN.defaultBlockState(), 3);
						} else if (Math.random() < 0.05) {
							world.setBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz), Blocks.CRYING_OBSIDIAN.defaultBlockState(), 3);
						} else if (Math.random() < 0.05) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1), Blocks.CRYING_OBSIDIAN.defaultBlockState(), 3);
						} else if (Math.random() < 0.05) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1), Blocks.CRYING_OBSIDIAN.defaultBlockState(), 3);
						}
					}
				} else if (!((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR)) {
					set = true;
				} else {
					sy = sy - 1;
				}
			}
			for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 2, 4); index1++) {
				if (Math.random() < 0.5) {
					sx = Mth.nextInt(RandomSource.create(), 4, 12);
				} else {
					sx = Mth.nextInt(RandomSource.create(), -12, -4);
				}
				if (Math.random() < 0.5) {
					sz = Mth.nextInt(RandomSource.create(), 4, 12);
				} else {
					sz = Mth.nextInt(RandomSource.create(), -12, -4);
				}
				sy = 3;
				set = false;
				while (set == false) {
					if (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).canOcclude() && !((world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.SNOW)
							&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SHORT_GRASS
									|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SNOW)) {
						set = true;
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))) {
							if (Math.random() < 0.3) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.CUT_RED_SANDSTONE.defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.RED_SANDSTONE.defaultBlockState(), 3);
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (Math.random() < 0.3) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.CUT_SANDSTONE.defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SANDSTONE.defaultBlockState(), 3);
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))) {
							if (Math.random() < 0.3) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.PACKED_ICE.defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.ICE.defaultBlockState(), 3);
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (Math.random() < 0.3) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), 3);
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))) {
							if (Math.random() < 0.3) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.TUFF_BRICKS.get().defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.CRACKED_TUFF_BRICKS.get().defaultBlockState(), 3);
							}
						} else {
							if (Math.random() < 0.3) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.STONE_BRICKS.defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.CRACKED_STONE_BRICKS.defaultBlockState(), 3);
							}
						}
					} else if (!((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR)) {
						set = true;
					} else {
						sy = sy - 1;
					}
				}
			}
		}
	}
}
