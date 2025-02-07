package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class ArtificeryLoot5FireProcedure {
	public static ItemStack execute() {
		ItemStack ChosenItem = ItemStack.EMPTY;
		double Randomizer = 0;
		Randomizer = Mth.nextInt(RandomSource.create(), 0, 19);
		if (Randomizer == 0) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_BOOTS.get());
		} else if (Randomizer == 1) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.BIG_FLAME_CATALYST.get());
		} else if (Randomizer == 2) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_CHESTPLATE.get());
		} else if (Randomizer == 3) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.BIG_FLAME_CATALYST.get());
		} else if (Randomizer == 4) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FLAME_RAIL_1.get());
		} else if (Randomizer == 5) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FLAME_RAIL_2.get());
		} else if (Randomizer == 6) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.POWER_DRILL_3.get());
		} else if (Randomizer == 7) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FLAME_BLASTER_3.get());
		} else if (Randomizer == 8) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FLAME_RAIL_1.get());
		} else if (Randomizer == 9) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.POWER_SAW_3.get());
		} else if (Randomizer == 10) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DIAMOND_ORE_DETECTOR.get());
		} else if (Randomizer == 11) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.BIG_FLAME_CATALYST.get());
		} else if (Randomizer == 12) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.NETHERITE_ORE_DETECTOR.get());
		} else if (Randomizer == 13) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FLAME_BLASTER_3.get());
		} else if (Randomizer == 14) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.POWER_DRILL_3.get());
		} else if (Randomizer == 15) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.BIG_FLAME_CATALYST.get());
		} else if (Randomizer == 16) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.BIG_FLAME_CATALYST.get());
		} else if (Randomizer == 17) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_CHESTPLATE.get());
		} else if (Randomizer == 18) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DIAMOND_ORE_DETECTOR.get());
		} else if (Randomizer == 19) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_FLAME_RAIL_2.get());
		}
		return ChosenItem;
	}
}
