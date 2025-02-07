package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class FrostBlastHit2Procedure {
	public static void execute(LevelAccessor world, Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SNOWFLAKE, (immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), Mth.nextInt(RandomSource.create(), 15, 20), 0.2, 0.2, 0.2, 0.05);
		if ((world.getBlockState(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ()))).getBlock() == Blocks.WATER
				|| (world.getBlockState(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ()))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ()), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_4.get().defaultBlockState(), 3);
			if (Math.random() < 0.7) {
				if ((world.getBlockState(BlockPos.containing(immediatesourceentity.getX() + 1, immediatesourceentity.getY(), immediatesourceentity.getZ()))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(immediatesourceentity.getX() + 1, immediatesourceentity.getY(), immediatesourceentity.getZ()))).getBlock() == Blocks.AIR && world.getLevelData().isRaining()) {
					world.setBlock(BlockPos.containing(immediatesourceentity.getX() + 1, immediatesourceentity.getY(), immediatesourceentity.getZ()), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_4.get().defaultBlockState(), 3);
				}
			}
			if (Math.random() < 0.7) {
				if ((world.getBlockState(BlockPos.containing(immediatesourceentity.getX() - 1, immediatesourceentity.getY(), immediatesourceentity.getZ()))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(immediatesourceentity.getX() - 1, immediatesourceentity.getY(), immediatesourceentity.getZ()))).getBlock() == Blocks.AIR && world.getLevelData().isRaining()) {
					world.setBlock(BlockPos.containing(immediatesourceentity.getX() - 1, immediatesourceentity.getY(), immediatesourceentity.getZ()), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_4.get().defaultBlockState(), 3);
				}
			}
			if (Math.random() < 0.7) {
				if ((world.getBlockState(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ() - 1))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ() - 1))).getBlock() == Blocks.AIR && world.getLevelData().isRaining()) {
					world.setBlock(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ() - 1), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_4.get().defaultBlockState(), 3);
				}
			}
			if (Math.random() < 0.7) {
				if ((world.getBlockState(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ() + 1))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ() + 1))).getBlock() == Blocks.AIR && world.getLevelData().isRaining()) {
					world.setBlock(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ() + 1), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_4.get().defaultBlockState(), 3);
				}
			}
			if (Math.random() < 0.7) {
				if ((world.getBlockState(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY() + 1, immediatesourceentity.getZ()))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY() + 1, immediatesourceentity.getZ()))).getBlock() == Blocks.AIR && world.getLevelData().isRaining()) {
					world.setBlock(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY() + 1, immediatesourceentity.getZ()), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_4.get().defaultBlockState(), 3);
				}
			}
			if (Math.random() < 0.7) {
				if ((world.getBlockState(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY() - 1, immediatesourceentity.getZ()))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY() - 1, immediatesourceentity.getZ()))).getBlock() == Blocks.AIR && world.getLevelData().isRaining()) {
					world.setBlock(BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY() - 1, immediatesourceentity.getZ()), SuperiorstructuresModBlocks.EXTRA_FROSTED_ICE_4.get().defaultBlockState(), 3);
				}
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(immediatesourceentity.getX(), immediatesourceentity.getY(), immediatesourceentity.getZ()), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:blaster.fizzle")),
						SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound((immediatesourceentity.getX()), (immediatesourceentity.getY()), (immediatesourceentity.getZ()), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:blaster.fizzle")), SoundSource.NEUTRAL,
						1, 1, false);
			}
		}
	}
}
