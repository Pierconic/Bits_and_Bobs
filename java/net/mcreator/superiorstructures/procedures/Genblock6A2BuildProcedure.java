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

public class Genblock6A2BuildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double numberoftheday = 0;
		double rotation = 0;
		double level = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (world.getBlockState(BlockPos.containing(x, y - 2, z)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x, y + 1, z))
				&& world.getBlockState(BlockPos.containing(x + 4, y - 2, z)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x + 4, y + 2, z))
				&& world.getBlockState(BlockPos.containing(x, y - 2, z + 4)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x, y + 2, z + 4))
				&& world.getBlockState(BlockPos.containing(x + 4, y - 2, z + 4)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x + 4, y + 2, z + 4))) {
			rotation = Mth.nextInt(RandomSource.create(), 0, 3);
			if (Math.random() < 0.3) {
				numberoftheday = Mth.nextInt(RandomSource.create(), 0, 3);
			} else {
				numberoftheday = Mth.nextInt(RandomSource.create(), 4, 7);
			}
			if (world.isEmptyBlock(BlockPos.containing(x + 4, y - 1, z + 4))) {
				level = -4;
			} else if (world.getBlockState(BlockPos.containing(x + 4, y + 1, z + 4)).canOcclude()) {
				level = -2;
			} else {
				level = -3;
			}
			if (numberoftheday == 0) {
				if (rotation == 0) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside1_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside1_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 1) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside1_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside1_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 2) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside1_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside1_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 3) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside1_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside1_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			} else if (numberoftheday == 1) {
				if (rotation == 0) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside2_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside2_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 1) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside2_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside2_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 2) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside2_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside2_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 3) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside2_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside2_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			} else if (numberoftheday == 2) {
				if (rotation == 0) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside3_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside3_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 1) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside3_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside3_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 2) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside3_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside3_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 3) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside3_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside3_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			} else if (numberoftheday == 3) {
				if (rotation == 0) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside4_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside4_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 1) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside4_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside4_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 2) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside4_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside4_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 3) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside4_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside4_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			} else if (numberoftheday == 4) {
				if (rotation == 0) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside5_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside5_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 1) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside5_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside5_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 2) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside5_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside5_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 3) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside5_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside5_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			} else if (numberoftheday == 5) {
				if (rotation == 0) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside6_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside6_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 1) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside6_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside6_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 2) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside6_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside6_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 3) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside6_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside6_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			} else if (numberoftheday == 6) {
				if (rotation == 0) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside7_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside7_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 1) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside7_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside7_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 2) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside7_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside7_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 3) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside7_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside7_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			} else if (numberoftheday == 7) {
				if (rotation == 0) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside8_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside8_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z), BlockPos.containing(x, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 1) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside8_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside8_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z), BlockPos.containing(x + 4, y + level, z),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 2) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside8_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside8_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 4, y + level, z + 4), BlockPos.containing(x + 4, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 3) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside8_r3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE)
												.setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_roadside8_r4"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y + level, z + 4), BlockPos.containing(x, y + level, z + 4),
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