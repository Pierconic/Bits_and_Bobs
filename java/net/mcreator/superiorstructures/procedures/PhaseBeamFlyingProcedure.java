package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.entity.PhaseOrbEntity;

import java.util.List;
import java.util.Comparator;

public class PhaseBeamFlyingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean range_break = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator instanceof PhaseOrbEntity) && !((entity instanceof PhaseOrbEntity _datEntS ? _datEntS.getEntityData().get(PhaseOrbEntity.DATA_Owner) : "").equals(entityiterator.getStringUUID()))) {
					entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 6);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:randomteleport")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:randomteleport")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 15, 0.05, 0.05, 0.05, 0);
				}
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(48 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if ((entity instanceof PhaseOrbEntity _datEntS ? _datEntS.getEntityData().get(PhaseOrbEntity.DATA_Owner) : "").equals(entityiterator.getStringUUID())) {
					entity.setDeltaMovement(new Vec3((entityiterator.getLookAngle().x * 0.6), (entityiterator.getLookAngle().y * 0.6), (entityiterator.getLookAngle().z * 0.6)));
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 3, 0.05, 0.05, 0.05, 0);
		if ((entity instanceof PhaseOrbEntity _datEntI ? _datEntI.getEntityData().get(PhaseOrbEntity.DATA_Lifetime) : 0) == 0) {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 15, 0.05, 0.05, 0.05, 0);
		} else {
			if (entity instanceof PhaseOrbEntity _datEntSetI)
				_datEntSetI.getEntityData().set(PhaseOrbEntity.DATA_Lifetime, (int) ((entity instanceof PhaseOrbEntity _datEntI ? _datEntI.getEntityData().get(PhaseOrbEntity.DATA_Lifetime) : 0) - 1));
		}
	}
}
