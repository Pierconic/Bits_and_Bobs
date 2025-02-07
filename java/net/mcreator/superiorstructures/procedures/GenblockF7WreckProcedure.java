package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
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

import java.util.List;
import java.util.Comparator;

public class GenblockF7WreckProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double solids = 0;
		double sy3 = 0;
		double sz3 = 0;
		double sx3 = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			sx = -8;
			for (int index0 = 0; index0 < 16; index0++) {
				sy = -8;
				for (int index1 = 0; index1 < 16; index1++) {
					sz = -8;
					for (int index2 = 0; index2 < 16; index2++) {
						solids = 0;
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR) {
							if (world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz)).canOcclude()) {
								solids = solids + 1;
							}
							if (world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz)).canOcclude()) {
								solids = solids + 1;
							}
							if (world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)).canOcclude()) {
								solids = solids + 1;
							}
							if (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1)).canOcclude()) {
								solids = solids + 1;
							}
							if (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz)).canOcclude()) {
								solids = solids + 1;
							}
							if (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).canOcclude()) {
								solids = solids + 1;
							}
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.POPPY || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.CORNFLOWER
								|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DANDELION) {
							if (Math.random() < 0.8) {
								if (Math.random() < 0.6) {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
								} else {
									world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SHORT_GRASS.defaultBlockState(), 3);
								}
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BEE_NEST) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
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
						} else if (solids >= 2 && Math.random() < 0.1) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.COBWEB.defaultBlockState(), 3);
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.GRASS_BLOCK || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DIRT) {
							if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz)) && Math.random() < 0.007) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.TOWN_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
							} else if (Math.random() < 0.002) {
								world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.TOWN_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
							}
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DIRT_PATH && Math.random() < 0.01) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SPRUCE_LOG && (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.AIR
								&& Math.random() < 0.066 && world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
							world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.MOSS_CARPET.defaultBlockState(), 3);
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable")))) {
							RuinousTransformationProcedure.execute(world, x + sx, y + sy, z + sz);
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (Math.random() < 0.4) {
				if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("plains"))) {
					IvySpreadProcedure.execute(world, x + Mth.nextInt(RandomSource.create(), -8, 8), y - 4, z + Mth.nextInt(RandomSource.create(), -8, 8));
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("taiga"))) {
					LichenageProcedure.execute(world, x + Mth.nextInt(RandomSource.create(), -8, 8), y - 4, z + Mth.nextInt(RandomSource.create(), -8, 8));
				} else if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("savanna"))) {
					BrambleGenProcedure.execute(world, x + Mth.nextInt(RandomSource.create(), -8, 8), y - 4, z + Mth.nextInt(RandomSource.create(), -8, 8));
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof ItemEntity) {
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					}
				}
			}
		}
	}
}
