package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

import java.util.ArrayList;

public class GenblockO1InstigateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world.getBiome(BlockPos.containing(x, 30, z - 48)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("minecraft:is_ocean")))
					&& world.getBiome(BlockPos.containing(x + 48, 30, z - 48)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("minecraft:is_ocean")))
					&& world.getBiome(BlockPos.containing(x + 48, 30, z + 96)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("minecraft:is_ocean")))
					&& world.getBiome(BlockPos.containing(x, 30, z + 96)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("minecraft:is_ocean")))) {
				if (MonumentCheckProcedure.execute(world, x, z) == true) {
					if (VillageScannerProcedure.execute(world, x, z) == false) {
						GenblockO1AscensionProcedure.execute(world, x, z);
					} else {
						if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.DEBUG_MODE)) {
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								if (entityiterator instanceof Player _player && !_player.level().isClientSide())
									_player.displayClientMessage(Component.literal("Scanner failed!"), false);
							}
						}
					}
				} else {
					if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.DEBUG_MODE)) {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal("Exceeds tolerance!"), false);
						}
					}
				}
			} else {
				if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.DEBUG_MODE)) {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (entityiterator instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal("Biomes inadequate!"), false);
					}
				}
			}
		}
	}
}
