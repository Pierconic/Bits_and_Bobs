package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class EnergizeTestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.SEA_LANTERN.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y + 20, z), Blocks.EMERALD_BLOCK.defaultBlockState(), 3);
	}
}
