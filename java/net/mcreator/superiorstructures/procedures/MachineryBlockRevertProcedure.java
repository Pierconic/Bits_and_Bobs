package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class MachineryBlockRevertProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_BLOCK_OF_BROKEN_MACHINERY.get()) {
			world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.BLOCK_OF_BROKEN_MACHINERY.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_BLOCK_OF_OLD_MACHINERY.get() && Math.random() < 0.05) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinerybeep")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinerybeep")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.BLOCK_OF_OLD_MACHINERY.get().defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_BLOCK_OF_GILDED_MACHINERY.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:corepulse")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:corepulse")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.BLOCK_OF_GILDED_MACHINERY.get().defaultBlockState(), 3);
		}
	}
}
