package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

import java.util.Comparator;

public class CalmCorePulsingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_BLOCK_OF_GILDED_MACHINERY.get() || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.GOLD_BLOCK)
				&& ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_BLOCK_OF_GILDED_MACHINERY.get()
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.GOLD_BLOCK)
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_BLOCK_OF_GILDED_MACHINERY.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).getBlock() == Blocks.GOLD_BLOCK)
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_BLOCK_OF_GILDED_MACHINERY.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).getBlock() == Blocks.GOLD_BLOCK)
				&& ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_BLOCK_OF_GILDED_MACHINERY.get()
						|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.GOLD_BLOCK)
				&& ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_BLOCK_OF_GILDED_MACHINERY.get()
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.GOLD_BLOCK)
				&& ((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_BLOCK_OF_GILDED_MACHINERY.get()
						|| (world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).getBlock() == Blocks.GOLD_BLOCK)
				&& ((world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_BLOCK_OF_GILDED_MACHINERY.get()
						|| (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).getBlock() == Blocks.GOLD_BLOCK)
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.ACTIVATED_BLOCK_OF_GILDED_MACHINERY.get()
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.GOLD_BLOCK)) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			world.destroyBlock(BlockPos.containing(x, y - 1, z), false);
			world.destroyBlock(BlockPos.containing(x, y, z + 1), false);
			world.destroyBlock(BlockPos.containing(x, y - 1, z + 1), false);
			world.destroyBlock(BlockPos.containing(x, y, z - 1), false);
			world.destroyBlock(BlockPos.containing(x, y - 1, z - 1), false);
			world.destroyBlock(BlockPos.containing(x - 1, y, z), false);
			world.destroyBlock(BlockPos.containing(x - 1, y - 1, z), false);
			world.destroyBlock(BlockPos.containing(x + 1, y, z), false);
			world.destroyBlock(BlockPos.containing(x + 1, y - 1, z), false);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.GOLDEN_GOLEM.get().spawn(_level, BlockPos.containing(x, y - 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).isEmpty()) {
				if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/summon_iron_golem"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if (((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.FAKE_IRON.get() || (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.IRON_BLOCK
				|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.BLOCK_OF_OLD_MACHINERY.get())
				&& ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.FAKE_IRON.get() || (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.IRON_BLOCK
						|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.BLOCK_OF_OLD_MACHINERY.get())
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.FAKE_IRON.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.IRON_BLOCK
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.BLOCK_OF_OLD_MACHINERY.get())) {
			world.destroyBlock(BlockPos.containing(x - 1, y, z), false);
			world.destroyBlock(BlockPos.containing(x + 1, y, z), false);
			world.destroyBlock(BlockPos.containing(x, y - 1, z), false);
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.NEW_IRON_GOLEM.get().spawn(_level, BlockPos.containing(x, y - 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/summon_iron_golem"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
		if (((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.FAKE_IRON.get() || (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.IRON_BLOCK
				|| (world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.BLOCK_OF_OLD_MACHINERY.get())
				&& ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.FAKE_IRON.get() || (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.IRON_BLOCK
						|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.BLOCK_OF_OLD_MACHINERY.get())
				&& ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.FAKE_IRON.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.IRON_BLOCK
						|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == SuperiorstructuresModBlocks.BLOCK_OF_OLD_MACHINERY.get())) {
			world.destroyBlock(BlockPos.containing(x, y, z + 1), false);
			world.destroyBlock(BlockPos.containing(x, y, z - 1), false);
			world.destroyBlock(BlockPos.containing(x, y - 1, z), false);
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.NEW_IRON_GOLEM.get().spawn(_level, BlockPos.containing(x, y - 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).isEmpty()) {
				if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/summon_iron_golem"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.BLOCK_OF_BROKEN_MACHINERY.get()
				|| (world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.BLOCK_OF_BROKEN_MACHINERY.get()
				|| (world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.BLOCK_OF_BROKEN_MACHINERY.get()
				|| (world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.BLOCK_OF_BROKEN_MACHINERY.get()) {
			if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == SuperiorstructuresModBlocks.BLOCK_OF_BROKEN_MACHINERY.get()) {
				world.destroyBlock(BlockPos.containing(x, y, z + 1), false);
			} else if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == SuperiorstructuresModBlocks.BLOCK_OF_BROKEN_MACHINERY.get()) {
				world.destroyBlock(BlockPos.containing(x + 1, y, z), false);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == SuperiorstructuresModBlocks.BLOCK_OF_BROKEN_MACHINERY.get()) {
				world.destroyBlock(BlockPos.containing(x, y, z - 1), false);
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == SuperiorstructuresModBlocks.BLOCK_OF_BROKEN_MACHINERY.get()) {
				world.destroyBlock(BlockPos.containing(x - 1, y, z), false);
			}
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = SuperiorstructuresModEntities.COPPER_GOLEM.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.iron_golem.repair")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (!world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).isEmpty()) {
				if (((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof ServerPlayer _player) {
					AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("minecraft:adventure/summon_iron_golem"));
					if (_adv != null) {
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			}
		}
	}
}
