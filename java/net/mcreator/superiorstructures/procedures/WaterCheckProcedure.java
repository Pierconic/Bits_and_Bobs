package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class WaterCheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_M_7_A.get()) {
				FluidGuardAProcedure.execute(world, x, y, z);
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() instanceof SimpleWaterloggedBlock) {
					FluidGuardAProcedure.execute(world, x, y + 1, z);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() instanceof SimpleWaterloggedBlock) {
					FluidGuardAProcedure.execute(world, x, y - 1, z);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_M_7_B.get()) {
				FluidGuardBProcedure.execute(world, x, y, z);
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() instanceof SimpleWaterloggedBlock) {
					FluidGuardBProcedure.execute(world, x, y + 1, z);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() instanceof SimpleWaterloggedBlock) {
					FluidGuardBProcedure.execute(world, x, y - 1, z);
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_M_7_C.get()) {
				FluidGuardCProcedure.execute(world, x, y, z);
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() instanceof SimpleWaterloggedBlock) {
					FluidGuardCProcedure.execute(world, x, y + 1, z);
				}
				if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() instanceof SimpleWaterloggedBlock) {
					FluidGuardCProcedure.execute(world, x, y - 1, z);
				}
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
