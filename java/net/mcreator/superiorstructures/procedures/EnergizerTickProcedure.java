package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class EnergizerTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			if (!entity.level().isClientSide())
				entity.discard();
			EnergizeProcedure.execute(world, x, y - 1, z);
		}
	}
}
