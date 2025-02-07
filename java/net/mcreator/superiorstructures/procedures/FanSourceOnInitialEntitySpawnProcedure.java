package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class FanSourceOnInitialEntitySpawnProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean blocked = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double power = 0;
		double n = 0;
		{
			Entity _ent = entity;
			_ent.teleportTo((Math.floor(x) + 0.5), (Math.floor(y) + 0.5), (Math.floor(z) + 0.5));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport((Math.floor(x) + 0.5), (Math.floor(y) + 0.5), (Math.floor(z) + 0.5), _ent.getYRot(), _ent.getXRot());
		}
	}
}
