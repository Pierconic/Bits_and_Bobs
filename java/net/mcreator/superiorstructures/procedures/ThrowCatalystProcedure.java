package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;
import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;

public class ThrowCatalystProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 10);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.snowball.throw")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.snowball.throw")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (itemstack.getItem() == SuperiorstructuresModItems.ENERGY_CATALYST.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.ENERGY_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + entity.getLookAngle().x * 0.15, y + 1.2, z + entity.getLookAngle().z * 0.15), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setXRot(entity.getXRot());
					entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x() + entity.getLookAngle().x * 1.3), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 1.3), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 1.3));
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.FROST_CATALYST.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.FROST_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + entity.getLookAngle().x * 0.15, y + 1.2, z + entity.getLookAngle().z * 0.15), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setXRot(entity.getXRot());
					entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x() + entity.getLookAngle().x * 1.3), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 1.3), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 1.3));
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.FLAME_CATALYST.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.FLAME_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + entity.getLookAngle().x * 0.15, y + 1.2, z + entity.getLookAngle().z * 0.15), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setXRot(entity.getXRot());
					entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x() + entity.getLookAngle().x * 1.3), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 1.3), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 1.3));
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.BOLT_CATALYST.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.BOLT_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + entity.getLookAngle().x * 0.15, y + 1.2, z + entity.getLookAngle().z * 0.15), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setXRot(entity.getXRot());
					entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x() + entity.getLookAngle().x * 1.3), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 1.3), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 1.3));
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.BIG_ENERGY_CATALYST.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.BIG_ENERGY_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + entity.getLookAngle().x * 0.15, y + 1.2, z + entity.getLookAngle().z * 0.15), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setXRot(entity.getXRot());
					entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x() + entity.getLookAngle().x * 1.1), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 1.1), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 1.1));
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.BIG_FLAME_CATALYST.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.BIG_FLAME_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + entity.getLookAngle().x * 0.15, y + 1.2, z + entity.getLookAngle().z * 0.15), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setXRot(entity.getXRot());
					entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x() + entity.getLookAngle().x * 1.1), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 1.1), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 1.1));
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.BIG_FROST_CATALYST.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.BIG_FROST_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + entity.getLookAngle().x * 0.15, y + 1.2, z + entity.getLookAngle().z * 0.15), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setXRot(entity.getXRot());
					entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x() + entity.getLookAngle().x * 1.1), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 1.1), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 1.1));
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.BIG_BOLT_CATALYST.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.BIG_BOLT_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + entity.getLookAngle().x * 0.15, y + 1.2, z + entity.getLookAngle().z * 0.15), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setXRot(entity.getXRot());
					entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x() + entity.getLookAngle().x * 1.1), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 1.1), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 1.1));
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CATALYST.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.WARP_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + entity.getLookAngle().x * 0.15, y + 1.2, z + entity.getLookAngle().z * 0.15), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setXRot(entity.getXRot());
					entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x() + entity.getLookAngle().x * 1.1), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 1.1), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 1.1));
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.BIG_WARP_CATALYST.get()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.BIG_WARP_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x + entity.getLookAngle().x * 0.15, y + 1.2, z + entity.getLookAngle().z * 0.15), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(entity.getYRot());
					entityToSpawn.setYBodyRot(entity.getYRot());
					entityToSpawn.setYHeadRot(entity.getYRot());
					entityToSpawn.setXRot(entity.getXRot());
					entityToSpawn.setDeltaMovement((entity.getDeltaMovement().x() + entity.getLookAngle().x * 1.1), (entity.getDeltaMovement().y() + entity.getLookAngle().y * 1.1), (entity.getDeltaMovement().z() + entity.getLookAngle().z * 1.1));
				}
			}
		}
		if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			itemstack.shrink(1);
		}
	}
}
