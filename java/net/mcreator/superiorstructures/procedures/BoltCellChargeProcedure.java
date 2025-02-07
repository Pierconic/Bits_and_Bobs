package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.init.SuperiorstructuresModMobEffects;
import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class BoltCellChargeProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack returned_cell = ItemStack.EMPTY;
		if (itemstack.getItem() == SuperiorstructuresModItems.EMPTY_BOLT_CELL.get()) {
			if ((world.getLevelData().isRaining() || entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(SuperiorstructuresModMobEffects.SHOCK))
					&& (entity instanceof Player _plrCldRem5 ? _plrCldRem5.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) == 0) {
				itemstack.shrink(1);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 50);
				returned_cell = new ItemStack(SuperiorstructuresModItems.BOLT_CELL.get());
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(returned_cell.getItem(), 50);
				if (entity instanceof Player _player) {
					ItemStack _setstack = returned_cell.copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}
