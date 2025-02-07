package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Monster;

public class GoldenGolemAttackConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		if (!(!world.getEntitiesOfClass(Monster.class, AABB.ofSize(new Vec3(x, y, z), 12, 12, 12), e -> true).isEmpty())) {
			return true;
		}
		return false;
	}
}
