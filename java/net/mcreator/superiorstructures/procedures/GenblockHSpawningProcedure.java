package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.Difficulty;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModEntities;

public class GenblockHSpawningProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (!(world.getDifficulty() == Difficulty.PEACEFUL)) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
					if (Math.random() < 0.6) {
						if (Math.random() < 0.96) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = SuperiorstructuresModEntities.ACOLYTE.get().spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
								}
							}
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/summon minecraft:vindicator ~ ~ ~ {PersistenceRequired:1b,HandItems:[{id:iron_axe,Count:1}],HandDropChances:[0.05f]}");
						}
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CYAN_CONCRETE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/summon minecraft:illusioner ~ ~ ~ {PersistenceRequired:1b,HandItems:[{id:bow,Count:1}],HandDropChances:[0.05f]}");
				} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LIGHT_BLUE_CONCRETE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 2); index0++) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = EntityType.ALLAY.spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.BLUE_CONCRETE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"/summon minecraft:ravager ~ ~ ~ {PersistenceRequired:1b}");
				} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.BLACK_CONCRETE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.3) {
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = SuperiorstructuresModEntities.ACOLYTE.get().spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
							}
						}
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon minecraft:vindicator ~ ~ ~ {PersistenceRequired:1b,HandItems:[{id:iron_axe,Count:1}],HandDropChances:[0.05f]}");
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.YELLOW_CONCRETE) {
					if (Math.random() < 0.1) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon minecraft:evoker ~ ~ ~ {PersistenceRequired:1b,HandDropChances:[0.50f,0.50f],HandItems:{id:totem_of_undying,Count:1b}]}");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon minecraft:evoker ~ ~ ~ {PersistenceRequired:1b}");
					}
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
				} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.PURPLE_CONCRETE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.1) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon minecraft:evoker ~ ~ ~ {PersistenceRequired:1b,HandDropChances:[0.50f,0.50f],HandItems:[{id:\"superiorstructures:totem_of_restoration\",Count:1b},{id:totem_of_undying,Count:1b}]}");
					} else if (Math.random() < 0.1) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon minecraft:evoker ~ ~ ~ {PersistenceRequired:1b,HandDropChances:[0.50f,0.50f],HandItems:[{id:\"superiorstructures:totem_of_vanishing\",Count:1b},{id:totem_of_undying,Count:1b}]}");
					} else if (Math.random() < 0.05) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon minecraft:evoker ~ ~ ~ {PersistenceRequired:1b,HandDropChances:[0.50f,0.50f],HandItems:[{id:\"superiorstructures:totem_of_leagues\",Count:1b},{id:totem_of_undying,Count:1b}]}");
					} else if (Math.random() < 0.05) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon minecraft:evoker ~ ~ ~ {PersistenceRequired:1b,HandDropChances:[0.50f,0.50f],HandItems:[{id:\"superiorstructures:totem_of_invocation\",Count:1b},{id:totem_of_undying,Count:1b}]}");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon minecraft:evoker ~ ~ ~ {PersistenceRequired:1b,HandItems:[{id:totem_of_undying,Count:1}],HandDropChances:[1.00f]}");
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.RED_CONCRETE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.1) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon minecraft:vindicator ~ ~ ~ {HandDropChances:[0.50f,0.50f],HandItems:[{id:golden_axe,Count:1b},{id:\"superiorstructures:totem_of_leagues\",Count:1b}]}");
					} else if (Math.random() < 0.1) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon minecraft:vindicator ~ ~ ~ {HandDropChances:[0.50f,0.50f],HandItems:[{id:golden_axe,Count:1b},{id:\"superiorstructures:totem_of_vanishing\",Count:1b}]}");
					} else if (Math.random() < 0.1) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon minecraft:vindicator ~ ~ ~ {HandDropChances:[0.50f,0.50f],HandItems:[{id:golden_axe,Count:1b},{id:\"superiorstructures:totem_of_power\",Count:1b}]}");
					} else {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
									"/summon minecraft:vindicator ~ ~ ~ {HandDropChances:[0.50f,0.50f],HandItems:[{id:golden_axe,Count:1b},{id:totem_of_undying,Count:1b}]}");
					}
				} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.BROWN_CONCRETE) {
					world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
					if (Math.random() < 0.55) {
						if (Math.random() < 0.2) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/summon minecraft:villager ~ ~ ~ {VillagerData:{type:plains}}");
						} else if (Math.random() < 0.2) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/summon minecraft:villager ~ ~ ~ {VillagerData:{type:taiga}}");
						} else if (Math.random() < 0.2) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/summon minecraft:villager ~ ~ ~ {VillagerData:{type:snow}}");
						} else if (Math.random() < 0.9) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/summon minecraft:villager ~ ~ ~ {VillagerData:{type:savanna}}");
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/summon minecraft:villager ~ ~ ~ {VillagerData:{type:swamp}}");
						}
					} else if (Math.random() < 0.65) {
						if (Math.random() < 0.2) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/summon minecraft:zombie_villager ~ ~ ~ {VillagerData:{type:plains}}");
						} else if (Math.random() < 0.2) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/summon minecraft:zombie_villager ~ ~ ~ {VillagerData:{type:taiga}}");
						} else if (Math.random() < 0.2) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/summon minecraft:zombie_villager ~ ~ ~ {VillagerData:{type:snow}}");
						} else if (Math.random() < 0.9) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/summon minecraft:zombie_villager ~ ~ ~ {VillagerData:{type:savanna}}");
						} else {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + 0.5), y, (z + 0.5)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"/summon minecraft:zombie_villager ~ ~ ~ {VillagerData:{type:swamp}}");
						}
					} else {
						if (Math.random() < 0.15) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.VINDICATOR.spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else if (Math.random() < 0.15) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.WITCH.spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else if (Math.random() < 0.15) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.WANDERING_TRADER.spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else if (Math.random() < 0.15) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.FROG.spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else if (Math.random() < 0.15) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.CAT.spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else if (Math.random() < 0.15) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.CHICKEN.spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						} else {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.PILLAGER.spawn(_level, BlockPos.containing(x + 0.5, y, z + 0.5), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setDeltaMovement(0, 0, 0);
								}
							}
						}
					}
				}
			} else {
				world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.AIR.defaultBlockState(), 3);
			}
		}
	}
}
