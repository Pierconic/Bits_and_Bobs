package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;

public class LightningGlowProcedure {
	public static boolean execute(LevelAccessor world) {
		if (world.getLevelData().isThundering() || world.getLevelData().isRaining()) {
			return true;
		}
		return false;
	}
}
