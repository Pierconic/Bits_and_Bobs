package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.init.SuperiorstructuresModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class AscensionFlightProcedure {
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
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(SuperiorstructuresModMobEffects.ASCENSION)) {
			entity.setNoGravity(true);
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).ascension_sfx > 0)) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x + entity.getDeltaMovement().x() * 10, y + entity.getDeltaMovement().y() * 10, z + entity.getDeltaMovement().z() * 10),
								BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:ascension")), SoundSource.NEUTRAL, (float) 0.5, 1);
					} else {
						_level.playLocalSound((x + entity.getDeltaMovement().x() * 10), (y + entity.getDeltaMovement().y() * 10), (z + entity.getDeltaMovement().z() * 10),
								BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:ascension")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
					}
				}
				{
					SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
					_vars.ascension_sfx = 20;
					_vars.syncPlayerVariables(entity);
				}
			} else {
				{
					SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
					_vars.ascension_sfx = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).ascension_sfx - 1;
					_vars.syncPlayerVariables(entity);
				}
			}
		} else {
			entity.setNoGravity(false);
			{
				SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
				_vars.ascension_sfx = 0;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
