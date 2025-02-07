package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import java.util.List;
import java.util.Comparator;

public class MoveBlockWestNoHoneyProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (WestPushCheckProcedure.execute(world, x, y, z) && !((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.HONEY_BLOCK)) {
			{
				BlockPos _pos = BlockPos.containing(x - 1, y, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x - 0.5, y + 0.5, z + 0.5), null);
				world.destroyBlock(_pos, false);
			}
			world.setBlock(BlockPos.containing(x - 1, y, z), (world.getBlockState(BlockPos.containing(x, y, z))), 3);
			{
				final Vec3 _center = new Vec3((x + 0.5), (y + 1.1), (z + 0.5));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					{
						Entity _ent = entityiterator;
						_ent.teleportTo((entityiterator.getX() - 0.5), (entityiterator.getY()), (entityiterator.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entityiterator.getX() - 0.5), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
					}
				}
			}
			{
				final Vec3 _center = new Vec3((x - 0.5), (y + 0.5), (z + 0.5));
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					{
						Entity _ent = entityiterator;
						_ent.teleportTo((entityiterator.getX() - 0.5), (entityiterator.getY()), (entityiterator.getZ()));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport((entityiterator.getX() - 0.5), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
					}
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, (x + 0.5), (y + 0.5), (z + 0.5), 5, 0.2, 0.2, 0.2, 0.1);
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
