package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.ElderGuardian;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class LaserBeamDamageProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof ItemEntity) && !(entity instanceof Guardian) && !(entity instanceof ElderGuardian) && !(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (blockstate.getBlock() == SuperiorstructuresModBlocks.LASER_BEAM.get()) {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 1);
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 2);
				if (Math.random() < 0.1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:laserhit")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:laserhit")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_PARTIAL.get()) {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 1);
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 2);
				if (Math.random() < 0.1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:laserhit")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:laserhit")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_HALF.get()) {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MAGIC)), 1);
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
				if (Math.random() < 0.1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:laserhit")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:laserhit")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else if (blockstate.getBlock() == SuperiorstructuresModBlocks.LASER_BEAM_LOW.get()) {
				entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 1);
				if (Math.random() < 0.1) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:laserhit")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:laserhit")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			}
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() * 0.6), (entity.getDeltaMovement().y() * 0.6), (entity.getDeltaMovement().z() * 0.6)));
		}
	}
}
