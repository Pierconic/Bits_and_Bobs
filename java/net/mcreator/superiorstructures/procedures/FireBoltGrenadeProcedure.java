package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;

public class FireBoltGrenadeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction) {
		if (direction == null)
			return;
		if (direction == Direction.DOWN) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.BOLT_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + 0.5, y - 0.3, z + 0.5), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement((Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), (-1.3), (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)));
				}
			}
		} else if (direction == Direction.UP) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.BOLT_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + 0.5, y + 1.3, z + 0.5), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement((Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), 1.3, (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)));
				}
			}
		} else if (direction == Direction.NORTH) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.BOLT_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + 0.5, y + 0.5, z - 0.3), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement((Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), (-1.3));
				}
			}
		} else if (direction == Direction.SOUTH) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.BOLT_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + 0.5, y + 0.5, z + 1.3), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement((Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), 1.3);
				}
			}
		} else if (direction == Direction.WEST) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.BOLT_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x - 0.3, y + 0.5, z + 0.5), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement((-1.3), (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)));
				}
			}
		} else if (direction == Direction.EAST) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.BOLT_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + 1.3, y + 0.5, z + 0.5), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(1.3, (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)), (Mth.nextDouble(RandomSource.create(), -0.1, 0.1)));
				}
			}
		}
	}
}
