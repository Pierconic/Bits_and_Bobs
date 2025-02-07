package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;

public class GenblockE2WreckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			sx = -8;
			for (int index0 = 0; index0 < 16; index0++) {
				sy = -8;
				for (int index1 = 0; index1 < 16; index1++) {
					sz = -8;
					for (int index2 = 0; index2 < 16; index2++) {
						number = Mth.nextInt(RandomSource.create(), 1, 10);
						if (world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz)) && number >= 1 && number <= 3
								&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.COBBLED_DEEPSLATE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DARK_OAK_PLANKS
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BIRCH_PLANKS
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STRIPPED_DARK_OAK_LOG)) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx + 1), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ vine[west=true]");
						} else if (world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz)) && number >= 4 && number <= 6
								&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.COBBLED_DEEPSLATE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DARK_OAK_PLANKS
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BIRCH_PLANKS
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STRIPPED_DARK_OAK_LOG)) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3(((x + sx) - 1), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ vine[east=true]");
						} else if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)) && number >= 7 && number <= 8
								&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.COBBLED_DEEPSLATE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DARK_OAK_PLANKS
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BIRCH_PLANKS
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STRIPPED_DARK_OAK_LOG)) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), ((z + sz) - 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ vine[south=true]");
						} else if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1)) && number >= 9 && number <= 10
								&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.COBBLED_DEEPSLATE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DARK_OAK_PLANKS
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BIRCH_PLANKS
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STRIPPED_DARK_OAK_LOG)) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz + 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ vine[north=true]");
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DEEPSLATE_BRICKS) {
							if (Math.random() < 0.15) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.CRACKED_DEEPSLATE_BRICKS.defaultBlockState(), 3);
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DEEPSLATE_TILES) {
							if (Math.random() < 0.15) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), 3);
							}
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable"))) && Math.random() < 0.6) {
							RuinousTransformationMossyProcedure.execute(world, x + sx, y + sy, z + sz);
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.LANTERN) {
							if (Math.random() < 0.2) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.CHAIN.defaultBlockState(), 3);
							}
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STONE_BRICKS) {
							if (Math.random() < 0.35) {
								if (Math.random() < 0.2) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.CRACKED_STONE_BRICKS.defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.MOSSY_STONE_BRICKS.defaultBlockState(), 3);
								}
							}
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.CUT_RED_SANDSTONE) {
							if (Math.random() < 0.1) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.RED_SANDSTONE.defaultBlockState(), 3);
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
