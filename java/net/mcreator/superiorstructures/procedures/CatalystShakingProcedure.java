package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.Entity;

public class CatalystShakingProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.onGround()) {
			return true;
		}
		return false;
	}
}
