package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SingingSandCooldownProcedure {
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
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).singing_sand_cooldown > 0) {
			{
				SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
				_vars.singing_sand_cooldown = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).singing_sand_cooldown - 1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
