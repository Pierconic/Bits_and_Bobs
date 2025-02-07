package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

import net.mcreator.superiorstructures.entity.PuzzlePegEntity;

public class PuzzlePegGlazed1ConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof PuzzlePegEntity _datEntS ? _datEntS.getEntityData().get(PuzzlePegEntity.DATA_piece_type) : "").equals("glaze_1") && !(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(MobEffects.INVISIBILITY))) {
			return true;
		}
		return false;
	}
}
