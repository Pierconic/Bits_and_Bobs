package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class LichenPatchProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double count = 0;
		String type = "";
		sx = -3;
		for (int index0 = 0; index0 < 7; index0++) {
			sy = -3;
			for (int index1 = 0; index1 < 7; index1++) {
				sz = -3;
				for (int index2 = 0; index2 < 7; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:shipwreck_breakable")))) {
						if (!(Math.abs(sx) >= 6 && Math.abs(sy) >= 6 && Math.abs(sz) >= 6) && (Math.random() < 0.6 || Math.abs(sx) >= 2 && Math.abs(sy) >= 2 && Math.abs(sz) >= 2)) {
							if (Math.random() < 0.8) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.MOSS_BLOCK.defaultBlockState(), 3);
							} else {
								LichenPlacementProcedure.execute(world, x + sx, y + sy, z + sz);
							}
						} else {
							LichenPlacementProcedure.execute(world, x + sx, y + sy, z + sz);
						}
					}
					if (Math.random() < 0.2) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PRISMARINE_BRICKS) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.MOSSY_PRISMARINE_BRICKS.get().defaultBlockState(), 3);
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PRISMARINE) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.MOSSY_PRISMARINE.get().defaultBlockState(), 3);
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
