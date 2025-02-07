package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;

public class HookshotDownPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (4 < entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_length && entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_direction == 0) {
			{
				SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
				_vars.hookshot_direction = 1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
