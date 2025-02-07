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

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class GenblockK4RoadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double width = 0;
		double length = 0;
		double block = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.SMOOTH_SANDSTONE_SLAB) {
				length = 0;
				for (int index0 = 0; index0 < 70; index0++) {
					width = 0;
					for (int index1 = 0; index1 < 5; index1++) {
						block = Mth.nextInt(RandomSource.create(), 0, 11);
						if (((world.getBlockState(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)) - 1, z + width))).getBlock() == Blocks.GRASS_BLOCK
								|| (world.getBlockState(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)) - 1, z + width))).getBlock() == Blocks.SAND
								|| (world.getBlockState(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)) - 1, z + width))).getBlock() == Blocks.SANDSTONE
								|| (world.getBlockState(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)) - 1, z + width))).getBlock() == Blocks.RED_SAND)
								&& (length <= 35 || length <= 55 && Math.random() < 0.7 || length > 55 && Math.random() < 0.35)) {
							if (width == 1 || width == 2 || width == 3 || (width == 0 || width == 4) && Math.random() < 0.6) {
								if (block == 0) {
									world.setBlock(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)) - 1, z + width), Blocks.BRICKS.defaultBlockState(), 3);
								} else if (block == 1) {
									world.setBlock(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)) - 1, z + width), Blocks.TERRACOTTA.defaultBlockState(), 3);
								} else if (block == 2) {
									world.setBlock(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)) - 1, z + width), Blocks.SANDSTONE.defaultBlockState(), 3);
								} else if (block == 3) {
									world.setBlock(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)) - 1, z + width), Blocks.SANDSTONE.defaultBlockState(), 3);
								} else if (block == 4) {
									world.setBlock(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)) - 1, z + width), Blocks.SMOOTH_SANDSTONE.defaultBlockState(), 3);
								} else if (block == 5 || block == 6 || block == 7) {
									world.setBlock(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)) - 1, z + width), Blocks.ORANGE_TERRACOTTA.defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)) - 1, z + width), Blocks.YELLOW_TERRACOTTA.defaultBlockState(), 3);
								}
								if (world.getBlockState(BlockPos.containing(x + length + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)), z + width)).canOcclude()
										&& !(world.getBlockState(BlockPos.containing(x + length + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)), z + width)))
												.is(BlockTags.create(ResourceLocation.parse("minecraft:slabs")))
										|| world.getBlockState(BlockPos.containing((x + length) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)), z + width)).canOcclude()
												&& !(world.getBlockState(BlockPos.containing((x + length) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)), z + width)))
														.is(BlockTags.create(ResourceLocation.parse("minecraft:slabs")))) {
									block = Mth.nextInt(RandomSource.create(), 0, 6);
									if (block == 0) {
										world.setBlock(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)), z + width), Blocks.SANDSTONE_SLAB.defaultBlockState(), 3);
									} else if (block == 1) {
										world.setBlock(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)), z + width), Blocks.SANDSTONE_SLAB.defaultBlockState(),
												3);
									} else if (block == 2) {
										world.setBlock(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)), z + width), Blocks.SMOOTH_SANDSTONE_SLAB.defaultBlockState(), 3);
									} else if (block == 3) {
										world.setBlock(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)), z + width), Blocks.SMOOTH_SANDSTONE_SLAB.defaultBlockState(),
												3);
									} else {
										world.setBlock(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z + width)), z + width), Blocks.SMOOTH_SANDSTONE_SLAB.defaultBlockState(), 3);
									}
								}
							}
						}
						width = width + 1;
					}
					if ((length == 16 || length == 30 || length == 44 || length == 58)
							&& ((world.getBlockState(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 1, z - 2))).getBlock() == Blocks.GRASS_BLOCK
									|| (world.getBlockState(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 1, z - 2))).getBlock() == Blocks.SAND
									|| (world.getBlockState(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 1, z - 2))).getBlock() == Blocks.SANDSTONE
									|| (world.getBlockState(BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 1, z - 2))).getBlock() == Blocks.RED_SAND)) {
						block = Mth.nextInt(RandomSource.create(), 0, 9);
						if (block == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 9) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_10"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											BlockPos.containing(x + length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + length), (int) (z - 2)) - 3, z - 2),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					}
					length = length + 1;
				}
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.SMOOTH_SANDSTONE_SLAB) {
				length = 0;
				for (int index2 = 0; index2 < 70; index2++) {
					width = 0;
					for (int index3 = 0; index3 < 5; index3++) {
						block = Mth.nextInt(RandomSource.create(), 0, 11);
						if (((world.getBlockState(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)) - 1, z + width))).getBlock() == Blocks.GRASS_BLOCK
								|| (world.getBlockState(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)) - 1, z + width))).getBlock() == Blocks.SAND
								|| (world.getBlockState(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)) - 1, z + width))).getBlock() == Blocks.SANDSTONE
								|| (world.getBlockState(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)) - 1, z + width))).getBlock() == Blocks.RED_SAND)
								&& (length <= 35 || length <= 55 && Math.random() < 0.7 || length > 55 && Math.random() < 0.35)) {
							if (width == -1 || width == -2 || width == -3 || (width == 0 || width == -4) && Math.random() < 0.6) {
								if (block == 0) {
									world.setBlock(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)) - 1, z + width), Blocks.BRICKS.defaultBlockState(), 3);
								} else if (block == 1) {
									world.setBlock(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)) - 1, z + width), Blocks.TERRACOTTA.defaultBlockState(), 3);
								} else if (block == 2) {
									world.setBlock(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)) - 1, z + width), Blocks.SANDSTONE.defaultBlockState(), 3);
								} else if (block == 3) {
									world.setBlock(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)) - 1, z + width), Blocks.SANDSTONE.defaultBlockState(), 3);
								} else if (block == 4) {
									world.setBlock(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)) - 1, z + width), Blocks.SMOOTH_SANDSTONE.defaultBlockState(), 3);
								} else if (block == 5 || block == 6 || block == 7) {
									world.setBlock(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)) - 1, z + width), Blocks.ORANGE_TERRACOTTA.defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)) - 1, z + width), Blocks.YELLOW_TERRACOTTA.defaultBlockState(), 3);
								}
								if (world.getBlockState(BlockPos.containing(x - length + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)), z + width)).canOcclude()
										&& !(world.getBlockState(BlockPos.containing(x - length + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)), z + width)))
												.is(BlockTags.create(ResourceLocation.parse("minecraft:slabs")))
										|| world.getBlockState(BlockPos.containing((x - length) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)), z + width)).canOcclude()
												&& !(world.getBlockState(BlockPos.containing((x - length) - 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)), z + width)))
														.is(BlockTags.create(ResourceLocation.parse("minecraft:slabs")))) {
									block = Mth.nextInt(RandomSource.create(), 0, 6);
									if (block == 0) {
										world.setBlock(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)), z + width), Blocks.SMOOTH_SANDSTONE_SLAB.defaultBlockState(), 3);
									} else if (block == 1) {
										world.setBlock(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)), z + width), Blocks.SMOOTH_SANDSTONE_SLAB.defaultBlockState(),
												3);
									} else if (block == 2) {
										world.setBlock(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)), z + width), Blocks.SMOOTH_SANDSTONE_SLAB.defaultBlockState(), 3);
									} else if (block == 3) {
										world.setBlock(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)), z + width), Blocks.SANDSTONE_SLAB.defaultBlockState(),
												3);
									} else {
										world.setBlock(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z + width)), z + width), Blocks.SANDSTONE_SLAB.defaultBlockState(), 3);
									}
								}
							}
						}
						width = width - 1;
					}
					if ((length == 16 || length == 30 || length == 44 || length == 58)
							&& ((world.getBlockState(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 5)) - 1, z - 5))).getBlock() == Blocks.GRASS_BLOCK
									|| (world.getBlockState(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 5)) - 1, z - 5))).getBlock() == Blocks.SAND
									|| (world.getBlockState(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 5)) - 1, z - 5))).getBlock() == Blocks.SANDSTONE
									|| (world.getBlockState(BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 5)) - 1, z - 5))).getBlock() == Blocks.RED_SAND)) {
						block = Mth.nextInt(RandomSource.create(), 0, 9);
						if (block == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 9) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_10"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											BlockPos.containing(x - length, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - length), (int) (z - 6)) - 3, z - 6),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					}
					length = length + 1;
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.SMOOTH_SANDSTONE_SLAB) {
				length = 0;
				for (int index4 = 0; index4 < 70; index4++) {
					width = 0;
					for (int index5 = 0; index5 < 5; index5++) {
						block = Mth.nextInt(RandomSource.create(), 0, 11);
						if (((world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)) - 1, z + length))).getBlock() == Blocks.GRASS_BLOCK
								|| (world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)) - 1, z + length))).getBlock() == Blocks.SAND
								|| (world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)) - 1, z + length))).getBlock() == Blocks.SANDSTONE
								|| (world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)) - 1, z + length))).getBlock() == Blocks.RED_SAND)
								&& (length <= 35 || length <= 55 && Math.random() < 0.7 || length > 55 && Math.random() < 0.35)) {
							if (width == -1 || width == -2 || width == -3 || (width == 0 || width == -4) && Math.random() < 0.6) {
								if (block == 0) {
									world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)) - 1, z + length), Blocks.BRICKS.defaultBlockState(), 3);
								} else if (block == 1) {
									world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)) - 1, z + length), Blocks.TERRACOTTA.defaultBlockState(), 3);
								} else if (block == 2) {
									world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)) - 1, z + length), Blocks.SANDSTONE.defaultBlockState(), 3);
								} else if (block == 3) {
									world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)) - 1, z + length), Blocks.SANDSTONE.defaultBlockState(), 3);
								} else if (block == 4) {
									world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)) - 1, z + length), Blocks.SMOOTH_SANDSTONE.defaultBlockState(), 3);
								} else if (block == 5 || block == 6 || block == 7) {
									world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)) - 1, z + length), Blocks.ORANGE_TERRACOTTA.defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)) - 1, z + length), Blocks.YELLOW_TERRACOTTA.defaultBlockState(), 3);
								}
								if (world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)), z + length + 1)).canOcclude()
										&& !(world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)), z + length + 1)))
												.is(BlockTags.create(ResourceLocation.parse("minecraft:slabs")))
										|| world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)), (z + length) - 1)).canOcclude()
												&& !(world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)), (z + length) - 1)))
														.is(BlockTags.create(ResourceLocation.parse("minecraft:slabs")))) {
									block = Mth.nextInt(RandomSource.create(), 0, 6);
									if (block == 0) {
										world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)), z + length), Blocks.SMOOTH_SANDSTONE_SLAB.defaultBlockState(), 3);
									} else if (block == 1) {
										world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)), z + length), Blocks.SMOOTH_SANDSTONE_SLAB.defaultBlockState(),
												3);
									} else if (block == 2) {
										world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)), z + length), Blocks.SMOOTH_SANDSTONE_SLAB.defaultBlockState(), 3);
									} else if (block == 3) {
										world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)), z + length), Blocks.SANDSTONE_SLAB.defaultBlockState(),
												3);
									} else {
										world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z + length)), z + length), Blocks.SANDSTONE_SLAB.defaultBlockState(), 3);
									}
								}
							}
						}
						width = width - 1;
					}
					if ((length == 16 || length == 30 || length == 44 || length == 58)
							&& ((world.getBlockState(BlockPos.containing(x - 5, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 5), (int) (z + length)) - 1, z + length))).getBlock() == Blocks.GRASS_BLOCK
									|| (world.getBlockState(BlockPos.containing(x - 5, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 5), (int) (z + length)) - 1, z + length))).getBlock() == Blocks.SAND
									|| (world.getBlockState(BlockPos.containing(x - 5, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 5), (int) (z + length)) - 1, z + length))).getBlock() == Blocks.SANDSTONE
									|| (world.getBlockState(BlockPos.containing(x - 5, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 5), (int) (z + length)) - 1, z + length))).getBlock() == Blocks.RED_SAND)) {
						block = Mth.nextInt(RandomSource.create(), 0, 9);
						if (block == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 5, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											BlockPos.containing(x - 5, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 5), (int) (z + length)) - 3, z + length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 9) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_10"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											BlockPos.containing(x - 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 6), (int) (z + length)) - 3, z + length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					}
					length = length + 1;
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.SMOOTH_SANDSTONE_SLAB) {
				length = 0;
				for (int index6 = 0; index6 < 70; index6++) {
					width = 0;
					for (int index7 = 0; index7 < 5; index7++) {
						block = Mth.nextInt(RandomSource.create(), 0, 11);
						if (((world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)) - 1, z - length))).getBlock() == Blocks.GRASS_BLOCK
								|| (world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)) - 1, z - length))).getBlock() == Blocks.SAND
								|| (world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)) - 1, z - length))).getBlock() == Blocks.SANDSTONE
								|| (world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)) - 1, z - length))).getBlock() == Blocks.RED_SAND)
								&& (length <= 35 || length <= 55 && Math.random() < 0.7 || length > 55 && Math.random() < 0.35)) {
							if (width == 1 || width == 2 || width == 3 || (width == 0 || width == 4) && Math.random() < 0.6) {
								if (block == 0) {
									world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)) - 1, z - length), Blocks.BRICKS.defaultBlockState(), 3);
								} else if (block == 1) {
									world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)) - 1, z - length), Blocks.TERRACOTTA.defaultBlockState(), 3);
								} else if (block == 2) {
									world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)) - 1, z - length), Blocks.SANDSTONE.defaultBlockState(), 3);
								} else if (block == 3) {
									world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)) - 1, z - length), Blocks.SANDSTONE.defaultBlockState(), 3);
								} else if (block == 4) {
									world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)) - 1, z - length), Blocks.SMOOTH_SANDSTONE.defaultBlockState(), 3);
								} else if (block == 5 || block == 6 || block == 7) {
									world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)) - 1, z - length), Blocks.ORANGE_TERRACOTTA.defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)) - 1, z - length), Blocks.YELLOW_TERRACOTTA.defaultBlockState(), 3);
								}
								if (world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)), z - length + 1)).canOcclude()
										&& !(world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)), z - length + 1)))
												.is(BlockTags.create(ResourceLocation.parse("minecraft:slabs")))
										|| world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)), (z - length) - 1)).canOcclude()
												&& !(world.getBlockState(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)), (z - length) - 1)))
														.is(BlockTags.create(ResourceLocation.parse("minecraft:slabs")))) {
									block = Mth.nextInt(RandomSource.create(), 0, 6);
									if (block == 0) {
										world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)), z - length), Blocks.SMOOTH_SANDSTONE_SLAB.defaultBlockState(), 3);
									} else if (block == 1) {
										world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)), z - length), Blocks.SMOOTH_SANDSTONE_SLAB.defaultBlockState(),
												3);
									} else if (block == 2) {
										world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)), z - length), Blocks.SMOOTH_SANDSTONE_SLAB.defaultBlockState(), 3);
									} else if (block == 3) {
										world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)), z - length), Blocks.SANDSTONE_SLAB.defaultBlockState(),
												3);
									} else {
										world.setBlock(BlockPos.containing(x + width, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + width), (int) (z - length)), z - length), Blocks.SANDSTONE_SLAB.defaultBlockState(), 3);
									}
								}
							}
						}
						width = width + 1;
					}
					if ((length == 16 || length == 30 || length == 44 || length == 58)
							&& ((world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 1, z - length))).getBlock() == Blocks.GRASS_BLOCK
									|| (world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 1, z - length))).getBlock() == Blocks.SAND
									|| (world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 1, z - length))).getBlock() == Blocks.SANDSTONE
									|| (world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 1, z - length))).getBlock() == Blocks.RED_SAND)) {
						block = Mth.nextInt(RandomSource.create(), 0, 9);
						if (block == 0) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 1) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 2) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 3) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 4) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 5) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 6) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 7) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 8) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_9"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						} else if (block == 9) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "pyramid_arch_10"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 2), (int) (z - length)) - 3, z - length),
											new StructurePlaceSettings().setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
								}
							}
						}
					}
					length = length + 1;
				}
			}
		}
	}
}