
package net.mcreator.superiorstructures.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.procedures.BoltCellChargeProcedure;

public class EmptyBoltCellItem extends Item {
	public EmptyBoltCellItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		BoltCellChargeProcedure.execute(world, entity, itemstack);
	}
}
