package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;

public class BoltBurstProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BoltSpreadProcedure.execute(world, x, y, z);
		if (world instanceof ServerLevel _level) {
			Entity entityToSpawn = SuperiorstructuresModEntities.PULSE_FIELD_2.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entityToSpawn != null) {
				entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
			}
		}
		if (world.getLevelData().isThundering() || world.getLevelData().isRaining()) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.NONE);
			if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z))) {
				if (world instanceof ServerLevel _level) {
					LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
					entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y + 1, z)));;
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
