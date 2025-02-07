package net.mcreator.superiorstructures.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class PlacePortalBuildingsProcedure {
	public static void execute() {
		boolean North = false;
		boolean South = false;
		boolean East = false;
		boolean West = false;
		double X_Offset = 0;
		double Z_Offset = 0;
		North = true;
		South = true;
		East = true;
		West = true;
		if (Math.random() < 0.45) {
			North = true;
		}
		if (Math.random() < 0.45) {
			South = true;
		}
		if (Math.random() < 0.45) {
			East = true;
		}
		if (Math.random() < 0.45) {
			West = true;
		}
		if (North) {
			X_Offset = Mth.nextDouble(RandomSource.create(), -5, 5);
			Z_Offset = Mth.nextDouble(RandomSource.create(), -25, -10);
			SelectPortalBuildingProcedure.execute();
		}
		if (South) {
			X_Offset = Mth.nextDouble(RandomSource.create(), -5, 5);
			Z_Offset = Mth.nextDouble(RandomSource.create(), 10, 25);
			SelectPortalBuildingProcedure.execute();
		}
		if (East) {
			X_Offset = Mth.nextDouble(RandomSource.create(), 10, 25);
			Z_Offset = Mth.nextDouble(RandomSource.create(), -5, 5);
			SelectPortalBuildingProcedure.execute();
		}
		if (West) {
			X_Offset = Mth.nextDouble(RandomSource.create(), -25, -10);
			Z_Offset = Mth.nextDouble(RandomSource.create(), -5, 5);
			SelectPortalBuildingProcedure.execute();
		}
	}
}
