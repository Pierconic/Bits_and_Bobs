package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;

public class ReturnFranklinStateProcedure {
	public static double execute(Entity entity) {
		if (entity == null)
			return 0;
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).franklin_cooldown > 0) {
			return 1;
		}
		return 0;
	}
}
