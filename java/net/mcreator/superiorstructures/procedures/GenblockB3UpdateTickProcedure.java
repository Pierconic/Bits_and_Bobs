package net.mcreator.superiorstructures.procedures;

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
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GenblockB3UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
		number = Mth.nextInt(RandomSource.create(), 0, 4);
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.SPRUCE_PLANKS
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.SPRUCE_PLANKS) {
			if (number == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.SPRUCE_PLANKS
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.SPRUCE_PLANKS) {
			if (number == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.SPRUCE_PLANKS
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.SPRUCE_PLANKS) {
			if (number == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_1"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_2"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_3"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_5"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_6"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.SPRUCE_PLANKS
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.SPRUCE_PLANKS) {
			if (number == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "witch_topper_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		}
		world.setBlock(BlockPos.containing(x, y, z), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
	}
	}
}