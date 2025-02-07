package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;

public class ResetPolarityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
			_vars.upwards_polarity = false;
			_vars.syncPlayerVariables(entity);
		}
		{
			SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
			_vars.downwards_polarity = false;
			_vars.syncPlayerVariables(entity);
		}
	}
}
