package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class TempleSmallCheckProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if ((!world.getBlockState(BlockPos.containing(x, y + 8, z)).canOcclude() || (world.getBlockState(BlockPos.containing(x, y + 8, z))).getBlock() == Blocks.JUNGLE_LOG
				|| (world.getBlockState(BlockPos.containing(x, y + 8, z))).getBlock() == Blocks.JUNGLE_LEAVES)
				&& world.getBlockState(BlockPos.containing(x, y - 6, z)).canOcclude()
				&& (!world.getBlockState(BlockPos.containing(x + 17, y + 8, z)).canOcclude()
						|| (world.getBlockState(BlockPos.containing(x + 17, y + 8, z))).getBlock() == Blocks.JUNGLE_LOG || (world.getBlockState(BlockPos.containing(x + 17, y + 8, z))).getBlock() == Blocks.JUNGLE_LEAVES)
				&& world.getBlockState(BlockPos.containing(x + 17, y - 6, z)).canOcclude()
				&& (!world.getBlockState(BlockPos.containing(x, y + 8, z + 17)).canOcclude() || (world.getBlockState(BlockPos.containing(x, y + 8, z + 17))).getBlock() == Blocks.JUNGLE_LOG
						|| (world.getBlockState(BlockPos.containing(x, y + 8, z + 17))).getBlock() == Blocks.JUNGLE_LEAVES)
				&& world.getBlockState(BlockPos.containing(x, y - 6, z + 17)).canOcclude() && (!world.getBlockState(BlockPos.containing(x + 17, y + 8, z + 17)).canOcclude()
						|| (world.getBlockState(BlockPos.containing(x + 17, y + 8, z + 17))).getBlock() == Blocks.JUNGLE_LOG || (world.getBlockState(BlockPos.containing(x + 17, y + 8, z + 17))).getBlock() == Blocks.JUNGLE_LEAVES)
				&& world.getBlockState(BlockPos.containing(x + 17, y - 6, z + 17)).canOcclude()) {
			return true;
		}
		return false;
	}
}
