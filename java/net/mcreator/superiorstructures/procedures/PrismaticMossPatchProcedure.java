package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class PrismaticMossPatchProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double range = 0;
		boolean found = false;
		range = Mth.nextInt(RandomSource.create(), 5, 9);
		sx = Math.ceil(range * (-0.5));
		for (int index0 = 0; index0 < (int) range; index0++) {
			sy = Math.ceil(range * (-0.5));
			for (int index1 = 0; index1 < (int) range; index1++) {
				sz = Math.ceil(range * (-0.5));
				for (int index2 = 0; index2 < (int) range; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:monument_wreckable")))) {
						if (Math.abs(sx) <= Math.ceil(range * 0.15) && Math.abs(sy) <= Math.ceil(range * 0.15) && Math.abs(sz) <= Math.ceil(range * 0.15)) {
							if (Math.random() < 0.8) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.MOSS_BLOCK.defaultBlockState(), 3);
							} else {
								if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PRISMARINE_BRICKS) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.MOSSY_PRISMARINE_BRICKS.get().defaultBlockState(), 3);
								} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PRISMARINE) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.MOSSY_PRISMARINE.get().defaultBlockState(), 3);
								}
								LichenPlacementProcedure.execute(world, x + sx, y + sy, z + sz);
							}
						} else if (!(Math.abs(sy) > Math.ceil(range * 0.15) && Math.abs(sz) > Math.ceil(range * 0.15) || Math.abs(sy) > Math.ceil(range * 0.15) && Math.abs(sx) > Math.ceil(range * 0.15)
								|| Math.abs(sz) > Math.ceil(range * 0.15) && Math.abs(sx) > Math.ceil(range * 0.15))) {
							if (Math.random() < 0.65) {
								if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PRISMARINE_BRICKS) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.MOSSY_PRISMARINE_BRICKS.get().defaultBlockState(), 3);
								} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PRISMARINE) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.MOSSY_PRISMARINE.get().defaultBlockState(), 3);
								}
							}
							if (Math.random() < 0.8) {
								LichenPlacementProcedure.execute(world, x + sx, y + sy, z + sz);
							}
						} else if (Math.random() < 0.2 && !(Math.abs(sx) > Math.ceil(range * 0.15) && Math.abs(sy) > Math.ceil(range * 0.15) && Math.abs(sz) > Math.ceil(range * 0.15))) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PRISMARINE_BRICKS) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.MOSSY_PRISMARINE_BRICKS.get().defaultBlockState(), 3);
							} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PRISMARINE) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.MOSSY_PRISMARINE.get().defaultBlockState(), 3);
							}
						}
					} else if (Math.random() < 0.5 && !(Math.abs(sx) > Math.ceil(range * 0.15) && Math.abs(sy) > Math.ceil(range * 0.15) && Math.abs(sz) > Math.ceil(range * 0.15))) {
						LichenPlacementProcedure.execute(world, x + sx, y + sy, z + sz);
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
	}
}
