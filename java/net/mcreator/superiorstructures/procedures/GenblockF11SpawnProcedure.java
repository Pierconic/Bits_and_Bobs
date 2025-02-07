package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class GenblockF11SpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sz = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.BLUE_CONCRETE) {
				if (Math.random() < 0.5) {
					if (Math.random() < 0.6) {
						sx = Mth.nextDouble(RandomSource.create(), -12, 12);
						sz = Mth.nextDouble(RandomSource.create(), -12, 12);
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = SuperiorstructuresModEntities.DORMANT_IRON_GOLEM.get().spawn(_level, BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)), z + sz),
									MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				} else {
					if (Math.random() < 0.6) {
						SuperiorstructuresMod.queueServerWork(5, () -> {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = SuperiorstructuresModEntities.ANCIENT_COPPER_GOLEM.get().spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						});
					}
				}
			} else {
				if (Math.random() < 0.5) {
					if (Math.random() < 0.45) {
						SuperiorstructuresMod.queueServerWork(5, () -> {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.IRON_GOLEM.spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						});
					}
				} else {
					if (Math.random() < 0.6) {
						SuperiorstructuresMod.queueServerWork(5, () -> {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = SuperiorstructuresModEntities.EXPOSED_COPPER_GOLEM.get().spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						});
					}
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
