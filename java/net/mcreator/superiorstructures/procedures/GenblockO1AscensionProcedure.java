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

public class GenblockO1AscensionProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double chance = 0;
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_core_f1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 9, 4, z + 9), BlockPos.containing(x + 9, 4, z + 9), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (chance == 2) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_core_f1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 9, 4, z + 9), BlockPos.containing(x + 9, 4, z + 9), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_core_f2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 9, 15, z + 9), BlockPos.containing(x + 9, 15, z + 9), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_core_f2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 9, 15, z + 9), BlockPos.containing(x + 9, 15, z + 9), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_core_f3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 0, 24, z + 0), BlockPos.containing(x + 0, 24, z + 0), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_core_f3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 0, 24, z + 0), BlockPos.containing(x + 0, 24, z + 0), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_core_f4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 0, 40, z + 0), BlockPos.containing(x + 0, 40, z + 0), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_core_f4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 0, 40, z + 0), BlockPos.containing(x + 0, 40, z + 0), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_core_f5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 0, 47, z + 0), BlockPos.containing(x + 0, 47, z + 0), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_core_f5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 0, 47, z + 0), BlockPos.containing(x + 0, 47, z + 0), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_topper_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 0, 58, z + 14), BlockPos.containing(x + 0, 58, z + 14), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_topper_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 0, 58, z + 14), BlockPos.containing(x + 0, 58, z + 14), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		}
		SuperiorstructuresMod.queueServerWork(12, () -> {
			GenblockO1Gate0Procedure.execute(world, x + 48, z);
		});
		SuperiorstructuresMod.queueServerWork(18, () -> {
			GenblockO1Gate180Procedure.execute(world, x - 1, z + 48);
		});
		SuperiorstructuresMod.queueServerWork(24, () -> {
			GenblockO1Hall90Procedure.execute(world, x, z);
		});
		SuperiorstructuresMod.queueServerWork(26, () -> {
			GenblockO1Hall270Procedure.execute(world, x, z);
		});
		SuperiorstructuresMod.queueServerWork(28, () -> {
			PlaceArchwaysProcedure.execute(world, x, z);
		});
		SuperiorstructuresMod.queueServerWork(32, () -> {
			PlaceMonumentHallProcedure.execute(world, x - 20, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x - 20), (int) (z - 29)) - 8, z - 29);
			PlaceMonumentHallProcedure.execute(world, x - 20, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x - 20), (int) (z + 49)) - 8, z + 49);
			PlaceMonumentHallProcedure.execute(world, x + 50, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 50), (int) (z - 29)) - 8, z - 29);
			PlaceMonumentHallProcedure.execute(world, x + 50, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 50), (int) (z + 49)) - 8, z + 49);
		});
		SuperiorstructuresMod.queueServerWork(34, () -> {
			PlaceMonumentTowerProcedure.execute(world, x - 20, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x - 20), (int) (z - 50)) - 8, z - 50);
			PlaceMonumentTowerProcedure.execute(world, x - 20, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x - 20), (int) (z + 85)) - 8, z + 85);
			PlaceMonumentTowerProcedure.execute(world, x + 50, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 50), (int) (z - 50)) - 8, z - 50);
			PlaceMonumentTowerProcedure.execute(world, x + 50, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 50), (int) (z + 85)) - 8, z + 85);
		});
		SuperiorstructuresMod.queueServerWork(38, () -> {
			PlaceMonumentBuildingProcedure.execute(world, x - 46, z - 43);
			PlaceMonumentBuildingProcedure.execute(world, x - 46, z - 18);
			PlaceMonumentBuildingProcedure.execute(world, x - 46, z + 45);
			PlaceMonumentBuildingProcedure.execute(world, x - 46, z + 71);
		});
		SuperiorstructuresMod.queueServerWork(42, () -> {
			PlaceMonumentBuildingProcedure.execute(world, x + 73, z - 43);
			PlaceMonumentBuildingProcedure.execute(world, x + 73, z - 18);
			PlaceMonumentBuildingProcedure.execute(world, x + 73, z + 45);
			PlaceMonumentBuildingProcedure.execute(world, x + 73, z + 71);
		});
	}
}
