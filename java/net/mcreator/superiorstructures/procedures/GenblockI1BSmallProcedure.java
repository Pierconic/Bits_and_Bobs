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

public class GenblockI1BSmallProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
		double rotation = 0;
		if ((world.canSeeSkyFromBelowWater(BlockPos.containing(x + 5, y + 6, z)) || world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 6, z + 5)))
				&& (world.canSeeSkyFromBelowWater(BlockPos.containing(x + 5, y + 6, z + 5)) || world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 6, z)))
				&& (world.getBlockState(BlockPos.containing(x, y - 4, z)).canOcclude() || world.getBlockState(BlockPos.containing(x + 5, y - 4, z + 5)).canOcclude())
				&& (world.getBlockState(BlockPos.containing(x, y - 4, z + 5)).canOcclude() || world.getBlockState(BlockPos.containing(x + 5, y - 4, z)).canOcclude())) {
			number = Mth.nextInt(RandomSource.create(), 0, 7);
			rotation = Mth.nextInt(RandomSource.create(), 0, 3);
			if (number == 0) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z), BlockPos.containing(x + 6, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 6), BlockPos.containing(x, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z + 6), BlockPos.containing(x + 6, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 1) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z), BlockPos.containing(x + 6, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 6), BlockPos.containing(x, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z + 6), BlockPos.containing(x + 6, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 2) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z), BlockPos.containing(x + 6, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 6), BlockPos.containing(x, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z + 6), BlockPos.containing(x + 6, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 3) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z), BlockPos.containing(x + 6, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 6), BlockPos.containing(x, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z + 6), BlockPos.containing(x + 6, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 4) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z), BlockPos.containing(x + 6, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 6), BlockPos.containing(x, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z + 6), BlockPos.containing(x + 6, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 5) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z), BlockPos.containing(x + 6, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 6), BlockPos.containing(x, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z + 6), BlockPos.containing(x + 6, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 6) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z), BlockPos.containing(x + 6, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 6), BlockPos.containing(x, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z + 6), BlockPos.containing(x + 6, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 7) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z), BlockPos.containing(x + 6, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 6), BlockPos.containing(x, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(4, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_small_cold_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 6, y, z + 6), BlockPos.containing(x + 6, y, z + 6), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			}
		}
	}
}