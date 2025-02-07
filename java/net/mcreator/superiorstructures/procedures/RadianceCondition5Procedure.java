package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;

public class RadianceCondition5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).radiance >= 16 && entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).radiance < 20) {
			return true;
		}
		return false;
	}
}
