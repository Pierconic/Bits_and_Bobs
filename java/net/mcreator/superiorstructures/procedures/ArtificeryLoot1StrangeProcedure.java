package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class ArtificeryLoot1StrangeProcedure {
	public static ItemStack execute() {
		ItemStack ChosenItem = ItemStack.EMPTY;
		double Randomizer = 0;
		Randomizer = Mth.nextInt(RandomSource.create(), 0, 12);
		if (Randomizer == 0) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.WARP_CHIP_WHITE.get());
		} else if (Randomizer == 1) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_PHASE_BLASTER_1.get());
		} else if (Randomizer == 2) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.WARP_CATALYST.get());
		} else if (Randomizer == 3) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.WARP_CATALYST.get());
		} else if (Randomizer == 4) {
			ChosenItem = new ItemStack(SuperiorstructuresModBlocks.ENDERPORTER_WHITE.get());
		} else if (Randomizer == 5) {
			ChosenItem = new ItemStack(SuperiorstructuresModBlocks.ENDERPORTER_WHITE.get());
		} else if (Randomizer == 6) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.ENDORITE_ORE_DETECTOR.get());
		} else if (Randomizer == 7) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_PHASE_BLASTER_1.get());
		} else if (Randomizer == 8) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.TRANSPONDER.get());
		} else if (Randomizer == 9) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.TRANSPONDER.get());
		} else if (Randomizer == 10) {
			ChosenItem = new ItemStack(SuperiorstructuresModBlocks.TRANSCEIVER.get());
		} else if (Randomizer == 11) {
			ChosenItem = new ItemStack(Items.END_CRYSTAL);
		} else if (Randomizer == 12) {
			ChosenItem = new ItemStack(Items.ENDER_EYE);
		}
		return ChosenItem;
	}
}
