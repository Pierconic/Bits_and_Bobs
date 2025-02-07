package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class PushBlockNorthProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!(((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _getep1 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getep1).toString() : "")
				.equals("top") && (world.getBlockState(BlockPos.containing(x, y, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:slabs"))))) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.SLIME_BLOCK) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.SLIME_BLOCK) {
					MoveBlockNorthNoHoneyProcedure.execute(world, x, y + 2, z);
					MoveBlockNorthNoHoneyProcedure.execute(world, x + 1, y + 1, z);
					MoveBlockNorthNoHoneyProcedure.execute(world, x - 1, y + 1, z);
					MoveBlockNorthNoHoneyProcedure.execute(world, x, y + 1, z - 1);
					MoveBlockNorthNoHoneyProcedure.execute(world, x, y + 1, z);
					MoveBlockNorthNoHoneyProcedure.execute(world, x, y + 1, z + 1);
				} else {
					MoveBlockNorthNoHoneyProcedure.execute(world, x, y + 1, z);
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.SLIME_BLOCK) {
					MoveBlockNorthNoHoneyProcedure.execute(world, x + 2, y, z);
					MoveBlockNorthNoHoneyProcedure.execute(world, x + 1, y, z - 1);
					MoveBlockNorthNoHoneyProcedure.execute(world, x + 1, y, z);
					MoveBlockNorthNoHoneyProcedure.execute(world, x + 1, y, z + 1);
					MoveBlockNorthNoHoneyProcedure.execute(world, x + 1, y + 1, z);
					MoveBlockNorthNoHoneyProcedure.execute(world, x + 1, y - 1, z);
				} else {
					MoveBlockNorthNoHoneyProcedure.execute(world, x + 1, y, z);
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.SLIME_BLOCK) {
					MoveBlockNorthNoHoneyProcedure.execute(world, x - 2, y, z);
					MoveBlockNorthNoHoneyProcedure.execute(world, x - 1, y, z - 1);
					MoveBlockNorthNoHoneyProcedure.execute(world, x - 1, y, z);
					MoveBlockNorthNoHoneyProcedure.execute(world, x - 1, y, z + 1);
					MoveBlockNorthNoHoneyProcedure.execute(world, x - 1, y + 1, z);
					MoveBlockNorthNoHoneyProcedure.execute(world, x - 1, y - 1, z);
				} else {
					MoveBlockNorthNoHoneyProcedure.execute(world, x - 1, y, z);
				}
				MoveBlockNorthProcedure.execute(world, x, y, z);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.HONEY_BLOCK) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.HONEY_BLOCK) {
					MoveBlockNorthNoSlimeProcedure.execute(world, x, y + 2, z);
					MoveBlockNorthNoSlimeProcedure.execute(world, x + 1, y + 1, z);
					MoveBlockNorthNoSlimeProcedure.execute(world, x - 1, y + 1, z);
					MoveBlockNorthNoSlimeProcedure.execute(world, x, y + 1, z - 1);
					MoveBlockNorthNoSlimeProcedure.execute(world, x, y + 1, z);
					MoveBlockNorthNoSlimeProcedure.execute(world, x, y + 1, z + 1);
				} else {
					MoveBlockNorthNoSlimeProcedure.execute(world, x, y + 1, z);
				}
				if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.HONEY_BLOCK) {
					MoveBlockNorthNoSlimeProcedure.execute(world, x + 2, y, z);
					MoveBlockNorthNoSlimeProcedure.execute(world, x + 1, y, z - 1);
					MoveBlockNorthNoSlimeProcedure.execute(world, x + 1, y, z);
					MoveBlockNorthNoSlimeProcedure.execute(world, x + 1, y, z + 1);
					MoveBlockNorthNoSlimeProcedure.execute(world, x + 1, y + 1, z);
					MoveBlockNorthNoSlimeProcedure.execute(world, x + 1, y - 1, z);
				} else {
					MoveBlockNorthNoSlimeProcedure.execute(world, x + 1, y, z);
				}
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.HONEY_BLOCK) {
					MoveBlockNorthNoSlimeProcedure.execute(world, x - 2, y, z);
					MoveBlockNorthNoSlimeProcedure.execute(world, x - 1, y, z - 1);
					MoveBlockNorthNoSlimeProcedure.execute(world, x - 1, y, z);
					MoveBlockNorthNoSlimeProcedure.execute(world, x - 1, y, z + 1);
					MoveBlockNorthNoSlimeProcedure.execute(world, x - 1, y + 1, z);
					MoveBlockNorthNoSlimeProcedure.execute(world, x - 1, y - 1, z);
				} else {
					MoveBlockNorthNoSlimeProcedure.execute(world, x - 1, y, z);
				}
				MoveBlockNorthProcedure.execute(world, x, y, z);
			} else {
				MoveBlockNorthProcedure.execute(world, x, y, z);
			}
		}
	}
}
