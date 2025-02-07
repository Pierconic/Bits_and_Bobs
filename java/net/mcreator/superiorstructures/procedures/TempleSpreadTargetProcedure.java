package net.mcreator.superiorstructures.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.common.extensions.ILevelExtension;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.BoneMealItem;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class TempleSpreadTargetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, boolean aerate_input, boolean bonemeal_input, boolean chisel_input, boolean filler_input, boolean inverted_input, boolean lichen_input, boolean snowy_input,
			boolean vines_input, double alternative_input, double archeology_input, double carry_input, double damage_input, double intensity_input, String type_input) {
		if (type_input == null)
			return;
		BlockState damage_block = Blocks.AIR.defaultBlockState();
		String function_body = "";
		String type = "";
		boolean aerate = false;
		boolean filler = false;
		boolean vines = false;
		boolean lichen = false;
		boolean snowy = false;
		boolean chisels = false;
		boolean bonemeal = false;
		boolean inverted = false;
		boolean update = false;
		double mx = 0;
		double my = 0;
		double mz = 0;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		double intensity = 0;
		double damage_chance = 0;
		double archeology_chance = 0;
		double carry_chance = 0;
		double solids = 0;
		double alternative = 0;
		double dx = 0;
		double dz = 0;
		double number = 0;
		sx = 0;
		sy = 0;
		sz = 0;
		intensity = intensity_input;
		damage_chance = damage_input;
		archeology_chance = archeology_input;
		carry_chance = carry_input;
		alternative = alternative_input;
		aerate = aerate_input;
		filler = filler_input;
		vines = vines_input;
		lichen = lichen_input;
		snowy = snowy_input;
		chisels = chisel_input;
		bonemeal = bonemeal_input;
		inverted = inverted_input;
		update = true;
		type = type_input;
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:flavor_vanishable")))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:flavor_updateable")))) {
			FlavorUpdateProcedure.execute(world, x + sx, y + sy, z + sz);
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() instanceof SimpleWaterloggedBlock) {
			{
				BlockPos _pos = BlockPos.containing(x + sx, y + sy, z + sz);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
					world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
			}
		}
		if (((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER)
				&& !world.canSeeSkyFromBelowWater(BlockPos.containing(x + sx, y + sy, z + sz))) {
			world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SCAFFOLDING) {
			if (world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).canOcclude() && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
				if (Math.random() < 0.6) {
					world.setBlock(BlockPos.containing(x + sx, y + sy + 0, z + sz), Blocks.AIR.defaultBlockState(), 3);
				} else {
					world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.SCAFFOLDING.defaultBlockState(), 3);
				}
			} else if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
				if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.SCAFFOLDING.defaultBlockState(), 3);
				}
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DECORATED_POT) {
			SmokingPotsProcedure.execute(world, x + sx, y + sy, z + sz);
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.COBBLESTONE) {
			if (Math.random() < 0.05 && !((world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz))).getBlock() == Blocks.SLIME_BLOCK)
					&& !((world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz))).getBlock() == Blocks.SLIME_BLOCK) && !((world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1))).getBlock() == Blocks.SLIME_BLOCK)
					&& !((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1))).getBlock() == Blocks.SLIME_BLOCK) && !((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SLIME_BLOCK)
					&& !((world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.SLIME_BLOCK) && !((world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz))).getBlock() == Blocks.HONEY_BLOCK)
					&& !((world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz))).getBlock() == Blocks.HONEY_BLOCK) && !((world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1))).getBlock() == Blocks.HONEY_BLOCK)
					&& !((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1))).getBlock() == Blocks.HONEY_BLOCK) && !((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.HONEY_BLOCK)
					&& !((world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.HONEY_BLOCK)) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.MOSS_BLOCK.defaultBlockState(), 3);
				LichenPlacementProcedure.execute(world, x + sx, y + sy + 1, z + sz);
				LichenPlacementProcedure.execute(world, x + sx, (y + sy) - 1, z + sz);
				LichenPlacementProcedure.execute(world, (x + sx) - 1, y + sy, z + sz);
				LichenPlacementProcedure.execute(world, x + sx + 1, y + sy, z + sz);
				LichenPlacementProcedure.execute(world, x + sx, y + sy, z + sz + 1);
				LichenPlacementProcedure.execute(world, x + sx, y + sy, (z + sz) - 1);
			} else if (Math.random() < 0.02) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.INFESTED_COBBLESTONE.defaultBlockState(), 3);
			} else if (Math.random() < 0.25) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.MOSSY_COBBLESTONE.defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.STONE_BRICKS) {
			if (Math.random() < 0.05 && !((world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz))).getBlock() == Blocks.SLIME_BLOCK)
					&& !((world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz))).getBlock() == Blocks.SLIME_BLOCK) && !((world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1))).getBlock() == Blocks.SLIME_BLOCK)
					&& !((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1))).getBlock() == Blocks.SLIME_BLOCK) && !((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.SLIME_BLOCK)
					&& !((world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.SLIME_BLOCK) && !((world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz))).getBlock() == Blocks.HONEY_BLOCK)
					&& !((world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz))).getBlock() == Blocks.HONEY_BLOCK) && !((world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1))).getBlock() == Blocks.HONEY_BLOCK)
					&& !((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1))).getBlock() == Blocks.HONEY_BLOCK) && !((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.HONEY_BLOCK)
					&& !((world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.HONEY_BLOCK)) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.MOSS_BLOCK.defaultBlockState(), 3);
				LichenPlacementProcedure.execute(world, x + sx, y + sy + 1, z + sz);
				LichenPlacementProcedure.execute(world, x + sx, (y + sy) - 1, z + sz);
				LichenPlacementProcedure.execute(world, (x + sx) - 1, y + sy, z + sz);
				LichenPlacementProcedure.execute(world, x + sx + 1, y + sy, z + sz);
				LichenPlacementProcedure.execute(world, x + sx, y + sy, z + sz + 1);
				LichenPlacementProcedure.execute(world, x + sx, y + sy, (z + sz) - 1);
			} else if (Math.random() < 0.02) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.INFESTED_STONE_BRICKS.defaultBlockState(), 3);
			} else if (Math.random() < 0.25) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.MOSSY_STONE_BRICKS.defaultBlockState(), 3);
			}
		} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PINK_STAINED_GLASS) {
			WirePlacementProcedure.execute(world, x + sx, y + sy, z + sz);
		} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.SMALL_LIME_POT.get()) {
			if (Math.random() < 0.6) {
				{
					BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
					BlockState _bs = SuperiorstructuresModBlocks.SMALL_POT.get().defaultBlockState();
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
				if (Math.random() < 0.7) {
					if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
						ItemStack _setstack = new ItemStack(Items.REDSTONE).copy();
						_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 5));
						_itemHandlerModifiable.setStackInSlot(0, _setstack);
					}
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.TALL_LIME_POT.get()) {
			if (Math.random() < 0.6) {
				{
					BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
					BlockState _bs = SuperiorstructuresModBlocks.TALL_POT.get().defaultBlockState();
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
			if (Math.random() < 0.6) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.REDSTONE).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 5));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.BLACK_STAINED_GLASS) {
			{
				BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
				BlockState _bs = Blocks.TARGET.defaultBlockState();
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
		} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.LARGE_LIME_POT.get()) {
			if (Math.random() < 0.6) {
				{
					BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
					BlockState _bs = SuperiorstructuresModBlocks.LARGE_POT.get().defaultBlockState();
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
			if (Math.random() < 0.6) {
				if (world instanceof ILevelExtension _ext && _ext.getCapability(Capabilities.ItemHandler.BLOCK, BlockPos.containing(x + sx, y + sy, z + sz), null) instanceof IItemHandlerModifiable _itemHandlerModifiable) {
					ItemStack _setstack = new ItemStack(Items.REDSTONE).copy();
					_setstack.setCount(Mth.nextInt(RandomSource.create(), 1, 5));
					_itemHandlerModifiable.setStackInSlot(0, _setstack);
				}
			}
		} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.DROPPER) {
			if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.EMERALD_BLOCK) {
				world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.STONE_BRICKS.defaultBlockState(), 3);
			} else {
				ObserverPlacementProcedure.execute(world, x + sx, y + sy, z + sz);
			}
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
		} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SOUL_TORCH) {
			{
				BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
				BlockState _bs = (Blocks.REDSTONE_TORCH.getStateDefinition().getProperty("lit") instanceof BooleanProperty _withbp116
						? Blocks.REDSTONE_TORCH.defaultBlockState().setValue(_withbp116, false)
						: Blocks.REDSTONE_TORCH.defaultBlockState());
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
		} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.SOUL_WALL_TORCH) {
			{
				BlockPos _bp = BlockPos.containing(x + sx, y + sy, z + sz);
				BlockState _bs = (Blocks.REDSTONE_WALL_TORCH.getStateDefinition().getProperty("lit") instanceof BooleanProperty _withbp120
						? Blocks.REDSTONE_WALL_TORCH.defaultBlockState().setValue(_withbp120, false)
						: Blocks.REDSTONE_WALL_TORCH.defaultBlockState());
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
		} else if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() instanceof SimpleWaterloggedBlock) {
			{
				BlockPos _pos = BlockPos.containing(x + sx, y + sy, z + sz);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("waterlogged") instanceof BooleanProperty _booleanProp)
					world.setBlock(_pos, _bs.setValue(_booleanProp, false), 3);
			}
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable")))
				&& !((world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).getBlock() == Blocks.REDSTONE_WALL_TORCH)) {
			if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz)) && Math.random() < 0.1
					&& world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).isFaceSturdy(world, BlockPos.containing(x + sx, y + sy, z + sz), Direction.UP)) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				if (Math.random() < 0.4 && world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz)).isFaceSturdy(world, BlockPos.containing(x + sx + 1, y + sy, z + sz), Direction.UP)) {
					world.setBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				}
				if (Math.random() < 0.4 && world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz)).isFaceSturdy(world, BlockPos.containing((x + sx) - 1, y + sy, z + sz), Direction.UP)) {
					world.setBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				}
				if (Math.random() < 0.4 && world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz + 1)).isFaceSturdy(world, BlockPos.containing((x + sx) - 1, y + sy, z + sz + 1), Direction.UP)) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				}
				if (Math.random() < 0.4 && world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, (z + sz) - 1)).isFaceSturdy(world, BlockPos.containing((x + sx) - 1, y + sy, (z + sz) - 1), Direction.UP)) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1), Blocks.COARSE_DIRT.defaultBlockState(), 3);
				}
			}
			RuinousTransformationProcedure.execute(world, x + sx, y + sy, z + sz);
			RuinousTransformationProcedure.execute(world, x + sx, y + sy, z + sz);
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:temple_breakable"))) && Math.random() < 0.05
				&& !(world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
				&& !(world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
				&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
				&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
				&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
				&& !(world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))) {
			world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz)).canOcclude() || world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz)).canOcclude()
				|| world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1)).canOcclude() || world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)).canOcclude()
				|| world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz)).canOcclude()) && !(world.getBlockState(BlockPos.containing(x + sx + 1, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
				&& !(world.getBlockState(BlockPos.containing((x + sx) - 1, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
				&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy, (z + sz) - 1))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
				&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz + 1))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
				&& !(world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable")))
				&& !(world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:break_preventable"))) && Math.random() < 0.025
				&& !world.canSeeSkyFromBelowWater(BlockPos.containing(x + sx, y + sy + 1, z + sz)) && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.AIR) {
			world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.COBWEB.defaultBlockState(), 3);
		}
		if (((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.COARSE_DIRT || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PODZOL
				|| (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PACKED_MUD) && world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz))) {
			if (Math.random() < 0.085) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.DIRT.defaultBlockState(), 3);
			}
			if (Math.random() < 0.04) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), SuperiorstructuresModBlocks.LUSH_SUSPICIOUS_DIRT.get().defaultBlockState(), 3);
			}
			if (Math.random() < 0.27) {
				world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.BAMBOO_SAPLING.defaultBlockState(), 3);
				for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 1, 4); index0++) {
					if (world instanceof Level _level) {
						BlockPos _bp = BlockPos.containing(x + sx, y + sy + 1, z + sz);
						if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
							if (!_level.isClientSide())
								_level.levelEvent(2005, _bp, 0);
						}
					}
				}
			} else {
				if (Math.random() < 0.76 && (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz)) || (world.getBlockState(BlockPos.containing(x + sx, y + sy + 1, z + sz))).getBlock() == Blocks.MOSS_CARPET)
						&& world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 2, z + sz))) {
					number = Mth.nextInt(RandomSource.create(), 0, 10);
					if (number == 0) {
						world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.AZURE_BLUET.defaultBlockState(), 3);
					} else if (number == 1) {
						world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.DANDELION.defaultBlockState(), 3);
					} else if (number == 2) {
						world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.POPPY.defaultBlockState(), 3);
					} else if (number == 3 || number == 4) {
						world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.FERN.defaultBlockState(), 3);
						if (Math.random() < 0.4) {
							if (world instanceof Level _level) {
								BlockPos _bp = BlockPos.containing(x + sx, y + sy + 1, z + sz);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
						}
					} else if (number == 5) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PODZOL) {
							world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.BROWN_MUSHROOM.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.FERN.defaultBlockState(), 3);
						}
					} else if (number == 6 || number == 7) {
						world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.SHORT_GRASS.defaultBlockState(), 3);
						if (Math.random() < 0.3) {
							if (world instanceof Level _level) {
								BlockPos _bp = BlockPos.containing(x + sx, y + sy + 1, z + sz);
								if (BoneMealItem.growCrop(new ItemStack(Items.BONE_MEAL), _level, _bp) || BoneMealItem.growWaterPlant(new ItemStack(Items.BONE_MEAL), _level, _bp, null)) {
									if (!_level.isClientSide())
										_level.levelEvent(2005, _bp, 0);
								}
							}
						}
					} else {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.PODZOL) {
							world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.RED_MUSHROOM.defaultBlockState(), 3);
						} else {
							world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.FERN.defaultBlockState(), 3);
						}
					}
				}
			}
		}
		if (world.isEmptyBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz)) && number >= 1 && number <= 3 && world.getBlockState(BlockPos.containing(x, y, z)).isFaceSturdy(world, BlockPos.containing(x, y, z), Direction.EAST)) {
			if (Math.random() < 0.2) {
				world.setBlock(BlockPos.containing(x + sx + 1, y + sy, z + sz), (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(SuperiorstructuresModBlocks.LICHEN.get().defaultBlockState(), Direction.EAST)), 3);
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx + 1), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ vine[west=true]");
			}
		} else if (world.isEmptyBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz)) && number >= 4 && number <= 6 && world.getBlockState(BlockPos.containing(x, y, z)).isFaceSturdy(world, BlockPos.containing(x, y, z), Direction.WEST)) {
			if (Math.random() < 0.1) {
				world.setBlock(BlockPos.containing((x + sx) - 1, y + sy, z + sz), (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(SuperiorstructuresModBlocks.LICHEN.get().defaultBlockState(), Direction.WEST)), 3);
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3(((x + sx) - 1), (y + sy), (z + sz)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ vine[east=true]");
			}
		} else if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1)) && number >= 7 && number <= 8 && world.getBlockState(BlockPos.containing(x, y, z)).isFaceSturdy(world, BlockPos.containing(x, y, z), Direction.NORTH)) {
			if (Math.random() < 0.2) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, (z + sz) - 1), (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(SuperiorstructuresModBlocks.LICHEN.get().defaultBlockState(), Direction.NORTH)), 3);
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), ((z + sz) - 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"setblock ~ ~ ~ vine[south=true]");
			}
		} else if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1)) && number >= 9 && number <= 10 && world.getBlockState(BlockPos.containing(x, y, z)).isFaceSturdy(world, BlockPos.containing(x, y, z), Direction.SOUTH)) {
			if (Math.random() < 0.2) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz + 1), (new Object() {
					public BlockState with(BlockState _bs, Direction newValue) {
						Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
						if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
							return _bs.setValue(_dp, newValue);
						_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
						return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
					}
				}.with(SuperiorstructuresModBlocks.LICHEN.get().defaultBlockState(), Direction.SOUTH)), 3);
			} else {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, new Vec3((x + sx), (y + sy), (z + sz + 1)), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "setblock ~ ~ ~ vine[north=true]");
			}
		}
		if (world.isEmptyBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz)) && (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable")))
				&& world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).isFaceSturdy(world, BlockPos.containing(x + sx, y + sy, z + sz), Direction.UP)) {
			if (Math.random() < 0.24) {
				world.setBlock(BlockPos.containing(x + sx, y + sy + 1, z + sz), Blocks.MOSS_CARPET.defaultBlockState(), 3);
				if (Math.random() < 0.15) {
					world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.MOSS_BLOCK.defaultBlockState(), 3);
				}
			}
		}
	}
}
