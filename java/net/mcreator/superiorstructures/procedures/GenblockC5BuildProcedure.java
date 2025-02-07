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

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;
import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class GenblockC5BuildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
		double height = 0;
		double rotation = 0;
		double lab = 0;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
		height = 11;
		rotation = Mth.nextInt(RandomSource.create(), 0, 3);
		lab = Mth.nextInt(RandomSource.create(), 0, 3);
		if (world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude()) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager()
						.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_tunnel_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y - 5, z), BlockPos.containing(x, y - 5, z),
							new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
							_serverworld.random, 3);
				}
			}
			for (int index0 = 0; index0 < (int) (Mth.nextInt(RandomSource.create(), 1, 4)); index0++) {
				number = Mth.nextInt(RandomSource.create(), 0, 5);
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_tunnel_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - height, z - 1), BlockPos.containing(x - 1, y - height, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					height = height + 6;
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_tunnel_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - height, z - 1), BlockPos.containing(x - 1, y - height, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					height = height + 6;
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_tunnel_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - height, z - 1), BlockPos.containing(x - 1, y - height, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					height = height + 6;
				} else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_tunnel_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - height, z - 1), BlockPos.containing(x - 1, y - height, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					height = height + 6;
				} else if (number == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_tunnel_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - height, z - 1), BlockPos.containing(x - 1, y - height, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					height = height + 6;
				} else if (number == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_tunnel_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - height, z - 1), BlockPos.containing(x - 1, y - height, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					height = height + 6;
				}
			}
			if (rotation == 0) {
				if (lab == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, (y - height) - 1, z - 1),
									BlockPos.containing(x - 1, (y - height) - 1, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (lab == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, (y - height) - 1, z - 1),
									BlockPos.containing(x - 1, (y - height) - 1, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (lab == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, (y - height) - 1, z - 4),
									BlockPos.containing(x - 2, (y - height) - 1, z - 4),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (lab == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, (y - height) - 1, z - 1),
									BlockPos.containing(x - 1, (y - height) - 1, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (rotation == 1) {
				if (lab == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 5, (y - height) - 1, z - 1),
									BlockPos.containing(x + 5, (y - height) - 1, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (lab == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 5, (y - height) - 1, z - 1),
									BlockPos.containing(x + 5, (y - height) - 1, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (lab == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 8, (y - height) - 1, z - 2),
									BlockPos.containing(x + 8, (y - height) - 1, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (lab == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 5, (y - height) - 1, z - 1),
									BlockPos.containing(x + 5, (y - height) - 1, z - 1),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (rotation == 2) {
				if (lab == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 5, (y - height) - 1, z + 5),
									BlockPos.containing(x + 5, (y - height) - 1, z + 5),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (lab == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 5, (y - height) - 1, z + 5),
									BlockPos.containing(x + 5, (y - height) - 1, z + 5),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (lab == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 6, (y - height) - 1, z + 8),
									BlockPos.containing(x + 6, (y - height) - 1, z + 8),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (lab == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 5, (y - height) - 1, z + 5),
									BlockPos.containing(x + 5, (y - height) - 1, z + 5),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if (rotation == 3) {
				if (lab == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, (y - height) - 1, z + 5),
									BlockPos.containing(x - 1, (y - height) - 1, z + 5), new StructurePlaceSettings()
											.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (lab == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, (y - height) - 1, z + 5),
									BlockPos.containing(x - 1, (y - height) - 1, z + 5), new StructurePlaceSettings()
											.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (lab == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 4, (y - height) - 1, z + 6),
									BlockPos.containing(x - 4, (y - height) - 1, z + 6), new StructurePlaceSettings()
											.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (lab == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_lab_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 1, (y - height) - 1, z + 5),
									BlockPos.containing(x - 1, (y - height) - 1, z + 5), new StructurePlaceSettings()
											.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			}
		} else if (world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude()) {
			world.setBlock(BlockPos.containing(x - 4, y, z - 4), SuperiorstructuresModBlocks.GENBLOCK_C_5.get().defaultBlockState(), 3);
		} else if (world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude()) {
			world.setBlock(BlockPos.containing(x, y, z - 4), SuperiorstructuresModBlocks.GENBLOCK_C_5.get().defaultBlockState(), 3);
		} else if (world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude()) {
			world.setBlock(BlockPos.containing(x - 4, y, z), SuperiorstructuresModBlocks.GENBLOCK_C_5.get().defaultBlockState(), 3);
		}
		}
	}
}