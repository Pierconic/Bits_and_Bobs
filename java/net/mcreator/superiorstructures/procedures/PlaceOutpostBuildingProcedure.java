package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class PlaceOutpostBuildingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double Randy = 0;
		double average_height = 0;
		boolean Rotated = false;
		if (Math.abs(world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) x, (int) z) - world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) x, (int) (z + 15))) < 6
				&& Math.abs(world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) x, (int) z) - world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 15), (int) z)) < 6
				&& Math.abs(world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) x, (int) z) - world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 15), (int) (z + 15))) < 6
				&& world.isEmptyBlock(BlockPos.containing(x, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) x, (int) z) + 1, z))) {
			Randy = Mth.nextInt(RandomSource.create(), 1, 18);
			average_height = (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) x, (int) z) + world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 15), (int) z) + world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) x, (int) (z + 15))
					+ world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 15), (int) (z + 15))) * 0.25;
			Rotated = false;
			if (Math.random() < 0.5) {
				Rotated = true;
			}
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (Randy == 1) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 2) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 3) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 4) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 5) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 6) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 7) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 8) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 9) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 10) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 11) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_11"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_11"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 12) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_12"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_12"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 13) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_13"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_13"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 14) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_14"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_14"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 15) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_15"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_15"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 16) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_16"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_16"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 17) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_17"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_17"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 18) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_18"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_dark_18"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
				if (Randy == 1) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 2) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 3) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 4) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 5) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 6) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 7) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 8) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 9) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 10) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 11) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_11"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_11"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 12) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_12"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_12"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 13) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_13"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_13"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 14) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_14"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_14"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 15) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_15"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_15"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 16) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_16"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_16"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 17) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_17"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_17"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 18) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_18"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_spruce_18"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna_plateau"))) {
				if (Randy == 1) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 2) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 3) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 4) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 5) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 6) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 7) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 8) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 9) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 10) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 11) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_11"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_11"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 12) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_12"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_12"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 13) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_13"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_13"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 14) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_14"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_14"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 15) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_15"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_15"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 16) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_16"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_16"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 17) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_17"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_17"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 18) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_18"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_acacia_18"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				}
			} else {
				if (Randy == 1) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 2) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 3) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 4) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 5) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 6) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 7) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 8) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 9) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 10) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 11) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_11"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_11"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 12) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_12"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_12"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 13) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_13"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_13"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 14) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_14"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_14"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 15) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_15"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_15"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 16) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_16"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_16"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 17) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_17"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_17"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (Randy == 18) {
					if (Rotated) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_18"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, average_height - 3, z), BlockPos.containing(x, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_building_oak_18"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 15, average_height - 3, z), BlockPos.containing(x + 15, average_height - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				}
			}
		}
	}
}
