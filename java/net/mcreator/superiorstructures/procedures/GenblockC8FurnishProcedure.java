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

public class GenblockC8FurnishProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		number = Mth.nextInt(RandomSource.create(), 0, 5);
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG
				&& (world.getBlockState(BlockPos.containing(x, y, z - 3))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
			if (number == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 5, y - 1, z - 3), BlockPos.containing(x - 5, y - 1, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 5, y - 1, z - 3), BlockPos.containing(x - 5, y - 1, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 5, y - 1, z - 3), BlockPos.containing(x - 5, y - 1, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 5, y - 1, z - 3), BlockPos.containing(x - 5, y - 1, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 5, y - 1, z - 3), BlockPos.containing(x - 5, y - 1, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 5, y - 1, z - 3), BlockPos.containing(x - 5, y - 1, z - 3),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG
				&& (world.getBlockState(BlockPos.containing(x, y, z + 3))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
			if (number == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 5, y - 1, z + 3), BlockPos.containing(x + 5, y - 1, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 5, y - 1, z + 3), BlockPos.containing(x + 5, y - 1, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 5, y - 1, z + 3), BlockPos.containing(x + 5, y - 1, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 5, y - 1, z + 3), BlockPos.containing(x + 5, y - 1, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 5, y - 1, z + 3), BlockPos.containing(x + 5, y - 1, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 5, y - 1, z + 3), BlockPos.containing(x + 5, y - 1, z + 3),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG
				&& (world.getBlockState(BlockPos.containing(x + 3, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
			if (number == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 5), BlockPos.containing(x + 3, y - 1, z - 5),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 5), BlockPos.containing(x + 3, y - 1, z - 5),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 5), BlockPos.containing(x + 3, y - 1, z - 5),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 5), BlockPos.containing(x + 3, y - 1, z - 5),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 5), BlockPos.containing(x + 3, y - 1, z - 5),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 5), BlockPos.containing(x + 3, y - 1, z - 5),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG
				&& (world.getBlockState(BlockPos.containing(x - 3, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
			if (number == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_1"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 1, z + 5), BlockPos.containing(x - 3, y - 1, z + 5), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_2"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 1, z + 5), BlockPos.containing(x - 3, y - 1, z + 5), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_3"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 1, z + 5), BlockPos.containing(x - 3, y - 1, z + 5), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_4"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 1, z + 5), BlockPos.containing(x - 3, y - 1, z + 5), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_5"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 1, z + 5), BlockPos.containing(x - 3, y - 1, z + 5), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_6"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 3, y - 1, z + 5), BlockPos.containing(x - 3, y - 1, z + 5), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG
				&& (world.getBlockState(BlockPos.containing(x, y, z - 7))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
			if (number == 0 || number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 5, y - 1, z - 7), BlockPos.containing(x - 5, y - 1, z - 7),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2 || number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 5, y - 1, z - 7), BlockPos.containing(x - 5, y - 1, z - 7),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 5, y - 1, z - 7), BlockPos.containing(x - 5, y - 1, z - 7),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 5, y - 1, z - 7), BlockPos.containing(x - 5, y - 1, z - 7),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG
				&& (world.getBlockState(BlockPos.containing(x, y, z + 7))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
			if (number == 0 || number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 5, y - 1, z + 7), BlockPos.containing(x + 5, y - 1, z + 7),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2 || number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 5, y - 1, z + 7), BlockPos.containing(x + 5, y - 1, z + 7),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 5, y - 1, z + 7), BlockPos.containing(x + 5, y - 1, z + 7),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 5, y - 1, z + 7), BlockPos.containing(x + 5, y - 1, z + 7),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG
				&& (world.getBlockState(BlockPos.containing(x + 7, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
			if (number == 0 || number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 7, y - 1, z - 5), BlockPos.containing(x + 7, y - 1, z - 5),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2 || number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 7, y - 1, z - 5), BlockPos.containing(x + 7, y - 1, z - 5),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 7, y - 1, z - 5), BlockPos.containing(x + 7, y - 1, z - 5),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 7, y - 1, z - 5), BlockPos.containing(x + 7, y - 1, z - 5),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG
				&& (world.getBlockState(BlockPos.containing(x - 7, y, z))).getBlock() == Blocks.STRIPPED_SPRUCE_LOG) {
			if (number == 0 || number == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_7"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 7, y - 1, z + 5), BlockPos.containing(x - 7, y - 1, z + 5), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 2 || number == 3) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_8"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 7, y - 1, z + 5), BlockPos.containing(x - 7, y - 1, z + 5), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 4) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_9"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 7, y - 1, z + 5), BlockPos.containing(x - 7, y - 1, z + 5), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (number == 5) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_cage_10"));
					if (template != null) {
						template.placeInWorld(
								_serverworld, BlockPos.containing(x - 7, y - 1, z + 5), BlockPos.containing(x - 7, y - 1, z + 5), new StructurePlaceSettings()
										.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		}
		}
	}
}