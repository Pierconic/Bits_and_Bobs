package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.Entity;

public class FlamestoneDamageProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.fireImmune()) {
			entity.igniteForSeconds(9);
		}
	}
}
