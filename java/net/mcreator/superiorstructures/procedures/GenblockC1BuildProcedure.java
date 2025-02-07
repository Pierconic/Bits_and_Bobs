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

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class GenblockC1BuildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double size = 0;
		double rotation = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.SNOW.defaultBlockState(), 3);
			if (VillageScannerProcedure.execute(world, x, z) == false) {
				rotation = Mth.nextInt(RandomSource.create(), 0, 3);
				size = Mth.nextInt(RandomSource.create(), 0, 2);
				if (size == 0) {
					if (rotation == 0) {
						if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + 10, y + 2, z + 7)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z + 7)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x + 10, y + 2, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 7)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x + 10, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x + 10, y - 1, z + 7)).canOcclude()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_center_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (world.canSeeSkyFromBelowWater(BlockPos.containing(x - 7, y + 2, z + 10)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z + 10)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x - 7, y + 2, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 10)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x - 7, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 7, y - 1, z + 10)).canOcclude()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_center_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (world.canSeeSkyFromBelowWater(BlockPos.containing(x - 10, y + 2, z - 7)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z - 7)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x - 10, y + 2, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z - 7)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x - 10, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 10, y - 1, z - 7)).canOcclude()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_center_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + 7, y + 2, z - 10)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z - 10)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x + 7, y + 1, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z - 10)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x + 7, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x + 7, y - 1, z - 10)).canOcclude()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_center_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					}
				} else if (size == 1) {
					if (rotation == 0) {
						if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + 15, y + 2, z + 7)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z + 7)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x + 15, y + 2, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 7)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x + 15, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x + 15, y - 1, z + 7)).canOcclude()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_center_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (world.canSeeSkyFromBelowWater(BlockPos.containing(x - 7, y + 2, z + 15)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z + 15)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x - 7, y + 2, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 15)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x - 7, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 7, y - 1, z + 15)).canOcclude()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_center_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (world.canSeeSkyFromBelowWater(BlockPos.containing(x - 15, y + 2, z - 7)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z - 7)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x - 15, y + 2, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z - 7)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x - 15, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 15, y - 1, z - 7)).canOcclude()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_center_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + 7, y + 2, z - 15)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z - 15)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x + 7, y + 1, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z - 15)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x + 7, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x + 7, y - 1, z - 15)).canOcclude()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_center_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					}
				} else if (size == 2) {
					if (rotation == 0) {
						if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + 15, y + 2, z + 12)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z + 12)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x + 15, y + 2, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 12)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x + 15, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x + 15, y - 1, z + 12)).canOcclude()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_center_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (world.canSeeSkyFromBelowWater(BlockPos.containing(x - 12, y + 2, z + 15)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z + 15)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x - 12, y + 2, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 15)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x - 12, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 12, y - 1, z + 15)).canOcclude()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_center_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (world.canSeeSkyFromBelowWater(BlockPos.containing(x - 15, y + 2, z - 12)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z - 12)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x - 15, y + 2, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z - 12)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x - 15, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x - 15, y - 1, z - 12)).canOcclude()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_center_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + 12, y + 2, z - 15)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z - 15)) && world.canSeeSkyFromBelowWater(BlockPos.containing(x + 12, y + 1, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 2, z)) && world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z - 15)).canOcclude()
								&& world.getBlockState(BlockPos.containing(x + 12, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x + 12, y - 1, z - 15)).canOcclude()) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "igloo_center_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					}
				}
			}
		}
	}
}
