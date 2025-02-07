package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.init.SuperiorstructuresModMobEffects;

public class ApplyCurseTypeProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(SuperiorstructuresModMobEffects.MANSION_CURSE)) {
			{
				SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
				_vars.CurseType = 1;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(SuperiorstructuresModMobEffects.TOWER_CURSE)) {
			{
				SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
				_vars.CurseType = 2;
				_vars.syncPlayerVariables(entity);
			}
		} else if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(SuperiorstructuresModMobEffects.FORTRESS_CURSE)) {
			{
				SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
				_vars.CurseType = 3;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
