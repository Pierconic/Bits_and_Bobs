package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;

import java.util.List;
import java.util.Comparator;

public class HookshotPositionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity origin_entity = null;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double theta = 0;
		boolean found = false;
		found = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player && entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_linked) {
					{
						Entity _ent = entity;
						_ent.teleportTo(entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_x, entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_y,
								entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_z);
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_x, entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_y,
									entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_z, _ent.getYRot(), _ent.getXRot());
					}
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
					found = true;
				}
			}
		}
		if (!found) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
	}
}
