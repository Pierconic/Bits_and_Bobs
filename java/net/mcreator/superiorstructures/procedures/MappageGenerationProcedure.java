package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class MappageGenerationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double multiplier = 0;
		double sz = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.GREEN_WOOL.defaultBlockState(), 3);
			multiplier = 64;
			sx = -4;
			for (int index0 = 0; index0 < 10; index0++) {
				sz = -4;
				for (int index1 = 0; index1 < 10; index1++) {
					if ((world.getBlockState(BlockPos.containing(x + sx, y, z + sz))).getBlock() == Blocks.BLUE_WOOL) {
						if (world.getBiome(BlockPos.containing(x + sx * multiplier, y, z + sz * multiplier)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:light_green_biomes")))) {
							world.setBlock(BlockPos.containing(x + sx, y, z + sz), Blocks.BROWN_WOOL.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(x + sx, y + 1, z + sz), Blocks.LIME_CARPET.defaultBlockState(), 3);
						} else if (world.getBiome(BlockPos.containing(x + sx * multiplier, y, z + sz * multiplier)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:yellow_biomes")))) {
							world.setBlock(BlockPos.containing(x + sx, y, z + sz), Blocks.BROWN_WOOL.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(x + sx, y + 1, z + sz), Blocks.YELLOW_CARPET.defaultBlockState(), 3);
						} else if (world.getBiome(BlockPos.containing(x + sx * multiplier, y, z + sz * multiplier)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:cyan_biomes")))) {
							world.setBlock(BlockPos.containing(x + sx, y, z + sz), Blocks.BROWN_WOOL.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(x + sx, y + 1, z + sz), Blocks.CYAN_CARPET.defaultBlockState(), 3);
						} else if (world.getBiome(BlockPos.containing(x + sx * multiplier, y, z + sz * multiplier)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:green_biomes")))) {
							world.setBlock(BlockPos.containing(x + sx, y, z + sz), Blocks.BROWN_WOOL.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(x + sx, y + 1, z + sz), Blocks.GREEN_CARPET.defaultBlockState(), 3);
						} else if (world.getBiome(BlockPos.containing(x + sx * multiplier, y, z + sz * multiplier)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:pink_biomes")))) {
							world.setBlock(BlockPos.containing(x + sx, y, z + sz), Blocks.BROWN_WOOL.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(x + sx, y + 1, z + sz), Blocks.PINK_CARPET.defaultBlockState(), 3);
						} else if (world.getBiome(BlockPos.containing(x + sx * multiplier, y, z + sz * multiplier)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:light_blue_biomes")))) {
							world.setBlock(BlockPos.containing(x + sx, y, z + sz), Blocks.LIGHT_BLUE_WOOL.defaultBlockState(), 3);
						} else if (world.getBiome(BlockPos.containing(x + sx * multiplier, y, z + sz * multiplier)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:orange_biomes")))) {
							world.setBlock(BlockPos.containing(x + sx, y, z + sz), Blocks.ORANGE_WOOL.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(x + sx, y + 1, z + sz), Blocks.ORANGE_CARPET.defaultBlockState(), 3);
						} else if (world.getBiome(BlockPos.containing(x + sx * multiplier, y, z + sz * multiplier)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:gray_biomes")))) {
							world.setBlock(BlockPos.containing(x + sx, y, z + sz), Blocks.LIGHT_GRAY_WOOL.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(x + sx, y + 1, z + sz), Blocks.LIGHT_GRAY_CARPET.defaultBlockState(), 3);
						} else if (world.getBiome(BlockPos.containing(x + sx * multiplier, y, z + sz * multiplier)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:white_biomes")))) {
							world.setBlock(BlockPos.containing(x + sx, y, z + sz), Blocks.BROWN_WOOL.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(x + sx, y + 1, z + sz), Blocks.WHITE_CARPET.defaultBlockState(), 3);
						}
					}
					sz = sz + 1;
				}
				sx = sx + 1;
			}
		}
	}
}
