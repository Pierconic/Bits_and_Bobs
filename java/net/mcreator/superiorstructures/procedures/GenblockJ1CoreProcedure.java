package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class GenblockJ1CoreProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double numerator = 0;
		numerator = Mth.nextInt(RandomSource.create(), 0, 2);
		TempleSprawlProcedure.execute(world, x, y, z);
	}
}
