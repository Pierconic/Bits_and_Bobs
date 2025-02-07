package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class FrostOrbFlyingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SNOWFLAKE, x, y, z, Mth.nextInt(RandomSource.create(), 1, 2), 0.1, 0.1, 0.1, 0.05);
		if (entity.isInWaterRainOrBubble()) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_4.get().defaultBlockState(), 3);
			});
		}
	}
}
