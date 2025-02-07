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

public class GenblockB2UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double shape = 0;
		double rotation = 0;
		double elevation = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double number = 0;
		boolean spread = false;
		boolean set = false;
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z)) && y <= 75) {
			shape = Mth.nextInt(RandomSource.create(), 0, 2);
			rotation = Mth.nextInt(RandomSource.create(), 0, 3);
			if (shape == 0) {
				if (rotation == 0) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + 8, y + 1, z)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z + 8))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 8, y + 1, z + 8))) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "swamp_hut"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 1) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x - 8, y + 1, z)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z + 8))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 8, y + 1, z + 8))) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "swamp_hut"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 2) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x - 8, y + 1, z)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z - 8))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 8, y + 1, z - 8))) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "swamp_hut"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 3) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + 8, y + 1, z)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z - 8))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 8, y + 1, z - 8))) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "swamp_hut"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			} else if (shape == 1) {
				if (rotation == 0) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + 13, y + 1, z))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 7, y + 1, z + 7))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z + 13))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 13, y + 1, z + 13))) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "swamp_hut_2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 1) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x - 13, y + 1, z))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 7, y + 1, z + 7))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z + 13))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 13, y + 1, z + 13))) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "swamp_hut_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 2) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x - 13, y + 1, z))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 7, y + 1, z - 7))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z - 13))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 13, y + 1, z - 13))) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "swamp_hut_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 3) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + 13, y + 1, z))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 7, y + 1, z - 7))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z - 13))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 13, y + 1, z - 13))) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "swamp_hut_2"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			} else if (shape == 2) {
				if (rotation == 0) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + 13, y + 1, z))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 7, y + 1, z + 7))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z + 13))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 13, y + 1, z + 13))) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "swamp_hut_3"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 1) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x - 13, y + 1, z))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 7, y + 1, z + 7))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z + 13))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 13, y + 1, z + 13))) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "swamp_hut_3"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 2) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x - 13, y + 1, z))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 7, y + 1, z - 7))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z - 13))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 13, y + 1, z - 13))) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "swamp_hut_3"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				} else if (rotation == 3) {
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + 13, y + 1, z))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 7, y + 1, z - 7))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z - 13))
							&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 13, y + 1, z - 13))) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager()
									.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "swamp_hut_3"));
							if (template != null) {
								template.placeInWorld(
										_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings()
												.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
										_serverworld.random, 3);
							}
						}
					}
				}
			}
		}
	}
}