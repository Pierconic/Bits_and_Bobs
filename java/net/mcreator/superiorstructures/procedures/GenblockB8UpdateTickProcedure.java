package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class GenblockB8UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"setblock ~ ~ ~ spruce_slab[type=top]");
			number = Mth.nextInt(RandomSource.create(), 0, 2);
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_porch_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 1), BlockPos.containing(x - 3, y - 1, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_porch_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 1), BlockPos.containing(x - 3, y - 1, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_porch_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 1), BlockPos.containing(x - 3, y - 1, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_porch_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 1), BlockPos.containing(x + 3, y - 1, z + 1),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_porch_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 1), BlockPos.containing(x + 3, y - 1, z + 1),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_porch_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 1), BlockPos.containing(x + 3, y - 1, z + 1),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_porch_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z + 3), BlockPos.containing(x - 1, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_porch_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z + 3), BlockPos.containing(x - 1, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_porch_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 1, z + 3), BlockPos.containing(x - 1, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_porch_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 1, y - 1, z - 3), BlockPos.containing(x + 1, y - 1, z - 3),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_porch_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 1, y - 1, z - 3), BlockPos.containing(x + 1, y - 1, z - 3),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_porch_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 1, y - 1, z - 3), BlockPos.containing(x + 1, y - 1, z - 3),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
		}
	}
}
