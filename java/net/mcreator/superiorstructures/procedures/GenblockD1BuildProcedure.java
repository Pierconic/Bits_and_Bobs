package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GenblockD1BuildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
	if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
		double rotation = 0;
		double portal = 0;
		world.setBlock(BlockPos.containing(x, y, z), (world.getBlockState(BlockPos.containing(x, y + 1, z))), 3);
		if (true == true) { //little booger
			rotation = Mth.nextInt(RandomSource.create(), 0, 3);
			portal = Mth.nextInt(RandomSource.create(), 0, 8);
			if (rotation == 0) {
				if (world.getBlockState(BlockPos.containing(x, y - 3, z)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x + 7, y - 3, z + 11)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x + 7, y - 3, z)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x, y - 3, z + 11)).canOcclude()
						&& ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.OVERWORLD)
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 5, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 7, y + 5, z + 11))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 5, z + 11))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 7, y + 5, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 4, y + 5, z + 5))
								|| (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.NETHER)
										&& world.isEmptyBlock(BlockPos.containing(x, y + 12, z)) && world.isEmptyBlock(BlockPos.containing(x + 7, y + 12, z + 11))
										&& world.isEmptyBlock(BlockPos.containing(x, y + 12, z + 11)) && world.isEmptyBlock(BlockPos.containing(x + 7, y + 12, z)))) {
					if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				}
			} else if (rotation == 1) {
				if (world.getBlockState(BlockPos.containing(x, y - 3, z)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x - 11, y - 3, z + 7)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x - 11, y - 3, z)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x, y - 3, z + 7)).canOcclude()
						&& ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.OVERWORLD)
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 3, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 11, y + 3, z + 7))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 3, z + 7))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 11, y + 3, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 5, y + 3, z + 4))
								|| (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.NETHER)
										&& world.isEmptyBlock(BlockPos.containing(x, y + 8, z)) && world.isEmptyBlock(BlockPos.containing(x - 11, y + 8, z + 7))
										&& world.isEmptyBlock(BlockPos.containing(x, y + 8, z + 7)) && world.isEmptyBlock(BlockPos.containing(x - 11, y + 8, z)))) {
					if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				}
			} else if (rotation == 2) {
				if (world.getBlockState(BlockPos.containing(x, y - 3, z)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x - 7, y - 3, z - 11)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x - 7, y - 3, z)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x, y - 3, z - 11)).canOcclude()
						&& ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.OVERWORLD)
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 3, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 7, y + 3, z - 11))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 3, z - 11))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 7, y + 3, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y + 3, z - 5))
								|| (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.NETHER)
										&& world.isEmptyBlock(BlockPos.containing(x, y + 8, z)) && world.isEmptyBlock(BlockPos.containing(x - 7, y + 8, z - 11))
										&& world.isEmptyBlock(BlockPos.containing(x, y + 8, z - 11)) && world.isEmptyBlock(BlockPos.containing(x - 7, y + 8, z)))) {
					if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				}
			} else if (rotation == 3) {
				if (world.getBlockState(BlockPos.containing(x, y - 3, z)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x + 11, y - 3, z - 7)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x + 11, y - 3, z)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x, y - 3, z - 7)).canOcclude()
						&& ((world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.OVERWORLD)
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 3, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 11, y + 3, z - 7))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 3, z - 7))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 11, y + 3, z))
								&& world.canSeeSkyFromBelowWater(BlockPos.containing(x + 5, y + 3, z - 4))
								|| (world instanceof Level _lvl ? _lvl.dimension() : Level.OVERWORLD) == (Level.NETHER)
										&& world.isEmptyBlock(BlockPos.containing(x, y + 8, z)) && world.isEmptyBlock(BlockPos.containing(x + 11, y + 8, z - 7))
										&& world.isEmptyBlock(BlockPos.containing(x, y + 8, z - 7)) && world.isEmptyBlock(BlockPos.containing(x + 11, y + 8, z)))) {
					if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
							|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
						if (portal == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (portal == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				}
			}
		}
	}
	}
}