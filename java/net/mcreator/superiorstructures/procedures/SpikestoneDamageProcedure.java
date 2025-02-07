package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class SpikestoneDamageProcedure {
	public static void execute(LevelAccessor world, double x, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, entity.getY() - 1, z))).getBlock() == SuperiorstructuresModBlocks.SPIKESTONE.get()) {
			if (entity instanceof LivingEntity) {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 3);
			}
			if (entity.getDeltaMovement().y() < 0.5) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.15), (entity.getDeltaMovement().z())));
			}
			if (world instanceof ServerLevel _level) {
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).hurtAndBreak(5, _level, null, _stkprov -> {
				});
			}
		} else if ((world.getBlockState(BlockPos.containing(x, entity.getY() + 1, z))).getBlock() == SuperiorstructuresModBlocks.SPIKESTONE.get()) {
			if (entity instanceof LivingEntity) {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 3);
			}
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() - 0.15), (entity.getDeltaMovement().z())));
			if (world instanceof ServerLevel _level) {
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).hurtAndBreak(5, _level, null, _stkprov -> {
				});
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
			if (entity instanceof LivingEntity) {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 3);
			}
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() - 0.1), (entity.getDeltaMovement().y() + Mth.nextDouble(RandomSource.create(), 0.05, 0.1)), (entity.getDeltaMovement().z())));
			if (world instanceof ServerLevel _level) {
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).hurtAndBreak(5, _level, null, _stkprov -> {
				});
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
			if (entity instanceof LivingEntity) {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 3);
			}
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + 0.1), (entity.getDeltaMovement().y() + Mth.nextDouble(RandomSource.create(), 0.05, 0.1)), (entity.getDeltaMovement().z())));
			if (world instanceof ServerLevel _level) {
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).hurtAndBreak(2, _level, null, _stkprov -> {
				});
			}
		} else if ((new Object() {
			public Direction getDirection(BlockState _bs) {
				Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
				if (_prop instanceof DirectionProperty _dp)
					return _bs.getValue(_dp);
				_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
				return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
			}
		}.getDirection(blockstate)) == Direction.NORTH) {
			if (entity instanceof LivingEntity) {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 3);
			}
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + Mth.nextDouble(RandomSource.create(), 0.05, 0.1)), (entity.getDeltaMovement().z() - 0.1)));
			if (world instanceof ServerLevel _level) {
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).hurtAndBreak(5, _level, null, _stkprov -> {
				});
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
			if (entity instanceof LivingEntity) {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 3);
			}
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + Mth.nextDouble(RandomSource.create(), 0.05, 0.1)), (entity.getDeltaMovement().z() + 0.1)));
			if (world instanceof ServerLevel _level) {
				(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).hurtAndBreak(5, _level, null, _stkprov -> {
				});
			}
		}
	}
}
