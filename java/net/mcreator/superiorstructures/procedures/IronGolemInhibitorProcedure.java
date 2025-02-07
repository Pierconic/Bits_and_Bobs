package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class IronGolemInhibitorProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		execute(null, world, x, y, z, blockstate);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock() == Blocks.PUMPKIN || blockstate.getBlock() == Blocks.CARVED_PUMPKIN || blockstate.getBlock() == Blocks.JACK_O_LANTERN) {
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.IRON_BLOCK) {
				world.setBlock(BlockPos.containing(x, y - 1, z), SuperiorstructuresModBlocks.FAKE_IRON.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.IRON_BLOCK) {
				world.setBlock(BlockPos.containing(x, y + 1, z), SuperiorstructuresModBlocks.FAKE_IRON.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.IRON_BLOCK) {
				world.setBlock(BlockPos.containing(x + 1, y, z), SuperiorstructuresModBlocks.FAKE_IRON.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.IRON_BLOCK) {
				world.setBlock(BlockPos.containing(x - 1, y, z), SuperiorstructuresModBlocks.FAKE_IRON.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.IRON_BLOCK) {
				world.setBlock(BlockPos.containing(x, y, z - 1), SuperiorstructuresModBlocks.FAKE_IRON.get().defaultBlockState(), 3);
			}
			if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.IRON_BLOCK) {
				world.setBlock(BlockPos.containing(x, y, z + 1), SuperiorstructuresModBlocks.FAKE_IRON.get().defaultBlockState(), 3);
			}
		}
	}
}
