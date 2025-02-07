package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;
import net.mcreator.superiorstructures.entity.FallingSmashstoneEntity;

import java.util.List;
import java.util.Comparator;

public class FallingSmashstoneTickUpdateProcedure {
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
		entity.setDeltaMovement(new Vec3(0, (-0.55), 0));
		if (entity.isInWall()) {
			{
				Entity _ent = entity;
				_ent.teleportTo(x, (y + 1), z);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(x, (y + 1), z, _ent.getYRot(), _ent.getXRot());
			}
		}
		{
			final Vec3 _center = new Vec3(x, (y - 1.5), z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(1 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity && !(entityiterator instanceof FallingSmashstoneEntity)) {
					if (entityiterator.onGround()) {
						entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC)), 4);
						if (world instanceof ServerLevel _level) {
							(entityiterator instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).hurtAndBreak(10, _level, null, _stkprov -> {
							});
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone.break")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone.break")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						entityiterator.setDeltaMovement(new Vec3((Mth.nextDouble(RandomSource.create(), -0.5, 0.5)), (entity.getDeltaMovement().y()), (Mth.nextDouble(RandomSource.create(), -0.5, 0.5))));
					} else {
						entityiterator.setDeltaMovement(new Vec3((entityiterator.getDeltaMovement().x()), (entity.getDeltaMovement().y()), (entityiterator.getDeltaMovement().z())));
					}
				} else if (entityiterator instanceof ItemEntity) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.item.break")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.item.break")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (!entityiterator.level().isClientSide())
						entityiterator.discard();
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("forge:smashable")))) {
			{
				BlockPos _pos = BlockPos.containing(x, y - 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y - 1, z), null);
				world.destroyBlock(_pos, false);
			}
		} else if (world.getBlockState(BlockPos.containing(x, y - 1, z)).isFaceSturdy(world, BlockPos.containing(x, y - 1, z), Direction.UP)) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:smashstone.smash")), SoundSource.BLOCKS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:smashstone.smash")), SoundSource.BLOCKS, 1, 1, false);
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.STONE_BRICKS || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.STONE_BRICKS
					|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.INFESTED_STONE_BRICKS || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.INFESTED_MOSSY_STONE_BRICKS) {
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.CRACKED_STONE_BRICKS.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.NETHER_BRICKS) {
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.CRACKED_NETHER_BRICKS.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.END_STONE_BRICKS) {
				world.setBlock(BlockPos.containing(x, y - 1, z), SuperiorstructuresModBlocks.CRACKED_END_STONE_BRICKS.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_BRICKS) {
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.CRACKED_DEEPSLATE_BRICKS.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.POLISHED_BLACKSTONE_BRICKS) {
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.DEEPSLATE_TILES || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.RUNESTONE.get()) {
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.CRACKED_DEEPSLATE_TILES.defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.CRACKED_STONE_BRICKS || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.INFESTED_CRACKED_STONE_BRICKS) {
				world.setBlock(BlockPos.containing(x, y - 1, z), SuperiorstructuresModBlocks.STONE_RUBBLE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.CRACKED_DEEPSLATE_BRICKS) {
				world.setBlock(BlockPos.containing(x, y - 1, z), SuperiorstructuresModBlocks.DEEPSLATE_RUBBLE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS) {
				world.setBlock(BlockPos.containing(x, y - 1, z), SuperiorstructuresModBlocks.BLACKSTONE_RUBBLE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.CRACKED_NETHER_BRICKS) {
				world.setBlock(BlockPos.containing(x, y - 1, z), SuperiorstructuresModBlocks.NETHER_RUBBLE.get().defaultBlockState(), 3);
			}
			if (!entity.level().isClientSide())
				entity.discard();
			world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.SMASHING_SMASHSTONE.get().defaultBlockState(), 3);
		} else {
			{
				BlockPos _pos = BlockPos.containing(x, y - 1, z);
				Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x, y - 1, z), null);
				world.destroyBlock(_pos, false);
			}
		}
	}
}
