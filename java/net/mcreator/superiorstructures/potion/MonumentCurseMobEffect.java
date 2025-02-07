
package net.mcreator.superiorstructures.potion;

import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import java.util.Set;

public class MonumentCurseMobEffect extends MobEffect {
	public MonumentCurseMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434829);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
	}
}
