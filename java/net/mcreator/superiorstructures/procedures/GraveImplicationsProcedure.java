package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GraveImplicationsProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double sx = 0;
		double sz = 0;
		sx = -6;
		for (int index0 = 0; index0 < 27; index0++) {
			sz = -6;
			for (int index1 = 0; index1 < 27; index1++) {
				if ((world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.GRASS_BLOCK
						&& (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz))).getBlock() == Blocks.AIR) {
					if (Math.random() < 0.05) {
						if (Math.random() < 0.7) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.DANDELION.defaultBlockState(), 3);
						} else if (Math.random() < 0.4) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.SUNFLOWER.defaultBlockState(), 3);
						} else {
							if (Math.random() < 0.7) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.CORNFLOWER.defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.AZURE_BLUET.defaultBlockState(), 3);
							}
						}
					}
				}
				sz = sz + 1;
			}
			sx = sx + 1;
		}
		for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 7, 12); index2++) {
			sx = Mth.nextInt(RandomSource.create(), 2, 13);
			sz = Mth.nextInt(RandomSource.create(), 2, 13);
			if (!world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz)).canOcclude()
					&& (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.GRASS_BLOCK
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
				world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x + sx + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx + 1), (int) (z + sz)) - 1, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx + 1), (int) (z + sz)) - 1, z + sz),
							SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing((x + sx) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) ((x + sx) - 1), (int) (z + sz)) - 1, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing((x + sx) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) ((x + sx) - 1), (int) (z + sz)) - 1, z + sz),
							SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) ((z + sz) - 1)) - 1, (z + sz) - 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) ((z + sz) - 1)) - 1, (z + sz) - 1),
							SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz + 1)) - 1, z + sz + 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz + 1)) - 1, z + sz + 1),
							SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x + sx + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx + 1), (int) (z + sz)) - 2, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx + 1), (int) (z + sz)) - 2, z + sz),
							SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing((x + sx) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) ((x + sx) - 1), (int) (z + sz)) - 2, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing((x + sx) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) ((x + sx) - 1), (int) (z + sz)) - 2, z + sz),
							SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) ((z + sz) - 1)) - 2, (z + sz) - 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) ((z + sz) - 1)) - 2, (z + sz) - 1),
							SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz + 1)) - 2, z + sz + 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz + 1)) - 2, z + sz + 1),
							SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.3) {
					world.setBlock(BlockPos.containing(x + sx + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx + 1), (int) ((z + sz) - 1)) - 1, (z + sz) - 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.1) {
					world.setBlock(BlockPos.containing(x + sx + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx + 1), (int) ((z + sz) - 1)) - 1, (z + sz) - 1),
							SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.3) {
					world.setBlock(BlockPos.containing((x + sx) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) ((x + sx) - 1), (int) ((z + sz) - 1)) - 1, z + sz + 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.1) {
					world.setBlock(BlockPos.containing((x + sx) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) ((x + sx) - 1), (int) ((z + sz) - 1)) - 1, z + sz + 1),
							SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.3) {
					world.setBlock(BlockPos.containing((x + sx) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) ((x + sx) - 1), (int) ((z + sz) - 1)) - 2, (z + sz) - 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.1) {
					world.setBlock(BlockPos.containing((x + sx) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) ((x + sx) - 1), (int) ((z + sz) - 1)) - 2, (z + sz) - 1),
							SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.3) {
					world.setBlock(BlockPos.containing(x + sx + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx + 1), (int) (z + sz + 1)) - 2, z + sz + 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.1) {
					world.setBlock(BlockPos.containing(x + sx + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx + 1), (int) (z + sz + 1)) - 2, z + sz + 1),
							SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.5) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 2, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				} else if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 2, z + sz), SuperiorstructuresModBlocks.GRAVE_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
				}
				if (Math.random() < 0.65) {
					if (Math.random() < 0.65) {
						world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.CHISELED_STONE_BRICKS.defaultBlockState(), 3);
					} else {
						if (Math.random() < 0.65) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.COBBLESTONE.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
						}
					}
					if (Math.random() < 0.65) {
						world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.WHITE_CANDLE.defaultBlockState(), 3);
						{
							int _value = Mth.nextInt(RandomSource.create(), 1, 4);
							BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("candles") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						{
							BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("lit") instanceof BooleanProperty _booleanProp)
								world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
						}
					} else {
						if (Math.random() < 0.65) {
							if (Math.random() < 0.65) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.STONE_BRICK_SLAB.defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.MOSSY_STONE_BRICK_SLAB.defaultBlockState(), 3);
							}
						} else {
							if (Math.random() < 0.65) {
								if (Math.random() < 0.65) {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.STONE_BRICK_WALL.defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.MOSSY_STONE_BRICK_WALL.defaultBlockState(), 3);
								}
							} else {
								if (Math.random() < 0.65) {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.COBBLESTONE_WALL.defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.MOSSY_COBBLESTONE_WALL.defaultBlockState(), 3);
								}
								if (Math.random() < 0.65) {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.WHITE_CANDLE.defaultBlockState(), 3);
									{
										int _value = Mth.nextInt(RandomSource.create(), 1, 3);
										BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz);
										BlockState _bs = world.getBlockState(_pos);
										if (_bs.getBlock().getStateDefinition().getProperty("candles") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
											world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
									}
									{
										BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz);
										BlockState _bs = world.getBlockState(_pos);
										if (_bs.getBlock().getStateDefinition().getProperty("lit") instanceof BooleanProperty _booleanProp)
											world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
									}
								}
							}
						}
					}
				} else {
					if (Math.random() < 0.65) {
						if (Math.random() < 0.65) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.STONE_BRICK_WALL.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.MOSSY_STONE_BRICK_WALL.defaultBlockState(), 3);
						}
					} else {
						if (Math.random() < 0.65) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.COBBLESTONE_WALL.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.MOSSY_COBBLESTONE_WALL.defaultBlockState(), 3);
						}
					}
					if (Math.random() < 0.65) {
						world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.WHITE_CANDLE.defaultBlockState(), 3);
						{
							int _value = Mth.nextInt(RandomSource.create(), 1, 3);
							BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("candles") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
								world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
						}
						{
							BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz);
							BlockState _bs = world.getBlockState(_pos);
							if (_bs.getBlock().getStateDefinition().getProperty("lit") instanceof BooleanProperty _booleanProp)
								world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
						}
					}
				}
			}
		}
	}
}
