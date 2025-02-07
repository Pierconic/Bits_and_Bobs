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

public class TempleHomeSelectProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rotation = 0;
		double morenumbers = 0;
		if (TempleSmallerCheckProcedure.execute(world, x, y, z)) {
			morenumbers = Mth.nextInt(RandomSource.create(), 0, 15);
			rotation = Mth.nextInt(RandomSource.create(), 0, 3);
			if (morenumbers == 0) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 1) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 2) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 3) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 4) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 5) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 6) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_7"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 7) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_8"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 8) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_9"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_9"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_9"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_9"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 9) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_10"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_10"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_10"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_10"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 10) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_11"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_11"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_11"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_11"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 11) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_12"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_12"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_12"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_12"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 12) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_13"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_13"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_13"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_13"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 13) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_14"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_14"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_14"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_14"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 14) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_15"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_15"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_15"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_15"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			} else if (morenumbers == 15) {
				if (rotation == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_16"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z), BlockPos.containing(x, y - 7, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (rotation == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_16"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z), BlockPos.containing(x + 17, y - 7, z),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_16"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 17, y - 7, z + 17), BlockPos.containing(x + 17, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (rotation == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "temple_homef1_16"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 7, z + 17), BlockPos.containing(x, y - 7, z + 17),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
		}
	}
}
