package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class GenblockO1AltProcessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double chance = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 0))).getBlock() == Blocks.BLUE_CONCRETE && (world.getBlockState(BlockPos.containing(x - 0, y, z + 1))).getBlock() == Blocks.BLUE_CONCRETE) {
				GenblockO1XAxisProcedure.execute(world, x, y, z);
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 0))).getBlock() == Blocks.BLUE_CONCRETE && (world.getBlockState(BlockPos.containing(x - 0, y, z - 1))).getBlock() == Blocks.BLUE_CONCRETE) {
				GenblockO1XAxisProcedure.execute(world, x - 47, y, z - 47);
			}
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z - 0))).getBlock() == Blocks.BLUE_CONCRETE && (world.getBlockState(BlockPos.containing(x - 0, y, z + 1))).getBlock() == Blocks.BLUE_CONCRETE) {
				GenblockO1XRot90Procedure.execute(world, x - 47, y, z);
			}
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z - 0))).getBlock() == Blocks.BLUE_CONCRETE && (world.getBlockState(BlockPos.containing(x - 0, y, z - 1))).getBlock() == Blocks.BLUE_CONCRETE) {
				GenblockO1XRot90Procedure.execute(world, x, y, z - 47);
			}
			SuperiorstructuresMod.queueServerWork(15, () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"kill @e[type=item,distance=..200]");
			});
			world.setBlock(BlockPos.containing(x, y, z), (world.getBlockState(BlockPos.containing(x, y + 1, z))), 3);
			world.setBlock(BlockPos.containing(x, y, z + 1), (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))), 3);
			world.setBlock(BlockPos.containing(x, y, z - 1), (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))), 3);
			world.setBlock(BlockPos.containing(x + 1, y, z), (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))), 3);
			world.setBlock(BlockPos.containing(x - 1, y, z), (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))), 3);
		}
	}
}
