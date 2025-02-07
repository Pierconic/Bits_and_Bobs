package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class MineshaftCenterDespawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.LUCK))) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
