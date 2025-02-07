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
import net.minecraft.world.item.Items;
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

public class PyramidDecorProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
		double loot = 0;
		double rotation = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Math.random() < 0.6) {
				if (Math.random() < 0.25) {
					number = Mth.nextInt(RandomSource.create(), 1, 9);
					if (number == 1) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.POTTED_CACTUS.defaultBlockState(), 3);
					} else if (number == 2) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.POTTED_AZALEA.defaultBlockState(), 3);
					} else if (number == 3) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.POTTED_FLOWERING_AZALEA.defaultBlockState(), 3);
					} else if (number == 4) {
						world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.SMALL_GREEN_POT.get().defaultBlockState(), 3);
						{
							Direction _dir = Direction.getRandom(RandomSource.create());
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						loot = Mth.nextInt(RandomSource.create(), 1, 10);
						if (number == 4) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 5) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.YELLOW_DYE).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 6) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 7) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 8) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 9) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 10) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.PURPLE_DYE).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						}
					} else if (number == 5) {
						world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.TALL_GREEN_POT.get().defaultBlockState(), 3);
						{
							Direction _dir = Direction.getRandom(RandomSource.create());
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						loot = Mth.nextInt(RandomSource.create(), 1, 10);
						if (number == 4) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 5) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.YELLOW_DYE).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 6) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 7) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 8) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 9) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 10) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.PURPLE_DYE).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						}
					} else if (number == 6) {
						world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.LARGE_GREEN_POT.get().defaultBlockState(), 3);
						{
							Direction _dir = Direction.getRandom(RandomSource.create());
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						loot = Mth.nextInt(RandomSource.create(), 1, 10);
						if (number == 4) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 5) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.YELLOW_DYE).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 6) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 7) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 8) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 9) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 10) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.PURPLE_DYE).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						}
					} else if (number == 7) {
						if (rotation == 0) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ skeleton_skull[rotation=2]");
						} else if (rotation == 1) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ skeleton_skull[rotation=6]");
						} else if (rotation == 2) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ skeleton_skull[rotation=10]");
						} else if (rotation == 3) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ skeleton_skull[rotation=14]");
						}
					} else if (number == 8) {
						if (rotation == 0) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ creeper_head[rotation=2]");
						} else if (rotation == 1) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ creeper_head[rotation=6]");
						} else if (rotation == 2) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ creeper_head[rotation=10]");
						} else if (rotation == 3) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"setblock ~ ~ ~ creeper_head[rotation=14]");
						}
					} else if (number == 9) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.SOUL_LANTERN.defaultBlockState(), 3);
					}
				} else {
					number = Mth.nextInt(RandomSource.create(), 1, 5);
					if (number == 1) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"setblock ~ ~ ~ green_candle[candles=3,lit=false]");
					} else if (number == 2) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"setblock ~ ~ ~ green_candle[candles=2,lit=false]");
					} else if (number == 3) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"setblock ~ ~ ~ green_candle[candles=3,lit=false]");
					} else if (number == 4) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"setblock ~ ~ ~ green_candle[candles=4,lit=false]");
					} else if (number == 5) {
						world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.SMALL_POT.get().defaultBlockState(), 3);
						{
							Direction _dir = Direction.getRandom(RandomSource.create());
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						loot = Mth.nextInt(RandomSource.create(), 1, 10);
						if (number == 4) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 5) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.ORANGE_DYE).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 6) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 7) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 8) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 9) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 10) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						}
					} else if (number == 6) {
						world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.TALL_POT.get().defaultBlockState(), 3);
						{
							Direction _dir = Direction.getRandom(RandomSource.create());
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						loot = Mth.nextInt(RandomSource.create(), 1, 10);
						if (number == 4) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 5) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.ORANGE_DYE).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 6) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 7) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 8) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 9) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 10) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						}
					} else if (number == 7) {
						world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.LARGE_POT.get().defaultBlockState(), 3);
						{
							Direction _dir = Direction.getRandom(RandomSource.create());
							BlockPos _pos = BlockPos.containing(x, y, z);
							BlockState _bs = world.getBlockState(_pos);
							Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
							if (_property instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(_dir)) {
								world.setBlock(_pos, _bs.setValue(_dp, _dir), 3);
							} else {
								_property = _bs.getBlock().getStateDefinition().getProperty("axis");
								if (_property instanceof EnumProperty _ap && _ap.getPossibleValues().contains(_dir.getAxis()))
									world.setBlock(_pos, _bs.setValue(_ap, _dir.getAxis()), 3);
							}
						}
						loot = Mth.nextInt(RandomSource.create(), 1, 10);
						if (number == 4) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 5) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.ORANGE_DYE).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 6) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 7) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 8) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 9) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 10) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.WHITE_DYE).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						}
					} else if (number == 8) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.POTTED_DEAD_BUSH.defaultBlockState(), 3);
					} else if (number == 9) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.DECORATED_POT.defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
