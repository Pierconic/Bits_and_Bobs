package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class ArtificeryLoot1SpecialProcedure {
	public static ItemStack execute() {
		ItemStack ChosenItem = ItemStack.EMPTY;
		double Randomizer = 0;
		Randomizer = Mth.nextInt(RandomSource.create(), 0, 19);
		if (Randomizer == 0) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.COPPER_ORE_DETECTOR.get());
		} else if (Randomizer == 1) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_ENERGY_BLASTER.get());
		} else if (Randomizer == 2) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.WRENCH.get());
		} else if (Randomizer == 3) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.ENERGY_CATALYST.get());
		} else if (Randomizer == 4) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.WRENCH.get());
		} else if (Randomizer == 5) {
			ChosenItem = new ItemStack(SuperiorstructuresModBlocks.DEACTIVATED_FAN.get());
		} else if (Randomizer == 6) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.DEACTIVATED_ENERGY_BLASTER.get());
		} else if (Randomizer == 7) {
			ChosenItem = new ItemStack(SuperiorstructuresModBlocks.PLONKER.get());
		} else if (Randomizer == 8) {
			ChosenItem = new ItemStack(Items.COMPASS);
		} else if (Randomizer == 9) {
			ChosenItem = new ItemStack(Items.CLOCK);
		} else if (Randomizer == 10) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.COPPER_ORE_DETECTOR.get());
		} else if (Randomizer == 11) {
			ChosenItem = new ItemStack(Items.REPEATER);
		} else if (Randomizer == 12) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.IRON_ORE_DETECTOR.get());
		} else if (Randomizer == 13) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.QUARTZ_ORE_DETECTOR.get());
		} else if (Randomizer == 14) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.BOOSTER_UNPOWERED_BOOTS.get());
		} else if (Randomizer == 15) {
			ChosenItem = new ItemStack(Items.COMPARATOR);
		} else if (Randomizer == 16) {
			ChosenItem = new ItemStack(Blocks.HOPPER);
		} else if (Randomizer == 17) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.ENERGY_CATALYST.get());
		} else if (Randomizer == 18) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.ENERGY_CATALYST.get());
		} else if (Randomizer == 19) {
			ChosenItem = new ItemStack(SuperiorstructuresModItems.ENERGY_CATALYST.get());
		}
		return ChosenItem;
	}
}
