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

public class GenblockI1FSelectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
		double rotation = 0;
		if ((world.canSeeSkyFromBelowWater(BlockPos.containing(x + 8, y + 12, z)) || world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 12, z + 8)))
				&& (world.canSeeSkyFromBelowWater(BlockPos.containing(x + 8, y + 12, z + 8)) || world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 12, z)))
				&& (world.getBlockState(BlockPos.containing(x, y , z)).canOcclude() || world.getBlockState(BlockPos.containing(x + 8, y, z + 8)).canOcclude())
				&& (world.getBlockState(BlockPos.containing(x, y, z + 8)).canOcclude() || world.getBlockState(BlockPos.containing(x + 8, y, z)).canOcclude())) {
			number = Mth.nextInt(RandomSource.create(), 0, 8);
			rotation = Mth.nextInt(RandomSource.create(), 0, 3);
			if (number == 0) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z), BlockPos.containing(x + 10, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 10), BlockPos.containing(x, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z + 10), BlockPos.containing(x + 10, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 1) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z), BlockPos.containing(x + 10, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 10), BlockPos.containing(x, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z + 10), BlockPos.containing(x + 10, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 2) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z), BlockPos.containing(x + 10, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 10), BlockPos.containing(x, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z + 10), BlockPos.containing(x + 10, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 3) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z), BlockPos.containing(x + 10, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 10), BlockPos.containing(x, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z + 10), BlockPos.containing(x + 10, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 4) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z), BlockPos.containing(x + 10, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 10), BlockPos.containing(x, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z + 10), BlockPos.containing(x + 10, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 5) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z), BlockPos.containing(x + 10, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 10), BlockPos.containing(x, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z + 10), BlockPos.containing(x + 10, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 6) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z), BlockPos.containing(x + 10, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 10), BlockPos.containing(x, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z + 10), BlockPos.containing(x + 10, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 7) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z), BlockPos.containing(x + 10, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 10), BlockPos.containing(x, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z + 10), BlockPos.containing(x + 10, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			} else if (number == 8) {
				if (rotation == 0) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 1) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z), BlockPos.containing(x + 10, y, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 2) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z + 10), BlockPos.containing(x, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				} else if (rotation == 3) {
					SuperiorstructuresMod.queueServerWork(2, () -> {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_side_plain_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 10, y, z + 10), BlockPos.containing(x + 10, y, z + 10), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					});
				}
			}
		}
	}
}