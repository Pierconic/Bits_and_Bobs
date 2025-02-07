package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.entity.SaddledGoldenGolemEntity;
import net.mcreator.superiorstructures.entity.GoldenGolemEntity;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

import java.util.Comparator;

public class RiddenGolemUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double magnitude = 0;
		double theta = 0;
		if (Math.random() < 0.001) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:goldgolem.ambient")), SoundSource.NEUTRAL, (float) 0.8, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:goldgolem.ambient")), SoundSource.NEUTRAL, (float) 0.8, 1, false);
				}
			}
		}
		if (!entity.isVehicle()) {
			if (!world.getEntitiesOfClass(Monster.class, AABB.ofSize(new Vec3(x, y, z), 48, 48, 48), e -> true).isEmpty()) {
				if (entity instanceof Mob _entity && ((Entity) world.getEntitiesOfClass(Monster.class, AABB.ofSize(new Vec3(x, y, z), 48, 48, 48), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _ent)
					_entity.setTarget(_ent);
			}
			if (Math.random() < 0.03) {
				world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, (y + 2.5), z, 0, 0.1, 0);
			}
			if (!world.getEntitiesOfClass(Monster.class, AABB.ofSize(new Vec3(x, y, z), 10, 10, 10), e -> true).isEmpty() && 0 == entity.getPersistentData().getDouble("smashTimer")) {
				entity.getPersistentData().putDouble("smashTimer", 80);
				if (entity instanceof GoldenGolemEntity) {
					((GoldenGolemEntity) entity).setAnimation("animation.gilded_golem.smash");
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:goldgolem.smash")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:goldgolem.smash")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				for (int index0 = 0; index0 < 6; index0++) {
					world.addParticle(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, (y + Mth.nextInt(RandomSource.create(), 2, (int) 2.5)), z, 0, 0.1, 0);
				}
				SuperiorstructuresMod.queueServerWork(5, () -> {
					if (entity instanceof GoldenGolemEntity) {
						((GoldenGolemEntity) entity).setAnimation("empty");
					}
				});
				SuperiorstructuresMod.queueServerWork(10, () -> {
					if (!world.getEntitiesOfClass(Monster.class, AABB.ofSize(new Vec3(x, y, z), 12, 12, 12), e -> true).isEmpty()) {
						GoldenGolemLaunchProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ());
					}
				});
			} else {
				if (entity.getPersistentData().getDouble("smashTimer") > 0) {
					entity.getPersistentData().putDouble("smashTimer", (entity.getPersistentData().getDouble("smashTimer") - 1));
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 50) {
			if (entity instanceof SaddledGoldenGolemEntity animatable)
				animatable.setTexture("gilded_golem_new_saddled");
		} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 25) {
			if (entity instanceof SaddledGoldenGolemEntity animatable)
				animatable.setTexture("gilded_golem_new_saddled_lowcracked");
		} else {
			if (entity instanceof SaddledGoldenGolemEntity animatable)
				animatable.setTexture("gilded_golem_new_saddled_highcracked");
		}
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinerybeep")), SoundSource.NEUTRAL, (float) 0.8, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinerybeep")), SoundSource.NEUTRAL, (float) 0.8, 1, false);
				}
			}
		}
	}
}
