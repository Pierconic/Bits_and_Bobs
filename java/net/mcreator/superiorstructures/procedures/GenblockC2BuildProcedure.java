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

public class GenblockC2BuildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
	if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
		number = Mth.nextInt(RandomSource.create(), 0, 9);
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.SNOW_BLOCK) {
			if (number == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z - 3), BlockPos.containing(x - 4, y - 2, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z - 3), BlockPos.containing(x - 4, y - 2, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z - 3), BlockPos.containing(x - 4, y - 2, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z - 3), BlockPos.containing(x - 4, y - 2, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z - 3), BlockPos.containing(x - 4, y - 2, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z - 3), BlockPos.containing(x - 4, y - 2, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 6) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z - 3), BlockPos.containing(x - 4, y - 2, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 7) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z - 3), BlockPos.containing(x - 4, y - 2, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 8) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z - 3), BlockPos.containing(x - 4, y - 2, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 9) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 4, y - 2, z - 3), BlockPos.containing(x - 4, y - 2, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.SNOW_BLOCK) {
			if (number == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y - 2, z + 3), BlockPos.containing(x + 4, y - 2, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y - 2, z + 3), BlockPos.containing(x + 4, y - 2, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y - 2, z + 3), BlockPos.containing(x + 4, y - 2, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y - 2, z + 3), BlockPos.containing(x + 4, y - 2, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y - 2, z + 3), BlockPos.containing(x + 4, y - 2, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y - 2, z + 3), BlockPos.containing(x + 4, y - 2, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 6) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y - 2, z + 3), BlockPos.containing(x + 4, y - 2, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 7) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y - 2, z + 3), BlockPos.containing(x + 4, y - 2, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 8) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y - 2, z + 3), BlockPos.containing(x + 4, y - 2, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 9) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y - 2, z + 3), BlockPos.containing(x + 4, y - 2, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.SNOW_BLOCK) {
			if (number == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_1"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 2, z + 4), BlockPos.containing(x - 3, y - 2, z + 4), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_2"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 2, z + 4), BlockPos.containing(x - 3, y - 2, z + 4), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_3"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 2, z + 4), BlockPos.containing(x - 3, y - 2, z + 4), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_4"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 2, z + 4), BlockPos.containing(x - 3, y - 2, z + 4), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_5"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 2, z + 4), BlockPos.containing(x - 3, y - 2, z + 4), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_6"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 2, z + 4), BlockPos.containing(x - 3, y - 2, z + 4), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 6) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_7"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 2, z + 4), BlockPos.containing(x - 3, y - 2, z + 4), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 7) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_8"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 2, z + 4), BlockPos.containing(x - 3, y - 2, z + 4), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 8) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_9"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 2, z + 4), BlockPos.containing(x - 3, y - 2, z + 4), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 9) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_10"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 2, z + 4), BlockPos.containing(x - 3, y - 2, z + 4), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.SNOW_BLOCK) {
			if (number == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 2, z - 4), BlockPos.containing(x + 3, y - 2, z - 4),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 2, z - 4), BlockPos.containing(x + 3, y - 2, z - 4),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 2, z - 4), BlockPos.containing(x + 3, y - 2, z - 4),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 2, z - 4), BlockPos.containing(x + 3, y - 2, z - 4),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 2, z - 4), BlockPos.containing(x + 3, y - 2, z - 4),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 2, z - 4), BlockPos.containing(x + 3, y - 2, z - 4),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 6) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 2, z - 4), BlockPos.containing(x + 3, y - 2, z - 4),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 7) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 2, z - 4), BlockPos.containing(x + 3, y - 2, z - 4),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 8) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 2, z - 4), BlockPos.containing(x + 3, y - 2, z - 4),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 9) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_wall_10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 2, z - 4), BlockPos.containing(x + 3, y - 2, z - 4),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		}
	}
	}
}
