package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

public class ChakramDeflectionProcedure {
	public static boolean execute(DamageSource damagesource, Entity entity, Entity sourceentity) {
		if (damagesource == null || entity == null || sourceentity == null)
			return false;
		if (damagesource.is(DamageTypes.ON_FIRE)) {
			return false;
		} else if (sourceentity instanceof LivingEntity) {
			entity.setDeltaMovement(new Vec3((sourceentity.getLookAngle().x * 1.2), 0, (sourceentity.getLookAngle().z * 1.2)));
		}
		return true;
	}
}
