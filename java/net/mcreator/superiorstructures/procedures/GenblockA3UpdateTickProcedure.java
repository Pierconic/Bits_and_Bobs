package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GenblockA3UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
		number = Mth.nextInt(RandomSource.create(), 0, 9);
		if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.STONE_BRICKS || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.POLISHED_BASALT || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.CUT_COPPER) {
			if (number == 0) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 1) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 2) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 3) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 4) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_9"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 5) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_11"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 6) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_12"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 7) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_13"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 8) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_9"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_14"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 9) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_10"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_15"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z + 3), BlockPos.containing(x + 3, y - 1, z + 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.STONE_BRICKS || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.POLISHED_BASALT || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.CUT_COPPER) {
			if (number == 0) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20){
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 1) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20){
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 2) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20){
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 3) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20){
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 4) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20){
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_9"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 5) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20){
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_11"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 6) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20){
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_12"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 7) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20){
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_13"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 8) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_9"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20){
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_14"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}  else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 9) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_10"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20){
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_15"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}  else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z - 3), BlockPos.containing(x - 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.STONE_BRICKS || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.POLISHED_BASALT || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.CUT_COPPER) {
			if (number == 0) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (number == 1) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (number == 2) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (number == 3) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (number == 4) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_9"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (number == 5) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_11"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (number == 6) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_12"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (number == 7) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_13"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (number == 8) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_9"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_14"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (number == 9) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_10"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_15"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 3, y - 1, z + 3), BlockPos.containing(x - 3, y - 1, z + 3),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.STONE_BRICKS || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.POLISHED_BASALT || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.CUT_COPPER) {
			if (number == 0) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 1) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_dorm_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 2) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 3) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 4) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_9"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "dungeon_station_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 5) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_11"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 6) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_12"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 7) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_13"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 8) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_9"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_14"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (number == 9) {
				if (y <= -30) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_10"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (y <= 20) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_15"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "spider_dungeon_side_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 3, y - 1, z - 3), BlockPos.containing(x + 3, y - 1, z - 3), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			}
		}
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
	}
}