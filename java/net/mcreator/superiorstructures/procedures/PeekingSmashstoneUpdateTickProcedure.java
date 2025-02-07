package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class PeekingSmashstoneUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:smashring")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 0.7, 1.2));
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:smashring")), SoundSource.NEUTRAL, 1, (float) Mth.nextDouble(RandomSource.create(), 0.7, 1.2), false);
			}
		}
		world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.SMASHING_SMASHSTONE.get().defaultBlockState(), 3);
	}
}
