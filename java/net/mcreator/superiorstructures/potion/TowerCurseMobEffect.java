
package net.mcreator.superiorstructures.potion;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.superiorstructures.procedures.ApplyCurseTypeProcedure;

import java.util.Set;

public class TowerCurseMobEffect extends MobEffect {
	public TowerCurseMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434829);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		ApplyCurseTypeProcedure.execute(entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
