package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GenblockM4PillarProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String type = "";
		double heightcheck = 0;
		double height = 0;
		boolean stop = false;
		boolean down = false;
		boolean up = false;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_M_4_A.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.CHISELED_STONE_BRICKS.defaultBlockState(), 3);
				type = "copper";
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_M_4_C.get()) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.CHISELED_RED_SANDSTONE.defaultBlockState(), 3);
				type = "gold";
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_M_4_B.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.CHISELED_TUFF_BRICKS.get().defaultBlockState(), 3);
				type = "iron";
			}
			stop = false;
			down = false;
			if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
				heightcheck = 1;
				for (int index0 = 0; index0 < 36; index0++) {
					if (world.getBlockState(BlockPos.containing(x, y - heightcheck, z)).canOcclude()) {
						down = true;
					} else if (!world.getBlockState(BlockPos.containing(x, y - heightcheck, z)).canOcclude()) {
						heightcheck = heightcheck + 1;
					}
				}
				if (down) {
					height = 1;
					while (stop == false && height < 37) {
						if (world.getBlockState(BlockPos.containing(x, y - height, z)).canOcclude() && !(world.getBlockState(BlockPos.containing(x, y + height, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
							stop = true;
							if ((type).equals("gold")) {
								world.setBlock(BlockPos.containing(x, y - (height - 1), z), Blocks.CHISELED_RED_SANDSTONE.defaultBlockState(), 3);
							} else if ((type).equals("iron")) {
								world.setBlock(BlockPos.containing(x, y - (height - 1), z), SuperiorstructuresModBlocks.CHISELED_TUFF_BRICKS.get().defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x, y - (height - 1), z), Blocks.CHISELED_STONE_BRICKS.defaultBlockState(), 3);
							}
						} else {
							if ((type).equals("copper")) {
								if (height == 6 || height == 12 || height == 18 || height == 24 || height == 30) {
									world.setBlock(BlockPos.containing(x, y - height, z), SuperiorstructuresModBlocks.GENBLOCK_M_6_A.get().defaultBlockState(), 3);
								} else if (height == 5 || height == 7 || height == 11 || height == 13 || height == 17 || height == 19 || height == 23 || height == 25 || height == 31 || height == 32) {
									world.setBlock(BlockPos.containing(x, y - height, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x, y - height, z), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(Blocks.OAK_LOG.defaultBlockState(), Direction.DOWN)), 3);
								}
							} else if ((type).equals("iron")) {
								if (height == 6 || height == 12 || height == 18 || height == 24 || height == 30) {
									world.setBlock(BlockPos.containing(x, y - height, z), SuperiorstructuresModBlocks.GENBLOCK_M_6_B.get().defaultBlockState(), 3);
								} else if (height == 5 || height == 7 || height == 11 || height == 13 || height == 17 || height == 19 || height == 23 || height == 25 || height == 31 || height == 32) {
									world.setBlock(BlockPos.containing(x, y - height, z), SuperiorstructuresModBlocks.TUFF_BRICKS.get().defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x, y - height, z), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(Blocks.SPRUCE_LOG.defaultBlockState(), Direction.DOWN)), 3);
								}
							} else {
								if (height == 6 || height == 12 || height == 18 || height == 24 || height == 30) {
									world.setBlock(BlockPos.containing(x, y - height, z), SuperiorstructuresModBlocks.GENBLOCK_M_6_C.get().defaultBlockState(), 3);
								} else if (height == 5 || height == 7 || height == 11 || height == 13 || height == 17 || height == 19 || height == 23 || height == 25 || height == 31 || height == 32) {
									world.setBlock(BlockPos.containing(x, y - height, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x, y - height, z), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(Blocks.DARK_OAK_LOG.defaultBlockState(), Direction.DOWN)), 3);
								}
							}
							height = height + 1;
						}
					}
				} else if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
					if ((type).equals("gold")) {
						world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.RED_SANDSTONE_WALL.defaultBlockState(), 3);
					} else if ((type).equals("iron")) {
						world.setBlock(BlockPos.containing(x, y - 1, z), SuperiorstructuresModBlocks.TUFF_BRICK_WALL.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.STONE_BRICK_WALL.defaultBlockState(), 3);
					}
				}
			}
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && !world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z))) {
				heightcheck = 1;
				for (int index2 = 0; index2 < 14; index2++) {
					if (world.getBlockState(BlockPos.containing(x, y + heightcheck, z)).canOcclude()) {
						up = true;
					} else if (!world.getBlockState(BlockPos.containing(x, y + heightcheck, z)).canOcclude()) {
						heightcheck = heightcheck + 1;
					}
				}
				if (up) {
					height = 1;
					while (stop == false && height < 15) {
						if (world.getBlockState(BlockPos.containing(x, y + height, z)).canOcclude() && !(world.getBlockState(BlockPos.containing(x, y + height, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
							if ((type).equals("gold")) {
								world.setBlock(BlockPos.containing(x, y + height, z), Blocks.CHISELED_RED_SANDSTONE.defaultBlockState(), 3);
							} else if ((type).equals("iron")) {
								world.setBlock(BlockPos.containing(x, y + height, z), SuperiorstructuresModBlocks.CHISELED_TUFF_BRICKS.get().defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x, y + height, z), Blocks.CHISELED_STONE_BRICKS.defaultBlockState(), 3);
							}
							stop = true;
						} else {
							if (height == 1) {
								world.setBlock(BlockPos.containing(x, y + height, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
							} else {
								if ((type).equals("gold")) {
									world.setBlock(BlockPos.containing(x, y + height, z), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(Blocks.DARK_OAK_LOG.defaultBlockState(), Direction.DOWN)), 3);
								} else if ((type).equals("iron")) {
									world.setBlock(BlockPos.containing(x, y + height, z), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(Blocks.SPRUCE_LOG.defaultBlockState(), Direction.DOWN)), 3);
								} else {
									world.setBlock(BlockPos.containing(x, y + height, z), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(Blocks.OAK_LOG.defaultBlockState(), Direction.DOWN)), 3);
								}
							}
							height = height + 1;
						}
					}
				} else if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
					if ((type).equals("gold")) {
						world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.RED_SANDSTONE_WALL.defaultBlockState(), 3);
					} else if ((type).equals("iron")) {
						world.setBlock(BlockPos.containing(x, y + 1, z), SuperiorstructuresModBlocks.TUFF_BRICK_WALL.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.STONE_BRICK_WALL.defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
