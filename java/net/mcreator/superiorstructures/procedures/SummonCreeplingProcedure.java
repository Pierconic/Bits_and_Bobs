package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;

public class SummonCreeplingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, (x + 0.5), (y + 0.5), (z + 0.5), 10, 0.2, 0.2, 0.2, 0);
		if (Math.random() < 0.4) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.CREEPLET.get().spawn(_level, BlockPos.containing(x + 0.5, y + 0.5, z + 0.5), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
		}
	}
}
