package net.mcreator.superiorstructures.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.component.DataComponents;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class RemainingChargeProcedure {
	public static String execute(ItemStack itemstack) {
		ItemStack nameditem = ItemStack.EMPTY;
		boolean found = false;
		double slotnumber = 0;
		String max_charge = "";
		String addition = "";
		if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:ten_shots")))) {
			max_charge = "10";
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:thirty_shots")))) {
			max_charge = "30";
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:twenty_shots")))) {
			max_charge = "20";
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:fifteen_shots")))) {
			max_charge = "15";
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:twenty_five_shots")))) {
			max_charge = "25";
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:forty_shots")))) {
			max_charge = "40";
		} else if (itemstack.is(ItemTags.create(ResourceLocation.parse("forge:eighty_shots")))) {
			max_charge = "80";
		} else if (itemstack.getItem() == SuperiorstructuresModItems.BOOSTER_CHESTPLATE.get() || itemstack.getItem() == SuperiorstructuresModItems.BOOSTER_BOOTS.get()) {
			max_charge = "70";
		} else if (itemstack.getItem() == SuperiorstructuresModItems.BOOSTER_2_CHESTPLATE.get() || itemstack.getItem() == SuperiorstructuresModItems.BOOSTER_2_BOOTS.get()) {
			max_charge = "90";
		} else if (itemstack.getItem() == SuperiorstructuresModItems.BOOSTER_3_CHESTPLATE.get() || itemstack.getItem() == SuperiorstructuresModItems.BOOSTER_3_BOOTS.get() || itemstack.getItem() == SuperiorstructuresModItems.GAUNTLET.get()) {
			max_charge = "120";
		} else if (itemstack.getItem() == SuperiorstructuresModItems.PHASE_GAUNTLET.get()) {
			max_charge = "140";
		}
		if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") > new Object() {
			double convert(String s) {
				try {
					return Double.parseDouble(s.trim());
				} catch (Exception e) {
				}
				return 0;
			}
		}.convert(max_charge)) {
			addition = "!";
		} else {
			addition = "";
		}
		return ("\u00A77") + "charge: " + new java.text.DecimalFormat("##").format(itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge")) + "/" + max_charge + addition;
	}
}
