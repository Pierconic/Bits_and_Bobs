package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class TotemOfRejuvenationHeartsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		SuperiorstructuresMod.queueServerWork(5, () -> {
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > -2) {
				if (entity instanceof Player _player)
					_player.getFoodData().setFoodLevel((int) ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) - 1));
			}
			if ((entity instanceof Player _plr ? _plr.getFoodData().getFoodLevel() : 0) > 0) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
			}
		});
	}
}
