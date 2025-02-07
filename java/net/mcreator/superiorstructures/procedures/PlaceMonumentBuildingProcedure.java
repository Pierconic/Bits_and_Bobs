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

public class PlaceMonumentBuildingProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double RandyJunior = 0;
		double RandyPants = 0;
		double elevation = 0;
		RandyPants = Mth.nextInt(RandomSource.create(), 0, 19);
		RandyJunior = Mth.nextInt(RandomSource.create(), 0, 3);
		elevation = Math.min(Math.min(world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) x, (int) z), world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 22), (int) z)),
				Math.min(world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) x, (int) (z + 22)), world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 22), (int) (z + 22)))) - 4;
		if (RandyPants == 0) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 1) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 2) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 3) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 4) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 5) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 6) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 7) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 8) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 9) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		}
		if (RandyPants == 10) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_11"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_11"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_11"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_11"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 11) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_12"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_12"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_12"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_12"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 12) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_13"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_13"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_13"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_13"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 13) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_14"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_14"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_14"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_14"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 14) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_15"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_15"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_15"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_15"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 15) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_16"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_16"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_16"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_16"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 16) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_17"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_17"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_17"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_17"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 17) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_18"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_18"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_18"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_18"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 18) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_19"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_19"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_19"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_19"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		} else if (RandyPants == 19) {
			if (RandyJunior == 0) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_20"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z), BlockPos.containing(x, elevation, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 1) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_20"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z), BlockPos.containing(x + 22, elevation, z),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (RandyJunior == 2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_20"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 22, elevation, z + 22), BlockPos.containing(x + 22, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_building_20"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, elevation, z + 22), BlockPos.containing(x, elevation, z + 22),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		}
	}
}
