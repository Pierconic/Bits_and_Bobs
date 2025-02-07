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

public class GenblockO1Gate0Procedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double chance = 0;
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef1_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, 24, z + 5), BlockPos.containing(x, 24, z + 5), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		} else if (chance == 2) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef1_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, 24, z + 5), BlockPos.containing(x, 24, z + 5), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
		}
		chance = Mth.nextInt(RandomSource.create(), 1, 2);
		if (chance == 1) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef2_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 3, 40, z + 5), BlockPos.containing(x - 3, 40, z + 5), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_gatef2_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 3, 40, z + 5), BlockPos.containing(x - 3, 40, z + 5), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
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
						template.placeInWorld(_serverworld, BlockPos.containing(x - 11, 47, z + 15), BlockPos.containing(x - 11, 47, z + 15), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (chance == 2) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_roof_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 11, 47, z + 15), BlockPos.containing(x - 11, 47, z + 15), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (chance == 3) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_roof_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x - 11, 47, z + 15), BlockPos.containing(x - 11, 47, z + 15), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		}
	}
}
