package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.entity.ThrownChakramEntity;

import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public class ChakramFliesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double falaffel = 0;
		double sharpness_modifier = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double magnitude = 0;
		double theta = 0;
		Entity target_owner = null;
		Entity target_bouncer = null;
		falaffel = 0.95;
		if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Firestorm) : 0) > 0
				&& (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Interval) : 0) == 3) {
			FirestormParticlesProcedure.execute(world, x, y, z, entity);
		} else if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Whirlwind) : 0) > 0
				&& (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Interval) : 0) == 3) {
			WhirlwindParticlesProcedure.execute(world, x, y, z, entity);
		}
		if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Interval) : 0) > 0) {
			if (entity instanceof ThrownChakramEntity _datEntSetI)
				_datEntSetI.getEntityData().set(ThrownChakramEntity.DATA_Interval, (int) ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Interval) : 0) - 1));
		} else {
			if (entity instanceof ThrownChakramEntity _datEntSetI)
				_datEntSetI.getEntityData().set(ThrownChakramEntity.DATA_Interval, 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:chakram.woosh")), SoundSource.NEUTRAL, (float) 0.3,
							(float) Mth.nextDouble(RandomSource.create(), 0.65, 0.85));
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:chakram.woosh")), SoundSource.NEUTRAL, (float) 0.3, (float) Mth.nextDouble(RandomSource.create(), 0.65, 0.85), false);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 0.5))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z + 0.5);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z - 0.5))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y, z - 0.5);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x - 0.5, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
			{
				BlockPos _pos = BlockPos.containing(x - 0.5, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + 0.5, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
			{
				BlockPos _pos = BlockPos.containing(x + 0.5, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
				world.destroyBlock(_pos, false);
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if ((entityiterator.getStringUUID()).equals(entity instanceof ThrownChakramEntity _datEntS ? _datEntS.getEntityData().get(ThrownChakramEntity.DATA_Owner) : "")
							&& (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Interval) : 0) <= 3 || entityiterator instanceof ThrownChakramEntity) {
						if (entity instanceof ThrownChakramEntity _datEntSetI)
							_datEntSetI.getEntityData().set(ThrownChakramEntity.DATA_Lifetime, -1);
						if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Whirlwind) : 0) > 0) {
							entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x() * 2.5), (0.6 * (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Whirlwind) : 0)),
									(entityiterator.getDeltaMovement().z() * 2.5)));
						}
					}
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world
					.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate((1 + (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Firestorm) : 0)) / 2d), e -> true).stream()
					.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (!((entityiterator.getStringUUID()).equals(entity instanceof ThrownChakramEntity _datEntS ? _datEntS.getEntityData().get(ThrownChakramEntity.DATA_Owner) : ""))
							&& (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Interval) : 0) <= 3 && entityiterator instanceof LivingEntity
							&& !(entityiterator instanceof ThrownChakramEntity)) {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:chakram.hit")), SoundSource.NEUTRAL, (float) 0.6, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:chakram.hit")), SoundSource.NEUTRAL, (float) 0.6, 1, false);
							}
						}
						if (entity instanceof ThrownChakramEntity _datEntSetI)
							_datEntSetI.getEntityData().set(ThrownChakramEntity.DATA_Damage, (int) ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Damage) : 0) + 1));
						if (!(entityiterator instanceof LivingEntity _livEnt44 && _livEnt44.isBlocking()) && !(entityiterator instanceof LivingEntity _livEnt45 && _livEnt45.hasEffect(MobEffects.UNLUCK))) {
							entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), (float) ((6 + (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Sharpness) : 0))
									- (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Firestorm) : 0)));
							if (entity.isOnFire()) {
								entityiterator.igniteForSeconds(Mth.nextInt(RandomSource.create(), 5, 8));
							}
							if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Richochet) : 0) > 0) {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 60, 0, true, true));
								ChakramRicochetProcedure.execute(world, x, y, z, entity);
							}
						}
						if (Math.abs(entity.getDeltaMovement().x()) + Math.abs(entity.getDeltaMovement().z()) > 0.1) {
							entityiterator.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * (1.2 + 0.25 * (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Punch) : 0))),
									(0.15 + 0.1 * (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Whirlwind) : 0)),
									(entity.getDeltaMovement().z() * (1.2 + 0.25 * (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Punch) : 0)))));
						} else {
							entityiterator.setDeltaMovement(new Vec3(
									(entityiterator.getDeltaMovement().x() + Mth.nextDouble(RandomSource.create(), (-0.4) - 0.3 * (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Punch) : 0),
											0.4 + 0.3 * (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Punch) : 0))),
									(0.35 + 0.1 * (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Whirlwind) : 0)),
									(entityiterator.getDeltaMovement().z() + Mth.nextDouble(RandomSource.create(), (-0.4) - 0.3 * (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Punch) : 0),
											0.4 + 0.3 * (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Punch) : 0)))));
						}
					}
				}
			}
		}
		if (Math.abs(entity.getDeltaMovement().x()) + Math.abs(entity.getDeltaMovement().z()) > 0.1) {
			if (world.getBlockState(BlockPos.containing(x + entity.getDeltaMovement().x() * 1.5, y, z)).canOcclude() || world.getBlockState(BlockPos.containing(x, y, z + entity.getDeltaMovement().z() * 1.5)).canOcclude()) {
				if (world.getBlockState(BlockPos.containing(x, y, z + entity.getDeltaMovement().z() * 1.5)).canOcclude()) {
					if ((world.getBlockState(BlockPos.containing(x, y, z + entity.getDeltaMovement().z() * 1.5))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						{
							BlockPos _pos = BlockPos.containing(x, y, z + entity.getDeltaMovement().z() * 1.5);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:chakram.bounce")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:chakram.bounce")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() * (-1))));
					}
				}
				if (world.getBlockState(BlockPos.containing(x + entity.getDeltaMovement().x() * 1.5, y, z)).canOcclude()) {
					if ((world.getBlockState(BlockPos.containing(x + entity.getDeltaMovement().x() * 1.5, y, z))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
						{
							BlockPos _pos = BlockPos.containing(x + entity.getDeltaMovement().x() * 1.5, y, z);
							Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
							world.destroyBlock(_pos, false);
						}
					} else {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:chakram.bounce")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:chakram.bounce")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * (-1)), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
					}
				}
			} else {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * falaffel), (entity.getDeltaMovement().y() * falaffel), (entity.getDeltaMovement().z() * falaffel)));
			}
		} else if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Lifetime) : 0) < 0) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if ((entityiterator.getStringUUID()).equals(entity instanceof ThrownChakramEntity _datEntS ? _datEntS.getEntityData().get(ThrownChakramEntity.DATA_Owner) : "")) {
					target_owner = entityiterator;
				}
			}
			if (target_owner.isAlive()) {
				magnitude = 0.5;
				theta = Math.atan(Math.abs(target_owner.getX() - entity.getX()) / Math.abs(target_owner.getZ() - entity.getZ()));
				sx = magnitude * Math.sin(theta);
				sz = magnitude * Math.cos(theta);
				if (target_owner.getX() < entity.getX()) {
					sx = sx * (-1);
				}
				if (target_owner.getZ() < entity.getZ()) {
					sz = sz * (-1);
				}
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + sx * (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Loyalty) : 0)), (entity.getDeltaMovement().y()),
						(entity.getDeltaMovement().z() + sz * (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Loyalty) : 0))));
			}
		} else {
			entity.setDeltaMovement(new Vec3(0, 0, 0));
			if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Lifetime) : 0) == 0) {
				if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Loyalty) : 0) > 0) {
					if (entity instanceof ThrownChakramEntity _datEntSetI)
						_datEntSetI.getEntityData().set(ThrownChakramEntity.DATA_Lifetime, -300);
				} else {
					ChakramConvertProcedure.execute(world, x, y, z, entity);
				}
			} else if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Lifetime) : 0) > 0) {
				if (entity instanceof ThrownChakramEntity _datEntSetI)
					_datEntSetI.getEntityData().set(ThrownChakramEntity.DATA_Lifetime, (int) ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Lifetime) : 0) - 1));
			}
		}
		if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Lifetime) : 0) == -1) {
			ChakramConvertProcedure.execute(world, x, y, z, entity);
		} else if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Lifetime) : 0) < 0) {
			if (entity instanceof ThrownChakramEntity _datEntSetI)
				_datEntSetI.getEntityData().set(ThrownChakramEntity.DATA_Lifetime, (int) ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Lifetime) : 0) + 1));
		}
	}
}
