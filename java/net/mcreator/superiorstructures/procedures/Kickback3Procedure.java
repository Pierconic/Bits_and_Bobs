package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class Kickback3Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double xkickback = 0;
		double zkickback = 0;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + entity.getLookAngle().x * (-0.7)), (entity.getDeltaMovement().y() + 0.4), (entity.getDeltaMovement().z() + entity.getLookAngle().z * (-0.7))));
	}
}
