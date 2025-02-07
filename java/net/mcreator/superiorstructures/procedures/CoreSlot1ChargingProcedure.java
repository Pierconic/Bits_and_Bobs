package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class CoreSlot1ChargingProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		ItemStack nameditem = ItemStack.EMPTY;
		boolean found = false;
		double modifier = 0;
		double slotnumber = 0;
		slotnumber = 0;
		nameditem = (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), (int) slotnumber));
		if ((SuperiorstructuresModItems.EMPTY_POWER_CELL.get() == (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), (int) slotnumber)).getItem() || SuperiorstructuresModItems.CHARGER.get() == (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), (int) slotnumber)).getItem() && nameditem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") < 40 || (new Object() {
			public ItemStack getItemStack(LevelAccessor world, BlockPos pos, int slotid) {
				if (world instanceof ILevelExtension _ext) {
					IItemHandler _itemHandler = _ext.getCapability(Capabilities.ItemHandler.BLOCK, pos, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(slotid).copy();
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack(world, BlockPos.containing(x, y, z), (int) slotnumber)).is(ItemTags.create(ResourceLocation.parse("forge:requires_power")))
				&& (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:ten_shots"))) && nameditem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") < 10
						|| nameditem.is(ItemTags.create(ResourceLocation.parse("forge:five_shots"))) && nameditem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") < 5
						|| nameditem.is(ItemTags.create(ResourceLocation.parse("forge:fifteen_shots"))) && nameditem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") < 15
						|| nameditem.is(ItemTags.create(ResourceLocation.parse("forge:twenty_shots"))) && nameditem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") < 20
						|| nameditem.is(ItemTags.create(ResourceLocation.parse("forge:twenty_five_shots"))) && nameditem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") < 25
						|| nameditem.is(ItemTags.create(ResourceLocation.parse("forge:thirty_shots"))) && nameditem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") < 30
						|| nameditem.is(ItemTags.create(ResourceLocation.parse("forge:forty_shots"))) && nameditem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") < 40
						|| nameditem.is(ItemTags.create(ResourceLocation.parse("forge:sixty_shots"))) && nameditem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") < 60
						|| (nameditem.getItem() == SuperiorstructuresModItems.BOOSTER_UNPOWERED_BOOTS.get() || nameditem.getItem() == SuperiorstructuresModItems.BOOSTER_UNPOWERED_CHESTPLATE.get())
								&& nameditem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") < 70
						|| (nameditem.getItem() == SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_BOOTS.get() || nameditem.getItem() == SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_CHESTPLATE.get())
								&& nameditem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") < 90
						|| (nameditem.getItem() == SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_BOOTS.get() || nameditem.getItem() == SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_CHESTPLATE.get()
								|| nameditem.getItem() == SuperiorstructuresModItems.GAUNTLET.get()) && nameditem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") < 120
						|| nameditem.getItem() == SuperiorstructuresModItems.PHASE_GAUNTLET.get() && nameditem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") < 140))
				&& (new Object() {
					public double getValue(LevelAccessor world, BlockPos pos, String tag) {
						BlockEntity blockEntity = world.getBlockEntity(pos);
						if (blockEntity != null)
							return blockEntity.getPersistentData().getDouble(tag);
						return -1;
					}
				}.getValue(world, BlockPos.containing(x, y, z), "stored_experience") > 0 && ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip38
						? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip38)
						: -1) != 15 || new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "stored_experience") > 1 && ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip41
								? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip41)
								: -1) == 15)) {
			return true;
		}
		return false;
	}
}
