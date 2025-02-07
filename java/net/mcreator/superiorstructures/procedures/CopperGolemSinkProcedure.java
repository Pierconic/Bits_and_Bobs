package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.entity.ExposedCopperGolemEntity;
import net.mcreator.superiorstructures.entity.CopperGolemEntity;

public class CopperGolemSinkProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.isEmptyBlock(BlockPos.containing(x, y - 1, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 2, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 3, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 4, z))
				&& world.isEmptyBlock(BlockPos.containing(x, y - 5, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 6, z)) && world.isEmptyBlock(BlockPos.containing(x, y - 7, z)) && !(entity.getDeltaMovement().y() <= -0.04)) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() - 0.02), (entity.getDeltaMovement().z())));
		}
		if (!(entity.getDeltaMovement().y() >= 0.04) && !world.isEmptyBlock(BlockPos.containing(x, y - 1, z))) {
			entity.setDeltaMovement(new Vec3((entity.getDeltaMovement().x()), (entity.getDeltaMovement().y() + 0.02), (entity.getDeltaMovement().z())));
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) >= 10) {
			if (entity instanceof CopperGolemEntity animatable)
				animatable.setTexture("copper_golem_texture");
			if (entity instanceof ExposedCopperGolemEntity animatable)
				animatable.setTexture("exposed_golem_texture");
		} else {
			if (entity instanceof CopperGolemEntity animatable)
				animatable.setTexture("copper_golem_lowcracked");
			if (entity instanceof ExposedCopperGolemEntity animatable)
				animatable.setTexture("exposed_copper_golem_lowcracked");
		}
	}
}
