package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import java.util.List;
import java.util.Comparator;

public class GoldenGolemLaunchProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double magnitude = 0;
		double theta = 0;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 32, 3, 3, 3, 0.1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 16, 1.5, 1.5, 1.5, 0.1);
		{
			final Vec3 _center = new Vec3((x + 0.5), (y + 0.5), (z + 0.5));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Monster) {
					entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 8);
					magnitude = 1;
					theta = Math.atan(Math.abs(x - entityiterator.getX()) / Math.abs(z - entityiterator.getZ()));
					sx = magnitude * Math.sin(theta);
					sz = magnitude * Math.cos(theta);
					sy = 1;
					if (entityiterator.getX() < x) {
						sx = sx * (-1);
					}
					if (entityiterator.getZ() < z) {
						sz = sz * (-1);
					}
					if (entityiterator.isShiftKeyDown() || entityiterator instanceof LivingEntity _livEnt10 && _livEnt10.isBlocking()) {
						sx = sx * 0.65;
						sy = sy * 0.65;
						sz = sz * 0.65;
					}
					entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x() + sx), (entityiterator.getDeltaMovement().y() + sy), (entityiterator.getDeltaMovement().z() + sz)));
				}
			}
		}
	}
}
