package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

import java.util.List;
import java.util.Comparator;

public class GenblockI3SpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof ItemEntity && (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getItem() == Items.WHEAT_SEEDS) {
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					}
				}
			}
			if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.WATER.defaultBlockState(), 3);
			} else {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
			sx = -10;
			for (int index0 = 0; index0 < 20; index0++) {
				sy = -10;
				for (int index1 = 0; index1 < 16; index1++) {
					sz = -10;
					for (int index2 = 0; index2 < 20; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruin_replaceable"))) && Math.random() < 0.3) {
							if (world.getBiome(BlockPos.containing(x + sx, y + sy, z + sz)).is(ResourceLocation.parse("badlands")) || world.getBiome(BlockPos.containing(x + sx, y + sy, z + sz)).is(ResourceLocation.parse("plains"))
									|| world.getBiome(BlockPos.containing(x + sx, y + sy, z + sz)).is(ResourceLocation.parse("eroded_badlands")) || world.getBiome(BlockPos.containing(x + sx, y + sy, z + sz)).is(ResourceLocation.parse("plains"))
									|| world.getBiome(BlockPos.containing(x + sx, y + sy, z + sz)).is(ResourceLocation.parse("plains")) || world.getBiome(BlockPos.containing(x + sx, y + sy, z + sz)).is(ResourceLocation.parse("wooded_badlands"))) {
								if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PACKED_MUD || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.MUD_BRICKS
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BRICKS || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BRICK_WALL
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BRICK_STAIRS || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BRICK_SLAB) {
									if (Math.random() < 0.5) {
										if (Math.random() < 0.7) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.DIRT.defaultBlockState();
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
										} else {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = SuperiorstructuresModBlocks.ANCIENT_SUSPICIOUS_DIRT.get().defaultBlockState();
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
									} else {
										if (Math.random() < 0.65) {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.COARSE_DIRT.defaultBlockState();
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
										} else {
											{
												BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
												BlockState _bs = Blocks.GRAVEL.defaultBlockState();
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
									}
								}
							} else {
								if (Math.random() < 0.5) {
									if (Math.random() < 0.7) {
										{
											BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
											BlockState _bs = Blocks.DIRT.defaultBlockState();
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
									} else {
										{
											BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
											BlockState _bs = SuperiorstructuresModBlocks.ANCIENT_SUSPICIOUS_DIRT.get().defaultBlockState();
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
								} else {
									if (Math.random() < 0.65) {
										{
											BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
											BlockState _bs = Blocks.COARSE_DIRT.defaultBlockState();
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
									} else {
										{
											BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
											BlockState _bs = Blocks.GRAVEL.defaultBlockState();
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
								}
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable")))) {
							RuinousTransformationProcedure.execute(world, x + sx, y + sy, z + sz);
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("minecraft:wool"))) && Math.random() < 0.5) {
							{
								BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
								BlockState _bs = Blocks.AIR.defaultBlockState();
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
						} else if (((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SAND || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SANDSTONE)
								&& world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert")) && Math.random() < 0.05) {
							if (Math.random() < 0.06) {
								{
									BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
									BlockState _bs = SuperiorstructuresModBlocks.PYRAMID_SAND.get().defaultBlockState();
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
							} else if (Math.random() < 0.5) {
								{
									BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
									BlockState _bs = Blocks.SANDSTONE.defaultBlockState();
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
						} else if (((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DIRT
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRASS_BLOCK && Math.random() < 0.3
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.TERRACOTTA) && Math.random() < 0.1) {
							if (Math.random() < 0.5) {
								if (Math.random() < 0.06) {
									{
										BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
										BlockState _bs = SuperiorstructuresModBlocks.ANCIENT_SUSPICIOUS_DIRT.get().defaultBlockState();
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
								} else if (Math.random() < 0.5) {
									{
										BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
										BlockState _bs = Blocks.COARSE_DIRT.defaultBlockState();
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
								} else {
									{
										BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
										BlockState _bs = Blocks.GRAVEL.defaultBlockState();
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
							} else {
								if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sparse_jungle"))
										|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_taiga")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains"))
										|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("ice_spikes")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))
										|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
									if (Math.random() < 0.5) {
										{
											BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
											BlockState _bs = Blocks.COBBLESTONE.defaultBlockState();
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
									} else if (Math.random() < 0.5) {
										{
											BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
											BlockState _bs = Blocks.STONE_BRICKS.defaultBlockState();
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
									} else {
										{
											BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
											BlockState _bs = Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState();
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
								} else {
									if (Math.random() < 0.5) {
										{
											BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
											BlockState _bs = Blocks.TERRACOTTA.defaultBlockState();
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
									} else if (Math.random() < 0.5) {
										{
											BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
											BlockState _bs = Blocks.PACKED_MUD.defaultBlockState();
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
									} else {
										{
											BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
											BlockState _bs = Blocks.MUD_BRICKS.defaultBlockState();
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
								}
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:pottery")))) {
							if (Math.random() < 0.1) {
								if (Math.random() < 0.7) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SMALL_BROWN_POT.get().defaultBlockState(), 3);
								} else {
									if (Math.random() < 0.5) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.TALL_BROWN_POT.get().defaultBlockState(), 3);
									} else {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.LARGE_BROWN_POT.get().defaultBlockState(), 3);
									}
								}
							}
							if (Math.random() < 0.75) {
								if (Math.random() < 0.3) {
									if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
										ItemStack _setstack = new ItemStack(Items.ROTTEN_FLESH).copy();
										_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
										_itemHandlerModifiable.setStackInSlot(0, _setstack);
									}
								} else if (Math.random() < 0.3) {
									if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
										ItemStack _setstack = new ItemStack(Items.FLINT).copy();
										_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
										_itemHandlerModifiable.setStackInSlot(0, _setstack);
									}
								} else if (Math.random() < 0.3) {
									if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
										ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
										_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
										_itemHandlerModifiable.setStackInSlot(0, _setstack);
									}
								} else if (Math.random() < 0.3) {
									if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
										ItemStack _setstack = new ItemStack(Items.RAW_COPPER).copy();
										_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
										_itemHandlerModifiable.setStackInSlot(0, _setstack);
									}
								} else if (Math.random() < 0.3) {
									if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
										ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
										_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
										_itemHandlerModifiable.setStackInSlot(0, _setstack);
									}
								} else {
									if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
										ItemStack _setstack = new ItemStack(Items.BONE).copy();
										_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
										_itemHandlerModifiable.setStackInSlot(0, _setstack);
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
