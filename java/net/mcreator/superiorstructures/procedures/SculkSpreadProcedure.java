package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class SculkSpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double sz2 = 0;
		double sx2 = 0;
		double sy2 = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			sx = x - 6;
			for (int index0 = 0; index0 < 12; index0++) {
				sy = y - 6;
				for (int index1 = 0; index1 < 12; index1++) {
					sz = z - 6;
					for (int index2 = 0; index2 < 12; index2++) {
						if (Math.random() < 0.003) {
							sx2 = -4;
							for (int index3 = 0; index3 < 8; index3++) {
								sy2 = -4;
								for (int index4 = 0; index4 < 8; index4++) {
									sz2 = -4;
									for (int index5 = 0; index5 < 8; index5++) {
										if (Math.random() < 0.3) {
											if ((world.getBlockState(BlockPos.containing(sx + sx2, sy + sy2, sz + sz2))).getBlock() == Blocks.DEEPSLATE_BRICKS
													|| (world.getBlockState(BlockPos.containing(sx + sx2, sy + sy2, sz + sz2))).getBlock() == Blocks.POLISHED_DEEPSLATE
													|| (world.getBlockState(BlockPos.containing(sx + sx2, sy + sy2, sz + sz2))).getBlock() == Blocks.COBBLED_DEEPSLATE
													|| (world.getBlockState(BlockPos.containing(sx + sx2, sy + sy2, sz + sz2))).getBlock() == Blocks.CHISELED_DEEPSLATE
													|| (world.getBlockState(BlockPos.containing(sx + sx2, sy + sy2, sz + sz2))).getBlock() == Blocks.POLISHED_BASALT) {
												if (Math.random() < 0.3) {
													world.setBlock(BlockPos.containing(sx + sx2, sy + sy2, sz + sz2), Blocks.SCULK.defaultBlockState(), 3);
												} else if (world.getBlockState(BlockPos.containing(sx + sx2, sy + sy2, sz + sz2)).canOcclude()) {
													if (world.isEmptyBlock(BlockPos.containing(sx + sx2 + 1, sy + sy2, sz + sz2))) {
														world.setBlock(BlockPos.containing(sx + sx2 + 1, sy + sy2, sz + sz2), Blocks.SCULK_VEIN.defaultBlockState(), 3);
														{
															BlockPos _pos = BlockPos.containing(sx + sx2 + 1, sy + sy2, sz + sz2);
															BlockState _bs = world.getBlockState(_pos);
															if (_bs.getBlock().getStateDefinition().getProperty("west") instanceof BooleanProperty _booleanProp)
																world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
														}
													}
													if (world.isEmptyBlock(BlockPos.containing((sx + sx2) - 1, sy + sy2, sz + sz2))) {
														world.setBlock(BlockPos.containing((sx + sx2) - 1, sy + sy2, sz + sz2), Blocks.SCULK_VEIN.defaultBlockState(), 3);
														{
															BlockPos _pos = BlockPos.containing((sx + sx2) - 1, sy + sy2, sz + sz2);
															BlockState _bs = world.getBlockState(_pos);
															if (_bs.getBlock().getStateDefinition().getProperty("east") instanceof BooleanProperty _booleanProp)
																world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
														}
													}
													if (world.isEmptyBlock(BlockPos.containing(sx + sx2, sy + sy2, sz + sz2 + 1))) {
														world.setBlock(BlockPos.containing(sx + sx2, sy + sy2, sz + sz2 + 1), Blocks.SCULK_VEIN.defaultBlockState(), 3);
														{
															BlockPos _pos = BlockPos.containing(sx + sx2, sy + sy2, sz + sz2 + 1);
															BlockState _bs = world.getBlockState(_pos);
															if (_bs.getBlock().getStateDefinition().getProperty("north") instanceof BooleanProperty _booleanProp)
																world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
														}
													}
													if (world.isEmptyBlock(BlockPos.containing(sx + sx2, sy + sy2, (sz + sz2) - 1))) {
														world.setBlock(BlockPos.containing(sx + sx2, sy + sy2, (sz + sz2) - 1), Blocks.SCULK_VEIN.defaultBlockState(), 3);
														{
															BlockPos _pos = BlockPos.containing(sx + sx2, sy + sy2, (sz + sz2) - 1);
															BlockState _bs = world.getBlockState(_pos);
															if (_bs.getBlock().getStateDefinition().getProperty("south") instanceof BooleanProperty _booleanProp)
																world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
														}
													}
													if (world.isEmptyBlock(BlockPos.containing(sx + sx2, (sy + sy2) - 1, sz + sz2))) {
														world.setBlock(BlockPos.containing(sx + sx2, (sy + sy2) - 1, sz + sz2), Blocks.SCULK_VEIN.defaultBlockState(), 3);
														{
															BlockPos _pos = BlockPos.containing(sx + sx2, (sy + sy2) - 1, sz + sz2);
															BlockState _bs = world.getBlockState(_pos);
															if (_bs.getBlock().getStateDefinition().getProperty("up") instanceof BooleanProperty _booleanProp)
																world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
														}
													}
													if (world.isEmptyBlock(BlockPos.containing(sx + sx2, sy + sy2 + 1, sz + sz2))) {
														world.setBlock(BlockPos.containing(sx + sx2, sy + sy2 + 1, sz + sz2), Blocks.SCULK_VEIN.defaultBlockState(), 3);
														{
															BlockPos _pos = BlockPos.containing(sx + sx2, sy + sy2 + 1, sz + sz2);
															BlockState _bs = world.getBlockState(_pos);
															if (_bs.getBlock().getStateDefinition().getProperty("down") instanceof BooleanProperty _booleanProp)
																world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
														}
													}
												}
											}
											sz2 = sz2 + 1;
										}
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
		}
	}
}
