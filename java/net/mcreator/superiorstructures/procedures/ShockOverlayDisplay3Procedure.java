package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.init.SuperiorstructuresModMobEffects;

public class ShockOverlayDisplay3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(SuperiorstructuresModMobEffects.SHOCK)
				&& (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).shock_frames == 4 || entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).shock_frames == 5)) {
			return true;
		}
		return false;
	}
}
