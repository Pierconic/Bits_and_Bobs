package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

import java.util.Comparator;

public class ActiveBeamstoneUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty() && !(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
				}
				return false;
			}
		}.checkGamemode(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)))) && (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip4 ? blockstate.getValue(_getip4) : -1) == 0
				|| (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip6 ? blockstate.getValue(_getip6) : -1) == 1 && world instanceof Level _level7
						&& _level7.hasNeighborSignal(BlockPos.containing(x, y, z))) {
			if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection(blockstate)) == Direction.NORTH) {
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))
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
							BlockPos _pos = BlockPos.containing(x, y, z - 1);
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:zappable_glass")))) {
					DirectionalLaserGlassProcedure.execute(world, x, y, z);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.TINTED_GLASS) {
					world.setBlock(BlockPos.containing(x, y, z - 1), SuperiorstructuresModBlocks.TINTED_GLASS_WITH_LASER.get().defaultBlockState(), 3);
				}
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection(blockstate)) == Direction.SOUTH) {
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))
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
				} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:zappable_glass")))) {
					DirectionalLaserGlassProcedure.execute(world, x, y, z);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.TINTED_GLASS) {
					world.setBlock(BlockPos.containing(x, y, z + 1), SuperiorstructuresModBlocks.TINTED_GLASS_WITH_LASER.get().defaultBlockState(), 3);
				}
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection(blockstate)) == Direction.WEST) {
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))
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
				} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable_glass")))) {
					DirectionalLaserGlassProcedure.execute(world, x, y, z);
				} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.TINTED_GLASS) {
					world.setBlock(BlockPos.containing(x - 1, y, z), SuperiorstructuresModBlocks.TINTED_GLASS_WITH_LASER.get().defaultBlockState(), 3);
				}
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection(blockstate)) == Direction.EAST) {
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))
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
				} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable_glass")))) {
					DirectionalLaserGlassProcedure.execute(world, x, y, z);
				} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.TINTED_GLASS) {
					world.setBlock(BlockPos.containing(x + 1, y, z), SuperiorstructuresModBlocks.TINTED_GLASS_WITH_LASER.get().defaultBlockState(), 3);
				}
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection(blockstate)) == Direction.UP) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))
						&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get())
						&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get())
						&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get())
						&& !((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get())) {
					if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getFluidState().isSource()) {
						{
							BlockPos _pos = BlockPos.containing(x, y + 1, z);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y + 1.5, z + 0.5), null);
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
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y + 1.5, z + 0.5), null);
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
				} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable_glass")))) {
					DirectionalLaserGlassProcedure.execute(world, x, y, z);
				} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.TINTED_GLASS) {
					world.setBlock(BlockPos.containing(x, y + 1, z), SuperiorstructuresModBlocks.TINTED_GLASS_WITH_LASER.get().defaultBlockState(), 3);
				}
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection(blockstate)) == Direction.DOWN) {
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))
						&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get())
						&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get())
						&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get())
						&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get())) {
					if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getFluidState().isSource()) {
						{
							BlockPos _pos = BlockPos.containing(x, y - 1, z);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y - 0.5, z + 0.5), null);
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
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y - 0.5, z + 0.5), null);
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
				} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable_glass")))) {
					DirectionalLaserGlassProcedure.execute(world, x, y, z);
				} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.TINTED_GLASS) {
					world.setBlock(BlockPos.containing(x, y - 1, z), SuperiorstructuresModBlocks.TINTED_GLASS_WITH_LASER.get().defaultBlockState(), 3);
				}
			}
		} else {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = SuperiorstructuresModBlocks.DORMANT_BEAMSTONE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.conduit.deactivate")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.conduit.deactivate")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
