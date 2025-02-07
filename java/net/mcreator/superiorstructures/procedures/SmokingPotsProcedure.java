package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SmokingPotsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double rando = 0;
		double repeat = 0;
		String sherd_1 = "";
		String sherd_2 = "";
		String sherd_3 = "";
		String sherd_4 = "";
		String current_sherd = "";
		String type = "";
		if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
			type = "nether";
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("minecraft:is_ocean")))) {
			type = "ocean";
		} else if (y < 45) {
			type = "cave";
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
			type = "dune";
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:white_biomes")))) {
			type = "snow";
		} else if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:mossy")))) {
			type = "moss";
		} else {
			type = "plain";
		}
		repeat = 1;
		for (int index0 = 0; index0 < 4; index0++) {
			rando = Mth.nextInt(RandomSource.create(), 1, 7);
			if (rando == 1) {
				if ((type).equals("ocean")) {
					current_sherd = "minecraft:prize_pottery_sherd";
				} else if ((type).equals("cave")) {
					current_sherd = "minecraft:prize_pottery_sherd";
				} else if ((type).equals("snow")) {
					current_sherd = "minecraft:burn_pottery_sherd";
				} else if ((type).equals("moss")) {
					current_sherd = "minecraft:friend_pottery_sherd";
				} else if ((type).equals("dune")) {
					current_sherd = "minecraft:danger_pottery_sherd";
				} else if ((type).equals("nether")) {
					current_sherd = "minecraft:archer_pottery_sherd";
				} else {
					current_sherd = "minecraft:snort_pottery_sherd";
				}
			} else if (rando == 2) {
				if ((type).equals("ocean")) {
					current_sherd = "minecraft:plenty_pottery_sherd";
				} else if ((type).equals("cave")) {
					current_sherd = "minecraft:miner_pottery_sherd";
				} else if ((type).equals("snow")) {
					current_sherd = "minecraft:skull_pottery_sherd";
				} else if ((type).equals("moss")) {
					current_sherd = "minecraft:snort_pottery_sherd";
				} else if ((type).equals("dune")) {
					current_sherd = "minecraft:burn_pottery_sherd";
				} else if ((type).equals("nether")) {
					current_sherd = "minecraft:blade_pottery_sherd";
				} else {
					current_sherd = "minecraft:plenty_pottery_sherd";
				}
			} else if (rando == 3) {
				if ((type).equals("ocean")) {
					current_sherd = "minecraft:explorer_pottery_sherd";
				} else if ((type).equals("cave")) {
					current_sherd = "minecraft:skull_pottery_sherd";
				} else if ((type).equals("snow")) {
					current_sherd = "minecraft:angler_pottery_sherd";
				} else if ((type).equals("moss")) {
					current_sherd = "minecraft:miner_pottery_sherd";
				} else if ((type).equals("dune")) {
					current_sherd = "minecraft:danger_pottery_sherd";
				} else if ((type).equals("nether")) {
					current_sherd = "minecraft:plenty_pottery_sherd";
				} else {
					current_sherd = "minecraft:howl_pottery_sherd";
				}
			} else if (rando == 4) {
				if ((type).equals("ocean")) {
					current_sherd = "minecraft:angler_pottery_sherd";
				} else if ((type).equals("cave")) {
					current_sherd = "minecraft:arms_up_pottery_sherd";
				} else if ((type).equals("snow")) {
					current_sherd = "minecraft:miner_pottery_sherd";
				} else if ((type).equals("moss")) {
					current_sherd = "minecraft:heart_pottery_sherd";
				} else if ((type).equals("dune")) {
					current_sherd = "minecraft:plenty_pottery_sherd";
				} else if ((type).equals("nether")) {
					current_sherd = "minecraft:burn_pottery_sherd";
				} else {
					current_sherd = "minecraft:heart_pottery_sherd";
				}
			} else {
				current_sherd = "minecraft:brick";
			}
			if (repeat == 1) {
				sherd_1 = current_sherd;
			} else if (repeat == 2) {
				sherd_2 = current_sherd;
			} else if (repeat == 3) {
				sherd_3 = current_sherd;
			} else if (repeat == 4) {
				sherd_4 = current_sherd;
			}
			repeat = repeat + 1;
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					(((("data merge block ~ ~ ~ {sherds:[\"$1\",\"$2\",\"$3\",\"$4\",]}".replace("$4", sherd_4)).replace("$3", sherd_3)).replace("$2", sherd_2)).replace("$1", sherd_1)));
	}
}
