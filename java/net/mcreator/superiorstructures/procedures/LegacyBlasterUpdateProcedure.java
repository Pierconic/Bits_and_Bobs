package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class LegacyBlasterUpdateProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == SuperiorstructuresModItems.DEACTIVATED_ENERGY_BLASTER.get() || itemstack.getItem() == SuperiorstructuresModItems.ENERGY_BLASTER.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_ENERGY_BLASTER_1.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.DEACTIVATED_FLAME_BLASTER.get() || itemstack.getItem() == SuperiorstructuresModItems.FLAME_BLASTER.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FLAME_BLASTER_1.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.DEACTIVATED_FROST_BLASTER.get() || itemstack.getItem() == SuperiorstructuresModItems.FROST_BLASTER.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FROST_BLASTER_1.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.DEACTIVATED_BOLT_BLASTER.get() || itemstack.getItem() == SuperiorstructuresModItems.BOLT_BLASTER.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_BOLT_BLASTER_1.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == SuperiorstructuresModItems.ENERGY_BLASTER_2.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_ENERGY_BLASTER_2.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.FLAME_BLASTER_2.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FLAME_BLASTER_2.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.FROST_BLASTER_2.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FROST_BLASTER_2.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.BOLT_BLASTER_2.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_BOLT_BLASTER_2.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (itemstack.getItem() == SuperiorstructuresModItems.ENERGY_BLASTER_3.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_ENERGY_BLASTER_3.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.FLAME_BLASTER_3.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FLAME_BLASTER_3.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.FROST_BLASTER_3.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FROST_BLASTER_3.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.BOLT_BLASTER_3.get()) {
			itemstack.shrink(1);
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_BOLT_BLASTER_3.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
