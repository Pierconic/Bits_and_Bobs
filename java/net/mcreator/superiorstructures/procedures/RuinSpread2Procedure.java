package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class RuinSpread2Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double sz2 = 0;
		double sx2 = 0;
		double sy3 = 0;
		double sy2 = 0;
		double sz3 = 0;
		double sx3 = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			sx = x - 6;
			for (int index0 = 0; index0 < 12; index0++) {
				sy = y - 6;
				for (int index1 = 0; index1 < 12; index1++) {
					sz = z - 6;
					for (int index2 = 0; index2 < 12; index2++) {
						if (Math.random() < 0.005) {
							sx2 = -3;
							for (int index3 = 0; index3 < 6; index3++) {
								sy2 = -3;
								for (int index4 = 0; index4 < 6; index4++) {
									sz2 = -3;
									for (int index5 = 0; index5 < 6; index5++) {
										if (Math.random() < 0.3 && (world.getBlockState(BlockPos.containing(sx + sx2, sy + sy2, sz + sz2))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable")))) {
											world.setBlock(BlockPos.containing(sx + sx2, sy + sy2, sz + sz2), Blocks.AIR.defaultBlockState(), 3);
										}
										sz2 = sz2 + 1;
									}
									sy2 = sy2 + 1;
								}
								sx2 = sx2 + 1;
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			sx3 = -8;
			for (int index6 = 0; index6 < 16; index6++) {
				sy3 = -8;
				for (int index7 = 0; index7 < 16; index7++) {
					sz3 = -8;
					for (int index8 = 0; index8 < 16; index8++) {
						if ((world.getBlockState(BlockPos.containing(x + sx3, y + sy3, z + sz3))).getBlock() == Blocks.AIR && world.getBlockState(BlockPos.containing(x + sx3, (y + sy3) - 1, z + sz3)).canOcclude()
								&& (world.getBlockState(BlockPos.containing((x + sx3) - 1, y + sy3, z + sz3)).canOcclude() || world.getBlockState(BlockPos.containing(x + sx3 + 1, y + sy3, z + sz3)).canOcclude()
										|| world.getBlockState(BlockPos.containing(x + sx3, y + sy3, (z + sz3) - 1)).canOcclude() || world.getBlockState(BlockPos.containing(x + sx3, y + sy3, z + sz3 + 1)).canOcclude())
								&& Math.random() < 0.1) {
							if (y <= -5) {
								if (Math.random() < 0.6) {
									world.setBlock(BlockPos.containing(x + sx3, y + sy3, z + sz3), Blocks.COBBLED_DEEPSLATE.defaultBlockState(), 3);
								} else if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx3, y + sy3, z + sz3), SuperiorstructuresModBlocks.DEEPSLATE_RUBBLE.get().defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx3, y + sy3, z + sz3), Blocks.CRACKED_DEEPSLATE_BRICKS.defaultBlockState(), 3);
								}
							} else {
								if (Math.random() < 0.6) {
									world.setBlock(BlockPos.containing(x + sx3, y + sy3, z + sz3), Blocks.COBBLESTONE.defaultBlockState(), 3);
								} else if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx3, y + sy3, z + sz3), SuperiorstructuresModBlocks.STONE_RUBBLE.get().defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx3, y + sy3, z + sz3), Blocks.CRACKED_STONE_BRICKS.defaultBlockState(), 3);
								}
							}
						}
						sz3 = sz3 + 1;
					}
					sy3 = sy3 + 1;
				}
				sx3 = sx3 + 1;
			}
		}
	}
}
