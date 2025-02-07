package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class PlaceArchwaysRot90Procedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double sx = 0;
		double mini_rando_mcranderton = 0;
		double alignment = 0;
		sx = 0;
		alignment = 36;
		for (int index0 = 0; index0 < 4; index0++) {
			mini_rando_mcranderton = Mth.nextInt(RandomSource.create(), 0, 0);
			if ((world.getBlockState(BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx))).getFluidState().isSource()) {
				if (mini_rando_mcranderton == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
									BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
									BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
									BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
									BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 4) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x + alignment) - 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x + alignment) - 24), (int) ((z - 35) - sx)), (z - 35) - sx),
										BlockPos.containing((x + alignment) - 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x + alignment) - 24), (int) ((z - 35) - sx)), (z - 35) - sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 5) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x + alignment) - 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x + alignment) - 24), (int) ((z - 35) - sx)), (z - 35) - sx),
										BlockPos.containing((x + alignment) - 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x + alignment) - 24), (int) ((z - 35) - sx)), (z - 35) - sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 6) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x + alignment) - 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x + alignment) - 24), (int) ((z - 35) - sx)), (z - 35) - sx),
										BlockPos.containing((x + alignment) - 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x + alignment) - 24), (int) ((z - 35) - sx)), (z - 35) - sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 7) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x + alignment) - 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x + alignment) - 24), (int) ((z - 35) - sx)), (z - 35) - sx),
										BlockPos.containing((x + alignment) - 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x + alignment) - 24), (int) ((z - 35) - sx)), (z - 35) - sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 8) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x + alignment) - 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x + alignment) - 24), (int) ((z - 35) - sx)), (z - 35) - sx),
										BlockPos.containing((x + alignment) - 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x + alignment) - 24), (int) ((z - 35) - sx)), (z - 35) - sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 9) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) ((z - 41) - sx)), (z - 41) - sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x + alignment) - 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x + alignment) - 24), (int) ((z - 35) - sx)), (z - 35) - sx),
										BlockPos.containing((x + alignment) - 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x + alignment) - 24), (int) ((z - 35) - sx)), (z - 35) - sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				}
			}
			sx = sx + 14;
		}
		sx = 0;
		for (int index1 = 0; index1 < 4; index1++) {
			mini_rando_mcranderton = Mth.nextInt(RandomSource.create(), 0, 0);
			if ((world.getBlockState(BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)) + 8, z + 71 + sx))).getFluidState().isSource()) {
				if (mini_rando_mcranderton == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
									BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
									BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
									BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
									BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
									new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 4) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment + 24), (int) (z + 76 + sx)), z + 76 + sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment + 24), (int) (z + 76 + sx)), z + 76 + sx),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 5) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment + 24), (int) (z + 76 + sx)), z + 76 + sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment + 24), (int) (z + 76 + sx)), z + 76 + sx),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 6) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment + 24), (int) (z + 76 + sx)), z + 76 + sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment + 24), (int) (z + 76 + sx)), z + 76 + sx),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 7) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment + 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment + 24), (int) (z + 76 + sx)), z + 76 + sx),
										BlockPos.containing(x + alignment + 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment + 24), (int) (z + 76 + sx)), z + 76 + sx),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 8) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment + 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment + 24), (int) (z + 76 + sx)), z + 76 + sx),
										BlockPos.containing(x + alignment + 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment + 24), (int) (z + 76 + sx)), z + 76 + sx),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 9) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
										BlockPos.containing(x + alignment, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment), (int) (z + 71 + sx)), z + 71 + sx),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + alignment + 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment + 24), (int) (z + 76 + sx)), z + 76 + sx),
										BlockPos.containing(x + alignment + 24, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + alignment + 24), (int) (z + 76 + sx)), z + 76 + sx),
										new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				}
			}
			sx = sx + 14;
		}
	}
}
