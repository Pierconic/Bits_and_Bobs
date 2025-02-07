package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;

import java.util.List;
import java.util.Comparator;

public class ChainLinkPositionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity origin_entity = null;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double theta = 0;
		boolean found = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof Player && entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_linked) {
					{
						Entity _ent = entity;
						_ent.teleportTo((entityiterator.getX() + entity.getPersistentData().getDouble("position") * 0.05 * (entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_x - entityiterator.getX())),
								(entityiterator.getY() + entity.getPersistentData().getDouble("position") * 0.05 * (entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_y - entityiterator.getY())),
								(entityiterator.getZ() + entity.getPersistentData().getDouble("position") * 0.05 * (entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_z - entityiterator.getZ())));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(
									(entityiterator.getX() + entity.getPersistentData().getDouble("position") * 0.05 * (entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_x - entityiterator.getX())),
									(entityiterator.getY() + entity.getPersistentData().getDouble("position") * 0.05 * (entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_y - entityiterator.getY())),
									(entityiterator.getZ() + entity.getPersistentData().getDouble("position") * 0.05 * (entityiterator.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).hookshot_z - entityiterator.getZ())), _ent.getYRot(),
									_ent.getXRot());
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
