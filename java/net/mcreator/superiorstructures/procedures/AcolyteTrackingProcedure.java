package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.superiorstructures.entity.AcolyteEntity;

public class AcolyteTrackingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 14, 14, 14), e -> true).isEmpty() && (entity instanceof AcolyteEntity _datEntI ? _datEntI.getEntityData().get(AcolyteEntity.DATA_Charged) : 0) < 30) {
			if (entity instanceof AcolyteEntity _datEntSetI)
				_datEntSetI.getEntityData().set(AcolyteEntity.DATA_Charged, (int) ((entity instanceof AcolyteEntity _datEntI ? _datEntI.getEntityData().get(AcolyteEntity.DATA_Charged) : 0) + 1));
		} else if ((entity instanceof AcolyteEntity _datEntI ? _datEntI.getEntityData().get(AcolyteEntity.DATA_Charged) : 0) > 0) {
			if (entity instanceof AcolyteEntity _datEntSetI)
				_datEntSetI.getEntityData().set(AcolyteEntity.DATA_Charged, (int) ((entity instanceof AcolyteEntity _datEntI ? _datEntI.getEntityData().get(AcolyteEntity.DATA_Charged) : 0) - 1));
		}
	}
}
