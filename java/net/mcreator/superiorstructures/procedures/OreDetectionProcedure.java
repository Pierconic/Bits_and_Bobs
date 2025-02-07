package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;
import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;

import java.util.List;
import java.util.Comparator;

public class OreDetectionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		boolean found = false;
		boolean close = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double bx = 0;
		double by = 0;
		double bz = 0;
		String tag2 = "";
		String tag1 = "";
		if (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") > 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FIREWORK, x, (y + 1.2), z, 3, 0.05, 0.05, 0.05, 0.05);
			if (itemstack.getItem() == SuperiorstructuresModItems.COPPER_ORE_DETECTOR.get()) {
				tag1 = "forge:copper_detectable";
				tag2 = "forge:copper_glowable";
			} else if (itemstack.getItem() == SuperiorstructuresModItems.IRON_ORE_DETECTOR.get()) {
				tag1 = "forge:iron_detectable";
				tag2 = "forge:iron_glowable";
			} else if (itemstack.getItem() == SuperiorstructuresModItems.GOLD_ORE_DETECTOR.get()) {
				tag1 = "forge:gold_detectable";
				tag2 = "forge:gold_glowable";
			} else if (itemstack.getItem() == SuperiorstructuresModItems.QUARTZ_ORE_DETECTOR.get()) {
				tag1 = "forge:quartz_detectable";
				tag2 = "forge:quartz_glowable";
			} else if (itemstack.getItem() == SuperiorstructuresModItems.EMERALD_ORE_DETECTOR.get()) {
				tag1 = "forge:emerald_detectable";
				tag2 = "forge:emerald_glowable";
			} else if (itemstack.getItem() == SuperiorstructuresModItems.LAPIS_ORE_DETECTOR.get()) {
				tag1 = "forge:lapis_detectable";
				tag2 = "forge:lapis_glowable";
			} else if (itemstack.getItem() == SuperiorstructuresModItems.REDSTONE_ORE_DETECTOR.get()) {
				tag1 = "forge:redstone_detectable";
				tag2 = "forge:redstone_glowable";
			} else if (itemstack.getItem() == SuperiorstructuresModItems.DIAMOND_ORE_DETECTOR.get()) {
				tag1 = "forge:diamond_detectable";
				tag2 = "forge:diamond_glowable";
			} else if (itemstack.getItem() == SuperiorstructuresModItems.NETHERITE_ORE_DETECTOR.get()) {
				tag1 = "forge:netherite_detectable";
				tag2 = "forge:netherite_glowable";
			} else if (itemstack.getItem() == SuperiorstructuresModItems.ENDORITE_ORE_DETECTOR.get()) {
				tag1 = "forge:endorite_detectable";
				tag2 = "forge:endorite_glowable";
			}
			bx = Math.floor(x);
			by = Math.floor(y);
			bz = Math.floor(z);
			sx = -4;
			close = false;
			for (int index0 = 0; index0 < 12; index0++) {
				sy = -4;
				for (int index1 = 0; index1 < 12; index1++) {
					sz = -4;
					for (int index2 = 0; index2 < 12; index2++) {
						if ((world.getBlockState(BlockPos.containing(bx + sx, by + sy, bz + sz))).is(BlockTags.create(ResourceLocation.parse((tag1).toLowerCase(java.util.Locale.ENGLISH))))) {
							close = true;
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			sx = -6;
			found = false;
			for (int index3 = 0; index3 < 12; index3++) {
				sy = -6;
				for (int index4 = 0; index4 < 12; index4++) {
					sz = -6;
					for (int index5 = 0; index5 < 12; index5++) {
						if ((world.getBlockState(BlockPos.containing(bx + sx, by + sy, bz + sz))).is(BlockTags.create(ResourceLocation.parse((tag1).toLowerCase(java.util.Locale.ENGLISH))))) {
							found = true;
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = SuperiorstructuresModEntities.DETECTED_BLOCK.get().spawn(_level, BlockPos.containing(bx + sx + 0.5, by + sy, bz + sz + 0.5), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse((tag2).toLowerCase(java.util.Locale.ENGLISH))))) {
						found = true;
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.GLOWING, Mth.nextInt(RandomSource.create(), 60, 80), 1, false, false));
					}
				}
			}
			if (close == true) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 80);
				if (world instanceof ServerLevel _level) {
					itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
					});
				}
				{
					final String _tagName = "charge";
					final double _tagValue = (itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charge") - 1);
					CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
				}
			} else if (found == true) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinechirps")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinechirps")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 80);
				if (world instanceof ServerLevel _level) {
					itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
					});
				}
			} else {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.comparator.click")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.comparator.click")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 80);
			}
			if (itemstack.getDamageValue() == itemstack.getMaxDamage() - 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.item.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.item.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level) {
					itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
					});
				}
			}
		}
	}
}
