package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class ArtificeryLoot4SpecialProcedure {
	public static ItemStack execute() {
		ItemStack ChosenItem = ItemStack.EMPTY;
		double Randomizer = 0;
		Randomizer = Mth.nextInt(RandomSource.create(), 0, 20);
		if (Randomizer == 0) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_BOOTS.get());
		} else if (Randomizer == 1) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.BIG_ENERGY_CATALYST.get());
		} else if (Randomizer == 2) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.BIG_ENERGY_CATALYST.get());
		} else if (Randomizer == 3) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_ENERGY_BLASTER_3.get());
		} else if (Randomizer == 4) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_ENERGY_RAIL_1.get());
		} else if (Randomizer == 5) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.CHARGER.get());
		} else if (Randomizer == 6) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_ENERGY_BLASTER_2.get());
		} else if (Randomizer == 7) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_ENERGY_BLASTER_3.get());
		} else if (Randomizer == 8) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DIAMOND_ORE_DETECTOR.get());
		} else if (Randomizer == 9) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_ENERGY_BLASTER_2.get());
		} else if (Randomizer == 10) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.GOLD_ORE_DETECTOR.get());
		} else if (Randomizer == 11) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.POWER_SAW_3.get());
		} else if (Randomizer == 12) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.LAPIS_ORE_DETECTOR.get());
		} else if (Randomizer == 13) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.REDSTONE_ORE_DETECTOR.get());
		} else if (Randomizer == 14) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.POWER_DRILL_3.get());
		} else if (Randomizer == 15) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.POWER_DRILL_2.get());
		} else if (Randomizer == 16) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_CHESTPLATE.get());
		} else if (Randomizer == 17) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_ENERGY_RAIL_1.get());
		} else if (Randomizer == 18) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.GAUNTLET.get());
		} else if (Randomizer == 19) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DIAMOND_ORE_DETECTOR.get());
		} else if (Randomizer == 20) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_HOOKSHOT.get());
		}
		return ChosenItem;
	}
}
