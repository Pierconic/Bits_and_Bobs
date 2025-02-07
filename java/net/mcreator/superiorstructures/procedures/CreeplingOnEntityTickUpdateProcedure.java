package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.entity.CreepletEntity;

public class CreeplingOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 3, 3, 3), e -> true).isEmpty()) {
			if (entity.getPersistentData().getDouble("fuse") >= 50) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 1, Level.ExplosionInteraction.MOB);
			} else {
				if (entity instanceof CreepletEntity) {
					((CreepletEntity) entity).setAnimation("creepling.explode");
				}
				entity.getPersistentData().putDouble("fuse", (entity.getPersistentData().getDouble("fuse") + 2));
			}
		} else if (entity.getPersistentData().getDouble("fuse") > 0) {
			entity.getPersistentData().putDouble("fuse", (entity.getPersistentData().getDouble("fuse") - 1));
			if (entity instanceof CreepletEntity) {
				((CreepletEntity) entity).setAnimation("empty");
			}
		} else {
			if (entity instanceof CreepletEntity) {
				((CreepletEntity) entity).setAnimation("empty");
			}
		}
		if (!(entity.getPersistentData().getDouble("fuse") == 0)) {
			if (entity.getPersistentData().getDouble("fuse") == 2) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.creeper.primed")), SoundSource.HOSTILE, (float) 0.6, (float) 1.2);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.creeper.primed")), SoundSource.HOSTILE, (float) 0.6, (float) 1.2, false);
					}
				}
			} else if (entity.getPersistentData().getDouble("fuse") / 10 == Math.round(entity.getPersistentData().getDouble("fuse") / 10)) {
				if (entity instanceof CreepletEntity animatable)
					animatable.setTexture("creepling_flash");
			} else {
				if (entity instanceof CreepletEntity animatable)
					animatable.setTexture("creepling");
			}
		}
	}
}
