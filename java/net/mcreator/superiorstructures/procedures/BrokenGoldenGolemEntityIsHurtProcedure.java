package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.superiorstructures.entity.SaddledGoldenGolemEntity;
import net.mcreator.superiorstructures.entity.NewIronGolemEntity;
import net.mcreator.superiorstructures.entity.GoldenGolemEntity;
import net.mcreator.superiorstructures.entity.ExposedCopperGolemEntity;
import net.mcreator.superiorstructures.entity.CopperGolemEntity;
import net.mcreator.superiorstructures.entity.BrokenIronGolemEntity;
import net.mcreator.superiorstructures.entity.BrokenGoldenGolemEntity;

import javax.annotation.Nullable;

@EventBusSubscriber
public class BrokenGoldenGolemEntityIsHurtProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		execute(null, world, entity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity, double amount) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof BrokenGoldenGolemEntity) {
			if (sourceentity instanceof Player || sourceentity instanceof CopperGolemEntity || sourceentity instanceof ExposedCopperGolemEntity || sourceentity instanceof BrokenIronGolemEntity || sourceentity instanceof GoldenGolemEntity
					|| sourceentity instanceof SaddledGoldenGolemEntity || sourceentity instanceof NewIronGolemEntity) {
				if (entity instanceof Mob _entity && sourceentity instanceof LivingEntity _ent)
					_entity.setTarget(_ent);
			}
			if (entity.isVehicle()) {
				(entity.getFirstPassenger()).hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), (float) amount);
			}
		}
	}
}
