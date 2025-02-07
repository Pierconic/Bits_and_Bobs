package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class PotteryFillProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		BlockState selected_pot = Blocks.AIR.defaultBlockState();
		selected_pot = (world.getBlockState(BlockPos.containing(x, y, z)));
		if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_RED_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_RED_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_RED_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.GILDED_MACHINERY.get()).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.FIRE_CHARGE).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.IRON_NUGGET).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.WHEAT).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_ORANGE_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_ORANGE_POT.get()
				|| selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_ORANGE_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.GILDED_MACHINERY.get()).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Blocks.RED_SAND).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_YELLOW_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_YELLOW_POT.get()
				|| selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_YELLOW_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.BROKEN_MACHINERY.get()).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.BREAD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.WHEAT_SEEDS).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_LIME_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_LIME_POT.get()
				|| selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_LIME_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.OLD_MACHINERY.get()).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.REDSTONE).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.RAW_COPPER).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Blocks.MOSS_BLOCK).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_GREEN_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_GREEN_POT.get()
				|| selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_GREEN_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.GOLD_INGOT).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Blocks.SAND).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_BLUE_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_BLUE_POT.get()
				|| selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_BLUE_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.PRISMARINE_CRYSTALS).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.PRISMARINE_SHARD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.RAW_COPPER).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Blocks.KELP).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_CYAN_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_CYAN_POT.get()
				|| selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_CYAN_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.ANCIENT_MACHINERY.get()).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.AMETHYST_SHARD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Blocks.SCULK).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_PURPLE_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_PURPLE_POT.get()
				|| selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_PURPLE_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.STRANGE_MACHINERY.get()).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.SHULKER_SHELL).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.POPPED_CHORUS_FRUIT).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.IRON_NUGGET).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_PINK_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_PINK_POT.get()
				|| selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_PINK_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Blocks.WARPED_FUNGUS).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Blocks.CRIMSON_FUNGUS).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Blocks.BROWN_MUSHROOM).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Blocks.RED_MUSHROOM).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_MAGENTA_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_MAGENTA_POT.get()
				|| selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_MAGENTA_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.OLD_MACHINERY.get()).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.COOKED_PORKCHOP).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Blocks.SOUL_SAND).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_LIGHT_BLUE_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_LIGHT_BLUE_POT.get()
				|| selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_LIGHT_BLUE_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.OLD_MACHINERY.get()).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.PRISMARINE_CRYSTALS).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.PRISMARINE_SHARD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_BROWN_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_BROWN_POT.get()
				|| selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_BROWN_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.DIAMOND).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.LIGHTNING_SHARD.get()).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.RAW_COPPER).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.WHEAT_SEEDS).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_WHITE_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_WHITE_POT.get()
				|| selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_WHITE_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.EXPERIENCE_BOTTLE).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.NETHER_WART).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.GLASS_BOTTLE).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.SPIDER_EYE).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.ROTTEN_FLESH).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_LIGHT_GRAY_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_LIGHT_GRAY_POT.get()
				|| selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_LIGHT_GRAY_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.OLD_MACHINERY.get()).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.RAW_IRON).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.RAW_COPPER).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.COAL).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if (selected_pot.getBlock() == SuperiorstructuresModBlocks.SMALL_DARK_GRAY_POT.get() || selected_pot.getBlock() == SuperiorstructuresModBlocks.TALL_DARK_GRAY_POT.get()
				|| selected_pot.getBlock() == SuperiorstructuresModBlocks.LARGE_DARK_GRAY_POT.get()) {
			if (Math.random() < 0.05) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.GILDED_MACHINERY.get()).copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.1) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 3));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.2) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 6));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else if (Math.random() < 0.4) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.QUARTZ).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			} else {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.LEATHER).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 5, 8));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		}
	}
}
