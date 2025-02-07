package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.superiorstructures.entity.ThrownChakramEntity;

import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;

public class ChakramRicochetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity target_owner = null;
		Entity target_bouncer = null;
		double falaffel = 0;
		double sx = 0;
		double sz = 0;
		double magnitude = 0;
		double theta = 0;
		if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Richochet) : 0) > 0) {
			if ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Bounces) : 0) > 0) {
				target_bouncer = null;
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if ((target_owner == null || Math.pow(Math.abs(target_bouncer.getX() - entity.getX()), 2) + Math.pow(Math.abs(target_bouncer.getZ() - entity.getZ()), 2) < Math.pow(Math.abs(entityiterator.getX() - entity.getX()), 2)
								+ Math.pow(Math.abs(entityiterator.getZ() - entity.getZ()), 2)) && !(entityiterator instanceof ThrownChakramEntity) && entityiterator instanceof LivingEntity
								&& !(entityiterator instanceof LivingEntity _livEnt13 && _livEnt13.hasEffect(MobEffects.UNLUCK))
								&& !((entity instanceof ThrownChakramEntity _datEntS ? _datEntS.getEntityData().get(ThrownChakramEntity.DATA_Owner) : "").equals(entityiterator.getStringUUID()))) {
							target_bouncer = entityiterator;
						}
					}
				}
				if (!(target_bouncer == null)) {
					magnitude = 1.2;
					theta = Math.atan(Math.abs(target_bouncer.getX() - entity.getX()) / Math.abs(target_bouncer.getZ() - entity.getZ()));
					sx = magnitude * Math.sin(theta);
					sz = magnitude * Math.cos(theta);
					if (target_bouncer.getX() < entity.getX()) {
						sx = sx * (-1);
					}
					if (target_bouncer.getZ() < entity.getZ()) {
						sz = sz * (-1);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:chakram.bounce")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:chakram.bounce")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (entity instanceof ThrownChakramEntity _datEntSetI)
						_datEntSetI.getEntityData().set(ThrownChakramEntity.DATA_Bounces, (int) ((entity instanceof ThrownChakramEntity _datEntI ? _datEntI.getEntityData().get(ThrownChakramEntity.DATA_Bounces) : 0) - 1));
					entity.setDeltaMovement(new Vec3(sx, 0, sz));
				}
			} else {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if ((entity instanceof ThrownChakramEntity _datEntS ? _datEntS.getEntityData().get(ThrownChakramEntity.DATA_Owner) : "").equals(entityiterator.getStringUUID())) {
						if (entityiterator instanceof ServerPlayer _player) {
							AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("superiorstructures:son_of_flynn"));
							if (_adv != null) {
								AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
								if (!_ap.isDone()) {
									for (String criteria : _ap.getRemainingCriteria())
										_player.getAdvancements().award(_adv, criteria);
								}
							}
						}
					}
				}
			}
		}
	}
}
