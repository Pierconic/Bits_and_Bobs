
package net.mcreator.superiorstructures.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.superiorstructures.procedures.GravityTrinketItemInInventoryTickProcedure;

import java.util.List;

public class DawnTrinketItem extends Item {
	public DawnTrinketItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal(""));
		list.add(Component.literal("\u00A77When in Inventory:"));
		list.add(Component.literal("\u00A72Restores 2 Hearts at Dawn"));
		list.add(Component.literal("\u00A72Stacks up to 3 Times"));
		list.add(Component.literal("\u00A72Functions in the Overworld"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		GravityTrinketItemInInventoryTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
