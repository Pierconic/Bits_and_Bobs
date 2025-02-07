package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;

public class RadianceCondition11Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).radiance >= 40 && entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).radiance < 44) {
			return true;
		}
		return false;
	}
}
