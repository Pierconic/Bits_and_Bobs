package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.Entity;

public class ArbitraryKickbackProcedure {
	public static void execute(Entity entity, double modifier) {
		if (entity == null)
			return;
		double xkickback = 0;
		double zkickback = 0;
		entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + entity.getLookAngle().x * modifier * (-1)), (entity.getDeltaMovement().y() + entity.getLookAngle().y * modifier * (-1) + modifier * 0.25),
				(entity.getDeltaMovement().z() + entity.getLookAngle().z * modifier * (-1))));
	}
}
