package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;
import net.mcreator.superiorstructures.entity.LightningProjectileProjectileEntity;

public class DispenseLightningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction) {
		if (direction == null)
			return;
		if (direction == Direction.UP) {
			world.levelEvent(2001, BlockPos.containing(x, y + 1, z), Block.getId(SuperiorstructuresModBlocks.FULGURITE.get().defaultBlockState()));
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, (x + 0.5), (y + 1), (z + 0.5), 10, 0.2, 0.2, 0.2, 0.7);
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new LightningProjectileProjectileEntity(SuperiorstructuresModEntities.LIGHTNING_PROJECTILE_PROJECTILE.get(), level) {
							@Override
							public byte getPierceLevel() {
								return piercing;
							}

							@Override
							protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
								if (knockback > 0) {
									double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
									Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
									if (vec3.lengthSqr() > 0.0) {
										livingEntity.push(vec3.x, 0.1, vec3.z);
									}
								}
							}
						};
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 2, 1, (byte) 0);
				_entityToSpawn.setPos((x + 0.5), (y + 1), (z + 0.5));
				_entityToSpawn.shoot(0, 1, 0, 3, (float) 0.1);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		if (direction == Direction.DOWN) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, (x + 0.5), (y - 1), (z + 0.5), 10, 0.2, 0.2, 0.2, 0.7);
			world.levelEvent(2001, BlockPos.containing(x, y - 1, z), Block.getId(SuperiorstructuresModBlocks.FULGURITE.get().defaultBlockState()));
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new LightningProjectileProjectileEntity(SuperiorstructuresModEntities.LIGHTNING_PROJECTILE_PROJECTILE.get(), level) {
							@Override
							public byte getPierceLevel() {
								return piercing;
							}

							@Override
							protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
								if (knockback > 0) {
									double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
									Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
									if (vec3.lengthSqr() > 0.0) {
										livingEntity.push(vec3.x, 0.1, vec3.z);
									}
								}
							}
						};
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 2, 1, (byte) 0);
				_entityToSpawn.setPos((x + 0.5), (y - 1), (z + 0.5));
				_entityToSpawn.shoot(0, (-1), 0, 3, (float) 0.1);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		if (direction == Direction.NORTH) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, (x + 0.5), (y + 0.5), (z + -0.5), 10, 0.2, 0.2, 0.2, 0.7);
			world.levelEvent(2001, BlockPos.containing(x, y, z - 1), Block.getId(SuperiorstructuresModBlocks.FULGURITE.get().defaultBlockState()));
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new LightningProjectileProjectileEntity(SuperiorstructuresModEntities.LIGHTNING_PROJECTILE_PROJECTILE.get(), level) {
							@Override
							public byte getPierceLevel() {
								return piercing;
							}

							@Override
							protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
								if (knockback > 0) {
									double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
									Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
									if (vec3.lengthSqr() > 0.0) {
										livingEntity.push(vec3.x, 0.1, vec3.z);
									}
								}
							}
						};
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 2, 1, (byte) 0);
				_entityToSpawn.setPos((x + 0.5), (y + 0.5), (z - 1));
				_entityToSpawn.shoot(0, 0, (-1), 3, (float) 0.1);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		if (direction == Direction.SOUTH) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, (x + 0.5), (y + 0.5), (z + 1.5), 10, 0.2, 0.2, 0.2, 0.7);
			world.levelEvent(2001, BlockPos.containing(x, y, z + 1), Block.getId(SuperiorstructuresModBlocks.FULGURITE.get().defaultBlockState()));
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new LightningProjectileProjectileEntity(SuperiorstructuresModEntities.LIGHTNING_PROJECTILE_PROJECTILE.get(), level) {
							@Override
							public byte getPierceLevel() {
								return piercing;
							}

							@Override
							protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
								if (knockback > 0) {
									double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
									Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
									if (vec3.lengthSqr() > 0.0) {
										livingEntity.push(vec3.x, 0.1, vec3.z);
									}
								}
							}
						};
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 2, 1, (byte) 0);
				_entityToSpawn.setPos((x + 0.5), (y + 0.5), (z + 1));
				_entityToSpawn.shoot(0, 0, 1, 3, (float) 0.1);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		if (direction == Direction.EAST) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, (x + 1.5), (y + 0.5), (z + 0.5), 10, 0.2, 0.2, 0.2, 0.7);
			world.levelEvent(2001, BlockPos.containing(x + 1, y, z), Block.getId(SuperiorstructuresModBlocks.FULGURITE.get().defaultBlockState()));
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new LightningProjectileProjectileEntity(SuperiorstructuresModEntities.LIGHTNING_PROJECTILE_PROJECTILE.get(), level) {
							@Override
							public byte getPierceLevel() {
								return piercing;
							}

							@Override
							protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
								if (knockback > 0) {
									double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
									Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
									if (vec3.lengthSqr() > 0.0) {
										livingEntity.push(vec3.x, 0.1, vec3.z);
									}
								}
							}
						};
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 2, 1, (byte) 0);
				_entityToSpawn.setPos((x + 1), (y + 0.5), (z + 0.5));
				_entityToSpawn.shoot(1, 0, 0, 3, (float) 0.1);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		if (direction == Direction.WEST) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, (x + -0.5), (y + 0.5), (z + 0.5), 10, 0.2, 0.2, 0.2, 0.7);
			world.levelEvent(2001, BlockPos.containing(x - 1, y, z), Block.getId(SuperiorstructuresModBlocks.FULGURITE.get().defaultBlockState()));
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new LightningProjectileProjectileEntity(SuperiorstructuresModEntities.LIGHTNING_PROJECTILE_PROJECTILE.get(), level) {
							@Override
							public byte getPierceLevel() {
								return piercing;
							}

							@Override
							protected void doKnockback(LivingEntity livingEntity, DamageSource damageSource) {
								if (knockback > 0) {
									double d1 = Math.max(0.0, 1.0 - livingEntity.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
									Vec3 vec3 = this.getDeltaMovement().multiply(1.0, 0.0, 1.0).normalize().scale(knockback * 0.6 * d1);
									if (vec3.lengthSqr() > 0.0) {
										livingEntity.push(vec3.x, 0.1, vec3.z);
									}
								}
							}
						};
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 2, 1, (byte) 0);
				_entityToSpawn.setPos((x - 1), (y + 0.5), (z + 0.5));
				_entityToSpawn.shoot((-1), 0, 0, 3, (float) 0.1);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:lightningcharge")), SoundSource.NEUTRAL, 4, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:lightningcharge")), SoundSource.NEUTRAL, 4, 1, false);
			}
		}
	}
}
