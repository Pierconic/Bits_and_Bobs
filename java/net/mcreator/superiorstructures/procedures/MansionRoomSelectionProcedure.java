package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class MansionRoomSelectionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.RED_CONCRETE) {
				MansionRoomSelectBLProcedure.execute(world, x, y, z);
			} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.ORANGE_CONCRETE) {
				MansionRoomSelectBCProcedure.execute(world, x, y, z);
			} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.YELLOW_CONCRETE) {
				MansionRoomSelectGLProcedure.execute(world, x, y, z);
			} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LIME_CONCRETE) {
				MansionRoomSelectGCProcedure.execute(world, x, y, z);
			} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.GREEN_CONCRETE) {
				MansionRoomSelectGBProcedure.execute(world, x, y, z);
			} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LIGHT_BLUE_CONCRETE) {
				MansionRoomSelectMCProcedure.execute(world, x, y, z);
			} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.BLUE_CONCRETE) {
				SuperiorstructuresMod.queueServerWork(5, () -> {
					MansionRoomSelectUL1Procedure.execute(world, x, y, z);
				});
			} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CYAN_CONCRETE) {
				SuperiorstructuresMod.queueServerWork(5, () -> {
					MansionRoomSelectUL2Procedure.execute(world, x, y, z);
				});
			} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.PURPLE_CONCRETE) {
				MansionRoomSelectUCProcedure.execute(world, x, y, z);
			} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.MAGENTA_CONCRETE) {
				MansionRoomSelectALProcedure.execute(world, x, y, z);
			}
		}
	}
}
