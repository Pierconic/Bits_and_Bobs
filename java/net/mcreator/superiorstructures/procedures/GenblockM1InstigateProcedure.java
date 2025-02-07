package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class GenblockM1InstigateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), (world.getBlockState(BlockPos.containing(x, y + 1, z))), 3);
			if (Math.random() <= (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.MINESHAFT_FREQUENCY)) * 0.01) {
				SuperiorstructuresMod.queueServerWork(Mth.nextInt(RandomSource.create(), 5, 11), () -> {
					if (world.getBiome(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z), z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:gold_mineshaft")))) {
						GenblockM1BuildProcedure.execute(world, x, y - 24, z);
					} else {
						GenblockM1BuildProcedure.execute(world, x, Mth.nextInt(RandomSource.create(), 5, 16), z);
					}
				});
			}
		}
	}
}
