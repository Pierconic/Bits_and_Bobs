package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.superiorstructures.init.SuperiorstructuresModMobEffects;

import java.util.List;
import java.util.Comparator;

public class ActivatedInfernoPulseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double ox = 0;
		double oz = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(128 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player && !(entityiterator instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(SuperiorstructuresModMobEffects.FORTRESS_CURSE))) {
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(SuperiorstructuresModMobEffects.FORTRESS_CURSE, 400, 1, false, false));
				}
			}
		}
	}
}
