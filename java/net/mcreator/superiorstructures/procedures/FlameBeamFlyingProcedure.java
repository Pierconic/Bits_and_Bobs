package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class FlameBeamFlyingProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SMALL_FLAME, (immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), 1, 0.05, 0.05, 0.05, 0);
		if (immediatesourceentity.getX() > entity.getX()) {
			if (immediatesourceentity.getX() - entity.getX() >= 15) {
				if (!immediatesourceentity.level().isClientSide())
					immediatesourceentity.discard();
				FlameBlastHitProcedure.execute(world, immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ());
			}
		} else if (immediatesourceentity.getX() < entity.getX()) {
			if (entity.getX() - immediatesourceentity.getX() >= 15) {
				if (!immediatesourceentity.level().isClientSide())
					immediatesourceentity.discard();
				FlameBlastHitProcedure.execute(world, immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ());
			}
		}
		if (immediatesourceentity.getY() > entity.getY()) {
			if (immediatesourceentity.getY() - entity.getY() >= 15) {
				if (!immediatesourceentity.level().isClientSide())
					immediatesourceentity.discard();
				FlameBlastHitProcedure.execute(world, immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ());
			}
		} else if (immediatesourceentity.getY() < entity.getY()) {
			if (entity.getY() - immediatesourceentity.getY() >= 15) {
				if (!immediatesourceentity.level().isClientSide())
					immediatesourceentity.discard();
				FlameBlastHitProcedure.execute(world, immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ());
			}
		}
		if (immediatesourceentity.getZ() > entity.getZ()) {
			if (immediatesourceentity.getZ() - entity.getZ() >= 15) {
				if (!immediatesourceentity.level().isClientSide())
					immediatesourceentity.discard();
				FlameBlastHitProcedure.execute(world, immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ());
			}
		} else if (immediatesourceentity.getZ() < entity.getZ()) {
			if (entity.getZ() - immediatesourceentity.getZ() >= 15) {
				if (!immediatesourceentity.level().isClientSide())
					immediatesourceentity.discard();
				FlameBlastHitProcedure.execute(world, immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ());
			}
		}
	}
}
