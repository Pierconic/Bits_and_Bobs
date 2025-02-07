package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

import java.util.List;
import java.util.Comparator;

public class GenblockI2SpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String type = "";
		BlockState primary_spread = Blocks.AIR.defaultBlockState();
		BlockState secondary_spread = Blocks.AIR.defaultBlockState();
		BlockState tertiary_spread = Blocks.AIR.defaultBlockState();
		BlockState special_spread = Blocks.AIR.defaultBlockState();
		BlockState side_1 = Blocks.AIR.defaultBlockState();
		BlockState side_2 = Blocks.AIR.defaultBlockState();
		BlockState side_3 = Blocks.AIR.defaultBlockState();
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double count = 0;
		double rando = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof ItemEntity) {
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
			type = "none";
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("warm_ocean"))) {
				type = "coral";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_ocean"))) {
				type = "ocean";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("cold_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_cold_ocean"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_river"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("stony_shore"))) {
				type = "ice";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_lukewarm_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lukewarm_ocean"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_ocean"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("beach"))) {
				type = "kelp";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_slopes"))) {
				type = "snow";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("desert"))) {
				type = "dune";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("badlands")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("eroded_badlands"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("wooded_badlands"))) {
				type = "mesa";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_pine_taiga"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("old_growth_spruce_taiga"))) {
				type = "forest";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sparse_jungle"))) {
				type = "jungle";
			}
			sx = -9;
			for (int index0 = 0; index0 < 18; index0++) {
				sy = -9;
				for (int index1 = 0; index1 < 18; index1++) {
					sz = -9;
					for (int index2 = 0; index2 < 18; index2++) {
						if (Math.random() < 0.2 && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable")))) {
							if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean"))
									|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_river"))
									|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_taiga"))) {
								RuinousTransformationProcedure.execute(world, x + sx, y + sy, z + sz);
							} else {
								RuinousTransformationMossyProcedure.execute(world, x + sx, y + sy, z + sz);
							}
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruin_replaceable"))) && Math.random() < 0.13) {
							if ((type).equals("coral") || (type).equals("kelp")) {
								if (Math.random() < 0.05) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.PYRAMID_SAND.get().defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SAND.defaultBlockState(), 3);
								}
							} else if ((type).equals("ocean") || (type).equals("ice")) {
								if (Math.random() < 0.05) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SUSPICIOUS_GRAVEL.get().defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.GRAVEL.defaultBlockState(), 3);
								}
							} else if ((type).equals("coral")) {
								if (Math.random() < 0.05) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.SUSPICIOUS_SAND.get().defaultBlockState(), 3);
								} else if (Math.random() < 0.2) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SAND.defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.RED_SAND.defaultBlockState(), 3);
								}
							} else {
								if ((type).equals("mesa")) {
									if (!world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
										if (Math.random() < 0.05) {
											world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.ANCIENT_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
										} else if (Math.random() < 0.2) {
											world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.DIRT.defaultBlockState(), 3);
										} else if (Math.random() < 0.4) {
											world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
										} else {
											world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.RED_SAND.defaultBlockState(), 3);
										}
									}
								} else if ((type).equals("snow")) {
									if (Math.random() < 0.05) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.ANCIENT_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
									} else if (Math.random() < 0.2) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.DIRT.defaultBlockState(), 3);
									} else if (Math.random() < 0.4) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.STONE_RUBBLE.get().defaultBlockState(), 3);
									} else {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.GRAVEL.defaultBlockState(), 3);
									}
								} else if ((type).equals("dune")) {
									if (Math.random() < 0.05) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.PYRAMID_SAND.get().defaultBlockState(), 3);
									} else if (Math.random() < 0.1) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.DIRT.defaultBlockState(), 3);
									} else if (Math.random() < 0.25) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
									} else {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SAND.defaultBlockState(), 3);
									}
								} else if ((type).equals("forest") || (type).equals("jungle")) {
									if (Math.random() < 0.05) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.ANCIENT_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
									} else if (Math.random() < 0.2) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.DIRT.defaultBlockState(), 3);
									} else if (Math.random() < 0.4) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
									} else {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.GRAVEL.defaultBlockState(), 3);
									}
								} else {
									if (Math.random() < 0.05) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.ANCIENT_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
									} else if (Math.random() < 0.2) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.MUD.defaultBlockState(), 3);
									} else if (Math.random() < 0.4) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.DIRT.defaultBlockState(), 3);
									} else {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
									}
								}
							}
						}
						if ((type).equals("snow") && Math.random() < 0.6 && world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).isFaceSturdy(world, BlockPos.containing(x + sx, y + sy, z + sz), Direction.UP)
								&& world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
							world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.SNOW.defaultBlockState(), 3);
						}
						if (!(type).equals("dune")
								&& ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DIRT || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.COARSE_DIRT)
								&& world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
							if (world.canSeeSkyFromBelowWater(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
								if ((type).equals("snow")) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
									world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.SNOW.defaultBlockState(), 3);
								} else if ((type).equals("jungle")) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.PODZOL.defaultBlockState(), 3);
									if (Math.random() < 0.1) {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.BAMBOO.defaultBlockState(), 3);
									} else if (Math.random() < 0.3) {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.FERN.defaultBlockState(), 3);
									} else if (Math.random() < 0.4) {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.SHORT_GRASS.defaultBlockState(), 3);
									}
								} else if ((type).equals("mesa")) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.RED_SAND.defaultBlockState(), 3);
									if (Math.random() < 0.15) {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.DEAD_BUSH.defaultBlockState(), 3);
									}
								} else {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.GRASS_BLOCK.defaultBlockState(), 3);
									if (Math.random() < 0.05) {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.POPPY.defaultBlockState(), 3);
									} else if (Math.random() < 0.1) {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.DANDELION.defaultBlockState(), 3);
									} else if (Math.random() < 0.6) {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.SHORT_GRASS.defaultBlockState(), 3);
									}
								}
							}
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:shipwreck_breakable")))
								&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:pottery")))
								&& !((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.CHEST) && Math.random() < 0.14) {
							if (y + sy <= 62 && world.getBiome(BlockPos.containing(x + sx, y + sy, z + sz)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:underwater_biomes")))) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.WATER.defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
							}
							count = count + 0.15;
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SAND && Math.random() < 0.04) {
							{
								BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
								BlockState _bs = SuperiorstructuresModBlocks.SUSPICIOUS_SAND.get().defaultBlockState();
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
						} else if (!(world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("jungle")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("sparse_jungle")))
								&& (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BAMBOO_MOSAIC) {
							{
								BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
								BlockState _bs = Blocks.SMOOTH_STONE.defaultBlockState();
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
						} else if (((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DIRT)
								&& Math.random() < 0.02) {
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
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRAVEL && Math.random() < 0.02) {
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
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.CUT_SANDSTONE && Math.random() < 0.1) {
							if (Math.random() < 0.2) {
								{
									BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
									BlockState _bs = Blocks.SAND.defaultBlockState();
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
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:pottery")))) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DECORATED_POT) {
								SmokingPotsProcedure.execute(world, x + sx, y + sy, z + sz);
							} else {
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
							}
							if (Math.random() < 0.8) {
								rando = Mth.nextInt(RandomSource.create(), 1, 7);
								if ((type).equals("dune")) {
									if (rando == 1) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.BONE).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 2) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.GREEN_DYE).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 3) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 4) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 5) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 6) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.SUGAR_CANE).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									}
								} else if ((type).equals("jungle")) {
									if (rando == 1) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.BONE).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 2) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.BROWN_DYE).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 3) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.REDSTONE).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 4) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.RAW_COPPER).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 5) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 6) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Blocks.BAMBOO).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.MELON_SEEDS).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									}
								} else if ((type).equals("kelp") || (type).equals("ice") || (type).equals("coral")) {
									if (rando == 1) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.BONE).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 2) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.DRIED_KELP).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 3) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.PRISMARINE_SHARD).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 4) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.RAW_COPPER).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 5) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 6) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.PRISMARINE_CRYSTALS).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.INK_SAC).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									}
								} else if ((type).equals("mesa")) {
									if (rando == 1) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.BONE).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 2) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.GREEN_DYE).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 3) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 4) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 5) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 6) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Blocks.DEAD_BUSH).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.BRICK).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									}
								} else if ((type).equals("snow")) {
									if (rando == 1) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.BONE).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 2) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.IRON_NUGGET).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 3) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.FLINT).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 4) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.RAW_IRON).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 5) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.EMERALD).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 6) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.BEETROOT).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.SNOWBALL).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									}
								} else {
									if (rando == 1) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.DRIED_KELP).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 2) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.FLINT).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 3) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 4) {
										if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
											ItemStack _setstack = new ItemStack(Items.RAW_COPPER).copy();
											_setstack.setCount(Mth.nextInt(RandomSource.create(), 2, 6));
											_itemHandlerModifiable.setStackInSlot(0, _setstack);
										}
									} else if (rando == 5) {
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
						}
						if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:underwater_biomes")))) {
							if (y + sy <= 62) {
								{
									BlockPos _pos = BlockPos.containing(x + sx, y + sy, z + sz);
									BlockState _bs = world.getBlockState(_pos);
									if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
										world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
								}
							} else if (y + sy > 62) {
								{
									BlockPos _pos = BlockPos.containing(x + sx, y + sy, z + sz);
									BlockState _bs = world.getBlockState(_pos);
									if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
										world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
								}
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			for (int index3 = 0; index3 < (int) Math.round(count * 0.6); index3++) {
				if (Math.random() < 0.5) {
					sx = Mth.nextInt(RandomSource.create(), 10, 20);
				} else {
					sx = Mth.nextInt(RandomSource.create(), -20, -10);
				}
				if (Math.random() < 0.5) {
					sz = Mth.nextInt(RandomSource.create(), 10, 20);
				} else {
					sz = Mth.nextInt(RandomSource.create(), -20, -10);
				}
				if ((type).equals("coral")) {
					primary_spread = Blocks.CUT_RED_SANDSTONE.defaultBlockState();
					secondary_spread = Blocks.RED_SANDSTONE.defaultBlockState();
					tertiary_spread = Blocks.CHISELED_RED_SANDSTONE.defaultBlockState();
					special_spread = Blocks.PRISMARINE_BRICKS.defaultBlockState();
					side_1 = Blocks.CUT_RED_SANDSTONE_SLAB.defaultBlockState();
					side_2 = Blocks.RED_SANDSTONE_SLAB.defaultBlockState();
					side_3 = Blocks.PRISMARINE_BRICK_SLAB.defaultBlockState();
				} else if ((type).equals("kelp")) {
					primary_spread = Blocks.CUT_SANDSTONE.defaultBlockState();
					secondary_spread = Blocks.SANDSTONE.defaultBlockState();
					tertiary_spread = Blocks.SMOOTH_SANDSTONE.defaultBlockState();
					special_spread = Blocks.PRISMARINE_BRICKS.defaultBlockState();
					side_1 = Blocks.CUT_SANDSTONE_SLAB.defaultBlockState();
					side_2 = Blocks.SANDSTONE_SLAB.defaultBlockState();
					side_3 = Blocks.PRISMARINE_BRICK_SLAB.defaultBlockState();
				} else if ((type).equals("ice")) {
					primary_spread = Blocks.STONE_BRICKS.defaultBlockState();
					secondary_spread = Blocks.COBBLESTONE.defaultBlockState();
					tertiary_spread = Blocks.CHISELED_STONE_BRICKS.defaultBlockState();
					special_spread = Blocks.DARK_PRISMARINE.defaultBlockState();
					side_1 = Blocks.STONE_BRICK_SLAB.defaultBlockState();
					side_2 = Blocks.COBBLESTONE_SLAB.defaultBlockState();
					side_3 = Blocks.DARK_PRISMARINE_SLAB.defaultBlockState();
				} else if ((type).equals("snow")) {
					primary_spread = Blocks.STONE_BRICKS.defaultBlockState();
					secondary_spread = Blocks.COBBLESTONE.defaultBlockState();
					tertiary_spread = Blocks.CHISELED_STONE_BRICKS.defaultBlockState();
					special_spread = Blocks.SMOOTH_STONE.defaultBlockState();
					side_1 = Blocks.STONE_BRICK_SLAB.defaultBlockState();
					side_2 = Blocks.COBBLESTONE_SLAB.defaultBlockState();
					side_3 = Blocks.SMOOTH_STONE_SLAB.defaultBlockState();
				} else if ((type).equals("dune")) {
					primary_spread = Blocks.CUT_SANDSTONE.defaultBlockState();
					secondary_spread = Blocks.SANDSTONE.defaultBlockState();
					tertiary_spread = Blocks.BRICKS.defaultBlockState();
					special_spread = Blocks.CHISELED_SANDSTONE.defaultBlockState();
					side_1 = Blocks.CUT_SANDSTONE_SLAB.defaultBlockState();
					side_2 = Blocks.SANDSTONE_SLAB.defaultBlockState();
					side_3 = Blocks.BRICK_SLAB.defaultBlockState();
				} else if ((type).equals("jungle")) {
					primary_spread = Blocks.MOSSY_STONE_BRICKS.defaultBlockState();
					secondary_spread = Blocks.MOSSY_COBBLESTONE.defaultBlockState();
					tertiary_spread = Blocks.CRACKED_STONE_BRICKS.defaultBlockState();
					special_spread = Blocks.CHISELED_STONE_BRICKS.defaultBlockState();
					side_1 = Blocks.MOSSY_STONE_BRICK_SLAB.defaultBlockState();
					side_2 = Blocks.MOSSY_COBBLESTONE_SLAB.defaultBlockState();
					side_3 = Blocks.STONE_BRICK_SLAB.defaultBlockState();
				} else if ((type).equals("forest")) {
					primary_spread = SuperiorstructuresModBlocks.TUFF_BRICKS.get().defaultBlockState();
					secondary_spread = SuperiorstructuresModBlocks.MOSSY_TUFF.get().defaultBlockState();
					tertiary_spread = SuperiorstructuresModBlocks.CRACKED_TUFF_BRICKS.get().defaultBlockState();
					special_spread = SuperiorstructuresModBlocks.CHISELED_TUFF.get().defaultBlockState();
					side_1 = SuperiorstructuresModBlocks.TUFF_BRICK_SLAB.get().defaultBlockState();
					side_2 = SuperiorstructuresModBlocks.TUFF_SLAB.get().defaultBlockState();
					side_3 = SuperiorstructuresModBlocks.POLISHED_TUFF_SLAB.get().defaultBlockState();
				} else if ((type).equals("mesa")) {
					primary_spread = Blocks.BRICKS.defaultBlockState();
					secondary_spread = Blocks.CUT_RED_SANDSTONE.defaultBlockState();
					tertiary_spread = Blocks.RED_SANDSTONE.defaultBlockState();
					special_spread = Blocks.TERRACOTTA.defaultBlockState();
					side_1 = Blocks.CUT_RED_SANDSTONE_SLAB.defaultBlockState();
					side_2 = Blocks.BRICK_SLAB.defaultBlockState();
					side_3 = Blocks.RED_SANDSTONE_SLAB.defaultBlockState();
				} else {
					primary_spread = Blocks.BRICKS.defaultBlockState();
					secondary_spread = Blocks.MUD_BRICKS.defaultBlockState();
					tertiary_spread = Blocks.PACKED_MUD.defaultBlockState();
					special_spread = Blocks.POLISHED_GRANITE.defaultBlockState();
					side_1 = Blocks.MUD_BRICK_SLAB.defaultBlockState();
					side_2 = Blocks.BRICK_SLAB.defaultBlockState();
					side_3 = Blocks.POLISHED_GRANITE_SLAB.defaultBlockState();
				}
				if (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz)).isFaceSturdy(world,
						BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Direction.UP)) {
					if (Math.random() < 0.6) {
						world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), primary_spread, 3);
					} else if (Math.random() < 0.5) {
						world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(secondary_spread, Direction.getRandom(RandomSource.create()))), 3);
					} else if (Math.random() < 0.5) {
						world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(tertiary_spread, Direction.getRandom(RandomSource.create()))), 3);
					} else {
						world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), special_spread, 3);
					}
					for (int index4 = 0; index4 < Mth.nextInt(RandomSource.create(), 1, 3); index4++) {
						if (Math.random() < 0.5) {
							sx = sx + Mth.nextInt(RandomSource.create(), 1, 2);
						} else {
							sx = sx + Mth.nextInt(RandomSource.create(), -2, -1);
						}
						if (Math.random() < 0.5) {
							sz = sz + Mth.nextInt(RandomSource.create(), 1, 2);
						} else {
							sz = sz + Mth.nextInt(RandomSource.create(), -2, -1);
						}
						if (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz)).isFaceSturdy(world,
								BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Direction.UP)) {
							if (Math.random() < 0.3) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), primary_spread, 3);
							} else if (Math.random() < 0.5) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), side_1, 3);
								{
									String _value = "bottom";
									BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz);
									BlockState _bs = world.getBlockState(_pos);
									if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
										world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
								}
							} else if (Math.random() < 0.3) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(secondary_spread, Direction.getRandom(RandomSource.create()))), 3);
							} else if (Math.random() < 0.5) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), side_2, 3);
								{
									String _value = "bottom";
									BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz);
									BlockState _bs = world.getBlockState(_pos);
									if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
										world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
								}
							} else {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), side_3, 3);
								{
									String _value = "bottom";
									BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz);
									BlockState _bs = world.getBlockState(_pos);
									if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
										world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
								}
							}
							if ((world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) + 1, z + sz))).getBlock() == Blocks.WATER) {
								{
									BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz);
									BlockState _bs = world.getBlockState(_pos);
									if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
										world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
								}
							}
						}
					}
				}
			}
			if ((type).equals("coral")) {
				CoralageProcedure.execute(world, x, y, z);
			}
			if ((type).equals("ice") && (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_river"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach")))) {
				FrostageProcedure.execute(world, x, y, z);
			}
		}
	}
}
