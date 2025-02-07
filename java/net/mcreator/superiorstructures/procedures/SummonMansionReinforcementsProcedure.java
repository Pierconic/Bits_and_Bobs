package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;

import java.util.Comparator;

public class SummonMansionReinforcementsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		boolean found = false;
		double sx = 0;
		double sz = 0;
		double ox = 0;
		double oz = 0;
		double oy = 0;
		double y_offset = 0;
		if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
			if (!(new Object() {
				public boolean checkGamemode(Entity _ent) {
					if (_ent instanceof ServerPlayer _serverPlayer) {
						return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
					} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
						return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null
								&& Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
					}
					return false;
				}
			}.checkGamemode(((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null))))) {
				sx = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getLookAngle().x * (-10);
				sz = ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getLookAngle().z * (-10);
				if (Math.abs(sx) < 6) {
					if (Math.random() < 0.5) {
						sx = Mth.nextInt(RandomSource.create(), 9, 15);
					} else {
						sx = Mth.nextInt(RandomSource.create(), -15, 9);
					}
				}
				if (Math.abs(sz) < 6) {
					if (Math.random() < 0.5) {
						sz = Mth.nextInt(RandomSource.create(), 9, 15);
					} else {
						sz = Mth.nextInt(RandomSource.create(), -15, 9);
					}
				}
				for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 2, 5); index0++) {
					ox = Mth.nextInt(RandomSource.create(), -3, 3);
					oz = Mth.nextInt(RandomSource.create(), -3, 3);
					oy = 0;
					found = false;
					for (int index1 = 0; index1 < 6; index1++) {
						if (!found) {
							if (world.getBlockState(BlockPos.containing(x + sx + ox, (y + oy) - 1, z + sz + oz)).isFaceSturdy(world, BlockPos.containing(x + sx + ox, (y + oy) - 1, z + sz + oz), Direction.UP)
									&& !world.getBlockState(BlockPos.containing(x + sx + ox, (y + oy) - 0, z + sz + oz)).canOcclude() && !world.getBlockState(BlockPos.containing(x + sx + ox, y + oy + 1, z + sz + oz)).canOcclude()) {
								y_offset = y + oy;
								found = true;
							} else if (world.getBlockState(BlockPos.containing(x + sx + ox, (y - oy) - 1, z + sz + oz)).isFaceSturdy(world, BlockPos.containing(x + sx + ox, (y - oy) - 1, z + sz + oz), Direction.UP)
									&& !world.getBlockState(BlockPos.containing(x + sx + ox, (y - oy) - 0, z + sz + oz)).canOcclude() && !world.getBlockState(BlockPos.containing(x + sx + ox, y - oy + 1, z + sz + oz)).canOcclude()) {
								y_offset = y - oy;
								found = true;
							} else {
								oy = oy + 1;
							}
						}
					}
					if (found) {
						if (Math.random() < 0.05) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.VINDICATOR.spawn(_level, BlockPos.containing(x + sx + ox, y_offset, z + sz + oz), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = SuperiorstructuresModEntities.ACOLYTE.get().spawn(_level, BlockPos.containing(x + sx + ox, y_offset, z + sz + oz), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.POOF, (x + sx + ox), y_offset, (z + sz + oz), 5, 0.2, 0.2, 0.2, 0.1);
					}
				}
			}
		}
	}
}
