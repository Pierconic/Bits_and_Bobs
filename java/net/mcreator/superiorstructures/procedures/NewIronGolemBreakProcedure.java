package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.entity.NewIronGolemEntity;
import net.mcreator.superiorstructures.entity.BrokenIronGolemEntity;

public class NewIronGolemBreakProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof NewIronGolemEntity) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.75
					&& (entity instanceof NewIronGolemEntity animatable ? animatable.getTexture() : "null").equals("iron_golem_new")) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.damage")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.damage")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof NewIronGolemEntity animatable)
					animatable.setTexture("iron_golem_new_lowcracked");
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.5
					&& (entity instanceof NewIronGolemEntity animatable ? animatable.getTexture() : "null").equals("iron_golem_new_lowcracked")) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.damage")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.damage")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof NewIronGolemEntity animatable)
					animatable.setTexture("iron_golem_new_mediumcracked");
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.25
					&& (entity instanceof NewIronGolemEntity animatable ? animatable.getTexture() : "null").equals("iron_golem_new_mediumcracked")) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.damage")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.damage")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof NewIronGolemEntity animatable)
					animatable.setTexture("iron_golem_new_highcracked");
			}
			if (entity instanceof NewIronGolemEntity) {
				((NewIronGolemEntity) entity).setAnimation("hurt");
			}
		} else if (entity instanceof BrokenIronGolemEntity) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.66
					&& (entity instanceof BrokenIronGolemEntity animatable ? animatable.getTexture() : "null").equals("broken_golem")) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.damage")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.damage")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof BrokenIronGolemEntity animatable)
					animatable.setTexture("broken_golem_lowcracked");
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * 0.33
					&& (entity instanceof BrokenIronGolemEntity animatable ? animatable.getTexture() : "null").equals("broken_golem_lowcracked")) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.damage")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.damage")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof BrokenIronGolemEntity animatable)
					animatable.setTexture("broken_golem_mediumcracked");
			}
			if (entity instanceof BrokenIronGolemEntity) {
				((BrokenIronGolemEntity) entity).setAnimation("hurt");
			}
		}
	}
}
