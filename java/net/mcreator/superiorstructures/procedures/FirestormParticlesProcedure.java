package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.superiorstructures.entity.ThrownChakramEntity;

public class FirestormParticlesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double radius = 0;
		double sx = 0;
		double sz = 0;
		double drag = 0;
		double theta = 0;
		double jumper = 0;
		for (int index0 = 0; index0 < 40; index0++) {
			theta = jumper * 9;
			radius = 1;
			sx = radius * Math.sin(theta);
			sz = radius * Math.cos(theta);
			world.addParticle(ParticleTypes.FLAME, (x + sx), (y - 1), (z + sz), (entity.getDeltaMovement().x()), 0.1, (entity.getDeltaMovement().z()));
			if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Firestorm) : 0) >= 2 && Math.random() < 0.6) {
				radius = 2;
				sx = radius * Math.sin(theta);
				sz = radius * Math.cos(theta);
				world.addParticle(ParticleTypes.FLAME, (x + sx), (y - 0.3), (z + sz), (entity.getDeltaMovement().x()), 0.1, (entity.getDeltaMovement().z()));
			}
			if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Firestorm) : 0) >= 3 && Math.random() < 0.3) {
				jumper = jumper + 1;
				radius = 3;
				sx = radius * Math.sin(theta);
				sz = radius * Math.cos(theta);
				world.addParticle(ParticleTypes.FLAME, (x + sx), (y - 0.3), (z + sz), (entity.getDeltaMovement().x()), 0.1, (entity.getDeltaMovement().z()));
			}
			jumper = jumper + 1;
		}
	}
}
