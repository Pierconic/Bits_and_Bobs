package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.entity.PuzzlePegEntity;

public class PuzzlePegGlazed0ConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity instanceof PuzzlePegEntity _datEntS ? _datEntS.getEntityData().get(PuzzlePegEntity.DATA_piece_type) : "").equals("glaze_1")) {
			return true;
		}
		return false;
	}
}
