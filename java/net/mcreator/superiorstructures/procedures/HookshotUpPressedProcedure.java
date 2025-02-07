package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class HookshotUpPressedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.DEACTIVATED_HOOKSHOT.get()
				&& 20 > entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_length
				|| (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.WARPSHOT.get() && 40 > entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_length)
				&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_direction == 0) {
			{
				SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
				_vars.hookshot_direction = -1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
