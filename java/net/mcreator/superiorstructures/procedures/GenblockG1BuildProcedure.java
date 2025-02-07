package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.grower.TreeGrower; //Previously OakTreeGrower

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GenblockG1BuildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
		String wood = "";
		double rotation = 0;
		double depth = 0;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_lukewarm_ocean"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lukewarm_ocean"))) {
			if (Math.random() < 0.15) {
				wood = "acacia";
 /*acacia*/
			} else if (Math.random() < 0.3) {
				wood = "spruce";
			} else {
				wood = "jungle";
 /*jungle*/
			}
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("warm_ocean"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("warm_ocean"))) {
			if (Math.random() < 0.15) {
				wood = "oak";
 /*Oak*/
			} else if (Math.random() < 0.3) {
				wood = "jungle";
/*jungle*/
			} else {
				wood = "acacia";
 /*acacia*/
			}
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean"))
				|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_ocean"))) {
			if (Math.random() < 0.15) {
				wood = "jungle";
 /*jungle*/
			} else if (Math.random() < 0.3) {
				wood = "oak";
 /*Oak*/
			} else {
				wood = "spruce";
			}
		} else {
			if (Math.random() < 0.15) {
				wood = "jungle";
 /*jungle*/
			} else if (Math.random() < 0.3) {
				wood = "spruce";
			} else {
				wood = "oak";
 /*Oak*/
			}
		}
		depth = Mth.nextInt(RandomSource.create(), 3, 3);
		rotation = Mth.nextInt(RandomSource.create(), 0, 3);
		if ((wood).equals("spruce")) {
			if (Math.random() < 0.6) {
				if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallspruce_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallspruce_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallspruce_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallspruce_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumspruce_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth -1, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumspruce_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumspruce_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth -1, z), BlockPos.containing(x, y - depth -1, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumspruce_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largespruce_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largespruce_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largespruce_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largespruce_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			} else {
				if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallspruce_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallspruce_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallspruce_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallspruce_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumspruce_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumspruce_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumspruce_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumspruce_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largespruce_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largespruce_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largespruce_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largespruce_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			}
		} else if ((wood).equals("oak")) {
			if (Math.random() < 0.6) {
				if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalloak_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalloak_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalloak_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalloak_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumoak_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth -1, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumoak_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumoak_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumoak_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeoak_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeoak_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeoak_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeoak_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth -2, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			} else {
				if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalloak_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalloak_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalloak_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalloak_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumoak_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumoak_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumoak_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumoak_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeoak_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeoak_3"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeoak_3"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeoak_3"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			}
		} else if ((wood).equals("acacia")) {
			if (Math.random() < 0.6) {
				if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallacacia_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallacacia_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallacacia_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallacacia_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumacacia_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumacacia_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumacacia_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumacacia_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeacacia_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeacacia_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeacacia_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeacacia_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			} else {
				if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallacacia_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallacacia_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallacacia_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smallacacia_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumacacia_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumacacia_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumacacia_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumacacia_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeacacia_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeacacia_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeacacia_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largeacacia_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			}
		} else if ((wood).equals("jungle")) {
			if (Math.random() < 0.6) {
				if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalljungle_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalljungle_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalljungle_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalljungle_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumjungle_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumjungle_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumjungle_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumjungle_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largejungle_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largejungle_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largejungle_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largejungle_1"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			} else {
				if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalljungle_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalljungle_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalljungle_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_smalljungle_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth, z), BlockPos.containing(x, y - depth, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (Math.random() < 0.6) {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumjungle_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumjungle_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumjungle_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_mediumjungle_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 2, z), BlockPos.containing(x, y - depth - 2, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else {
					if (rotation == 0) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largejungle_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 1) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largejungle_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 2) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largejungle_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else if (rotation == 3) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "shipwreck_largejungle_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y - depth - 3, z), BlockPos.containing(x, y - depth - 3, z), new StructurePlaceSettings()
												.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			}
		}
	}
	}
}