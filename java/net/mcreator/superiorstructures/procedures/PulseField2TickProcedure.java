package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModMobEffects;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

import java.util.List;
import java.util.Comparator;

public class PulseField2TickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double theta = 0;
		double magnitude = 0;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:lightningcharge")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:lightningcharge")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (!entity.level().isClientSide())
				entity.discard();
		} else {
			{
				final Vec3 _center = new Vec3((x + 0.5), (y + 0.5), (z + 0.5));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(9 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(SuperiorstructuresModMobEffects.SHOCK, 120, 0, false, false));
					magnitude = 0.14;
					theta = Math.atan(Math.abs(entity.getX() - entityiterator.getX()) / Math.abs(entity.getZ() - entityiterator.getZ()));
					sx = magnitude * Math.sin(theta);
					sz = magnitude * Math.cos(theta);
					if (entityiterator.getX() < entity.getX()) {
						sx = sx * (-1);
					}
					if (entityiterator.getZ() < entity.getZ()) {
						sz = sz * (-1);
					}
					if (world.getLevelData().isThundering() && !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.PULSING_CORE.get())) {
						sy = 0.35;
					} else {
						sy = 0.25;
					}
					if (entityiterator.isShiftKeyDown() || entityiterator instanceof LivingEntity _livEnt16 && _livEnt16.isBlocking()) {
						sx = sx * 0.65;
						sy = sy * 0.65;
						sz = sz * 0.65;
					}
					if ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == Items.IRON_BOOTS
							|| (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == Items.IRON_LEGGINGS
							|| (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == Items.IRON_CHESTPLATE) {
						sx = sx * 0.7;
						sy = sy * 0.7;
						sz = sz * 0.7;
					}
					if ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == Items.NETHERITE_BOOTS
							|| (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == Items.NETHERITE_LEGGINGS
							|| (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == Items.NETHERITE_CHESTPLATE) {
						sx = sx * (-1);
						sy = sy * (-1);
						sz = sz * (-1);
					}
					if ((entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
							.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.SOUL_SPEED)) != 0) {
						sy = sy * 1.3;
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("particle.soul_escape")), SoundSource.NEUTRAL, 4, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("particle.soul_escape")), SoundSource.NEUTRAL, 4, 1, false);
							}
						}
					}
					entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x() + sx), (entityiterator.getDeltaMovement().y() + sy), (entityiterator.getDeltaMovement().z() + sz)));
				}
			}
		}
	}
}
