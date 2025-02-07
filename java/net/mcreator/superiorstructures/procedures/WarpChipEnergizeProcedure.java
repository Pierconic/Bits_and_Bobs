package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.network.SuperiorstructuresModVariables;
import net.mcreator.superiorstructures.init.SuperiorstructuresModItems;
import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

public class WarpChipEnergizeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double Warpcost = 0;
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_WHITE.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPWhiteX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPWhiteY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPWhiteZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPWhiteZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPWhiteX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPWhiteDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPWhiteDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPWhiteDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPWhiteX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPWhiteY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPWhiteZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPWhiteX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPWhiteY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPWhiteZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_RED.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPRedX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPRedY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPRedZ == 0)) {
				Warpcost = Math
						.round(Math
								.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPRedZ)), 2)
										+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPRedX)), 2))
								/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPRedDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPRedDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPRedDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPRedX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPRedY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPRedZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPRedX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPRedY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPRedZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_ORANGE.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPOrangeX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPOrangeY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPOrangeZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPOrangeZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPOrangeX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPOrangeDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPOrangeDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPOrangeDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPOrangeX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPOrangeY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPOrangeZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPOrangeX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPOrangeY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPOrangeZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_YELLOW.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPYellowX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPYellowY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPYellowZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPYellowZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPYellowX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPYellowDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPYellowDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPYellowDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPYellowX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPYellowY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPYellowZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPYellowX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPYellowY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPYellowZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_LIME.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLimeX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLimeY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLimeZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLimeZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLimeX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLimeDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLimeDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLimeDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLimeX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLimeY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLimeZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLimeX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLimeY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLimeZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_GREEN.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGreenZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_LIGHT_BLUE.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLightBlueX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLightBlueY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLightBlueZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLightBlueZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLightBlueX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLightBlueDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLightBlueDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLightBlueDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLightBlueX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLightBlueY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLightBlueZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLightBlueX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLightBlueY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPLightBlueZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_CYAN.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPCyanX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPCyanY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPCyanZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPCyanZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPCyanX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPCyanDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPCyanDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPCyanDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPCyanX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPCyanY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPCyanZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPCyanX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPCyanY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPCyanZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_BLUE.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlueX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlueY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlueZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlueZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlueX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlueDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlueDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlueDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlueX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlueY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlueZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlueX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlueY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlueZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_PURPLE.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPurpleX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPurpleY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPurpleZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPurpleZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPurpleX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPurpleDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPurpleDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPurpleDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPurpleX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPurpleY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPurpleZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPurpleX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPurpleY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPurpleZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_MAGENTA.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPMagentaX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPMagentaY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPMagentaZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPMagentaZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPMagentaX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPMagentaDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPMagentaDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPMagentaDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPMagentaX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPMagentaY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPMagentaZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPMagentaX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPMagentaY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPMagentaZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_PINK.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPinkX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPinkY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPinkZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPinkZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPinkX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPinkDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPinkDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPinkDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPinkX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPinkY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPinkZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPinkX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPinkY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPPinkZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_BROWN.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBrownX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBrownY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBrownZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBrownX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBrownDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBrownDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBrownDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBrownX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBrownY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBrownZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBrownX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBrownY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBrownZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_GRAY.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPGrayZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_DARK_GRAY.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPDarkGrayX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPDarkGrayY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPDarkGrayZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPDarkGrayZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPDarkGrayX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPDarkGrayDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPDarkGrayDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPDarkGrayDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPDarkGrayX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPDarkGrayY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPDarkGrayZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPDarkGrayX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPDarkGrayY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPDarkGrayZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		} else if (itemstack.getItem() == SuperiorstructuresModItems.WARP_CHIP_BLACK.get()) {
			if (!(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlackX == 0) || !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlackY == 0)
					|| !(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlackZ == 0)) {
				Warpcost = Math.round(Math
						.sqrt(Math.pow(Math.abs(Math.abs(z) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlackZ)), 2)
								+ Math.pow(Math.abs(Math.abs(x) - Math.abs(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlackX)), 2))
						/ (world.getLevelData().getGameRules().getInt(SuperiorstructuresModGameRules.ENDERPORTER_COST)));
				if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD
						&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlackDimension == 0
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.NETHER
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlackDimension == 1
						|| (world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.END
								&& entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlackDimension == 2) {
					if ((entity instanceof Player _plr ? _plr.experienceLevel : 0) >= Warpcost) {
						if (entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).Warpcooldown > 0) {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 0;
								_vars.syncPlayerVariables(entity);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.enderman.teleport")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							{
								Entity _ent = entity;
								_ent.teleportTo(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlackX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlackY,
										entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlackZ);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlackX, entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlackY,
											entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES).EPBlackZ, _ent.getYRot(), _ent.getXRot());
							}
							if (entity instanceof Player _player)
								_player.giveExperienceLevels(-((int) Warpcost));
							if (world instanceof ServerLevel _level) {
								itemstack.hurtAndBreak(Mth.nextInt(RandomSource.create(), 1, 3), _level, null, _stkprov -> {
								});
							}
							SuperiorstructuresMod.queueServerWork(3, () -> {
								SecondaryTeleportProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
							});
						} else {
							{
								SuperiorstructuresModVariables.PlayerVariables _vars = entity.getData(SuperiorstructuresModVariables.PLAYER_VARIABLES);
								_vars.Warpcooldown = 100;
								_vars.syncPlayerVariables(entity);
							}
							if (entity instanceof Player _player && !_player.level().isClientSide())
								_player.displayClientMessage(Component.literal(("Warp to set location for null Levels?".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
						}
					} else {
						if (entity instanceof Player _player && !_player.level().isClientSide())
							_player.displayClientMessage(Component.literal(("Insufficent EXP ~ null Levels needed".replace("null", new java.text.DecimalFormat("##.##").format(Warpcost)))), true);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("superiorstructures:machinesenses")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level().isClientSide())
						_player.displayClientMessage(Component.literal("Cannot find Warp location in this dimension"), true);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Warp location has not been set."), true);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.stone_button.click_off")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
