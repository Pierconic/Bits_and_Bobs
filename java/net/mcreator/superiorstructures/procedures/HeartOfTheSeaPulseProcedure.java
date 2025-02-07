package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.superiorstructures.init.SuperiorstructuresModMobEffects;

import java.util.List;
import java.util.Comparator;

public class HeartOfTheSeaPulseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean guardian_found = false;
		guardian_found = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(128 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Guardian) {
					guardian_found = true;
				}
				if (entityiterator instanceof Player && !(entityiterator instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(SuperiorstructuresModMobEffects.MONUMENT_CURSE))) {
					if (guardian_found) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(SuperiorstructuresModMobEffects.MONUMENT_CURSE, 650, 1, false, false));
					} else {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(SuperiorstructuresModMobEffects.MONUMENT_CURSE, 100, 1, false, false));
					}
				}
			}
		}
	}
}
