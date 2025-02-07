package net.mcreator.superiorstructures.procedures;

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

public class GenblockG2SpreadProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double count = 0;
		String wood = "";
		String type = "";
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(40 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
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
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.OAK_SLAB) {
				wood = "oak";
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.SPRUCE_SLAB) {
				wood = "spruce";
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.JUNGLE_SLAB) {
				wood = "jungle";
			} else if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.ACACIA_SLAB) {
				wood = "acacia";
			}
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("warm_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
				type = "coral";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("frozen_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_frozen_ocean"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("snowy_beach"))) {
				type = "ice";
			} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_lukewarm_ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lukewarm_ocean"))
					|| world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("ocean")) || world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("deep_ocean"))) {
				type = "kelp";
			}
			sx = -6;
			for (int index0 = 0; index0 < 12; index0++) {
				sy = -6;
				for (int index1 = 0; index1 < 12; index1++) {
					sz = -6;
					for (int index2 = 0; index2 < 12; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable"))) && Math.random() < 0.15 && !(type).equals("ice")) {
							RuinousTransformationMossyProcedure.execute(world, x + sx, y + sy, z + sz);
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:shipwreck_breakable")))
								&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:pottery"))) && Math.random() < 0.12) {
							if (y + sy <= 62 && world.getBiome(BlockPos.containing(x + sx, y + sy, z + sz)).is(TagKey.create(Registries.BIOME, ResourceLocation.parse("forge:underwater_biomes")))) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.WATER.defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
							}
							count = count + 0.15;
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
						} else if (y + sy <= 62) {
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
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			for (int index3 = 0; index3 < (int) Math.round(count); index3++) {
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
				if ((wood).equals("oak")) {
					if (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz)).isFaceSturdy(world,
							BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Direction.UP)) {
						if (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz)).canOcclude()) {
							if (Math.random() < 0.6) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.OAK_PLANKS.defaultBlockState(), 3);
							} else if (Math.random() < 0.5) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(Blocks.STRIPPED_OAK_LOG.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
							} else if (Math.random() < 0.5) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(Blocks.HAY_BLOCK.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
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
										world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.OAK_PLANKS.defaultBlockState(), 3);
									} else if (Math.random() < 0.5) {
										world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.OAK_SLAB.defaultBlockState(), 3);
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
										}.with(Blocks.STRIPPED_OAK_LOG.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
									} else if (Math.random() < 0.5) {
										world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(Blocks.HAY_BLOCK.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
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
				} else if ((wood).equals("spruce")) {
					if (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz)).isFaceSturdy(world,
							BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Direction.UP)) {
						if (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz)).canOcclude()) {
							if (Math.random() < 0.6) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
							} else if (Math.random() < 0.5) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
							} else if (Math.random() < 0.5) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(Blocks.RAW_IRON_BLOCK.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
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
										world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.SPRUCE_PLANKS.defaultBlockState(), 3);
									} else if (Math.random() < 0.5) {
										world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.SPRUCE_SLAB.defaultBlockState(), 3);
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
										}.with(Blocks.STRIPPED_SPRUCE_LOG.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
									} else if (Math.random() < 0.5) {
										world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(Blocks.IRON_ORE.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
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
				} else if ((wood).equals("jungle")) {
					if (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz)).isFaceSturdy(world,
							BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Direction.UP)) {
						if (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz)).canOcclude()) {
							if (Math.random() < 0.6) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.JUNGLE_PLANKS.defaultBlockState(), 3);
							} else if (Math.random() < 0.5) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(Blocks.STRIPPED_JUNGLE_LOG.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
							} else if (Math.random() < 0.5) {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
									public BlockState with(BlockState _bs, Direction newValue) {
										Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
										if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
											return _bs.setValue(_dp, newValue);
										_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
										return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
									}
								}.with(Blocks.REDSTONE_BLOCK.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.JUNGLE_SLAB.defaultBlockState(), 3);
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
										world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.JUNGLE_PLANKS.defaultBlockState(), 3);
									} else if (Math.random() < 0.5) {
										world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.JUNGLE_SLAB.defaultBlockState(), 3);
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
										}.with(Blocks.STRIPPED_JUNGLE_LOG.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
									} else if (Math.random() < 0.5) {
										world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
											public BlockState with(BlockState _bs, Direction newValue) {
												Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
												if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
													return _bs.setValue(_dp, newValue);
												_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
												return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
											}
										}.with(Blocks.REDSTONE_LAMP.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
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
				} else if ((wood).equals("acacia")) {
					if (world.getBlockState(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz)).isFaceSturdy(world,
							BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)) - 1, z + sz), Direction.UP)) {
						if (Math.random() < 0.6) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.ACACIA_PLANKS.defaultBlockState(), 3);
						} else if (Math.random() < 0.5) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(Blocks.STRIPPED_ACACIA_LOG.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
						} else if (Math.random() < 0.5) {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
								public BlockState with(BlockState _bs, Direction newValue) {
									Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
									if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
										return _bs.setValue(_dp, newValue);
									_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
									return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
								}
							}.with(Blocks.LAPIS_BLOCK.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
						} else {
							world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.ACACIA_SLAB.defaultBlockState(), 3);
						}
						for (int index7 = 0; index7 < Mth.nextInt(RandomSource.create(), 1, 3); index7++) {
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
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.ACACIA_PLANKS.defaultBlockState(), 3);
								} else if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), Blocks.ACACIA_SLAB.defaultBlockState(), 3);
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
									}.with(Blocks.STRIPPED_ACACIA_LOG.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
								} else if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx, world.getHeight(Heightmap.Types.OCEAN_FLOOR, (int) (x + sx), (int) (z + sz)), z + sz), (new Object() {
										public BlockState with(BlockState _bs, Direction newValue) {
											Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
											if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
												return _bs.setValue(_dp, newValue);
											_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
											return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
										}
									}.with(Blocks.LAPIS_ORE.defaultBlockState(), Direction.getRandom(RandomSource.create()))), 3);
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
			if ((type).equals("kelp")) {
				LichenageProcedure.execute(world, x, y, z);
			}
			if ((type).equals("coral")) {
				CoralageProcedure.execute(world, x, y, z);
			}
			if ((type).equals("ice")) {
				FrostageProcedure.execute(world, x, y, z);
			}
			if ((type).equals("kelp") || (type).equals("coral")) {
				sx = -12;
				for (int index8 = 0; index8 < 24; index8++) {
					sy = -6;
					for (int index9 = 0; index9 < 18; index9++) {
						sz = -12;
						for (int index10 = 0; index10 < 24; index10++) {
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
								if (!(type).equals("ice") && Math.random() < 0.12) {
									if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PRISMARINE_BRICKS) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.MOSSY_PRISMARINE_BRICKS.get().defaultBlockState(), 3);
									} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PRISMARINE) {
										world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.MOSSY_PRISMARINE.get().defaultBlockState(), 3);
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
