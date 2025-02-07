package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;
import net.mcreator.superiorstructures.entity.DormantIronGolemEntity;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class DormantGolemFlickerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof DormantIronGolemEntity animatable ? animatable.getTexture() : "null").equals("dormant_broken_golem")) {
			if (Math.random() < 0.006) {
				if (entity instanceof DormantIronGolemEntity animatable)
					animatable.setTexture("flickering_golem");
			}
		} else if ((entity instanceof DormantIronGolemEntity animatable ? animatable.getTexture() : "null").equals("flickering_golem")) {
			if (Math.random() < 0.07) {
				if (entity instanceof DormantIronGolemEntity animatable)
					animatable.setTexture("dormant_broken_golem");
			}
		}
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 12, 12, 12), e -> true).isEmpty()) {
			if (Math.random() < 0.0008) {
				if (entity instanceof DormantIronGolemEntity _datEntSetL)
					_datEntSetL.getEntityData().set(DormantIronGolemEntity.DATA_activating, true);
			}
		}
		if (entity instanceof DormantIronGolemEntity _datEntL6 && _datEntL6.getEntityData().get(DormantIronGolemEntity.DATA_activating)) {
			if (entity instanceof DormantIronGolemEntity _datEntSetI)
				_datEntSetI.getEntityData().set(DormantIronGolemEntity.DATA_activation_progress, (int) ((entity instanceof DormantIronGolemEntity _datEntI ? _datEntI.getEntityData().get(DormantIronGolemEntity.DATA_activation_progress) : 0) + 1));
			if (entity instanceof DormantIronGolemEntity) {
				((DormantIronGolemEntity) entity).setAnimation("reactivate");
			}
			if ((entity instanceof DormantIronGolemEntity _datEntI ? _datEntI.getEntityData().get(DormantIronGolemEntity.DATA_activation_progress) : 0) >= 60) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = SuperiorstructuresModEntities.BROKEN_IRON_GOLEM.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(entity.getYRot());
						entityToSpawn.setYBodyRot(entity.getYRot());
						entityToSpawn.setYHeadRot(entity.getYRot());
						entityToSpawn.setDeltaMovement(0, 0, 0);
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 18, 0.2, 0.2, 0.2, 0.2);
				for (int index0 = 0; index0 < 15; index0++) {
					SuperiorstructuresMod.queueServerWork(Mth.nextInt(RandomSource.create(), 1, 10), () -> {
						world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, (x + Mth.nextDouble(RandomSource.create(), -1, 1)), (y + Mth.nextDouble(RandomSource.create(), 0, 0.8)), (z + Mth.nextDouble(RandomSource.create(), -1, 1)), 0, 0.1, 0);
					});
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
