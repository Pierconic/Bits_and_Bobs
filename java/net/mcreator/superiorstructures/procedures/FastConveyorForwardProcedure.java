package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class FastConveyorForwardProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isEmptyBlock(BlockPos.containing(x, y + 1, z))) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:push_break")))) {
				{
					BlockPos _pos = BlockPos.containing(x, y + 1, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y + 1, z + 0.5), null);
					world.destroyBlock(_pos, false);
				}
			}
			if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.NORTH) {
				SuperiorstructuresMod.queueServerWork(5, () -> {
					if (!(world instanceof Level _level7 && _level7.hasNeighborSignal(BlockPos.containing(x, y, z)))) {
						PushBlockNorthProcedure.execute(world, x, y + 1, z);
					}
				});
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.SOUTH) {
				SuperiorstructuresMod.queueServerWork(5, () -> {
					if (!(world instanceof Level _level12 && _level12.hasNeighborSignal(BlockPos.containing(x, y, z)))) {
						PushBlockSouthProcedure.execute(world, x, y + 1, z);
					}
				});
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.WEST) {
				SuperiorstructuresMod.queueServerWork(5, () -> {
					if (!(world instanceof Level _level17 && _level17.hasNeighborSignal(BlockPos.containing(x, y, z)))) {
						PushBlockWestProcedure.execute(world, x, y + 1, z);
					}
				});
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))) == Direction.EAST) {
				SuperiorstructuresMod.queueServerWork(5, () -> {
					if (!(world instanceof Level _level22 && _level22.hasNeighborSignal(BlockPos.containing(x, y, z)))) {
						PushBlockEastProcedure.execute(world, x, y + 1, z);
					}
				});
			}
		}
	}
}
