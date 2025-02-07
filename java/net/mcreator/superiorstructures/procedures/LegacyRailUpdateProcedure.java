package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class LegacyRailUpdateProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == SuperiorstructuresModItems.ENERGY_RAIL_1.get() || itemstack.getItem() == SuperiorstructuresModItems.CHARGED_ENERGY_RAIL_1.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_ENERGY_RAIL_1.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.FLAME_RAIL_1.get() || itemstack.getItem() == SuperiorstructuresModItems.CHARGED_FLAME_RAIL_1.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FLAME_RAIL_1.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.FROST_RAIL_1.get() || itemstack.getItem() == SuperiorstructuresModItems.CHARGED_FROST_RAIL_1.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FROST_RAIL_1.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.BOLT_RAIL_1.get() || itemstack.getItem() == SuperiorstructuresModItems.CHARGED_BOLT_RAIL_1.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_BOLT_RAIL_1.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == SuperiorstructuresModItems.ENERGY_RAIL_2.get() || itemstack.getItem() == SuperiorstructuresModItems.CHARGED_ENERGY_RAIL_2.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_ENERGY_RAIL_2.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.FLAME_RAIL_2.get() || itemstack.getItem() == SuperiorstructuresModItems.CHARGED_FLAME_RAIL_2.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FLAME_RAIL_2.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.FROST_RAIL_2.get() || itemstack.getItem() == SuperiorstructuresModItems.CHARGED_FROST_RAIL_2.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FROST_RAIL_2.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.PONGORMA_RAIL.get() || itemstack.getItem() == SuperiorstructuresModItems.CHARGED_PONGORMA_RAIL.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_PONGORMA_RAIL_1.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
