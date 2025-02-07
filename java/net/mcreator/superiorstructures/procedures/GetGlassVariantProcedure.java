package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GetGlassVariantProcedure {
	public static BlockState execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GLASS_WITH_LASER.get()) {
			return Blocks.GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.RED_GLASS_WITH_LASER.get()) {
			return Blocks.RED_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.ORANGE_GLASS_WITH_LASER.get()) {
			return Blocks.ORANGE_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.YELLOW_GLASS_WITH_LASER.get()) {
			return Blocks.YELLOW_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.LIME_GLASS_WITH_LASER.get()) {
			return Blocks.LIME_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GREEN_GLASS_WITH_LASER.get()) {
			return Blocks.GREEN_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.CYAN_GLASS_WITH_LASER.get()) {
			return Blocks.CYAN_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.LIGHT_BLUE_GLASS_WITH_LASER.get()) {
			return Blocks.LIGHT_BLUE_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.BLUE_GLASS_WITH_LASER.get()) {
			return Blocks.BLUE_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.PURPLE_GLASS_WITH_LASER.get()) {
			return Blocks.PURPLE_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.MAGENTA_GLASS_WITH_LASER.get()) {
			return Blocks.MAGENTA_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.PINK_GLASS_WITH_LASER.get()) {
			return Blocks.PINK_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.BROWN_GLASS_WITH_LASER.get()) {
			return Blocks.BROWN_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.WHITE_GLASS_WITH_LASER.get()) {
			return Blocks.WHITE_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.LIGHT_GRAY_GLASS_WITH_LASER.get()) {
			return Blocks.LIGHT_GRAY_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GRAY_GLASS_WITH_LASER.get()) {
			return Blocks.GRAY_STAINED_GLASS.defaultBlockState();
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.BLACK_GLASS_WITH_LASER.get()) {
			return SuperiorstructuresModBlocks.BLACK_GLASS_WITH_LASER.get().defaultBlockState();
		}
		return Blocks.GLASS.defaultBlockState();
	}
}
