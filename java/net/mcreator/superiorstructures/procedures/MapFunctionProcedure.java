package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;

public class MapFunctionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MappageGenerationProcedure.execute(world, x, y - 1, z);
	}
}
