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
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class GenblockF1CheckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean ruined = false;
		double size = 0;
		double rotation = 0;
		double numero = 0;
		double sx = 0;
		double level = 0;
		double sy = 0;
		double sz = 0;
		double tolerance = 0;
		double housing = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (VillageScannerProcedure.execute(world, x, z) == false) {
				housing = 0;
				if (world.getBlockState(BlockPos.containing(x + 15, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z + 15)) - 3, z + 28)).canOcclude()
						&& !world.getBlockState(BlockPos.containing(x + 15, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z + 15)) + 2, z + 28)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x + 28, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z + 15)) - 3, z + 28)).canOcclude()
						&& !world.getBlockState(BlockPos.containing(x + 28, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z + 15)) + 2, z + 28)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x + 28, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z + 15)) - 3, z + 15)).canOcclude()
						&& !world.getBlockState(BlockPos.containing(x + 28, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z + 15)) + 2, z + 15)).canOcclude()) {
					housing = housing + 1;
				}
				if (world.getBlockState(BlockPos.containing(x + 28, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z - 15)) - 3, z - 15)).canOcclude()
						&& !world.getBlockState(BlockPos.containing(x + 28, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z - 15)) + 2, z - 15)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x + 28, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z - 15)) - 3, z - 2)).canOcclude()
						&& !world.getBlockState(BlockPos.containing(x + 28, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z - 15)) + 2, z - 2)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x + 15, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z - 15)) - 3, z - 2)).canOcclude()
						&& !world.getBlockState(BlockPos.containing(x + 15, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z - 15)) + 2, z - 2)).canOcclude()) {
					housing = housing + 1;
				}
				if (world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z - 15)) - 3, z - 15)).canOcclude()
						&& !world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z - 15)) + 2, z - 15)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z - 15)) - 3, z - 2)).canOcclude()
						&& !world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z - 15)) + 2, z - 2)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x - 15, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z - 15)) - 3, z - 2)).canOcclude()
						&& !world.getBlockState(BlockPos.containing(x - 15, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z - 15)) + 2, z - 2)).canOcclude()) {
					housing = housing + 1;
				}
				if (world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z + 15)) - 3, z + 15)).canOcclude()
						&& !world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z + 15)) + 2, z + 15)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z + 15)) - 3, z + 28)).canOcclude()
						&& !world.getBlockState(BlockPos.containing(x - 2, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z + 15)) + 2, z + 28)).canOcclude()
						&& world.getBlockState(BlockPos.containing(x - 15, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z + 15)) - 3, z + 28)).canOcclude()
						&& !world.getBlockState(BlockPos.containing(x - 15, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z + 15)) + 2, z + 28)).canOcclude()) {
					housing = housing + 1;
				}
				tolerance = 0;
				sx = -20;
				for (int index0 = 0; index0 < 40; index0++) {
					sy = 6;
					for (int index1 = 0; index1 < 1; index1++) {
						sz = -20;
						for (int index2 = 0; index2 < 40; index2++) {
							if (!((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR) && !((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.OAK_LEAVES)
									&& !((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.OAK_LOG)) {
								tolerance = tolerance + 1;
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
				sx = -20;
				for (int index3 = 0; index3 < 40; index3++) {
					sy = -6;
					for (int index4 = 0; index4 < 2; index4++) {
						sz = -20;
						for (int index5 = 0; index5 < 40; index5++) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR && world.canSeeSkyFromBelowWater(BlockPos.containing(x + sx, y + sy, z + sz))
									|| (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.WATER
									|| (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + sx), (int) (z + sz)) - 1, z + sz))).getBlock() == Blocks.LAVA) {
								tolerance = tolerance + 1;
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
				if ((world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("meadow")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sunflower_plains"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains")))
						&& (world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("meadow")) || world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("plains"))
								|| world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("forest")) || world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("sunflower_plains")))
						&& (world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("meadow")) || world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("plains"))
								|| world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("forest")) || world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("sunflower_plains")))
						&& (world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("plains")) || world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("meadow"))
								|| world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("forest")) || world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("sunflower_plains")))
						&& (world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("plains")) || world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("meadow"))
								|| world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("forest")) || world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("sunflower_plains")))) {
					if (tolerance <= 160 && housing >= 3) {
						numero = Mth.nextInt(RandomSource.create(), 0, 5);
						if (world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) (z + 13)) + 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 13)) + 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) z) + 2, z)).canOcclude()) {
							level = 2;
						} else if (!(world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) (z + 13)) - 3, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 13)) - 3, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) z) - 3, z)).canOcclude())) {
							level = 5;
						} else if (!(world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) (z + 13)) - 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 13)) - 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) z) - 2, z)).canOcclude())) {
							level = 4;
						} else {
							level = 3;
						}
						if (Math.random() < 0.85) {
							ruined = false;
							if (numero == 0) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_townsquare1_r1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_townsquare1_r2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 2) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_townsquare2_r1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_townsquare2_r2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 4) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_townsquare3_r1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 5) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_townsquare3_r2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
						} else {
							ruined = true;
							if (numero == 0) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_townsquare1_r3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_townsquare1_r4"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 2) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_townsquare2_r3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_townsquare2_r4"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 4) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_townsquare3_r3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 5) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_plain_townsquare3_r4"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
						}
						if (ruined == true) {
							F1PlainRuinedProcedure.execute(world, x, y, z);
						} else {
							F1PlainNormalProcedure.execute(world, x, y, z);
						}
					}
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
						&& (world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("taiga")) || world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("plains"))
								|| world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("meadow")) || world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("sunflower_plains")))
						&& (world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("meadow")) || world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("plains"))
								|| world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("taiga")) || world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("sunflower_plains")))
						&& (world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("plains")) || world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("meadow"))
								|| world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("taiga")) || world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("sunflower_plains")))
						&& (world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("plains")) || world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("meadow"))
								|| world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("taiga")) || world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("sunflower_plains")))) {
					if (tolerance <= 320 && housing >= 3) {
						numero = Mth.nextInt(RandomSource.create(), 0, 5);
						if (world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) (z + 13)) + 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 13)) + 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) z) + 2, z)).canOcclude()) {
							level = 2;
						} else if (!(world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) (z + 13)) - 3, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 13)) - 3, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) z) - 3, z)).canOcclude())) {
							level = 5;
						} else if (!(world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) (z + 13)) - 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 13)) - 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) z) - 2, z)).canOcclude())) {
							level = 4;
						} else {
							level = 3;
						}
						if (Math.random() < 0.85) {
							ruined = false;
							if (numero == 0) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_townsquare1_r1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_townsquare1_r2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 2) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_townsquare2_r1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_townsquare2_r2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 4) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_townsquare3_r1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 5) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_townsquare3_r2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
						} else {
							ruined = true;
							if (numero == 0) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_townsquare1_r3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_townsquare1_r4"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 2) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_townsquare2_r3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_townsquare2_r4"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 4) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_townsquare3_r3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 5) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_townsquare3_r4"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
						}
						if (ruined == true) {
							F1TaigaRuinedProcedure.execute(world, x, y, z);
						} else {
							F1TaigaNormalProcedure.execute(world, x, y, z);
						}
					}
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))
						&& (world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("savanna")) || world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("plains"))
								|| world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("savanna_plateau")) || world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("sparse_jungle")))
						&& (world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("savanna")) || world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("plains"))
								|| world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("savanna_plateau")) || world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("sparse_jungle")))
						&& (world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("savanna")) || world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("plains"))
								|| world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("savanna_plateau")) || world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("sparse_jungle")))
						&& (world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("savanna")) || world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("plains"))
								|| world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("savanna_plateau")) || world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("sparse_jungle")))) {
					if (tolerance <= 160 && housing >= 3) {
						numero = Mth.nextInt(RandomSource.create(), 0, 5);
						if (world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) (z + 13)) + 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 13)) + 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) z) + 2, z)).canOcclude()) {
							level = 2;
						} else if (!(world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) (z + 13)) - 3, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 13)) - 3, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) z) - 3, z)).canOcclude())) {
							level = 5;
						} else if (!(world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) (z + 13)) - 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 13)) - 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) z) - 2, z)).canOcclude())) {
							level = 4;
						} else {
							level = 3;
						}
						if (Math.random() < 0.85) {
							ruined = false;
							if (numero == 0) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_savanna_townsquare1_r1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_savanna_townsquare1_r2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 2) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_savanna_townsquare2_r1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_savanna_townsquare2_r2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 4) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_savanna_townsquare3_r1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 5) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_savanna_townsquare3_r2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
						} else {
							ruined = true;
							if (numero == 0) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_savanna_townsquare1_r3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_savanna_townsquare1_r4"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 2) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_savanna_townsquare2_r3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_savanna_townsquare2_r4"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 4) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_savanna_townsquare3_r3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 5) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_savanna_townsquare3_r4"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
						}
						if (ruined == true) {
							F1SavannaRuinedProcedure.execute(world, x, y, z);
						} else {
							F1SavannaNormalProcedure.execute(world, x, y, z);
						}
					}
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))
						&& (world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("snowy_plains")) || world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("snowy_beach")) || world.getBiome(BlockPos.containing(x + 32, y, z)).is(ResourceLocation.parse("snowy_taiga")))
						&& (world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("snowy_plains")) || world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("snowy_slopes"))
								|| world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("snowy_beach")) || world.getBiome(BlockPos.containing(x - 32, y, z)).is(ResourceLocation.parse("snowy_taiga")))
						&& (world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("snowy_plains")) || world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("snowy_slopes")) || world.getBiome(BlockPos.containing(x, y, z - 32)).is(ResourceLocation.parse("snowy_taiga")))
						&& (world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("snowy_slopes")) || world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("snowy_beach"))
								|| world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("snowy_plains")) || world.getBiome(BlockPos.containing(x, y, z + 32)).is(ResourceLocation.parse("snowy_taiga")))) {
					if (tolerance <= 160 && housing >= 3) {
						numero = Mth.nextInt(RandomSource.create(), 0, 5);
						if (world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) (z + 13)) + 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 13)) + 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) z) + 2, z)).canOcclude()) {
							level = 2;
						} else if (!(world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) (z + 13)) - 3, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 13)) - 3, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) z) - 3, z)).canOcclude())) {
							level = 5;
						} else if (!(world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) (z + 13)) - 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 13)) - 2, z + 13)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x + 13, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) z) - 2, z)).canOcclude())) {
							level = 4;
						} else {
							level = 3;
						}
						if (Math.random() < 0.85) {
							ruined = false;
							if (numero == 0) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_townsquare1_r1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_townsquare1_r2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 2) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_townsquare2_r1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_townsquare2_r2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 4) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_townsquare3_r1"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 5) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_townsquare3_r2"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
						} else {
							ruined = true;
							if (numero == 0) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_townsquare1_r3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 1) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_townsquare1_r4"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 2) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_townsquare2_r3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 3) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_townsquare2_r3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 4) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_townsquare3_r3"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							} else if (numero == 5) {
								if (world instanceof ServerLevel _serverworld) {
									StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_townsquare3_r4"));
									if (template != null) {
										template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) z) - level, z),
												new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
									}
								}
							}
						}
						if (ruined == true) {
							F1TundraRuinedProcedure.execute(world, x, y, z);
						} else {
							F1TundraNormalProcedure.execute(world, x, y, z);
						}
					}
				}
			}
		}
	}
}
