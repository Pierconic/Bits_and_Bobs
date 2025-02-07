package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class GenblockD1FrameProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Math.random() <= (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.PORTAL_FREQUENCY)) / 100) {
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
					SuperiorstructuresMod.queueServerWork(Mth.nextInt(RandomSource.create(), 11, 20), () -> {
						if (VillageScannerProcedure.execute(world, x, z) == false) {
							GenblockD1BuildProcedure.execute(world, x, y, z);
						}
					});
				} else if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
					SuperiorstructuresMod.queueServerWork(Mth.nextInt(RandomSource.create(), 11, 20), () -> {
						if (MiniVillageScannerProcedure.execute(world, x, y, z) == false) {
							GenblockD1BuildProcedure.execute(world, x, y, z);
						}
					});
				}
			}
		}
	}
}
