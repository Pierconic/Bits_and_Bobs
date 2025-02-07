package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class GenblockK7ExplodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Math.random() < 0.3) {
				sx = -2;
				for (int index0 = 0; index0 < 5; index0++) {
					sy = -2;
					for (int index1 = 0; index1 < 5; index1++) {
						sz = -2;
						for (int index2 = 0; index2 < 5; index2++) {
							if (!(world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:temple_unbreakable")))
									&& world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).canOcclude()
									&& (Math.abs(sx) <= 1 && Math.abs(sy) <= 1 && Math.abs(sz) <= 1 || Math.abs(sx) <= 2 && Math.abs(sy) <= 2 && Math.abs(sz) <= 2 && Math.random() < 0.5)) {
								if (Math.random() < 0.2 && ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:temple_breakable")))
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:sand_replaceable"))))) {
									if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("eroded_badlands"))
											|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.RED_SAND.defaultBlockState(), 3);
									} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_taiga"))
											|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.GRAVEL.defaultBlockState(), 3);
									} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SAND.defaultBlockState(), 3);
									}
								} else {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
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
}
