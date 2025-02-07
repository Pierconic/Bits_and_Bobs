package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class PushBlockWestProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _getep1 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep1).toString() : "")
				.equals("top") && (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:slabs"))))) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SLIME_BLOCK) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SLIME_BLOCK) {
					MoveBlockWestNoHoneyProcedure.execute(world, x, y + 2, z);
					MoveBlockWestNoHoneyProcedure.execute(world, x - 1, y + 1, z);
					MoveBlockWestNoHoneyProcedure.execute(world, x, y + 1, z);
					MoveBlockWestNoHoneyProcedure.execute(world, x + 1, y + 1, z);
					MoveBlockWestNoHoneyProcedure.execute(world, x, y + 1, z - 1);
					MoveBlockWestNoHoneyProcedure.execute(world, x, y + 1, z + 1);
				} else {
					MoveBlockWestNoHoneyProcedure.execute(world, x, y + 1, z);
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.SLIME_BLOCK) {
					MoveBlockWestNoHoneyProcedure.execute(world, x, y, z + 2);
					MoveBlockWestNoHoneyProcedure.execute(world, x - 1, y, z + 1);
					MoveBlockWestNoHoneyProcedure.execute(world, x, y, z + 1);
					MoveBlockWestNoHoneyProcedure.execute(world, x + 1, y, z + 1);
					MoveBlockWestNoHoneyProcedure.execute(world, x, y + 1, z + 1);
					MoveBlockWestNoHoneyProcedure.execute(world, x, y - 1, z + 1);
				} else {
					MoveBlockWestNoHoneyProcedure.execute(world, x, y, z + 1);
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.SLIME_BLOCK) {
					MoveBlockWestNoHoneyProcedure.execute(world, x, y, z - 2);
					MoveBlockWestNoHoneyProcedure.execute(world, x - 1, y, z - 1);
					MoveBlockWestNoHoneyProcedure.execute(world, x, y, z - 1);
					MoveBlockWestNoHoneyProcedure.execute(world, x + 1, y, z - 1);
					MoveBlockWestNoHoneyProcedure.execute(world, x, y + 1, z - 1);
					MoveBlockWestNoHoneyProcedure.execute(world, x, y - 1, z - 1);
				} else {
					MoveBlockWestNoHoneyProcedure.execute(world, x, y, z - 1);
				}
				MoveBlockWestProcedure.execute(world, x, y, z);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.HONEY_BLOCK) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.HONEY_BLOCK) {
					MoveBlockWestNoSlimeProcedure.execute(world, x, y + 2, z);
					MoveBlockWestNoSlimeProcedure.execute(world, x - 1, y + 1, z);
					MoveBlockWestNoSlimeProcedure.execute(world, x, y + 1, z);
					MoveBlockWestNoSlimeProcedure.execute(world, x + 1, y + 1, z);
					MoveBlockWestNoSlimeProcedure.execute(world, x, y + 1, z - 1);
					MoveBlockWestNoSlimeProcedure.execute(world, x, y + 1, z + 1);
				} else {
					MoveBlockWestNoSlimeProcedure.execute(world, x, y + 1, z);
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.HONEY_BLOCK) {
					MoveBlockWestNoSlimeProcedure.execute(world, x, y, z + 2);
					MoveBlockWestNoSlimeProcedure.execute(world, x - 1, y, z + 1);
					MoveBlockWestNoSlimeProcedure.execute(world, x, y, z + 1);
					MoveBlockWestNoSlimeProcedure.execute(world, x + 1, y, z + 1);
					MoveBlockWestNoSlimeProcedure.execute(world, x, y + 1, z + 1);
					MoveBlockWestNoSlimeProcedure.execute(world, x, y - 1, z + 1);
				} else {
					MoveBlockWestNoSlimeProcedure.execute(world, x, y, z + 1);
				}
				if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.HONEY_BLOCK) {
					MoveBlockWestNoSlimeProcedure.execute(world, x, y, z - 2);
					MoveBlockWestNoSlimeProcedure.execute(world, x - 1, y, z - 1);
					MoveBlockWestNoSlimeProcedure.execute(world, x, y, z - 1);
					MoveBlockWestNoSlimeProcedure.execute(world, x + 1, y, z - 1);
					MoveBlockWestNoSlimeProcedure.execute(world, x, y + 1, z - 1);
					MoveBlockWestNoSlimeProcedure.execute(world, x, y - 1, z - 1);
				} else {
					MoveBlockWestNoSlimeProcedure.execute(world, x, y, z - 1);
				}
				MoveBlockWestProcedure.execute(world, x, y, z);
			} else {
				MoveBlockWestProcedure.execute(world, x, y, z);
			}
		}
	}
}
