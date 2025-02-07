package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class GenblockI1InstigateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			GenblockSwapperProcedure.execute(world, x, y, z);
			if (Math.random() <= (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.OCEAN_RUIN_FREQUENCY)) * 0.01
					&& world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:underwater_biomes")))
					|| Math.random() <= (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.RUIN_FREQUENCY)) * 0.01
							&& !world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:underwater_biomes")))) {
				SuperiorstructuresMod.queueServerWork(Mth.nextInt(RandomSource.create(), 20, 25), () -> {
					if (VillageScannerProcedure.execute(world, x, z) == false) {
						GenblockI1BuildProcedure.execute(world, x, y, z);
					}
				});
			}
		}
	}
}
