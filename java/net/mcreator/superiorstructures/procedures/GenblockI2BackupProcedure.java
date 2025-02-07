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

public class GenblockI2BackupProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double count = 0;
		String type = "";
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(60 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof ItemEntity && (entityiterator instanceof ItemEntity _itemEnt ? _itemEnt.getItem() : ItemStack.EMPTY).getItem() == Blocks.KELP.asItem()) {
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
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("warm_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
				type = "coral";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("cold_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_cold_ocean"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_river"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("stony_shore"))) {
				type = "ice";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_lukewarm_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lukewarm_ocean"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_ocean"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("beach"))) {
				type = "kelp";
			}
			sx = -8;
			for (int index0 = 0; index0 < 16; index0++) {
				sy = -6;
				for (int index1 = 0; index1 < 12; index1++) {
					sz = -8;
					for (int index2 = 0; index2 < 16; index2++) {
						if (Math.random() < 0.2 && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable")))) {
							if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean"))
									|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_river"))
									|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_plains")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_taiga"))) {
								RuinousTransformationProcedure.execute(world, x + sx, y + sy, z + sz);
							} else {
								RuinousTransformationMossyProcedure.execute(world, x + sx, y + sy, z + sz);
							}
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:shipwreck_breakable")))
								&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:pottery")))
								&& !((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.CHEST) && Math.random() < 0.2) {
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
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DIRT && Math.random() < 0.02) {
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
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SEA_LANTERN && Math.random() < 0.4) {
							if (y + sy <= 62 && world.getBiome(BlockPos.containing(x + sx, y + sy, z + sz)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:underwater_biomes")))) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.WATER.defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:pottery")))) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DECORATED_POT) {
								SmokingPotsProcedure.execute(world, x + sx, y + sy, z + sz);
							}
							if (Math.random() < 0.75) {
								if (Math.random() < 0.3) {
									if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
										ItemStack _setstack = new ItemStack(Items.DRIED_KELP).copy();
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
					if (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz)).isFaceSturdy(world,
							BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Direction.UP)) {
						if (Math.random() < 0.6) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.CUT_RED_SANDSTONE.defaultBlockState(), 3);
						} else if (Math.random() < 0.5) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(Blocks.RED_SANDSTONE.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
						} else if (Math.random() < 0.5) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(Blocks.CHISELED_RED_SANDSTONE.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
						} else {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.PRISMARINE_BRICKS.defaultBlockState(), 3);
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
								if (Math.random() < 0.4) {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.CUT_RED_SANDSTONE.defaultBlockState(), 3);
								} else if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.CUT_RED_SANDSTONE_SLAB.defaultBlockState(), 3);
									{
										String _value = "bottom";
										BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz);
										BlockState _bs = world.getBlockState(_pos);
										if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
											world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
									}
									if (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) <= 63) {
										{
											BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
												world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
										}
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
									}.with(Blocks.RED_SANDSTONE.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
								} else if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(Blocks.CHISELED_RED_SANDSTONE.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.PRISMARINE_BRICK_SLAB.defaultBlockState(), 3);
									{
										String _value = "bottom";
										BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz);
										BlockState _bs = world.getBlockState(_pos);
										if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
											world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
									}
									if (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) <= 63) {
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
				} else if ((type).equals("kelp")) {
					if (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz)).isFaceSturdy(world,
							BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Direction.UP)) {
						if (Math.random() < 0.6) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.SANDSTONE.defaultBlockState(), 3);
						} else if (Math.random() < 0.5) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(Blocks.CUT_SANDSTONE.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
						} else if (Math.random() < 0.5) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(Blocks.CHISELED_SANDSTONE.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
						} else {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.PRISMARINE_BRICKS.defaultBlockState(), 3);
						}
						for (int index5 = 0; index5 < Mth.nextInt(RandomSource.create(), 1, 3); index5++) {
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
								if (Math.random() < 0.4) {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.SANDSTONE.defaultBlockState(), 3);
								} else if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.CUT_SANDSTONE_SLAB.defaultBlockState(), 3);
									{
										String _value = "bottom";
										BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz);
										BlockState _bs = world.getBlockState(_pos);
										if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
											world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
									}
									if (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) <= 63) {
										{
											BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
												world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
										}
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
									}.with(Blocks.CHISELED_SANDSTONE.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
								} else if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(Blocks.CUT_SANDSTONE.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.PRISMARINE_BRICK_SLAB.defaultBlockState(), 3);
									{
										String _value = "bottom";
										BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz);
										BlockState _bs = world.getBlockState(_pos);
										if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
											world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
									}
									if (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) <= 63) {
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
				} else if ((type).equals("ice")) {
					if (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz)).isFaceSturdy(world,
							BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Direction.UP)) {
						if (Math.random() < 0.6) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.STONE_BRICKS.defaultBlockState(), 3);
						} else if (Math.random() < 0.5) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(Blocks.COBBLESTONE.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
						} else if (Math.random() < 0.5) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(Blocks.CHISELED_STONE_BRICKS.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
						} else {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.PRISMARINE_BRICKS.defaultBlockState(), 3);
						}
						for (int index6 = 0; index6 < Mth.nextInt(RandomSource.create(), 1, 3); index6++) {
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
								if (Math.random() < 0.4) {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.COBBLESTONE.defaultBlockState(), 3);
								} else if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.STONE_BRICK_SLAB.defaultBlockState(), 3);
									{
										String _value = "bottom";
										BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz);
										BlockState _bs = world.getBlockState(_pos);
										if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
											world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
									}
									if (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) <= 63) {
										{
											BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz);
											BlockState _bs = world.getBlockState(_pos);
											if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
												world.setBlock(_pos, _bs.setValue(_booleanProp, true), 3);
										}
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
									}.with(Blocks.STONE_BRICKS.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
								} else if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(Blocks.CHISELED_STONE_BRICKS.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.PRISMARINE_BRICK_SLAB.defaultBlockState(), 3);
									{
										String _value = "bottom";
										BlockPos _pos = BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz);
										BlockState _bs = world.getBlockState(_pos);
										if (_bs.getBlock().getStateDefinition().getProperty("type") instanceof EnumProperty _enumProp && _enumProp.getValue(_value).isPresent())
											world.setBlock(_pos, _bs.setValue(_enumProp, (Enum) _enumProp.getValue(_value).get()), 3);
									}
									if (world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) <= 63) {
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
				}
			}
			if ((type).equals("coral")) {
				CoralageProcedure.execute(world, x, y, z);
			}
			if ((type).equals("ice") && (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_river"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach")))) {
				FrostageProcedure.execute(world, x, y, z);
			}
			if (!(world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_river"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach")))) {
				sx = -12;
				for (int index7 = 0; index7 < 24; index7++) {
					sy = -6;
					for (int index8 = 0; index8 < 18; index8++) {
						sz = -12;
						for (int index9 = 0; index9 < 24; index9++) {
							if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER
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
