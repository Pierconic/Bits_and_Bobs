package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.ItemTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class PowerCoreCHARGEProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ItemStack nameditem = ItemStack.EMPTY;
		boolean found = false;
		String name = "";
		double damage = 0;
		double slotnumber = 0;
		double modifier = 0;
		found = false;
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip1 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip1) : -1) == 15) {
			modifier = 1;
		}
		slotnumber = 0;
		for (int index0 = 0; index0 < 3; index0++) {
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
					&& found == false) {
				found = true;
				if (nameditem.getItem() == SuperiorstructuresModItems.EMPTY_POWER_CELL.get()) {
					nameditem = new ItemStack(SuperiorstructuresModItems.POWER_CELL.get());
				} else if (nameditem.getItem() == SuperiorstructuresModItems.CHARGER.get()) {
					{
						final String _tagName = "charge";
						final double _tagValue = (nameditem.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") + 1);
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:ten_shots")))) {
					{
						final String _tagName = "charge";
						final double _tagValue = (10 + 3 * modifier);
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:five_shots")))) {
					{
						final String _tagName = "charge";
						final double _tagValue = (5 + 1 * modifier);
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:fifteen_shots")))) {
					{
						final String _tagName = "charge";
						final double _tagValue = (15 + 4 * modifier);
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:twenty_shots")))) {
					{
						final String _tagName = "charge";
						final double _tagValue = (20 + 5 * modifier);
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:twenty_five_shots")))) {
					{
						final String _tagName = "charge";
						final double _tagValue = (25 + 7 * modifier);
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:thirty_shots")))) {
					{
						final String _tagName = "charge";
						final double _tagValue = (30 + 9 * modifier);
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:forty_shots")))) {
					{
						final String _tagName = "charge";
						final double _tagValue = (40 + 12 * modifier);
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:sixty_shots")))) {
					{
						final String _tagName = "charge";
						final double _tagValue = (60 + 15 * modifier);
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.getItem() == SuperiorstructuresModItems.BOOSTER_UNPOWERED_BOOTS.get() || nameditem.getItem() == SuperiorstructuresModItems.BOOSTER_UNPOWERED_CHESTPLATE.get()) {
					{
						final String _tagName = "charge";
						final double _tagValue = (70 + 15 * modifier);
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.getItem() == SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_BOOTS.get() || nameditem.getItem() == SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_CHESTPLATE.get()) {
					{
						final String _tagName = "charge";
						final double _tagValue = (90 + 20 * modifier);
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.getItem() == SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_BOOTS.get() || nameditem.getItem() == SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_CHESTPLATE.get()) {
					{
						final String _tagName = "charge";
						final double _tagValue = (120 + 30 * modifier);
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.getItem() == SuperiorstructuresModItems.GAUNTLET.get()) {
					{
						final String _tagName = "charge";
						final double _tagValue = (120 + 30 * modifier);
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.getItem() == SuperiorstructuresModItems.PHASE_GAUNTLET.get()) {
					{
						final String _tagName = "charge";
						final double _tagValue = (120 + 30 * modifier);
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("charge", 0);
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (!world.isClientSide()) {
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockEntity _blockEntity = world.getBlockEntity(_bp);
					BlockState _bs = world.getBlockState(_bp);
					if (_blockEntity != null)
						_blockEntity.getPersistentData().putDouble("stored_experience", ((new Object() {
							public double getValue(LevelAccessor world, BlockPos pos, String tag) {
								BlockEntity blockEntity = world.getBlockEntity(pos);
								if (blockEntity != null)
									return blockEntity.getPersistentData().getDouble(tag);
								return -1;
							}
						}.getValue(world, BlockPos.containing(x, y, z), "stored_experience")) - 1));
					if (world instanceof Level _level)
						_level.sendBlockUpdated(_bp, _bs, _bs, 3);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("particle.soul_escape")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("particle.soul_escape")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:cell.charge")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:cell.charge")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x, y, z), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = nameditem.copy();
					_setstack.setCount(1);
					_itemHandlerModifiable.setStackInSlot((int) slotnumber, _setstack);
				}
			}
			slotnumber = slotnumber + 1;
		}
	}
}
