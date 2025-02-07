package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class PyramidSpreadTargetProcedure {
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
		if (((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER || (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.WATER)
				&& !world.canSeeSkyFromBelowWater(BlockPos.containing(x + sx, y + sy, z + sz))) {
			world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.AIR.defaultBlockState(), 3);
		}
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() instanceof SimpleWaterloggedBlock && !world.canSeeSkyFromBelowWater(BlockPos.containing(x + sx, y + sy, z + sz))) {
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
			if (Math.random() < 0.04 && world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).canOcclude()) {
				world.setBlock(BlockPos.containing(x + sx, y + sy, z + sz), Blocks.SAND.defaultBlockState(), 3);
			} else if (Math.random() < 0.06 && world.getBlockState(BlockPos.containing(x + sx, (y + sy) - 1, z + sz)).canOcclude()) {
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
			} else if (Math.random() < 0.06) {
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
		if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable"))) && Math.random() < 0.15
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
}
