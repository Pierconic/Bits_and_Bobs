package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class MansionRightGardenProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String side1 = "";
		String side2 = "";
		String side3 = "";
		String side4 = "";
		double type = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y - 16, z), BlockPos.containing(x, y - 16, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 12, z), BlockPos.containing(x, y - 12, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 8, z), BlockPos.containing(x, y - 8, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 4, z), BlockPos.containing(x, y - 4, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 4, z), BlockPos.containing(x, y + 4, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(6, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 8, z), BlockPos.containing(x, y + 8, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(7, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 15, z), BlockPos.containing(x, y + 15, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(8, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 21, z), BlockPos.containing(x, y + 21, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(9, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 25, z), BlockPos.containing(x, y + 25, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f11"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 29, z), BlockPos.containing(x, y + 29, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(11, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f12"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 32, z), BlockPos.containing(x, y + 32, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(12, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f13"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 36, z), BlockPos.containing(x, y + 36, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(13, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f14"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 41, z), BlockPos.containing(x, y + 41, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(14, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f15"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 45, z), BlockPos.containing(x, y + 45, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(15, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f16"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 49, z), BlockPos.containing(x, y + 49, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(16, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f17"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 53, z), BlockPos.containing(x, y + 53, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(17, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f18"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 57, z), BlockPos.containing(x, y + 57, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(18, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f19"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 63, z), BlockPos.containing(x, y + 63, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
			SuperiorstructuresMod.queueServerWork(19, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "mansion_garden_f20"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 68, z), BlockPos.containing(x, y + 68, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			});
		}
	}
}