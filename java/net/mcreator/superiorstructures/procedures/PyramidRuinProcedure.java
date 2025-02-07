package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;
import net.mcreator.superiorstructures.SuperiorstructuresMod;

import java.util.List;
import java.util.Comparator;

public class PyramidRuinProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double number = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS)) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			SuperiorstructuresMod.queueServerWork(3, () -> {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(35 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
					for (Entity entityiterator : _entfound) {
						if (entityiterator instanceof ItemEntity) {
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						}
					}
				}
			});
			sx = -12;
			for (int index0 = 0; index0 < 24; index0++) {
				sy = -12;
				for (int index1 = 0; index1 < 24; index1++) {
					sz = -12;
					for (int index2 = 0; index2 < 24; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() instanceof SimpleWaterloggedBlock && !((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.IRON_BARS)
								&& !(((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SMOOTH_SANDSTONE_STAIRS
										|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SMOOTH_SANDSTONE_SLAB)
										&& (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.WATER)) {
							{
								BlockPos _pos = BlockPos.containing(x + sx, y + sy, z + sz);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
									world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
							}
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DECORATED_POT) {
							SmokingPotsProcedure.execute(world, x + sx, y + sy, z + sz);
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SANDSTONE) {
							if (Math.random() < 0.07 && world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).canOcclude()) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SAND.defaultBlockState(), 3);
							} else if (Math.random() < 0.09 && world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).canOcclude()) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.INFESTED_SANDSTONE.get().defaultBlockState(), 3);
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.MOSS_BLOCK) {
							if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
								if (Math.random() < 0.55) {
									number = Mth.nextInt(RandomSource.create(), 1, 8);
									if (number == 1) {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AZURE_BLUET.defaultBlockState(), 3);
									} else if (number == 2) {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.FERN.defaultBlockState(), 3);
									} else if (number == 3) {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.BLUE_ORCHID.defaultBlockState(), 3);
									} else if (number == 4) {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.ALLIUM.defaultBlockState(), 3);
									} else {
										world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.SHORT_GRASS.defaultBlockState(), 3);
									}
								}
							}
							if (Math.random() < 0.66) {
								LichenPlacementProcedure.execute(world, x + sx + 1, y + sy, z + sz);
							}
							if (Math.random() < 0.66) {
								LichenPlacementProcedure.execute(world, x + sx, y + sy, z + sz + 1);
							}
							if (Math.random() < 0.66) {
								LichenPlacementProcedure.execute(world, x + sx, y + sy, (z + sz) - 1);
							}
							if (Math.random() < 0.66) {
								LichenPlacementProcedure.execute(world, (x + sx) - 1, y + sy, z + sz);
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AZALEA_LEAVES) {
							if (Math.random() < 0.4) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.FLOWERING_AZALEA_LEAVES.defaultBlockState(), 3);
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AZALEA) {
							if (Math.random() < 0.4) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.FLOWERING_AZALEA.defaultBlockState(), 3);
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.CUT_SANDSTONE) {
							if (Math.random() < 0.05 && world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).canOcclude()) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SAND.defaultBlockState(), 3);
							} else if (Math.random() < 0.1) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.INFESTED_CUT_SANDSTONE.get().defaultBlockState(), 3);
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PINK_STAINED_GLASS) {
							WirePlacementProcedure.execute(world, x + sx, y + sy, z + sz);
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.CHISELED_SANDSTONE) {
							if (Math.random() < 0.03 && world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).canOcclude()) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SAND.defaultBlockState(), 3);
							} else if (Math.random() < 0.2) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.INFESTED_CHISELED_SANDSTONE.get().defaultBlockState(), 3);
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DROPPER) {
							ObserverPlacementProcedure.execute(world, x + sx, y + sy, z + sz);
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PRISMARINE_STAIRS) {
							{
								BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
								BlockState _bs = Blocks.COMPARATOR.defaultBlockState();
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
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.ORANGE_STAINED_GLASS || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.RED_WOOL) {
							TNTPlacementProcedure.execute(world, x + sx, y + sy, z + sz);
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable")))
								&& !(world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
								&& !(world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
								&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
								&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
								&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
								&& !(world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))) {
							RuinousTransformationProcedure.execute(world, x + sx, y + sy, z + sz);
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:temple_breakable")))
								&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:smashable"))) && Math.random() < 0.08
								&& !(world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
								&& !(world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
								&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
								&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
								&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
								&& !(world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))) {
							if (Math.random() < 0.1) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SAND.defaultBlockState(), 3);
							} else {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
							}
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz)).canOcclude() || world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1)).canOcclude() || world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)).canOcclude()
								|| world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz)).canOcclude()) && world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).canOcclude()
								&& (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR && Math.random() < 0.025) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SAND.defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SAND && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
							if (Math.random() < 0.02) {
								if (Math.random() < 0.5) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.INFESTED_SANDSTONE.get().defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SANDSTONE.defaultBlockState(), 3);
								}
							}
							if (Math.random() < 0.02) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.PYRAMID_SAND.get().defaultBlockState(), 3);
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
