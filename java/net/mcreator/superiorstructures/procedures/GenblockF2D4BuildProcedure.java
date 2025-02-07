package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.SuperiorstructuresMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class GenblockF2D4BuildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double extension = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -1;
		for (int index0 = 0; index0 < (int) (15); index0++) {
			sy = -1;
			for (int index1 = 0; index1 < (int) (15); index1++) {
				sz = -1;
				for (int index2 = 0; index2 < (int) (15); index2++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
							|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)))
									.is(BlockTags.create(ResourceLocation.parse("minecraft:leaves")))
							|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)))
									.is(BlockTags.create(ResourceLocation.parse("forge:other_flammable")))) {
						world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
					}
					sz = sz + 1;
				}
				sy = sy + 1;
			}
			sx = sx + 1;
		}
		SuperiorstructuresMod.queueServerWork(6, () -> {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream()
						.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof ItemEntity) {
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					}
				}
			}
		});
		extension = 0;
		for (int index3 = 0; index3 < (int) (15); index3++) {
			if ((world.getBlockState(BlockPos.containing(x + 7,
					world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 7), (int) (z + extension)) - 1, z + extension)))
					.getBlock() == Blocks.GRASS_BLOCK
					&& !(1 < world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + extension))
							- world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 7), (int) (z + extension))
							|| 1 < world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 7), (int) (z + extension))
									- world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + extension)))
					&& !(1 < world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 8), (int) (z + extension))
							- world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 7), (int) (z + extension))
							|| 1 < world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 7), (int) (z + extension))
									- world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 8), (int) (z + extension)))) {
				if ((world.getBlockState(BlockPos.containing(x + 7,
						world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 7), (int) (z + extension)) - 0, z + extension)))
						.getBlock() == Blocks.SNOW) {
					world.setBlock(BlockPos.containing(x + 7,
							world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 7), (int) (z + extension)) - 0, z + extension),
							Blocks.AIR.defaultBlockState(), 3);
				}
				if (Math.random() < 0.9) {
					world.setBlock(BlockPos.containing(x + 7,
							world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 7), (int) (z + extension)) - 1, z + extension),
							Blocks.GRAVEL.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x + 7,
							world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 7), (int) (z + extension)) - 1, z + extension),
							Blocks.COBBLESTONE.defaultBlockState(), 3);
				}
				if (world
						.getBlockState(BlockPos.containing(x + 7,
								world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 7), (int) (z + extension)), z + extension + 1))
						.isFaceSturdy(world,
								BlockPos.containing(x + 7, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 7), (int) (z + extension)),
										z + extension + 1),
								Direction.UP)
						|| world.getBlockState(
								BlockPos.containing(x + 7, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 7), (int) (z + extension)),
										(z + extension) - 1))
								.isFaceSturdy(world,
										BlockPos.containing(x + 7,
												world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 7), (int) (z + extension)),
												(z + extension) - 1),
										Direction.UP)) {
					if (Math.random() < 0.6) {
						world.setBlock(BlockPos.containing(x + 7,
								world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 7), (int) (z + extension)), z + extension),
								Blocks.STONE_BRICK_SLAB.defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 6,
						world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + extension)) - 1, z + extension)))
						.getBlock() == Blocks.GRASS_BLOCK) {
					if ((world.getBlockState(BlockPos.containing(x + 6,
							world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + extension)) - 0, z + extension)))
							.getBlock() == Blocks.SNOW) {
						world.setBlock(BlockPos.containing(x + 6,
								world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + extension)) - 0, z + extension),
								Blocks.AIR.defaultBlockState(), 3);
					}
					if (Math.random() < 0.7) {
						world.setBlock(BlockPos.containing(x + 6,
								world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + extension)) - 1, z + extension),
								Blocks.GRAVEL.defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x + 6,
								world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + extension)) - 1, z + extension),
								Blocks.COBBLESTONE.defaultBlockState(), 3);
					}
					if (world.getBlockState(BlockPos.containing(x + 6,
							world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + extension)), z + extension + 1))
							.isFaceSturdy(world,
									BlockPos.containing(x + 6,
											world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + extension)),
											z + extension + 1),
									Direction.UP)
							|| world.getBlockState(BlockPos.containing(x + 6,
									world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + extension)),
									(z + extension) - 1))
									.isFaceSturdy(world,
											BlockPos.containing(x + 6,
													world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + extension)),
													(z + extension) - 1),
											Direction.UP)) {
						if (Math.random() < 0.6) {
							world.setBlock(BlockPos.containing(x + 6,
									world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + extension)), z + extension),
									Blocks.STONE_BRICK_SLAB.defaultBlockState(), 3);
						}
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + 8,
						world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 8), (int) (z + extension)) - 1, z + extension)))
						.getBlock() == Blocks.GRASS_BLOCK) {
					if ((world.getBlockState(BlockPos.containing(x + 8,
							world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 8), (int) (z + extension)) - 0, z + extension)))
							.getBlock() == Blocks.SNOW) {
						world.setBlock(BlockPos.containing(x + 8,
								world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 8), (int) (z + extension)) - 0, z + extension),
								Blocks.AIR.defaultBlockState(), 3);
					}
					if (Math.random() < 0.7) {
						world.setBlock(BlockPos.containing(x + 8,
								world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 8), (int) (z + extension)) - 1, z + extension),
								Blocks.GRAVEL.defaultBlockState(), 3);
					} else {
						world.setBlock(BlockPos.containing(x + 8,
								world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 8), (int) (z + extension)) - 1, z + extension),
								Blocks.COBBLESTONE.defaultBlockState(), 3);
					}
					if (world.getBlockState(BlockPos.containing(x + 8,
							world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 8), (int) (z + extension)), z + extension + 1))
							.isFaceSturdy(world,
									BlockPos.containing(x + 8,
											world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 8), (int) (z + extension)),
											z + extension + 1),
									Direction.UP)
							|| world.getBlockState(BlockPos.containing(x + 8,
									world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 8), (int) (z + extension)),
									(z + extension) - 1))
									.isFaceSturdy(world,
											BlockPos.containing(x + 8,
													world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 8), (int) (z + extension)),
													(z + extension) - 1),
											Direction.UP)) {
						if (Math.random() < 0.6) {
							world.setBlock(BlockPos.containing(x + 8,
									world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 8), (int) (z + extension)), z + extension),
									Blocks.STONE_BRICK_SLAB.defaultBlockState(), 3);
						}
					}
				}
			}
			extension = extension + 1;
		}
		GenblockF6DBuildProcedure.execute(world, (x + 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 0))),
				(z + 0));
		GenblockF6DBuildProcedure.execute(world, (x + 10), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 10), (int) (z + 0))),
				(z + 0));
		GenblockF6DBuildProcedure.execute(world, (x + 1), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 1), (int) (z + 10))),
				(z + 10));
		GenblockF6DBuildProcedure.execute(world, (x + 10),
				(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 10), (int) (z + 10))), (z + 10));
		if (!(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4))
				- world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 9), (int) (z + 12)) > 2
				|| world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 9), (int) (z + 12))
						- world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) > 2)
				&& !((world.getBlockState(
						BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 1, z + 4)))
						.getBlock() == Blocks.WATER
						|| (world.getBlockState(
								BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)), z + 4)))
								.getBlock() == Blocks.WATER)) {
			if (Math.random() < 0.2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_arch2_r1"));
					if (template != null) {
						template.placeInWorld(_serverworld,
								BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3,
										z + 4),
								BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3,
										z + 4),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_arch2_r1_alt"));
					if (template != null) {
						template.placeInWorld(_serverworld,
								BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3,
										z + 4),
								BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3,
										z + 4),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_arch2_r2"));
					if (template != null) {
						template.placeInWorld(_serverworld,
								BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3,
										z + 4),
								BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3,
										z + 4),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager()
							.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_tundra_arch2_r2_alt"));
					if (template != null) {
						template.placeInWorld(_serverworld,
								BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3,
										z + 4),
								BlockPos.containing(x + 4, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3,
										z + 4),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
								_serverworld.random, 3);
					}
				}
			}
		}
	}
}