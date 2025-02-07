
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

import net.mcreator.superiorstructures.procedures.TotemOfPowerPowerProcedure;

import java.util.List;

public class TotemOfPowerItem extends Item {
	public TotemOfPowerItem() {
		super(new Item.Properties().durability(320).rarity(Rarity.UNCOMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal(""));
		list.add(Component.literal("\u00A77When in Hand:"));
		list.add(Component.literal("\u00A72+Ambient Strength, +Resistance"));
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		TotemOfPowerPowerProcedure.execute(world, entity);
	}
}
