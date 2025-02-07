package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

import java.util.List;
import java.util.Comparator;

public class Fan1EntityBlowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean blocked = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double n = 0;
		double power = 0;
		double distance = 0;
		double modifier = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_FAN.get() || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_FAN_2.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_FAN_3.get()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_FAN.get()) {
				power = 0.02;
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_FAN_2.get()) {
				power = 0.03;
			} else {
				power = 0.042;
			}
			n = 1;
			if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(Math.floor(x), Math.floor(y), Math.floor(z)))))) == Direction.DOWN) {
				sx = 0;
				sy = -1;
				sz = 0;
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(Math.floor(x), Math.floor(y), Math.floor(z)))))) == Direction.UP) {
				sx = 0;
				sy = 1;
				sz = 0;
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(Math.floor(x), Math.floor(y), Math.floor(z)))))) == Direction.NORTH) {
				sx = 0;
				sy = 0;
				sz = -1;
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(Math.floor(x), Math.floor(y), Math.floor(z)))))) == Direction.SOUTH) {
				sx = 0;
				sy = 0;
				sz = 1;
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(Math.floor(x), Math.floor(y), Math.floor(z)))))) == Direction.WEST) {
				sx = -1;
				sy = 0;
				sz = 0;
			} else if ((new Object() {
				public Direction getDirection(BlockState _bs) {
					Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
					if (_prop instanceof DirectionProperty _dp)
						return _bs.getValue(_dp);
					_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
					return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis ? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE) : Direction.NORTH;
				}
			}.getDirection((world.getBlockState(BlockPos.containing(Math.floor(x), Math.floor(y), Math.floor(z)))))) == Direction.EAST) {
				sx = 1;
				sy = 0;
				sz = 0;
			}
			for (int index0 = 0; index0 < 15; index0++) {
				if (!blocked) {
					if (world.getBlockState(BlockPos.containing(Math.floor(x + n * sx), Math.floor(y + n * sy), Math.floor(z + n * sz))).isFaceSturdy(world, BlockPos.containing(Math.floor(x + n * sx), Math.floor(y + n * sy), Math.floor(z + n * sz)),
							Direction.UP) && !(world.getBlockState(BlockPos.containing(Math.floor(x + n * sx), Math.floor(y + n * sy), Math.floor(z + n * sz)))).is(BlockTags.create(ResourceLocation.parse("forge:fan_permeable")))) {
						blocked = true;
					} else {
						if (Math.random() < power * 5) {
							if ((world.getBlockState(BlockPos.containing(Math.floor(x + n * sx), Math.floor(y + n * sy), Math.floor(z + n * sz)))).is(BlockTags.create(ResourceLocation.parse("minecraft:wooden_doors")))
									|| (world.getBlockState(BlockPos.containing(Math.floor(x + n * sx), Math.floor(y + n * sy), Math.floor(z + n * sz)))).is(BlockTags.create(ResourceLocation.parse("minecraft:wooden_trapdoors")))) {
								{
									BlockPos _pos = BlockPos.containing(Math.floor(x + n * sx), Math.floor(y + n * sy), Math.floor(z + n * sz));
									BlockState _bs = world.getBlockState(_pos);
									if (_bs.getBlock().getStateDefinition().getProperty("open") instanceof BooleanProperty _booleanProp)
										world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
								}
							} else if ((world.getBlockState(BlockPos.containing(Math.floor(x + n * sx), Math.floor(y + n * sy), Math.floor(z + n * sz)))).is(BlockTags.create(ResourceLocation.parse("minecraft:wooden_buttons")))
									|| (world.getBlockState(BlockPos.containing(Math.floor(x + n * sx), Math.floor(y + n * sy), Math.floor(z + n * sz)))).is(BlockTags.create(ResourceLocation.parse("minecraft:wooden_pressure_plates")))
									|| (world.getBlockState(BlockPos.containing(Math.floor(x + n * sx), Math.floor(y + n * sy), Math.floor(z + n * sz)))).getBlock() == Blocks.LEVER) {
								{
									BlockPos _pos = BlockPos.containing(Math.floor(x + n * sx), Math.floor(y + n * sy), Math.floor(z + n * sz));
									BlockState _bs = world.getBlockState(_pos);
									if (_bs.getBlock().getStateDefinition().getProperty("powered") instanceof BooleanProperty _booleanProp)
										world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
								}
							}
							if ((world.getBlockState(BlockPos.containing(Math.floor(x + n * sx), Math.floor(y + n * sy), Math.floor(z + n * sz)))).getFluidState().isSource()
									|| (world.getBlockState(BlockPos.containing(Math.floor(x + n * sx), Math.floor(y + n * sy), Math.floor(z + n * sz)))).getBlock() instanceof LiquidBlock) {
								world.addParticle(ParticleTypes.BUBBLE, (x + n * sx + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (y + n * sy + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)),
										(z + n * sz + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (sx * power * 3), (sy * power * 3), (sz * power * 3));
							} else {
								world.addParticle(ParticleTypes.CLOUD, (x + n * sx + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (y + n * sy + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)),
										(z + n * sz + Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (sx * power * 3), (sy * power * 3), (sz * power * 3));
							}
						}
						{
							final Vec3 _center = new Vec3((x + n * sx), (y + n * sy), (z + n * sz));
							List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
							for (Entity entityiterator : _entfound) {
								if ((entityiterator instanceof ItemEntity || entityiterator instanceof LivingEntity) && !entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("forge:fan_immune")))) {
									if (entityiterator.isShiftKeyDown()) {
										modifier = 0.5;
									} else {
										modifier = 1;
									}
									if (Math.abs(entityiterator.getDeltaMovement().x()) < 1) {
										entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x() + sx * power * modifier), (entityiterator.getDeltaMovement().y()), (entityiterator.getDeltaMovement().z())));
									}
									if (entityiterator.getDeltaMovement().y() < 1) {
										entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x()), (entityiterator.getDeltaMovement().y() + sy * power * modifier), (entityiterator.getDeltaMovement().z())));
									}
									if (Math.abs(entityiterator.getDeltaMovement().z()) < 1) {
										entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x()), (entityiterator.getDeltaMovement().y()), (entityiterator.getDeltaMovement().z() + sz * power * modifier)));
									}
								}
							}
						}
						n = n + 1;
					}
				}
			}
		} else {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
