package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

public class DetectedBlockOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.setYRot(0);
			_ent.setXRot(0);
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
		{
			Entity _ent = entity;
			_ent.teleportTo(x, Math.ceil(y), z);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(x, Math.ceil(y), z, _ent.getYRot(), _ent.getXRot());
		}
		if (!(entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(MobEffects.GLOWING)) || world.isEmptyBlock(BlockPos.containing(x, y + 0.1, z))) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
