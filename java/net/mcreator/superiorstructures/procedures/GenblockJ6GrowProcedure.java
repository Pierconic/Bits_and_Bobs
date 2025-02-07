package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class GenblockJ6GrowProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			if (Math.random() < 0.2) {
				sx = -1;
				for (int index0 = 0; index0 < 3; index0++) {
					sy = 1;
					for (int index1 = 0; index1 < 12; index1++) {
						sz = -1;
						for (int index2 = 0; index2 < 3; index2++) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:tree_breakable")))) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
				world.setBlock(BlockPos.containing(x, y, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				if (Math.random() < 0.8 && world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.HANGING_ROOTS.defaultBlockState(), 3);
				}
				if (Math.random() < 0.6 && world.getBlockState(BlockPos.containing(x + 1, y, z)).isFaceSturdy(world, BlockPos.containing(x + 1, y, z), Direction.UP)) {
					world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
					if (Math.random() < 0.8 && world.isEmptyBlock(BlockPos.containing(x + 1, y - 1, z))) {
						world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.HANGING_ROOTS.defaultBlockState(), 3);
					}
				}
				if (Math.random() < 0.6 && world.getBlockState(BlockPos.containing(x - 1, y, z)).isFaceSturdy(world, BlockPos.containing(x - 1, y, z), Direction.UP)) {
					world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
					if (Math.random() < 0.8 && world.isEmptyBlock(BlockPos.containing(x - 1, y - 1, z))) {
						world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.HANGING_ROOTS.defaultBlockState(), 3);
					}
				}
				if (Math.random() < 0.6 && world.getBlockState(BlockPos.containing(x, y, z - 1)).isFaceSturdy(world, BlockPos.containing(x, y, z - 1), Direction.UP)) {
					world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
					if (Math.random() < 0.8 && world.isEmptyBlock(BlockPos.containing(x, y - 1, z - 1))) {
						world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.HANGING_ROOTS.defaultBlockState(), 3);
					}
				}
				if (Math.random() < 0.6 && world.getBlockState(BlockPos.containing(x, y, z + 1)).isFaceSturdy(world, BlockPos.containing(x, y, z + 1), Direction.UP)) {
					world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
					if (Math.random() < 0.8 && world.isEmptyBlock(BlockPos.containing(x, y - 1, z + 1))) {
						world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.HANGING_ROOTS.defaultBlockState(), 3);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"place feature jungle_tree ~ ~1 ~");
				SuperiorstructuresMod.queueServerWork(10, () -> {
					if (world.isEmptyBlock(BlockPos.containing(x, y, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 4, z))) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "fallback_tree"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y, z - 1), BlockPos.containing(x - 1, y, z - 1), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				});
			} else if (Math.random() < 0.65) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.ROOTED_DIRT.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				if (Math.random() < 0.8 && world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.HANGING_ROOTS.defaultBlockState(), 3);
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"place feature jungle_bush ~ ~1 ~");
			} else {
				if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.PODZOL || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.PODZOL
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.PODZOL || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.PODZOL) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.PODZOL.defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.PACKED_MUD || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.PACKED_MUD
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.PACKED_MUD || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.PACKED_MUD) {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.PACKED_MUD.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y, z), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
				}
			}
		}
	}
}
