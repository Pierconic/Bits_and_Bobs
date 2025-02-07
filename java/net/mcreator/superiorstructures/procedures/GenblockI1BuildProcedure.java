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

//This one's been modified, refer to backups if it causes problems
public class GenblockI1BuildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String type = "";
		double number = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double ox = 0;
		double oz = 0;
		if (world.getBlockState(BlockPos.containing(x, y - 6, z)).canOcclude() && world.getBlockState(BlockPos.containing(x + 12, y - 6, z + 12)).canOcclude() && world.getBlockState(BlockPos.containing(x, y - 6, z + 12)).canOcclude()
				&& world.getBlockState(BlockPos.containing(x + 12, y - 6, z)).canOcclude()) {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_lukewarm_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lukewarm_ocean"))) {
				number = Mth.nextInt(RandomSource.create(), 0, 2);
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_ocean_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_ocean_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_ocean_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z + Mth.nextInt(RandomSource.create(), 16, 20);
				GenblockI1SelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z - Mth.nextInt(RandomSource.create(), 16, 20);
				GenblockI1SelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x + Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				GenblockI1SelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x - Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				GenblockI1SelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				GenblockI1SmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				GenblockI1SmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				GenblockI1SmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				GenblockI1SmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 4, 8); index0++) {
					if (Math.random() < 0.5) {
						ox = x + Mth.nextInt(RandomSource.create(), 20, 28);
					} else {
						ox = x - Mth.nextInt(RandomSource.create(), 20, 28);
					}
					if (Math.random() < 0.5) {
						oz = z + Mth.nextInt(RandomSource.create(), 20, 24);
					} else {
						oz = z - Mth.nextInt(RandomSource.create(), 20, 24);
					}
					if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
						GenblockI1DecorProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("warm_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("warm_ocean"))) {
				number = Mth.nextInt(RandomSource.create(), 0, 2);
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_warm_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_warm_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_warm_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z + Mth.nextInt(RandomSource.create(), 16, 20);
				GenblockI1ASelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z - Mth.nextInt(RandomSource.create(), 16, 20);
				GenblockI1ASelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x + Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				GenblockI1ASelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x - Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				GenblockI1ASelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				GenblockI1ASmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				GenblockI1ASmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				GenblockI1ASmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				GenblockI1ASmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				for (int index1 = 0; index1 < Mth.nextInt(RandomSource.create(), 4, 8); index1++) {
					if (Math.random() < 0.5) {
						ox = x + Mth.nextInt(RandomSource.create(), 20, 28);
					} else {
						ox = x - Mth.nextInt(RandomSource.create(), 20, 28);
					}
					if (Math.random() < 0.5) {
						oz = z + Mth.nextInt(RandomSource.create(), 20, 24);
					} else {
						oz = z - Mth.nextInt(RandomSource.create(), 20, 24);
					}
					if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
						GenblockI1ADecorProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("cold_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_cold_ocean"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("stony_shore")) 
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_ocean"))) {
				number = Mth.nextInt(RandomSource.create(), 0, 2);
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_cold_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_cold_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_cold_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 3, 6), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z + Mth.nextInt(RandomSource.create(), 16, 20);
				GenblockI1BSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z - Mth.nextInt(RandomSource.create(), 16, 20);
				GenblockI1BSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x + Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				GenblockI1BSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x - Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				GenblockI1BSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				GenblockI1BSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				GenblockI1BSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				GenblockI1BSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				GenblockI1BSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
				for (int index2 = 0; index2 < Mth.nextInt(RandomSource.create(), 4, 8); index2++) {
					if (Math.random() < 0.5) {
						ox = x + Mth.nextInt(RandomSource.create(), 20, 28);
					} else {
						ox = x - Mth.nextInt(RandomSource.create(), 20, 28);
					}
					if (Math.random() < 0.5) {
						oz = z + Mth.nextInt(RandomSource.create(), 20, 24);
					} else {
						oz = z - Mth.nextInt(RandomSource.create(), 20, 24);
					}
					if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
						GenblockI1BDecorProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
				number = Mth.nextInt(RandomSource.create(), 0, 3);
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_desert_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_desert_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_desert_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_desert_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z + Mth.nextInt(RandomSource.create(), 16, 20);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1GSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z - Mth.nextInt(RandomSource.create(), 16, 20);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1GSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1GSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1GSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1GSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1GSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1GSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1GSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 4, 8); index3++) {
					if (Math.random() < 0.5) {
						ox = x + Mth.nextInt(RandomSource.create(), 20, 28);
					} else {
						ox = x - Mth.nextInt(RandomSource.create(), 20, 28);
					}
					if (Math.random() < 0.5) {
						oz = z + Mth.nextInt(RandomSource.create(), 20, 24);
					} else {
						oz = z - Mth.nextInt(RandomSource.create(), 20, 24);
					}
					if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
						GenblockI1GDecorProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna_plateau"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("windswept_savanna")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("windswept_savanna"))) {
				number = Mth.nextInt(RandomSource.create(), 0, 4);
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_savanna_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_savanna_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_savanna_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_savanna_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_savanna_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z + Mth.nextInt(RandomSource.create(), 16, 20);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1HSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z - Mth.nextInt(RandomSource.create(), 16, 20);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1HSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1HSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1HSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1HSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1HSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1HSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1HSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 4, 8); index3++) {
					if (Math.random() < 0.5) {
						ox = x + Mth.nextInt(RandomSource.create(), 20, 28);
					} else {
						ox = x - Mth.nextInt(RandomSource.create(), 20, 28);
					}
					if (Math.random() < 0.5) {
						oz = z + Mth.nextInt(RandomSource.create(), 20, 24);
					} else {
						oz = z - Mth.nextInt(RandomSource.create(), 20, 24);
					}
					if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
						GenblockI1HDecorProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("eroded_badlands")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("eroded_badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				number = Mth.nextInt(RandomSource.create(), 0, 4);
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_arid_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_arid_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_arid_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_arid_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_arid_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z + Mth.nextInt(RandomSource.create(), 16, 20);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1CSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z - Mth.nextInt(RandomSource.create(), 16, 20);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1CSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1CSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1CSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1CSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1CSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1CSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1CSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				for (int index3 = 0; index3 < Mth.nextInt(RandomSource.create(), 4, 8); index3++) {
					if (Math.random() < 0.5) {
						ox = x + Mth.nextInt(RandomSource.create(), 20, 28);
					} else {
						ox = x - Mth.nextInt(RandomSource.create(), 20, 28);
					}
					if (Math.random() < 0.5) {
						oz = z + Mth.nextInt(RandomSource.create(), 20, 24);
					} else {
						oz = z - Mth.nextInt(RandomSource.create(), 20, 24);
					}
					if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
						GenblockI1CDecorProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("bamboo_jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("bamboo_jungle"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sparse_jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sparse_jungle"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))) {
				number = Mth.nextInt(RandomSource.create(), 0, 4);
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_lush_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 4, 5), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 4, 5), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_lush_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 4, 5), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 4, 5), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_lush_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 4, 5), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 4, 5), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_lush_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 4, 5), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 4, 5), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_lush_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 4, 5), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 4, 5), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z + Mth.nextInt(RandomSource.create(), 16, 20);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1ESelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 5), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z - Mth.nextInt(RandomSource.create(), 16, 20);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1ESelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 5), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1ESelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 5), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1ESelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 5), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 2, oz)).canOcclude()) {
					GenblockI1ESmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 2), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 2, oz)).canOcclude()) {
					GenblockI1ESmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 2), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 2, oz)).canOcclude()) {
					GenblockI1ESmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 2), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 2, oz)).canOcclude()) {
					GenblockI1ESmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 2), oz);
				}
				for (int index4 = 0; index4 < Mth.nextInt(RandomSource.create(), 4, 8); index4++) {
					if (Math.random() < 0.5) {
						ox = x + Mth.nextInt(RandomSource.create(), 20, 28);
					} else {
						ox = x - Mth.nextInt(RandomSource.create(), 20, 28);
					}
					if (Math.random() < 0.5) {
						oz = z + Mth.nextInt(RandomSource.create(), 20, 24);
					} else {
						oz = z - Mth.nextInt(RandomSource.create(), 20, 24);
					}
					if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 1, oz)).canOcclude()) {
						GenblockI1EDecorProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 1, 2)), oz);
					}
				}
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("windswept_hills")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_taiga")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("ice_spikes"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_peaks"))) {
				number = Mth.nextInt(RandomSource.create(), 0, 3);
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_snow_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_snow_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_snow_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_snow_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z + Mth.nextInt(RandomSource.create(), 16, 20);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1DSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z - Mth.nextInt(RandomSource.create(), 16, 20);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1DSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1DSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1DSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1DSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1DSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1ESmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1DSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				for (int index5 = 0; index5 < Mth.nextInt(RandomSource.create(), 4, 8); index5++) {
					if (Math.random() < 0.5) {
						ox = x + Mth.nextInt(RandomSource.create(), 20, 28);
					} else {
						ox = x - Mth.nextInt(RandomSource.create(), 20, 28);
					}
					if (Math.random() < 0.5) {
						oz = z + Mth.nextInt(RandomSource.create(), 20, 24);
					} else {
						oz = z - Mth.nextInt(RandomSource.create(), 20, 24);
					}
					if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
						GenblockI1DDecorProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
					}
				}
			} else {
				number = Mth.nextInt(RandomSource.create(), 0, 4);
				if (number == 0) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_plain_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_plain_2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_plain_3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}  else if (number == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_plain_4"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (number == 4) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "ruin_center_plain_5"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z), BlockPos.containing(x, y - Mth.nextInt(RandomSource.create(), 5, 8), z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z + Mth.nextInt(RandomSource.create(), 16, 20);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1FSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), -7, 7);
				oz = z - Mth.nextInt(RandomSource.create(), 16, 20);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1FSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1FSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 16, 20);
				oz = z + Mth.nextInt(RandomSource.create(), -7, 7);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1FSelectProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1FSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z + Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1FSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x + Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1FSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				ox = x - Mth.nextInt(RandomSource.create(), 18, 24);
				oz = z - Mth.nextInt(RandomSource.create(), 18, 24);
				if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
					GenblockI1FSmallProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 4, 8)), oz);
				}
				for (int index6 = 0; index6 < Mth.nextInt(RandomSource.create(), 8, 10); index6++) {
					if (Math.random() < 0.5) {
						ox = x + Mth.nextInt(RandomSource.create(), 20, 28);
					} else {
						ox = x - Mth.nextInt(RandomSource.create(), 20, 28);
					}
					if (Math.random() < 0.5) {
						oz = z + Mth.nextInt(RandomSource.create(), 20, 24);
					} else {
						oz = z - Mth.nextInt(RandomSource.create(), 20, 24);
					}
					if (world.getBlockState(BlockPos.containing(ox, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - 3, oz)).canOcclude()) {
						GenblockI1FDecorProcedure.execute(world, ox, (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) ox, (int) oz) - Mth.nextInt(RandomSource.create(), 3, 5)), oz);
					}
				}
			}
		}
	}
}