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
public class HeavyCorePlaceProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		execute(null, world, x, y, z, blockstate);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		double raytrace_y = 0;
		double raytrace_x = 0;
		double raytrace_z = 0;
		if (blockstate.getBlock() == Blocks.HEAVY_CORE) {
			world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.HEART_OF_THE_WIND.get().defaultBlockState(), 3);
		}
	}
}
