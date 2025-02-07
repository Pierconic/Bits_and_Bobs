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

public class GenblockO1Hall90Procedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double chance = 0;
		chance = Mth.nextInt(RandomSource.create(), 1, 3);
		if (chance == 1) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_hallf1_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing((x + 47) - 5, 24, z + 48), BlockPos.containing((x + 47) - 5, 24, z + 48),
							new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (chance == 2) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_hallf1_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing((x + 47) - 5, 24, z + 48), BlockPos.containing((x + 47) - 5, 24, z + 48),
							new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (chance == 3) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_hallf1_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing((x + 47) - 5, 24, z + 48), BlockPos.containing((x + 47) - 5, 24, z + 48),
							new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 3);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_hallf2_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing((x + 47) - 5, 39, z + 48), BlockPos.containing((x + 47) - 5, 39, z + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_hallf2_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing((x + 47) - 5, 39, z + 48), BlockPos.containing((x + 47) - 5, 39, z + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 3) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_hallf2_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing((x + 47) - 5, 39, z + 48), BlockPos.containing((x + 47) - 5, 39, z + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_wingf1_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing((x + 47) - 0, 24, z + 21 + 48), BlockPos.containing((x + 47) - 0, 24, z + 21 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_wingf1_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing((x + 47) - 0, 24, z + 21 + 48), BlockPos.containing((x + 47) - 0, 24, z + 21 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_wingf2_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing((x + 47) - 0, 39, z + 21 + 48), BlockPos.containing((x + 47) - 0, 39, z + 21 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_wingf2_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing((x + 47) - 0, 39, z + 21 + 48), BlockPos.containing((x + 47) - 0, 39, z + 21 + 48),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing((x + 29) - 0, 51, z + 80), BlockPos.containing((x + 29) - 0, 51, z + 80),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing((x + 29) - 0, 51, z + 80), BlockPos.containing((x + 29) - 0, 51, z + 80),
								new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		}
	}
}
