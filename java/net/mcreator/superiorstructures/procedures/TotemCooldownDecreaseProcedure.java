package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class TotemCooldownDecreaseProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).TotemCooldown > 0) {
			{
				SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
				_vars.TotemCooldown = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).TotemCooldown - 1;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).MushroomDelay > 0) {
			{
				SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
				_vars.MushroomDelay = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).MushroomDelay - 1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
