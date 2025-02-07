package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;
import net.mcreator.superiorstructures.entity.ThrownChakramEntity;

public class ChakramConvertProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack return_chakram = ItemStack.EMPTY;
		return_chakram = new ItemStack(SuperiorstructuresModItems.CHAKRAM.get());
		if (world instanceof ServerLevel _level) {
			return_chakram.hurtAndBreak((int) ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Damage) : 0) + 1), _level, null, _stkprov -> {
			});
		}
		if (!((entity instanceof ThrownChakramEntity _datEntS ? _datEntS.getEntityData().get(ThrownChakramEntity.DATA_Name) : "").equals(BuiltInRegistries.ITEM.getKey(SuperiorstructuresModItems.CHAKRAM.get()).toString()))) {
			return_chakram.set(DataComponents.CUSTOM_NAME, Component.literal((entity instanceof ThrownChakramEntity _datEntS ? _datEntS.getEntityData().get(ThrownChakramEntity.DATA_Name) : "")));
		}
		if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Loyalty) : 0) > 0) {
			return_chakram.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.LOYALTY),
					(int) (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Loyalty) : 0));
		}
		if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Richochet) : 0) > 0) {
			return_chakram.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("superiorstructures:richochet"))),
					(int) (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Richochet) : 0));
		}
		if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Power) : 0) > 0) {
			return_chakram.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.POWER),
					(int) (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Power) : 0));
		}
		if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Punch) : 0) > 0) {
			return_chakram.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PUNCH),
					(int) (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Punch) : 0));
		}
		if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Sharpness) : 0) > 0) {
			return_chakram.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SHARPNESS),
					(int) (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Sharpness) : 0));
		}
		if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Unbreaking) : 0) > 0) {
			return_chakram.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.UNBREAKING),
					(int) (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Unbreaking) : 0));
		}
		if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Firestorm) : 0) > 0) {
			return_chakram.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("superiorstructures:firestorm"))),
					(int) (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Firestorm) : 0));
		}
		if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Whirlwind) : 0) > 0) {
			return_chakram.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("superiorstructures:whirlwind"))),
					(int) (entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Whirlwind) : 0));
		}
		if (entity instanceof ThrownChakramEntity _datEntL30 && _datEntL30.getEntityData().get(ThrownChakramEntity.DATA_Flame)) {
			return_chakram.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.FLAME), 1);
		}
		if (entity instanceof ThrownChakramEntity _datEntL32 && _datEntL32.getEntityData().get(ThrownChakramEntity.DATA_Mending)) {
			return_chakram.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.MENDING), 1);
		}
		if (!entity.level().isClientSide())
			entity.discard();
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.netherite_block.break")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.netherite_block.break")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (world instanceof ServerLevel _level) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, return_chakram);
			entityToSpawn.setPickUpDelay(1);
			_level.addFreshEntity(entityToSpawn);
		}
	}
}
