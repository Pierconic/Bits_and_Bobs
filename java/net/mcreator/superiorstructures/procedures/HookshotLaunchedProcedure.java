package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class HookshotLaunchedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double vx = 0;
		double vy = 0;
		double vz = 0;
		double dx = 0;
		double distance = 0;
		double dy = 0;
		double dz = 0;
		double dy1 = 0;
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_linked) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.WARPSHOT.get()) {
				WarpshotBreakProcedure.execute(world, x, y, z, entity);
			} else {
				HookshotBreakProcedure.execute(world, x, y, z, entity);
			}
			dx = x - entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_x;
			dy = y - entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_y;
			dz = z - entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_z;
			distance = Math.pow(Math.pow(dx, 2) + Math.pow(dy, 2) + Math.pow(dz, 2), 0.5);
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.DEACTIVATED_HOOKSHOT.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:hookshot.launch")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:hookshot.launch")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.WARPSHOT.get()) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:warpshot.launch")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:warpshot.launch")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
			vx = dx * (-0.1);
			vy = dy * (-0.1);
			vz = dz * (-0.1);
			entity.setDeltaMovement(new Vec3(vx, vy, vz));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x, y, z, 6, 0.2, 0.2, 0.2, 0.2);
		}
	}
}
