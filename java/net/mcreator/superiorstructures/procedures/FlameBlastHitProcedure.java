package net.mcreator.superiorstructures.procedures;

import net.neoforged.fml.ModList;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class FlameBlastHitProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FLAME, x, y, z, Mth.nextInt(RandomSource.create(), 15, 20), 0.1, 0.1, 0.1, 0.1);
		if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) && world.getBlockState(BlockPos.containing(x, y, z)).canOcclude()) {
			if (ModList.get().isLoaded("ashenremains")) {
				world.setBlock(BlockPos.containing(x, y + 1, z), BuiltInRegistries.BLOCK.get(ResourceLocation.parse("ashenremains:weird_fire")).defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.FIRE.defaultBlockState(), 3);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:blaster.fizzle")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:blaster.fizzle")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
	}
}
