package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class CopperGrateAgeingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.02) {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.COPPER_GRATE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.EXPOSED_COPPER_GRATE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.EXPOSED_COPPER_GRATE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WEATHERED_COPPER_GRATE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.WEATHERED_COPPER_GRATE.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.OXIDIZED_COPPER_GRATE.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.CHISELED_COPPER.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.EXPOSED_CHISELED_COPPER.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.EXPOSED_CHISELED_COPPER.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WEATHERED_CHISELED_COPPER.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.WEATHERED_CHISELED_COPPER.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.OXIDIZED_CHISELED_COPPER.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.COPPER_BULB.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.EXPOSED_COPPER_BULB.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.COPPER_BULB_LIT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.EXPOSED_COPPER_BULB_LIT.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.EXPOSED_COPPER_BULB.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WEATHERED_COPPER_BULB.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.EXPOSED_COPPER_BULB_LIT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.WEATHERED_COPPER_BULB_LIT.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.WEATHERED_COPPER_BULB.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.OXIDIZED_COPPER_BULB.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.WEATHERED_COPPER_BULB_LIT.get()) {
				world.setBlock(BlockPos.containing(x, y, z), SuperiorstructuresModBlocks.OXIDIZED_COPPER_BULB_LIT.get().defaultBlockState(), 3);
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.WEATHERED_COPPER_TRAPDOOR.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SuperiorstructuresModBlocks.OXIDIZED_COPPER_TRAPDOOR.get().defaultBlockState();
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
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.EXPOSED_COPPER_TRAPDOOR.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SuperiorstructuresModBlocks.WEATHERED_COPPER_TRAPDOOR.get().defaultBlockState();
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
			} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == SuperiorstructuresModBlocks.COPPER_TRAPDOOR.get()) {
				{
					BlockPos _bp = BlockPos.containing(x, y, z);
					BlockState _bs = SuperiorstructuresModBlocks.EXPOSED_COPPER_TRAPDOOR.get().defaultBlockState();
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
}
