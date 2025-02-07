package net.mcreator.superiorstructures.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.superiorstructures.init.SuperiorstructuresModGameRules;
import net.mcreator.superiorstructures.init.SuperiorstructuresModBlocks;

public class GenblockA2UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (world.getLevelData().getGameRules().getBoolean(SuperiorstructuresModGameRules.TICK_GENBLOCKS) == true) {
			sx = -6;
			for (int index0 = 0; index0 < 12; index0++) {
				sy = -6;
				for (int index1 = 0; index1 < 12; index1++) {
					sz = -6;
					for (int index2 = 0; index2 < 12; index2++) {
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).is(BlockTags.create(ResourceLocation.parse("forge:ruinable")))) {
							RuinousTransformationProcedure.execute(world, x + sx, y + sy, z + sz);
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.SMALL_WHITE_POT.get()) {
							if (Math.random() < 0.3) {
								{
									BlockPos _bp = BlockPos.containing(x, y, z);
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
							}
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.TALL_WHITE_POT.get()) {
							if (Math.random() < 0.3) {
								{
									BlockPos _bp = BlockPos.containing(x, y, z);
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
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == SuperiorstructuresModBlocks.LARGE_WHITE_POT.get()) {
							if (Math.random() < 0.3) {
								{
									BlockPos _bp = BlockPos.containing(x, y, z);
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
						}
						if ((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz))).getBlock() == Blocks.LIGHT_GRAY_CANDLE) {
							{
								int _value = Mth.nextInt(RandomSource.create(), 2, 4);
								BlockPos _pos = BlockPos.containing(x, y, z);
								BlockState _bs = world.getBlockState(_pos);
								if (_bs.getBlock().getStateDefinition().getProperty("candles") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
									world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
							}
						}
					}
					sy = sy + 1;
				}
				sx = sx + 1;
			}
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
