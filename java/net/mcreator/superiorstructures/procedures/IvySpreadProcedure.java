package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class IvySpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sparse_jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("forest"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))) {
			sx = -5;
			for (int index0 = 0; index0 < 10; index0++) {
				sy = -5;
				for (int index1 = 0; index1 < 10; index1++) {
					sz = -5;
					for (int index2 = 0; index2 < 10; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ivy_spreadable"))) && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
							if (!world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz)).canOcclude() && !(sx > 3 && sz < -3) && !(sx < -3 && sz > 3) && !(sx < -3 && sz < -3) && !(sx > 3 && sz > 3)) {
								if ((sx < 3 || sx > -3) && (sz < 3 || sz > -3) && Math.random() < 0.5) {
									if (Math.random() < 0.6) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), SuperiorstructuresModBlocks.POISON_IVY.get().defaultBlockState(), 3);
									} else {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
									}
								} else if (Math.random() < 0.1) {
									if (Math.random() < 0.7 && !(sx > 4 || sx < -4 || sz < -4 || sz > 4)) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), SuperiorstructuresModBlocks.POISON_IVY.get().defaultBlockState(), 3);
									} else {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
									}
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
}
