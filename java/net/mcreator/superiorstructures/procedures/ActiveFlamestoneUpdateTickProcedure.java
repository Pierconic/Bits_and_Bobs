package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
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

public class ActiveFlamestoneUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).isEmpty() && !(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
				}
				return false;
			}
		}.checkGamemode(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 8, 8, 8), e -> true).stream().sorted(new Object() {
			Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
				return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
			}
		}.compareDistOf(x, y, z)).findFirst().orElse(null)))) || world instanceof Level _level3 && _level3.hasNeighborSignal(BlockPos.containing(x, y, z))) {
			if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection(blockstate)) == Direction.NORTH) {
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.NORTH)), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.FLAMETHROWER_END.get()
						&& (world.getBlockState(BlockPos.containing(x, y, z - 2))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
					{
						BlockPos _pos = BlockPos.containing(x, y, z - 2);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z - 1.5), null);
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get().defaultBlockState(), Direction.NORTH)), 3);
					world.setBlock(BlockPos.containing(x, y, z - 2), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.NORTH)), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get()
						&& (world.getBlockState(BlockPos.containing(x, y, z - 3))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
					{
						BlockPos _pos = BlockPos.containing(x, y, z - 2);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z - 2.5), null);
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_BASE.get().defaultBlockState(), Direction.NORTH)), 3);
					world.setBlock(BlockPos.containing(x, y, z - 2), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get().defaultBlockState(), Direction.NORTH)), 3);
					world.setBlock(BlockPos.containing(x, y, z - 3), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.NORTH)), 3);
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
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.SOUTH)), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.FLAMETHROWER_END.get()
						&& (world.getBlockState(BlockPos.containing(x, y, z + 2))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
					{
						BlockPos _pos = BlockPos.containing(x, y, z + 2);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z + 2.5), null);
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get().defaultBlockState(), Direction.SOUTH)), 3);
					world.setBlock(BlockPos.containing(x, y, z + 2), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.SOUTH)), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get()
						&& (world.getBlockState(BlockPos.containing(x, y, z + 3))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
					{
						BlockPos _pos = BlockPos.containing(x, y, z + 3);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y, z + 3.5), null);
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_BASE.get().defaultBlockState(), Direction.SOUTH)), 3);
					world.setBlock(BlockPos.containing(x, y, z + 2), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get().defaultBlockState(), Direction.SOUTH)), 3);
					world.setBlock(BlockPos.containing(x, y, z + 3), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.SOUTH)), 3);
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
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.WEST)), 3);
				} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.FLAMETHROWER_END.get()
						&& (world.getBlockState(BlockPos.containing(x - 2, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
					{
						BlockPos _pos = BlockPos.containing(x - 2, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x - 1.5, y, z + 0.5), null);
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get().defaultBlockState(), Direction.WEST)), 3);
					world.setBlock(BlockPos.containing(x - 2, y, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.WEST)), 3);
				} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get()
						&& (world.getBlockState(BlockPos.containing(x - 3, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
					{
						BlockPos _pos = BlockPos.containing(x - 3, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x - 2.5, y, z + 0.5), null);
						world.destroyBlock(_pos, false);
					}
					world.setBlock(BlockPos.containing(x - 2, y, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_BASE.get().defaultBlockState(), Direction.WEST)), 3);
					world.setBlock(BlockPos.containing(x - 2, y, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get().defaultBlockState(), Direction.WEST)), 3);
					world.setBlock(BlockPos.containing(x - 3, y, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.WEST)), 3);
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
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.EAST)), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.FLAMETHROWER_END.get()
						&& (world.getBlockState(BlockPos.containing(x + 2, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
					{
						BlockPos _pos = BlockPos.containing(x + 2, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 2.5, y, z + 0.5), null);
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get().defaultBlockState(), Direction.EAST)), 3);
					world.setBlock(BlockPos.containing(x + 2, y, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.EAST)), 3);
				} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get()
						&& (world.getBlockState(BlockPos.containing(x + 3, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
					{
						BlockPos _pos = BlockPos.containing(x + 3, y, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 3.5, y, z + 0.5), null);
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_BASE.get().defaultBlockState(), Direction.EAST)), 3);
					world.setBlock(BlockPos.containing(x + 2, y, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get().defaultBlockState(), Direction.EAST)), 3);
					world.setBlock(BlockPos.containing(x + 3, y, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.EAST)), 3);
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
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.UP)), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.FLAMETHROWER_END.get()
						&& (world.getBlockState(BlockPos.containing(x, y + 2, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
					{
						BlockPos _pos = BlockPos.containing(x, y + 2, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y + 2, z + 0.5), null);
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get().defaultBlockState(), Direction.UP)), 3);
					world.setBlock(BlockPos.containing(x, y + 2, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.UP)), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get()
						&& (world.getBlockState(BlockPos.containing(x, y + 3, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
					world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_BASE.get().defaultBlockState(), Direction.UP)), 3);
					world.setBlock(BlockPos.containing(x, y + 2, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get().defaultBlockState(), Direction.UP)), 3);
					world.setBlock(BlockPos.containing(x, y + 3, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.UP)), 3);
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
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.DOWN)), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.FLAMETHROWER_END.get()
						&& (world.getBlockState(BlockPos.containing(x, y - 2, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
					{
						BlockPos _pos = BlockPos.containing(x, y - 2, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y - 2, z + 0.5), null);
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get().defaultBlockState(), Direction.DOWN)), 3);
					world.setBlock(BlockPos.containing(x, y - 2, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.DOWN)), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get()
						&& (world.getBlockState(BlockPos.containing(x, y - 2, z))).is(BlockTags.create(ResourceLocation.parse("forge:zappable")))) {
					{
						BlockPos _pos = BlockPos.containing(x, y - 3, z);
						Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + 0.5, y - 3, z + 0.5), null);
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
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_BASE.get().defaultBlockState(), Direction.DOWN)), 3);
					world.setBlock(BlockPos.containing(x, y - 2, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_MIDDLE.get().defaultBlockState(), Direction.DOWN)), 3);
					world.setBlock(BlockPos.containing(x, y - 3, z), (new Object() {
						public BlockState with(BlockState _bs, Direction newValue) {
							Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
								return _bs.setValue(_dp, newValue);
							_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
							return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
						}
					}.with(SuperiorstructuresModBlocks.FLAMETHROWER_END.get().defaultBlockState(), Direction.DOWN)), 3);
				}
			}
		} else {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = SuperiorstructuresModBlocks.DORMANT_FLAMESTONE.get().defaultBlockState();
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
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}
