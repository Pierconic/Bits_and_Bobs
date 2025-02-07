package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class SpecterDeathProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, 0.2, 0.2, 0.2, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SOUL, x, y, z, 8, 0.2, 0.2, 0.2, 0.3);
	}
}
