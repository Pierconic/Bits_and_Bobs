package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.vehicle.MinecartTNT;
import net.minecraft.world.entity.vehicle.MinecartFurnace;
import net.minecraft.world.entity.vehicle.Minecart;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

import java.util.List;
import java.util.Comparator;

public class MineshaftRuinProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof ItemEntity) {
						if (!entityiterator.level().isClientSide())
							entityiterator.discard();
					}
					if (entityiterator instanceof Minecart) {
						if (Math.random() < 0.12) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.TNT_MINECART.spawn(_level, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						} else if (Math.random() < 0.12) {
							if (world instanceof ServerLevel _level) {
								Entity entityToSpawn = EntityType.FURNACE_MINECART.spawn(_level, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), MobSpawnType.MOB_SUMMONED);
								if (entityToSpawn != null) {
									entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
								}
							}
							if (!entityiterator.level().isClientSide())
								entityiterator.discard();
						}
					}
				}
			}
			sx = -10;
			for (int index0 = 0; index0 < 20; index0++) {
				sy = -3;
				for (int index1 = 0; index1 < 11; index1++) {
					sz = -10;
					for (int index2 = 0; index2 < 20; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _getbp17
								&& (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getValue(_getbp17)) {
							{
								BlockPos _pos = BlockPos.containing(x + sx, y + sy, z + sz);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
									world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
							}
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STONE && Math.random() < 0.02
								&& (world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz)) || world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz)) || world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))
										|| world.isEmptyBlock(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)) || world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1))
										|| world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)))) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.MINER_STONE.get().defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:mineshaft_breakable"))) && Math.random() < 0.15) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.RAIL && !(!world.getEntitiesOfClass(MinecartTNT.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty())
								&& !(!world.getEntitiesOfClass(MinecartFurnace.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty())
								&& !(!world.getEntitiesOfClass(Minecart.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).isEmpty()) && Math.random() < 0.02) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
							world.setBlock(BlockPos.containing(x + sx, (y + sy) - 1, z + sz), Blocks.AIR.defaultBlockState(), 3);
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR && Math.random() < 0.3
								&& world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).isFaceSturdy(world, BlockPos.containing(x + sx, (y + sy) - 1, z + sz), Direction.UP)
								&& world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lush_caves"))) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.MOSS_CARPET.defaultBlockState(), 3);
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz)).canOcclude() || world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz)).canOcclude()
								|| world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1)).canOcclude() || world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)).canOcclude()
								|| world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz)).canOcclude()) && Math.random() < 0.03 && !world.canSeeSkyFromBelowWater(BlockPos.containing(x + sx, y + sy + 1, z + sz))
								&& (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR) {
							world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.COBWEB.defaultBlockState(), 3);
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable")))) {
							RuinousTransformationProcedure.execute(world, x + sx, y + sy, z + sz);
						} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:pottery")))) {
							if (Math.random() < 0.3) {
								if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
									ItemStack _setstack = new ItemStack(Items.IRON_NUGGET).copy();
									_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 7));
									_itemHandlerModifiable.setStackInSlot(0, _setstack);
								}
							} else if (Math.random() < 0.3) {
								if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
									ItemStack _setstack = new ItemStack(Items.RAW_COPPER).copy();
									_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 4));
									_itemHandlerModifiable.setStackInSlot(0, _setstack);
								}
							} else if (Math.random() < 0.3) {
								if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
									ItemStack _setstack = new ItemStack(Items.GOLD_NUGGET).copy();
									_setstack.setCount(Mth.nextInt(RandomSource.create(), 3, 7));
									_itemHandlerModifiable.setStackInSlot(0, _setstack);
								}
							} else if (Math.random() < 0.3) {
								if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
									ItemStack _setstack = new ItemStack(Items.RAW_IRON).copy();
									_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 4));
									_itemHandlerModifiable.setStackInSlot(0, _setstack);
								}
							} else if (Math.random() < 0.3) {
								if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
									ItemStack _setstack = new ItemStack(Items.RAW_GOLD).copy();
									_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 4));
									_itemHandlerModifiable.setStackInSlot(0, _setstack);
								}
							}
						}
						sz = sz + 1;
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			if (world.getBiome(BlockPos.containing(x, y, z)).is(ResourceLocation.parse("lush_caves"))) {
				LichenageProcedure.execute(world, x + sx, y + sy, z + sz);
			}
		}
	}
}
