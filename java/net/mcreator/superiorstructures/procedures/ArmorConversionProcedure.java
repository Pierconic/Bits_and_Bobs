package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;

public class ArmorConversionProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ItemStack NamedItem = ItemStack.EMPTY;
		String ItemName = "";
		double damage = 0;
		if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") == 0) {
			damage = itemstack.getDamageValue();
			if (itemstack.getItem() == SuperiorstructuresModItems.BOOSTER_CHESTPLATE.get()) {
				if (!(itemstack.getDisplayName().getString()).equals("[" + Component.translatable("item.superiorstructures.booster_chestplate").getString() + "]")) {
					ItemName = itemstack.getDisplayName().getString();
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).shrink(1);
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(SuperiorstructuresModItems.BOOSTER_UNPOWERED_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SuperiorstructuresModItems.BOOSTER_UNPOWERED_CHESTPLATE.get()));
						}
					}
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME, Component.literal(((ItemName.replace("[", "")).replace("]", ""))));
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).hurtAndBreak((int) damage, _level, null, _stkprov -> {
						});
					}
				} else {
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).shrink(1);
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(SuperiorstructuresModItems.BOOSTER_UNPOWERED_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SuperiorstructuresModItems.BOOSTER_UNPOWERED_CHESTPLATE.get()));
						}
					}
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).hurtAndBreak((int) damage, _level, null, _stkprov -> {
						});
					}
				}
			} else if (itemstack.getItem() == SuperiorstructuresModItems.BOOSTER_BOOTS.get()) {
				if (!(itemstack.getDisplayName().getString()).equals("[" + Component.translatable("item.superiorstructures.booster_boots").getString() + "]")) {
					ItemName = itemstack.getDisplayName().getString();
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).shrink(1);
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(SuperiorstructuresModItems.BOOSTER_UNPOWERED_BOOTS.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SuperiorstructuresModItems.BOOSTER_UNPOWERED_BOOTS.get()));
						}
					}
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME, Component.literal(((ItemName.replace("[", "")).replace("]", ""))));
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).hurtAndBreak((int) damage, _level, null, _stkprov -> {
						});
					}
				} else {
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).shrink(1);
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(SuperiorstructuresModItems.BOOSTER_UNPOWERED_BOOTS.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SuperiorstructuresModItems.BOOSTER_UNPOWERED_BOOTS.get()));
						}
					}
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).hurtAndBreak((int) damage, _level, null, _stkprov -> {
						});
					}
				}
			} else if (itemstack.getItem() == SuperiorstructuresModItems.BOOSTER_2_CHESTPLATE.get()) {
				if (!(itemstack.getDisplayName().getString()).equals("[" + Component.translatable("item.superiorstructures.booster_2_chestplate").getString() + "]")) {
					ItemName = itemstack.getDisplayName().getString();
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).shrink(1);
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_CHESTPLATE.get()));
						}
					}
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME, Component.literal(((ItemName.replace("[", "")).replace("]", ""))));
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).hurtAndBreak((int) damage, _level, null, _stkprov -> {
						});
					}
				} else {
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).shrink(1);
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_CHESTPLATE.get()));
						}
					}
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).hurtAndBreak((int) damage, _level, null, _stkprov -> {
						});
					}
				}
			} else if (itemstack.getItem() == SuperiorstructuresModItems.BOOSTER_2_BOOTS.get()) {
				if (!(itemstack.getDisplayName().getString()).equals("[" + Component.translatable("item.superiorstructures.booster_2_boots").getString() + "]")) {
					ItemName = itemstack.getDisplayName().getString();
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).shrink(1);
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_BOOTS.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_BOOTS.get()));
						}
					}
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME, Component.literal(((ItemName.replace("[", "")).replace("]", ""))));
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).hurtAndBreak((int) damage, _level, null, _stkprov -> {
						});
					}
				} else {
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).shrink(1);
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_BOOTS.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SuperiorstructuresModItems.BOOSTER_2_UNPOWERED_BOOTS.get()));
						}
					}
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).hurtAndBreak((int) damage, _level, null, _stkprov -> {
						});
					}
				}
			} else if (itemstack.getItem() == SuperiorstructuresModItems.BOOSTER_3_CHESTPLATE.get()) {
				if (!(itemstack.getDisplayName().getString()).equals("[" + Component.translatable("item.superiorstructures.booster_3_chestplate").getString() + "]")) {
					ItemName = itemstack.getDisplayName().getString();
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).shrink(1);
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_CHESTPLATE.get()));
						}
					}
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME, Component.literal(((ItemName.replace("[", "")).replace("]", ""))));
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).hurtAndBreak((int) damage, _level, null, _stkprov -> {
						});
					}
				} else {
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).shrink(1);
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(2, new ItemStack(SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_CHESTPLATE.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_CHESTPLATE.get()));
						}
					}
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).hurtAndBreak((int) damage, _level, null, _stkprov -> {
						});
					}
				}
			} else if (itemstack.getItem() == SuperiorstructuresModItems.BOOSTER_3_BOOTS.get()) {
				if (!(itemstack.getDisplayName().getString()).equals("[" + Component.translatable("item.superiorstructures.booster_3_boots").getString() + "]")) {
					ItemName = itemstack.getDisplayName().getString();
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).shrink(1);
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_BOOTS.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_BOOTS.get()));
						}
					}
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).set(DataComponents.CUSTOM_NAME, Component.literal(((ItemName.replace("[", "")).replace("]", ""))));
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).hurtAndBreak((int) damage, _level, null, _stkprov -> {
						});
					}
				} else {
					(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).shrink(1);
					{
						Entity _entity = entity;
						if (_entity instanceof Player _player) {
							_player.getInventory().armor.set(0, new ItemStack(SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_BOOTS.get()));
							_player.getInventory().setChanged();
						} else if (_entity instanceof LivingEntity _living) {
							_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SuperiorstructuresModItems.BOOSTER_3_UNPOWERED_BOOTS.get()));
						}
					}
					if (world instanceof ServerLevel _level) {
						(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).hurtAndBreak((int) damage, _level, null, _stkprov -> {
						});
					}
				}
			}
		}
	}
}
