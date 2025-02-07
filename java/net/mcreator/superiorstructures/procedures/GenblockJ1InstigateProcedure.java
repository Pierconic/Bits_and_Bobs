package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class GenblockJ1InstigateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Math.random() <= (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.TEMPLE_FREQUENCY)) * 0.01) {
				if (VillageScannerProcedure.execute(world, x, z) == false && TempleCheckProcedure.execute(world, x, y, z) == true && world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle"))) {
					GenblockJ1CoreProcedure.execute(world, x, y, z);
				}
			}
		}
	}
}
