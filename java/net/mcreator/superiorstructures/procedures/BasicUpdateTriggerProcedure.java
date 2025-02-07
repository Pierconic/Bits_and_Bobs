package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BasicUpdateTriggerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState stored_blockstate = Blocks.AIR.defaultBlockState();
		String function_body = "";
		String shuffle_type = "";
		boolean shuffle = false;
		double rando = 0;
		stored_blockstate = (world.getBlockState(BlockPos.containing(x, y - 1, z)));
		world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y - 1, z), stored_blockstate, 3);
	}
}
