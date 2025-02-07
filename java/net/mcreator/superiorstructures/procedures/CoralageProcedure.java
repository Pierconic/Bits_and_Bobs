package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class CoralageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double type = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			sx = -6;
			for (int index0 = 0; index0 < 12; index0++) {
				sy = -6;
				for (int index1 = 0; index1 < 12; index1++) {
					sz = -6;
					for (int index2 = 0; index2 < 12; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER
								&& (world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz)).canOcclude() || world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz)).canOcclude()
										|| world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)).canOcclude() || world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1)).canOcclude())
								&& !world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz)) && Math.random() < 0.03) {
							type = Mth.nextInt(RandomSource.create(), 0, 4);
							if (type == 0) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.TUBE_CORAL_BLOCK.defaultBlockState(), 3);
							} else if (type == 1) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.BRAIN_CORAL_BLOCK.defaultBlockState(), 3);
							} else if (type == 2) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.BUBBLE_CORAL_BLOCK.defaultBlockState(), 3);
							} else if (type == 3) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.FIRE_CORAL_BLOCK.defaultBlockState(), 3);
							} else if (type == 4) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.HORN_CORAL_BLOCK.defaultBlockState(), 3);
							}
							if (Math.random() < 0.6) {
								world.setBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz), (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))), 3);
							}
							if (Math.random() < 0.6) {
								world.setBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz), (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))), 3);
							}
							if (Math.random() < 0.6) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1), (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))), 3);
							}
							if (Math.random() < 0.6) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1), (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))), 3);
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			sx = -6;
			for (int index3 = 0; index3 < 12; index3++) {
				sy = -6;
				for (int index4 = 0; index4 < 12; index4++) {
					sz = -6;
					for (int index5 = 0; index5 < 12; index5++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:coral_blocks")))) {
							for (int index6 = 0; index6 < Mth.nextInt(RandomSource.create(), 1, 3); index6++) {
								type = Mth.nextInt(RandomSource.create(), 0, 4);
								if (type == 0 && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.WATER) {
									world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with((BuiltInRegistries.BLOCK.getOrCreateTag(BlockTags.create(ResourceLocation.parse("minecraft:coral_plants"))).getRandomElement(RandomSource.create())
											.orElseGet(() -> BuiltInRegistries.BLOCK.wrapAsHolder(Blocks.AIR)).value()).defaultBlockState(), Direction.UP)), 3);
								} else if (type == 1 && (world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz))).getBlock() == Blocks.WATER) {
									world.setBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with((BuiltInRegistries.BLOCK.getOrCreateTag(BlockTags.create(ResourceLocation.parse("minecraft:wall_corals"))).getRandomElement(RandomSource.create())
											.orElseGet(() -> BuiltInRegistries.BLOCK.wrapAsHolder(Blocks.AIR)).value()).defaultBlockState(), Direction.EAST)), 3);
								} else if (type == 2 && (world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz))).getBlock() == Blocks.WATER) {
									world.setBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with((BuiltInRegistries.BLOCK.getOrCreateTag(BlockTags.create(ResourceLocation.parse("minecraft:wall_corals"))).getRandomElement(RandomSource.create())
											.orElseGet(() -> BuiltInRegistries.BLOCK.wrapAsHolder(Blocks.AIR)).value()).defaultBlockState(), Direction.WEST)), 3);
								} else if (type == 3 && (world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1))).getBlock() == Blocks.WATER) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with((BuiltInRegistries.BLOCK.getOrCreateTag(BlockTags.create(ResourceLocation.parse("minecraft:wall_corals"))).getRandomElement(RandomSource.create())
											.orElseGet(() -> BuiltInRegistries.BLOCK.wrapAsHolder(Blocks.AIR)).value()).defaultBlockState(), Direction.NORTH)), 3);
								} else if (type == 4 && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1))).getBlock() == Blocks.WATER) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with((BuiltInRegistries.BLOCK.getOrCreateTag(BlockTags.create(ResourceLocation.parse("minecraft:wall_corals"))).getRandomElement(RandomSource.create())
											.orElseGet(() -> BuiltInRegistries.BLOCK.wrapAsHolder(Blocks.AIR)).value()).defaultBlockState(), Direction.SOUTH)), 3);
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
