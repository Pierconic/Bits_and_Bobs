package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

public class HeartOfTheSeaSpawningProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		boolean blocked = false;
		double sx = 0;
		double sz = 0;
		double oy = 0;
		double attempts = 0;
		if (!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity) || new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if (Math.random() < 0.5) {
				sx = entity.getX() + Mth.nextDouble(RandomSource.create(), 15, 30);
			} else {
				sx = entity.getX() + Mth.nextDouble(RandomSource.create(), -30, -15);
			}
			if (Math.random() < 0.5) {
				sz = entity.getZ() + Mth.nextDouble(RandomSource.create(), 15, 30);
			} else {
				sz = entity.getZ() + Mth.nextDouble(RandomSource.create(), -30, -15);
			}
			oy = entity.getY();
			blocked = false;
			while (!blocked && attempts < 32) {
				if ((world.getBlockState(BlockPos.containing(sx, oy, sz))).getBlock() == Blocks.WATER && (world.getBlockState(BlockPos.containing(sx + 1, oy, sz + 1))).getBlock() == Blocks.WATER
						&& (world.getBlockState(BlockPos.containing(sx + 1, oy, sz))).getBlock() == Blocks.WATER && (world.getBlockState(BlockPos.containing(sx, oy, sz + 1))).getBlock() == Blocks.WATER
						&& (world.getBlockState(BlockPos.containing(sx, oy + 1, sz))).getBlock() == Blocks.WATER && (world.getBlockState(BlockPos.containing(sx + 1, oy + 1, sz + 1))).getBlock() == Blocks.WATER
						&& (world.getBlockState(BlockPos.containing(sx + 1, oy + 1, sz))).getBlock() == Blocks.WATER && (world.getBlockState(BlockPos.containing(sx, oy + 1, sz + 1))).getBlock() == Blocks.WATER
						&& !(!world.getEntitiesOfClass(Guardian.class, AABB.ofSize(new Vec3(sx, oy, sz), 12, 12, 12), e -> true).isEmpty())) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = EntityType.GUARDIAN.spawn(_level, BlockPos.containing(sx + 1, oy + 1, sz + 1), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setDeltaMovement(0, 0, 0);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.BUBBLE, (sx + 1), (oy + 1), (sz + 1), 25, 0.3, 0.3, 0.3, 0.15);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(sx + 1, oy + 1, sz + 1), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.elder_guardian.ambient")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound((sx + 1), (oy + 1), (sz + 1), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.elder_guardian.ambient")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					blocked = true;
				} else {
					if (Math.random() < 0.5) {
						sx = entity.getX() + Mth.nextDouble(RandomSource.create(), 15, 30);
					} else {
						sx = entity.getX() + Mth.nextDouble(RandomSource.create(), -30, -15);
					}
					if (Math.random() < 0.5) {
						sz = entity.getZ() + Mth.nextDouble(RandomSource.create(), 15, 30);
					} else {
						sz = entity.getZ() + Mth.nextDouble(RandomSource.create(), -30, -15);
					}
					oy = entity.getY() + Mth.nextDouble(RandomSource.create(), -10, 10);
					attempts = attempts + 1;
				}
			}
		}
	}
}
