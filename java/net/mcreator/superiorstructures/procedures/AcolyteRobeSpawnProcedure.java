package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;
import net.mcreator.superiorstructures.entity.AcolyteRobeEntity;

import java.util.List;
import java.util.Comparator;

public class AcolyteRobeSpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sz = 0;
		double sy = 0;
		boolean found = false;
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 32, 32, 32), e -> true).isEmpty()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.ACOLYTE_ROBE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setDeltaMovement((entity.getLookAngle().x * (-0.2)), 0.4, (entity.getLookAngle().z * (-0.2)));
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof AcolyteRobeEntity) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, 80, 1, false, false));
					} else if (entityiterator instanceof Player) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 40, 1, false, false));
					}
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x, (y + 0.5), z, 15, 0.2, 0.2, 0.2, 0.05);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:acolyte_vanish")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:acolyte_vanish")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			found = false;
			for (int index0 = 0; index0 < 16; index0++) {
				if (!found) {
					if (Math.random() < 0.25) {
						sx = Math.floor(x) + Mth.nextInt(RandomSource.create(), -8, 8);
						sz = Math.floor(z) + Mth.nextInt(RandomSource.create(), -15, -8);
					} else if (Math.random() < 0.25) {
						sx = Math.floor(x) + Mth.nextInt(RandomSource.create(), -15, -8);
						sz = Math.floor(z) + Mth.nextInt(RandomSource.create(), -8, 8);
					} else if (Math.random() < 0.25) {
						sx = Math.floor(x) + Mth.nextInt(RandomSource.create(), 8, 15);
						sz = Math.floor(z) + Mth.nextInt(RandomSource.create(), -8, 8);
					} else {
						sx = Math.floor(x) + Mth.nextInt(RandomSource.create(), -8, 8);
						sz = Math.floor(z) + Mth.nextInt(RandomSource.create(), 8, 15);
					}
					sy = Math.floor(y) - 5;
					for (int index1 = 0; index1 < 10; index1++) {
						if (!found && world.getBlockState(BlockPos.containing(sx, sy - 1, sz)).canOcclude() && !world.getBlockState(BlockPos.containing(sx, sy + 1, sz)).canOcclude()
								&& !world.getBlockState(BlockPos.containing(sx, sy, sz)).canOcclude()) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = SuperiorstructuresModEntities.ANGRY_ACOLYTE.get().spawn(_level, BlockPos.containing(sx, sy, sz), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.POOF, sx, sy, sz, 15, 0.2, 0.2, 0.2, 0.1);
							found = true;
						} else {
							sy = sy + 1;
						}
					}
				}
			}
		}
	}
}
