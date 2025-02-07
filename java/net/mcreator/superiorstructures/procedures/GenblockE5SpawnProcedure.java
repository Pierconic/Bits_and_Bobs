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

public class GenblockE5SpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double difficulty = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (y <= 75) {
				difficulty = 1;
			} else if (y <= 95) {
				difficulty = 2;
			} else if (y <= 115) {
				difficulty = 4;
			} else if (y <= 135) {
				difficulty = 6;
			} else {
				difficulty = 8;
			}
			if (Math.random() < difficulty * 0.1) {
				if (Math.random() < 0.7) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/summon minecraft:vindicator ~ ~ ~ {HandItems:[{id:iron_axe,Count:1}],HandDropChances:[0f], PersistenceRequired:1b}");
				} else {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/summon minecraft:vindicator ~ ~ ~ {HandItems:[{id:golden_axe,Count:1}],HandDropChances:[0f], PersistenceRequired:1b}");
				}
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/summon minecraft:pillager ~ ~ ~ {HandItems:[{id:crossbow,Count:1}],HandDropChances:[0f], PersistenceRequired:1b}");
			}
		}
	}
}
