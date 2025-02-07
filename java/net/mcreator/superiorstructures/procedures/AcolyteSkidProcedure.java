package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class AcolyteSkidProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + sourceentity.getLookAngle().x * 0.4), (entity.getDeltaMovement().y() + 0.1), (entity.getDeltaMovement().z() + sourceentity.getLookAngle().z * 0.4)));
		}
	}
}
