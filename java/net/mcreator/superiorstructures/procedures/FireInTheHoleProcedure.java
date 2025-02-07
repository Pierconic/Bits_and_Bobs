package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;
import net.mcreator.superiorstructures.entity.SaddledGoldenGolemEntity;
import net.mcreator.superiorstructures.entity.EnergyRail2ProjectileEntity;

public class FireInTheHoleProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double yfix = 0;
		double xfix = 0;
		double zfix = 0;
		if ((entity.getVehicle()) instanceof SaddledGoldenGolemEntity && !(entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MobEffects.UNLUCK))) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.UNLUCK, 60, 1, false, false));
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:energyrailfires")), SoundSource.NEUTRAL, (float) 0.5, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:energyrailfires")), SoundSource.NEUTRAL, (float) 0.5, 1, false);
				}
			}
			if (entity.getLookAngle().y >= 0.6) {
				yfix = 0.6;
			} else if (entity.getLookAngle().y <= -0.6) {
				yfix = -0.6;
			} else if (entity.getLookAngle().y > -0.6 && entity.getLookAngle().y < 0.6) {
				yfix = entity.getLookAngle().y;
			}
			if (world instanceof ServerLevel projectileLevel) {
				Projectile _entityToSpawn = new Object() {
					public Projectile getArrow(Level level, Entity shooter, float damage, int knockback, byte piercing) {
						AbstractArrow entityToSpawn = new EnergyRail2ProjectileEntity(SuperiorstructuresModEntities.ENERGY_RAIL_2_PROJECTILE.get(), level) {
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
						entityToSpawn.setOwner(shooter);
						entityToSpawn.setBaseDamage(damage);
						entityToSpawn.setSilent(true);
						return entityToSpawn;
					}
				}.getArrow(projectileLevel, (entity.getVehicle()), 8, 2, (byte) 0);
				_entityToSpawn.setPos(((entity.getVehicle()).getX() + (entity.getVehicle()).getLookAngle().x * 2.7), ((entity.getVehicle()).getY() + 1.3), ((entity.getVehicle()).getZ() + (entity.getVehicle()).getLookAngle().z * 2.7));
				_entityToSpawn.shoot((entity.getLookAngle().x), (yfix + 0.15), (entity.getLookAngle().z), 1, 0);
				projectileLevel.addFreshEntity(_entityToSpawn);
			}
		}
	}
}
