package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.superiorstructures.entity.AcolyteRobeEntity;

public class AcolyteRobeTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof AcolyteRobeEntity _datEntSetI)
			_datEntSetI.getEntityData().set(AcolyteRobeEntity.DATA_lifetime, (int) ((entity instanceof AcolyteRobeEntity _datEntI ? _datEntI.getEntityData().get(AcolyteRobeEntity.DATA_lifetime) : 0) - 1));
		if ((entity instanceof AcolyteRobeEntity _datEntI ? _datEntI.getEntityData().get(AcolyteRobeEntity.DATA_lifetime) : 0) <= 0) {
			entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 10);
		}
	}
}
