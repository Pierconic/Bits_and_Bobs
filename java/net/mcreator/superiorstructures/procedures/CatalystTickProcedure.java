package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.monster.WitherSkeleton;
import net.minecraft.world.entity.monster.Strider;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.Blaze;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;
import net.mcreator.superiorstructures.entity.WarpCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.FrostCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.FlameCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.EnergyCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.BoltCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.BigWarpCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.BigFrostCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.BigFlameCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.BigEnergyCatalystProjectileEntity;
import net.mcreator.superiorstructures.entity.BigBoltCatalystProjectileEntity;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

import java.util.List;
import java.util.Comparator;

public class CatalystTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack mainhanditem = ItemStack.EMPTY;
		ItemStack offhanditem = ItemStack.EMPTY;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (entity.onGround()) {
			if (entity instanceof EnergyCatalystProjectileEntity || entity instanceof BoltCatalystProjectileEntity || entity instanceof FlameCatalystProjectileEntity || entity instanceof FrostCatalystProjectileEntity) {
				if (!(entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(MobEffects.UNLUCK))) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 30, 1, false, false));
				}
			} else {
				if (!(entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(MobEffects.UNLUCK))) {
					if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 52, 1, false, false));
				}
			}
		}
		if (entity instanceof EnergyCatalystProjectileEntity) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 29
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 20
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 10) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.metal_pressure_plate.click_on")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.metal_pressure_plate.click_on")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 1) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, (y + 1), z, 2, Level.ExplosionInteraction.NONE);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 16, 0.2, 0.2, 0.2, 0.2);
			}
		} else if (entity instanceof FrostCatalystProjectileEntity) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 29
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 20
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 10) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.glass.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.glass.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 1) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:frostrailfires")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:frostrailfires")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SNOWFLAKE, x, y, z, 30, 0.4, 0.4, 0.4, 0.4);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, Mth.nextInt(RandomSource.create(), 200, 400), 2, false, true));
						if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, Mth.nextInt(RandomSource.create(), 100, 200), 1, false, true));
						entityiterator.setTicksFrozen(Mth.nextInt(RandomSource.create(), 700, 800));
					}
				}
				MediumFrostBubbleProcedure.execute(world, x, y, z);
			}
		} else if (entity instanceof FlameCatalystProjectileEntity) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 29
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 20
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 10) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.flintandsteel.use")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 1) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.firecharge.use")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, (y + 1), z, 2, Level.ExplosionInteraction.BLOCK);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMALL_FLAME, x, y, z, 16, 0.2, 0.2, 0.2, 0.2);
				FlameSpreadProcedure.execute(world, x, y, z);
			}
		} else if (entity instanceof BoltCatalystProjectileEntity) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 29
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 20
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 10) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.tuff.break")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.tuff.break")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 1) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:lightningcharge")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:lightningcharge")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				BoltBurstProcedure.execute(world, x, y, z);
			}
		} else if (entity instanceof BigEnergyCatalystProjectileEntity) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 49) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:blasterfire")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:blasterfire")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 40) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:blasterfire")), SoundSource.NEUTRAL, 1, (float) 1.15);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:blasterfire")), SoundSource.NEUTRAL, 1, (float) 1.15, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 30) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:blasterfire")), SoundSource.NEUTRAL, 1, (float) 1.3);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:blasterfire")), SoundSource.NEUTRAL, 1, (float) 1.3, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 20) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:blasterfire")), SoundSource.NEUTRAL, 1, (float) 1.45);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:blasterfire")), SoundSource.NEUTRAL, 1, (float) 1.45, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 10) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:blasterfire")), SoundSource.NEUTRAL, 1, (float) 1.6);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:blasterfire")), SoundSource.NEUTRAL, 1, (float) 1.6, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 1) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, (y + 2), z, 2, Level.ExplosionInteraction.NONE);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 3, Level.ExplosionInteraction.NONE);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x - 4), y, z, 2, Level.ExplosionInteraction.NONE);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 4), y, z, 2, Level.ExplosionInteraction.NONE);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, (z + 4), 2, Level.ExplosionInteraction.NONE);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, (z - 4), 2, Level.ExplosionInteraction.NONE);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 26, 0.2, 0.2, 0.2, 0.3);
			}
		} else if (entity instanceof BigFlameCatalystProjectileEntity) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 49) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:flameblasterfire")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:flameblasterfire")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 40) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:flameblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.15);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:flameblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.15, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 30) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:flameblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.3);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:flameblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.3, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 20) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:flameblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.45);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:flameblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.45, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 10) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:flameblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.6);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:flameblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.6, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 1) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, (y + 2), z, 2, Level.ExplosionInteraction.BLOCK);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 3, Level.ExplosionInteraction.BLOCK);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x - 4), (y + 1), z, 2, Level.ExplosionInteraction.BLOCK);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, (x + 4), (y + 1), z, 2, Level.ExplosionInteraction.BLOCK);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, (y + 1), (z + 4), 2, Level.ExplosionInteraction.BLOCK);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, (y + 1), (z - 4), 2, Level.ExplosionInteraction.BLOCK);
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SMALL_FLAME, x, y, z, 26, 0.2, 0.2, 0.2, 0.3);
				FlameSpreadProcedure.execute(world, x - 4, y, z);
				FlameSpreadProcedure.execute(world, x + 4, y, z);
				FlameSpreadProcedure.execute(world, x, y, z + 4);
				FlameSpreadProcedure.execute(world, x, y, z - 4);
			}
		} else if (entity instanceof BigFrostCatalystProjectileEntity) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 49) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:frostblasterfire")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:frostblasterfire")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 40) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:frostblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.15);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:frostblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.15, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 30) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:frostblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.3);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:frostblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.3, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 20) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:frostblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.45);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:frostblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.45, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 10) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:frostblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.6);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:frostblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.6, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 1) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:frostrailfires")), SoundSource.NEUTRAL, 1, (float) 1.6);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:frostrailfires")), SoundSource.NEUTRAL, 1, (float) 1.6, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.SNOWFLAKE, x, y, z, 26, 1, 1, 1, 0.3);
				LargeFrostBubbleProcedure.execute(world, x, y, z);
				MediumFrostBubbleProcedure.execute(world, x, y, z - 3);
				MediumFrostBubbleProcedure.execute(world, x, y, z + 3);
				MediumFrostBubbleProcedure.execute(world, x + 3, y, z);
				MediumFrostBubbleProcedure.execute(world, x - 3, y, z);
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.NONE);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(14 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof Blaze || entityiterator instanceof MagmaCube || entityiterator instanceof WitherSkeleton || entityiterator instanceof Strider || entityiterator instanceof Piglin
								|| entityiterator instanceof ZombifiedPiglin || entityiterator instanceof PiglinBrute
								|| (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == Items.NETHERITE_BOOTS
								|| (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == Items.NETHERITE_LEGGINGS
								|| (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == Items.NETHERITE_CHESTPLATE
								|| (entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == Items.NETHERITE_HELMET) {
							entityiterator.setTicksFrozen(820);
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, Mth.nextInt(RandomSource.create(), 420, 500), 2, false, true));
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, Mth.nextInt(RandomSource.create(), 420, 500), 0, false, true));
						} else {
							entityiterator.setTicksFrozen(740);
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, Mth.nextInt(RandomSource.create(), 360, 420), 2, false, true));
							if (entityiterator instanceof LivingEntity _entity && !_entity.level().isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, Mth.nextInt(RandomSource.create(), 420, 500), 0, false, true));
						}
					}
				}
			}
		} else if (entity instanceof BigBoltCatalystProjectileEntity) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 49) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:boltblasterfire")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:boltblasterfire")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 40) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:boltblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.15);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:boltblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.15, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 30) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:boltblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.3);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:boltblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.3, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 20) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:boltblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.45);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:boltblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.45, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 10) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:boltblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.6);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:boltblasterfire")), SoundSource.NEUTRAL, 1, (float) 1.6, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 1) {
				if (!entity.level().isClientSide())
					entity.discard();
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 25, 0.2, 0.2, 0.2, 0.15);
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(8 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (world instanceof ServerLevel _level) {
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).hurtAndBreak(24, _level, null, _stkprov -> {
							});
						}
						if (world instanceof ServerLevel _level) {
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).hurtAndBreak(24, _level, null, _stkprov -> {
							});
						}
						if (world instanceof ServerLevel _level) {
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).hurtAndBreak(24, _level, null, _stkprov -> {
							});
						}
						if (world instanceof ServerLevel _level) {
							(entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).hurtAndBreak(24, _level, null, _stkprov -> {
							});
						}
					}
				}
				if (world.getLevelData().isThundering()) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wither.hurt")), SoundSource.NEUTRAL, 2, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wither.hurt")), SoundSource.NEUTRAL, 2, 1, false);
						}
					}
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.NONE);
					SuperiorstructuresMod.queueServerWork(10, () -> {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.BLOCK);
					});
					SuperiorstructuresMod.queueServerWork(20, () -> {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, (y + 3), z, 4, Level.ExplosionInteraction.BLOCK);
					});
					if (world.canSeeSkyFromBelowWater(BlockPos.containing(x, y + 1, z))) {
						if (world instanceof ServerLevel _level) {
							LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
							entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
							_level.addFreshEntity(entityToSpawn);
						}
						SuperiorstructuresMod.queueServerWork(5, () -> {
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + 2, y, z)));;
								_level.addFreshEntity(entityToSpawn);
							}
						});
						SuperiorstructuresMod.queueServerWork(10, () -> {
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z - 2)));;
								_level.addFreshEntity(entityToSpawn);
							}
						});
						SuperiorstructuresMod.queueServerWork(15, () -> {
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x - 2, y, z)));;
								_level.addFreshEntity(entityToSpawn);
							}
						});
						SuperiorstructuresMod.queueServerWork(20, () -> {
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z + 2)));;
								_level.addFreshEntity(entityToSpawn);
							}
						});
						SuperiorstructuresMod.queueServerWork(25, () -> {
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x + 2, y, z)));;
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z - 2)));;
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x - 2, y, z)));;
								_level.addFreshEntity(entityToSpawn);
							}
							if (world instanceof ServerLevel _level) {
								LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
								entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z + 2)));;
								_level.addFreshEntity(entityToSpawn);
							}
						});
					}
					SuperiorstructuresMod.queueServerWork(14, () -> {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = SuperiorstructuresModEntities.PULSE_FIELD_2.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = SuperiorstructuresModEntities.PULSE_FIELD.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					});
				} else {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = SuperiorstructuresModEntities.PULSE_FIELD_2.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
				}
			}
		} else if (entity instanceof WarpCatalystProjectileEntity) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 29
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 20
					|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 10) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritebreak")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritebreak")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 8, 0.2, 0.2, 0.2, 0.2);
				if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
					sx = x;
					sy = y;
					sz = z;
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if ((entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("minecraft:warpable"))) || entityiterator instanceof Player)
									&& (Math.abs(x - sx) + Math.abs(y - sy) + Math.abs(z - sz) > Math.abs(x - entityiterator.getX()) + Math.abs(y - entityiterator.getY()) + Math.abs(z - entityiterator.getZ())
											|| Math.abs(x - sx) + Math.abs(y - sy) + Math.abs(z - sz) == 0)) {
								sx = entityiterator.getX();
								sy = entityiterator.getY();
								sz = entityiterator.getZ();
							}
						}
					}
					{
						Entity _ent = entity;
						_ent.teleportTo((sx + Mth.nextDouble(RandomSource.create(), -1, 1)), sy, (sz + Mth.nextDouble(RandomSource.create(), -1, 1)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((sx + Mth.nextDouble(RandomSource.create(), -1, 1)), sy, (sz + Mth.nextDouble(RandomSource.create(), -1, 1)), _ent.getYRot(), _ent.getXRot());
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 8, 0.2, 0.2, 0.2, 0.2);
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritesense")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritesense")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.NONE);
				if (!entity.level().isClientSide())
					entity.discard();
			}
		} else if (entity instanceof BigWarpCatalystProjectileEntity) {
			if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 49) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 8, 0.2, 0.2, 0.2, 0.2);
				if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
					sx = x;
					sy = y;
					sz = z;
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if ((entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("minecraft:warpable"))) || entityiterator instanceof Player)
									&& (Math.abs(x - sx) + Math.abs(y - sy) + Math.abs(z - sz) > Math.abs(x - entityiterator.getX()) + Math.abs(y - entityiterator.getY()) + Math.abs(z - entityiterator.getZ())
											|| Math.abs(x - sx) + Math.abs(y - sy) + Math.abs(z - sz) == 0)) {
								sx = entityiterator.getX();
								sy = entityiterator.getY();
								sz = entityiterator.getZ();
							}
						}
					}
					{
						Entity _ent = entity;
						_ent.teleportTo((sx + Mth.nextDouble(RandomSource.create(), -1, 1)), sy, (sz + Mth.nextDouble(RandomSource.create(), -1, 1)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((sx + Mth.nextDouble(RandomSource.create(), -1, 1)), sy, (sz + Mth.nextDouble(RandomSource.create(), -1, 1)), _ent.getYRot(), _ent.getXRot());
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritebreak")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritebreak")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 8, 0.2, 0.2, 0.2, 0.2);
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 40) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 8, 0.2, 0.2, 0.2, 0.2);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritebreak")), SoundSource.NEUTRAL, 1, (float) 1.15);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritebreak")), SoundSource.NEUTRAL, 1, (float) 1.15, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 30) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 8, 0.2, 0.2, 0.2, 0.2);
				if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
					sx = x;
					sy = y;
					sz = z;
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if ((entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("minecraft:warpable"))) || entityiterator instanceof Player)
									&& (Math.abs(x - sx) + Math.abs(y - sy) + Math.abs(z - sz) > Math.abs(x - entityiterator.getX()) + Math.abs(y - entityiterator.getY()) + Math.abs(z - entityiterator.getZ())
											|| Math.abs(x - sx) + Math.abs(y - sy) + Math.abs(z - sz) == 0)) {
								sx = entityiterator.getX();
								sy = entityiterator.getY();
								sz = entityiterator.getZ();
							}
						}
					}
					{
						Entity _ent = entity;
						_ent.teleportTo((sx + Mth.nextDouble(RandomSource.create(), -1, 1)), sy, (sz + Mth.nextDouble(RandomSource.create(), -1, 1)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((sx + Mth.nextDouble(RandomSource.create(), -1, 1)), sy, (sz + Mth.nextDouble(RandomSource.create(), -1, 1)), _ent.getYRot(), _ent.getXRot());
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritebreak")), SoundSource.NEUTRAL, 1, (float) 1.3);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritebreak")), SoundSource.NEUTRAL, 1, (float) 1.3, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 8, 0.2, 0.2, 0.2, 0.2);
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 20) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 8, 0.2, 0.2, 0.2, 0.2);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritebreak")), SoundSource.NEUTRAL, 1, (float) 1.45);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritebreak")), SoundSource.NEUTRAL, 1, (float) 1.45, false);
					}
				}
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 10) {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 8, 0.2, 0.2, 0.2, 0.2);
				if (!world.getEntitiesOfClass(LivingEntity.class, AABB.ofSize(new Vec3(x, y, z), 16, 16, 16), e -> true).isEmpty()) {
					sx = x;
					sy = y;
					sz = z;
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
						for (Entity entityiterator : _entfound) {
							if ((entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("minecraft:warpable"))) || entityiterator instanceof Player)
									&& (Math.abs(x - sx) + Math.abs(y - sy) + Math.abs(z - sz) > Math.abs(x - entityiterator.getX()) + Math.abs(y - entityiterator.getY()) + Math.abs(z - entityiterator.getZ())
											|| Math.abs(x - sx) + Math.abs(y - sy) + Math.abs(z - sz) == 0)) {
								sx = entityiterator.getX();
								sy = entityiterator.getY();
								sz = entityiterator.getZ();
							}
						}
					}
					{
						Entity _ent = entity;
						_ent.teleportTo((sx + Mth.nextDouble(RandomSource.create(), -1, 1)), sy, (sz + Mth.nextDouble(RandomSource.create(), -1, 1)));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((sx + Mth.nextDouble(RandomSource.create(), -1, 1)), sy, (sz + Mth.nextDouble(RandomSource.create(), -1, 1)), _ent.getYRot(), _ent.getXRot());
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritebreak")), SoundSource.NEUTRAL, 1, (float) 1.6);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritebreak")), SoundSource.NEUTRAL, 1, (float) 1.6, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 8, 0.2, 0.2, 0.2, 0.2);
			} else if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.UNLUCK) ? _livEnt.getEffect(MobEffects.UNLUCK).getDuration() : 0) == 1) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritesense")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:endoritesense")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 4, Level.ExplosionInteraction.NONE);
				for (int index0 = 0; index0 < 4; index0++) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = SuperiorstructuresModEntities.WARP_CATALYST_PROJECTILE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (!world.getEntitiesOfClass(WarpCatalystProjectileEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
						if (((Entity) world.getEntitiesOfClass(WarpCatalystProjectileEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity && !_entity.level().isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 10, 1, false, false));
					}
				}
				if (!entity.level().isClientSide())
					entity.discard();
			}
		}
	}
}
