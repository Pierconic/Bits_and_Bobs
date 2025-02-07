package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.init.SuperiorstructuresModMobEffects;

public class CorruptEmbraceConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(SuperiorstructuresModMobEffects.CORRUPTION) && !(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			return true;
		}
		return false;
	}
}
