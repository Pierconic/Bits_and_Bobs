package net.mcreator.superiorstructures.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class TintedLaserGlassUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double s = 0;
		double distance = 0;
		boolean source = false;
		if (((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:laser_glass")))
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.ACTIVE_BEAMSTONE.get()) && (new Object() {
					public Direction getDirection(BlockState _bs) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp)
							return _bs.getValue(_dp);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
								? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
								: Direction.NORTH;
					}
				}.getDirection((world.getBlockState(BlockPos.containing(x, y, z + 1))))) == Direction.NORTH || ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:laser_glass")))
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.ACTIVE_BEAMSTONE.get()) && (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x, y, z - 1))))) == Direction.SOUTH
				|| ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get()
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get()
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get()
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get()
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:laser_glass")))
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVE_BEAMSTONE.get()) && (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x - 1, y, z))))) == Direction.EAST
				|| ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get()
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get()
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get()
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get()
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:laser_glass")))
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVE_BEAMSTONE.get()) && (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x + 1, y, z))))) == Direction.WEST
				|| ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get()
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get()
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get()
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get()
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:laser_glass")))
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVE_BEAMSTONE.get()) && (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x, y + 1, z))))) == Direction.DOWN
				|| ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:laser_glass")))
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVE_BEAMSTONE.get()) && (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x, y - 1, z))))) == Direction.UP) {
			if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:zappable_glass")))) {
				world.setBlock(BlockPos.containing(x, y, z - 1), (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(SuperiorstructuresModBlocks.GLASS_WITH_LASER.get().defaultBlockState(), Direction.NORTH)), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))
					&& !((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get())
					&& !((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get())
					&& !((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get())
					&& !((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get())) {
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getFluidState().isSource()) {
					{
						BlockPos _pos = BlockPos.containing(x, y, z - 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z - 0.5), null);
						world.destroyBlock(_pos, false);
					}
					world.setBlock(BlockPos.containing(x, y, z - 1), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.LASER_BEAM.get().defaultBlockState(), Direction.NORTH)), 3);
					{
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
					}
				} else {
					{
						BlockPos _pos = BlockPos.containing(x, y, z - 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z - 0.5), null);
						world.destroyBlock(_pos, false);
					}
					world.setBlock(BlockPos.containing(x, y, z - 1), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.LASER_BEAM.get().defaultBlockState(), Direction.NORTH)), 3);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:zappable_glass")))) {
				world.setBlock(BlockPos.containing(x, y, z + 1), (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(SuperiorstructuresModBlocks.GLASS_WITH_LASER.get().defaultBlockState(), Direction.SOUTH)), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.TINTED_GLASS) {
				world.setBlock(BlockPos.containing(x, y, z + 1), SuperiorstructuresModBlocks.TINTED_GLASS_WITH_LASER.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))
					&& !((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get())
					&& !((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get())
					&& !((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get())
					&& !((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get())) {
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getFluidState().isSource()) {
					{
						BlockPos _pos = BlockPos.containing(x, y, z + 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z + 1.5), null);
						world.destroyBlock(_pos, false);
					}
					world.setBlock(BlockPos.containing(x, y, z + 1), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.LASER_BEAM.get().defaultBlockState(), Direction.SOUTH)), 3);
					{
						BlockPos _pos = BlockPos.containing(x, y, z + 1);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
					}
				} else {
					{
						BlockPos _pos = BlockPos.containing(x, y, z + 1);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z + 1.5), null);
						world.destroyBlock(_pos, false);
					}
					world.setBlock(BlockPos.containing(x, y, z + 1), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.LASER_BEAM.get().defaultBlockState(), Direction.SOUTH)), 3);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable_glass")))) {
				world.setBlock(BlockPos.containing(x + 1, y, z), (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(SuperiorstructuresModBlocks.GLASS_WITH_LASER.get().defaultBlockState(), Direction.EAST)), 3);
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.TINTED_GLASS) {
				world.setBlock(BlockPos.containing(x + 1, y, z), SuperiorstructuresModBlocks.TINTED_GLASS_WITH_LASER.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))
					&& !((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get())
					&& !((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get())
					&& !((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get())
					&& !((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get())) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getFluidState().isSource()) {
					{
						BlockPos _pos = BlockPos.containing(x + 1, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 1.5, y, z + 0.5), null);
						world.destroyBlock(_pos, false);
					}
					world.setBlock(BlockPos.containing(x + 1, y, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.LASER_BEAM.get().defaultBlockState(), Direction.EAST)), 3);
					{
						BlockPos _pos = BlockPos.containing(x + 1, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
					}
				} else {
					{
						BlockPos _pos = BlockPos.containing(x + 1, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 1.5, y, z + 0.5), null);
						world.destroyBlock(_pos, false);
					}
					world.setBlock(BlockPos.containing(x + 1, y, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.LASER_BEAM.get().defaultBlockState(), Direction.EAST)), 3);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable_glass")))) {
				world.setBlock(BlockPos.containing(x - 1, y, z), (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(SuperiorstructuresModBlocks.GLASS_WITH_LASER.get().defaultBlockState(), Direction.WEST)), 3);
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.TINTED_GLASS) {
				world.setBlock(BlockPos.containing(x - 1, y, z), SuperiorstructuresModBlocks.TINTED_GLASS_WITH_LASER.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))
					&& !((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get())
					&& !((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get())
					&& !((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get())
					&& !((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get())) {
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getFluidState().isSource()) {
					{
						BlockPos _pos = BlockPos.containing(x - 1, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x - 0.5, y, z + 0.5), null);
						world.destroyBlock(_pos, false);
					}
					world.setBlock(BlockPos.containing(x - 1, y, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.LASER_BEAM.get().defaultBlockState(), Direction.WEST)), 3);
					{
						BlockPos _pos = BlockPos.containing(x - 1, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
					}
				} else {
					{
						BlockPos _pos = BlockPos.containing(x - 1, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x - 0.5, y, z + 0.5), null);
						world.destroyBlock(_pos, false);
					}
					world.setBlock(BlockPos.containing(x - 1, y, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.LASER_BEAM.get().defaultBlockState(), Direction.WEST)), 3);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable_glass")))) {
				world.setBlock(BlockPos.containing(x, y - 1, z), (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(SuperiorstructuresModBlocks.GLASS_WITH_LASER.get().defaultBlockState(), Direction.DOWN)), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.TINTED_GLASS) {
				world.setBlock(BlockPos.containing(x, y - 1, z), SuperiorstructuresModBlocks.TINTED_GLASS_WITH_LASER.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))
					&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get())
					&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get())
					&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get())
					&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get())) {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getFluidState().isSource()) {
					{
						BlockPos _pos = BlockPos.containing(x, y - 1, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y - 1, z + 0.5), null);
						world.destroyBlock(_pos, false);
					}
					world.setBlock(BlockPos.containing(x, y - 1, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.LASER_BEAM.get().defaultBlockState(), Direction.DOWN)), 3);
					{
						BlockPos _pos = BlockPos.containing(x, y - 1, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
					}
				} else {
					{
						BlockPos _pos = BlockPos.containing(x, y - 1, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y - 1, z + 0.5), null);
						world.destroyBlock(_pos, false);
					}
					world.setBlock(BlockPos.containing(x, y - 1, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.LASER_BEAM.get().defaultBlockState(), Direction.DOWN)), 3);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable_glass")))) {
				world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(SuperiorstructuresModBlocks.GLASS_WITH_LASER.get().defaultBlockState(), Direction.UP)), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.TINTED_GLASS) {
				world.setBlock(BlockPos.containing(x, y + 1, z), SuperiorstructuresModBlocks.TINTED_GLASS_WITH_LASER.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))
					&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get())
					&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get())
					&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get())
					&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get())) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getFluidState().isSource()) {
					{
						BlockPos _pos = BlockPos.containing(x, y + 1, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y + 1, z + 0.5), null);
						world.destroyBlock(_pos, false);
					}
					world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.LASER_BEAM.get().defaultBlockState(), Direction.UP)), 3);
					{
						BlockPos _pos = BlockPos.containing(x, y + 1, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
							world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
					}
				} else {
					{
						BlockPos _pos = BlockPos.containing(x, y + 1, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y + 1, z + 0.5), null);
						world.destroyBlock(_pos, false);
					}
					world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.LASER_BEAM.get().defaultBlockState(), Direction.UP)), 3);
				}
			}
		} else {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.TINTED_GLASS.defaultBlockState(), 3);
		}
	}
}
