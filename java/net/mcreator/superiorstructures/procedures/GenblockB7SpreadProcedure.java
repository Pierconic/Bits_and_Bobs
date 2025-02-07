package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GenblockB7SpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			sx = -6;
			for (int index0 = 0; index0 < 12; index0++) {
				sy = -6;
				for (int index1 = 0; index1 < 12; index1++) {
					sz = -6;
					for (int index2 = 0; index2 < 12; index2++) {
						number = Mth.nextInt(RandomSource.create(), 1, 10);
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PODZOL && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.AIR) {
							if (number == 1) {
								world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.RED_MUSHROOM.defaultBlockState(), 3);
							} else if (number == 2) {
								world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.BROWN_MUSHROOM.defaultBlockState(), 3);
							} else if (number == 3) {
								world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.BLUE_ORCHID.defaultBlockState(), 3);
							} else if (number == 4) {
								world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AZURE_BLUET.defaultBlockState(), 3);
							} else if (number == 5 || number == 6 || number == 7) {
								world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.SHORT_GRASS.defaultBlockState(), 3);
							}
						}
						if (world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz)) && number >= 1 && number <= 3
								&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.OAK_PLANKS || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STRIPPED_OAK_LOG)) {
							if (Math.random() < 0.2) {
								if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(SuperiorstructuresModBlocks.SINGLE_BROWN_WALL_MUSHROOM.get().defaultBlockState(), Direction.EAST)), 3);
								} else {
									if (Math.random() < 0.5) {
										world.setBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(SuperiorstructuresModBlocks.DOUBLE_BROWN_WALL_MUSHROOM.get().defaultBlockState(), Direction.EAST)), 3);
									} else {
										world.setBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(SuperiorstructuresModBlocks.TRIPLE_BROWN_WALL_MUSHROOM.get().defaultBlockState(), Direction.EAST)), 3);
									}
								}
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx + 1), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ vine[west=true]");
							}
						} else if (world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz)) && number >= 4 && number <= 6
								&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.OAK_PLANKS || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STRIPPED_OAK_LOG)) {
							if (Math.random() < 0.2) {
								if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(SuperiorstructuresModBlocks.SINGLE_BROWN_WALL_MUSHROOM.get().defaultBlockState(), Direction.WEST)), 3);
								} else {
									if (Math.random() < 0.5) {
										world.setBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(SuperiorstructuresModBlocks.DOUBLE_BROWN_WALL_MUSHROOM.get().defaultBlockState(), Direction.WEST)), 3);
									} else {
										world.setBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(SuperiorstructuresModBlocks.TRIPLE_BROWN_WALL_MUSHROOM.get().defaultBlockState(), Direction.WEST)), 3);
									}
								}
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3(((x + sx) - 1), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ vine[east=true]");
							}
						} else if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)) && number >= 7 && number <= 8
								&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.OAK_PLANKS || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STRIPPED_OAK_LOG)) {
							if (Math.random() < 0.2) {
								if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(SuperiorstructuresModBlocks.SINGLE_BROWN_WALL_MUSHROOM.get().defaultBlockState(), Direction.NORTH)), 3);
								} else {
									if (Math.random() < 0.5) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(SuperiorstructuresModBlocks.DOUBLE_BROWN_WALL_MUSHROOM.get().defaultBlockState(), Direction.NORTH)), 3);
									} else {
										world.setBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(SuperiorstructuresModBlocks.TRIPLE_BROWN_WALL_MUSHROOM.get().defaultBlockState(), Direction.NORTH)), 3);
									}
								}
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), ((z + sz) - 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ vine[south=true]");
							}
						} else if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1)) && number >= 9 && number <= 10
								&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.OAK_PLANKS || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STRIPPED_OAK_LOG)) {
							if (Math.random() < 0.2) {
								if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(SuperiorstructuresModBlocks.SINGLE_BROWN_WALL_MUSHROOM.get().defaultBlockState(), Direction.SOUTH)), 3);
								} else {
									if (Math.random() < 0.5) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(SuperiorstructuresModBlocks.DOUBLE_BROWN_WALL_MUSHROOM.get().defaultBlockState(), Direction.SOUTH)), 3);
									} else {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(SuperiorstructuresModBlocks.TRIPLE_BROWN_WALL_MUSHROOM.get().defaultBlockState(), Direction.SOUTH)), 3);
									}
								}
							} else {
								if (world instanceof ServerLevel _level)
									_level.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz + 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
											"setblock ~ ~ ~ vine[north=true]");
							}
						}
						if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz)) && world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).isFaceSturdy(world, BlockPos.containing(x + sx, y + sy, z + sz), Direction.UP)
								&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.OAK_TRAPDOOR || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SPRUCE_PLANKS
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.OAK_SLAB || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.OAK_PLANKS
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SPRUCE_SLAB || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.OAK_STAIRS
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BOOKSHELF)) {
							if (Math.random() < 0.4) {
								world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.MOSS_CARPET.defaultBlockState(), 3);
							}
						}
						if (Math.random() < 0.7 && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.RED_MUSHROOM_VASE.get()) {
							if (Math.random() < 0.5 && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.RED_MUSHROOM_VASE.get()) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.BROWN_MUSHROOM_FLOWER_VASE.get().defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SMALL_VASE.get().defaultBlockState(), 3);
								if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
									ItemStack _setstack = new ItemStack(Blocks.BROWN_MUSHROOM).copy();
									_setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 1, 10));
									_itemHandlerModifiable.setStackInSlot(0, _setstack);
								}
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
