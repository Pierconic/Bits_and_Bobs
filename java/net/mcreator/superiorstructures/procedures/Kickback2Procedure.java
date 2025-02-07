package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class Kickback2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double xkickback = 0;
		double zkickback = 0;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + entity.getLookAngle().x * (-0.5)), (entity.getDeltaMovement().y() + 0.3), (entity.getDeltaMovement().z() + entity.getLookAngle().z * (-0.5))));
	}
}
