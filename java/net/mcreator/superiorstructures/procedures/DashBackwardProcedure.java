package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class DashBackwardProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double force = 0;
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).DashCooldown == 0 && !entity.onGround() && !entity.isSwimming() && !(entity instanceof LivingEntity _livEnt2 && _livEnt2.isFallFlying()) && entity.getLookAngle().y >= -0.7) {
			if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.BOOSTER_BOOTS.get()
					|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.BOOSTER_2_BOOTS.get()
					|| (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.BOOSTER_3_BOOTS.get()) {
				{
					final String _tagName = "charge";
					final double _tagValue = ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge")
							- 1);
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY), tag -> tag.putDouble(_tagName, _tagValue));
				}
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.BOOSTER_BOOTS.get()) {
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.DashCooldown = 40;
						_vars.syncPlayerVariables(entity);
					}
					force = 0.7;
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.BOOSTER_2_BOOTS.get()) {
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.DashCooldown = 30;
						_vars.syncPlayerVariables(entity);
					}
					force = 1.1;
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.BOOSTER_3_BOOTS.get()) {
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.DashCooldown = 15;
						_vars.syncPlayerVariables(entity);
					}
					force = 1.4;
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machineboosts")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machineboosts")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 15, 0.2, 0.2, 0.2, 0.1);
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + entity.getLookAngle().x * force * (-1)), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + entity.getLookAngle().z * force * (-1))));
			} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.PHASE_BOOTS.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.chorus_fruit.teleport")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 15, 0.2, 0.2, 0.2, 0.2);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, (x + entity.getLookAngle().x * (-2.5)), y, (z + entity.getLookAngle().z * (-2.5)), 15, 0.2, 0.2, 0.2, 0.2);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, (x + entity.getLookAngle().x * (-5)), y, (z + entity.getLookAngle().z * (-5)), 15, 0.2, 0.2, 0.2, 0.2);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, (x + entity.getLookAngle().x * (-8.5)), y, (z + entity.getLookAngle().z * (-8.5)), 15, 0.2, 0.2, 0.2, 0.2);
				{
					Entity _ent = entity;
					_ent.teleportTo((x + entity.getLookAngle().x * (-8.5)), y, (z + entity.getLookAngle().z * (-8.5)));
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport((x + entity.getLookAngle().x * (-8.5)), y, (z + entity.getLookAngle().z * (-8.5)), _ent.getYRot(), _ent.getXRot());
				}
				{
					SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
					_vars.DashCooldown = 50;
					_vars.syncPlayerVariables(entity);
				}
			}
		}
	}
}
