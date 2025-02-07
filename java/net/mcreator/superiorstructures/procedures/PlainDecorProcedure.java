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

public class PlainDecorProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double number = 0;
		double loot = 0;
		double rotation = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (Math.random() < 0.6) {
				if (Math.random() < 0.33) {
					number = Mth.nextInt(RandomSource.create(), 1, 9);
					if (number == 1) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.DECORATED_POT.defaultBlockState(), 3);
					} else if (number == 2) {
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
						loot = Mth.nextInt(RandomSource.create(), 1, 6);
						if (number == 3) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.WHEAT).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 4) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.CARROT).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 5) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.WHEAT_SEEDS).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 9));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 6) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 2) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.POTATO).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						}
					} else if (number == 3) {
						world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.LARGE_YELLOW_POT.get().defaultBlockState(), 3);
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
						loot = Mth.nextInt(RandomSource.create(), 1, 6);
						if (number == 3) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.WHEAT).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 4) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.CARROT).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 5) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.WHEAT_SEEDS).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 9));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 6) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 2) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.POTATO).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						}
					} else if (number == 4) {
						world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.TALL_YELLOW_POT.get().defaultBlockState(), 3);
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
						loot = Mth.nextInt(RandomSource.create(), 1, 6);
						if (number == 3) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.WHEAT).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 4) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.CARROT).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 5) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.WHEAT_SEEDS).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 9));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 6) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 2) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.POTATO).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						}
					} else if (number == 5) {
						world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.SMALL_YELLOW_POT.get().defaultBlockState(), 3);
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
						loot = Mth.nextInt(RandomSource.create(), 1, 6);
						if (number == 3) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.WHEAT).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 4) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.CARROT).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 5) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.WHEAT_SEEDS).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 9));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 6) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 2) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.POTATO).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						}
					} else if (number == 6) {
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
						loot = Mth.nextInt(RandomSource.create(), 1, 6);
						if (number == 3) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.WHEAT).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 4) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.CARROT).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 5) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.WHEAT_SEEDS).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 9));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 6) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						} else if (number == 2) {
							if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
								ItemStack _setstack = new ItemStack(Items.POTATO).copy();
								_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 4));
								_itemHandlerModifiable.setStackInSlot(0, _setstack);
							}
						}
					} else if (number == 7) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.CAKE.defaultBlockState(), 3);
					} else if (number == 8) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.POTTED_AZURE_BLUET.defaultBlockState(), 3);
					} else if (number == 9) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.POTTED_POPPY.defaultBlockState(), 3);
					}
				} else {
					number = Mth.nextInt(RandomSource.create(), 1, 5);
					if (number == 1) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"setblock ~ ~ ~ yellow_candle[candles=3,lit=true]");
					} else if (number == 2) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"setblock ~ ~ ~ yellow_candle[candles=2,lit=true]");
					} else if (number == 3) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"setblock ~ ~ ~ yellow_candle[candles=3,lit=true]");
					} else if (number == 4) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"setblock ~ ~ ~ yellow_candle[candles=4,lit=true]");
					} else if (number == 5) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"setblock ~ ~ ~ blue_candle[candles=2,lit=true]");
					} else if (number == 6) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"setblock ~ ~ ~ blue_candle[candles=3,lit=true]");
					} else if (number == 7) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"setblock ~ ~ ~ blue_candle[candles=4,lit=true]");
					} else if (number == 8) {
						if (Math.random() < 0.6) {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.POTTED_CORNFLOWER.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x, y, z), Blocks.POTTED_DANDELION.defaultBlockState(), 3);
						}
					} else if (number == 9) {
						world.setBlock(BlockPos.containing(x, y, z), Blocks.LANTERN.defaultBlockState(), 3);
					}
				}
			}
		}
	}
}
