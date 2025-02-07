
package net.mcreator.superiorstructures.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.superiorstructures.procedures.ShockOnEffectActiveTickProcedure;

public class ShockMobEffect extends MobEffect {
	public ShockMobEffect() {
		super(MobEffectCategory.HARMFUL, -2490374);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		ShockOnEffectActiveTickProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity, amplifier);
		return super.applyEffectTick(entity, amplifier);
	}
}
