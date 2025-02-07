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
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GenblockO7DomeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double chance = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			chance = Mth.nextInt(RandomSource.create(), 1, 4);
			world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.POLISHED_PRISMARINE.get().defaultBlockState(), 3);
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.BLUE_CONCRETE && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.BLUE_CONCRETE) {
				world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.PRISMARINE_BRICKS.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.PRISMARINE_BRICKS.defaultBlockState(), 3);
				if (chance == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (chance == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (chance == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (chance == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.BLUE_CONCRETE && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.BLUE_CONCRETE) {
				world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.PRISMARINE_BRICKS.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.PRISMARINE_BRICKS.defaultBlockState(), 3);
				if (chance == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (chance == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (chance == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (chance == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.BLUE_CONCRETE && (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.BLUE_CONCRETE) {
				world.setBlock(BlockPos.containing(x - 1, y, z), Blocks.PRISMARINE_BRICKS.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.PRISMARINE_BRICKS.defaultBlockState(), 3);
				if (chance == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (chance == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (chance == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (chance == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z), new StructurePlaceSettings().setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.BLUE_CONCRETE && (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.BLUE_CONCRETE) {
				world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.PRISMARINE_BRICKS.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x, y, z - 1), Blocks.PRISMARINE_BRICKS.defaultBlockState(), 3);
				if (chance == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (chance == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (chance == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (chance == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "monument_dome_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y + 1, z), BlockPos.containing(x, y + 1, z),
									new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
		}
	}
}
