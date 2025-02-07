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

public class PlaceArchwaysProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double sx = 0;
		double mini_rando_mcranderton = 0;
		sx = 0;
		for (int index0 = 0; index0 < 4; index0++) {
			mini_rando_mcranderton = Mth.nextInt(RandomSource.create(), 0, 0);
			if ((world.getBlockState(BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)) + 8, z + 13))).getFluidState().isSource()) {
				if (mini_rando_mcranderton == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
									BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
									BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
									BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
									BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 4) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
										BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x - 35) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 35) - sx), (int) (z - 10)), z - 10),
										BlockPos.containing((x - 35) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 35) - sx), (int) (z - 10)), z - 10),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 5) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
										BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x - 35) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 35) - sx), (int) (z - 10)), z - 10),
										BlockPos.containing((x - 35) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 35) - sx), (int) (z - 10)), z - 10),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 6) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
										BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x - 35) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 35) - sx), (int) (z - 10)), z - 10),
										BlockPos.containing((x - 35) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 35) - sx), (int) (z - 10)), z - 10),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 7) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
										BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x - 35) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 35) - sx), (int) (z - 10)), z - 10),
										BlockPos.containing((x - 35) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 35) - sx), (int) (z - 10)), z - 10),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 8) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
										BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x - 35) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 35) - sx), (int) (z - 10)), z - 10),
										BlockPos.containing((x - 35) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 35) - sx), (int) (z - 10)), z - 10),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 9) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
										BlockPos.containing((x - 41) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 41) - sx), (int) (z + 13)), z + 13),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing((x - 35) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 35) - sx), (int) (z - 10)), z - 10),
										BlockPos.containing((x - 35) - sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ((x - 35) - sx), (int) (z - 10)), z - 10),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
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
			if ((world.getBlockState(BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 71 + sx), (int) (z + 13)), z + 13))).getFluidState().isSource()) {
				if (mini_rando_mcranderton == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
									BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
									BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
									BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
									BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (mini_rando_mcranderton == 4) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
										BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_5"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 86 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 86 + sx), (int) (z + 35)), z + 35),
										BlockPos.containing(x + 86 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 86 + sx), (int) (z + 35)), z + 35),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 5) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
										BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_6"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 86 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 86 + sx), (int) (z + 35)), z + 35),
										BlockPos.containing(x + 86 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 86 + sx), (int) (z + 35)), z + 35),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 6) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
										BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_7"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 86 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 86 + sx), (int) (z + 35)), z + 35),
										BlockPos.containing(x + 86 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 86 + sx), (int) (z + 35)), z + 35),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 7) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
										BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_8"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 86 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 86 + sx), (int) (z + 35)), z + 35),
										BlockPos.containing(x + 86 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 86 + sx), (int) (z + 35)), z + 35),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 8) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
										BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_9"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 86 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 86 + sx), (int) (z + 35)), z + 35),
										BlockPos.containing(x + 86 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 86 + sx), (int) (z + 35)), z + 35),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else if (mini_rando_mcranderton == 9) {
					if (Math.random() < 0.5) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
										BlockPos.containing(x + 81 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 81 + sx), (int) (z + 13)), z + 13),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_archway_10"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 86 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 86 + sx), (int) (z + 35)), z + 35),
										BlockPos.containing(x + 86 + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + 86 + sx), (int) (z + 35)), z + 35),
										new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				}
			}
			sx = sx + 14;
		}
	}
}
