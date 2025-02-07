package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameType;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.EnchantmentTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Holder;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.client.Minecraft;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;
import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;

import java.util.List;
import java.util.Comparator;

public class GeneralizedReinforcementSpawnerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		boolean aquatic = false;
		boolean large = false;
		double sx = 0;
		double sz = 0;
		double ox = 0;
		double oy = 0;
		double oz = 0;
		double y_offset = 0;
		double repeat_max = 0;
		double repeat_min = 0;
		double count = 0;
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
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(16 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof Monster) {
						count = count + 1;
					}
				}
			}
			if (count < 10) {
				if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).CurseType == 2) {
					repeat_min = 3;
					repeat_max = 6;
				} else if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).CurseType == 1) {
					repeat_min = 2;
					repeat_max = 4;
				} else {
					repeat_min = 2;
					repeat_max = 3;
				}
				sx = Mth.nextInt(RandomSource.create(), -22, 22);
				sz = Mth.nextInt(RandomSource.create(), -22, 22);
				if ((sx) > (0) && (sx) < (11)) {
					sx = 11;
				} else if ((sx) > ((-11)) && (sx) < (0)) {
					sx = -11;
				}
				if ((sz) > (0) && (sz) < (11)) {
					sz = 11;
				} else if ((sz) > ((-11)) && (sz) < (0)) {
					sz = -11;
				}
				for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), (int) repeat_min, (int) repeat_max); index0++) {
					ox = Mth.nextInt(RandomSource.create(), -3, 3);
					oz = Mth.nextInt(RandomSource.create(), -3, 3);
					oy = 0;
					found = false;
					for (int index1 = 0; index1 < 12; index1++) {
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
					if (found && entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).CurseType == 1) {
						if (Math.random() < 0.01) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.EVOKER.spawn(_level, BlockPos.containing(x + sx + ox, y_offset, z + sz + oz), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
							if (!world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
								if (Math.random() < 0.3) {
									if (Math.random() < 0.1) {
										if (((Entity) world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity) {
											ItemStack _setstack = new ItemStack(Items.TOTEM_OF_UNDYING).copy();
											_setstack.setCount(1);
											_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
											if (_entity instanceof Player _player)
												_player.getInventory().setChanged();
										}
									} else if (Math.random() < 0.5) {
										if (((Entity) world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity) {
											ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.TOTEM_OF_VANISHING.get()).copy();
											_setstack.setCount(1);
											_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
											if (_entity instanceof Player _player)
												_player.getInventory().setChanged();
										}
									} else {
										if (((Entity) world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity) {
											ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.TOTEM_OF_RESTORATION.get()).copy();
											_setstack.setCount(1);
											_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
											if (_entity instanceof Player _player)
												_player.getInventory().setChanged();
										}
									}
								}
							}
						} else if (Math.random() < 0.1) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.VINDICATOR.spawn(_level, BlockPos.containing(x + sx + ox, y_offset, z + sz + oz), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
							if (!world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
								if (Math.random() < 0.1) {
									if (((Entity) world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity) {
										ItemStack _setstack = (EnchantmentHelper.enchantItem(world.getRandom(), new ItemStack(Items.GOLDEN_AXE), 15,
												(true)
														? world.registryAccess().registryOrThrow(Registries.ENCHANTMENT).holders().map(reference -> (Holder<Enchantment>) reference)
														: world.registryAccess().registryOrThrow(Registries.ENCHANTMENT).getTag(EnchantmentTags.IN_ENCHANTING_TABLE).get().stream()))
												.copy();
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
								} else {
									if (((Entity) world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity) {
										ItemStack _setstack = new ItemStack(Items.IRON_AXE).copy();
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
								}
								if (Math.random() < 0.2) {
									if (Math.random() < 0.1) {
										if (((Entity) world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity) {
											ItemStack _setstack = new ItemStack(Items.TOTEM_OF_UNDYING).copy();
											_setstack.setCount(1);
											_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
											if (_entity instanceof Player _player)
												_player.getInventory().setChanged();
										}
									} else if (Math.random() < 0.5) {
										if (((Entity) world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity) {
											ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.TOTEM_OF_POWER.get()).copy();
											_setstack.setCount(1);
											_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
											if (_entity instanceof Player _player)
												_player.getInventory().setChanged();
										}
									} else {
										if (((Entity) world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
											Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
												return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
											}
										}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity) {
											ItemStack _setstack = new ItemStack(SuperiorstructuresModItems.TOTEM_OF_RESTORATION.get()).copy();
											_setstack.setCount(1);
											_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
											if (_entity instanceof Player _player)
												_player.getInventory().setChanged();
										}
									}
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
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x + sx + ox, y_offset, z + sz + oz), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.vex.ambient")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound((x + sx + ox), y_offset, (z + sz + oz), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.vex.ambient")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else if (found && entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).CurseType == 2) {
						if (Math.random() < 0.05) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.VINDICATOR.spawn(_level, BlockPos.containing(x + sx + ox, y_offset, z + sz + oz), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
							if (!world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
								if (Math.random() < 0.1) {
									if (((Entity) world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity) {
										ItemStack _setstack = (EnchantmentHelper.enchantItem(world.getRandom(), new ItemStack(Items.GOLDEN_AXE), 15,
												(true)
														? world.registryAccess().registryOrThrow(Registries.ENCHANTMENT).holders().map(reference -> (Holder<Enchantment>) reference)
														: world.registryAccess().registryOrThrow(Registries.ENCHANTMENT).getTag(EnchantmentTags.IN_ENCHANTING_TABLE).get().stream()))
												.copy();
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
								} else {
									if (((Entity) world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity) {
										ItemStack _setstack = new ItemStack(Items.IRON_AXE).copy();
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.PILLAGER.spawn(_level, BlockPos.containing(x + sx + ox, y_offset, z + sz + oz), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
							if (!world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) {
								if (Math.random() < 0.1) {
									if (((Entity) world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity) {
										ItemStack _setstack = (EnchantmentHelper.enchantItem(world.getRandom(), new ItemStack(Items.CROSSBOW), 15,
												(true)
														? world.registryAccess().registryOrThrow(Registries.ENCHANTMENT).holders().map(reference -> (Holder<Enchantment>) reference)
														: world.registryAccess().registryOrThrow(Registries.ENCHANTMENT).getTag(EnchantmentTags.IN_ENCHANTING_TABLE).get().stream()))
												.copy();
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
								} else {
									if (((Entity) world.getEntitiesOfClass(Vindicator.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
										Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
											return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
										}
									}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof LivingEntity _entity) {
										ItemStack _setstack = new ItemStack(Items.CROSSBOW).copy();
										_setstack.setCount(1);
										_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
										if (_entity instanceof Player _player)
											_player.getInventory().setChanged();
									}
								}
							}
						}
						if (world instanceof ServerLevel _level)
							_level.sendParticles(ParticleTypes.POOF, (x + sx + ox), y_offset, (z + sz + oz), 5, 0.2, 0.2, 0.2, 0.1);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x + sx + ox, y_offset, z + sz + oz), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.vex.ambient")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound((x + sx + ox), y_offset, (z + sz + oz), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.vex.ambient")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					} else if (found && entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).CurseType == 3
							&& (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER) {
						if (Math.random() < 0.2) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.BLAZE.spawn(_level, BlockPos.containing(x + sx + ox, y_offset, z + sz + oz), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.WITHER_SKELETON.spawn(_level, BlockPos.containing(x + sx + ox, y_offset, z + sz + oz), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						}
					}
				}
			}
		}
	}
}
