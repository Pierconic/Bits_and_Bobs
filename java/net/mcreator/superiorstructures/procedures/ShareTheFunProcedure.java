package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.superiorstructures.init.SuperiorstructuresModMobEffects;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ShareTheFunProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingDamageEvent.Post event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(Entity entity, Entity sourceentity) {
		execute(null, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(SuperiorstructuresModMobEffects.SHOCK)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(SuperiorstructuresModMobEffects.SHOCK,
						sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(SuperiorstructuresModMobEffects.SHOCK) ? _livEnt.getEffect(SuperiorstructuresModMobEffects.SHOCK).getDuration() : 0,
						sourceentity instanceof LivingEntity _livEnt && _livEnt.hasEffect(SuperiorstructuresModMobEffects.SHOCK) ? _livEnt.getEffect(SuperiorstructuresModMobEffects.SHOCK).getAmplifier() : 0, false, false));
		}
	}
}
