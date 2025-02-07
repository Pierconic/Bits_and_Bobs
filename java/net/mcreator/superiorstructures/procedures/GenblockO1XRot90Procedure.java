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

import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class GenblockO1XRot90Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double chance = 0;
		SuperiorstructuresMod.queueServerWork(1, () -> {
			PlaceArchwaysRot90Procedure.execute(world, x, z);
		});
		SuperiorstructuresMod.queueServerWork(5, () -> {
			PlaceMonumentHallProcedure.execute(world, x - 22, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x - 22), (int) (z - 25)) - 8, z - 25);
			PlaceMonumentHallProcedure.execute(world, x + 47, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 47), (int) (z - 25)) - 8, z - 25);
			PlaceMonumentHallProcedure.execute(world, x - 22, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x - 22), (int) (z + 45)) - 8, z + 45);
			PlaceMonumentHallProcedure.execute(world, x + 47, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 47), (int) (z + 45)) - 8, z + 45);
		});
		SuperiorstructuresMod.queueServerWork(10, () -> {
			PlaceMonumentTowerProcedure.execute(world, x - 50, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x - 50), (int) (z - 20)) - 8, z - 20);
			PlaceMonumentTowerProcedure.execute(world, x + 85, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 85), (int) (z - 20)) - 8, z - 20);
			PlaceMonumentTowerProcedure.execute(world, x - 50, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x - 50), (int) (z + 50)) - 8, z + 50);
			PlaceMonumentTowerProcedure.execute(world, x + 85, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 85), (int) (z + 50)) - 8, z + 50);
		});
		SuperiorstructuresMod.queueServerWork(15, () -> {
			PlaceMonumentBuildingProcedure.execute(world, x - 43, z - 46);
			PlaceMonumentBuildingProcedure.execute(world, x - 18, z - 46);
			PlaceMonumentBuildingProcedure.execute(world, x + 45, z - 46);
			PlaceMonumentBuildingProcedure.execute(world, x + 71, z - 46);
		});
		SuperiorstructuresMod.queueServerWork(20, () -> {
			PlaceMonumentBuildingProcedure.execute(world, x - 43, z + 73);
			PlaceMonumentBuildingProcedure.execute(world, x - 18, z + 73);
			PlaceMonumentBuildingProcedure.execute(world, x + 45, z + 73);
			PlaceMonumentBuildingProcedure.execute(world, x + 71, z + 73);
		});
		chance = Mth.nextInt(RandomSource.create(), 1, 3);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef2_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 43, y + 16, z - 3 + 48), BlockPos.containing(x + 43, y + 16, z - 3 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef2_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 43, y + 16, z - 3 + 48), BlockPos.containing(x + 43, y + 16, z - 3 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 3) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef2_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 43, y + 16, z - 3 + 48), BlockPos.containing(x + 43, y + 16, z - 3 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 3);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_roof_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 31, y + 23, z - 10 + 48), BlockPos.containing(x + 31, y + 23, z - 10 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_roof_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 31, y + 23, z - 10 + 48), BlockPos.containing(x + 31, y + 23, z - 10 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 3) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_roof_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 31, y + 23, z - 10 + 48), BlockPos.containing(x + 31, y + 23, z - 10 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 3);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef2_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 2 + 8, y + 16, (z + 3) - 1), BlockPos.containing(x - 2 + 8, y + 16, (z + 3) - 1),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef2_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 2 + 8, y + 16, (z + 3) - 1), BlockPos.containing(x - 2 + 8, y + 16, (z + 3) - 1),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 3) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef2_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 2 + 8, y + 16, (z + 3) - 1), BlockPos.containing(x - 2 + 8, y + 16, (z + 3) - 1),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_roof_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 16 + 0, y + 23, (z + 10) - 1), BlockPos.containing(x + 16 + 0, y + 23, (z + 10) - 1),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_roof_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 16 + 0, y + 23, (z + 10) - 1), BlockPos.containing(x + 16 + 0, y + 23, (z + 10) - 1),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		}
	}
}
