package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;

public class RadianceCondition10Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).radiance >= 36 && entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).radiance < 40) {
			return true;
		}
		return false;
	}
}
