package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;

public class AscensionOnEffectActiveTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double h_strength = 0;
		double v_strength = 0;
		double friction = 0;
		double h_max = 0;
		double v_max = 0;
		double snapping = 0;
		entity.fallDistance = 0;
		if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.isFallFlying())) {
			if (entity.isShiftKeyDown()) {
				v_strength = 0.075;
				h_strength = 0.05;
				h_max = 0.47;
				v_max = 0.47;
				friction = 0.04;
				snapping = 0.04;
			} else if (entity.isSprinting()) {
				v_strength = 0.1;
				h_strength = 0.1;
				h_max = 0.85;
				v_max = 0.85;
				friction = 0.02;
				snapping = 0.05;
			} else {
				v_strength = 0.075;
				h_strength = 0.075;
				h_max = 0.65;
				v_max = 0.65;
				friction = 0.01;
				snapping = 0.06;
			}
			if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).upwards_polarity && entity.getDeltaMovement().y() < h_max) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + v_strength), (entity.getDeltaMovement().z())));
			}
			if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).downwards_polarity && entity.getDeltaMovement().y() > (-1) * h_max) {
				entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() - v_strength), (entity.getDeltaMovement().z())));
			}
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).upwards_polarity || entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).downwards_polarity)) {
				if (entity.getDeltaMovement().y() > snapping) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() - friction), (entity.getDeltaMovement().z())));
				} else if (entity.getDeltaMovement().y() < (-1) * snapping) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + friction), (entity.getDeltaMovement().z())));
				} else {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), 0, (entity.getDeltaMovement().z())));
				}
			}
			if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).fowards_polarity) {
				if (Math.abs(entity.getDeltaMovement().x()) < h_max && Math.abs(entity.getDeltaMovement().z()) < h_max) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + entity.getLookAngle().x * h_strength), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + entity.getLookAngle().z * h_strength)));
				}
			}
			if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).backwards_polarity) {
				if (Math.abs(entity.getDeltaMovement().x()) < h_max && Math.abs(entity.getDeltaMovement().z()) < h_max) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + entity.getLookAngle().x * (-1) * h_strength), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + entity.getLookAngle().z * (-1) * h_strength)));
				}
			}
			if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).left_polarity) {
				if (Math.abs(entity.getDeltaMovement().x()) < h_max && Math.abs(entity.getDeltaMovement().z()) < h_max) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + entity.getLookAngle().z * h_strength), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + entity.getLookAngle().x * (-1) * h_strength)));
				}
			}
			if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).right_polarity) {
				if (Math.abs(entity.getDeltaMovement().x()) < h_max && Math.abs(entity.getDeltaMovement().z()) < h_max) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + entity.getLookAngle().z * (-1) * h_strength), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + entity.getLookAngle().x * h_strength)));
				}
			}
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).fowards_polarity || entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).left_polarity
					|| entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).right_polarity || entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).backwards_polarity)) {
				if (entity.getDeltaMovement().z() > snapping) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() - friction)));
				} else if (entity.getDeltaMovement().z() < (-1) * snapping) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z() + friction)));
				} else {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y()), 0));
				}
				if (entity.getDeltaMovement().x() > snapping) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() - friction), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
				} else if (entity.getDeltaMovement().x() < (-1) * snapping) {
					entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x() + friction), (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
				} else {
					entity.setDeltaMovement(new Vec3(0, (entity.getDeltaMovement().y()), (entity.getDeltaMovement().z())));
				}
			}
		}
	}
}
