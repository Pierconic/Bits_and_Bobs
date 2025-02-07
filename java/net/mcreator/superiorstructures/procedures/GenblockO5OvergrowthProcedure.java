package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

import java.util.List;
import java.util.Comparator;

public class GenblockO5OvergrowthProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String type = "";
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double count = 0;
		double ox = 0;
		double oy = 0;
		double oz = 0;
		double solids = 0;
		double carry_chance = 0;
		double alternative = 0;
		double intensity = 0;
		double archeology_chance = 0;
		double damage_chance = 0;
		boolean chisels = false;
		boolean update = false;
		boolean lichen = false;
		boolean aerate = false;
		boolean filler = false;
		boolean vines = false;
		boolean bonemeal = false;
		boolean inverted = false;
		boolean snowy = false;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			SuperiorstructuresMod.queueServerWork(2, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof ItemEntity) {
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						}
					}
				}
			});
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
			type = "none";
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("warm_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
				type = "coral";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean"))) {
				type = "ice";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_lukewarm_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lukewarm_ocean"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_ocean"))) {
				type = "kelp";
			}
			sx = -7;
			for (int index0 = 0; index0 < 15; index0++) {
				sy = -7;
				for (int index1 = 0; index1 < 15; index1++) {
					sz = -7;
					for (int index2 = 0; index2 < 15; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.VAULT) {
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										("/data merge block ~ ~ ~ {server_data:{state_updating_resumes_at:TESTIFICATE}}".replace("TESTIFICATE", new java.text.DecimalFormat("#############").format(world.getLevelData().getGameTime() + 20) + "L")));
						}
						if ((type).equals("kelp") && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:shipwreck_breakable"))) && Math.random() < 0.04) {
							PrismaticMossPatchProcedure.execute(world, x + sx, y + sy, z + sz);
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRAVEL && Math.random() < 0.01) {
							{
								BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
								BlockState _bs = SuperiorstructuresModBlocks.SUSPICIOUS_GRAVEL.get().defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Property<?> _propertyOld : _bso.getProperties()) {
									Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
									if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
										try {
											_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.CHISELED_BOOKSHELF) {
							LibrariansUniteProcedure.execute(world, x + sx, y + sy, z + sz);
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.RED_WOOL) {
							{
								BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
								BlockState _bs = Blocks.REDSTONE_BLOCK.defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Property<?> _propertyOld : _bso.getProperties()) {
									Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
									if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
										try {
											_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DROPPER) {
							{
								BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
								BlockState _bs = Blocks.OBSERVER.defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Property<?> _propertyOld : _bso.getProperties()) {
									Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
									if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
										try {
											_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BLUE_WOOL) {
							{
								BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
								BlockState _bs = Blocks.PRISMARINE_BRICKS.defaultBlockState();
								BlockState _bso = world.getBlockState(_bp);
								for (Property<?> _propertyOld : _bso.getProperties()) {
									Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
									if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
										try {
											_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
										} catch (Exception e) {
										}
								}
								world.setBlock(_bp, _bs, 3);
							}
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER && !(type).equals("ice")
								&& world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).isFaceSturdy(world, BlockPos.containing(x + sx, (y + sy) - 1, z + sz), Direction.UP) && Math.random() < 0.15) {
							if (Math.random() < 0.6) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SEAGRASS.defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.KELP.defaultBlockState(), 3);
								if (Math.random() < 0.7 && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.WATER) {
									world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.KELP.defaultBlockState(), 3);
									if (Math.random() < 0.6 && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 2, z + sz))).getBlock() == Blocks.WATER) {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 2, z + sz), Blocks.KELP.defaultBlockState(), 3);
										if (Math.random() < 0.5 && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 3, z + sz))).getBlock() == Blocks.WATER) {
											world.setBlock(BlockPos.containing(x + sx, y + sy + 3, z + sz), Blocks.KELP.defaultBlockState(), 3);
											if (Math.random() < 0.4 && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 4, z + sz))).getBlock() == Blocks.WATER) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 4, z + sz), Blocks.KELP.defaultBlockState(), 3);
												if (Math.random() < 0.3 && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 5, z + sz))).getBlock() == Blocks.WATER) {
													world.setBlock(BlockPos.containing(x + sx, y + sy + 5, z + sz), Blocks.KELP.defaultBlockState(), 3);
												}
											}
										}
									}
								}
							}
						}
						if (!(type).equals("ice") && Math.random() < 0.135) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PRISMARINE_BRICKS) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.MOSSY_PRISMARINE_BRICKS.get().defaultBlockState(), 3);
							} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PRISMARINE) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.MOSSY_PRISMARINE.get().defaultBlockState(), 3);
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if ((type).equals("kelp")) {
				LichenageProcedure.execute(world, x, y, z);
			}
			if ((type).equals("coral")) {
				CoralageProcedure.execute(world, x, y, z);
			}
			if ((type).equals("ice")) {
				FrostageProcedure.execute(world, x, y, z);
			}
		}
	}
}
