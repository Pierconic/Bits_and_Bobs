package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GenblockB6StakeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 10, 16); index0++) {
			sx = Mth.nextInt(RandomSource.create(), -22, 22);
			sz = Mth.nextInt(RandomSource.create(), -22, 22);
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
					&& !((world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, (z + sz) - 1))).getBlock() == Blocks.WATER)
					&& !(sx < 10 && sx > -10 && sz < 10 && sz > -10)) {
				sy = world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz));
				if (Math.random() < 0.7) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.MUD_BRICKS.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.MUD_BRICK_WALL.defaultBlockState(), 3);
				}
				for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 2, 4); index1++) {
					StakeSelectionProcedure.execute(world, x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz);
				}
			}
		}
	}
}
