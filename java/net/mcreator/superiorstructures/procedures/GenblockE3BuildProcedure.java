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

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GenblockE3BuildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_E_3_P_2.get()) {
			number = Mth.nextInt(RandomSource.create(), 0, 5);
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_dark_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.45 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 25, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 25, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_dark_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.45 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 25, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 25, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_dark_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.45 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 25, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 25, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_dark_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.45 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 25, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 25, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_dark_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.45 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 25, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 25, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_dark_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.45 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 25, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 25, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))) {
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_spruce_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_spruce_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_spruce_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_spruce_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_spruce_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_spruce_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_acacia_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_acacia_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_acacia_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_acacia_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_acacia_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_acacia_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				}
			} else {
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_oak_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_oak_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_oak_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_oak_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 5, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_oak_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				} else if (number == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_room_oak_6"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.5 || world.canSeeSkyFromBelowWater(BlockPos.containing(x - 4, y - 60, z - 4))
							|| world.canSeeSkyFromBelowWater(BlockPos.containing(x + 14, y - 60, z - 14))) {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get().defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x, y + 8, z), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_E_3_P_1.get()) {
			number = Mth.nextInt(RandomSource.create(), 0, 5);
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_dark_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if (number == 1 || number == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_dark_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if (number == 2 || number == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_dark_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_dark_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))) {
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_spruce_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if (number == 1 || number == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_spruce_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if (number == 2 || number == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_spruce_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_spruce_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_acacia_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if (number == 1 || number == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_acacia_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if (number == 2 || number == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_acacia_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_acacia_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			} else {
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_oak_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if (number == 1 || number == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_oak_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if (number == 2 || number == 5) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_oak_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				} else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_topper_oak_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x - 2, y, z - 2), BlockPos.containing(x - 2, y, z - 2),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
				}
			}
		}
	}
}