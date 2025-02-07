package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GetLaserVariantProcedure {
	public static BlockState execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GLASS) {
			return SuperiorstructuresModBlocks.GLASS_WITH_LASER.get().defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.RED_STAINED_GLASS) {
			return SuperiorstructuresModBlocks.RED_GLASS_WITH_LASER.get().defaultBlockState();
		}
		return SuperiorstructuresModBlocks.GLASS_WITH_LASER.get().defaultBlockState();
	}
}
