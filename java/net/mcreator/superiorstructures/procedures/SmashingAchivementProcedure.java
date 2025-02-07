package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SmashingAchivementProcedure {
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
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).smashtimer > 0) {
			{
				SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
				_vars.smashtimer = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).smashtimer - 1;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).smashtimer == 0) {
			{
				SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
				_vars.smashcount = 0;
				_vars.syncPlayerVariables(entity);
			}
		}
		if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).smashcount == 30) {
			if (entity instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("superiorstructures:smash_and_pass"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
	}
}
