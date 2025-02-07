package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class GenblockA1InstigateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), (world.getBlockState(BlockPos.containing(x, y + 1, z))), 3);
			if (Math.random() <= (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.DUNGEON_FREQUENCY)) / 100) {
				SuperiorstructuresMod.queueServerWork(Mth.nextInt(RandomSource.create(), 15, 25), () -> {
					DungeonAirProcedure.execute(world, x, y, z);
				});
			}
		}
	}
}
