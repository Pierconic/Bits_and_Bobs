package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

import java.util.List;
import java.util.Comparator;

public class GenblockD2SpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			SuperiorstructuresMod.queueServerWork(5, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(24 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof ItemEntity) {
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						}
					}
				}
			});
			world.setBlock(BlockPos.containing(x, y, z), (world.getBlockState(BlockPos.containing(x + 1, y, z))), 3);
			if ((world instanceof Level _lvl ? _lvl.dimension() : (world instanceof WorldGenLevel _wgl ? _wgl.getLevel().dimension() : Level.OVERWORLD)) == Level.OVERWORLD) {
				sx = -12;
				for (int index0 = 0; index0 < 24; index0++) {
					sy = -10;
					for (int index1 = 0; index1 < 14; index1++) {
						sz = -12;
						for (int index2 = 0; index2 < 24; index2++) {
							if (sy <= -8 || (sx <= -9 || sx >= 9) && (sz <= -9 || sz >= 9)) {
								if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:soul_sand_replaceable")))) {
									if (Math.random() < 0.05) {
										if (Math.random() < 0.1) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.SOUL_SOIL.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										} else {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.SOUL_SAND.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:netherack_replaceable")))) {
									if (Math.random() < 0.05) {
										if (Math.random() < 0.05) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = SuperiorstructuresModBlocks.SUSPICIOUS_NETHERRACK.get().defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										} else if (Math.random() < 0.1) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.MAGMA_BLOCK.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										} else {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.NETHERRACK.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.SUSPICIOUS_STONE.get()
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STONE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRANITE
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DIORITE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.ANDESITE
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SANDSTONE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.RED_SANDSTONE) {
									if (Math.random() < 0.05) {
										if (Math.random() < 0.05) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.MAGMA_BLOCK.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										} else {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.BLACKSTONE.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										}
									}
								}
							} else if (sy <= -8 || sx <= -9 || sx >= 9 || sz <= -9 || sz >= 9) {
								if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:soul_sand_replaceable")))) {
									if (Math.random() < 0.2) {
										if (Math.random() < 0.1) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.SOUL_SOIL.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										} else {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.SOUL_SAND.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:netherack_replaceable")))) {
									if (Math.random() < 0.2) {
										if (Math.random() < 0.05) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = SuperiorstructuresModBlocks.SUSPICIOUS_NETHERRACK.get().defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										} else {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.NETHERRACK.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.SUSPICIOUS_STONE.get()
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STONE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRANITE
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DIORITE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.ANDESITE
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SANDSTONE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.RED_SANDSTONE) {
									if (Math.random() < 0.2) {
										if (Math.random() < 0.05) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.MAGMA_BLOCK.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										} else {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.BLACKSTONE.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										}
									}
								}
							} else if (sy <= -5 || sx <= -7 || sx >= 7 || sz <= -7 || sz >= 7) {
								if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:soul_sand_replaceable")))) {
									if (Math.random() < 0.4) {
										if (Math.random() < 0.2) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.SOUL_SOIL.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										} else {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.SOUL_SAND.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:netherack_replaceable")))) {
									if (Math.random() < 0.4) {
										if (Math.random() < 0.05) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = SuperiorstructuresModBlocks.SUSPICIOUS_NETHERRACK.get().defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										} else {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.NETHERRACK.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.SUSPICIOUS_STONE.get()
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STONE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRANITE
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DIORITE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.ANDESITE
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SANDSTONE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.RED_SANDSTONE) {
									if (Math.random() < 0.4) {
										if (Math.random() < 0.05) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.MAGMA_BLOCK.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										} else {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.BLACKSTONE.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										}
									}
								}
							} else {
								if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:soul_sand_replaceable")))) {
									if (Math.random() < 0.9) {
										if (Math.random() < 0.3) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.SOUL_SOIL.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										} else {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.SOUL_SAND.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:netherack_replaceable")))) {
									if (Math.random() < 0.9) {
										if (Math.random() < 0.05) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = SuperiorstructuresModBlocks.SUSPICIOUS_NETHERRACK.get().defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										} else {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.NETHERRACK.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										}
									}
								} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.SUSPICIOUS_STONE.get()
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STONE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRANITE
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DIORITE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.ANDESITE
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SANDSTONE || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.RED_SANDSTONE) {
									if (Math.random() < 0.9) {
										if (Math.random() < 0.1) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.MAGMA_BLOCK.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										} else {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.BLACKSTONE.defaultBlockState();
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
											if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SNOW) {
												world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
											}
										}
									}
								}
							}
							sz = sz + 1;
						}
						sy = sy + 1;
					}
					sx = sx + 1;
				}
			}
		}
	}
}
