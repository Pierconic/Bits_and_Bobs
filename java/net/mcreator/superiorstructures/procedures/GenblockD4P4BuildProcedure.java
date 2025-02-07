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
import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class GenblockD4P4BuildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
	if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
		double number = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double rotation = 0;
		boolean set = false;
		boolean found = false;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_D_4_P_3.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_D_4_P_2.get()) {
			for (int index0 = 0; index0 < (int) (Mth.nextInt(RandomSource.create(), 2, 6)); index0++) {
				if (Math.random() <= 0.5) {
					sx = Mth.nextInt(RandomSource.create(), 8, 12);
				} else {
					sx = Mth.nextInt(RandomSource.create(), -12, -6);
				}
				if (Math.random() <= 0.5) {
					sz = Mth.nextInt(RandomSource.create(), 8, 12);
				} else {
					sz = Mth.nextInt(RandomSource.create(), -12, -6);
				}
				sy = 3;
				set = false;
				while (set == false) {
					if (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).canOcclude()
							&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR
									|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRASS_BLOCK)) {
						if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_D_4_P_3.get()) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz),
									SuperiorstructuresModBlocks.GENBLOCK_D_4_P_2.get().defaultBlockState(), 3);
						} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.GENBLOCK_D_4_P_2.get()) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz),
									SuperiorstructuresModBlocks.GENBLOCK_D_4_P_1.get().defaultBlockState(), 3);
						}
						set = true;
					} else if (!((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR)) {
						set = true;
					} else {
						sy = sy - 1;
					}
				}
			}
		}
		if (world.isEmptyBlock(BlockPos.containing(x, y + 2, z)) && world.getBlockState(BlockPos.containing(x - 1, y - 1, z)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x + 1, y - 1, z)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 1, z + 1)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x, y - 1, z - 1)).canOcclude() && Math.random() < 0.8) {
			number = Mth.nextInt(RandomSource.create(), 1, 8);
			rotation = Mth.nextInt(RandomSource.create(), 0, 3);
			sx = -4;
			found = false;
			for (int index2 = 0; index2 < (int) (8); index2++) {
				sy = -4;
				for (int index3 = 0; index3 < (int) (8); index3++) {
					sz = -4;
					for (int index4 = 0; index4 < (int) (8); index4++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.IRON_BARS
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.ACACIA_FENCE
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.OAK_FENCE
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.NETHER_BRICK_FENCE
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SPRUCE_FENCE) {
							found = true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (found == false) {
				if (number == 1) {
					if (rotation == 0) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_1"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_1"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (number == 2) {
					if (rotation == 0) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_2"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_2"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (number == 3) {
					if (rotation == 0) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_3"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_14"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_14"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_14"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_14"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_14"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_14"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_14"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_3"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_14"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_14"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_14"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_14"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_14"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_14"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_14"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (number == 4) {
					if (rotation == 0) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_4"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_13"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_13"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_13"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_13"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_13"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_13"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_13"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_4"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_13"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_13"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_13"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_13"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_13"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_13"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_13"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (number == 5) {
					if (rotation == 0) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_5"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_12"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_12"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_12"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_12"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_12"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_12"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_12"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_5"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_12"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_12"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_12"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_12"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_12"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_12"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_12"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (number == 6) {
					if (rotation == 0) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_6"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_11"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_11"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_11"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_11"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_11"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_11"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_11"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_6"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_11"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_11"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_11"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_11"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_11"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_11"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_11"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (number == 7) {
					if (rotation == 0) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_7"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_10"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_10"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_10"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_10"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_10"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_10"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_10"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_7"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_10"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_10"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_10"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_10"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_10"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_10"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_10"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				} else if (number == 8) {
					if (rotation == 0) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_8"));
								if (template != null) {
									template.placeInWorld(_serverworld, BlockPos.containing(x - 1, y - 2, z - 1), BlockPos.containing(x - 1, y - 2, z - 1),
											new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 1) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z - 1), BlockPos.containing(x +1, y - 2, z - 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 2) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_8"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x +1, y - 2, z + 1), BlockPos.containing(x +1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.CLOCKWISE_180).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					} else if (rotation == 3) {
						if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_acacia_side_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_desert_side_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_ice_side_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_nether_side_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_soul_side_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))
								|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_spruce_side_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						} else {
							if (world instanceof ServerLevel _serverworld) {
								StructureTemplate template = _serverworld.getStructureManager()
										.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "portal_plain_side_9"));
								if (template != null) {
									template.placeInWorld(
											_serverworld, BlockPos.containing(x - 1, y - 2, z + 1), BlockPos.containing(x - 1, y - 2, z + 1), new StructurePlaceSettings()
													.setRotation(Rotation.COUNTERCLOCKWISE_90).setMirror(Mirror.NONE).setIgnoreEntities(false),
											_serverworld.random, 3);
								}
							}
						}
					}
				}
				if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.CUT_RED_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.CUT_RED_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.CUT_RED_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.CUT_RED_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.CUT_RED_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z - 1), Blocks.CUT_RED_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z + 1), Blocks.CUT_RED_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z + 1), Blocks.CUT_RED_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z - 1), Blocks.CUT_RED_SANDSTONE.defaultBlockState(), 3);
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.CUT_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.CUT_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.CUT_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.CUT_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.CUT_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z - 1), Blocks.CUT_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z + 1), Blocks.CUT_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z + 1), Blocks.CUT_SANDSTONE.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z - 1), Blocks.CUT_SANDSTONE.defaultBlockState(), 3);
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))) {
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z - 1), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z + 1), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z + 1), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z - 1), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("nether_wastes"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("soul_sand_valley"))) {
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z - 1), Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z + 1), Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z + 1), Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z - 1), Blocks.POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 1, z + 1), Blocks.STONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 1, z - 1), Blocks.STONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z - 1), Blocks.STONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z + 1), Blocks.STONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x - 1, y - 1, z + 1), Blocks.STONE_BRICKS.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x + 1, y - 1, z - 1), Blocks.STONE_BRICKS.defaultBlockState(), 3);
				}
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		} else {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
	}
}