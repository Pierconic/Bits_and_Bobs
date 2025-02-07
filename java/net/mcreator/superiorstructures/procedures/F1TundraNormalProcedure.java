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

import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class F1TundraNormalProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double numero = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		boolean found = false;
		boolean ruined = false;
		numero = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numero < 3) {
			GenblockF3D2BuildProcedure.execute(world, (x - 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 30), (int) (z + 15))), (z + 15));
		} else if (numero > 5) {
			GenblockF5D2BuildProcedure.execute(world, (x - 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 30), (int) (z + 15))), (z + 15));
		} else {
			GenblockF4D2BuildProcedure.execute(world, (x - 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 30), (int) (z + 15))), (z + 15));
		}
		numero = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numero < 3) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				GenblockF3D2BuildProcedure.execute(world, (x - 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z + 30))), (z + 30));
			});
		} else if (numero > 5) {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				GenblockF5D2BuildProcedure.execute(world, (x - 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z + 30))), (z + 30));
			});
		} else {
			SuperiorstructuresMod.queueServerWork(1, () -> {
				GenblockF4D2BuildProcedure.execute(world, (x - 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z + 30))), (z + 30));
			});
		}
		numero = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numero < 3) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				GenblockF3D2BuildProcedure.execute(world, (x - 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 30), (int) (z + 30))), (z + 30));
			});
		} else if (numero > 5) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				GenblockF5D2BuildProcedure.execute(world, (x - 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 30), (int) (z + 30))), (z + 30));
			});
		} else {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				GenblockF4D2BuildProcedure.execute(world, (x - 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 30), (int) (z + 30))), (z + 30));
			});
		}
		numero = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numero < 3) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				GenblockF3D2BuildProcedure.execute(world, (x - 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 30), (int) (z - 15))), (z - 15));
			});
		} else if (numero > 5) {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				GenblockF5D2BuildProcedure.execute(world, (x - 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 30), (int) (z - 15))), (z - 15));
			});
		} else {
			SuperiorstructuresMod.queueServerWork(3, () -> {
				GenblockF4D2BuildProcedure.execute(world, (x - 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 30), (int) (z - 15))), (z - 15));
			});
		}
		numero = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numero < 3) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				GenblockF3D2BuildProcedure.execute(world, (x - 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z - 30))), (z - 30));
			});
		} else if (numero > 5) {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				GenblockF5D2BuildProcedure.execute(world, (x - 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z - 30))), (z - 30));
			});
		} else {
			SuperiorstructuresMod.queueServerWork(4, () -> {
				GenblockF4D2BuildProcedure.execute(world, (x - 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z - 30))), (z - 30));
			});
		}
		numero = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numero < 3) {
			SuperiorstructuresMod.queueServerWork(5, () -> {
				GenblockF3D2BuildProcedure.execute(world, (x - 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 30), (int) (z - 30))), (z - 30));
			});
		} else if (numero > 5) {
			SuperiorstructuresMod.queueServerWork(5, () -> {
				GenblockF5D2BuildProcedure.execute(world, (x - 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 30), (int) (z - 30))), (z - 30));
			});
		} else {
			SuperiorstructuresMod.queueServerWork(5, () -> {
				GenblockF4D2BuildProcedure.execute(world, (x - 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 30), (int) (z - 30))), (z - 30));
			});
		}
		numero = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numero < 3) {
			SuperiorstructuresMod.queueServerWork(6, () -> {
				GenblockF3D2BuildProcedure.execute(world, (x + 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 30), (int) (z - 15))), (z - 15));
			});
		} else if (numero > 5) {
			SuperiorstructuresMod.queueServerWork(6, () -> {
				GenblockF5D2BuildProcedure.execute(world, (x + 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 30), (int) (z - 15))), (z - 15));
			});
		} else {
			SuperiorstructuresMod.queueServerWork(6, () -> {
				GenblockF4D2BuildProcedure.execute(world, (x + 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 30), (int) (z - 15))), (z - 15));
			});
		}
		numero = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numero < 3) {
			SuperiorstructuresMod.queueServerWork(7, () -> {
				GenblockF3D2BuildProcedure.execute(world, (x + 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z - 30))), (z - 30));
			});
		} else if (numero > 5) {
			SuperiorstructuresMod.queueServerWork(7, () -> {
				GenblockF5D2BuildProcedure.execute(world, (x + 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z - 30))), (z - 30));
			});
		} else {
			SuperiorstructuresMod.queueServerWork(7, () -> {
				GenblockF4D2BuildProcedure.execute(world, (x + 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z - 30))), (z - 30));
			});
		}
		numero = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numero < 3) {
			SuperiorstructuresMod.queueServerWork(8, () -> {
				GenblockF3D2BuildProcedure.execute(world, (x + 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 30), (int) (z - 30))), (z - 30));
			});
		} else if (numero > 5) {
			SuperiorstructuresMod.queueServerWork(8, () -> {
				GenblockF5D2BuildProcedure.execute(world, (x + 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 30), (int) (z - 30))), (z - 30));
			});
		} else {
			SuperiorstructuresMod.queueServerWork(8, () -> {
				GenblockF4D2BuildProcedure.execute(world, (x + 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 30), (int) (z - 30))), (z - 30));
			});
		}
		numero = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numero < 3) {
			SuperiorstructuresMod.queueServerWork(9, () -> {
				GenblockF3D2BuildProcedure.execute(world, (x + 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 30), (int) (z + 15))), (z + 15));
			});
		} else if (numero > 5) {
			SuperiorstructuresMod.queueServerWork(9, () -> {
				GenblockF5D2BuildProcedure.execute(world, (x + 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 30), (int) (z + 15))), (z + 15));
			});
		} else {
			SuperiorstructuresMod.queueServerWork(9, () -> {
				GenblockF4D2BuildProcedure.execute(world, (x + 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 30), (int) (z + 15))), (z + 15));
			});
		}
		numero = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numero < 3) {
			SuperiorstructuresMod.queueServerWork(10, () -> {
				GenblockF3D2BuildProcedure.execute(world, (x + 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z + 30))), (z + 30));
			});
		} else if (numero > 5) {
			SuperiorstructuresMod.queueServerWork(10, () -> {
				GenblockF5D2BuildProcedure.execute(world, (x + 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z + 30))), (z + 30));
			});
		} else {
			SuperiorstructuresMod.queueServerWork(10, () -> {
				GenblockF4D2BuildProcedure.execute(world, (x + 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z + 30))), (z + 30));
			});
		}
		numero = Mth.nextInt(RandomSource.create(), 0, 7);
		if (numero < 3) {
			SuperiorstructuresMod.queueServerWork(11, () -> {
				GenblockF3D2BuildProcedure.execute(world, (x + 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 30), (int) (z + 30))), (z + 30));
			});
		} else if (numero > 5) {
			SuperiorstructuresMod.queueServerWork(11, () -> {
				GenblockF5D2BuildProcedure.execute(world, (x + 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 30), (int) (z + 30))), (z + 30));
			});
		} else {
			SuperiorstructuresMod.queueServerWork(11, () -> {
				GenblockF4D2BuildProcedure.execute(world, (x + 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 30), (int) (z + 30))), (z + 30));
			});
		}
		SuperiorstructuresMod.queueServerWork(12, () -> {
			GenblockF2D2BuildProcedure.execute(world, (x + 13), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 13), (int) (z - 1))), (z - 1));
			GenblockF2D2BuildProcedure.execute(world, (x + 28), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 28), (int) (z - 1))), (z - 1));
			GenblockF2D2BuildProcedure.execute(world, (x + 43), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 43), (int) (z - 1))), (z - 1));
		});
		SuperiorstructuresMod.queueServerWork(13, () -> {
			GenblockF2D2BuildProcedure.execute(world, (x - 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z - 1))), (z - 1));
			GenblockF2D2BuildProcedure.execute(world, (x - 30), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 30), (int) (z - 1))), (z - 1));
			GenblockF2D2BuildProcedure.execute(world, (x - 45), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 45), (int) (z - 1))), (z - 1));
		});
		SuperiorstructuresMod.queueServerWork(14, () -> {
			GenblockF2D4BuildProcedure.execute(world, (x - 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 13))), (z + 13));
			GenblockF2D4BuildProcedure.execute(world, (x - 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 28))), (z + 28));
			GenblockF2D4BuildProcedure.execute(world, (x - 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 43))), (z + 43));
		});
		SuperiorstructuresMod.queueServerWork(15, () -> {
			GenblockF2D4BuildProcedure.execute(world, (x - 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 15))), (z - 15));
			GenblockF2D4BuildProcedure.execute(world, (x - 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 30))), (z - 30));
			GenblockF2D4BuildProcedure.execute(world, (x - 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 1), (int) (z + 45))), (z - 45));
		});
		SuperiorstructuresMod.queueServerWork(15, () -> {
			GenblockF5D2BuildProcedure.execute(world, (x - 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z - 15))), (z - 15));
			GenblockF5D2BuildProcedure.execute(world, (x + 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z - 15))), (z - 15));
			GenblockF5D2BuildProcedure.execute(world, (x + 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z + 15))), (z + 15));
			GenblockF5D2BuildProcedure.execute(world, (x - 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z + 15))), (z + 15));
		});
		SuperiorstructuresMod.queueServerWork(16, () -> {
			GenblockF4D2BuildProcedure.execute(world, (x - 45), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 45), (int) (z - 15))), (z - 15));
			GenblockF4D2BuildProcedure.execute(world, (x + 45), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 45), (int) (z - 15))), (z - 15));
			GenblockF4D2BuildProcedure.execute(world, (x - 45), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 45), (int) (z + 15))), (z + 15));
			GenblockF4D2BuildProcedure.execute(world, (x + 45), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 45), (int) (z + 15))), (z + 15));
		});
		SuperiorstructuresMod.queueServerWork(17, () -> {
			GenblockF4D2BuildProcedure.execute(world, (x - 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z - 45))), (z - 45));
			GenblockF4D2BuildProcedure.execute(world, (x + 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z - 45))), (z - 45));
			GenblockF4D2BuildProcedure.execute(world, (x - 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 15), (int) (z + 45))), (z + 45));
			GenblockF4D2BuildProcedure.execute(world, (x + 15), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 15), (int) (z + 45))), (z + 45));
		});
		SuperiorstructuresMod.queueServerWork(20, () -> {
			if (!(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 59), (int) (z + 1)) - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 61), (int) (z + 11)) > 2
					|| world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 61), (int) (z + 11)) - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 59), (int) (z + 1)) > 2)
					&& !((world.getBlockState(BlockPos.containing(x + 59, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 59), (int) (z + 1)) - 2, z + 1))).getBlock() == Blocks.WATER
							|| (world.getBlockState(BlockPos.containing(x + 61, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 61), (int) (z + 11)) - 2, z + 11))).getBlock() == Blocks.WATER)) {
				if (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 59), (int) (z + 1)) >= world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 61), (int) (z + 11))
						&& world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 54), (int) z) >= 50) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway1_r1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 54), (int) z) - 3, z),
										BlockPos.containing(x + 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 54), (int) z) - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway1_r2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 54), (int) z) - 3, z),
										BlockPos.containing(x + 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 54), (int) z) - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway1_r1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 54), (int) z) - 1, z),
										BlockPos.containing(x + 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 54), (int) z) - 1, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway1_r2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x + 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 54), (int) z) - 1, z),
										BlockPos.containing(x + 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 54), (int) z) - 1, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				}
			}
			if (!(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 59), (int) (z + 1)) - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 61), (int) (z + 11)) > 2
					|| world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 61), (int) (z + 11)) - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 59), (int) (z + 1)) > 2)
					&& !((world.getBlockState(BlockPos.containing(x - 59, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 59), (int) (z + 1)) - 2, z + 1))).getBlock() == Blocks.WATER
							|| (world.getBlockState(BlockPos.containing(x - 61, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 61), (int) (z + 11)) - 2, z + 11))).getBlock() == Blocks.WATER)) {
				if (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 59), (int) (z + 1)) >= world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 61), (int) (z + 11))
						&& world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 54), (int) z) >= 50) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway1_r1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x - 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 54), (int) z) - 3, z),
										BlockPos.containing(x - 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 54), (int) z) - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway1_r2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x - 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 54), (int) z) - 3, z),
										BlockPos.containing(x - 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 54), (int) z) - 3, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway1_r1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x - 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 54), (int) z) - 1, z),
										BlockPos.containing(x - 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 54), (int) z) - 1, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway1_r2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x - 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 54), (int) z) - 1, z),
										BlockPos.containing(x - 54, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x - 54), (int) z) - 1, z),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				}
			}
			if (!(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 59)) - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 11), (int) (z - 61)) > 2
					|| world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 11), (int) (z - 61)) - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 59)) > 2)
					&& !((world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 59)) - 2, z - 59))).getBlock() == Blocks.WATER
							|| (world.getBlockState(BlockPos.containing(x + 11, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 11), (int) (z - 61)) - 2, z - 61))).getBlock() == Blocks.WATER)) {
				if (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z - 59)) >= world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 11), (int) (z - 61))
						&& world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 54)) >= 50) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway2_r1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 54)) - 3, z - 54),
										BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 54)) - 3, z - 54),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway2_r2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 54)) - 3, z - 54),
										BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 54)) - 3, z - 54),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway2_r1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 54)) - 1, z - 54),
										BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 54)) - 1, z - 54),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway2_r2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 54)) - 1, z - 54),
										BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z - 54)) - 1, z - 54),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				}
			}
			if (!(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 59)) - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 11), (int) (z + 61)) > 2
					|| world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 11), (int) (z + 61)) - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 59)) > 2)
					&& !((world.getBlockState(BlockPos.containing(x + 1, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 59)) - 2, z + 59))).getBlock() == Blocks.WATER
							|| (world.getBlockState(BlockPos.containing(x + 11, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 11), (int) (z + 61)) - 2, z + 61))).getBlock() == Blocks.WATER)) {
				if (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 59)) >= world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 11), (int) (z + 61))
						&& world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 54)) >= 50) {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway2_r1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 54)) - 3, z + 54),
										BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 54)) - 3, z + 54),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway2_r2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 54)) - 3, z + 54),
										BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 54)) - 3, z + 54),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				} else {
					if (Math.random() < 0.65) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway2_r1"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 54)) - 1, z + 54),
										BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 54)) - 1, z + 54),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					} else {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_gateway2_r2"));
							if (template != null) {
								template.placeInWorld(_serverworld, BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 54)) - 1, z + 54),
										BlockPos.containing(x, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) x, (int) (z + 54)) - 1, z + 54),
										new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
					}
				}
			}
		});
	}
}