package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class ActivatedRunestoneFlameProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3((x + 1), (y + 1), (z + 1)), 10, 10, 10), e -> true).isEmpty())) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SOUL_FIRE) {
				world.destroyBlock(BlockPos.containing(x, y + 1, z), false);
				for (int index0 = 0; index0 < 10; index0++) {
					world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, (x + Mth.nextDouble(RandomSource.create(), 0, 1)), (y + 1), (z + Mth.nextDouble(RandomSource.create(), 0, 1)), 0, 0.3, 0);
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.RUNESTONE.get().defaultBlockState(), 3);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("particle.soul_escape")), SoundSource.BLOCKS, (float) 0.5, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("particle.soul_escape")), SoundSource.BLOCKS, (float) 0.5, 1, false);
				}
			}
		} else {
			if (world.isEmptyBlock(BlockPos.containing(x, y + 1, z)) || (world.getBlockState(BlockPos.containing(x, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:spikeable")))) {
				{
					BlockPos _pos = BlockPos.containing(x, y + 1, z);
					Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y, z), null);
					world.destroyBlock(_pos, false);
				}
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.SOUL_FIRE.defaultBlockState(), 3);
			}
		}
	}
}
