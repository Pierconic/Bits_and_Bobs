package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class SmashstoneEntityWalksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.PEEKING_SMASHSTONE.get().defaultBlockState(), 3);
		}
	}
}
