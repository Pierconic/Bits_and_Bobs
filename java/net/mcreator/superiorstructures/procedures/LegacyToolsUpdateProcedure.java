package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class LegacyToolsUpdateProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == SuperiorstructuresModItems.DEACTIVATED_POWER_DRILL_1.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.POWER_DRILL_1.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.DEACTIVATED_POWER_DRILL_2.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.POWER_DRILL_2.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.DEACTIVATED_POWER_DRILL_3.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.POWER_DRILL_3.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == SuperiorstructuresModItems.DEACTIVATED_POWER_SAW_1.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.POWER_SAW_1.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.DEACTIVATED_POWER_SAW_2.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.POWER_SAW_2.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.DEACTIVATED_POWER_SAW_3.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.POWER_SAW_3.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
