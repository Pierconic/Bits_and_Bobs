package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class BrokenGolemDeathExplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double particleRadius = 0;
		double particleAmount = 0;
		world.levelEvent(2001, BlockPos.containing(x, y, z), Block.getId(Blocks.GOLD_BLOCK.defaultBlockState()));
		world.levelEvent(2001, BlockPos.containing(x, y + 1, z), Block.getId(Blocks.GOLD_BLOCK.defaultBlockState()));
		world.levelEvent(2001, BlockPos.containing(x + 1, y + 1, z), Block.getId(Blocks.GOLD_BLOCK.defaultBlockState()));
		world.levelEvent(2001, BlockPos.containing(x - 1, y + 1, z), Block.getId(Blocks.GOLD_BLOCK.defaultBlockState()));
		world.levelEvent(2001, BlockPos.containing(x, y + 1, z - 1), Block.getId(Blocks.GOLD_BLOCK.defaultBlockState()));
		world.levelEvent(2001, BlockPos.containing(x, y + 1, z + 1), Block.getId(Blocks.GOLD_BLOCK.defaultBlockState()));
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 3, Level.ExplosionInteraction.BLOCK);
		SuperiorstructuresMod.queueServerWork(3, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.BLOCK);
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 5, Level.ExplosionInteraction.NONE);
			});
		});
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SMALL_FLAME, x, y, z, 24, 0.5, 0.5, 0.5, 0.2);
	}
}
