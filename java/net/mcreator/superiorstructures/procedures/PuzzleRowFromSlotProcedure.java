package net.mcreator.superiorstructures.procedures;

public class PuzzleRowFromSlotProcedure {
	public static double execute(double slot) {
		if (15 == slot || 11 == slot || 7 == slot || 3 == slot) {
			return 3;
		} else if (14 == slot || 10 == slot || 6 == slot || 2 == slot) {
			return 2;
		} else if (13 == slot || 9 == slot || 5 == slot || 1 == slot) {
			return 1;
		}
		return 0;
	}
}
