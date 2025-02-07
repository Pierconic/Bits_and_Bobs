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

public class GenblockE6BuildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean set = false;
		double number = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		number = Mth.nextInt(RandomSource.create(), 1, 15);
		if (number == 1) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_1"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (number == 2) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_2"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (number == 3) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (number == 4) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (number == 5) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_5"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (number == 6) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_6"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (number == 7) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_7"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (number == 8) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_8"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (number == 9) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_9"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (number == 10) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_10"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (number == 11) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_11"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_11"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_11"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_11"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (number == 12) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_12"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_12"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_12"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_12"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (number == 13) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_13"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_13"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_13"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_13"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (number == 14) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_14"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_14"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_14"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_14"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		} else if (number == 15) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_dark_15"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_acacia_15"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_spruce_15"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_thing_oak_15"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x, y - 1, z), BlockPos.containing(x, y - 1, z),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		}
	}
}