package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class SpreadOutpostBuildingsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Math.random() < 0.75) {
				PlaceOutpostBuildingProcedure.execute(world, x + Mth.nextInt(RandomSource.create(), 20, 32), y, z + Mth.nextInt(RandomSource.create(), -5, 5));
			}
			if (Math.random() < 0.75) {
				PlaceOutpostBuildingProcedure.execute(world, x + Mth.nextInt(RandomSource.create(), -32, -20), y, z + Mth.nextInt(RandomSource.create(), -5, 5));
			}
			if (Math.random() < 0.75) {
				PlaceOutpostBuildingProcedure.execute(world, x + Mth.nextInt(RandomSource.create(), -5, 5), y, z + Mth.nextInt(RandomSource.create(), -32, -20));
			}
			if (Math.random() < 0.75) {
				PlaceOutpostBuildingProcedure.execute(world, x + Mth.nextInt(RandomSource.create(), -5, 5), y, z + Mth.nextInt(RandomSource.create(), 20, 32));
			}
			if (Math.random() < 0.5) {
				PlaceOutpostBuildingProcedure.execute(world, x + Mth.nextInt(RandomSource.create(), -32, -20), y, z + Mth.nextInt(RandomSource.create(), -32, -20));
			}
			if (Math.random() < 0.5) {
				PlaceOutpostBuildingProcedure.execute(world, x + Mth.nextInt(RandomSource.create(), 20, 32), y, z + Mth.nextInt(RandomSource.create(), -32, -20));
			}
			if (Math.random() < 0.5) {
				PlaceOutpostBuildingProcedure.execute(world, x + Mth.nextInt(RandomSource.create(), -32, -20), y, z + Mth.nextInt(RandomSource.create(), 20, 32));
			}
			if (Math.random() < 0.5) {
				PlaceOutpostBuildingProcedure.execute(world, x + Mth.nextInt(RandomSource.create(), 20, 32), y, z + Mth.nextInt(RandomSource.create(), 20, 32));
			}
		}
	}
}
