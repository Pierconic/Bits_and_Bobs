package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;

public class FranklinCountdownDeincrementProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).franklin_cooldown > 0) {
			{
				SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
				_vars.franklin_cooldown = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).franklin_cooldown - 1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
