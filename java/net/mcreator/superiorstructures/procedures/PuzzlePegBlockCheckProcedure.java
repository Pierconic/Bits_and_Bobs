package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;
import net.mcreator.superiorstructures.entity.PuzzlePegEntity;

public class PuzzlePegBlockCheckProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		Direction target_direction = Direction.NORTH;
		double row = 0;
		double column = 0;
		row = PuzzleRowFromSlotProcedure.execute(entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_slot) : 0);
		column = PuzzleColumnFromSlotProcedure.execute(entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_slot) : 0);
		target_direction = new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection((world.getBlockState(BlockPos.containing(entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0,
				entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0, entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0))));
		if (!((world.getBlockState(BlockPos.containing(entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0,
				entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0, entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0)))
				.getBlock() == SuperiorstructuresModBlocks.PUZZLE_BOX.get())
				|| ((world.getBlockState(BlockPos.containing(entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0,
						entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0,
						entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip16
								? (world.getBlockState(BlockPos.containing(entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0,
										entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0,
										entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0))).getValue(_getip16)
								: -1) == 0) {
			if (!entity.level().isClientSide())
				entity.discard();
		} else {
			if (target_direction == Direction.UP) {
				{
					Entity _ent = entity;
					_ent.setYRot(0);
					_ent.setXRot(90);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0) + 0.875 - 0.25 * column),
							((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0) + 1),
							((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0) + 0.25 * row));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0) + 0.875 - 0.25 * column),
								((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0) + 1),
								((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0) + 0.25 * row), _ent.getYRot(), _ent.getXRot());
				}
			} else if (target_direction == Direction.DOWN) {
				{
					Entity _ent = entity;
					_ent.setYRot(0);
					_ent.setXRot(180);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0) + 0.875 - 0.25 * column),
							((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0) + 0),
							((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0) + 0.25 * row));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0) + 0.875 - 0.25 * column),
								((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0) + 0),
								((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0) + 0.25 * row), _ent.getYRot(), _ent.getXRot());
				}
			} else if (target_direction == Direction.NORTH) {
				{
					Entity _ent = entity;
					_ent.setYRot(180);
					_ent.setXRot(0);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0) + 0.875 - 0.25 * column),
							((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0) + 0.25 * row),
							((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0) + 0));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0) + 0.875 - 0.25 * column),
								((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0) + 0.25 * row),
								((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0) + 0), _ent.getYRot(), _ent.getXRot());
				}
			} else if (target_direction == Direction.SOUTH) {
				{
					Entity _ent = entity;
					_ent.setYRot(0);
					_ent.setXRot(0);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0) + 0.125 + 0.25 * column),
							((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0) + 0.25 * row),
							((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0) + 1));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0) + 0.125 + 0.25 * column),
								((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0) + 0.25 * row),
								((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0) + 1), _ent.getYRot(), _ent.getXRot());
				}
			} else if (target_direction == Direction.EAST) {
				{
					Entity _ent = entity;
					_ent.setYRot(270);
					_ent.setXRot(0);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0) + 1),
							((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0) + 0.25 * row),
							((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0) + 0.875 - 0.25 * column));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0) + 1),
								((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0) + 0.25 * row),
								((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0) + 0.875 - 0.25 * column), _ent.getYRot(), _ent.getXRot());
				}
			} else {
				{
					Entity _ent = entity;
					_ent.setYRot(90);
					_ent.setXRot(0);
					_ent.setYBodyRot(_ent.getYRot());
					_ent.setYHeadRot(_ent.getYRot());
					_ent.yRotO = _ent.getYRot();
					_ent.xRotO = _ent.getXRot();
					if (_ent instanceof LivingEntity _entity) {
						_entity.yBodyRotO = _entity.getYRot();
						_entity.yHeadRotO = _entity.getYRot();
					}
				}
				{
					Entity _ent = entity;
					_ent.teleportTo(((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0) + 0),
							((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0) + 0.25 * row),
							((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0) + 0.125 + 0.25 * column));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0) + 0),
								((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0) + 0.25 * row),
								((entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0) + 0.125 + 0.25 * column), _ent.getYRot(), _ent.getXRot());
				}
			}
			if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0,
					entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0, entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0),
					(int) (entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_slot) : 0))).getItem() == SuperiorstructuresModItems.GLAZED_PUZZLE_PIECE.get()) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.INVISIBILITY);
				if (entity instanceof PuzzlePegEntity _datEntSetS)
					_datEntSetS.getEntityData().set(PuzzlePegEntity.DATA_piece_type, "glaze_1");
			} else if ((new Object() {
				public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
					if (world instanceof ILevelExtension _ext) {
						IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
						if (_itemHandler != null)
							return _itemHandler.getStackInSlot(slotid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack(world, BlockPos.containing(entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_x) : 0,
					entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_y) : 0, entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_puzzle_box_z) : 0),
					(int) (entity instanceof PuzzlePegEntity _datEntI ? _datEntI.getEntityData().get(PuzzlePegEntity.DATA_slot) : 0))).getItem() == SuperiorstructuresModItems.TRAP_PUZZLE_PIECE.get()) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.INVISIBILITY);
				if (entity instanceof PuzzlePegEntity _datEntSetS)
					_datEntSetS.getEntityData().set(PuzzlePegEntity.DATA_piece_type, "glaze_2");
			} else {
				if (entity instanceof PuzzlePegEntity _datEntSetS)
					_datEntSetS.getEntityData().set(PuzzlePegEntity.DATA_piece_type, "");
			}
		}
	}
}
