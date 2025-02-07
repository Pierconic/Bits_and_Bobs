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

import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class GenblockO1Hall270Procedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double chance = 0;
		chance = Mth.nextInt(RandomSource.create(), 1, 3);
		if (chance == 1) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_hallf1_4"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 5, 24, z - 1), BlockPos.containing(x + 5, 24, z - 1),
							new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (chance == 2) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_hallf1_5"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 5, 24, z - 1), BlockPos.containing(x + 5, 24, z - 1),
							new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (chance == 3) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_hallf1_6"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x + 5, 24, z - 1), BlockPos.containing(x + 5, 24, z - 1),
							new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 3);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_hallf2_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 5, 39, z - 1), BlockPos.containing(x + 5, 39, z - 1),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_hallf2_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 5, 39, z - 1), BlockPos.containing(x + 5, 39, z - 1),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 3) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_hallf2_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 5, 39, z - 1), BlockPos.containing(x + 5, 39, z - 1),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_wingf1_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 0, 24, z - 21), BlockPos.containing(x - 0, 24, z - 21),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_wingf1_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 0, 24, z - 21), BlockPos.containing(x - 0, 24, z - 21),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_wingf2_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 0, 39, z - 21), BlockPos.containing(x - 0, 39, z - 21),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_wingf2_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 0, 39, z - 21), BlockPos.containing(x - 0, 39, z - 21),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing((x + 17) - 0, 51, z - 33), BlockPos.containing((x + 17) - 0, 51, z - 33),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing((x + 17) - 0, 51, z - 33), BlockPos.containing((x + 17) - 0, 51, z - 33),
								new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		}
	}
}
