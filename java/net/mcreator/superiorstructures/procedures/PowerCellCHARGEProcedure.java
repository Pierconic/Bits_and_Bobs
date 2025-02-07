package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class PowerCellCHARGEProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		ItemStack nameditem = ItemStack.EMPTY;
		boolean found = false;
		String name = "";
		double slotnumber = 0;
		double damage = 0;
		found = false;
		slotnumber = 0;
		for (int index0 = 0; index0 < 35; index0++) {
			if ((new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
						return _modHandler.getStackInSlot(sltid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) slotnumber, entity)).is(ItemTags.create(ResourceLocation.parse("forge:requires_power"))) && (new Object() {
				public ItemStack getItemStack(int sltid, Entity entity) {
					if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
						return _modHandler.getStackInSlot(sltid).copy();
					}
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) slotnumber, entity)).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") == 0 && found == false) {
				found = true;
				nameditem = (new Object() {
					public ItemStack getItemStack(int sltid, Entity entity) {
						if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
							return _modHandler.getStackInSlot(sltid).copy();
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) slotnumber, entity));
				if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:ten_shots")))) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(nameditem.getItem(), 30);
					{
						final String _tagName = "charge";
						final double _tagValue = 10;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:five_shots")))) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(nameditem.getItem(), 60);
					{
						final String _tagName = "charge";
						final double _tagValue = 5;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:fifteen_shots")))) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(nameditem.getItem(), 40);
					{
						final String _tagName = "charge";
						final double _tagValue = 15;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:twenty_shots")))) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(nameditem.getItem(), 50);
					{
						final String _tagName = "charge";
						final double _tagValue = 20;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:twenty_five_shots")))) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(nameditem.getItem(), 60);
					{
						final String _tagName = "charge";
						final double _tagValue = 25;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:thirty_shots")))) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(nameditem.getItem(), 70);
					{
						final String _tagName = "charge";
						final double _tagValue = 30;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:forty_shots")))) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(nameditem.getItem(), 80);
					{
						final String _tagName = "charge";
						final double _tagValue = 40;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.is(ItemTags.create(ResourceLocation.parse("forge:sixty_shots")))) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(nameditem.getItem(), 120);
					{
						final String _tagName = "charge";
						final double _tagValue = 60;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.getItem() == SuperiorstructuresModItems.GAUNTLET.get()) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(nameditem.getItem(), 60);
					{
						final String _tagName = "charge";
						final double _tagValue = 120;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				} else if (nameditem.getItem() == SuperiorstructuresModItems.PHASE_GAUNTLET.get()) {
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown(nameditem.getItem(), 80);
					{
						final String _tagName = "charge";
						final double _tagValue = 140;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
				}
				if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
					ItemStack _setstack = nameditem.copy();
					_setstack.setCount(1);
					_modHandler.setStackInSlot((int) slotnumber, _setstack);
				}
			} else if (found == false) {
				if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.BOOSTER_UNPOWERED_BOOTS.get()) {
					found = true;
					nameditem = new ItemStack(SuperiorstructuresModItems.BOOSTER_BOOTS.get());
					if (world instanceof ServerLevel _level) {
						nameditem.hurtAndBreak((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getDamageValue(), _level, null, _stkprov -> {
						});
					}
					{
						final String _tagName = "charge";
						final double _tagValue = 70;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
					name = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getDisplayName().getString();
					if (!(((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getDisplayName().getString())
							.equals("[" + Component.translatable("item.superiorstructures.booster_unpowered_boots").getString() + "]"))) {
						nameditem.set(DataComponents.CUSTOM_NAME, Component.literal(((name.replace("[", "")).replace("]", ""))));
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, nameditem);
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, nameditem);
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem(), 60);
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_BOOTS.get()) {
					found = true;
					nameditem = new ItemStack(SuperiorstructuresModItems.BOOSTER_2_BOOTS.get());
					if (world instanceof ServerLevel _level) {
						nameditem.hurtAndBreak((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getDamageValue(), _level, null, _stkprov -> {
						});
					}
					{
						final String _tagName = "charge";
						final double _tagValue = 90;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
					name = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getDisplayName().getString();
					if (!(((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getDisplayName().getString())
							.equals("[" + Component.translatable("item.superiorstructures.booster_2_unpowered_boots").getString() + "]"))) {
						nameditem.set(DataComponents.CUSTOM_NAME, Component.literal(((name.replace("[", "")).replace("]", ""))));
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, nameditem);
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, nameditem);
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem(), 60);
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_BOOTS.get()) {
					found = true;
					nameditem = new ItemStack(SuperiorstructuresModItems.BOOSTER_3_BOOTS.get());
					if (world instanceof ServerLevel _level) {
						nameditem.hurtAndBreak((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getDamageValue(), _level, null, _stkprov -> {
						});
					}
					{
						final String _tagName = "charge";
						final double _tagValue = 120;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
					name = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getDisplayName().getString();
					if (!(((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getDisplayName().getString())
							.equals("[" + Component.translatable("item.superiorstructures.booster_3_unpowered_boots").getString() + "]"))) {
						nameditem.set(DataComponents.CUSTOM_NAME, Component.literal(((name.replace("[", "")).replace("]", ""))));
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, nameditem);
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, nameditem);
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem(), 60);
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.BOOSTER_UNPOWERED_CHESTPLATE.get()) {
					found = true;
					nameditem = new ItemStack(SuperiorstructuresModItems.BOOSTER_CHESTPLATE.get());
					if (world instanceof ServerLevel _level) {
						nameditem.hurtAndBreak((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue(), _level, null, _stkprov -> {
						});
					}
					{
						final String _tagName = "charge";
						final double _tagValue = 70;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
					name = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDisplayName().getString();
					if (!(((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDisplayName().getString())
							.equals("[" + Component.translatable("item.superiorstructures.booster_unpowered_chestplate").getString() + "]"))) {
						nameditem.set(DataComponents.CUSTOM_NAME, Component.literal(((name.replace("[", "")).replace("]", ""))));
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, nameditem);
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, nameditem);
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem(), 60);
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_CHESTPLATE.get()) {
					found = true;
					nameditem = new ItemStack(SuperiorstructuresModItems.BOOSTER_2_CHESTPLATE.get());
					if (world instanceof ServerLevel _level) {
						nameditem.hurtAndBreak((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue(), _level, null, _stkprov -> {
						});
					}
					{
						final String _tagName = "charge";
						final double _tagValue = 90;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
					name = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDisplayName().getString();
					if (!(((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDisplayName().getString())
							.equals("[" + Component.translatable("item.superiorstructures.booster_2_unpowered_chestplate").getString() + "]"))) {
						nameditem.set(DataComponents.CUSTOM_NAME, Component.literal(((name.replace("[", "")).replace("]", ""))));
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, nameditem);
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, nameditem);
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem(), 60);
				} else if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_CHESTPLATE.get()) {
					found = true;
					nameditem = new ItemStack(SuperiorstructuresModItems.BOOSTER_3_CHESTPLATE.get());
					if (world instanceof ServerLevel _level) {
						nameditem.hurtAndBreak((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDamageValue(), _level, null, _stkprov -> {
						});
					}
					{
						final String _tagName = "charge";
						final double _tagValue = 120;
						CustomData.update(DataComponents.CUSTOM_DATA, nameditem, tag -> tag.putDouble(_tagName, _tagValue));
					}
					name = (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDisplayName().getString();
					if (!(((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getDisplayName().getString())
							.equals("[" + Component.translatable("item.superiorstructures.booster_3_unpowered_chestplate").getString() + "]"))) {
						nameditem.set(DataComponents.CUSTOM_NAME, Component.literal(((name.replace("[", "")).replace("]", ""))));
					}
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, nameditem);
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, nameditem);
						}
					}
					if (entity instanceof Player _player)
						_player.getCooldowns().addCooldown((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem(), 60);
				}
			}
			slotnumber = slotnumber + 1;
		}
	}
}
