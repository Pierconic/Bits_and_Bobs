package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class BrokenIronGolemEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, Mth.nextInt(RandomSource.create(), 15, 20), 0.1, 0.1, 0.1, 0.1);
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:moss_replaceable"))) && world.isEmptyBlock(BlockPos.containing(x, y, z))) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.SOUL_FIRE.defaultBlockState(), 3);
			});
			world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.SOUL_SAND.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:moss_replaceable"))) && world.isEmptyBlock(BlockPos.containing(x, y, z + 1))) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.SOUL_FIRE.defaultBlockState(), 3);
			});
			world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.SOUL_SAND.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:moss_replaceable"))) && world.isEmptyBlock(BlockPos.containing(x - 1, y, z))) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.SOUL_FIRE.defaultBlockState(), 3);
			});
			world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.SOUL_SAND.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:moss_replaceable"))) && world.isEmptyBlock(BlockPos.containing(x + 1, y, z))) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.SOUL_FIRE.defaultBlockState(), 3);
			});
			world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.SOUL_SAND.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:moss_replaceable"))) && world.isEmptyBlock(BlockPos.containing(x, y, z - 1))) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.SOUL_FIRE.defaultBlockState(), 3);
			});
			world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.SOUL_SAND.defaultBlockState(), 3);
		}
		if (world instanceof Level _level && !_level.isClientSide())
			_level.explode(null, x, y, z, 3, Level.ExplosionInteraction.NONE);
		SuperiorstructuresMod.queueServerWork(5, () -> {
			for (int index0 = 0; index0 < (int) Mth.nextDouble(RandomSource.create(), 2, 6); index0++) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextDouble(RandomSource.create(), -5, 5)), y, (z + Mth.nextDouble(RandomSource.create(), -5, 5)), new ItemStack(Items.IRON_INGOT));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (Math.random() < 0.2) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextDouble(RandomSource.create(), -5, 5)), y, (z + Mth.nextDouble(RandomSource.create(), -5, 5)), new ItemStack(Blocks.POPPY));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
			if (Math.random() < 0.2) {
				if (world instanceof ServerLevel _level) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + Mth.nextDouble(RandomSource.create(), -5, 5)), y, (z + Mth.nextDouble(RandomSource.create(), -5, 5)), new ItemStack(Blocks.VINE));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		});
	}
}
