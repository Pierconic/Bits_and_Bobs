package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class ChargedFlameOrbFlyingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SMALL_FLAME, x, y, z, Mth.nextInt(RandomSource.create(), 3, 4), 0.1, 0.1, 0.1, 0.05);
	}
}
