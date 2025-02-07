package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.entity.PuzzlePegEntity;

public class PuzzlePegClickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof PuzzlePegEntity _datEntS ? _datEntS.getEntityData().get(PuzzlePegEntity.DATA_piece_type) : "").equals("blank")) {
			if (entity instanceof PuzzlePegEntity _datEntSetS)
				_datEntSetS.getEntityData().set(PuzzlePegEntity.DATA_piece_type, "test");
		} else {
			if (entity instanceof PuzzlePegEntity _datEntSetS)
				_datEntSetS.getEntityData().set(PuzzlePegEntity.DATA_piece_type, "blank");
		}
	}
}
