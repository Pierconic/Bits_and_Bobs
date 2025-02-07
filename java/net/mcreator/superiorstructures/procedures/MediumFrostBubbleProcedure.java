package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class MediumFrostBubbleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -2;
		for (int index0 = 0; index0 < 5; index0++) {
			sy = -1;
			for (int index1 = 0; index1 < 5; index1++) {
				sz = -2;
				for (int index2 = 0; index2 < 5; index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER) {
						if (Math.abs(sy) >= 2 || sy == 4 || Math.abs(sz) >= 2) {
							if (Math.random() < 0.05) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_3.get().defaultBlockState(), 3);
							} else if (Math.random() < 0.3) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_4.get().defaultBlockState(), 3);
							}
						} else {
							if (Math.random() < 0.15) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_2.get().defaultBlockState(), 3);
							} else if (Math.random() < 0.65) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_3.get().defaultBlockState(), 3);
							}
						}
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		sx = -4;
		for (int index3 = 0; index3 < 8; index3++) {
			sy = -4;
			for (int index4 = 0; index4 < 8; index4++) {
				sz = -4;
				for (int index5 = 0; index5 < 8; index5++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:fire")))) {
						world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
					} else {
						{
							BlockPos _pos = BlockPos.containing(x + sx, y + sy, z + sz);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("lit") instanceof BooleanProperty _booleanProp)
								world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
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
