package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class GenblockF3DBuildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean ruin = false;
		double level = 0;
		double selection = 0;
		double rotation = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (world.getBlockState(BlockPos.containing(x, y - 3, z)).canOcclude()
				&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER)
				&& !world.getBlockState(BlockPos.containing(x, y + 2, z)).canOcclude() && world.getBlockState(BlockPos.containing(x + 13, y - 3, z)).canOcclude()
				&& !((world.getBlockState(BlockPos.containing(x + 13, y - 1, z))).getBlock() == Blocks.WATER)
				&& !world.getBlockState(BlockPos.containing(x + 13, y + 2, z)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x, y - 3, z + 13)).canOcclude()
				&& !((world.getBlockState(BlockPos.containing(x, y - 1, z + 13))).getBlock() == Blocks.WATER)
				&& !world.getBlockState(BlockPos.containing(x, y + 2, z + 13)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x + 13, y - 3, z + 13)).canOcclude()
				&& !((world.getBlockState(BlockPos.containing(x + 13, y - 1, z + 13))).getBlock() == Blocks.WATER)
				&& !world.getBlockState(BlockPos.containing(x + 13, y + 2, z + 13)).canOcclude()) {
			sx = 0;
			for (int index0 = 0; index0 < (int) (15); index0++) {
				sy = 0;
				for (int index1 = 0; index1 < (int) (15); index1++) {
					sz = 0;
					for (int index2 = 0; index2 < (int) (15); index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)))
										.is(BlockTags.create(ResourceLocation.parse("minecraft:leaves")))) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (world.getBlockState(BlockPos.containing(x + 13, y + 1, z + 13)).canOcclude()) {
				level = 2;
			} else if (!world.getBlockState(BlockPos.containing(x + 13, y - 2, z + 13)).canOcclude()) {
				level = 4;
			} else {
				level = 3;
			}
			if (Math.random() < 0.65) {
				ruin = false;
			} else {
				ruin = true;
			}
			rotation = Mth.nextInt(RandomSource.create(), 0, 3);
			selection = Mth.nextInt(RandomSource.create(), 0, 11);
				if (selection == 0) {
					if (rotation == 0) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_armorer_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_armorer_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_armorer_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_armorer_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_armorer_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_armorer_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_armorer_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_armorer_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (selection == 1) {
					if (rotation == 0) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_butcher_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_butcher_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_butcher_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_butcher_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_butcher_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_butcher_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_butcher_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_butcher_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (selection == 2) {
					if (rotation == 0) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cartographer_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cartographer_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cartographer_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cartographer_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cartographer_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cartographer_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cartographer_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cartographer_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (selection == 3) {
					if (rotation == 0) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cleric_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cleric_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cleric_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cleric_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cleric_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cleric_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cleric_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_cleric_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (selection == 4) {
					if (rotation == 0) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fisher_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fisher_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fisher_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fisher_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fisher_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fisher_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fisher_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fisher_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (selection == 5) {
					if (rotation == 0) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fletcher_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fletcher_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fletcher_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fletcher_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fletcher_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fletcher_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fletcher_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_fletcher_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (selection == 6) {
					if (rotation == 0) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_leatherworker_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_leatherworker_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_leatherworker_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_leatherworker_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_leatherworker_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_leatherworker_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_leatherworker_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_leatherworker_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (selection == 7) {
					if (rotation == 0) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_library_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_library_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_library_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_library_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_library_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_library_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_library_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_library_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (selection == 8) {
					if (rotation == 0) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_mason_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_mason_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_mason_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_mason_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_mason_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_mason_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_mason_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_mason_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (selection == 9) {
					if (rotation == 0) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_shepherd_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_shepherd_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_shepherd_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_shepherd_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_shepherd_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_shepherd_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_shepherd_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_shepherd_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (selection == 10) {
					if (rotation == 0) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_toolsmith_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_toolsmith_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_toolsmith_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_toolsmith_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_toolsmith_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_toolsmith_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_toolsmith_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_toolsmith_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (selection == 11) {
					if (rotation == 0) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_weaponsmith_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_weaponsmith_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_weaponsmith_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_weaponsmith_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_weaponsmith_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_weaponsmith_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (ruin == true) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_weaponsmith_r4"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_weaponsmith_r3"));
								if (template != null) {
									template.placeInWorld(_serverworld,
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level,
													z + 13),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
													.setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				}
			}
		}
	}