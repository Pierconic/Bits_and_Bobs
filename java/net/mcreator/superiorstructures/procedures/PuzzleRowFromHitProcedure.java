package net.mcreator.superiorstructures.procedures;

public class PuzzleRowFromHitProcedure {
	public static double execute(double y, double hitY) {
		double y_value = 0;
		y_value = hitY - y;
		if (y_value > 0.75) {
			return 3;
		} else if (y_value > 0.5) {
			return 2;
		} else if (y_value > 0.25) {
			return 1;
		}
		return 0;
	}
}
