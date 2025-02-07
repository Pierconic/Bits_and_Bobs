package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class HookshotMovementOverrideProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double vx = 0;
		double vy = 0;
		double vz = 0;
		double distance = 0;
		double dx = 0;
		double dy = 0;
		double dz = 0;
		double dy1 = 0;
		double dx1 = 0;
		double dz1 = 0;
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_linked) {
			if (!((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.DEACTIVATED_HOOKSHOT.get())
					&& !((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.WARPSHOT.get())) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(SuperiorstructuresModItems.WARPSHOT.get())) : false) {
					WarpshotBreakProcedure.execute(world, x, y, z, entity);
				} else {
					HookshotBreakProcedure.execute(world, x, y, z, entity);
				}
			} else {
				if (4 < entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_length && -1 == entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_direction) {
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.hookshot_length = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_length + -0.1;
						_vars.syncPlayerVariables(entity);
					}
					if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).chain_delay <= 0) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.WARPSHOT.get()) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:warpshot.click")), SoundSource.NEUTRAL, (float) 0.2, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:warpshot.click")), SoundSource.NEUTRAL, (float) 0.2, 1, false);
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:hookshot.click")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:hookshot.click")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:hookshot.click")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:hookshot.click")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
						{
							SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
							_vars.chain_delay = 8;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						{
							SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
							_vars.chain_delay = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).chain_delay - 1;
							_vars.syncPlayerVariables(entity);
						}
					}
				} else if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.DEACTIVATED_HOOKSHOT.get()
						&& 20 > entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_length
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.WARPSHOT.get()
								&& 40 > entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_length)
						&& 1 == entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_direction) {
					{
						SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
						_vars.hookshot_length = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_length + 0.1;
						_vars.syncPlayerVariables(entity);
					}
					if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).chain_delay <= 0) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.WARPSHOT.get()) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:warpshot.click")), SoundSource.NEUTRAL, (float) 0.2, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:warpshot.click")), SoundSource.NEUTRAL, (float) 0.2, 1, false);
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:hookshot.click")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:hookshot.click")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						} else {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:hookshot.click")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:hookshot.click")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
						{
							SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
							_vars.chain_delay = 8;
							_vars.syncPlayerVariables(entity);
						}
					} else {
						{
							SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
							_vars.chain_delay = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).chain_delay - 1;
							_vars.syncPlayerVariables(entity);
						}
					}
				}
				dx = x - entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_x;
				dy = y - entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_y;
				dz = z - entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_z;
				distance = Math.pow(Math.pow(dx, 2) + Math.pow(dy, 2) + Math.pow(dz, 2), 0.5);
				if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.DEACTIVATED_HOOKSHOT.get() && distance > 24
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.WARPSHOT.get() && distance > 48) {
					HookshotBreakProcedure.execute(world, x, y, z, entity);
				} else if (distance > entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_length) {
					dx1 = (dx / distance) * entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_length;
					dy1 = (dy / distance) * entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_length;
					dz1 = (dz / distance) * entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_length;
					vx = entity.getDeltaMovement().x() + (dx1 - dx) / distance;
					vy = entity.getDeltaMovement().y() + (dy1 - dy) / distance;
					vz = entity.getDeltaMovement().z() + (dz1 - dz) / distance;
				} else {
					vx = entity.getDeltaMovement().x();
					vy = entity.getDeltaMovement().y();
					vz = entity.getDeltaMovement().z();
				}
				if (vy > 0) {
					entity.fallDistance = 0;
				}
				entity.setDeltaMovement(new Vec3(vx, vy, vz));
			}
		}
	}
}
