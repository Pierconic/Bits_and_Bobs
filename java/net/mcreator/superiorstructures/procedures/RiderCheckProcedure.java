package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.Entity;

public class RiderCheckProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.isVehicle()) {
			return false;
		}
		return true;
	}
}
