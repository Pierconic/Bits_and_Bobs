package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.Entity;

public class CreeplingOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("fuse", 0);
	}
}
