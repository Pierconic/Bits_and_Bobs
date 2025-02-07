package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.superiorstructures.entity.ThrownChakramEntity;

public class WhirlwindParticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, x, y, z, 5, 0.1, 0.1, 0.1, 0.1);
		for (int index0 = 0; index0 < (int) (5 + (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Whirlwind) : 0)); index0++) {
			world.addParticle(ParticleTypes.POOF, (x + Mth.nextDouble(RandomSource.create(), -0.3, 0.3)), (y + 0.2), (z + Mth.nextDouble(RandomSource.create(), -0.3, 0.3)), 0,
					(0.1 * (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Whirlwind) : 0)), 0);
		}
	}
}
