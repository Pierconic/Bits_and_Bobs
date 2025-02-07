package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class TotemImplicationsProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -6;
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 6, 12); index0++) {
			sx = Mth.nextInt(RandomSource.create(), 2, 13);
			sz = Mth.nextInt(RandomSource.create(), 2, 13);
			if (((world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.GRASS_BLOCK
					|| (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.PODZOL)
					&& !((world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) + 1, z + sz))).getBlock() == Blocks.OAK_LEAVES
							|| (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) + 2, z + sz))).getBlock() == Blocks.OAK_LEAVES
							|| (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) + 3, z + sz))).getBlock() == Blocks.OAK_LEAVES
							|| (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) + 4, z + sz))).getBlock() == Blocks.OAK_LEAVES
							|| (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) + 5, z + sz))).getBlock() == Blocks.OAK_LEAVES)
					&& !world.getBlockState(BlockPos.containing(x + sx + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz)).canOcclude()
					&& !world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz + 1)).canOcclude()
					&& !world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), (z + sz) - 1)).canOcclude()
					&& !world.getBlockState(BlockPos.containing((x + sx) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz)).canOcclude()
					&& !(world.getBlockState(BlockPos.containing((x + sx) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), (z + sz) - 1)))
							.is(BlockTags.create(ResourceLocation.parse("forge:structure_blockable")))
					&& !(world.getBlockState(BlockPos.containing(x + sx + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), (z + sz) - 1)))
							.is(BlockTags.create(ResourceLocation.parse("forge:structure_blockable")))
					&& !(world.getBlockState(BlockPos.containing((x + sx) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz + 1)))
							.is(BlockTags.create(ResourceLocation.parse("forge:structure_blockable")))
					&& !(world.getBlockState(BlockPos.containing(x + sx + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz + 1)))
							.is(BlockTags.create(ResourceLocation.parse("forge:structure_blockable")))
					&& !((world.getBlockState(BlockPos.containing((x + sx) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.WATER)
					&& !((world.getBlockState(BlockPos.containing(x + sx + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.WATER)
					&& !((world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz + 1))).getBlock() == Blocks.WATER)
					&& !((world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, (z + sz) - 1))).getBlock() == Blocks.WATER)) {
				sy = world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz));
				world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x + sx + 1, sy - 1, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx + 1, sy - 1, z + sz), SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing((x + sx) - 1, sy - 1, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing((x + sx) - 1, sy - 1, z + sz), SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x + sx, sy - 1, (z + sz) - 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx, sy - 1, (z + sz) - 1), SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x + sx, sy - 1, z + sz + 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx, sy - 1, z + sz + 1), SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x + sx + 1, sy - 2, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx + 1, sy - 2, z + sz), SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing((x + sx) - 1, sy - 2, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing((x + sx) - 1, sy - 2, z + sz), SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x + sx, sy - 2, (z + sz) - 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx, sy - 2, (z + sz) - 1), SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x + sx, sy - 2, z + sz + 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx, sy - 2, z + sz + 1), SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.3) {
					world.setBlock(BlockPos.containing(x + sx + 1, sy - 1, (z + sz) - 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.1) {
					world.setBlock(BlockPos.containing(x + sx + 1, sy - 1, (z + sz) - 1), SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.3) {
					world.setBlock(BlockPos.containing((x + sx) - 1, sy - 1, z + sz + 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.1) {
					world.setBlock(BlockPos.containing((x + sx) - 1, sy - 1, z + sz + 1), SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.3) {
					world.setBlock(BlockPos.containing((x + sx) - 1, sy - 2, (z + sz) - 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.1) {
					world.setBlock(BlockPos.containing((x + sx) - 1, sy - 2, (z + sz) - 1), SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.3) {
					world.setBlock(BlockPos.containing(x + sx + 1, sy - 2, z + sz + 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.1) {
					world.setBlock(BlockPos.containing(x + sx + 1, sy - 2, z + sz + 1), SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x + sx, sy - 2, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx, sy - 2, z + sz), SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), SuperiorstructuresModBlocks.CHISELED_TUFF_BRICKS.get().defaultBlockState(), 3);
				for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 2, 4); index1++) {
					TotemSelectionProcedure.execute(world, x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz);
				}
			}
		}
	}
}
