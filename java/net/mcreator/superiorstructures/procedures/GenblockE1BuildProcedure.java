package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
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

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;
import net.mcreator.superiorstructures.SuperiorstructuresMod;
import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class GenblockE1BuildProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
		world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		if (VillageScannerProcedure.execute(world, x, z) == false) {
			SuperiorstructuresMod.queueServerWork(20, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream()
							.sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof ItemEntity) {
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						}
					}
				}
			});
			if (world.getBlockState(BlockPos.containing(x, y - 3, z)).canOcclude()
					&& !(world.getBlockState(BlockPos.containing(x, y - 3, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
					&& world.getBlockState(BlockPos.containing(x + 12, y - 3, z + 12)).canOcclude()
					&& !(world.getBlockState(BlockPos.containing(x + 12, y - 3, z + 12))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
					&& world.getBlockState(BlockPos.containing(x + 12, y - 3, z)).canOcclude()
					&& !(world.getBlockState(BlockPos.containing(x + 12, y - 3, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
					&& world.getBlockState(BlockPos.containing(x, y - 3, z + 12)).canOcclude()
					&& !(world.getBlockState(BlockPos.containing(x, y - 3, z + 12))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
					&& world.isEmptyBlock(BlockPos.containing(x, y + 10, z)) && world.isEmptyBlock(BlockPos.containing(x, y + 10, z + 12))
					&& world.isEmptyBlock(BlockPos.containing(x + 12, y + 10, z)) && world.isEmptyBlock(BlockPos.containing(x + 12, y + 10, z + 12))) {
				if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("dark_forest"))) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_base_dark_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 2, z), BlockPos.containing(x, y - 2, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_base_spruce_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 2, z), BlockPos.containing(x, y - 2, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))
						|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_base_acacia_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 2, z), BlockPos.containing(x, y - 2, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				} else {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(ResourceLocation.fromNamespaceAndPath("superiorstructures", "tower_base_oak_1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y - 2, z), BlockPos.containing(x, y - 2, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				world.setBlock(BlockPos.containing(x + 2, y + 10, z + 2), SuperiorstructuresModBlocks.GENBLOCK_E_3_P_3.get().defaultBlockState(), 3);
SuperiorstructuresMod.queueServerWork(2, () -> {
				TreeFellingTestProcedure.execute(world, (x + 5), y, (z + 5));
			});
				
				world.setBlock(BlockPos.containing(x - 1, y + 2, z + 7), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x - 1, y + 2, z + 8), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x - 1, y + 2, z + 9), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 16, y + 2, z + 7), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 16, y + 2, z + 8), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 16, y + 2, z + 9), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 7, y + 2, z + 16), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 8, y + 2, z + 16), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 9, y + 2, z + 16), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 7, y + 2, z + 1), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 8, y + 2, z + 1), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(BlockPos.containing(x + 9, y + 2, z + 1), Blocks.AIR.defaultBlockState(), 3);
			}
		}
		}
	}
}