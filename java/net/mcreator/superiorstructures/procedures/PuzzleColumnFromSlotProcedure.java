package net.mcreator.superiorstructures.procedures;

public class PuzzleColumnFromSlotProcedure {
	public static double execute(double slot) {
		if (4 > slot) {
			return 0;
		} else if (8 > slot) {
			return 1;
		} else if (12 > slot) {
			return 2;
		}
		return 3;
	}
}
