package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class FlameCellChargeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack returned_cell = ItemStack.EMPTY;
		if (itemstack.getItem() == SuperiorstructuresModItems.EMPTY_FLAME_CELL.get()) {
			if ((entity instanceof Player _plrCldRem3 ? _plrCldRem3.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) == 0
					&& (entity.isOnFire() || (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER)) {
				itemstack.shrink(1);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
				returned_cell = new ItemStack(SuperiorstructuresModItems.FLAME_CELL.get());
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(returned_cell.getItem(), 100);
				if (entity instanceof Player _player) {
					ItemStack _setstack = returned_cell.copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		} else {
			if (world.getBiome(BlockPos.containing(x, y, z)).value().getBaseTemperature() * 100f < 0.2 && (entity instanceof Player _plrCldRem16 ? _plrCldRem16.getCooldowns().getCooldownPercent(itemstack.getItem(), 0f) * 100 : 0) == 0) {
				itemstack.shrink(1);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 100);
				returned_cell = new ItemStack(SuperiorstructuresModItems.EMPTY_FLAME_CELL.get());
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(returned_cell.getItem(), 100);
				if (entity instanceof Player _player) {
					ItemStack _setstack = returned_cell.copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}
