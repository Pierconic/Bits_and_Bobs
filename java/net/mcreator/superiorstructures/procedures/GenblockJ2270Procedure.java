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

public class GenblockJ2270Procedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double numerator = 0;
		numerator = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numerator == 0) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf1_1"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (numerator == 1) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf1_2"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (numerator == 2) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf1_3"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (numerator == 3) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf1_4"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (numerator == 4) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf1_5"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (numerator == 5) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf1_6"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (numerator == 6) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf1_7"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		} else if (numerator == 7) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf1_8"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
		}
		numerator = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numerator == 0) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf2_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 10, z), BlockPos.containing(x, y + 10, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 1) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf2_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 10, z), BlockPos.containing(x, y + 10, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 2) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf2_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 10, z), BlockPos.containing(x, y + 10, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 3) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf2_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 10, z), BlockPos.containing(x, y + 10, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 4) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf2_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 10, z), BlockPos.containing(x, y + 10, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 5) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf2_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 10, z), BlockPos.containing(x, y + 10, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 6) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf2_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 10, z), BlockPos.containing(x, y + 10, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 7) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf2_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 10, z), BlockPos.containing(x, y + 10, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		}
		numerator = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numerator == 0) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf3_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 16, z), BlockPos.containing(x, y + 16, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 1) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf3_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 16, z), BlockPos.containing(x, y + 16, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 2) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf3_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 16, z), BlockPos.containing(x, y + 16, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 3) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf3_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 16, z), BlockPos.containing(x, y + 16, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 4) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf3_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 16, z), BlockPos.containing(x, y + 16, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 5) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf3_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 16, z), BlockPos.containing(x, y + 16, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 6) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf3_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 16, z), BlockPos.containing(x, y + 16, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 7) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf3_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 16, z), BlockPos.containing(x, y + 16, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		}
		numerator = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numerator == 0) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf4_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 22, z), BlockPos.containing(x, y + 22, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 1) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf4_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 22, z), BlockPos.containing(x, y + 22, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 2) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf4_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 22, z), BlockPos.containing(x, y + 22, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 3) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf4_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 22, z), BlockPos.containing(x, y + 22, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 4) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf4_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 22, z), BlockPos.containing(x, y + 22, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 5) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf4_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 22, z), BlockPos.containing(x, y + 22, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 6) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf4_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 22, z), BlockPos.containing(x, y + 22, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 7) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf4_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 22, z), BlockPos.containing(x, y + 22, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		}
		numerator = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numerator == 0) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf5_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 28, z), BlockPos.containing(x, y + 28, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 1) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf5_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 28, z), BlockPos.containing(x, y + 28, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 2) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf5_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 28, z), BlockPos.containing(x, y + 28, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 3) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf5_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 28, z), BlockPos.containing(x, y + 28, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 4) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf5_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 28, z), BlockPos.containing(x, y + 28, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 5) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf5_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 28, z), BlockPos.containing(x, y + 28, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 6) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf5_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 28, z), BlockPos.containing(x, y + 28, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 7) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf5_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 28, z), BlockPos.containing(x, y + 28, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		}
		numerator = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numerator == 0) {
			SuperiorstructuresMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf6_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 34, z), BlockPos.containing(x, y + 34, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 1) {
			SuperiorstructuresMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf6_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 34, z), BlockPos.containing(x, y + 34, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 2) {
			SuperiorstructuresMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf6_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 34, z), BlockPos.containing(x, y + 34, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 3) {
			SuperiorstructuresMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf6_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 34, z), BlockPos.containing(x, y + 34, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 4) {
			SuperiorstructuresMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf6_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 34, z), BlockPos.containing(x, y + 34, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 5) {
			SuperiorstructuresMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf6_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 34, z), BlockPos.containing(x, y + 34, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 6) {
			SuperiorstructuresMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf6_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 34, z), BlockPos.containing(x, y + 34, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		} else if (numerator == 7) {
			SuperiorstructuresMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_towerf6_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y + 34, z), BlockPos.containing(x, y + 34, z), new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			});
		}
	}
}
