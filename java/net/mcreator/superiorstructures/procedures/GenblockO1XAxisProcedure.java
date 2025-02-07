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

public class GenblockO1XAxisProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double chance = 0;
		SuperiorstructuresMod.queueServerWork(1, () -> {
			PlaceArchwaysProcedure.execute(world, x, z);
		});
		SuperiorstructuresMod.queueServerWork(5, () -> {
			PlaceMonumentHallProcedure.execute(world, x - 20, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x - 20), (int) (z - 29)) - 8, z - 29);
			PlaceMonumentHallProcedure.execute(world, x - 20, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x - 20), (int) (z + 49)) - 8, z + 49);
			PlaceMonumentHallProcedure.execute(world, x + 50, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 50), (int) (z - 29)) - 8, z - 29);
			PlaceMonumentHallProcedure.execute(world, x + 50, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 50), (int) (z + 49)) - 8, z + 49);
		});
		SuperiorstructuresMod.queueServerWork(10, () -> {
			PlaceMonumentTowerProcedure.execute(world, x - 20, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x - 20), (int) (z - 50)) - 8, z - 50);
			PlaceMonumentTowerProcedure.execute(world, x - 20, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x - 20), (int) (z + 85)) - 8, z + 85);
			PlaceMonumentTowerProcedure.execute(world, x + 50, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 50), (int) (z - 50)) - 8, z - 50);
			PlaceMonumentTowerProcedure.execute(world, x + 50, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 50), (int) (z + 85)) - 8, z + 85);
		});
		SuperiorstructuresMod.queueServerWork(15, () -> {
			PlaceMonumentBuildingProcedure.execute(world, x - 46, z - 43);
			PlaceMonumentBuildingProcedure.execute(world, x - 46, z - 18);
			PlaceMonumentBuildingProcedure.execute(world, x - 46, z + 45);
			PlaceMonumentBuildingProcedure.execute(world, x - 46, z + 71);
		});
		SuperiorstructuresMod.queueServerWork(20, () -> {
			PlaceMonumentBuildingProcedure.execute(world, x + 73, z - 43);
			PlaceMonumentBuildingProcedure.execute(world, x + 73, z - 18);
			PlaceMonumentBuildingProcedure.execute(world, x + 73, z + 45);
			PlaceMonumentBuildingProcedure.execute(world, x + 73, z + 71);
		});
		chance = Mth.nextInt(RandomSource.create(), 1, 3);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef2_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 3 + 48, y + 16, z + 5), BlockPos.containing(x - 3 + 48, y + 16, z + 5),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef2_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 3 + 48, y + 16, z + 5), BlockPos.containing(x - 3 + 48, y + 16, z + 5),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 3) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef2_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 3 + 48, y + 16, z + 5), BlockPos.containing(x - 3 + 48, y + 16, z + 5),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
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
						template.placeInWorld(_serverworld, BlockPos.containing(x - 9 + 48, y + 23, z + 17), BlockPos.containing(x - 9 + 48, y + 23, z + 17),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_roof_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 9 + 48, y + 23, z + 17), BlockPos.containing(x - 9 + 48, y + 23, z + 17),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 3) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_roof_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 9 + 48, y + 23, z + 17), BlockPos.containing(x - 9 + 48, y + 23, z + 17),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
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
						template.placeInWorld(_serverworld, BlockPos.containing((x + 3) - 0, y + 16, z - 5 + 48), BlockPos.containing((x + 3) - 0, y + 16, z - 5 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef2_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing((x + 3) - 0, y + 16, z - 5 + 48), BlockPos.containing((x + 3) - 0, y + 16, z - 5 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 3) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef2_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing((x + 3) - 0, y + 16, z - 5 + 48), BlockPos.containing((x + 3) - 0, y + 16, z - 5 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
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
						template.placeInWorld(_serverworld, BlockPos.containing((x + 10) - 0, y + 23, z - 17 + 48), BlockPos.containing((x + 10) - 0, y + 23, z - 17 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_roof_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing((x + 10) - 0, y + 23, z - 17 + 48), BlockPos.containing((x + 10) - 0, y + 23, z - 17 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		}
	}
}
