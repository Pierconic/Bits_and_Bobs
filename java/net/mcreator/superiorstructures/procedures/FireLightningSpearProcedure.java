package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;

import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;
import net.mcreator.superiorstructures.entity.LightningSpearProjectileEntity;

public class FireLightningSpearProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Direction direction) {
		if (direction == null)
			return;
		if (direction == Direction.DOWN) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new LightningSpearProjectileEntity(SuperiorstructuresModEntities.LIGHTNING_SPEAR_PROJECTILE.get(), level) {
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
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1, (byte) 0);
				_entityToSpawn.setPos((x + 0.5), (y - 1.3), (z + 0.5));
				_entityToSpawn.shoot(0, (-1), 0, 1, 3);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		} else if (direction == Direction.UP) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new LightningSpearProjectileEntity(SuperiorstructuresModEntities.LIGHTNING_SPEAR_PROJECTILE.get(), level) {
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
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1, (byte) 0);
				_entityToSpawn.setPos((x + 0.5), (y + 1.3), (z + 0.5));
				_entityToSpawn.shoot(0, 1, 0, 1, 3);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		} else if (direction == Direction.NORTH) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new LightningSpearProjectileEntity(SuperiorstructuresModEntities.LIGHTNING_SPEAR_PROJECTILE.get(), level) {
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
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1, (byte) 0);
				_entityToSpawn.setPos((x + 0.5), (y + 0.5), (z - 1.3));
				_entityToSpawn.shoot(0, 0, (-1), 1, 3);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		} else if (direction == Direction.SOUTH) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new LightningSpearProjectileEntity(SuperiorstructuresModEntities.LIGHTNING_SPEAR_PROJECTILE.get(), level) {
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
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1, (byte) 0);
				_entityToSpawn.setPos((x + 0.5), (y + 0.5), (z + 1.3));
				_entityToSpawn.shoot(0, 0, 1, 1, 3);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		} else if (direction == Direction.WEST) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new LightningSpearProjectileEntity(SuperiorstructuresModEntities.LIGHTNING_SPEAR_PROJECTILE.get(), level) {
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
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1, (byte) 0);
				_entityToSpawn.setPos((x - 1.3), (y + 0.5), (z + 0.5));
				_entityToSpawn.shoot((-1), 0, 0, 1, 3);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		} else if (direction == Direction.EAST) {
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new LightningSpearProjectileEntity(SuperiorstructuresModEntities.LIGHTNING_SPEAR_PROJECTILE.get(), level) {
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
						entityToSpawn.pickup = AbstractArrow.Pickup.ALLOWED;
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, 5, 1, (byte) 0);
				_entityToSpawn.setPos((x + 1.3), (y + 0.5), (z + 0.5));
				_entityToSpawn.shoot(1, 0, 0, 1, 3);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
