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
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.SuperiorstructuresMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class GenblockF2BBuildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double extension = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		sx = -1;
		for (int index0 = 0; index0 < (int) (17); index0++) {
			sy = -3;
			for (int index1 = 0; index1 < (int) (20); index1++) {
				sz = -1;
				for (int index2 = 0; index2 < (int) (17); index2++) {
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
		for (int index3 = 0; index3 < (int) (15); index3++) {
			if ((world.getBlockState(BlockPos.containing(x + extension,
					world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 7)) - 1, z + 7)))
					.getBlock() == Blocks.GRASS_BLOCK
					&& !(1 < world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 6))
							- world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 7))
							|| 1 < world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 7))
									- world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 6)))
					&& !(1 < world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 8))
							- world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 7))
							|| 1 < world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 7))
									- world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 8)))) {
				if (Math.random() < 0.7) {
					world.setBlock(
							BlockPos.containing(x + extension,
									world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 7)) - 1, z + 7),
							Blocks.GRAVEL.defaultBlockState(), 3);
				} else {
					world.setBlock(
							BlockPos.containing(x + extension,
									world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 7)) - 1, z + 7),
							Blocks.COBBLESTONE.defaultBlockState(), 3);
				}
				if (world
						.getBlockState(BlockPos.containing(x + extension + 1,
								world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 7)), z + 7))
						.canOcclude()
						&& !(world.getBlockState(BlockPos.containing(x + extension + 1,
								world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 7)), z + 7))).is(
										BlockTags.create(ResourceLocation.parse("minecraft:slabs")))
						|| world.getBlockState(BlockPos.containing((x + extension) - 1,
								world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 7)), z + 7))
								.canOcclude()
								&& !(world.getBlockState(BlockPos.containing((x + extension) - 1,
										world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 7)),
										z + 7))).is(BlockTags.create(ResourceLocation.parse("minecraft:slabs")))) {
					world.setBlock(
							BlockPos.containing(x + extension,
									world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 7)), z + 7),
							Blocks.COBBLESTONE_SLAB.defaultBlockState(), 3);
				}
				if ((world.getBlockState(BlockPos.containing(x + extension,
						world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 6)) - 1, z + 6)))
						.getBlock() == Blocks.GRASS_BLOCK) {
					if (Math.random() < 0.5) {
						world.setBlock(
								BlockPos.containing(x + extension,
										world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 6)) - 1, z + 6),
								Blocks.GRAVEL.defaultBlockState(), 3);
					} else {
						world.setBlock(
								BlockPos.containing(x + extension,
										world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 6)) - 1, z + 6),
								Blocks.COBBLESTONE.defaultBlockState(), 3);
					}
					if (world
							.getBlockState(BlockPos.containing(x + extension + 1,
									world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 6)), z + 6))
							.canOcclude()
							&& !(world.getBlockState(BlockPos.containing(x + extension + 1,
									world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 6)), z + 6))).is(
											BlockTags.create(ResourceLocation.parse("minecraft:slabs")))
							|| world.getBlockState(BlockPos.containing((x + extension) - 1,
									world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 6)), z + 6))
									.canOcclude()
									&& !(world.getBlockState(BlockPos.containing((x + extension) - 1,
											world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 6)),
											z + 6))).is(BlockTags.create(ResourceLocation.parse("minecraft:slabs")))) {
						world.setBlock(
								BlockPos.containing(x + extension,
										world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 6)), z + 6),
								Blocks.COBBLESTONE_SLAB.defaultBlockState(), 3);
					}
				}
				if ((world.getBlockState(BlockPos.containing(x + extension,
						world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 8)) - 1, z + 8)))
						.getBlock() == Blocks.GRASS_BLOCK) {
					if (Math.random() < 0.5) {
						world.setBlock(
								BlockPos.containing(x + extension,
										world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 8)) - 1, z + 8),
								Blocks.GRAVEL.defaultBlockState(), 3);
					} else {
						world.setBlock(
								BlockPos.containing(x + extension,
										world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 8)) - 1, z + 8),
								Blocks.COBBLESTONE.defaultBlockState(), 3);
					}
					if (world
							.getBlockState(BlockPos.containing(x + extension + 1,
									world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 8)), z + 8))
							.canOcclude()
							&& !(world.getBlockState(BlockPos.containing(x + extension + 1,
									world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 8)), z + 8))).is(
											BlockTags.create(ResourceLocation.parse("minecraft:slabs")))
							|| world.getBlockState(BlockPos.containing((x + extension) - 1,
									world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 8)), z + 8))
									.canOcclude()
									&& !(world.getBlockState(BlockPos.containing((x + extension) - 1,
											world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 8)),
											z + 8))).is(BlockTags.create(ResourceLocation.parse("minecraft:slabs")))) {
						world.setBlock(
								BlockPos.containing(x + extension,
										world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + extension), (int) (z + 8)), z + 8),
								Blocks.COBBLESTONE_SLAB.defaultBlockState(), 3);
					}
				}
			}
			extension = extension + 1;
		}
		GenblockF6B2BuildProcedure.execute(world, (x + 0), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 0), (int) (z + 1))),
				(z + 1));
		GenblockF6B2BuildProcedure.execute(world, (x + 10),
				(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 10), (int) (z + 1))), (z + 1));
		GenblockF6B2BuildProcedure.execute(world, (x + 0), (world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 0), (int) (z + 10))),
				(z + 10));
		GenblockF6B2BuildProcedure.execute(world, (x + 10),
				(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 10), (int) (z + 10))), (z + 10));
		if (!(world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 9), (int) (z + 12)) > 2
				|| world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 9), (int) (z + 12)) - world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) > 2)
				&& !((world.getBlockState(BlockPos.containing(x + 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 1, z + 4))).getBlock() == Blocks.WATER
						|| (world.getBlockState(BlockPos.containing(x + 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)), z + 4))).getBlock() == Blocks.WATER)) {
			if (Math.random() < 0.2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_arch1_r3"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3, z + 4),
								BlockPos.containing(x + 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3, z + 4),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_arch1_r3_alt"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3, z + 4),
								BlockPos.containing(x + 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3, z + 4),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
			} else if (Math.random() < 0.2) {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_arch1_r4"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3, z + 4),
								BlockPos.containing(x + 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3, z + 4),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
			} else {
				if (world instanceof ServerLevel _serverworld) {
					StructureTemplate template = _serverworld.getStructureManager().getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "village_taiga_arch1_r4_alt"));
					if (template != null) {
						template.placeInWorld(_serverworld, BlockPos.containing(x + 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3, z + 4),
								BlockPos.containing(x + 6, world.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (int) (x + 6), (int) (z + 4)) - 3, z + 4),
								new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
					}
				}
			}
		}
	}
}
